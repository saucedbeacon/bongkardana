package com.alipay.plus.android.config.sdk.retry;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.alibaba.fastjson.JSONObject;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.syncintegration.lifecycle.LifecycleWatcher;
import com.alipay.iap.android.common.utils.NetworkUtils;
import com.alipay.plus.android.config.sdk.ConfigCenter;
import com.alipay.plus.android.config.sdk.ConfigCenterContext;
import com.alipay.plus.android.config.sdk.ConfigGetter;
import com.alipay.plus.android.config.sdk.a.e;
import com.alipay.plus.android.config.sdk.common.ICancelableTask;
import com.alipay.plus.android.config.sdk.common.KVBuilder;
import com.alipay.plus.android.config.sdk.facade.result.AmcsConfigRpcResult;
import com.alipay.plus.android.config.sdk.fetcher.ConfigFetchCallback;
import com.alipay.plus.android.config.sdk.fetcher.ConfigNotifyCallback;
import com.alipay.plus.android.config.sdk.fetcher.FetchException;
import com.alipay.plus.android.config.sdk.fetcher.a.d;
import com.alipay.plus.android.config.sdk.retry.DistributionNode;
import com.alipay.plus.android.config.sdk.rpc.AmcsRpcUtils;
import com.alipay.plus.android.config.sdk.utils.ConfigUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class c implements ICancelableTask {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f10749a = e.a("FetchScheduler");
    private static boolean e = true;
    @NonNull
    private a b;
    private List<String> c;
    @Nullable
    private ConfigNotifyCallback d;
    private int f = 0;
    private int g = 0;
    /* access modifiers changed from: private */
    public int h = 0;
    private long i;
    @NonNull
    private final Handler j;
    @NonNull
    private final Handler k;
    @NonNull
    private final AtomicBoolean l = new AtomicBoolean(false);
    @NonNull
    private final ConfigCenterContext m;
    @Nullable
    private final List<DistributionNode> n;
    @Nullable

    /* renamed from: o  reason: collision with root package name */
    private List<DistributionNode> f10750o;
    @NonNull
    private final ConfigFetchCallback p;
    @NonNull
    private List<b> q;
    /* access modifiers changed from: private */
    @Nullable
    public LifecycleWatcher r;
    @Nullable
    private NetworkUtils.NetworkStateListener s;
    @Nullable
    private String t;
    @NonNull
    private final List<DistributionNode> u = new ArrayList();

    /* renamed from: com.alipay.plus.android.config.sdk.retry.c$7  reason: invalid class name */
    static /* synthetic */ class AnonymousClass7 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10758a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.alipay.plus.android.config.sdk.retry.c$a[] r0 = com.alipay.plus.android.config.sdk.retry.c.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10758a = r0
                com.alipay.plus.android.config.sdk.retry.c$a r1 = com.alipay.plus.android.config.sdk.retry.c.a.BY_KEYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10758a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alipay.plus.android.config.sdk.retry.c$a r1 = com.alipay.plus.android.config.sdk.retry.c.a.ALL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.plus.android.config.sdk.retry.c.AnonymousClass7.<clinit>():void");
        }
    }

    public enum a {
        ALL,
        BY_KEYS
    }

    static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public long f10759a;
        /* access modifiers changed from: private */
        @NonNull
        public com.alipay.plus.android.config.sdk.fetcher.a.a b;

        private b(@NonNull com.alipay.plus.android.config.sdk.fetcher.a.a aVar, long j) {
            this.b = aVar;
            this.f10759a = j;
        }

        @NonNull
        public String a() {
            return this.b.a();
        }

        public String toString() {
            return String.format("%s - delay %s ms", new Object[]{this.b, Long.valueOf(this.f10759a)});
        }
    }

    private c(@NonNull ConfigCenterContext configCenterContext, @Nullable List<DistributionNode> list, @NonNull ConfigFetchCallback configFetchCallback) {
        this.m = configCenterContext;
        this.n = list;
        this.p = configFetchCallback;
        HandlerThread handlerThread = new HandlerThread("ConfigFetchScheduler-Thread");
        handlerThread.start();
        this.j = new Handler(handlerThread.getLooper());
        this.k = new Handler(Looper.getMainLooper());
    }

    private static long a(boolean z) {
        long j2;
        long j3;
        double random = Math.random();
        if (z) {
            j2 = (long) (random * 3000.0d);
            j3 = 5000;
        } else {
            j2 = (long) (random * 45000.0d);
            j3 = 45000;
        }
        return j2 + j3;
    }

    @NonNull
    public static c a(@NonNull ConfigCenterContext configCenterContext, long j2, @Nullable List<DistributionNode> list, @Nullable List<DistributionNode> list2, @Nullable String str, @NonNull ConfigFetchCallback configFetchCallback) {
        c cVar = new c(configCenterContext, list, configFetchCallback);
        cVar.a(list2, str, j2);
        a(cVar.q);
        return cVar;
    }

    @NonNull
    public static c a(@NonNull ConfigCenterContext configCenterContext, @Nullable List<DistributionNode> list, @NonNull List<String> list2, @NonNull ConfigFetchCallback configFetchCallback, @NonNull ConfigNotifyCallback configNotifyCallback) {
        c cVar = new c(configCenterContext, list, configFetchCallback);
        cVar.a(list2, configNotifyCallback);
        a(cVar.q);
        return cVar;
    }

    private Map<String, Object> a(AmcsConfigRpcResult amcsConfigRpcResult) {
        Object obj;
        if (amcsConfigRpcResult == null || amcsConfigRpcResult.updateKeys == null || amcsConfigRpcResult.updateKeys.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String next : amcsConfigRpcResult.updateKeys.keySet()) {
            int indexOf = next.indexOf(46);
            if (indexOf > 0) {
                String substring = next.substring(0, indexOf);
                String substring2 = next.substring(indexOf + 1);
                JSONObject sectionConfig = ConfigCenter.getInstance().getSectionConfig(substring);
                if (sectionConfig != null) {
                    obj = sectionConfig.get(substring2);
                }
            } else {
                obj = ConfigCenter.getInstance().getConfig(next);
            }
            hashMap.put(next, obj);
        }
        return hashMap;
    }

    private void a(long j2) {
        LoggerWrapper.i(f10749a, String.format("Will retry refresh after %s ms, mCurrentTaskIndex = %s.", new Object[]{Long.valueOf(j2), Integer.valueOf(this.h)}));
        this.j.postDelayed(new Runnable() {
            public void run() {
                c.this.e();
            }
        }, j2);
    }

    private void a(@Nullable DistributionNode distributionNode, long j2) {
        if (distributionNode != null && ConfigUtils.isDeviceHitRate(distributionNode.rate, this.m) && DistributionNode.a.isRpcNode(distributionNode.type)) {
            a(distributionNode, j2, false);
        }
    }

    private void a(DistributionNode distributionNode, long j2, boolean z) {
        while (true) {
            int i2 = AnonymousClass7.f10758a[this.b.ordinal()];
            if (i2 == 1) {
                this.q.add(new b(new com.alipay.plus.android.config.sdk.fetcher.a.c(this.m, distributionNode, this.c), j2));
            } else if (i2 == 2) {
                this.q.addAll(b(distributionNode, j2));
            }
            if (z) {
                z = false;
            } else {
                return;
            }
        }
    }

    private void a(@NonNull DistributionNode distributionNode, @NonNull String str) {
        this.m.getConfigMonitor().behavior("config_rate_limited", KVBuilder.newBuilder().put("code", str).put("serviceType", distributionNode.type.name()).build());
        this.u.add(distributionNode);
        for (b b2 : this.q) {
            if (!a(b2.b.d())) {
                return;
            }
        }
        LoggerWrapper.e(f10749a, "** All fetch tasks need skip! will notify failed.");
        f();
    }

    private static void a(@NonNull List<b> list) {
        LoggerWrapper.d(f10749a, "ConfigFetchScheduler tasks: ");
        for (int i2 = 0; i2 < list.size(); i2++) {
            LoggerWrapper.d(f10749a, String.format("    %s %s", new Object[]{Integer.valueOf(i2), list.get(i2)}));
        }
    }

    private void a(List<String> list, ConfigNotifyCallback configNotifyCallback) {
        this.b = a.BY_KEYS;
        this.c = list;
        this.d = configNotifyCallback;
        this.g = 1;
        d();
    }

    private void a(@Nullable List<DistributionNode> list, @Nullable String str, long j2) {
        this.b = a.ALL;
        this.g = j();
        this.f10750o = list;
        this.t = str;
        this.i = j2;
        d();
    }

    private boolean a(@NonNull DistributionNode distributionNode) {
        for (DistributionNode isSameNode : this.u) {
            if (isSameNode.isSameNode(distributionNode)) {
                return true;
            }
        }
        return false;
    }

    @WorkerThread
    private boolean a(@NonNull b bVar) {
        LoggerWrapper.i(f10749a, String.format("[%s] Will do task now! mCurrentTaskIndex = %s", new Object[]{bVar.a(), Integer.valueOf(this.h)}));
        com.alipay.plus.android.config.sdk.fetcher.a.a b2 = bVar.b;
        DistributionNode d2 = b2.d();
        if (a(d2)) {
            String str = f10749a;
            StringBuilder sb = new StringBuilder("** will skip this node: ");
            sb.append(d2.configName);
            LoggerWrapper.e(str, sb.toString());
            return false;
        }
        try {
            String a2 = e.a(d2, this.m);
            AmcsConfigRpcResult b3 = b2.b(TextUtils.equals(this.t, a2) ? String.valueOf(this.i) : "0");
            if (isCanceled()) {
                LoggerWrapper.w(f10749a, "Scheduler already canceled. will skip notify success.");
                return false;
            }
            if (this.b == a.BY_KEYS) {
                this.p.onFetchByKeysSuccess(b3);
                if (this.d != null) {
                    this.d.onFetchSuccess(a(b3));
                }
            } else {
                this.p.onFetchSuccess(b3, a2);
            }
            return true;
        } catch (FetchException e2) {
            LoggerWrapper.e(f10749a, String.format("[%s] Fetch failed! mCurrentTaskIndex = %s, node = %s, error: %s", new Object[]{bVar.a(), d2.configName, Integer.valueOf(this.h), e2}));
            String str2 = e2.errorCode;
            if (b2.a(str2)) {
                LoggerWrapper.d(f10749a, String.format("** isRequestLimited! task = %s, errorCode = %s, node = %s.", new Object[]{b2.a(), str2, d2.configName}));
                a(d2, str2);
            }
            return false;
        }
    }

    private List<b> b(DistributionNode distributionNode, long j2) {
        ArrayList arrayList = new ArrayList();
        ConfigGetter sectionConfigGetter = ConfigCenter.getInstance().getSectionConfigGetter("amcs");
        String stringConfig = sectionConfigGetter != null ? sectionConfigGetter.getStringConfig("encryptStatus") : null;
        if ("MIXED".equalsIgnoreCase(stringConfig) || "ENCRYPT".equalsIgnoreCase(stringConfig)) {
            arrayList.add(new b(new d(this.m, distributionNode, true), j2));
        }
        if (!"ENCRYPT".equalsIgnoreCase(stringConfig)) {
            arrayList.add(new b(new d(this.m, distributionNode, false), j2));
        }
        return arrayList;
    }

    private void d() {
        List<DistributionNode> list;
        boolean z = true;
        long a2 = a(true);
        this.q = new ArrayList();
        List<DistributionNode> list2 = this.n;
        if (list2 != null) {
            for (DistributionNode next : list2) {
                if (this.q.isEmpty()) {
                    a(next, a2);
                    if (!this.q.isEmpty() && this.g <= 0) {
                        LoggerWrapper.d(f10749a, "mRefreshMaxCount <= 0, will disable retry.");
                        return;
                    } else if (this.b != a.ALL) {
                    }
                }
                a(next, a(false));
            }
        }
        if (this.q.isEmpty()) {
            String str = this.m.getRpcProfile().gatewayUrl;
            DistributionNode distributionNode = this.m.isUseGraySscaleAsDefault() ? new DistributionNode(DistributionNode.a.GRAYSCALE, str, AmcsRpcUtils.DEFAULT_NODE_GRAYSCALE_SERVICE, 100) : new DistributionNode(DistributionNode.a.MDS, str, AmcsRpcUtils.DEFAULT_NODE_MDS_SERVICE, 100);
            if (this.g <= 0) {
                z = false;
            }
            a(distributionNode, a2, z);
        }
        if (this.g > 0 && this.b == a.ALL && (list = this.f10750o) != null) {
            for (DistributionNode bVar : list) {
                this.q.add(new b(new com.alipay.plus.android.config.sdk.fetcher.a.b(this.m, bVar), a(false)));
            }
        }
    }

    /* access modifiers changed from: private */
    @WorkerThread
    public void e() {
        if (isCanceled()) {
            LoggerWrapper.w(f10749a, "Scheduler already canceled. will skip doFetchTaskInternal.");
        } else if (this.h >= this.q.size()) {
            LoggerWrapper.w(f10749a, "All tasks finished. will skip.");
        } else {
            i();
            if (!g()) {
                String str = f10749a;
                StringBuilder sb = new StringBuilder("AppInBackground or NoNetwork now! will not fetch. mCurrentTaskIndex = ");
                sb.append(this.h);
                LoggerWrapper.e(str, sb.toString());
                h();
                return;
            }
            if (this.h > 0) {
                this.m.getConfigMonitor().behavior("config_update_retry", KVBuilder.newBuilder().put("retryCount", Integer.valueOf(this.f)).build());
            }
            b bVar = this.q.get(this.h);
            if (a(bVar)) {
                cancel();
                return;
            }
            int i2 = this.h + 1;
            this.h = i2;
            if (i2 < this.q.size()) {
                a(bVar.f10759a);
                return;
            }
            LoggerWrapper.i(f10749a, "All tasks finished.");
            int i3 = this.f + 1;
            this.f = i3;
            if (i3 >= this.g) {
                LoggerWrapper.e(f10749a, "** All retry turn finished, will not retry.");
                f();
                return;
            }
            long a2 = a(false);
            LoggerWrapper.i(f10749a, String.format("** Will schedule next retry. mRefreshCount = %s, delay = %s", new Object[]{Integer.valueOf(this.f), Long.valueOf(a2)}));
            this.j.postDelayed(new Runnable() {
                public void run() {
                    int unused = c.this.h = 0;
                    c.this.b();
                }
            }, a2);
        }
    }

    private void f() {
        LoggerWrapper.i(f10749a, "** Notify all fetch tasks failed.");
        ConfigNotifyCallback configNotifyCallback = this.d;
        if (configNotifyCallback != null) {
            configNotifyCallback.onFetchFailed("Unknown", "All fetch tasks failed.");
        }
        if (isCanceled() || this.b != a.ALL) {
            LoggerWrapper.w(f10749a, "Scheduler already canceled. will skip notify failure.");
            return;
        }
        this.p.onFetchFailed("Unknown", "All fetch tasks failed.");
        cancel();
    }

    private boolean g() {
        if (e) {
            e = false;
            return true;
        }
        Context context = this.m.getContext();
        boolean a2 = e.a(context);
        boolean isNetworkAvailable = NetworkUtils.isNetworkAvailable(context);
        LoggerWrapper.i(f10749a, String.format("scheduleFetchTask. appInForeground = %s, hasNetwork = %s", new Object[]{Boolean.valueOf(a2), Boolean.valueOf(isNetworkAvailable)}));
        return a2 && isNetworkAvailable;
    }

    private void h() {
        final Context context = this.m.getContext();
        if (!NetworkUtils.isNetworkAvailable(context)) {
            LoggerWrapper.d(f10749a, "Add network observer");
            AnonymousClass4 r1 = new NetworkUtils.NetworkStateListener() {
                public void onNetworkChanged(int i, int i2) {
                    if (i2 != 0) {
                        LoggerWrapper.i(c.f10749a, "onNetworkChanged to available, will try scheduleFetchTask");
                        c.this.b();
                    }
                }
            };
            this.s = r1;
            NetworkUtils.addNetworkStateListener(context, r1);
        }
        if (!e.a(context)) {
            LoggerWrapper.d(f10749a, "Add app-foreground observer");
            this.k.post(new Runnable() {
                public void run() {
                    LifecycleWatcher unused = c.this.r = LifecycleWatcher.newValidWatcher();
                    c.this.r.addCallback(new LifecycleWatcher.Callback() {
                        public void onAppToBackground() {
                        }

                        public void onAppToForeground() {
                            LoggerWrapper.i(c.f10749a, "onAppToForeground, will try scheduleFetchTask");
                            c.this.b();
                        }
                    });
                    c.this.r.startWatcher(context);
                }
            });
        }
    }

    private void i() {
        final Context context = this.m.getContext();
        if (this.s != null) {
            LoggerWrapper.d(f10749a, "Remove network observer");
            NetworkUtils.removeNetworkStateListener(context, this.s);
            this.s = null;
        }
        if (this.r != null) {
            LoggerWrapper.d(f10749a, "Remove app-foreground observer");
            this.k.post(new Runnable() {
                public void run() {
                    c.this.r.stopWatcher(context);
                }
            });
            this.s = null;
        }
    }

    private static int j() {
        ConfigGetter sectionConfigGetter = ConfigCenter.getInstance().getSectionConfigGetter("amcs");
        int i2 = 10;
        if (sectionConfigGetter != null) {
            i2 = sectionConfigGetter.getIntConfig("refreshMaxCount", 10);
        }
        LoggerWrapper.i(f10749a, "refreshMaxCount = ".concat(String.valueOf(i2)));
        return i2;
    }

    public int a() {
        int i2 = this.f;
        if (i2 <= 0 && this.h == 0) {
            return 0;
        }
        return i2;
    }

    public void b() {
        if (isCanceled()) {
            LoggerWrapper.w(f10749a, "Scheduler already canceled. will skip scheduleFetchTask.");
        } else {
            this.j.post(new Runnable() {
                public void run() {
                    c.this.e();
                }
            });
        }
    }

    public void cancel() {
        if (!this.l.get()) {
            String str = f10749a;
            StringBuilder sb = new StringBuilder("Will stop scheduler. mCurrentTaskIndex = ");
            sb.append(this.h);
            LoggerWrapper.d(str, sb.toString());
            this.l.set(true);
            this.j.removeCallbacksAndMessages((Object) null);
            i();
            Looper looper = this.j.getLooper();
            if (looper != null) {
                looper.quit();
            }
        }
    }

    public boolean isCanceled() {
        return this.l.get();
    }
}
