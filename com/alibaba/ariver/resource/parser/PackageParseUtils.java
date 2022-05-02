package com.alibaba.ariver.resource.parser;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.io.PoolingByteArrayOutputStream;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.FileUtils;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.resource.api.content.OfflineResource;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.proxy.RVResourceEnviromentProxy;
import com.alibaba.ariver.resource.api.proxy.RVResourceManager;
import com.alibaba.ariver.resource.parser.a.b;
import com.alibaba.ariver.resource.parser.a.e;
import com.alibaba.fastjson.JSONObject;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import o.PlaybackStateCompat;

@Keep
public class PackageParseUtils {
    private static final String LEGACY_TAR_PUBLIC_KEY = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQC2y61svV7Q0gmvxprTt6YX76rps8R+q+C+Qtkkk2+njIABsf10sHnl/5aQBh2s+kdo6YGlJrnKdxVso2JRzy+QbRBUgTdJmKfm5uGPdcqYuO0ur4b/QCyHTMoKJjBT8iI3hYIGhn0hACDao4xIsgzJ39grRKUa6120WbInlOLWSQIDAQAB";
    private static final String NEW_SIGN_PUBLIC_KEY = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAl96KRuzoQDgt3q3478MYKwTGDV0Fz5w+sKOfz+Ar+/XkwqLjVW7bAk+/nOD9Z4mnwM+BsgU/G5KGQ9WMjcXAow/eRBSf93iqcBX5+DdlkbneNyQP7Mvcy8EwOAa3y7AetEpTeYrv5cppFUjq4TVu9w+DwV1qegfvJEAA+6gFJEcJPxD9fxJggCF02tL3k9/WDnaNYVN3dCq8fN4jWZLr6KWlAX5UW5ZVtXP9IWObFnvRNjgXQhW/LzJLdbcDlQ5U6ImFyIFf//vn3vEhzlpU6EkxdGr+FWwsRiMTY9aZ1fJiFlgAZQpInV6cbDM8LgNGPtDsYUibIi3rVFtYtHAxQwIDAQAB";
    public static final String TAG = "AriverRes:PackageParseUtils";
    private static PlaybackStateCompat.ErrorCode<String, a> sParsedResult;

    static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final CountDownLatch f10189a;
        /* access modifiers changed from: private */
        public String b;
        /* access modifiers changed from: private */
        public Map<String, Resource> c;
        /* access modifiers changed from: private */
        public a d;

        public a(boolean z) {
            if (z) {
                this.f10189a = new CountDownLatch(1);
            } else {
                this.f10189a = new CountDownLatch(0);
            }
        }
    }

    static {
        int i = 3;
        try {
            String config = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig("h5_lru_pkg_count", "");
            if (!TextUtils.isEmpty(config)) {
                i = Integer.parseInt(config);
                if (i > 10) {
                    i = 10;
                }
            }
        } catch (Throwable unused) {
        }
        sParsedResult = new PlaybackStateCompat.ErrorCode<>(i);
    }

    public static void preParsePackage(AppModel appModel) {
        RVResourceManager rVResourceManager = (RVResourceManager) RVProxy.get(RVResourceManager.class);
        if (rVResourceManager == null || !rVResourceManager.isAvailable(appModel)) {
            RVLogger.d(TAG, "skip preParsePackage because not available!");
            return;
        }
        String installPath = ((RVResourceManager) RVProxy.get(RVResourceManager.class)).getInstallPath(appModel);
        ParseContext parseContext = new ParseContext();
        parseContext.packagePath = installPath;
        parseContext.adaptAppModel(appModel);
        preParsePackage(parseContext);
    }

    public static void preParsePackage(ParseContext parseContext) {
        if (parseContext != null && !TextUtils.isEmpty(parseContext.packagePath)) {
            StringBuilder sb = new StringBuilder("preParsePackage begin for ");
            sb.append(parseContext.packagePath);
            RVLogger.w(TAG, sb.toString());
            if (sParsedResult.get(getCacheKey(parseContext)) != null) {
                RVLogger.w(TAG, "preParsePackage but already contains in cache!");
                return;
            }
            a aVar = new a(true);
            String unused = aVar.b = parseContext.onlineHost;
            sParsedResult.put(getCacheKey(parseContext), aVar);
            try {
                Map<String, Resource> parsePackage = parsePackage(parseContext, true);
                if (parsePackage != null) {
                    Map unused2 = aVar.c = parsePackage;
                }
            } catch (Throwable th) {
                RVLogger.w(TAG, "preParsePackage exception!", th);
                if (th instanceof a) {
                    a unused3 = aVar.d = th;
                }
            } finally {
                aVar.f10189a.countDown();
            }
        }
    }

    private static String getCacheKey(ParseContext parseContext) {
        return !TextUtils.isEmpty(parseContext.templateAppId) ? parseContext.templateAppId : parseContext.packagePath;
    }

    @Nullable
    static Map<String, Resource> getPreParsedPackage(ParseContext parseContext) {
        a aVar = sParsedResult.get(getCacheKey(parseContext));
        if (aVar == null) {
            return null;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        try {
            aVar.f10189a.await(5, TimeUnit.SECONDS);
            StringBuilder sb = new StringBuilder("getPreParsedPackage await preParse cost: ");
            sb.append(SystemClock.elapsedRealtime() - elapsedRealtime);
            RVLogger.w(TAG, sb.toString());
            if (aVar.d == null) {
                if (aVar.c != null) {
                    boolean z = !TextUtils.equals(parseContext.onlineHost, aVar.b);
                    StringBuilder sb2 = new StringBuilder("getPreParsedPackage got data! size: ");
                    sb2.append(aVar.c.size());
                    sb2.append(" onlineHostChanged: ");
                    sb2.append(z);
                    RVLogger.d(TAG, sb2.toString());
                    if (TextUtils.isEmpty(parseContext.templateAppId) && !z) {
                        return aVar.c;
                    }
                    if (!TextUtils.isEmpty(parseContext.onlineHost)) {
                        StringBuilder sb3 = new StringBuilder("getPreParsedPackage replace vhost ");
                        sb3.append(aVar.b);
                        sb3.append(" to ");
                        sb3.append(parseContext.onlineHost);
                        RVLogger.d(TAG, sb3.toString());
                        HashMap hashMap = new HashMap(aVar.c.size());
                        for (Map.Entry entry : aVar.c.entrySet()) {
                            String replace = ((String) entry.getKey()).replace(aVar.b, parseContext.onlineHost);
                            hashMap.put(replace, new OfflineResource(replace, ((Resource) entry.getValue()).getBytes()));
                        }
                        return hashMap;
                    }
                }
                return null;
            }
            StringBuilder sb4 = new StringBuilder("getPreParsedPackage got exception!");
            sb4.append(aVar.d);
            RVLogger.w(TAG, sb4.toString());
            sParsedResult.remove(getCacheKey(parseContext));
            throw aVar.d;
        } catch (InterruptedException e) {
            RVLogger.w(TAG, "getPreParsedPackage await preParse exception!", e);
            return null;
        }
    }

    public static Map<String, Resource> parsePackage(ParseContext parseContext) {
        return parsePackage(parseContext, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0083, code lost:
        r14 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0095, code lost:
        throw r14;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map<java.lang.String, com.alibaba.ariver.engine.api.resources.Resource> parsePackage(com.alibaba.ariver.resource.parser.ParseContext r13, boolean r14) {
        /*
            java.lang.String r0 = "RV_ContentPackage_verify_"
            java.lang.String r1 = "RV_ContentPackage_read_"
            java.lang.String r2 = "RV_ContentPackage_waitPrepare_"
            java.lang.String r3 = "RV_ContentPackage_parse_"
            java.lang.String r4 = "AriverRes:PackageParseUtils"
            java.lang.String r5 = "parsePackage with "
            java.lang.String r6 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0212 }
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x0212 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r5)     // Catch:{ all -> 0x0212 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0212 }
            r5.<init>(r3)     // Catch:{ all -> 0x0212 }
            java.lang.String r6 = r13.appId     // Catch:{ all -> 0x0212 }
            r5.append(r6)     // Catch:{ all -> 0x0212 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0212 }
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceBeginSection(r5)     // Catch:{ all -> 0x0212 }
            java.lang.String r5 = r13.packagePath     // Catch:{ all -> 0x0212 }
            r6 = 2
            if (r5 == 0) goto L_0x020a
            r5 = 1
            if (r14 != 0) goto L_0x0096
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0083 }
            r7.<init>(r2)     // Catch:{ all -> 0x0083 }
            java.lang.String r8 = r13.appId     // Catch:{ all -> 0x0083 }
            r7.append(r8)     // Catch:{ all -> 0x0083 }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0083 }
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceBeginSection(r7)     // Catch:{ all -> 0x0083 }
            java.util.Map r7 = getPreParsedPackage(r13)     // Catch:{ all -> 0x0083 }
            if (r7 == 0) goto L_0x0071
            r13.fromCache = r5     // Catch:{ all -> 0x0083 }
            java.lang.String r14 = "parsePackage hit cache!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r14)     // Catch:{ all -> 0x0083 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0212 }
            r14.<init>(r2)     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = r13.appId     // Catch:{ all -> 0x0212 }
            r14.append(r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x0212 }
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r14)     // Catch:{ all -> 0x0212 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r3)
            java.lang.String r13 = r13.appId
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r13)
            return r7
        L_0x0071:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0212 }
            r7.<init>(r2)     // Catch:{ all -> 0x0212 }
            java.lang.String r2 = r13.appId     // Catch:{ all -> 0x0212 }
            r7.append(r2)     // Catch:{ all -> 0x0212 }
            java.lang.String r2 = r7.toString()     // Catch:{ all -> 0x0212 }
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r2)     // Catch:{ all -> 0x0212 }
            goto L_0x0096
        L_0x0083:
            r14 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0212 }
            r0.<init>(r2)     // Catch:{ all -> 0x0212 }
            java.lang.String r1 = r13.appId     // Catch:{ all -> 0x0212 }
            r0.append(r1)     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0212 }
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r0)     // Catch:{ all -> 0x0212 }
            throw r14     // Catch:{ all -> 0x0212 }
        L_0x0096:
            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0212 }
            java.lang.String r2 = r13.packagePath     // Catch:{ all -> 0x0212 }
            if (r2 == 0) goto L_0x01f4
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0212 }
            r5.<init>(r2)     // Catch:{ all -> 0x0212 }
            java.io.File[] r9 = r5.listFiles()     // Catch:{ all -> 0x0212 }
            if (r9 == 0) goto L_0x01e7
            int r10 = r9.length     // Catch:{ all -> 0x0212 }
            if (r10 == 0) goto L_0x01e7
            boolean r6 = r13.needVerify     // Catch:{ all -> 0x0212 }
            if (r6 == 0) goto L_0x00d5
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0212 }
            r6.<init>(r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r10 = r13.appId     // Catch:{ all -> 0x0212 }
            r6.append(r10)     // Catch:{ all -> 0x0212 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0212 }
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceBeginSection(r6)     // Catch:{ all -> 0x0212 }
            verifyPackage(r13, r2, r9)     // Catch:{ all -> 0x0212 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0212 }
            r2.<init>(r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = r13.appId     // Catch:{ all -> 0x0212 }
            r2.append(r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0212 }
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r0)     // Catch:{ all -> 0x0212 }
        L_0x00d5:
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0110 }
            long r11 = r5.lastModified()     // Catch:{ all -> 0x0110 }
            boolean r0 = r5.setLastModified(r9)     // Catch:{ all -> 0x0110 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0110 }
            java.lang.String r5 = "lastModified "
            r2.<init>(r5)     // Catch:{ all -> 0x0110 }
            r2.append(r11)     // Catch:{ all -> 0x0110 }
            java.lang.String r5 = " setResult:"
            r2.append(r5)     // Catch:{ all -> 0x0110 }
            r2.append(r0)     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = " newTime:"
            r2.append(r0)     // Catch:{ all -> 0x0110 }
            r2.append(r9)     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = " cost:"
            r2.append(r0)     // Catch:{ all -> 0x0110 }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0110 }
            long r5 = r5 - r9
            r2.append(r5)     // Catch:{ all -> 0x0110 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0110 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)     // Catch:{ all -> 0x0110 }
            goto L_0x0116
        L_0x0110:
            r0 = move-exception
            java.lang.String r2 = "lastModified exception!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r4, r2, r0)     // Catch:{ all -> 0x0212 }
        L_0x0116:
            java.lang.String r0 = r13.mainFileName     // Catch:{ all -> 0x0212 }
            if (r0 != 0) goto L_0x012e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0212 }
            r0.<init>()     // Catch:{ all -> 0x0212 }
            java.lang.String r2 = r13.appId     // Catch:{ all -> 0x0212 }
            r0.append(r2)     // Catch:{ all -> 0x0212 }
            java.lang.String r2 = ".tar"
            r0.append(r2)     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0212 }
            goto L_0x0130
        L_0x012e:
            java.lang.String r0 = r13.mainFileName     // Catch:{ all -> 0x0212 }
        L_0x0130:
            java.lang.String r2 = r13.packagePath     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = com.alibaba.ariver.kernel.common.utils.FileUtils.combinePath(r2, r0)     // Catch:{ all -> 0x0212 }
            java.util.HashMap r2 = new java.util.HashMap     // Catch:{ all -> 0x0212 }
            r2.<init>()     // Catch:{ all -> 0x0212 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x01b5 }
            r5.<init>(r1)     // Catch:{ all -> 0x01b5 }
            java.lang.String r6 = r13.appId     // Catch:{ all -> 0x01b5 }
            r5.append(r6)     // Catch:{ all -> 0x01b5 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x01b5 }
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceBeginSection(r5)     // Catch:{ all -> 0x01b5 }
            fastReadTarIntoMemory(r2, r0, r13)     // Catch:{ all -> 0x01b5 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0212 }
            r0.<init>(r1)     // Catch:{ all -> 0x0212 }
            java.lang.String r1 = r13.appId     // Catch:{ all -> 0x0212 }
            r0.append(r1)     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0212 }
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r0)     // Catch:{ all -> 0x0212 }
            if (r14 != 0) goto L_0x0183
            int r14 = r2.size()     // Catch:{ all -> 0x0212 }
            if (r14 <= 0) goto L_0x0183
            boolean r14 = r13.needCache     // Catch:{ all -> 0x0212 }
            if (r14 == 0) goto L_0x0183
            com.alibaba.ariver.resource.parser.PackageParseUtils$a r14 = new com.alibaba.ariver.resource.parser.PackageParseUtils$a     // Catch:{ all -> 0x0212 }
            r0 = 0
            r14.<init>(r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = r13.onlineHost     // Catch:{ all -> 0x0212 }
            java.lang.String unused = r14.b = r0     // Catch:{ all -> 0x0212 }
            java.util.Map unused = r14.c = r2     // Catch:{ all -> 0x0212 }
            o.PlaybackStateCompat$ErrorCode<java.lang.String, com.alibaba.ariver.resource.parser.PackageParseUtils$a> r0 = sParsedResult     // Catch:{ all -> 0x0212 }
            java.lang.String r1 = getCacheKey(r13)     // Catch:{ all -> 0x0212 }
            r0.put(r1, r14)     // Catch:{ all -> 0x0212 }
        L_0x0183:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = "parse package "
            r14.<init>(r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = r13.appId     // Catch:{ all -> 0x0212 }
            r14.append(r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = " elapse "
            r14.append(r0)     // Catch:{ all -> 0x0212 }
            long r0 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0212 }
            long r0 = r0 - r7
            r14.append(r0)     // Catch:{ all -> 0x0212 }
            java.lang.String r14 = r14.toString()     // Catch:{ all -> 0x0212 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r14)     // Catch:{ all -> 0x0212 }
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r3)
            java.lang.String r13 = r13.appId
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r13)
            return r2
        L_0x01b5:
            r14 = move-exception
            java.lang.String r0 = "readTarStreamIntoMemory exception!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r4, r0, r14)     // Catch:{ all -> 0x01d4 }
            com.alibaba.ariver.resource.parser.a r0 = new com.alibaba.ariver.resource.parser.a     // Catch:{ all -> 0x01d4 }
            r2 = 7
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d4 }
            java.lang.String r5 = "readIntoPackageException:"
            r4.<init>(r5)     // Catch:{ all -> 0x01d4 }
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x01d4 }
            r4.append(r14)     // Catch:{ all -> 0x01d4 }
            java.lang.String r14 = r4.toString()     // Catch:{ all -> 0x01d4 }
            r0.<init>(r2, r14)     // Catch:{ all -> 0x01d4 }
            throw r0     // Catch:{ all -> 0x01d4 }
        L_0x01d4:
            r14 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0212 }
            r0.<init>(r1)     // Catch:{ all -> 0x0212 }
            java.lang.String r1 = r13.appId     // Catch:{ all -> 0x0212 }
            r0.append(r1)     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0212 }
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r0)     // Catch:{ all -> 0x0212 }
            throw r14     // Catch:{ all -> 0x0212 }
        L_0x01e7:
            java.lang.String r14 = "childrenFiles length == 0"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r4, (java.lang.String) r14)     // Catch:{ all -> 0x0212 }
            com.alibaba.ariver.resource.parser.a r14 = new com.alibaba.ariver.resource.parser.a     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = "OFFLINE_PATH_NOT_EXIST"
            r14.<init>(r6, r0)     // Catch:{ all -> 0x0212 }
            throw r14     // Catch:{ all -> 0x0212 }
        L_0x01f4:
            com.alibaba.ariver.resource.parser.a r14 = new com.alibaba.ariver.resource.parser.a     // Catch:{ all -> 0x0212 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0212 }
            java.lang.String r1 = "INVALID_PARAM packagePath is null, appId"
            r0.<init>(r1)     // Catch:{ all -> 0x0212 }
            java.lang.String r1 = r13.appId     // Catch:{ all -> 0x0212 }
            r0.append(r1)     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0212 }
            r14.<init>(r5, r0)     // Catch:{ all -> 0x0212 }
            throw r14     // Catch:{ all -> 0x0212 }
        L_0x020a:
            com.alibaba.ariver.resource.parser.a r14 = new com.alibaba.ariver.resource.parser.a     // Catch:{ all -> 0x0212 }
            java.lang.String r0 = "PACKAGE_PATH_NULL"
            r14.<init>(r6, r0)     // Catch:{ all -> 0x0212 }
            throw r14     // Catch:{ all -> 0x0212 }
        L_0x0212:
            r14 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r3)
            java.lang.String r13 = r13.appId
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.parser.PackageParseUtils.parsePackage(com.alibaba.ariver.resource.parser.ParseContext, boolean):java.util.Map");
    }

    private static void verifyPackage(ParseContext parseContext, String str, File[] fileArr) {
        String str2;
        JSONObject jSONObject;
        String str3 = str;
        File[] fileArr2 = fileArr;
        String combinePath = FileUtils.combinePath(str3, "CERT.json");
        String combinePath2 = FileUtils.combinePath(str3, "SIGN.json");
        if (FileUtils.exists(combinePath) || FileUtils.exists(combinePath2)) {
            boolean exists = FileUtils.exists(combinePath2);
            RVLogger.d(TAG, "useNewSignKey : ".concat(String.valueOf(exists)));
            if (exists) {
                jSONObject = JSONUtils.parseObject(IOUtils.read(combinePath2));
                str2 = ((RVResourceEnviromentProxy) RVProxy.get(RVResourceEnviromentProxy.class)).getNewSignPublicKey();
                if (TextUtils.isEmpty(str2)) {
                    str2 = NEW_SIGN_PUBLIC_KEY;
                }
            } else {
                jSONObject = JSONUtils.parseObject(FileUtils.read(combinePath));
                str2 = ((RVResourceEnviromentProxy) RVProxy.get(RVResourceEnviromentProxy.class)).getLegacySignPublicKey();
                if (TextUtils.isEmpty(str2)) {
                    str2 = LEGACY_TAR_PUBLIC_KEY;
                }
            }
            if (jSONObject == null || jSONObject.isEmpty()) {
                RVLogger.e(TAG, "joCert is empty");
                throw new a(5, "TAR_SIGNATURE_IS_EMPTY");
            }
            try {
                for (File name : fileArr2) {
                    String name2 = name.getName();
                    long currentTimeMillis = System.currentTimeMillis();
                    if (!inBlackList(parseContext, name2)) {
                        Object obj = jSONObject.get(name2);
                        if (obj != null) {
                            String obj2 = obj.toString();
                            StringBuilder sb = new StringBuilder();
                            sb.append(str3);
                            sb.append("/");
                            sb.append(name2);
                            boolean a2 = b.a(sb.toString(), str2, obj2);
                            StringBuilder sb2 = new StringBuilder("signKey ");
                            sb2.append(name2);
                            sb2.append(" signValue ");
                            sb2.append(obj2);
                            sb2.append(" result:");
                            sb2.append(a2);
                            sb2.append(" cost:");
                            sb2.append(System.currentTimeMillis() - currentTimeMillis);
                            RVLogger.d(TAG, sb2.toString());
                            if (!a2) {
                                throw new a(6, "VERIFY_FAIL");
                            }
                        } else {
                            StringBuilder sb3 = new StringBuilder("entry ");
                            sb3.append(name2);
                            sb3.append(" has no cert!");
                            throw new a(6, sb3.toString());
                        }
                    }
                }
            } catch (Exception e) {
                RVLogger.e(TAG, (Throwable) e);
                throw new a(7, e.getMessage());
            }
        } else {
            RVLogger.w(TAG, "cert not exists!");
            throw new a(4, "CERT_PATH_NOT_EXIST");
        }
    }

    private static boolean inBlackList(ParseContext parseContext, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (parseContext.ignorePatterns != null) {
            for (Pattern matcher : parseContext.ignorePatterns) {
                if (matcher.matcher(str).matches()) {
                    return true;
                }
            }
        }
        if (TextUtils.equals(str, "CERT.json") || TextUtils.equals(str, "SIGN.json") || str.startsWith(RVConstants.PKG_EXT_PREFIX) || str.startsWith(RVConstants.SUB_PACKAGE_DIR_PREFIX) || str.contains("ios") || str.contains("hpmfile.json")) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: com.alibaba.ariver.resource.parser.a.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: com.alibaba.ariver.resource.parser.a.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.alibaba.ariver.resource.parser.a.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: com.alibaba.ariver.resource.parser.a.e} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.alibaba.ariver.resource.parser.a.c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.alibaba.ariver.resource.parser.a.e} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void fastReadTarIntoMemory(java.util.Map<java.lang.String, com.alibaba.ariver.engine.api.resources.Resource> r7, java.lang.String r8, com.alibaba.ariver.resource.parser.ParseContext r9) {
        /*
            long r0 = com.alibaba.ariver.kernel.common.utils.FileUtils.calculateSize((java.lang.String) r8)
            boolean r2 = com.alibaba.ariver.kernel.common.utils.IOUtils.isNIOEnabled()
            r3 = 0
            java.lang.String r4 = "AriverRes:PackageParseUtils"
            if (r2 == 0) goto L_0x007f
            r5 = 5242880(0x500000, double:2.590327E-317)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L_0x007f
            r5 = 65536(0x10000, double:3.2379E-319)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L_0x007f
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String r1 = "parse tar file with NIO "
            java.lang.String r0 = r1.concat(r0)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)
            r0 = 2048(0x800, float:2.87E-42)
            byte[] r0 = com.alibaba.ariver.kernel.common.utils.IOUtils.getBuf(r0)
            com.alibaba.ariver.resource.parser.a.c r1 = new com.alibaba.ariver.resource.parser.a.c     // Catch:{ all -> 0x0077 }
            r1.<init>(r8)     // Catch:{ all -> 0x0077 }
        L_0x0033:
            com.alibaba.ariver.resource.parser.a.b r8 = r1.a()     // Catch:{ all -> 0x0074 }
            if (r8 == 0) goto L_0x006d
            java.lang.String r2 = r8.a()     // Catch:{ all -> 0x0074 }
            boolean r8 = r8.c()     // Catch:{ all -> 0x0074 }
            if (r8 != 0) goto L_0x0033
            boolean r8 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x0074 }
            if (r8 != 0) goto L_0x0033
            boolean r8 = inBlackList(r9, r2)     // Catch:{ all -> 0x0074 }
            if (r8 != 0) goto L_0x0033
            com.alibaba.ariver.kernel.common.io.PoolingByteArrayOutputStream r8 = new com.alibaba.ariver.kernel.common.io.PoolingByteArrayOutputStream     // Catch:{ all -> 0x0074 }
            r8.<init>()     // Catch:{ all -> 0x0074 }
        L_0x0054:
            int r3 = r1.a((byte[]) r0)     // Catch:{ all -> 0x0074 }
            r4 = -1
            if (r3 == r4) goto L_0x0060
            r4 = 0
            r8.write(r0, r4, r3)     // Catch:{ all -> 0x0074 }
            goto L_0x0054
        L_0x0060:
            byte[] r3 = r8.toByteArray()     // Catch:{ all -> 0x0074 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r8)     // Catch:{ all -> 0x0074 }
            if (r3 == 0) goto L_0x0033
            putData(r7, r9, r2, r3)     // Catch:{ all -> 0x0074 }
            goto L_0x0033
        L_0x006d:
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r0)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r1)
            return
        L_0x0074:
            r7 = move-exception
            r3 = r1
            goto L_0x0078
        L_0x0077:
            r7 = move-exception
        L_0x0078:
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r0)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r3)
            throw r7
        L_0x007f:
            java.lang.String r0 = java.lang.String.valueOf(r8)
            java.lang.String r1 = "parse tar file with Stream "
            java.lang.String r0 = r1.concat(r0)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ all -> 0x00a5 }
            r0.<init>(r8)     // Catch:{ all -> 0x00a5 }
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00a5 }
            r8.<init>(r0)     // Catch:{ all -> 0x00a5 }
            com.alibaba.ariver.resource.parser.a.e r0 = new com.alibaba.ariver.resource.parser.a.e     // Catch:{ all -> 0x00a5 }
            r0.<init>(r8)     // Catch:{ all -> 0x00a5 }
            readTarStreamIntoMemory(r7, r0, r9)     // Catch:{ all -> 0x00a2 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r0)
            return
        L_0x00a2:
            r7 = move-exception
            r3 = r0
            goto L_0x00a6
        L_0x00a5:
            r7 = move-exception
        L_0x00a6:
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r3)
            goto L_0x00ab
        L_0x00aa:
            throw r7
        L_0x00ab:
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.resource.parser.PackageParseUtils.fastReadTarIntoMemory(java.util.Map, java.lang.String, com.alibaba.ariver.resource.parser.ParseContext):void");
    }

    public static void readTarStreamIntoMemory(Map<String, Resource> map, e eVar, ParseContext parseContext) {
        byte[] buf = IOUtils.getBuf(2048);
        while (true) {
            try {
                b a2 = eVar.a();
                if (a2 != null) {
                    String a3 = a2.a();
                    if (!a2.c() && !TextUtils.isEmpty(a3) && !inBlackList(parseContext, a3)) {
                        PoolingByteArrayOutputStream poolingByteArrayOutputStream = new PoolingByteArrayOutputStream();
                        while (true) {
                            int read = eVar.read(buf);
                            if (read == -1) {
                                break;
                            }
                            poolingByteArrayOutputStream.write(buf, 0, read);
                        }
                        byte[] byteArray = poolingByteArrayOutputStream.toByteArray();
                        IOUtils.closeQuietly(poolingByteArrayOutputStream);
                        if (byteArray != null) {
                            putData(map, parseContext, a3, byteArray);
                        }
                    }
                } else {
                    return;
                }
            } finally {
                IOUtils.returnBuf(buf);
                IOUtils.closeQuietly(eVar);
            }
        }
    }

    private static void putData(Map<String, Resource> map, ParseContext parseContext, String str, byte[] bArr) {
        if (!str.startsWith("_animation")) {
            if (!TextUtils.isEmpty(parseContext.onlineHost)) {
                str = FileUtils.combinePath(parseContext.onlineHost, str);
            } else if (str.contains("/")) {
                str = "https://".concat(String.valueOf(str));
            }
        }
        RVLogger.d(TAG, "readTarStreamIntoMemory entryName ".concat(String.valueOf(str)));
        map.put(str, new OfflineResource(str, bArr));
    }
}
