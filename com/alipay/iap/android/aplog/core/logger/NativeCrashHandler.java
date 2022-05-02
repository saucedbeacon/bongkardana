package com.alipay.iap.android.aplog.core.logger;

import android.content.Context;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import com.alipay.iap.android.aplog.core.logger.NativeCrashHandlerApi;
import com.alipay.iap.android.aplog.util.CrashCombineUtils;
import com.alipay.iap.android.aplog.util.CrashFilterUtils;
import com.alipay.iap.android.aplog.util.LoggingUtil;
import com.uc.crashsdk.export.CrashApi;
import com.uc.crashsdk.export.CustomInfo;
import com.uc.crashsdk.export.VersionInfo;
import java.io.File;

public class NativeCrashHandler {
    public static boolean ENABLE_NATIVE_LOG = true;
    public static boolean ENABLE_UNEXP_LOG = false;
    public static boolean ENANBLE_JAVA_LOG = false;
    public static final String FILE_PATH = "app_crash";

    /* renamed from: a  reason: collision with root package name */
    private static String f9301a;
    /* access modifiers changed from: private */
    public static CrashApi b;

    public static final synchronized String getPath() {
        String str;
        synchronized (NativeCrashHandler.class) {
            str = f9301a;
        }
        return str;
    }

    public static void initialize(Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getApplicationInfo().dataDir);
        sb.append(File.separator);
        sb.append(FILE_PATH);
        f9301a = sb.toString();
        VersionInfo versionInfo = new VersionInfo();
        versionInfo.mVersion = LoggerFactory.getLogContext().getProductVersion();
        CrashApi createInstance = CrashApi.createInstance(context, b(), versionInfo, new CrashClientImpl(), (String) null, ENANBLE_JAVA_LOG, ENABLE_NATIVE_LOG, ENABLE_UNEXP_LOG);
        b = createInstance;
        createInstance.setCrashLogUploadUrl((String) null);
        a(context);
        NativeCrashHandlerApi.setCrashGetter(new NativeCrashHandlerApi.NativeCrashApiGetter() {
            public final CrashApi getCrashApi() {
                return NativeCrashHandler.b;
            }
        });
        b.addHeaderInfo(CrashFilterUtils.MPAAS_PRODUCT_VERSION, LoggerFactory.getLogContext().getProductVersion());
        if (ENABLE_UNEXP_LOG && LoggerFactory.getProcessInfo().isMainProcess()) {
            b.registerInfoCallback(NativeCrashHandlerApi.CAT_LAST_PRODUCT_INFO, 256);
        }
        LoggerFactory.getTraceLogger().info("NativeCrashHandler", "initialize ok");
    }

    private static CustomInfo b() {
        CustomInfo customInfo = new CustomInfo();
        customInfo.mCrashLogPrefix = CrashCombineUtils.TOMB;
        customInfo.mMaxNativeLogcatLineCount = 1000;
        customInfo.mMaxUnexpLogcatLineCount = 500;
        customInfo.mMaxJavaLogcatLineCount = 1;
        customInfo.mMaxCrashLogFilesCount = 3;
        customInfo.mCrashLogsFolderName = FILE_PATH;
        customInfo.mZipLog = false;
        customInfo.mOmitJavaCrash = false;
        customInfo.mCallJavaDefaultHandler = true;
        customInfo.mUnexpDelayMillSeconds = 5000;
        customInfo.mSyncUploadSetupCrashLogs = false;
        return customInfo;
    }

    private static void a(Context context) {
        try {
            if (LoggingUtil.loadLibrary(context, "crashsdk")) {
                b.crashSoLoaded();
                if (ENABLE_UNEXP_LOG && LoggerFactory.getProcessInfo().isMainProcess()) {
                    new Thread(new Runnable() {
                        /* JADX WARNING: Failed to process nested try/catch */
                        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public final void run() {
                            /*
                                r4 = this;
                                r0 = 3000(0xbb8, double:1.482E-320)
                                java.lang.Thread.sleep(r0)     // Catch:{ all -> 0x0005 }
                            L_0x0005:
                                com.uc.crashsdk.export.CrashApi r0 = com.alipay.iap.android.aplog.core.logger.NativeCrashHandler.b     // Catch:{ all -> 0x000d }
                                r0.setMainProcess()     // Catch:{ all -> 0x000d }
                                return
                            L_0x000d:
                                r0 = move-exception
                                com.alipay.iap.android.aplog.core.logger.TraceLogger r1 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
                                java.lang.String r2 = "NativeCrashHandler"
                                java.lang.String r3 = "setMainProcess exception"
                                r1.error(r2, r3, r0)
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.core.logger.NativeCrashHandler.AnonymousClass2.run():void");
                        }
                    }, "prepareCrashInfo").start();
                    return;
                }
                return;
            }
            LoggerFactory.getTraceLogger().error("NativeCrashHandler", "loadLibrary failed");
        } catch (Throwable th) {
            LoggerFactory.getTraceLogger().error("NativeCrashHandler", "loadLibrary exception", th);
        }
    }
}
