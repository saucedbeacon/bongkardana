package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.inject.Provider;
import com.google.firebase.perf.logging.AndroidLogger;
import com.google.firebase.perf.util.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigValue;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import o.FragmentTabHost;
import o.applyState;

@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final AndroidLogger logger = AndroidLogger.getInstance();
    private final ConcurrentHashMap<String, FirebaseRemoteConfigValue> allRcConfigMap;
    private final Executor executor;
    @Nullable
    private FirebaseRemoteConfig firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    @Nullable
    private Provider<RemoteConfigComponent> firebaseRemoteConfigProvider;

    private RemoteConfigManager() {
        this(new ThreadPoolExecutor(0, 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue()), (FirebaseRemoteConfig) null);
    }

    @VisibleForTesting
    RemoteConfigManager(Executor executor2, FirebaseRemoteConfig firebaseRemoteConfig2) {
        ConcurrentHashMap<String, FirebaseRemoteConfigValue> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0;
        this.executor = executor2;
        this.firebaseRemoteConfig = firebaseRemoteConfig2;
        if (firebaseRemoteConfig2 == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(firebaseRemoteConfig2.getAll());
        }
        this.allRcConfigMap = concurrentHashMap;
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    public void setFirebaseRemoteConfigProvider(@Nullable Provider<RemoteConfigComponent> provider) {
        this.firebaseRemoteConfigProvider = provider;
    }

    public Optional<Float> getFloat(String str) {
        if (str == null) {
            logger.debug("The key to get Remote Config float value is null.");
            return Optional.absent();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return Optional.of(Float.valueOf(Double.valueOf(remoteConfigValue.asDouble()).floatValue()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.debug("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return Optional.absent();
    }

    public Optional<Long> getLong(String str) {
        if (str == null) {
            logger.debug("The key to get Remote Config long value is null.");
            return Optional.absent();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return Optional.of(Long.valueOf(remoteConfigValue.asLong()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.debug("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return Optional.absent();
    }

    public Optional<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.debug("The key to get Remote Config boolean value is null.");
            return Optional.absent();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return Optional.of(Boolean.valueOf(remoteConfigValue.asBoolean()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.asString().isEmpty()) {
                    logger.debug("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.asString(), str);
                }
            }
        }
        return Optional.absent();
    }

    public Optional<String> getString(String str) {
        if (str == null) {
            logger.debug("The key to get Remote Config String value is null.");
            return Optional.absent();
        }
        FirebaseRemoteConfigValue remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return Optional.of(remoteConfigValue.asString());
        }
        return Optional.absent();
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> T getRemoteConfigValueOrDefault(java.lang.String r8, T r9) {
        /*
            r7 = this;
            com.google.firebase.remoteconfig.FirebaseRemoteConfigValue r0 = r7.getRemoteConfigValue(r8)
            if (r0 == 0) goto L_0x0075
            r1 = 1
            r2 = 0
            boolean r3 = r9 instanceof java.lang.Boolean     // Catch:{ IllegalArgumentException -> 0x0058 }
            if (r3 == 0) goto L_0x0015
            boolean r3 = r0.asBoolean()     // Catch:{ IllegalArgumentException -> 0x0058 }
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0058 }
            goto L_0x0075
        L_0x0015:
            boolean r3 = r9 instanceof java.lang.Float     // Catch:{ IllegalArgumentException -> 0x0058 }
            if (r3 == 0) goto L_0x002a
            double r3 = r0.asDouble()     // Catch:{ IllegalArgumentException -> 0x0058 }
            java.lang.Double r3 = java.lang.Double.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0058 }
            float r3 = r3.floatValue()     // Catch:{ IllegalArgumentException -> 0x0058 }
            java.lang.Float r9 = java.lang.Float.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0058 }
            goto L_0x0075
        L_0x002a:
            boolean r3 = r9 instanceof java.lang.Long     // Catch:{ IllegalArgumentException -> 0x0058 }
            if (r3 != 0) goto L_0x004f
            boolean r3 = r9 instanceof java.lang.Integer     // Catch:{ IllegalArgumentException -> 0x0058 }
            if (r3 == 0) goto L_0x0033
            goto L_0x004f
        L_0x0033:
            boolean r3 = r9 instanceof java.lang.String     // Catch:{ IllegalArgumentException -> 0x0058 }
            if (r3 == 0) goto L_0x003c
            java.lang.String r9 = r0.asString()     // Catch:{ IllegalArgumentException -> 0x0058 }
            goto L_0x0075
        L_0x003c:
            java.lang.String r3 = r0.asString()     // Catch:{ IllegalArgumentException -> 0x0058 }
            com.google.firebase.perf.logging.AndroidLogger r4 = logger     // Catch:{ IllegalArgumentException -> 0x004d }
            java.lang.String r5 = "No matching type found for the defaultValue: '%s', using String."
            java.lang.Object[] r6 = new java.lang.Object[r1]     // Catch:{ IllegalArgumentException -> 0x004d }
            r6[r2] = r9     // Catch:{ IllegalArgumentException -> 0x004d }
            r4.debug(r5, r6)     // Catch:{ IllegalArgumentException -> 0x004d }
            r9 = r3
            goto L_0x0075
        L_0x004d:
            r9 = r3
            goto L_0x0059
        L_0x004f:
            long r3 = r0.asLong()     // Catch:{ IllegalArgumentException -> 0x0058 }
            java.lang.Long r9 = java.lang.Long.valueOf(r3)     // Catch:{ IllegalArgumentException -> 0x0058 }
            goto L_0x0075
        L_0x0058:
        L_0x0059:
            java.lang.String r3 = r0.asString()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x0075
            com.google.firebase.perf.logging.AndroidLogger r3 = logger
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = r0.asString()
            r4[r2] = r0
            r4[r1] = r8
            java.lang.String r8 = "Could not parse value: '%s' for key: '%s'."
            r3.debug(r8, r4)
        L_0x0075:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.perf.config.RemoteConfigManager.getRemoteConfigValueOrDefault(java.lang.String, java.lang.Object):java.lang.Object");
    }

    private FirebaseRemoteConfigValue getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        FirebaseRemoteConfigValue firebaseRemoteConfigValue = this.allRcConfigMap.get(str);
        if (firebaseRemoteConfigValue.getSource() != 2) {
            return null;
        }
        logger.debug("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", firebaseRemoteConfigValue.asString(), str);
        return firebaseRemoteConfigValue;
    }

    public boolean isLastFetchFailed() {
        FirebaseRemoteConfig firebaseRemoteConfig2 = this.firebaseRemoteConfig;
        if (firebaseRemoteConfig2 == null || firebaseRemoteConfig2.getInfo().getLastFetchStatus() == 1) {
            return true;
        }
        return false;
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                syncConfigValues(this.firebaseRemoteConfig.getAll());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.fetchAndActivate().addOnSuccessListener(this.executor, new FragmentTabHost.SavedState(this)).addOnFailureListener(this.executor, (OnFailureListener) new applyState(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.getAll());
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        this.firebaseRemoteConfigLastFetchTimestampMs = 0;
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public void syncConfigValues(Map<String, FirebaseRemoteConfigValue> map) {
        this.allRcConfigMap.putAll(map);
        for (String next : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(next)) {
                this.allRcConfigMap.remove(next);
            }
        }
    }

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        Provider<RemoteConfigComponent> provider;
        RemoteConfigComponent remoteConfigComponent;
        if (!(this.firebaseRemoteConfig != null || (provider = this.firebaseRemoteConfigProvider) == null || (remoteConfigComponent = provider.get()) == null)) {
            this.firebaseRemoteConfig = remoteConfigComponent.get(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        return getCurrentSystemTimeMillis() - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    @VisibleForTesting
    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }
}
