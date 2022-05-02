package com.google.android.exoplayer2.upstream;

import android.os.Handler;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.trackselection.AdaptiveTrackSelection;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.EventDispatcher;
import com.google.android.exoplayer2.util.SlidingPercentile;
import o.getExitAnim;

public final class DefaultBandwidthMeter implements BandwidthMeter, TransferListener {
    private static final int BYTES_TRANSFERRED_FOR_ESTIMATE = 524288;
    public static final long DEFAULT_INITIAL_BITRATE_ESTIMATE = 1000000;
    public static final int DEFAULT_SLIDING_WINDOW_MAX_WEIGHT = 2000;
    private static final int ELAPSED_MILLIS_FOR_ESTIMATE = 2000;
    private long bitrateEstimate;
    private final Clock clock;
    private final EventDispatcher<BandwidthMeter.EventListener> eventDispatcher;
    private long sampleBytesTransferred;
    private long sampleStartTimeMs;
    private final SlidingPercentile slidingPercentile;
    private int streamCount;
    private long totalBytesTransferred;
    private long totalElapsedTimeMs;

    @Nullable
    public final TransferListener getTransferListener() {
        return this;
    }

    public final void onTransferInitializing(DataSource dataSource, DataSpec dataSpec, boolean z) {
    }

    public static final class Builder {
        private Clock clock = Clock.DEFAULT;
        @Nullable
        private Handler eventHandler;
        @Nullable
        private BandwidthMeter.EventListener eventListener;
        private long initialBitrateEstimate = 1000000;
        private int slidingWindowMaxWeight = 2000;

        public final Builder setEventListener(Handler handler, BandwidthMeter.EventListener eventListener2) {
            Assertions.checkArgument((handler == null || eventListener2 == null) ? false : true);
            this.eventHandler = handler;
            this.eventListener = eventListener2;
            return this;
        }

        public final Builder setSlidingWindowMaxWeight(int i) {
            this.slidingWindowMaxWeight = i;
            return this;
        }

        public final Builder setInitialBitrateEstimate(long j) {
            this.initialBitrateEstimate = j;
            return this;
        }

        public final Builder setClock(Clock clock2) {
            this.clock = clock2;
            return this;
        }

        public final DefaultBandwidthMeter build() {
            BandwidthMeter.EventListener eventListener2;
            DefaultBandwidthMeter defaultBandwidthMeter = new DefaultBandwidthMeter(this.initialBitrateEstimate, this.slidingWindowMaxWeight, this.clock);
            Handler handler = this.eventHandler;
            if (!(handler == null || (eventListener2 = this.eventListener) == null)) {
                defaultBandwidthMeter.addEventListener(handler, eventListener2);
            }
            return defaultBandwidthMeter;
        }
    }

    public DefaultBandwidthMeter() {
        this(1000000, 2000, Clock.DEFAULT);
    }

    @Deprecated
    public DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventListener) {
        this(1000000, 2000, Clock.DEFAULT);
        if (handler != null && eventListener != null) {
            addEventListener(handler, eventListener);
        }
    }

    @Deprecated
    public DefaultBandwidthMeter(Handler handler, BandwidthMeter.EventListener eventListener, int i) {
        this(1000000, i, Clock.DEFAULT);
        if (handler != null && eventListener != null) {
            addEventListener(handler, eventListener);
        }
    }

    private DefaultBandwidthMeter(long j, int i, Clock clock2) {
        this.eventDispatcher = new EventDispatcher<>();
        this.slidingPercentile = new SlidingPercentile(i);
        this.clock = clock2;
        this.bitrateEstimate = j;
    }

    public final synchronized long getBitrateEstimate() {
        return this.bitrateEstimate;
    }

    public final void addEventListener(Handler handler, BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.addListener(handler, eventListener);
    }

    public final void removeEventListener(BandwidthMeter.EventListener eventListener) {
        this.eventDispatcher.removeListener(eventListener);
    }

    public final synchronized void onTransferStart(DataSource dataSource, DataSpec dataSpec, boolean z) {
        if (z) {
            if (this.streamCount == 0) {
                this.sampleStartTimeMs = this.clock.elapsedRealtime();
            }
            this.streamCount++;
        }
    }

    public final synchronized void onBytesTransferred(DataSource dataSource, DataSpec dataSpec, boolean z, int i) {
        if (z) {
            this.sampleBytesTransferred += (long) i;
        }
    }

    public final synchronized void onTransferEnd(DataSource dataSource, DataSpec dataSpec, boolean z) {
        if (z) {
            Assertions.checkState(this.streamCount > 0);
            long elapsedRealtime = this.clock.elapsedRealtime();
            int i = (int) (elapsedRealtime - this.sampleStartTimeMs);
            long j = (long) i;
            this.totalElapsedTimeMs += j;
            this.totalBytesTransferred += this.sampleBytesTransferred;
            if (i > 0) {
                this.slidingPercentile.addSample((int) Math.sqrt((double) this.sampleBytesTransferred), (float) ((this.sampleBytesTransferred * 8000) / j));
                if (this.totalElapsedTimeMs >= AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS || this.totalBytesTransferred >= 524288) {
                    this.bitrateEstimate = (long) this.slidingPercentile.getPercentile(0.5f);
                }
            }
            notifyBandwidthSample(i, this.sampleBytesTransferred, this.bitrateEstimate);
            int i2 = this.streamCount - 1;
            this.streamCount = i2;
            if (i2 > 0) {
                this.sampleStartTimeMs = elapsedRealtime;
            }
            this.sampleBytesTransferred = 0;
        }
    }

    private void notifyBandwidthSample(int i, long j, long j2) {
        this.eventDispatcher.dispatch(new getExitAnim(i, j, j2));
    }
}
