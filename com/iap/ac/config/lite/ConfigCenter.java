package com.iap.ac.config.lite;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.alipay.imobile.network.quake.transport.http.constant.HeaderConstant;
import com.iap.ac.android.common.account.ACUserInfoManager;
import com.iap.ac.android.common.instance.IInstanceInfo;
import com.iap.ac.android.common.instance.InstanceInfo;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RPCProxyHost;
import com.iap.ac.android.common.rpc.RpcAppInfo;
import com.iap.ac.android.instance.IAPInstanceInfo;
import com.iap.ac.android.rpc.RpcProxyImpl;
import com.iap.ac.android.rpc.multigateway.RpcGatewayController;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.ConfigMerger;
import com.iap.ac.config.lite.c.e;
import com.iap.ac.config.lite.common.AmcsConstants;
import com.iap.ac.config.lite.common.KVBuilder;
import com.iap.ac.config.lite.f.a;
import com.iap.ac.config.lite.facade.result.AmcsConfigKeyDetails;
import com.iap.ac.config.lite.facade.result.AmcsConfigRpcResult;
import com.iap.ac.config.lite.fetcher.ConfigFetchCallback;
import com.iap.ac.config.lite.fetcher.ConfigNotifyCallback;
import com.iap.ac.config.lite.listener.ConfigInitializeListener;
import com.iap.ac.config.lite.listener.ConfigUpdateListener;
import com.iap.ac.config.lite.preset.PresetConfig;
import com.iap.ac.config.lite.preset.PresetParser;
import com.iap.ac.config.lite.rpc.AmcsRpcUtils;
import com.iap.ac.config.lite.utils.ConfigUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConfigCenter extends ConfigMerger implements ConfigFetchCallback, a.C0034a {
    private static final String q = e.b(com.alipay.zoloz.config.ConfigCenter.TAG);
    private static final ConcurrentHashMap<String, ConfigCenter> r = new ConcurrentHashMap<>();
    private com.iap.ac.config.lite.storage.a g;
    private ConfigCenterContext h;
    @Nullable
    private ConfigUpdateListener i;
    /* access modifiers changed from: private */
    public List<ConfigInitializeListener> j;
    @Nullable
    private com.iap.ac.config.lite.d.c k;
    @Nullable
    private com.iap.ac.config.lite.e.a l;
    private boolean m;
    protected long mLastRefreshTime;
    private final String n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9120o;
    private Map<String, Object> p;

    static class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final ConfigCenter f9787a = new ConfigCenter();
    }

    class a implements IInstanceInfo {
        a(ConfigCenter configCenter) {
        }

        public String getInstanceId(@NonNull Context context) {
            return IAPInstanceInfo.instanceId(context);
        }

        public String getTid(@NonNull Context context) {
            return IAPInstanceInfo.tid(context);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ConfigCenterContext f11068a;
        final /* synthetic */ boolean b;

        b(ConfigCenterContext configCenterContext, boolean z) {
            this.f11068a = configCenterContext;
            this.b = z;
        }

        public void run() {
            ConfigCenter.this.initialize(this.f11068a, this.b);
            for (ConfigInitializeListener onResult : ConfigCenter.this.j) {
                onResult.onResult(true);
            }
        }
    }

    protected ConfigCenter() {
        this((String) null);
    }

    private void a(Context context, RpcAppInfo rpcAppInfo, String str) {
        if (TextUtils.isEmpty(str)) {
            RpcProxyImpl instance = RpcProxyImpl.getInstance(AmcsConstants.BIZ_CODE_AMCSLITE_FOR_MULTI_INSTANCE);
            instance.initialize(context, rpcAppInfo);
            RPCProxyHost.setRpcProxy(instance, AmcsConstants.BIZ_CODE_AMCSLITE_FOR_MULTI_INSTANCE);
            RpcGatewayController.initGatewayController(context, AmcsConstants.BIZ_CODE_AMCSLITE_FOR_MULTI_INSTANCE);
        }
    }

    private void b(Map<String, Object> map) {
        com.iap.ac.config.lite.d.a a2 = com.iap.ac.config.lite.d.a.a(this.h, getLastUpdateVersion(), this.g.e(), map, this);
        this.k = a2;
        a2.i();
    }

    private void c() {
        long currentTimeMillis = System.currentTimeMillis();
        this.mLastRefreshTime = currentTimeMillis;
        this.g.a(currentTimeMillis);
    }

    @NonNull
    public static ConfigCenter getInstance() {
        return getInstance((String) null);
    }

    public void addConfigInitializeListener(@Nullable ConfigInitializeListener configInitializeListener) {
        if (configInitializeListener != null) {
            this.j.add(configInitializeListener);
            if (isInitialized()) {
                configInitializeListener.onResult(true);
            }
        }
    }

    @NonNull
    public ConfigCenterContext getConfigContext() {
        return this.h;
    }

    @Nullable
    public ConfigUpdateListener getConfigUpdateListener() {
        return this.i;
    }

    public synchronized void initialize(@NonNull Context context, @NonNull String str) {
        initialize(context, str, false);
    }

    public void initializeAsync(@NonNull ConfigCenterContext configCenterContext) {
        initializeAsync(configCenterContext, false);
    }

    public boolean newerThanLocalVersion(long j2) {
        return j2 > getLastUpdateVersion();
    }

    public void onFetchByKeysSuccess(@NonNull AmcsConfigRpcResult amcsConfigRpcResult) {
        a(0, parseFetchedConfigs(amcsConfigRpcResult.deleteKeys, amcsConfigRpcResult.updateKeys), amcsConfigRpcResult.updateKeyDetails);
        ACLog.i(q, "onFetchByKeysSuccess: handle completed!");
    }

    public void onFetchFailed(String str, String str2) {
        ACLog.e(q, String.format("Cannot fetch config! errorCode = %s, errorMessage = %s.", new Object[]{str, str2}));
        this.h.getConfigMonitor().behavior("config_total_update_start", KVBuilder.newBuilder().put("isCDN", Boolean.valueOf(e.a(this))).build());
        b();
        if (isShutdown()) {
            ACLog.d(q, "ConfigCenter already shutdown. will not handle this failure.");
            return;
        }
        ConfigUpdateListener configUpdateListener = this.i;
        if (configUpdateListener != null) {
            configUpdateListener.onConfigUpdateFailed(str, str2);
        }
    }

    public void onFetchSuccess(@NonNull AmcsConfigRpcResult amcsConfigRpcResult, String str) {
        long parseLong = ConfigUtils.parseLong(amcsConfigRpcResult.responseTime, System.currentTimeMillis());
        this.h.getConfigMonitor().behavior("config_total_update_start", KVBuilder.newBuilder().put("isCDN", Boolean.valueOf(e.a(this))).build());
        com.iap.ac.config.lite.d.c cVar = this.k;
        this.h.getConfigMonitor().behavior("config_total_update_success", KVBuilder.newBuilder().put("version", Long.valueOf(parseLong)).put("retryCount", Integer.valueOf(cVar != null ? cVar.b() : 0)).put("isCDN", Boolean.valueOf(e.a(this))).build());
        b();
        if (isShutdown()) {
            ACLog.d(q, "ConfigCenter already shutdown. will not handle this success.");
            return;
        }
        ACLog.i(q, String.format("onFetchSuccess: responseTime = %s, mCurrentConfigVersion = %s.", new Object[]{ConfigUtils.formatConfigVersionWithTime(parseLong), ConfigUtils.formatConfigVersionWithTime(this.mCurrentConfigVersion)}));
        if (!TextUtils.equals(this.g.e(), str)) {
            ACLog.i(q, "onFetchSuccess: getLastRemergeFactor is true or is not last success node, will not check version.");
        } else if (parseLong <= this.mCurrentConfigVersion) {
            ACLog.i(q, "onFetchSuccess: Response version less current local version, will skip.");
            return;
        }
        this.g.e(str);
        long j2 = this.mCurrentConfigVersion;
        setLastUpdateVersion(parseLong);
        a(j2, parseFetchedConfigs(amcsConfigRpcResult.deleteKeys, amcsConfigRpcResult.updateKeys), amcsConfigRpcResult.updateKeyDetails);
        ACLog.i(q, "onFetchSuccess: handle completed!");
        ConfigUpdateListener configUpdateListener = this.i;
        if (configUpdateListener != null) {
            configUpdateListener.onConfigUpdateSuccess(this.mCurrentConfigVersion);
        }
    }

    public void refreshByKeys(@NonNull List<String> list, @Nullable ConfigNotifyCallback configNotifyCallback) {
        refreshByKeys("", list, configNotifyCallback);
    }

    public void refreshConfig() {
        refreshConfig((Map<String, Object>) null);
    }

    public void refreshConfigWithFrequenceLimit(@Nullable Map<String, Object> map) {
        if (c(map)) {
            c();
            refreshConfig(map);
        }
    }

    /* access modifiers changed from: protected */
    @WorkerThread
    public void saveConfigInternal(@NonNull String str) {
        if (!isInitialized()) {
            ACLog.e(q, "saveConfigInternal. You need invoke initialize(ctx) firstly!");
            return;
        }
        com.iap.ac.config.lite.storage.a aVar = this.g;
        if (aVar != null) {
            aVar.c(str);
        }
    }

    public void setConfigUpdateListener(@Nullable ConfigUpdateListener configUpdateListener) {
        this.i = configUpdateListener;
    }

    public void startConfigPolling() {
        com.iap.ac.config.lite.e.a aVar = this.l;
        if (aVar == null || aVar.isCanceled()) {
            this.l = com.iap.ac.config.lite.e.a.a(getConfigContext());
        }
        com.iap.ac.config.lite.e.a aVar2 = this.l;
        if (aVar2 != null && !aVar2.d()) {
            this.l.h();
        }
    }

    public void stopConfigPolling() {
        com.iap.ac.config.lite.e.a aVar = this.l;
        if (aVar != null && !aVar.isCanceled()) {
            this.l.cancel();
        }
    }

    public void switchEnvironment(@NonNull String str) {
        if (!isInitialized()) {
            ACLog.e(q, "switchEnvironment. You need invoke initialize(ctx) firstly!");
            return;
        }
        this.h.setEnvironment(str);
        com.iap.ac.config.lite.storage.a aVar = new com.iap.ac.config.lite.storage.a(this.h.getContext(), str, this.h.getBizCode());
        this.g = aVar;
        this.mLastRefreshTime = aVar.d();
        initializeWithCache(this.g.g());
    }

    protected ConfigCenter(String str) {
        this.mLastRefreshTime = 0;
        this.j = new ArrayList();
        this.m = true;
        this.f9120o = false;
        this.p = new HashMap();
        this.n = str;
    }

    @NonNull
    public static ConfigCenter getInstance(String str) {
        if (TextUtils.isEmpty(str)) {
            return c.f9787a;
        }
        if (r.get(str) == null) {
            synchronized (ConfigCenter.class) {
                if (r.get(str) == null) {
                    r.put(str, new ConfigCenter(str));
                }
            }
        }
        return r.get(str);
    }

    public synchronized void initialize(@NonNull Context context, @NonNull String str, boolean z) {
        if (!this.mStatus.isInitializedOrShutdown()) {
            PresetConfig.SiteConfig siteConfig = PresetParser.getSiteConfig(context, str, this.n);
            RpcAppInfo rpcAppInfo = new RpcAppInfo();
            rpcAppInfo.rpcGateWayUrl = siteConfig.amcsGatewayUrl;
            rpcAppInfo.appId = siteConfig.gatewayAppId;
            rpcAppInfo.addHeader(HeaderConstant.HEADER_KEY_WORKSPACE_ID, siteConfig.gatewayWorkspaceId);
            rpcAppInfo.authCode = siteConfig.authCode;
            a();
            a(context, rpcAppInfo, this.n);
            ConfigCenterContext configCenterContext = new ConfigCenterContext(context, rpcAppInfo, str, (String) null, siteConfig.workspaceId, siteConfig.appId, this.n);
            a(configCenterContext, siteConfig.androidProductId, siteConfig.logGatewayUrl, this.n);
            if (!TextUtils.isEmpty(this.n)) {
                AmcsRpcUtils.initializeRpcGateway(RpcGatewayController.getGatewayController(this.n), configCenterContext.getRpcProfile(), str);
            } else if (RPCProxyHost.isRpcProxyExist(AmcsConstants.BIZ_CODE_AMCSLITE_FOR_MULTI_INSTANCE)) {
                AmcsRpcUtils.initializeRpcGateway(RpcGatewayController.getGatewayController(AmcsConstants.BIZ_CODE_AMCSLITE_FOR_MULTI_INSTANCE), configCenterContext.getRpcProfile(), str);
            } else {
                AmcsRpcUtils.initializeRpcGateway(RpcGatewayController.getGatewayController(), configCenterContext.getRpcProfile(), str);
            }
            configCenterContext.setDnsServer("223.5.5.5");
            if (siteConfig.schemeVersion == 1) {
                configCenterContext.setVersion(ConfigCenterContext.SchemeVersion.V1);
            }
            initialize(configCenterContext, z);
            ConfigUtils.setConfigProxy(this.n);
        }
    }

    public void initializeAsync(@NonNull ConfigCenterContext configCenterContext, boolean z) {
        ConfigUtils.doAsyncTask(new b(configCenterContext, z));
    }

    public void refreshByKeys(@NonNull String str, @NonNull List<String> list, @Nullable ConfigNotifyCallback configNotifyCallback) {
        refreshByKeys(str, list, (Map<String, Object>) null, configNotifyCallback, true);
    }

    public synchronized void refreshConfig(@Nullable Map<String, Object> map) {
        ACLog.d(q, "will refreshConfig...");
        if (!isInitialized()) {
            ACLog.d(q, "ConfigCenter have not initialized. will not fetch the config.");
        } else if (!this.m) {
            ACLog.w(q, "Cannot refresh config in sub-process!");
        } else {
            this.f9120o = true;
            b();
            if (map != null) {
                this.p.putAll(map);
                this.g.d(JsonUtils.toJson(this.p));
            }
            ACLog.d(q, "start fetchConfigInternal.");
            b(this.p);
        }
    }

    private boolean c(@Nullable Map<String, Object> map) {
        long currentTimeMillis = System.currentTimeMillis() - this.mLastRefreshTime;
        ConfigGetter sectionConfigGetter = getSectionConfigGetter("amcs");
        long j2 = 300000;
        if (sectionConfigGetter != null) {
            j2 = sectionConfigGetter.getLongConfig("refreshGapKey", 300000);
        }
        return currentTimeMillis > j2 || a(map);
    }

    public void refreshByKeys(@NonNull List<String> list, @Nullable Map<String, Object> map, @Nullable ConfigNotifyCallback configNotifyCallback, boolean z) {
        refreshByKeys("", list, map, configNotifyCallback, z);
    }

    public void refreshByKeys(@NonNull String str, @NonNull List<String> list, @Nullable Map<String, Object> map, @Nullable ConfigNotifyCallback configNotifyCallback, boolean z) {
        ACLog.d(q, "will refreshByKeys...");
        if (!isInitialized()) {
            if (configNotifyCallback != null) {
                configNotifyCallback.onFetchFailed("IllegalStatus", "SDK not initialized");
            }
            ACLog.d(q, "ConfigCenter have not initialized. will not fetch the config.");
        } else if (list != null && !list.isEmpty()) {
            if (!this.f9120o) {
                refreshConfigWithFrequenceLimit((Map<String, Object>) null);
            }
            ArrayList arrayList = new ArrayList();
            for (String next : list) {
                if (!TextUtils.isEmpty(str)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(".");
                    sb.append(next);
                    arrayList.add(sb.toString());
                } else {
                    arrayList.add(next);
                }
            }
            this.h.getConfigMonitor().behavior("config_by_keys_update_start", KVBuilder.newBuilder().put("keys", JsonUtils.toJson(list)).put("isCDN", Boolean.valueOf(e.a(this))).build());
            ACLog.d(q, "start fetch by keys.");
            com.iap.ac.config.lite.d.b.a(this.h, list, map, this, z, configNotifyCallback).i();
        } else if (configNotifyCallback != null) {
            configNotifyCallback.onFetchFailed("IllegalParam", "keys can not be null or empty!");
        }
    }

    private void b() {
        com.iap.ac.config.lite.d.c cVar = this.k;
        if (cVar != null) {
            cVar.cancel();
            this.k = null;
        }
    }

    private void a(ConfigCenterContext configCenterContext, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str3)) {
            ACUserInfoManager.setUserInfoManager(new com.iap.ac.config.lite.g.a(configCenterContext), AmcsConstants.BIZ_CODE_AMCSLITE_FOR_MULTI_INSTANCE);
            com.iap.ac.config.lite.g.b.b().a(configCenterContext.getContext(), str, str2);
        }
    }

    private void a() {
        if (e.a("com.iap.ac.android.instance.IAPInstanceInfo") && InstanceInfo.getInstanceInfoImpl() == null) {
            InstanceInfo.setInstanceInfoImpl(new a(this));
        }
    }

    private boolean a(@Nullable Map<String, Object> map) {
        if (map == null) {
            return false;
        }
        try {
            Map<String, Object> map2 = this.p;
            HashMap hashMap = new HashMap(map2);
            hashMap.putAll(map);
            return !map2.equals(hashMap);
        } catch (Exception e) {
            ACLog.e(q, "isAttributeChanged : ".concat(String.valueOf(e)));
            return false;
        }
    }

    private void a(long j2, @Nullable ConfigMerger.MergeChangeResult mergeChangeResult, @Nullable Map<String, AmcsConfigKeyDetails> map) {
        if (map == null || map.isEmpty()) {
            ACLog.i(q, "handleMergedResults: updateKeyDetails is empty.");
        } else if (mergeChangeResult == null || (mergeChangeResult.changedList.isEmpty() && mergeChangeResult.valueNotChangedList.isEmpty())) {
            ACLog.i(q, "handleMergedResults: changeResult has no changes.");
        } else {
            HashMap hashMap = new HashMap();
            for (com.iap.ac.config.lite.c.a next : mergeChangeResult.changedList) {
                HashSet<String> hashSet = new HashSet<>();
                hashSet.addAll(next.f9796a.addedKeys);
                hashSet.addAll(next.f9796a.modifiedKeys);
                for (String str : hashSet) {
                    if (next.c) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(next.b);
                        sb.append(".");
                        sb.append(str);
                        str = sb.toString();
                    }
                    AmcsConfigKeyDetails amcsConfigKeyDetails = map.get(str);
                    if (amcsConfigKeyDetails != null && ConfigUtils.parseLong(amcsConfigKeyDetails.version, 0) > 0) {
                        hashMap.put(str, amcsConfigKeyDetails.version);
                    }
                }
            }
            for (String next2 : mergeChangeResult.valueNotChangedList) {
                AmcsConfigKeyDetails amcsConfigKeyDetails2 = map.get(next2);
                if (amcsConfigKeyDetails2 != null) {
                    long parseLong = ConfigUtils.parseLong(amcsConfigKeyDetails2.version, 0);
                    if (parseLong > 0 && parseLong > j2) {
                        hashMap.put(next2, amcsConfigKeyDetails2.version);
                    }
                }
            }
            if (hashMap.isEmpty()) {
                ACLog.i(q, "handleMergedResults: extras is empty.");
            } else {
                this.h.getConfigMonitor().behavior("config_merge_result", hashMap);
            }
        }
    }

    public synchronized void initialize(@NonNull ConfigCenterContext configCenterContext) {
        initialize(configCenterContext, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void initialize(@androidx.annotation.NonNull com.iap.ac.config.lite.ConfigCenterContext r5, boolean r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.iap.ac.config.lite.ConfigMerger$Status r0 = r4.mStatus     // Catch:{ all -> 0x00d2 }
            boolean r0 = r0.isInitializedOrShutdown()     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x000b
            monitor-exit(r4)
            return
        L_0x000b:
            java.lang.String r0 = r4.n     // Catch:{ all -> 0x00d2 }
            r5.setBizCode(r0)     // Catch:{ all -> 0x00d2 }
            android.content.Context r0 = r5.getContext()     // Catch:{ all -> 0x00d2 }
            com.iap.ac.config.lite.delegate.ConfigMonitor r1 = r5.getConfigMonitor()     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = "config_initialized"
            r3 = 0
            r1.behavior(r2, r3)     // Catch:{ all -> 0x00d2 }
            r4.h = r5     // Catch:{ all -> 0x00d2 }
            com.iap.ac.config.lite.storage.a r5 = new com.iap.ac.config.lite.storage.a     // Catch:{ all -> 0x00d2 }
            com.iap.ac.config.lite.ConfigCenterContext r1 = r4.h     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = r1.getEnvironment()     // Catch:{ all -> 0x00d2 }
            com.iap.ac.config.lite.ConfigCenterContext r2 = r4.h     // Catch:{ all -> 0x00d2 }
            java.lang.String r2 = r2.getBizCode()     // Catch:{ all -> 0x00d2 }
            r5.<init>(r0, r1, r2)     // Catch:{ all -> 0x00d2 }
            r4.g = r5     // Catch:{ all -> 0x00d2 }
            com.iap.ac.config.lite.ConfigCenterContext r1 = r4.h     // Catch:{ all -> 0x00d2 }
            r1.setConfigStorage(r5)     // Catch:{ all -> 0x00d2 }
            com.iap.ac.config.lite.storage.a r5 = r4.g     // Catch:{ all -> 0x00d2 }
            long r1 = r5.d()     // Catch:{ all -> 0x00d2 }
            r4.mLastRefreshTime = r1     // Catch:{ all -> 0x00d2 }
            com.iap.ac.config.lite.ConfigCenterContext r5 = r4.h     // Catch:{ all -> 0x00d2 }
            com.iap.ac.config.lite.e.a r5 = com.iap.ac.config.lite.e.a.a((com.iap.ac.config.lite.ConfigCenterContext) r5)     // Catch:{ all -> 0x00d2 }
            r4.l = r5     // Catch:{ all -> 0x00d2 }
            com.iap.ac.config.lite.storage.a r5 = r4.g     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = r5.g()     // Catch:{ all -> 0x00d2 }
            r4.initializeWithCache(r5)     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = "amcs"
            com.iap.ac.config.lite.ConfigGetter r5 = r4.getSectionConfigGetter(r5)     // Catch:{ all -> 0x00d2 }
            if (r5 == 0) goto L_0x0062
            java.lang.String r1 = "enableMainProcessCheck"
            r2 = 1
            boolean r5 = r5.getBoolConfig(r1, r2)     // Catch:{ all -> 0x00d2 }
            if (r5 == 0) goto L_0x0068
        L_0x0062:
            boolean r5 = com.iap.ac.android.common.utils.MiscUtils.isMainProcess(r0)     // Catch:{ all -> 0x00d2 }
            r4.m = r5     // Catch:{ all -> 0x00d2 }
        L_0x0068:
            com.iap.ac.config.lite.storage.a r5 = r4.g     // Catch:{ Exception -> 0x007b }
            java.lang.String r5 = r5.f()     // Catch:{ Exception -> 0x007b }
            java.lang.Class<java.util.Map> r0 = java.util.Map.class
            java.lang.Object r5 = com.iap.ac.android.common.json.JsonUtils.fromJson((java.lang.String) r5, r0)     // Catch:{ Exception -> 0x007b }
            java.util.Map r5 = (java.util.Map) r5     // Catch:{ Exception -> 0x007b }
            if (r5 == 0) goto L_0x008b
            r4.p = r5     // Catch:{ Exception -> 0x007b }
            goto L_0x008b
        L_0x007b:
            r5 = move-exception
            java.lang.String r0 = q     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "mixAttribute fromJson : "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x00d2 }
            java.lang.String r5 = r1.concat(r5)     // Catch:{ all -> 0x00d2 }
            com.iap.ac.android.common.log.ACLog.e(r0, r5)     // Catch:{ all -> 0x00d2 }
        L_0x008b:
            java.lang.String r5 = q     // Catch:{ all -> 0x00d2 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = "** ConfigCenter initialize. mainProcess = "
            r0.<init>(r1)     // Catch:{ all -> 0x00d2 }
            boolean r1 = r4.m     // Catch:{ all -> 0x00d2 }
            r0.append(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = " with bizCode = "
            r0.append(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r1 = r4.n     // Catch:{ all -> 0x00d2 }
            r0.append(r1)     // Catch:{ all -> 0x00d2 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00d2 }
            com.iap.ac.android.common.log.ACLog.i(r5, r0)     // Catch:{ all -> 0x00d2 }
            com.iap.ac.config.lite.ConfigMerger$Status r5 = com.iap.ac.config.lite.ConfigMerger.Status.INITIALIZED     // Catch:{ all -> 0x00d2 }
            r4.mStatus = r5     // Catch:{ all -> 0x00d2 }
            boolean r5 = r4.m     // Catch:{ all -> 0x00d2 }
            if (r5 == 0) goto L_0x00d0
            if (r6 == 0) goto L_0x00b7
            r4.refreshConfigWithFrequenceLimit(r3)     // Catch:{ all -> 0x00d2 }
        L_0x00b7:
            com.iap.ac.config.lite.e.a r5 = r4.l     // Catch:{ all -> 0x00d2 }
            if (r5 == 0) goto L_0x00c6
            boolean r5 = r5.k()     // Catch:{ all -> 0x00d2 }
            if (r5 == 0) goto L_0x00c6
            com.iap.ac.config.lite.e.a r5 = r4.l     // Catch:{ all -> 0x00d2 }
            r5.h()     // Catch:{ all -> 0x00d2 }
        L_0x00c6:
            com.iap.ac.config.lite.f.a r5 = new com.iap.ac.config.lite.f.a     // Catch:{ all -> 0x00d2 }
            r5.<init>(r4)     // Catch:{ all -> 0x00d2 }
            java.lang.String r6 = "amcs"
            r4.addSectionConfigListener(r6, r5)     // Catch:{ all -> 0x00d2 }
        L_0x00d0:
            monitor-exit(r4)
            return
        L_0x00d2:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.config.lite.ConfigCenter.initialize(com.iap.ac.config.lite.ConfigCenterContext, boolean):void");
    }
}
