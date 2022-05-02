package com.google.firebase.perf.transport;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.firebase.perf.config.ConfigResolver;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.metrics.resource.ResourceType;
import com.google.firebase.perf.util.Clock;
import com.google.firebase.perf.util.Constants;
import com.google.firebase.perf.util.Rate;
import com.google.firebase.perf.util.Timer;
import com.google.firebase.perf.util.Utils;
import com.google.firebase.perf.v1.PerfMetric;
import com.google.firebase.perf.v1.PerfSession;
import com.google.firebase.perf.v1.SessionVerbosity;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

final class RateLimiter {
    private final ConfigResolver configResolver;
    private boolean isLogcatEnabled;
    private RateLimiterImpl networkLimiter;
    private final float samplingBucketId;
    private RateLimiterImpl traceLimiter;

    public RateLimiter(@NonNull Context context, Rate rate, long j) {
        this(rate, j, new Clock(), getSamplingBucketId(), ConfigResolver.getInstance());
        this.isLogcatEnabled = Utils.isDebugLoggingEnabled(context);
    }

    @VisibleForTesting
    static float getSamplingBucketId() {
        return new Random().nextFloat();
    }

    RateLimiter(Rate rate, long j, Clock clock, float f, ConfigResolver configResolver2) {
        float f2 = f;
        this.traceLimiter = null;
        this.networkLimiter = null;
        boolean z = false;
        this.isLogcatEnabled = false;
        if (0.0f <= f2 && f2 < 1.0f) {
            z = true;
        }
        Utils.checkArgument(z, "Sampling bucket ID should be in range [0.0f, 1.0f).");
        this.samplingBucketId = f2;
        this.configResolver = configResolver2;
        Rate rate2 = rate;
        long j2 = j;
        Clock clock2 = clock;
        ConfigResolver configResolver3 = configResolver2;
        this.traceLimiter = new RateLimiterImpl(rate2, j2, clock2, configResolver3, ResourceType.TRACE, this.isLogcatEnabled);
        this.networkLimiter = new RateLimiterImpl(rate2, j2, clock2, configResolver3, ResourceType.NETWORK, this.isLogcatEnabled);
    }

    private boolean isDeviceAllowedToSendTraces() {
        return this.samplingBucketId < this.configResolver.getTraceSamplingRate();
    }

    private boolean isDeviceAllowedToSendNetworkEvents() {
        return this.samplingBucketId < this.configResolver.getNetworkRequestSamplingRate();
    }

    /* access modifiers changed from: package-private */
    public final boolean check(PerfMetric perfMetric) {
        if (perfMetric.hasTraceMetric() && !isDeviceAllowedToSendTraces() && !hasVerboseSessions(perfMetric.getTraceMetric().getPerfSessionsList())) {
            return false;
        }
        if (perfMetric.hasNetworkRequestMetric() && !isDeviceAllowedToSendNetworkEvents() && !hasVerboseSessions(perfMetric.getNetworkRequestMetric().getPerfSessionsList())) {
            return false;
        }
        if (!isRateLimited(perfMetric)) {
            return true;
        }
        if (perfMetric.hasNetworkRequestMetric()) {
            return this.networkLimiter.check(perfMetric);
        }
        if (perfMetric.hasTraceMetric()) {
            return this.traceLimiter.check(perfMetric);
        }
        return false;
    }

    private boolean hasVerboseSessions(List<PerfSession> list) {
        if (list.size() <= 0 || list.get(0).getSessionVerbosityCount() <= 0 || list.get(0).getSessionVerbosity(0) != SessionVerbosity.GAUGES_AND_SYSTEM_EVENTS) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean isRateLimited(@NonNull PerfMetric perfMetric) {
        if ((!perfMetric.hasTraceMetric() || ((!perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.FOREGROUND_TRACE_NAME.toString()) && !perfMetric.getTraceMetric().getName().equals(Constants.TraceNames.BACKGROUND_TRACE_NAME.toString())) || perfMetric.getTraceMetric().getCountersCount() <= 0)) && !perfMetric.hasGaugeMetric()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void changeRate(boolean z) {
        this.traceLimiter.changeRate(z);
        this.networkLimiter.changeRate(z);
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final boolean getIsDeviceAllowedToSendTraces() {
        return isDeviceAllowedToSendTraces();
    }

    /* access modifiers changed from: package-private */
    @VisibleForTesting
    public final boolean getIsDeviceAllowedToSendNetworkEvents() {
        return isDeviceAllowedToSendNetworkEvents();
    }

    static class RateLimiterImpl {
        private static final long MICROS_IN_A_SECOND = TimeUnit.SECONDS.toMicros(1);
        private static final AndroidLogger logger = AndroidLogger.getInstance();
        private long backgroundCapacity;
        private Rate backgroundRate;
        private long capacity;
        private final Clock clock;
        private long foregroundCapacity;
        private Rate foregroundRate;
        private final boolean isLogcatEnabled;
        private Timer lastTimeTokenReplenished;
        private Rate rate;
        private long tokenCount;

        RateLimiterImpl(Rate rate2, long j, Clock clock2, ConfigResolver configResolver, @ResourceType String str, boolean z) {
            this.clock = clock2;
            this.capacity = j;
            this.rate = rate2;
            this.tokenCount = j;
            this.lastTimeTokenReplenished = clock2.getTime();
            setRateByReadingRemoteConfigValues(configResolver, str, z);
            this.isLogcatEnabled = z;
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean check(@NonNull PerfMetric perfMetric) {
            double durationMicros = (double) this.lastTimeTokenReplenished.getDurationMicros(this.clock.getTime());
            double tokensPerSeconds = this.rate.getTokensPerSeconds();
            Double.isNaN(durationMicros);
            double d = durationMicros * tokensPerSeconds;
            double d2 = (double) MICROS_IN_A_SECOND;
            Double.isNaN(d2);
            long max = Math.max(0, (long) (d / d2));
            this.tokenCount = Math.min(this.tokenCount + max, this.capacity);
            if (max > 0) {
                long micros = this.lastTimeTokenReplenished.getMicros();
                double d3 = (double) (max * MICROS_IN_A_SECOND);
                double tokensPerSeconds2 = this.rate.getTokensPerSeconds();
                Double.isNaN(d3);
                this.lastTimeTokenReplenished = new Timer(micros + ((long) (d3 / tokensPerSeconds2)));
            }
            if (this.tokenCount > 0) {
                this.tokenCount--;
                return true;
            }
            if (this.isLogcatEnabled) {
                logger.warn("Exceeded log rate limit, dropping the log.");
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public synchronized void changeRate(boolean z) {
            this.rate = z ? this.foregroundRate : this.backgroundRate;
            this.capacity = z ? this.foregroundCapacity : this.backgroundCapacity;
        }

        private void setRateByReadingRemoteConfigValues(ConfigResolver configResolver, @ResourceType String str, boolean z) {
            long flimitSec = getFlimitSec(configResolver, str);
            long flimitEvents = getFlimitEvents(configResolver, str);
            Rate rate2 = new Rate(flimitEvents, flimitSec, TimeUnit.SECONDS);
            this.foregroundRate = rate2;
            this.foregroundCapacity = flimitEvents;
            if (z) {
                logger.debug("Foreground %s logging rate:%f, burst capacity:%d", str, rate2, Long.valueOf(flimitEvents));
            }
            long blimitSec = getBlimitSec(configResolver, str);
            long blimitEvents = getBlimitEvents(configResolver, str);
            Rate rate3 = new Rate(blimitEvents, blimitSec, TimeUnit.SECONDS);
            this.backgroundRate = rate3;
            this.backgroundCapacity = blimitEvents;
            if (z) {
                logger.debug("Background %s logging rate:%f, capacity:%d", str, rate3, Long.valueOf(blimitEvents));
            }
        }

        private static long getFlimitSec(ConfigResolver configResolver, @ResourceType String str) {
            if (str == ResourceType.TRACE) {
                return configResolver.getRateLimitSec();
            }
            return configResolver.getRateLimitSec();
        }

        private static long getFlimitEvents(ConfigResolver configResolver, @ResourceType String str) {
            if (str == ResourceType.TRACE) {
                return configResolver.getTraceEventCountForeground();
            }
            return configResolver.getNetworkEventCountForeground();
        }

        private static long getBlimitSec(ConfigResolver configResolver, @ResourceType String str) {
            if (str == ResourceType.TRACE) {
                return configResolver.getRateLimitSec();
            }
            return configResolver.getRateLimitSec();
        }

        private static long getBlimitEvents(ConfigResolver configResolver, @ResourceType String str) {
            if (str == ResourceType.TRACE) {
                return configResolver.getTraceEventCountBackground();
            }
            return configResolver.getNetworkEventCountBackground();
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        public Rate getForegroundRate() {
            return this.foregroundRate;
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        public long getForegroundCapacity() {
            return this.foregroundCapacity;
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        public Rate getBackgroundRate() {
            return this.backgroundRate;
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        public long getBackgroundCapacity() {
            return this.backgroundCapacity;
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        public Rate getRate() {
            return this.rate;
        }

        /* access modifiers changed from: package-private */
        @VisibleForTesting
        public void setRate(Rate rate2) {
            this.rate = rate2;
        }
    }
}
