package com.alipay.iap.android.f2fpay.components.defaults;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.securitydata.storage.provider.IDataStorageProvider;
import com.alipay.iap.android.common.securitydata.storage.provider.SpDataStorageProvider;
import com.alipay.iap.android.f2fpay.a.a;
import com.alipay.iap.android.f2fpay.client.IF2FPayClient;
import com.alipay.iap.android.f2fpay.client.callback.IF2FPayInitializeCallback;
import com.alipay.iap.android.f2fpay.common.F2FPayAsyncTask;
import com.alipay.iap.android.f2fpay.common.F2FPayCallbacks;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import com.alipay.iap.android.f2fpay.components.IF2FPayInitializeComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayTimeSyncComponent;
import com.alipay.iap.android.f2fpay.extension.IF2FPaySecureStorage;
import com.alipay.iap.android.f2fpay.otp.F2FPayOtpInfo;
import com.alipay.iap.android.f2fpay.otp.OtpInitResult;
import com.alipay.iap.android.f2fpay.util.ConvertUtils;
import com.alipay.iap.android.f2fpay.util.DeviceUtils;
import java.util.concurrent.locks.ReentrantLock;

public class DefaultInitializeComponent extends DefaultBaseComponent implements IF2FPayInitializeComponent {

    /* renamed from: a  reason: collision with root package name */
    private int f9316a = -1;
    /* access modifiers changed from: private */
    public long b = -1;
    private IDataStorageProvider c;
    protected F2FPayCallbacks<IF2FPayInitializeCallback> mCallbacks = new F2FPayCallbacks<>();
    protected IF2FPayInitializeComponent.Interceptor mInterceptor;
    protected ReentrantLock mLocker = new ReentrantLock();
    protected int mPreviousRequestFinishTimeMark;
    protected String mPreviousRequestIdentity;
    protected ThreadLocal<Integer> mRequestTimeMark = new ThreadLocal<>();

    private int a() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: com.alipayplus.mobile.component.f2fpay.service.request.F2fPayInitRequest} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.alipay.iap.android.f2fpay.otp.OtpInitResult a(java.lang.String r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "IAPF2FPAY"
            android.content.Context r1 = r7.getContext()
            java.lang.String[] r1 = com.alipay.iap.android.f2fpay.util.DeviceUtils.getImeiAndImsi(r1)
            com.alipayplus.mobile.component.f2fpay.service.request.F2fPayInitRequest r2 = new com.alipayplus.mobile.component.f2fpay.service.request.F2fPayInitRequest
            r2.<init>()
            r2.tid = r8
            java.lang.String r8 = "ANDROID"
            r2.osType = r8
            java.lang.String r8 = com.alipay.iap.android.f2fpay.util.DeviceUtils.getVersion()
            r2.osVersion = r8
            r8 = 0
            r8 = r1[r8]
            r2.imei = r8
            r8 = 1
            r8 = r1[r8]
            r2.imsi = r8
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            r2.extParams = r8
            java.util.Map r8 = r2.extParams
            java.lang.String r1 = "seedExpire"
            java.lang.String r3 = "true"
            r8.put(r1, r3)
            com.alipay.iap.android.f2fpay.components.IF2FPayInitializeComponent$Interceptor r8 = r7.mInterceptor
            if (r8 == 0) goto L_0x0041
            java.lang.Object r8 = r8.beforeExecute(r2)
            r2 = r8
            com.alipayplus.mobile.component.f2fpay.service.request.F2fPayInitRequest r2 = (com.alipayplus.mobile.component.f2fpay.service.request.F2fPayInitRequest) r2
        L_0x0041:
            java.lang.Class<com.alipay.ap.mobileprod.biz.f2fpay.rpc.F2fPayInitFacade> r8 = com.alipay.ap.mobileprod.biz.f2fpay.rpc.F2fPayInitFacade.class
            java.lang.Object r8 = com.alipay.iap.android.common.rpcintegration.RPCProxyHost.getInterfaceProxy(r8)
            com.alipay.ap.mobileprod.biz.f2fpay.rpc.F2fPayInitFacade r8 = (com.alipay.ap.mobileprod.biz.f2fpay.rpc.F2fPayInitFacade) r8
            long r3 = java.lang.System.currentTimeMillis()
            r1 = 0
            com.alipayplus.mobile.component.f2fpay.service.result.F2fPayInitResult r8 = r8.init(r2)     // Catch:{ Exception -> 0x00f6 }
            if (r8 == 0) goto L_0x00f0
            boolean r2 = r8.success     // Catch:{ Exception -> 0x00f6 }
            if (r2 != 0) goto L_0x005a
            goto L_0x00f0
        L_0x005a:
            com.alipay.iap.android.f2fpay.components.IF2FPayInitializeComponent$Interceptor r2 = r7.mInterceptor     // Catch:{ Exception -> 0x00f6 }
            if (r2 == 0) goto L_0x0066
            com.alipay.iap.android.f2fpay.components.IF2FPayInitializeComponent$Interceptor r2 = r7.mInterceptor     // Catch:{ Exception -> 0x00f6 }
            java.lang.Object r8 = r2.afterExecute(r8)     // Catch:{ Exception -> 0x00f6 }
            com.alipayplus.mobile.component.f2fpay.service.result.F2fPayInitResult r8 = (com.alipayplus.mobile.component.f2fpay.service.result.F2fPayInitResult) r8     // Catch:{ Exception -> 0x00f6 }
        L_0x0066:
            com.alipay.iap.android.f2fpay.otp.OtpInitResult r2 = new com.alipay.iap.android.f2fpay.otp.OtpInitResult     // Catch:{ Exception -> 0x00f6 }
            r2.<init>(r8)     // Catch:{ Exception -> 0x00f6 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x00f6 }
            long r5 = r5 - r3
            int r3 = (int) r5     // Catch:{ Exception -> 0x00f6 }
            r2.rpcTimeCostMillisecond = r3     // Catch:{ Exception -> 0x00f6 }
            com.alipay.iap.android.f2fpay.common.KeyValueAccessor r3 = r7.keyValueAccessor()     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r4 = "QUERY_INTERVAL"
            java.lang.String r5 = r2.queryInterval     // Catch:{ Exception -> 0x00f6 }
            r3.save((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r4 = "QUERY_COUNT"
            int r5 = r2.queryCount     // Catch:{ Exception -> 0x00f6 }
            r3.save((java.lang.String) r4, (int) r5)     // Catch:{ Exception -> 0x00f6 }
            com.alipay.iap.android.f2fpay.otp.F2FPayOtpInfo r3 = new com.alipay.iap.android.f2fpay.otp.F2FPayOtpInfo     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r4 = r2.tidUidIndex     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r5 = r2.otpSeed     // Catch:{ Exception -> 0x00f6 }
            int r6 = r2.interval     // Catch:{ Exception -> 0x00f6 }
            r3.<init>(r4, r5, r6)     // Catch:{ Exception -> 0x00f6 }
            r7.saveOtpInfo(r3, r9)     // Catch:{ Exception -> 0x00f6 }
            java.lang.Class<com.alipay.iap.android.f2fpay.components.IF2FPayTimeSyncComponent> r9 = com.alipay.iap.android.f2fpay.components.IF2FPayTimeSyncComponent.class
            com.alipay.iap.android.f2fpay.components.IF2FPayBaseComponent r9 = r7.getComponent(r9)     // Catch:{ Exception -> 0x00f6 }
            com.alipay.iap.android.f2fpay.components.IF2FPayTimeSyncComponent r9 = (com.alipay.iap.android.f2fpay.components.IF2FPayTimeSyncComponent) r9     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r3 = r2.serverTime     // Catch:{ Exception -> 0x00f6 }
            int r4 = r2.rpcTimeCostMillisecond     // Catch:{ Exception -> 0x00f6 }
            r9.setServerTime(r3, r4)     // Catch:{ Exception -> 0x00f6 }
            int r8 = r8.otpSeedValidHours     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r3 = "OTP_SEED_EXPIRED_TIME"
            if (r8 <= 0) goto L_0x00d1
            long r4 = r9.getServerTime()     // Catch:{ Exception -> 0x00f6 }
            int r8 = r8 * 3600
            int r8 = r8 * 1000
            long r8 = (long) r8     // Catch:{ Exception -> 0x00f6 }
            long r4 = r4 + r8
            r7.b = r4     // Catch:{ Exception -> 0x00f6 }
            com.alipay.iap.android.common.securitydata.storage.provider.IDataStorageProvider r8 = r7.c     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r9 = java.lang.String.valueOf(r4)     // Catch:{ Exception -> 0x00f6 }
            r8.save(r3, r9)     // Catch:{ Exception -> 0x00f6 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r9 = "seed will be expired after "
            r8.<init>(r9)     // Catch:{ Exception -> 0x00f6 }
            long r3 = r7.b     // Catch:{ Exception -> 0x00f6 }
            r8.append(r3)     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x00f6 }
        L_0x00cd:
            com.alipay.iap.android.common.log.LoggerWrapper.e(r0, r8)     // Catch:{ Exception -> 0x00f6 }
            goto L_0x00d9
        L_0x00d1:
            com.alipay.iap.android.common.securitydata.storage.provider.IDataStorageProvider r8 = r7.c     // Catch:{ Exception -> 0x00f6 }
            r8.delete(r3)     // Catch:{ Exception -> 0x00f6 }
            java.lang.String r8 = "delete seed expired time"
            goto L_0x00cd
        L_0x00d9:
            boolean r8 = r7.getStartRefreshFlag()     // Catch:{ Exception -> 0x00f6 }
            if (r8 != 0) goto L_0x00e5
            java.lang.String r8 = "refreshOtpInfoRpc stopRefreshTask called, skip callback"
            com.alipay.iap.android.common.log.LoggerWrapper.e(r0, r8)     // Catch:{ Exception -> 0x00f6 }
            return r2
        L_0x00e5:
            com.alipay.iap.android.f2fpay.common.F2FPayCallbacks<com.alipay.iap.android.f2fpay.client.callback.IF2FPayInitializeCallback> r8 = r7.mCallbacks     // Catch:{ Exception -> 0x00f6 }
            com.alipay.iap.android.f2fpay.components.defaults.DefaultInitializeComponent$2 r9 = new com.alipay.iap.android.f2fpay.components.defaults.DefaultInitializeComponent$2     // Catch:{ Exception -> 0x00f6 }
            r9.<init>(r2)     // Catch:{ Exception -> 0x00f6 }
            r8.callback(r9)     // Catch:{ Exception -> 0x00f6 }
            return r2
        L_0x00f0:
            java.lang.String r8 = "refreshOtpInfoRpc rpc error"
            com.alipay.iap.android.common.log.LoggerWrapper.e(r0, r8)     // Catch:{ Exception -> 0x00f6 }
            return r1
        L_0x00f6:
            r8 = move-exception
            java.lang.String r9 = "refreshOtpInfoRpc exception: "
            com.alipay.iap.android.common.log.LoggerWrapper.e(r0, r9, r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.f2fpay.components.defaults.DefaultInitializeComponent.a(java.lang.String, java.lang.String):com.alipay.iap.android.f2fpay.otp.OtpInitResult");
    }

    private void a(final String str) {
        LoggerWrapper.e(F2FPayConstants.TAG, "onInitializeFailed: ".concat(String.valueOf(str)));
        this.mCallbacks.callback(new F2FPayCallbacks.Invoker<IF2FPayInitializeCallback>() {
            public void invoke(@NonNull IF2FPayInitializeCallback iF2FPayInitializeCallback) {
                iF2FPayInitializeCallback.onInitializeFailed(str);
            }
        });
    }

    /* access modifiers changed from: private */
    public void b() {
        LoggerWrapper.i(F2FPayConstants.TAG, "onInitializeSucceed");
        this.mCallbacks.callback(new F2FPayCallbacks.Invoker<IF2FPayInitializeCallback>() {
            public void invoke(@NonNull IF2FPayInitializeCallback iF2FPayInitializeCallback) {
                iF2FPayInitializeCallback.onInitializeOtpSucceed();
            }
        });
    }

    public void addInitializeCallback(IF2FPayInitializeCallback iF2FPayInitializeCallback) {
        this.mCallbacks.addCallback(iF2FPayInitializeCallback);
    }

    public void asyncInitializeOtpInfo() {
        LoggerWrapper.e(F2FPayConstants.TAG, "asyncInitializeOtpInfo");
        final String userId = getUserDelegate().getUserId();
        F2FPayAsyncTask.asyncTask((Runnable) new Runnable() {
            public void run() {
                String generateTerminalIdentifier = DefaultInitializeComponent.this.generateTerminalIdentifier();
                String identity = ConvertUtils.getIdentity(userId, generateTerminalIdentifier);
                boolean z = true;
                if (-1 != DefaultInitializeComponent.this.b) {
                    if (DefaultInitializeComponent.this.b <= ((IF2FPayTimeSyncComponent) DefaultInitializeComponent.this.getComponent(IF2FPayTimeSyncComponent.class)).getServerTime()) {
                        z = false;
                    }
                }
                LoggerWrapper.i(F2FPayConstants.TAG, "otp is valid? ".concat(String.valueOf(z)));
                if (!DefaultInitializeComponent.this.checkExist(identity) || !z) {
                    LoggerWrapper.i(F2FPayConstants.TAG, "optInfo does not exist, start initialize");
                    DefaultInitializeComponent.this.initializeOtpInfoInWorker(generateTerminalIdentifier, identity);
                    return;
                }
                LoggerWrapper.i(F2FPayConstants.TAG, "optInfo exists, skip the Initialize RPC");
                ((IF2FPayTimeSyncComponent) DefaultInitializeComponent.this.getComponent(IF2FPayTimeSyncComponent.class)).synchronizeTime();
                DefaultInitializeComponent.this.b();
            }
        });
    }

    /* access modifiers changed from: protected */
    public boolean checkExist(String str) {
        IF2FPaySecureStorage secureStorage = getClientContext().getSecureStorage();
        if (secureStorage.checkOtpInfoExist(str)) {
            return true;
        }
        secureStorage.clear();
        return false;
    }

    public void clearOtpInfo() {
        LoggerWrapper.e(F2FPayConstants.TAG, "clearOtpInfo");
        getClientContext().getSecureStorage().clear();
    }

    public int getRefreshInterval() {
        return this.f9316a;
    }

    public void initialize(IF2FPayClient iF2FPayClient) {
        super.initialize(iF2FPayClient);
        SpDataStorageProvider spDataStorageProvider = new SpDataStorageProvider(getContext(), "iapf2fpay");
        this.c = spDataStorageProvider;
        String fetch = spDataStorageProvider.fetch(F2FPayConstants.StorageKeyList.KEY_OTP_SEED_EXPIRED_TIME);
        try {
            if (!TextUtils.isEmpty(fetch)) {
                this.b = Long.valueOf(fetch).longValue();
                StringBuilder sb = new StringBuilder("otp seed will expired after ");
                sb.append(this.b);
                LoggerWrapper.d(F2FPayConstants.TAG, sb.toString());
            }
        } catch (Exception e) {
            LoggerWrapper.e(F2FPayConstants.TAG, "", e);
        }
    }

    @SuppressLint({"DefaultLocale"})
    public void initializeOtpInfoInWorker(String str, String str2) {
        boolean z;
        if (!DeviceUtils.isOnline(getContext()) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str) || !getUserDelegate().checkPermission()) {
            StringBuilder sb = new StringBuilder("initializeOtpInfoInWorker error, tid:");
            sb.append(str);
            sb.append(", identify:");
            sb.append(str2);
            sb.append(", online:");
            sb.append(DeviceUtils.isOnline(getContext()));
            sb.append(", permission:");
            sb.append(getUserDelegate().checkPermission());
            a(sb.toString());
            return;
        }
        this.mRequestTimeMark.set(Integer.valueOf(a()));
        int i = 0;
        LoggerWrapper.i(F2FPayConstants.TAG, String.format("Thread = %d, RequestLocker = %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), String.valueOf(this.mLocker.isLocked())}));
        this.mLocker.lock();
        try {
            int intValue = this.mRequestTimeMark.get().intValue();
            this.mRequestTimeMark.remove();
            if (this.mPreviousRequestIdentity != null) {
                if (this.mPreviousRequestIdentity.equals(str2) && intValue <= this.mPreviousRequestFinishTimeMark) {
                    StringBuilder sb2 = new StringBuilder("After lock Thread:");
                    sb2.append(Thread.currentThread().getId());
                    sb2.append("is return");
                    LoggerWrapper.i(F2FPayConstants.TAG, sb2.toString());
                    a("initializeOtpInfoInWorker error, there already has another initialize otp task is working");
                    return;
                }
            }
            StringBuilder sb3 = new StringBuilder("After lock Thread:");
            sb3.append(Thread.currentThread().getId());
            sb3.append("working");
            LoggerWrapper.i(F2FPayConstants.TAG, sb3.toString());
            long currentTimeMillis = System.currentTimeMillis();
            int i2 = 0;
            while (true) {
                if (i2 >= 3) {
                    z = false;
                    break;
                }
                OtpInitResult a2 = a(str, str2);
                if (a2 != null) {
                    this.mPreviousRequestIdentity = str2;
                    this.mPreviousRequestFinishTimeMark = a();
                    this.f9316a = a2.interval;
                    z = true;
                    break;
                }
                i2++;
            }
            if (getStartRefreshFlag()) {
                if (z) {
                    b();
                } else {
                    a("refreshOtpInfoRpc rpc error");
                }
            }
            a a3 = a.a("F2FPayInit").a("TimeCost", (Object) Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            if (z) {
                i = 1;
            }
            a3.a("Result", (Object) Integer.valueOf(i)).a(getLogger());
            this.mLocker.unlock();
        } finally {
            this.mLocker.unlock();
        }
    }

    public synchronized void saveOtpInfo(F2FPayOtpInfo f2FPayOtpInfo, String str) {
        IF2FPaySecureStorage secureStorage = getClientContext().getSecureStorage();
        secureStorage.clear();
        secureStorage.saveOtpInfo(f2FPayOtpInfo, str);
    }

    public void setInitializeInterceptor(@Nullable IF2FPayInitializeComponent.Interceptor interceptor) {
        this.mInterceptor = interceptor;
    }
}
