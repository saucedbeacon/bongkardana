package o;

import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.google.common.base.Strings;
import io.split.android.client.impressions.ImpressionListener;
import io.split.android.client.service.impressions.ImpressionsMode;
import java.net.URI;

public class getPackageValidityCheckComp {
    private static final int DEFAULT_AUTH_RETRY_BACKOFF_BASE_SECS = 1;
    private static final int DEFAULT_BACKGROUND_SYNC_PERIOD_MINUTES = 15;
    private static final int DEFAULT_CONNECTION_TIMEOUT_SECS = 15000;
    private static final String DEFAULT_DATA_FOLDER = "split_data";
    private static final int DEFAULT_EVENTS_FLUSH_INTERVAL = 1800;
    private static final int DEFAULT_EVENTS_PER_PUSH = 2000;
    private static final int DEFAULT_EVENTS_QUEUE_SIZE = 10000;
    private static final int DEFAULT_FEATURES_REFRESH_RATE_SECS = 3600;
    private static final int DEFAULT_IMPRESSIONS_CHUNK_SIZE = 2048;
    private static final int DEFAULT_IMPRESSIONS_PER_PUSH = 2000;
    private static final int DEFAULT_IMPRESSIONS_QUEUE_SIZE = 30000;
    private static final int DEFAULT_IMPRESSIONS_REFRESH_RATE_SECS = 1800;
    private static final int DEFAULT_IMP_COUNTERS_REFRESH_RATE_SECS = 1800;
    private static final int DEFAULT_METRICS_REFRESH_RATE_SECS = 1800;
    private static final int DEFAULT_NUM_THREAD_FOR_SEGMENT_FETCH = 2;
    private static final int DEFAULT_READY = -1;
    private static final int DEFAULT_READ_TIMEOUT_SECS = 15000;
    private static final int DEFAULT_SEGMENTS_REFRESH_RATE_SECS = 1800;
    private static final int DEFAULT_STREAMING_RECONNECT_BACKOFF_BASE_SECS = 1;
    private static final int DEFAULT_WAIT_BEFORE_SHUTDOW_SECS = 5000;
    private static final int EVENTS_MAX_SENT_ATTEMPS = 3;
    private static final int IMPRESSIONS_CHUNK_OUTDATED_TIME = 3600000;
    private static final int IMPRESSIONS_MAX_SENT_ATTEMPTS = 3;
    private static final int MAXIMUM_KEY_LENGTH = 250;
    private static final int MAX_QUEUE_SIZE_IN_BYTES = 5242880;
    private static final int MIN_CONNECTION_TIMEOUT = 0;
    private static final int MIN_FEATURES_REFRESH_RATE = 30;
    private static final int MIN_IMPRESSIONS_CHUNK_SIZE = 0;
    private static final int MIN_IMPRESSIONS_QUEUE_SIZE = 0;
    private static final int MIN_IMPRESSIONS_REFRESH_RATE = 30;
    private static final int MIN_METRICS_REFRESH_RATE = 30;
    private static final int MIN_MYSEGMENTS_REFRESH_RATE = 30;
    private static final int MIN_READ_TIMEOUT = 0;
    private static final long SPLITS_CACHE_EXPIRATION_IN_SECONDS = 864000;
    private static final String TRACK_EVENT_NAME_PATTERN = "^[a-zA-Z0-9][-_.:a-zA-Z0-9]{0,79}$";
    private static String _hostname = null;
    private static final long _impressionsChunkOudatedTime = 3600000;
    private static final int _impressionsMaxSentAttempts = 3;
    private static String _ip;
    public static String splitSdkVersion;
    private int _authRetryBackoffBase;
    private String _authServiceUrl;
    private long _backgroundSyncPeriod;
    private boolean _backgroundSyncWhenBatteryNotLow;
    private boolean _backgroundSyncWhenWifiOnly;
    private final int _connectionTimeout;
    private final boolean _debugEnabled;
    private String _endpoint;
    private final long _eventFlushInterval;
    private String _eventsEndpoint;
    private final int _eventsPerPush;
    private final int _eventsQueueSize;
    private final int _featuresRefreshRate;
    private final int _impCountersRefreshRate;
    private final ImpressionListener _impressionListener;
    private long _impressionsChunkSize;
    private ImpressionsMode _impressionsMode;
    private final int _impressionsPerPush;
    private final int _impressionsQueueSize;
    private final int _impressionsRefreshRate;
    private boolean _isSslDevelopmentModeEnabled;
    private final boolean _labelsEnabled;
    private boolean _legacyStorageMigrationEnabled;
    private final int _metricsRefreshRate;
    private final int _numThreadsForSegmentFetch;
    private getStringDDp _proxy;
    private translateFrame _proxyAuthenticator;
    private final int _readTimeout;
    private final int _ready;
    private final int _segmentsRefreshRate;
    private boolean _streamingEnabled;
    private int _streamingReconnectBackoffBase;
    private String _streamingServiceUrl;
    private IDynamicDataEncryptComponent _syncConfig;
    private boolean _synchronizeInBackground;
    private final String _trafficType;
    private final int _waitBeforeShutdown;

    public long cacheExpirationInSeconds() {
        return SPLITS_CACHE_EXPIRATION_IN_SECONDS;
    }

    /* access modifiers changed from: package-private */
    public String defaultDataFolder() {
        return DEFAULT_DATA_FOLDER;
    }

    /* access modifiers changed from: package-private */
    public int eventsMaxSentAttempts() {
        return 3;
    }

    /* access modifiers changed from: package-private */
    public long impressionsChunkOutdatedTime() {
        return 3600000;
    }

    /* access modifiers changed from: package-private */
    public int impressionsMaxSentAttempts() {
        return 3;
    }

    /* access modifiers changed from: package-private */
    public int maxQueueSizeInBytes() {
        return 5242880;
    }

    /* access modifiers changed from: package-private */
    public int maximumKeyLength() {
        return 250;
    }

    /* access modifiers changed from: package-private */
    public String trackEventNamePattern() {
        return TRACK_EVENT_NAME_PATTERN;
    }

    public static setMax builder() {
        return new setMax();
    }

    private getPackageValidityCheckComp(String str, String str2, int i, int i2, int i3, int i4, long j, int i5, int i6, int i7, int i8, int i9, int i10, boolean z, boolean z2, ImpressionListener impressionListener, int i11, String str3, String str4, getStringDDp getstringddp, translateFrame translateframe, int i12, int i13, long j2, String str5, boolean z3, long j3, boolean z4, boolean z5, boolean z6, int i14, int i15, String str6, String str7, boolean z7, IDynamicDataEncryptComponent iDynamicDataEncryptComponent, boolean z8, ImpressionsMode impressionsMode, int i16) {
        boolean z9 = z;
        this._proxy = null;
        this._proxyAuthenticator = null;
        this._endpoint = str;
        this._eventsEndpoint = str2;
        this._featuresRefreshRate = i;
        this._segmentsRefreshRate = i2;
        this._impressionsRefreshRate = i3;
        this._impressionsQueueSize = i4;
        this._impressionsPerPush = i5;
        this._impCountersRefreshRate = i16;
        this._metricsRefreshRate = i6;
        this._connectionTimeout = i7;
        this._readTimeout = i8;
        this._numThreadsForSegmentFetch = i9;
        this._ready = i10;
        this._debugEnabled = z9;
        this._labelsEnabled = z2;
        this._impressionListener = impressionListener;
        this._waitBeforeShutdown = i11;
        this._impressionsChunkSize = j;
        _hostname = str3;
        _ip = str4;
        this._proxy = getstringddp;
        this._proxyAuthenticator = translateframe;
        this._eventsQueueSize = i12;
        this._eventsPerPush = i13;
        this._eventFlushInterval = j2;
        this._trafficType = str5;
        this._synchronizeInBackground = z3;
        this._backgroundSyncPeriod = j3;
        this._backgroundSyncWhenBatteryNotLow = z4;
        this._backgroundSyncWhenWifiOnly = z5;
        this._streamingEnabled = z6;
        this._authRetryBackoffBase = i14;
        this._streamingReconnectBackoffBase = i15;
        this._authServiceUrl = str6;
        this._streamingServiceUrl = str7;
        this._isSslDevelopmentModeEnabled = z7;
        this._syncConfig = iDynamicDataEncryptComponent;
        this._legacyStorageMigrationEnabled = z8;
        this._impressionsMode = impressionsMode;
        splitSdkVersion = "Android-2.7.2";
        if (z9) {
            createLoadingDialog.instance().debugLevel(true);
        }
    }

    private static boolean isTestMode() {
        try {
            Class.forName("io.split.android.client.SplitClientConfigTest");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public String trafficType() {
        return this._trafficType;
    }

    public long eventFlushInterval() {
        return this._eventFlushInterval;
    }

    public int eventsQueueSize() {
        return this._eventsQueueSize;
    }

    public int eventsPerPush() {
        return this._eventsPerPush;
    }

    public String endpoint() {
        return this._endpoint;
    }

    public String eventsEndpoint() {
        return this._eventsEndpoint;
    }

    public int featuresRefreshRate() {
        return this._featuresRefreshRate;
    }

    public int segmentsRefreshRate() {
        return this._segmentsRefreshRate;
    }

    public int numThreadsForSegmentFetch() {
        return this._numThreadsForSegmentFetch;
    }

    public int impressionsRefreshRate() {
        return this._impressionsRefreshRate;
    }

    public int impressionsQueueSize() {
        return this._impressionsQueueSize;
    }

    public long impressionsChunkSize() {
        return this._impressionsChunkSize;
    }

    public int impressionsPerPush() {
        return this._impressionsPerPush;
    }

    public int metricsRefreshRate() {
        return this._metricsRefreshRate;
    }

    public int connectionTimeout() {
        return this._connectionTimeout;
    }

    public int readTimeout() {
        return this._readTimeout;
    }

    public boolean debugEnabled() {
        return this._debugEnabled;
    }

    public boolean labelsEnabled() {
        return this._labelsEnabled;
    }

    public int blockUntilReady() {
        return this._ready;
    }

    public ImpressionListener impressionListener() {
        return this._impressionListener;
    }

    public int waitBeforeShutdown() {
        return this._waitBeforeShutdown;
    }

    public getStringDDp proxy() {
        return this._proxy;
    }

    public translateFrame proxyAuthenticator() {
        return this._proxyAuthenticator;
    }

    public String hostname() {
        return _hostname;
    }

    public String ip() {
        return _ip;
    }

    public boolean synchronizeInBackground() {
        return this._synchronizeInBackground;
    }

    public long backgroundSyncPeriod() {
        return this._backgroundSyncPeriod;
    }

    public boolean backgroundSyncWhenBatteryNotLow() {
        return this._backgroundSyncWhenBatteryNotLow;
    }

    public boolean backgroundSyncWhenBatteryWifiOnly() {
        return this._backgroundSyncWhenWifiOnly;
    }

    public boolean streamingEnabled() {
        return this._streamingEnabled;
    }

    public int authRetryBackoffBase() {
        return this._authRetryBackoffBase;
    }

    public int streamingReconnectBackoffBase() {
        return this._streamingReconnectBackoffBase;
    }

    public String authServiceUrl() {
        return this._authServiceUrl;
    }

    public String streamingServiceUrl() {
        return this._streamingServiceUrl;
    }

    public translateFrame authenticator() {
        return this._proxyAuthenticator;
    }

    public boolean isSslDevelopmentModeEnabled() {
        return this._isSslDevelopmentModeEnabled;
    }

    public IDynamicDataEncryptComponent syncConfig() {
        return this._syncConfig;
    }

    public boolean isStorageMigrationEnabled() {
        return this._legacyStorageMigrationEnabled;
    }

    public ImpressionsMode impressionsMode() {
        return this._impressionsMode;
    }

    public int impressionsCounterRefreshRate() {
        return this._impCountersRefreshRate;
    }

    public static final class setMax {
        static final int PROXY_PORT_DEFAULT = 80;
        private int _authRetryBackoffBase;
        private long _backgroundSyncPeriod;
        private boolean _backgroundSyncWhenBatteryNotLow;
        private boolean _backgroundSyncWhenWifiOnly;
        private int _connectionTimeout;
        private boolean _debugEnabled;
        private long _eventFlushInterval;
        private int _eventsPerPush;
        private int _eventsQueueSize;
        private int _featuresRefreshRate;
        private String _hostname;
        private int _impCountersRefreshRate;
        private ImpressionListener _impressionListener;
        private long _impressionsChunkSize;
        private ImpressionsMode _impressionsMode;
        private int _impressionsPerPush;
        private int _impressionsQueueSize;
        private int _impressionsRefreshRate;
        private String _ip;
        private boolean _isSslDevelopmentModeEnabled;
        private boolean _labelsEnabled;
        private boolean _legacyStorageMigrationEnabled;
        private int _metricsRefreshRate;
        private int _numThreadsForSegmentFetch;
        private translateFrame _proxyAuthenticator;
        private String _proxyHost;
        private int _readTimeout;
        private int _ready;
        private int _segmentsRefreshRate;
        private getNoCaptchaComp _serviceEndpoints;
        private boolean _streamingEnabled;
        private int _streamingReconnectBackoffBase;
        private IDynamicDataEncryptComponent _syncConfig;
        private boolean _synchronizeInBackground;
        private String _trafficType;
        private int _waitBeforeShutdown;

        public setMax() {
            this._serviceEndpoints = null;
            this._featuresRefreshRate = getPackageValidityCheckComp.DEFAULT_FEATURES_REFRESH_RATE_SECS;
            this._segmentsRefreshRate = 1800;
            this._impressionsRefreshRate = 1800;
            this._impressionsQueueSize = 30000;
            this._impressionsPerPush = 2000;
            this._impCountersRefreshRate = 1800;
            this._connectionTimeout = 15000;
            this._readTimeout = 15000;
            this._numThreadsForSegmentFetch = 2;
            this._debugEnabled = false;
            this._ready = -1;
            this._metricsRefreshRate = 1800;
            this._labelsEnabled = true;
            this._waitBeforeShutdown = 5000;
            this._impressionsChunkSize = 2048;
            this._eventsQueueSize = 10000;
            this._eventFlushInterval = GriverConfigConstants.DEFAULT_ASYNC_UPDATE_PERIOD;
            this._eventsPerPush = 2000;
            this._trafficType = null;
            this._hostname = "unknown";
            this._ip = "unknown";
            this._proxyHost = null;
            this._proxyAuthenticator = null;
            this._synchronizeInBackground = false;
            this._backgroundSyncPeriod = 15;
            this._backgroundSyncWhenBatteryNotLow = true;
            this._backgroundSyncWhenWifiOnly = false;
            this._streamingEnabled = true;
            this._authRetryBackoffBase = 1;
            this._streamingReconnectBackoffBase = 1;
            this._isSslDevelopmentModeEnabled = false;
            this._syncConfig = IDynamicDataEncryptComponent.builder().build();
            this._legacyStorageMigrationEnabled = false;
            this._impressionsMode = ImpressionsMode.OPTIMIZED;
            this._serviceEndpoints = getNoCaptchaComp.builder().build();
        }

        public final setMax trafficType(String str) {
            this._trafficType = str;
            return this;
        }

        public final setMax eventsQueueSize(int i) {
            this._eventsQueueSize = i;
            return this;
        }

        public final setMax eventsPerPush(int i) {
            this._eventsPerPush = i;
            return this;
        }

        public final setMax eventFlushInterval(long j) {
            this._eventFlushInterval = j;
            return this;
        }

        public final setMax featuresRefreshRate(int i) {
            this._featuresRefreshRate = i;
            return this;
        }

        public final setMax segmentsRefreshRate(int i) {
            this._segmentsRefreshRate = i;
            return this;
        }

        public final setMax impressionsRefreshRate(int i) {
            this._impressionsRefreshRate = i;
            return this;
        }

        public final setMax impressionsQueueSize(int i) {
            this._impressionsQueueSize = i;
            return this;
        }

        public final setMax impressionsPerPush(int i) {
            this._impressionsPerPush = i;
            return this;
        }

        public final setMax impressionListener(ImpressionListener impressionListener) {
            this._impressionListener = impressionListener;
            return this;
        }

        public final setMax metricsRefreshRate(int i) {
            this._metricsRefreshRate = i;
            return this;
        }

        public final setMax connectionTimeout(int i) {
            this._connectionTimeout = i;
            return this;
        }

        public final setMax readTimeout(int i) {
            this._readTimeout = i;
            return this;
        }

        public final setMax enableDebug() {
            this._debugEnabled = true;
            return this;
        }

        public final setMax disableLabels() {
            this._labelsEnabled = false;
            return this;
        }

        public final setMax ready(int i) {
            this._ready = i;
            return this;
        }

        public final setMax waitBeforeShutdown(int i) {
            this._waitBeforeShutdown = i;
            return this;
        }

        public final setMax proxyHost(String str) {
            this._proxyHost = str;
            return this;
        }

        public final setMax proxyAuthenticator(translateFrame translateframe) {
            this._proxyAuthenticator = translateframe;
            return this;
        }

        public final setMax impressionsChunkSize(long j) {
            this._impressionsChunkSize = j;
            return this;
        }

        public final setMax hostname(String str) {
            this._hostname = str;
            return this;
        }

        public final setMax ip(String str) {
            this._ip = str;
            return this;
        }

        public final setMax sychronizeInBackground(boolean z) {
            this._synchronizeInBackground = z;
            return this;
        }

        public final setMax sychronizeInBackgroundPeriod(long j) {
            this._backgroundSyncPeriod = j;
            return this;
        }

        public final setMax backgroundSyncWhenBatteryNotLow(boolean z) {
            this._backgroundSyncWhenBatteryNotLow = z;
            return this;
        }

        public final setMax backgroundSyncWhenWifiOnly(boolean z) {
            this._backgroundSyncWhenWifiOnly = z;
            return this;
        }

        public final setMax streamingEnabled(boolean z) {
            this._streamingEnabled = z;
            return this;
        }

        public final setMax authRetryBackoffBase(int i) {
            this._authRetryBackoffBase = i;
            return this;
        }

        public final setMax streamingReconnectBackoffBase(int i) {
            this._streamingReconnectBackoffBase = i;
            return this;
        }

        public final setMax serviceEndpoints(getNoCaptchaComp getnocaptchacomp) {
            this._serviceEndpoints = getnocaptchacomp;
            return this;
        }

        public final setMax enableSslDevelopmentMode() {
            this._isSslDevelopmentModeEnabled = true;
            return this;
        }

        public final setMax syncConfig(IDynamicDataEncryptComponent iDynamicDataEncryptComponent) {
            this._syncConfig = iDynamicDataEncryptComponent;
            return this;
        }

        public final setMax legacyStorageMigrationEnabled(boolean z) {
            this._legacyStorageMigrationEnabled = z;
            return this;
        }

        public final setMax impressionsMode(ImpressionsMode impressionsMode) {
            this._impressionsMode = impressionsMode;
            return this;
        }

        public final setMax impressionsMode(String str) {
            this._impressionsMode = ImpressionsMode.fromString(str);
            return this;
        }

        public final getPackageValidityCheckComp build() {
            if (this._featuresRefreshRate < 30) {
                StringBuilder sb = new StringBuilder("featuresRefreshRate must be >= 30: ");
                sb.append(this._featuresRefreshRate);
                throw new IllegalArgumentException(sb.toString());
            } else if (this._segmentsRefreshRate < 30) {
                StringBuilder sb2 = new StringBuilder("segmentsRefreshRate must be >= 30: ");
                sb2.append(this._segmentsRefreshRate);
                throw new IllegalArgumentException(sb2.toString());
            } else if (this._impressionsRefreshRate < 30) {
                StringBuilder sb3 = new StringBuilder("impressionsRefreshRate must be >= 30: ");
                sb3.append(this._impressionsRefreshRate);
                throw new IllegalArgumentException(sb3.toString());
            } else if (this._metricsRefreshRate < 30) {
                StringBuilder sb4 = new StringBuilder("metricsRefreshRate must be >= 30: ");
                sb4.append(this._metricsRefreshRate);
                throw new IllegalArgumentException(sb4.toString());
            } else if (this._impressionsQueueSize <= 0) {
                StringBuilder sb5 = new StringBuilder("impressionsQueueSize must be > 0: ");
                sb5.append(this._impressionsQueueSize);
                throw new IllegalArgumentException(sb5.toString());
            } else if (this._impressionsChunkSize <= 0) {
                StringBuilder sb6 = new StringBuilder("impressionsChunkSize must be > 0: ");
                sb6.append(this._impressionsChunkSize);
                throw new IllegalArgumentException(sb6.toString());
            } else if (this._connectionTimeout <= 0) {
                StringBuilder sb7 = new StringBuilder("connectionTimeOutInMs must be > 0: ");
                sb7.append(this._connectionTimeout);
                throw new IllegalArgumentException(sb7.toString());
            } else if (this._readTimeout <= 0) {
                StringBuilder sb8 = new StringBuilder("readTimeout must be > 0: ");
                sb8.append(this._readTimeout);
                throw new IllegalArgumentException(sb8.toString());
            } else if (this._numThreadsForSegmentFetch > 0) {
                int i = this._authRetryBackoffBase;
                if (i <= 0) {
                    throw new IllegalArgumentException("Re attempting time to authenticate for push notifications MUST be greater than zero");
                } else if (i > 0) {
                    if (this._backgroundSyncPeriod < 15) {
                        createLoadingDialog.w("Background sync period is lower than allowed. Setting to default value.");
                        this._backgroundSyncPeriod = 15;
                    }
                    getPackageValidityCheckComp getpackagevaliditycheckcomp = r2;
                    getPackageValidityCheckComp getpackagevaliditycheckcomp2 = new getPackageValidityCheckComp(this._serviceEndpoints.getSdkEndpoint(), this._serviceEndpoints.getEventsEndpoint(), this._featuresRefreshRate, this._segmentsRefreshRate, this._impressionsRefreshRate, this._impressionsQueueSize, this._impressionsChunkSize, this._impressionsPerPush, this._metricsRefreshRate, this._connectionTimeout, this._readTimeout, this._numThreadsForSegmentFetch, this._ready, this._debugEnabled, this._labelsEnabled, this._impressionListener, this._waitBeforeShutdown, this._hostname, this._ip, parseProxyHost(this._proxyHost), this._proxyAuthenticator, this._eventsQueueSize, this._eventsPerPush, this._eventFlushInterval, this._trafficType, this._synchronizeInBackground, this._backgroundSyncPeriod, this._backgroundSyncWhenBatteryNotLow, this._backgroundSyncWhenWifiOnly, this._streamingEnabled, this._authRetryBackoffBase, this._streamingReconnectBackoffBase, this._serviceEndpoints.getAuthServiceEndpoint(), this._serviceEndpoints.getStreamingServiceEndpoint(), this._isSslDevelopmentModeEnabled, this._syncConfig, this._legacyStorageMigrationEnabled, this._impressionsMode, this._impCountersRefreshRate);
                    return getpackagevaliditycheckcomp;
                } else {
                    throw new IllegalArgumentException("Re attempting time to connect to streaming notifications MUST be greater than zero");
                }
            } else {
                throw new IllegalArgumentException("Number of threads for fetching segments MUST be greater than zero");
            }
        }

        public final void set_impressionsChunkSize(long j) {
            this._impressionsChunkSize = j;
        }

        private getStringDDp parseProxyHost(String str) {
            String str2;
            String str3 = null;
            if (Strings.isNullOrEmpty(str)) {
                return null;
            }
            try {
                URI create = URI.create(str);
                int port = create.getPort() != -1 ? create.getPort() : 80;
                String userInfo = create.getUserInfo();
                if (!Strings.isNullOrEmpty(userInfo)) {
                    String[] split = userInfo.split(":");
                    if (split.length > 1) {
                        str3 = split[0];
                        str2 = split[1];
                        return new getStringDDp(String.format("%s%s", new Object[]{create.getHost(), create.getPath()}), port, str3, str2);
                    }
                }
                str2 = null;
                return new getStringDDp(String.format("%s%s", new Object[]{create.getHost(), create.getPath()}), port, str3, str2);
            } catch (IllegalArgumentException e) {
                StringBuilder sb = new StringBuilder("Proxy URI not valid: ");
                sb.append(e.getLocalizedMessage());
                createLoadingDialog.e(sb.toString());
                throw new IllegalArgumentException();
            } catch (Exception e2) {
                StringBuilder sb2 = new StringBuilder("Unknown error while parsing proxy URI: ");
                sb2.append(e2.getLocalizedMessage());
                createLoadingDialog.e(sb2.toString());
                throw new IllegalArgumentException();
            }
        }
    }
}
