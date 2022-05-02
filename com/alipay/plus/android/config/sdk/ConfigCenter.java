package com.alipay.plus.android.config.sdk;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.securityprofiles.profile.RpcProfile;
import com.alipay.plus.android.config.sdk.ConfigMerger;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.common.KVBuilder;
import com.alipay.plus.android.config.sdk.delegate.ConfigMonitor;
import com.alipay.plus.android.config.sdk.facade.request.AmcsConfigByKeysLiteRpcRequest;
import com.alipay.plus.android.config.sdk.facade.result.AmcsConfigKeyDetails;
import com.alipay.plus.android.config.sdk.facade.result.AmcsConfigRpcResult;
import com.alipay.plus.android.config.sdk.fetcher.ConfigFetchCallback;
import com.alipay.plus.android.config.sdk.fetcher.ConfigNotifyCallback;
import com.alipay.plus.android.config.sdk.listener.ConfigUpdateListener;
import com.alipay.plus.android.config.sdk.retry.DistributionNode;
import com.alipay.plus.android.config.sdk.retry.DistributionNodesConfig;
import com.alipay.plus.android.config.sdk.retry.c;
import com.alipay.plus.android.config.sdk.retry.d;
import com.alipay.plus.android.config.sdk.rpc.AmcsRpcUtils;
import com.alipay.plus.android.config.sdk.storage.a;
import com.alipay.plus.android.config.sdk.trigger.ConfigUpdateTrigger;
import com.alipay.plus.android.config.sdk.utils.ConfigUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ConfigCenter extends ConfigMerger implements ConfigFetchCallback {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9507a = e.a(com.alipay.zoloz.config.ConfigCenter.TAG);
    private static final ConfigCenter b = new ConfigCenter();
    private a c;
    private ConfigCenterContext d;
    private Executor e;
    @Nullable
    private ConfigUpdateListener f;
    @Nullable
    private c g;
    private boolean h = true;
    protected long mCurrentNodeVersion = 0;
    protected long mLastRefreshTime = 0;

    protected ConfigCenter() {
    }

    private void a() {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        int i = availableProcessors * 2;
        this.e = new ThreadPoolExecutor(i, i + 1, 0, TimeUnit.SECONDS, new LinkedBlockingQueue(100), new ThreadFactory() {

            /* renamed from: a  reason: collision with root package name */
            int f10735a = 0;

            public Thread newThread(@NonNull Runnable runnable) {
                StringBuilder sb = new StringBuilder("AMCS_BACKGROUND_THREAD");
                int i = this.f10735a;
                this.f10735a = i + 1;
                sb.append(i);
                return new Thread(runnable, sb.toString());
            }
        }, new ThreadPoolExecutor.AbortPolicy());
    }

    private void a(long j, @Nullable ConfigMerger.MergeChangeResult mergeChangeResult, @Nullable Map<String, AmcsConfigKeyDetails> map) {
        if (map == null || map.isEmpty()) {
            LoggerWrapper.i(f9507a, "handleMergedResults: updateKeyDetails is empty.");
        } else if (mergeChangeResult == null || (mergeChangeResult.changedList.isEmpty() && mergeChangeResult.valueNotChangedList.isEmpty())) {
            LoggerWrapper.i(f9507a, "handleMergedResults: changeResult has no changes.");
        } else {
            HashMap hashMap = new HashMap();
            for (com.alipay.plus.android.config.sdk.a.a next : mergeChangeResult.changedList) {
                HashSet<String> hashSet = new HashSet<>();
                hashSet.addAll(next.c.addedKeys);
                hashSet.addAll(next.c.modifiedKeys);
                for (String str : hashSet) {
                    if (next.b) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(next.f10741a);
                        sb.append(".");
                        sb.append(str);
                        str = sb.toString();
                    }
                    AmcsConfigKeyDetails amcsConfigKeyDetails = map.get(str);
                    if (amcsConfigKeyDetails != null && amcsConfigKeyDetails.version > 0) {
                        hashMap.put(str, String.valueOf(amcsConfigKeyDetails.version));
                    }
                }
            }
            for (String next2 : mergeChangeResult.valueNotChangedList) {
                AmcsConfigKeyDetails amcsConfigKeyDetails2 = map.get(next2);
                if (amcsConfigKeyDetails2 != null && amcsConfigKeyDetails2.version > 0 && amcsConfigKeyDetails2.version > j) {
                    hashMap.put(next2, String.valueOf(amcsConfigKeyDetails2.version));
                }
            }
            if (hashMap.isEmpty()) {
                LoggerWrapper.i(f9507a, "handleMergedResults: extras is empty.");
            } else {
                this.d.getConfigMonitor().behavior("config_merge_result", hashMap);
            }
        }
    }

    private void a(@Nullable List<DistributionNode> list) {
        if (list != null) {
            RpcProfile rpcProfile = this.d.getRpcProfile();
            AmcsRpcUtils.updateRpcGateway(rpcProfile, AmcsRpcUtils.DEFAULT_NODE_MDS_SERVICE);
            for (DistributionNode next : list) {
                RpcProfile rpcProfile2 = (RpcProfile) e.a(rpcProfile, RpcProfile.class);
                if (rpcProfile2 != null && DistributionNode.a.isRpcNode(next.type) && ConfigUtils.isDeviceHitRate(next.rate, this.d) && !TextUtils.isEmpty(next.url)) {
                    rpcProfile2.gatewayUrl = next.url;
                    if (next.type == DistributionNode.a.GRAYSCALE && next.extras != null) {
                        rpcProfile2.appKey = null;
                        rpcProfile2.authCode = null;
                        rpcProfile2.headers = ConfigUtils.convertToStringMap(next.extras);
                    }
                    AmcsRpcUtils.updateRpcGateway(rpcProfile2, next.configName);
                }
            }
        }
    }

    private void a(@NonNull List<String> list, ConfigNotifyCallback configNotifyCallback) {
        a(list, configNotifyCallback, c.a.BY_KEYS);
    }

    private void a(List<String> list, ConfigNotifyCallback configNotifyCallback, c.a aVar) {
        DistributionNodesConfig g2 = g();
        List<DistributionNode> list2 = (g2 == null || g2.distributionNodes == null) ? null : g2.distributionNodes;
        String d2 = this.c.d();
        if (aVar == null || aVar == c.a.ALL) {
            c a2 = c.a(this.d, getLastUpdateVersion(), list2, f(), d2, this);
            this.g = a2;
            a2.b();
            c();
        } else if (aVar == c.a.BY_KEYS) {
            c.a(this.d, list2, list, this, configNotifyCallback).b();
        }
    }

    private void b() {
        long currentTimeMillis = System.currentTimeMillis() - this.mLastRefreshTime;
        ConfigGetter sectionConfigGetter = getSectionConfigGetter("amcs");
        long j = 1800000;
        if (sectionConfigGetter != null) {
            j = sectionConfigGetter.getLongConfig("refreshGapKey", 1800000);
        }
        if (currentTimeMillis > j) {
            refreshConfig();
        }
    }

    private void c() {
        long currentTimeMillis = System.currentTimeMillis();
        this.mLastRefreshTime = currentTimeMillis;
        this.c.a(currentTimeMillis);
    }

    private void d() {
        a((List<String>) null, (ConfigNotifyCallback) null, c.a.ALL);
    }

    private void e() {
        c cVar = this.g;
        if (cVar != null) {
            cVar.cancel();
            this.g = null;
        }
    }

    @Nullable
    private List<DistributionNode> f() {
        if (this.c == null) {
            return null;
        }
        String str = f9507a;
        StringBuilder sb = new StringBuilder("Current config version: ");
        sb.append(this.mCurrentConfigVersion);
        LoggerWrapper.i(str, sb.toString());
        DistributionNodesConfig b2 = this.c.b();
        if (b2 == null) {
            return null;
        }
        if (b2.configVersion > this.mCurrentConfigVersion) {
            return b2.distributionNodes;
        }
        LoggerWrapper.w(f9507a, "Backup version less. skip this backup node: ".concat(String.valueOf(b2)));
        return null;
    }

    @Nullable
    private DistributionNodesConfig g() {
        a aVar = this.c;
        if (aVar == null) {
            return null;
        }
        return aVar.c();
    }

    @NonNull
    public static ConfigCenter getInstance() {
        return b;
    }

    public void fetchAppsByIds(String str, String str2, String str3, @NonNull List<String> list, @Nullable Map<String, Object> map, @Nullable ConfigNotifyCallback configNotifyCallback) {
        List<String> list2 = list;
        ConfigNotifyCallback configNotifyCallback2 = configNotifyCallback;
        LoggerWrapper.d(f9507a, "will fetchAppsByIds...");
        if (!isInitialized() || this.e == null) {
            LoggerWrapper.d(f9507a, "ConfigCenter have not initialized. will not fetch the config.");
            if (configNotifyCallback2 != null) {
                configNotifyCallback2.onFetchFailed("IllegalStaus", "ConfigCenter have not initialized.!");
            }
        } else if (list2 != null && !list.isEmpty()) {
            LoggerWrapper.d(f9507a, "start fetch apps from AMCS Lite.");
            try {
                this.d.getConfigMonitor().behavior(ConfigMonitor.Events.CONFIG_FETCH_LITE_APPS_START, KVBuilder.newBuilder().put("keys", e.a((Iterable<? extends CharSequence>) list2, ',')).build());
                d.a(configNotifyCallback).executeOnExecutor(this.e, new AmcsConfigByKeysLiteRpcRequest[]{e.a(this.d, str, str2, str3, list, map)});
            } catch (Exception e2) {
                if (configNotifyCallback2 != null) {
                    StringBuilder sb = new StringBuilder("Fetching task failed: ");
                    sb.append(e2.getMessage());
                    configNotifyCallback2.onFetchFailed("SystemError", sb.toString());
                }
            }
        } else if (configNotifyCallback2 != null) {
            configNotifyCallback2.onFetchFailed("IllegalParam", "keys can not be null or empty!");
        }
    }

    @NonNull
    public ConfigCenterContext getConfigContext() {
        return this.d;
    }

    @Nullable
    public ConfigUpdateListener getConfigUpdateListener() {
        return this.f;
    }

    public long getLastNodesVersion() {
        return this.mCurrentNodeVersion;
    }

    public synchronized void initialize(@NonNull ConfigCenterContext configCenterContext) {
        initialize(configCenterContext, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0085, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void initialize(@androidx.annotation.NonNull com.alipay.plus.android.config.sdk.ConfigCenterContext r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.alipay.plus.android.config.sdk.ConfigMerger$Status r0 = r4.mStatus     // Catch:{ all -> 0x0086 }
            boolean r0 = r0.isInitializedOrShutdown()     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r4)
            return
        L_0x000b:
            android.content.Context r0 = r5.getContext()     // Catch:{ all -> 0x0086 }
            com.alipay.plus.android.config.sdk.delegate.ConfigMonitor r1 = r5.getConfigMonitor()     // Catch:{ all -> 0x0086 }
            java.lang.String r2 = "config_initialized"
            r3 = 0
            r1.behavior(r2, r3)     // Catch:{ all -> 0x0086 }
            com.alipay.plus.android.config.sdk.ConfigMerger$Status r1 = com.alipay.plus.android.config.sdk.ConfigMerger.Status.Initialized     // Catch:{ all -> 0x0086 }
            r4.mStatus = r1     // Catch:{ all -> 0x0086 }
            r4.d = r5     // Catch:{ all -> 0x0086 }
            com.alipay.plus.android.config.sdk.storage.a r5 = new com.alipay.plus.android.config.sdk.storage.a     // Catch:{ all -> 0x0086 }
            com.alipay.plus.android.config.sdk.ConfigCenterContext r1 = r4.d     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = r1.getEnvironment()     // Catch:{ all -> 0x0086 }
            r5.<init>(r0, r1)     // Catch:{ all -> 0x0086 }
            r4.c = r5     // Catch:{ all -> 0x0086 }
            long r1 = r5.e()     // Catch:{ all -> 0x0086 }
            r4.mLastRefreshTime = r1     // Catch:{ all -> 0x0086 }
            r4.a()     // Catch:{ all -> 0x0086 }
            com.alipay.plus.android.config.sdk.storage.a r5 = r4.c     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = r5.a()     // Catch:{ all -> 0x0086 }
            r4.initializeWithCache(r5)     // Catch:{ all -> 0x0086 }
            java.lang.String r5 = "amcs"
            com.alipay.plus.android.config.sdk.ConfigGetter r5 = r4.getSectionConfigGetter(r5)     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x004f
            java.lang.String r1 = "enableMainProcessCheck"
            r2 = 1
            boolean r5 = r5.getBoolConfig(r1, r2)     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x0055
        L_0x004f:
            boolean r5 = com.alipay.iap.android.common.utils.MiscUtils.isMainProcess(r0)     // Catch:{ all -> 0x0086 }
            r4.h = r5     // Catch:{ all -> 0x0086 }
        L_0x0055:
            java.lang.String r5 = f9507a     // Catch:{ all -> 0x0086 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0086 }
            java.lang.String r1 = "** ConfigCenter initialize. mainProcess = "
            r0.<init>(r1)     // Catch:{ all -> 0x0086 }
            boolean r1 = r4.h     // Catch:{ all -> 0x0086 }
            r0.append(r1)     // Catch:{ all -> 0x0086 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0086 }
            com.alipay.iap.android.common.log.LoggerWrapper.i(r5, r0)     // Catch:{ all -> 0x0086 }
            boolean r5 = r4.h     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x0084
            com.alipay.plus.android.config.sdk.storage.a r5 = r4.c     // Catch:{ all -> 0x0086 }
            com.alipay.plus.android.config.sdk.retry.DistributionNodesConfig r5 = r5.c()     // Catch:{ all -> 0x0086 }
            if (r5 == 0) goto L_0x007f
            long r0 = r5.configVersion     // Catch:{ all -> 0x0086 }
            r4.mCurrentNodeVersion = r0     // Catch:{ all -> 0x0086 }
            java.util.List<com.alipay.plus.android.config.sdk.retry.DistributionNode> r5 = r5.distributionNodes     // Catch:{ all -> 0x0086 }
            r4.a(r5)     // Catch:{ all -> 0x0086 }
        L_0x007f:
            if (r6 == 0) goto L_0x0084
            r4.b()     // Catch:{ all -> 0x0086 }
        L_0x0084:
            monitor-exit(r4)
            return
        L_0x0086:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.plus.android.config.sdk.ConfigCenter.initialize(com.alipay.plus.android.config.sdk.ConfigCenterContext, boolean):void");
    }

    public void onFetchByKeysSuccess(@NonNull AmcsConfigRpcResult amcsConfigRpcResult) {
        a(0, parseFetchedConfigs(amcsConfigRpcResult.deleteKeys, amcsConfigRpcResult.updateKeys), amcsConfigRpcResult.updateKeyDetails);
        LoggerWrapper.i(f9507a, "onFetchByKeysSuccess: handle completed!");
    }

    public void onFetchFailed(String str, String str2) {
        LoggerWrapper.e(f9507a, String.format("Cannot fetch config! errorCode = %s, errorMessage = %s.", new Object[]{str, str2}));
        e();
        if (isShutdown()) {
            LoggerWrapper.d(f9507a, "ConfigCenter already shutdown. will not handle this failure.");
            return;
        }
        ConfigUpdateListener configUpdateListener = this.f;
        if (configUpdateListener != null) {
            configUpdateListener.onConfigUpdateFailed(str, str2);
        }
    }

    public void onFetchSuccess(@NonNull AmcsConfigRpcResult amcsConfigRpcResult, String str) {
        long parseLong = ConfigUtils.parseLong(amcsConfigRpcResult.responseTime, System.currentTimeMillis());
        c cVar = this.g;
        this.d.getConfigMonitor().behavior("config_total_update_success", KVBuilder.newBuilder().put("version", Long.valueOf(parseLong)).put("retryCount", Integer.valueOf(cVar != null ? cVar.a() : 0)).build());
        e();
        if (isShutdown()) {
            LoggerWrapper.d(f9507a, "ConfigCenter already shutdown. will not handle this success.");
            return;
        }
        LoggerWrapper.i(f9507a, String.format("onFetchSuccess: responseTime = %s, mCurrentConfigVersion = %s.", new Object[]{ConfigUtils.formatConfigVersionWithTime(parseLong), ConfigUtils.formatConfigVersionWithTime(this.mCurrentConfigVersion)}));
        if (!TextUtils.equals(this.c.d(), str)) {
            LoggerWrapper.i(f9507a, "onFetchSuccess: getLastRemergeFactor is true or is not last success node, will not check version.");
        } else if (parseLong <= this.mCurrentConfigVersion) {
            LoggerWrapper.i(f9507a, "onFetchSuccess: Response version less current local version, will skip.");
            return;
        }
        this.c.b(str);
        long j = this.mCurrentConfigVersion;
        setLastUpdateVersion(parseLong);
        a(j, parseFetchedConfigs(amcsConfigRpcResult.deleteKeys, amcsConfigRpcResult.updateKeys), amcsConfigRpcResult.updateKeyDetails);
        LoggerWrapper.i(f9507a, "onFetchSuccess: handle completed!");
        ConfigUpdateListener configUpdateListener = this.f;
        if (configUpdateListener != null) {
            configUpdateListener.onConfigUpdateSuccess(this.mCurrentConfigVersion);
        }
    }

    public void refreshByKeys(@NonNull String str, @NonNull List<String> list, @Nullable ConfigNotifyCallback configNotifyCallback) {
        LoggerWrapper.d(f9507a, "will refreshByKeys...");
        if (!isInitialized()) {
            LoggerWrapper.d(f9507a, "ConfigCenter have not initialized. will not fetch the config.");
        } else if (!this.h) {
            LoggerWrapper.w(f9507a, "Cannot refresh config in sub-process!");
        } else if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(".");
                    sb.append(next);
                    next = sb.toString();
                }
                arrayList.add(next);
            }
            LoggerWrapper.d(f9507a, "start fetch by keys.");
            a(arrayList, configNotifyCallback);
        } else if (configNotifyCallback != null) {
            configNotifyCallback.onFetchFailed("IllegalParam", "keys can not be null or empty!");
        }
    }

    public void refreshByKeys(@NonNull List<String> list, @Nullable ConfigNotifyCallback configNotifyCallback) {
        refreshByKeys("", list, configNotifyCallback);
    }

    public void refreshConfig() {
        LoggerWrapper.d(f9507a, "will refreshConfig...");
        if (!isInitialized()) {
            LoggerWrapper.d(f9507a, "ConfigCenter have not initialized. will not fetch the config.");
        } else if (!this.h) {
            LoggerWrapper.w(f9507a, "Cannot refresh config in sub-process!");
        } else {
            e();
            this.d.getConfigMonitor().behavior("config_total_update_start", (Map<String, String>) null);
            LoggerWrapper.d(f9507a, "start fetchConfigInternal.");
            d();
        }
    }

    public void saveCdnBackupConfig(@NonNull DistributionNodesConfig distributionNodesConfig) {
        if (this.c == null) {
            LoggerWrapper.e(f9507a, "ConfigCenter not initialized. cannot save CDN backupConfig!");
        } else if (distributionNodesConfig.distributionNodes == null) {
            LoggerWrapper.e(f9507a, "distributionNodes is null, will not save!");
        } else {
            this.c.a(distributionNodesConfig);
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public void saveConfigInternal(@NonNull String str) {
        if (!isInitialized()) {
            LoggerWrapper.e(f9507a, "saveConfigInternal. You need invoke initialize(ctx) firstly!");
            return;
        }
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(str);
        }
    }

    public void setConfigUpdateListener(@Nullable ConfigUpdateListener configUpdateListener) {
        this.f = configUpdateListener;
    }

    public void startConfigUpdateTrigger() {
        if (!isInitialized()) {
            LoggerWrapper.e(f9507a, "startConfigUpdateTrigger. You need invoke initialize(ctx) firstly!");
        } else if (!this.h) {
            LoggerWrapper.w(f9507a, "Cannot start sync trigger in sub-process!");
        } else {
            ConfigUpdateTrigger configUpdateTrigger = this.d.getConfigUpdateTrigger();
            if (configUpdateTrigger != null) {
                configUpdateTrigger.startTrigger(this.d);
            }
        }
    }

    public void switchEnvironment(@NonNull String str) {
        if (!isInitialized()) {
            LoggerWrapper.e(f9507a, "switchEnvironment. You need invoke initialize(ctx) firstly!");
            return;
        }
        this.d.setEnvironment(str);
        a aVar = new a(this.d.getContext(), str);
        this.c = aVar;
        this.mLastRefreshTime = aVar.e();
        initializeWithCache(this.c.a());
    }

    public void updateAndSaveDistributionNodes(@NonNull DistributionNodesConfig distributionNodesConfig) {
        if (this.c == null) {
            LoggerWrapper.e(f9507a, "ConfigCenter not initialized. cannot save distributionNodesConfig!");
        } else if (this.mCurrentNodeVersion > distributionNodesConfig.configVersion) {
            LoggerWrapper.e(f9507a, "Current node config is latest. abort saving distributionNodesConfig!");
        } else {
            this.mCurrentNodeVersion = distributionNodesConfig.configVersion;
            a(distributionNodesConfig.distributionNodes);
            this.c.b(distributionNodesConfig);
        }
    }
}
