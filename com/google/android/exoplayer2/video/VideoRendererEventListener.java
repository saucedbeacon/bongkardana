package com.google.android.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.util.Assertions;
import o.getEnterTransitionCallback;
import o.getExitTransitionCallback;
import o.getSharedElementSourceNames;
import o.getSharedElementTargetNames;
import o.setAnimatingAway;
import o.setAnimator;
import o.setSharedElementNames;

public interface VideoRendererEventListener {
    void onDroppedFrames(int i, long j);

    void onRenderedFirstFrame(@Nullable Surface surface);

    void onVideoDecoderInitialized(String str, long j, long j2);

    void onVideoDisabled(DecoderCounters decoderCounters);

    void onVideoEnabled(DecoderCounters decoderCounters);

    void onVideoInputFormatChanged(Format format);

    void onVideoSizeChanged(int i, int i2, int i3, float f);

    public static final class EventDispatcher {
        @Nullable
        private final Handler handler;
        @Nullable
        private final VideoRendererEventListener listener;

        public EventDispatcher(@Nullable Handler handler2, @Nullable VideoRendererEventListener videoRendererEventListener) {
            this.handler = videoRendererEventListener != null ? (Handler) Assertions.checkNotNull(handler2) : null;
            this.listener = videoRendererEventListener;
        }

        public final void enabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new setSharedElementNames(this, decoderCounters));
            }
        }

        public final /* synthetic */ void lambda$enabled$0(DecoderCounters decoderCounters) {
            this.listener.onVideoEnabled(decoderCounters);
        }

        public final void decoderInitialized(String str, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new getExitTransitionCallback(this, str, j, j2));
            }
        }

        public final /* synthetic */ void lambda$decoderInitialized$1(String str, long j, long j2) {
            this.listener.onVideoDecoderInitialized(str, j, j2);
        }

        public final void inputFormatChanged(Format format) {
            if (this.listener != null) {
                this.handler.post(new getEnterTransitionCallback(this, format));
            }
        }

        public final /* synthetic */ void lambda$inputFormatChanged$2(Format format) {
            this.listener.onVideoInputFormatChanged(format);
        }

        public final void droppedFrames(int i, long j) {
            if (this.listener != null) {
                this.handler.post(new getSharedElementTargetNames(this, i, j));
            }
        }

        public final /* synthetic */ void lambda$droppedFrames$3(int i, long j) {
            this.listener.onDroppedFrames(i, j);
        }

        public final void videoSizeChanged(int i, int i2, int i3, float f) {
            if (this.listener != null) {
                this.handler.post(new getSharedElementSourceNames(this, i, i2, i3, f));
            }
        }

        public final /* synthetic */ void lambda$videoSizeChanged$4(int i, int i2, int i3, float f) {
            this.listener.onVideoSizeChanged(i, i2, i3, f);
        }

        public final void renderedFirstFrame(@Nullable Surface surface) {
            if (this.listener != null) {
                this.handler.post(new setAnimatingAway(this, surface));
            }
        }

        public final /* synthetic */ void lambda$renderedFirstFrame$5(@Nullable Surface surface) {
            this.listener.onRenderedFirstFrame(surface);
        }

        public final void disabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new setAnimator(this, decoderCounters));
            }
        }

        public final /* synthetic */ void lambda$disabled$6(DecoderCounters decoderCounters) {
            decoderCounters.ensureUpdated();
            this.listener.onVideoDisabled(decoderCounters);
        }
    }
}
