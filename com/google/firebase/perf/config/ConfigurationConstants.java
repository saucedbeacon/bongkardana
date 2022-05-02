package com.google.firebase.perf.config;

import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.util.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

final class ConfigurationConstants {
    ConfigurationConstants() {
    }

    protected static final class CollectionDeactivated extends ConfigurationFlag<Boolean> {
        private static CollectionDeactivated instance;

        /* access modifiers changed from: protected */
        public final String getMetadataFlag() {
            return "firebase_performance_collection_deactivated";
        }

        private CollectionDeactivated() {
        }

        protected static synchronized CollectionDeactivated getInstance() {
            CollectionDeactivated collectionDeactivated;
            synchronized (CollectionDeactivated.class) {
                if (instance == null) {
                    instance = new CollectionDeactivated();
                }
                collectionDeactivated = instance;
            }
            return collectionDeactivated;
        }

        /* access modifiers changed from: protected */
        public final Boolean getDefault() {
            return Boolean.FALSE;
        }
    }

    protected static final class CollectionEnabled extends ConfigurationFlag<Boolean> {
        private static CollectionEnabled instance;

        /* access modifiers changed from: protected */
        public final String getDeviceCacheFlag() {
            return Constants.ENABLE_DISABLE;
        }

        /* access modifiers changed from: protected */
        public final String getMetadataFlag() {
            return "firebase_performance_collection_enabled";
        }

        private CollectionEnabled() {
        }

        protected static synchronized CollectionEnabled getInstance() {
            CollectionEnabled collectionEnabled;
            synchronized (CollectionEnabled.class) {
                if (instance == null) {
                    instance = new CollectionEnabled();
                }
                collectionEnabled = instance;
            }
            return collectionEnabled;
        }

        /* access modifiers changed from: protected */
        public final Boolean getDefault() {
            return Boolean.TRUE;
        }
    }

    protected static final class SdkEnabled extends ConfigurationFlag<Boolean> {
        private static SdkEnabled instance;

        /* access modifiers changed from: protected */
        public final String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SdkEnabled";
        }

        /* access modifiers changed from: protected */
        public final String getRemoteConfigFlag() {
            return "fpr_enabled";
        }

        protected SdkEnabled() {
        }

        protected static synchronized SdkEnabled getInstance() {
            SdkEnabled sdkEnabled;
            synchronized (SdkEnabled.class) {
                if (instance == null) {
                    instance = new SdkEnabled();
                }
                sdkEnabled = instance;
            }
            return sdkEnabled;
        }

        /* access modifiers changed from: protected */
        public final Boolean getDefault() {
            return Boolean.TRUE;
        }
    }

    protected static final class SdkDisabledVersions extends ConfigurationFlag<String> {
        private static SdkDisabledVersions instance;

        /* access modifiers changed from: protected */
        public final String getDefault() {
            return "";
        }

        /* access modifiers changed from: protected */
        public final String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SdkDisabledVersions";
        }

        /* access modifiers changed from: protected */
        public final String getRemoteConfigFlag() {
            return "fpr_disabled_android_versions";
        }

        protected SdkDisabledVersions() {
        }

        protected static synchronized SdkDisabledVersions getInstance() {
            SdkDisabledVersions sdkDisabledVersions;
            synchronized (SdkDisabledVersions.class) {
                if (instance == null) {
                    instance = new SdkDisabledVersions();
                }
                sdkDisabledVersions = instance;
            }
            return sdkDisabledVersions;
        }
    }

    protected static final class TraceSamplingRate extends ConfigurationFlag<Float> {
        private static TraceSamplingRate instance;

        /* access modifiers changed from: protected */
        public final String getDeviceCacheFlag() {
            return "com.google.firebase.perf.TraceSamplingRate";
        }

        /* access modifiers changed from: protected */
        public final String getRemoteConfigFlag() {
            return "fpr_vc_trace_sampling_rate";
        }

        private TraceSamplingRate() {
        }

        protected static synchronized TraceSamplingRate getInstance() {
            TraceSamplingRate traceSamplingRate;
            synchronized (TraceSamplingRate.class) {
                if (instance == null) {
                    instance = new TraceSamplingRate();
                }
                traceSamplingRate = instance;
            }
            return traceSamplingRate;
        }

        /* access modifiers changed from: protected */
        public final Float getDefault() {
            return Float.valueOf(1.0f);
        }
    }

    protected static final class NetworkRequestSamplingRate extends ConfigurationFlag<Float> {
        private static NetworkRequestSamplingRate instance;

        /* access modifiers changed from: protected */
        public final String getDeviceCacheFlag() {
            return "com.google.firebase.perf.NetworkRequestSamplingRate";
        }

        /* access modifiers changed from: protected */
        public final String getRemoteConfigFlag() {
            return "fpr_vc_network_request_sampling_rate";
        }

        private NetworkRequestSamplingRate() {
        }

        protected static synchronized NetworkRequestSamplingRate getInstance() {
            NetworkRequestSamplingRate networkRequestSamplingRate;
            synchronized (NetworkRequestSamplingRate.class) {
                if (instance == null) {
                    instance = new NetworkRequestSamplingRate();
                }
                networkRequestSamplingRate = instance;
            }
            return networkRequestSamplingRate;
        }

        /* access modifiers changed from: protected */
        public final Float getDefault() {
            return Float.valueOf(1.0f);
        }
    }

    protected static final class SessionsCpuCaptureFrequencyForegroundMs extends ConfigurationFlag<Long> {
        private static SessionsCpuCaptureFrequencyForegroundMs instance;

        /* access modifiers changed from: protected */
        public final String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
        }

        /* access modifiers changed from: protected */
        public final String getMetadataFlag() {
            return "sessions_cpu_capture_frequency_fg_ms";
        }

        /* access modifiers changed from: protected */
        public final String getRemoteConfigFlag() {
            return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
        }

        private SessionsCpuCaptureFrequencyForegroundMs() {
        }

        public static synchronized SessionsCpuCaptureFrequencyForegroundMs getInstance() {
            SessionsCpuCaptureFrequencyForegroundMs sessionsCpuCaptureFrequencyForegroundMs;
            synchronized (SessionsCpuCaptureFrequencyForegroundMs.class) {
                if (instance == null) {
                    instance = new SessionsCpuCaptureFrequencyForegroundMs();
                }
                sessionsCpuCaptureFrequencyForegroundMs = instance;
            }
            return sessionsCpuCaptureFrequencyForegroundMs;
        }

        /* access modifiers changed from: protected */
        public final Long getDefault() {
            return 100L;
        }
    }

    protected static final class SessionsCpuCaptureFrequencyBackgroundMs extends ConfigurationFlag<Long> {
        private static SessionsCpuCaptureFrequencyBackgroundMs instance;

        /* access modifiers changed from: protected */
        public final String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
        }

        /* access modifiers changed from: protected */
        public final String getMetadataFlag() {
            return "sessions_cpu_capture_frequency_bg_ms";
        }

        /* access modifiers changed from: protected */
        public final String getRemoteConfigFlag() {
            return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
        }

        private SessionsCpuCaptureFrequencyBackgroundMs() {
        }

        public static synchronized SessionsCpuCaptureFrequencyBackgroundMs getInstance() {
            SessionsCpuCaptureFrequencyBackgroundMs sessionsCpuCaptureFrequencyBackgroundMs;
            synchronized (SessionsCpuCaptureFrequencyBackgroundMs.class) {
                if (instance == null) {
                    instance = new SessionsCpuCaptureFrequencyBackgroundMs();
                }
                sessionsCpuCaptureFrequencyBackgroundMs = instance;
            }
            return sessionsCpuCaptureFrequencyBackgroundMs;
        }

        /* access modifiers changed from: protected */
        public final Long getDefault() {
            return 0L;
        }
    }

    protected static final class SessionsMemoryCaptureFrequencyForegroundMs extends ConfigurationFlag<Long> {
        private static SessionsMemoryCaptureFrequencyForegroundMs instance;

        /* access modifiers changed from: protected */
        public final String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
        }

        /* access modifiers changed from: protected */
        public final String getMetadataFlag() {
            return "sessions_memory_capture_frequency_fg_ms";
        }

        /* access modifiers changed from: protected */
        public final String getRemoteConfigFlag() {
            return "fpr_session_gauge_memory_capture_frequency_fg_ms";
        }

        private SessionsMemoryCaptureFrequencyForegroundMs() {
        }

        public static synchronized SessionsMemoryCaptureFrequencyForegroundMs getInstance() {
            SessionsMemoryCaptureFrequencyForegroundMs sessionsMemoryCaptureFrequencyForegroundMs;
            synchronized (SessionsMemoryCaptureFrequencyForegroundMs.class) {
                if (instance == null) {
                    instance = new SessionsMemoryCaptureFrequencyForegroundMs();
                }
                sessionsMemoryCaptureFrequencyForegroundMs = instance;
            }
            return sessionsMemoryCaptureFrequencyForegroundMs;
        }

        /* access modifiers changed from: protected */
        public final Long getDefault() {
            return 100L;
        }
    }

    protected static final class SessionsMemoryCaptureFrequencyBackgroundMs extends ConfigurationFlag<Long> {
        private static SessionsMemoryCaptureFrequencyBackgroundMs instance;

        /* access modifiers changed from: protected */
        public final String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
        }

        /* access modifiers changed from: protected */
        public final String getMetadataFlag() {
            return "sessions_memory_capture_frequency_bg_ms";
        }

        /* access modifiers changed from: protected */
        public final String getRemoteConfigFlag() {
            return "fpr_session_gauge_memory_capture_frequency_bg_ms";
        }

        private SessionsMemoryCaptureFrequencyBackgroundMs() {
        }

        public static synchronized SessionsMemoryCaptureFrequencyBackgroundMs getInstance() {
            SessionsMemoryCaptureFrequencyBackgroundMs sessionsMemoryCaptureFrequencyBackgroundMs;
            synchronized (SessionsMemoryCaptureFrequencyBackgroundMs.class) {
                if (instance == null) {
                    instance = new SessionsMemoryCaptureFrequencyBackgroundMs();
                }
                sessionsMemoryCaptureFrequencyBackgroundMs = instance;
            }
            return sessionsMemoryCaptureFrequencyBackgroundMs;
        }

        /* access modifiers changed from: protected */
        public final Long getDefault() {
            return 0L;
        }
    }

    protected static final class SessionsMaxDurationMinutes extends ConfigurationFlag<Long> {
        private static SessionsMaxDurationMinutes instance;

        /* access modifiers changed from: protected */
        public final String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionsMaxDurationMinutes";
        }

        /* access modifiers changed from: protected */
        public final String getMetadataFlag() {
            return "sessions_max_length_minutes";
        }

        /* access modifiers changed from: protected */
        public final String getRemoteConfigFlag() {
            return "fpr_session_max_duration_min";
        }

        private SessionsMaxDurationMinutes() {
        }

        public static synchronized SessionsMaxDurationMinutes getInstance() {
            SessionsMaxDurationMinutes sessionsMaxDurationMinutes;
            synchronized (SessionsMaxDurationMinutes.class) {
                if (instance == null) {
                    instance = new SessionsMaxDurationMinutes();
                }
                sessionsMaxDurationMinutes = instance;
            }
            return sessionsMaxDurationMinutes;
        }

        /* access modifiers changed from: protected */
        public final Long getDefault() {
            return 240L;
        }
    }

    protected static final class TraceEventCountForeground extends ConfigurationFlag<Long> {
        private static TraceEventCountForeground instance;

        /* access modifiers changed from: protected */
        public final String getDeviceCacheFlag() {
            return "com.google.firebase.perf.TraceEventCountForeground";
        }

        /* access modifiers changed from: protected */
        public final String getRemoteConfigFlag() {
            return "fpr_rl_trace_event_count_fg";
        }

        private TraceEventCountForeground() {
        }

        public static synchronized TraceEventCountForeground getInstance() {
            TraceEventCountForeground traceEventCountForeground;
            synchronized (TraceEventCountForeground.class) {
                if (instance == null) {
                    instance = new TraceEventCountForeground();
                }
                traceEventCountForeground = instance;
            }
            return traceEventCountForeground;
        }

        /* access modifiers changed from: protected */
        public final Long getDefault() {
            return 300L;
        }
    }

    protected static final class TraceEventCountBackground extends ConfigurationFlag<Long> {
        private static TraceEventCountBackground instance;

        /* access modifiers changed from: protected */
        public final String getDeviceCacheFlag() {
            return "com.google.firebase.perf.TraceEventCountBackground";
        }

        /* access modifiers changed from: protected */
        public final String getRemoteConfigFlag() {
            return "fpr_rl_trace_event_count_bg";
        }

        private TraceEventCountBackground() {
        }

        public static synchronized TraceEventCountBackground getInstance() {
            TraceEventCountBackground traceEventCountBackground;
            synchronized (TraceEventCountBackground.class) {
                if (instance == null) {
                    instance = new TraceEventCountBackground();
                }
                traceEventCountBackground = instance;
            }
            return traceEventCountBackground;
        }

        /* access modifiers changed from: protected */
        public final Long getDefault() {
            return 30L;
        }
    }

    protected static final class NetworkEventCountForeground extends ConfigurationFlag<Long> {
        private static NetworkEventCountForeground instance;

        /* access modifiers changed from: protected */
        public final String getDeviceCacheFlag() {
            return "com.google.firebase.perf.NetworkEventCountForeground";
        }

        /* access modifiers changed from: protected */
        public final String getRemoteConfigFlag() {
            return "fpr_rl_network_event_count_fg";
        }

        private NetworkEventCountForeground() {
        }

        public static synchronized NetworkEventCountForeground getInstance() {
            NetworkEventCountForeground networkEventCountForeground;
            synchronized (NetworkEventCountForeground.class) {
                if (instance == null) {
                    instance = new NetworkEventCountForeground();
                }
                networkEventCountForeground = instance;
            }
            return networkEventCountForeground;
        }

        /* access modifiers changed from: protected */
        public final Long getDefault() {
            return 700L;
        }
    }

    protected static final class NetworkEventCountBackground extends ConfigurationFlag<Long> {
        private static NetworkEventCountBackground instance;

        /* access modifiers changed from: protected */
        public final String getDeviceCacheFlag() {
            return "com.google.firebase.perf.NetworkEventCountBackground";
        }

        /* access modifiers changed from: protected */
        public final String getRemoteConfigFlag() {
            return "fpr_rl_network_event_count_bg";
        }

        private NetworkEventCountBackground() {
        }

        public static synchronized NetworkEventCountBackground getInstance() {
            NetworkEventCountBackground networkEventCountBackground;
            synchronized (NetworkEventCountBackground.class) {
                if (instance == null) {
                    instance = new NetworkEventCountBackground();
                }
                networkEventCountBackground = instance;
            }
            return networkEventCountBackground;
        }

        /* access modifiers changed from: protected */
        public final Long getDefault() {
            return 70L;
        }
    }

    protected static final class RateLimitSec extends ConfigurationFlag<Long> {
        private static RateLimitSec instance;

        /* access modifiers changed from: protected */
        public final String getDeviceCacheFlag() {
            return "com.google.firebase.perf.TimeLimitSec";
        }

        /* access modifiers changed from: protected */
        public final String getRemoteConfigFlag() {
            return "fpr_rl_time_limit_sec";
        }

        private RateLimitSec() {
        }

        public static synchronized RateLimitSec getInstance() {
            RateLimitSec rateLimitSec;
            synchronized (RateLimitSec.class) {
                if (instance == null) {
                    instance = new RateLimitSec();
                }
                rateLimitSec = instance;
            }
            return rateLimitSec;
        }

        /* access modifiers changed from: protected */
        public final Long getDefault() {
            return 600L;
        }
    }

    protected static final class SessionsSamplingRate extends ConfigurationFlag<Float> {
        private static SessionsSamplingRate instance;

        /* access modifiers changed from: protected */
        public final String getDeviceCacheFlag() {
            return "com.google.firebase.perf.SessionSamplingRate";
        }

        /* access modifiers changed from: protected */
        public final String getMetadataFlag() {
            return "sessions_sampling_percentage";
        }

        /* access modifiers changed from: protected */
        public final String getRemoteConfigFlag() {
            return "fpr_vc_session_sampling_rate";
        }

        private SessionsSamplingRate() {
        }

        public static synchronized SessionsSamplingRate getInstance() {
            SessionsSamplingRate sessionsSamplingRate;
            synchronized (SessionsSamplingRate.class) {
                if (instance == null) {
                    instance = new SessionsSamplingRate();
                }
                sessionsSamplingRate = instance;
            }
            return sessionsSamplingRate;
        }

        /* access modifiers changed from: protected */
        public final Float getDefault() {
            return Float.valueOf(0.01f);
        }
    }

    protected static final class LogSourceName extends ConfigurationFlag<String> {
        private static final Map<Long, String> LOG_SOURCE_MAP = Collections.unmodifiableMap(new HashMap<Long, String>() {
            {
                put(461L, "FIREPERF_AUTOPUSH");
                put(462L, "FIREPERF");
                put(675L, "FIREPERF_INTERNAL_LOW");
                put(676L, "FIREPERF_INTERNAL_HIGH");
            }
        });
        private static LogSourceName instance;

        /* access modifiers changed from: protected */
        public final String getDeviceCacheFlag() {
            return "com.google.firebase.perf.LogSourceName";
        }

        /* access modifiers changed from: protected */
        public final String getRemoteConfigFlag() {
            return "fpr_log_source";
        }

        private LogSourceName() {
        }

        public static synchronized LogSourceName getInstance() {
            LogSourceName logSourceName;
            synchronized (LogSourceName.class) {
                if (instance == null) {
                    instance = new LogSourceName();
                }
                logSourceName = instance;
            }
            return logSourceName;
        }

        protected static String getLogSourceName(long j) {
            return LOG_SOURCE_MAP.get(Long.valueOf(j));
        }

        protected static boolean isLogSourceKnown(long j) {
            return LOG_SOURCE_MAP.containsKey(Long.valueOf(j));
        }

        /* access modifiers changed from: protected */
        public final String getDefault() {
            return BuildConfig.TRANSPORT_LOG_SRC;
        }
    }
}
