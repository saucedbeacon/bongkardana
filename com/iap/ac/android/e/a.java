package com.iap.ac.android.e;

import android.content.Context;
import androidx.annotation.Nullable;
import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.callback.IConfigCallback;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.internal.config.preset.PresetConfigModel;
import com.iap.ac.android.biz.common.storage.ACStorageProvider;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.f.b;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public com.iap.ac.android.f.a f9706a;
    public com.iap.ac.android.g.a b;
    public com.iap.ac.android.h.a c;
    public long d = 0;
    public b e;
    public PresetConfigModel f;
    public com.iap.ac.android.g.b g;
    public com.iap.ac.android.i.a h = new com.iap.ac.android.i.a();
    public ACStorageProvider i;

    /* renamed from: com.iap.ac.android.e.a$a  reason: collision with other inner class name */
    public class C0028a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ IConfigCallback f9707a;

        public C0028a(IConfigCallback iConfigCallback) {
            this.f9707a = iConfigCallback;
        }

        public void run() {
            a.this.b(this.f9707a);
        }
    }

    public a(Context context, @Nullable String str) {
        boolean z;
        this.i = new ACStorageProvider(context, "ConfigManager");
        this.e = new b();
        this.b = new com.iap.ac.android.g.a();
        this.g = new com.iap.ac.android.g.b();
        this.c = new com.iap.ac.android.h.a();
        this.f9706a = new com.iap.ac.android.f.a();
        this.f = new PresetConfigModel();
        ACLog.i(Constants.TAG, "loadLocalConfig begin");
        if (!this.f.parsePresetConfig(context, str)) {
            ACLog.e(Constants.TAG, "ConfigManager, loadLocalConfig error, parsePresetConfig fails.");
            z = false;
        } else {
            if (!this.e.a(this.i.fetch("OAUTH_CONFIG"))) {
                ACLog.e(Constants.TAG, "ConfigManager, loadLocalConfig, parse OAuth config fails");
            }
            if (!this.g.b(this.i.fetch("REGION_CODETYPE_MAPPING"))) {
                ACLog.w(Constants.TAG, "ConfigManager, loadLocalConfig parse region code type map fails.");
            }
            if (!this.b.b(this.i.fetch("CODETYPE_CONFIG"))) {
                ACLog.w(Constants.TAG, "ConfigManager, loadLocalConfig parse cpm config fails.");
            }
            if (!this.c.a(this.i.fetch("HOOK_URL_CONFIG"))) {
                ACLog.w(Constants.TAG, "ConfigManager, loadLocalConfig parse hook auth url fails.");
            }
            if (!this.f9706a.a(this.i.fetch("AMCS_CONFIG"))) {
                ACLog.w(Constants.TAG, "ConfigManager, loadLocalConfig parse amcs config fails.");
            }
            if (!this.e.c() || !this.g.a() || !this.b.a() || !this.c.b()) {
                ACLog.i(Constants.TAG, "loadLocalConfig fail, parse preset config begin");
                a(this.f.getPresetConfigResult(), (IConfigCallback) null, 0, false);
            }
            z = true;
        }
        if (!z) {
            ACLog.e(Constants.TAG, "load local config failed. Not not worry,will try to fetch from remote when needed.");
        }
        ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_acconfig").addParams("result", z ? DiskFormatter.TB : "F").event();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a6, code lost:
        if (r4.equals("OAUTH_CONFIG") != false) goto L_0x00c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(@androidx.annotation.NonNull com.iap.ac.android.biz.common.rpc.result.MobilePaymentFetchConfigsResult r14, com.iap.ac.android.biz.common.callback.IConfigCallback r15, long r16, boolean r18) {
        /*
            r13 = this;
            r7 = r13
            r0 = r14
            java.lang.String r6 = r0.traceId
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.cpmConfigs
            if (r2 == 0) goto L_0x0010
            r1.putAll(r2)
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.String> r2 = r0.mpmConfigs
            if (r2 == 0) goto L_0x0017
            r1.putAll(r2)
        L_0x0017:
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.basicConfigs
            if (r0 == 0) goto L_0x001e
            r1.putAll(r0)
        L_0x001e:
            int r0 = r1.size()
            if (r0 > 0) goto L_0x0034
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r4 = r0 - r16
            java.lang.String r2 = "PARAM_ILLEGAL"
            java.lang.String r3 = "Oops! System busy. Try again later!"
            r0 = r13
            r1 = r15
            r0.a(r1, r2, r3, r4, r6)
            return
        L_0x0034:
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x003c:
            boolean r1 = r0.hasNext()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x012b
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.iap.ac.android.biz.common.storage.ACStorageProvider r4 = r7.i
            java.lang.Object r5 = r1.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r8 = r1.getValue()
            java.lang.String r8 = (java.lang.String) r8
            boolean r4 = r4.save(r5, r8)
            java.lang.String r5 = "IAPConnect"
            if (r4 != 0) goto L_0x0084
            java.lang.String r4 = "parseConfigResult, storage error, key:"
            java.lang.StringBuilder r4 = com.iap.ac.android.a.a.a(r4)
            java.lang.Object r8 = r1.getKey()
            java.lang.String r8 = (java.lang.String) r8
            r4.append(r8)
            java.lang.String r8 = ",value: "
            r4.append(r8)
            java.lang.Object r8 = r1.getValue()
            java.lang.String r8 = (java.lang.String) r8
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            com.iap.ac.android.common.log.ACLog.e(r5, r4)
        L_0x0084:
            java.lang.Object r4 = r1.getKey()
            java.lang.String r4 = (java.lang.String) r4
            r8 = -1
            int r9 = r4.hashCode()
            r10 = 4
            r11 = 3
            r12 = 2
            switch(r9) {
                case -1628845874: goto L_0x00bd;
                case -612987942: goto L_0x00b3;
                case -598378683: goto L_0x00a9;
                case 1079081482: goto L_0x00a0;
                case 1764176129: goto L_0x0096;
                default: goto L_0x0095;
            }
        L_0x0095:
            goto L_0x00c7
        L_0x0096:
            java.lang.String r2 = "REGION_CODETYPE_MAPPING"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00c7
            r2 = 1
            goto L_0x00c8
        L_0x00a0:
            java.lang.String r9 = "OAUTH_CONFIG"
            boolean r4 = r4.equals(r9)
            if (r4 == 0) goto L_0x00c7
            goto L_0x00c8
        L_0x00a9:
            java.lang.String r2 = "AMCS_CONFIG"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00c7
            r2 = 4
            goto L_0x00c8
        L_0x00b3:
            java.lang.String r2 = "CODETYPE_CONFIG"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00c7
            r2 = 2
            goto L_0x00c8
        L_0x00bd:
            java.lang.String r2 = "HOOK_URL_CONFIG"
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L_0x00c7
            r2 = 3
            goto L_0x00c8
        L_0x00c7:
            r2 = -1
        L_0x00c8:
            if (r2 == 0) goto L_0x011e
            if (r2 == r3) goto L_0x0111
            if (r2 == r12) goto L_0x0104
            if (r2 == r11) goto L_0x00f7
            if (r2 == r10) goto L_0x00ea
            java.lang.String r2 = "Unknown key: "
            java.lang.StringBuilder r2 = com.iap.ac.android.a.a.a(r2)
            java.lang.Object r1 = r1.getKey()
            java.lang.String r1 = (java.lang.String) r1
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            com.iap.ac.android.common.log.ACLog.w((java.lang.String) r5, (java.lang.String) r1)
            goto L_0x003c
        L_0x00ea:
            com.iap.ac.android.f.a r2 = r7.f9706a
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2.a(r1)
            goto L_0x003c
        L_0x00f7:
            com.iap.ac.android.h.a r2 = r7.c
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2.a(r1)
            goto L_0x003c
        L_0x0104:
            com.iap.ac.android.g.a r2 = r7.b
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2.b(r1)
            goto L_0x003c
        L_0x0111:
            com.iap.ac.android.g.b r2 = r7.g
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2.b(r1)
            goto L_0x003c
        L_0x011e:
            com.iap.ac.android.f.b r2 = r7.e
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r2.a(r1)
            goto L_0x003c
        L_0x012b:
            com.iap.ac.android.f.b r0 = r7.e
            com.iap.ac.android.biz.common.model.remoteconfig.common.OAuthConfig r0 = r0.f9710a
            if (r0 == 0) goto L_0x0132
            r2 = 1
        L_0x0132:
            if (r2 == 0) goto L_0x0167
            com.iap.ac.android.g.a r0 = r7.b
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0167
            com.iap.ac.android.g.b r0 = r7.g
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x0167
            com.iap.ac.android.h.a r0 = r7.c
            boolean r0 = r0.b()
            if (r0 == 0) goto L_0x0167
            if (r15 == 0) goto L_0x0151
            r15.onConfigSuccess()
        L_0x0151:
            if (r18 == 0) goto L_0x0159
            long r0 = java.lang.System.currentTimeMillis()
            r7.d = r0
        L_0x0159:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r0 = r0 - r16
            java.lang.String r2 = "iapconnect_center"
            java.lang.String r3 = "ac_common_remoteconfig"
            com.iap.ac.android.biz.common.utils.log.ACLogEvent.commonRpcSuccessEvent(r2, r3, r0, r6)
            return
        L_0x0167:
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r4 = r0 - r16
            java.lang.String r2 = "CONFIG_PARSE_ERROR"
            java.lang.String r3 = "parse remote config error"
            r0 = r13
            r1 = r15
            r0.a(r1, r2, r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.e.a.a(com.iap.ac.android.biz.common.rpc.result.MobilePaymentFetchConfigsResult, com.iap.ac.android.biz.common.callback.IConfigCallback, long, boolean):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.iap.ac.android.biz.common.callback.IConfigCallback r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x006f }
            long r2 = r9.d     // Catch:{ all -> 0x006f }
            long r0 = r0 - r2
            com.iap.ac.android.biz.common.configcenter.ConfigCenter r2 = com.iap.ac.android.biz.common.configcenter.ConfigCenter.INSTANCE     // Catch:{ all -> 0x006f }
            long r2 = r2.getRemoteConfigRefreshInterval()     // Catch:{ all -> 0x006f }
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0020
            java.lang.String r0 = "IAPConnect"
            java.lang.String r1 = "loadRemoteConfigInWorker skip, local cache valid"
            com.iap.ac.android.common.log.ACLog.i(r0, r1)     // Catch:{ all -> 0x006f }
            if (r10 == 0) goto L_0x001e
            r10.onConfigSuccess()     // Catch:{ all -> 0x006f }
        L_0x001e:
            monitor-exit(r9)     // Catch:{ all -> 0x006f }
            return
        L_0x0020:
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x006f }
            com.iap.ac.android.i.a r0 = r9.h     // Catch:{ all -> 0x006f }
            com.iap.ac.android.biz.common.rpc.result.MobilePaymentFetchConfigsResult r1 = r0.a()     // Catch:{ all -> 0x006f }
            if (r1 == 0) goto L_0x0052
            boolean r0 = r1.success     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x0037
            r5 = 1
            r0 = r9
            r2 = r10
            r0.a(r1, r2, r3, r5)     // Catch:{ all -> 0x006f }
            goto L_0x006d
        L_0x0037:
            java.lang.String r2 = r1.errorCode     // Catch:{ all -> 0x006f }
            java.lang.String r5 = r1.errorMessage     // Catch:{ all -> 0x006f }
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x006f }
            long r6 = r6 - r3
            java.lang.String r8 = r1.traceId     // Catch:{ all -> 0x006f }
            r0 = r9
            r1 = r10
            r3 = r5
            r4 = r6
            r6 = r8
            r0.a(r1, r2, r3, r4, r6)     // Catch:{ all -> 0x006f }
            java.lang.String r10 = "IAPConnect"
            java.lang.String r0 = "acCommon fetchConfig failed result config is null"
            com.iap.ac.android.common.log.ACLog.e(r10, r0)     // Catch:{ all -> 0x006f }
            goto L_0x006d
        L_0x0052:
            java.lang.String r2 = "INVALID_NETWORK"
            java.lang.String r5 = "Oops! System busy. Try again later!"
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x006f }
            long r6 = r0 - r3
            java.lang.String r8 = ""
            r0 = r9
            r1 = r10
            r3 = r5
            r4 = r6
            r6 = r8
            r0.a(r1, r2, r3, r4, r6)     // Catch:{ all -> 0x006f }
            java.lang.String r10 = "IAPConnect"
            java.lang.String r0 = "acCommon fetchConfig failed rpc failed"
            com.iap.ac.android.common.log.ACLog.e(r10, r0)     // Catch:{ all -> 0x006f }
        L_0x006d:
            monitor-exit(r9)     // Catch:{ all -> 0x006f }
            return
        L_0x006f:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.e.a.b(com.iap.ac.android.biz.common.callback.IConfigCallback):void");
    }

    public final void a(IConfigCallback iConfigCallback, String str, String str2, long j, String str3) {
        ACLogEvent.commonRpcFailEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_common_remoteconfig", str, str2, j, str3);
        if (iConfigCallback != null) {
            iConfigCallback.onConfigFailed();
        }
    }

    public void a(IConfigCallback iConfigCallback) {
        IAPAsyncTask.asyncTask((Runnable) new C0028a(iConfigCallback));
    }
}
