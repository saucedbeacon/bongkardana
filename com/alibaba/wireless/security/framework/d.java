package com.alibaba.wireless.security.framework;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.alibaba.wireless.security.SecExceptionCode;
import com.alibaba.wireless.security.framework.utils.UserTrackMethodJniBridge;
import com.alibaba.wireless.security.framework.utils.b;
import com.alibaba.wireless.security.framework.utils.c;
import com.alibaba.wireless.security.framework.utils.f;
import com.alibaba.wireless.security.open.SecException;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import dalvik.system.DexClassLoader;
import dalvik.system.PathClassLoader;
import id.dana.lib.gcontainer.app.bridge.logging.H5GetLogInfoBridge;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class d implements ISGPluginManager {
    private static String[] n = {"armeabi", "armeabi-v7a", "x86", "arm64-v8a", "x86_64"};

    /* renamed from: o  reason: collision with root package name */
    private static String f9210o = null;
    private static volatile boolean p = true;

    /* renamed from: a  reason: collision with root package name */
    HashMap<Class, Object> f9211a = new HashMap<>();
    c b = null;
    /* access modifiers changed from: private */
    public Context c;
    private final HashMap<String, c> d = new HashMap<>();
    private IRouterComponent e = null;
    private boolean f = true;
    private String g = null;
    private String h = null;
    private b i = null;
    private boolean j = false;
    private File k = null;
    private File l = null;
    private File m = null;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        File f9214a;
        File b;
        File c;
        boolean d;

        public a(File file, File file2, File file3, boolean z) {
            this.f9214a = file;
            this.b = file2;
            this.c = file3;
            this.d = z;
        }
    }

    private int a(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int length = split.length < split2.length ? split.length : split2.length;
        for (int i2 = 0; i2 < length; i2++) {
            int parseInt = Integer.parseInt(split[i2]);
            int parseInt2 = Integer.parseInt(split2[i2]);
            if (parseInt > parseInt2) {
                return 1;
            }
            if (parseInt < parseInt2) {
                return -1;
            }
        }
        return 0;
    }

    private PackageInfo a(String str, a aVar, String str2) throws SecException {
        PackageInfo packageInfo;
        String str3 = "";
        try {
            packageInfo = this.c.getPackageManager().getPackageArchiveInfo(aVar.f9214a.getAbsolutePath(), 133);
        } catch (Throwable th) {
            String concat = str3.concat(String.valueOf(th));
            StringBuilder sb = new StringBuilder();
            sb.append(aVar.f9214a.getAbsolutePath());
            a(100043, SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR, "getPackageArchiveInfo failed", concat, c(sb.toString()), aVar.c != null ? c(aVar.c.getAbsolutePath()) : str3, str2);
            if (aVar.f9214a.exists() && !b(aVar.f9214a)) {
                aVar.f9214a.delete();
            }
            packageInfo = null;
        }
        if (packageInfo != null) {
            return packageInfo;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("[");
        sb2.append(str2);
        sb2.append("]");
        String obj = sb2.toString();
        String c2 = c(aVar.f9214a.getAbsolutePath());
        if (aVar.c != null) {
            str3 = c(aVar.c.getAbsolutePath());
        }
        a(100043, SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR, "packageInfo == null", obj, c2, str3, c());
        throw new SecException(SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:149:0x047c, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x047d, code lost:
        r27 = "zipfile:";
        r22 = r12;
        r26 = "src:";
        r13 = r6;
        r39 = r23;
        r23 = r15;
        r15 = r39;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x04ab A[Catch:{ SecException -> 0x059b, all -> 0x0535, all -> 0x05fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x0540 A[Catch:{ SecException -> 0x059b, all -> 0x0535, all -> 0x05fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ba A[SYNTHETIC, Splitter:B:32:0x00ba] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00fc A[Catch:{ SecException -> 0x059b, all -> 0x0535, all -> 0x05fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0129  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x012c A[SYNTHETIC, Splitter:B:40:0x012c] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0151  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x01b3 A[SYNTHETIC, Splitter:B:57:0x01b3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.alibaba.wireless.security.framework.c a(java.lang.String r41, com.alibaba.wireless.security.framework.d.a r42, android.content.Context r43, java.lang.String r44) throws com.alibaba.wireless.security.open.SecException {
        /*
            r40 = this;
            r9 = r40
            r0 = r41
            r10 = r42
            r8 = r44
            java.lang.String r1 = "so-"
            java.lang.String r11 = com.alibaba.wireless.security.framework.utils.a.a()
            long r2 = com.alibaba.wireless.security.framework.utils.a.b()
            java.io.File r4 = r10.f9214a
            java.lang.String r7 = r4.getAbsolutePath()
            java.io.File r4 = r10.b
            java.lang.String r12 = r4.getAbsolutePath()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r12)
            java.lang.String r13 = java.io.File.separator
            r6.append(r13)
            r6.append(r0)
            java.lang.String r13 = "_"
            r6.append(r13)
            java.io.File r13 = r10.f9214a
            long r13 = r13.lastModified()
            r15 = 1000(0x3e8, double:4.94E-321)
            long r13 = r13 / r15
            r6.append(r13)
            java.lang.String r13 = ".pkgInfo"
            r6.append(r13)
            java.lang.String r6 = r6.toString()
            com.alibaba.wireless.security.framework.a r13 = new com.alibaba.wireless.security.framework.a
            r13.<init>(r6)
            boolean r6 = r13.a()     // Catch:{ all -> 0x05fe }
            java.lang.String r14 = "thirdpartyso"
            java.lang.String r15 = "pluginclass"
            r17 = r4
            java.lang.String r4 = "hasso"
            r18 = r5
            java.lang.String r5 = "dependencies"
            r19 = 1
            r20 = 0
            r21 = r12
            if (r6 == 0) goto L_0x00b1
            android.content.Context r6 = r9.c     // Catch:{ all -> 0x05fe }
            boolean r6 = com.alibaba.wireless.security.framework.utils.f.a(r6)     // Catch:{ all -> 0x05fe }
            if (r6 != 0) goto L_0x00b1
            org.json.JSONObject r6 = r13.b()     // Catch:{ JSONException -> 0x00ac, Exception -> 0x00a7 }
            java.lang.String r12 = "version"
            java.lang.String r12 = r6.getString(r12)     // Catch:{ JSONException -> 0x00ac, Exception -> 0x00a7 }
            java.lang.String r22 = r6.getString(r5)     // Catch:{ JSONException -> 0x00a4, Exception -> 0x00a1 }
            java.lang.String r23 = r6.getString(r4)     // Catch:{ Exception | JSONException -> 0x009e }
            boolean r23 = java.lang.Boolean.parseBoolean(r23)     // Catch:{ Exception | JSONException -> 0x009e }
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r23)     // Catch:{ Exception | JSONException -> 0x009e }
            java.lang.String r23 = r6.getString(r15)     // Catch:{ Exception | JSONException -> 0x009e }
            boolean r6 = r6.getBoolean(r14)     // Catch:{ Exception | JSONException -> 0x00b7 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception | JSONException -> 0x00b7 }
            r18 = r6
            r6 = 1
            goto L_0x00b8
        L_0x009e:
            r23 = r20
            goto L_0x00b7
        L_0x00a1:
            r22 = r20
            goto L_0x00b5
        L_0x00a4:
            r22 = r20
            goto L_0x00b5
        L_0x00a7:
            r12 = r20
            r22 = r12
            goto L_0x00b5
        L_0x00ac:
            r12 = r20
            r22 = r12
            goto L_0x00b5
        L_0x00b1:
            r12 = r20
            r22 = r12
        L_0x00b5:
            r23 = r22
        L_0x00b7:
            r6 = 0
        L_0x00b8:
            if (r6 != 0) goto L_0x00fc
            android.content.pm.PackageInfo r6 = r9.a((java.lang.String) r0, (com.alibaba.wireless.security.framework.d.a) r10, (java.lang.String) r8)     // Catch:{ all -> 0x05fe }
            java.lang.String r12 = r6.versionName     // Catch:{ all -> 0x05fe }
            r17 = r12
            android.content.pm.ApplicationInfo r12 = r6.applicationInfo     // Catch:{ all -> 0x05fe }
            android.os.Bundle r12 = r12.metaData     // Catch:{ all -> 0x05fe }
            java.lang.String r5 = r12.getString(r5)     // Catch:{ all -> 0x05fe }
            android.content.pm.ApplicationInfo r12 = r6.applicationInfo     // Catch:{ all -> 0x05fe }
            android.os.Bundle r12 = r12.metaData     // Catch:{ all -> 0x05fe }
            r18 = r5
            r5 = 0
            boolean r4 = r12.getBoolean(r4, r5)     // Catch:{ all -> 0x05fe }
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x05fe }
            android.content.pm.ApplicationInfo r5 = r6.applicationInfo     // Catch:{ all -> 0x05fe }
            android.os.Bundle r5 = r5.metaData     // Catch:{ all -> 0x05fe }
            java.lang.String r23 = r5.getString(r15)     // Catch:{ all -> 0x05fe }
            android.content.pm.ApplicationInfo r5 = r6.applicationInfo     // Catch:{ all -> 0x05fe }
            android.os.Bundle r5 = r5.metaData     // Catch:{ all -> 0x05fe }
            r12 = 0
            boolean r5 = r5.getBoolean(r14, r12)     // Catch:{ all -> 0x05fe }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ all -> 0x05fe }
            r13.f9207a = r6     // Catch:{ all -> 0x05fe }
            r13.a(r6, r0)     // Catch:{ all -> 0x05fe }
            r14 = r17
            r12 = r18
            r17 = r4
            r18 = r5
            goto L_0x00ff
        L_0x00fc:
            r14 = r12
            r12 = r22
        L_0x00ff:
            java.lang.String r4 = "getPackageInfo"
            com.alibaba.wireless.security.framework.utils.a.a(r0, r11, r4, r2)     // Catch:{ all -> 0x05fe }
            long r5 = com.alibaba.wireless.security.framework.utils.a.b()     // Catch:{ all -> 0x05fe }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r2.<init>()     // Catch:{ all -> 0x05fe }
            r2.append(r0)     // Catch:{ all -> 0x05fe }
            java.lang.String r3 = "("
            r2.append(r3)     // Catch:{ all -> 0x05fe }
            r2.append(r14)     // Catch:{ all -> 0x05fe }
            java.lang.String r3 = ")"
            r2.append(r3)     // Catch:{ all -> 0x05fe }
            java.lang.String r15 = r2.toString()     // Catch:{ all -> 0x05fe }
            int r2 = r44.length()     // Catch:{ all -> 0x05fe }
            java.lang.String r4 = "->"
            if (r2 != 0) goto L_0x012c
            r2 = r15
        L_0x012a:
            r3 = 0
            goto L_0x013f
        L_0x012c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r2.<init>()     // Catch:{ all -> 0x05fe }
            r2.append(r8)     // Catch:{ all -> 0x05fe }
            r2.append(r4)     // Catch:{ all -> 0x05fe }
            r2.append(r15)     // Catch:{ all -> 0x05fe }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x05fe }
            goto L_0x012a
        L_0x013f:
            boolean r2 = r9.a((java.lang.String) r12, (java.lang.String) r2, (boolean) r3)     // Catch:{ all -> 0x05fe }
            r3 = 199(0xc7, float:2.79E-43)
            r22 = r13
            java.lang.String r13 = "src:"
            r24 = r11
            java.lang.String r11 = "zipfile:"
            if (r2 != 0) goto L_0x01b3
            r2 = 100043(0x186cb, float:1.4019E-40)
            r0 = 199(0xc7, float:2.79E-43)
            java.lang.String r5 = "loadRequirements failed"
            int r1 = r44.length()     // Catch:{ all -> 0x05fe }
            if (r1 != 0) goto L_0x0160
            r6 = r15
            goto L_0x0173
        L_0x0160:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r1.<init>()     // Catch:{ all -> 0x05fe }
            r1.append(r8)     // Catch:{ all -> 0x05fe }
            r1.append(r4)     // Catch:{ all -> 0x05fe }
            r1.append(r15)     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x05fe }
            r6 = r1
        L_0x0173:
            java.io.File r1 = r10.c     // Catch:{ all -> 0x05fe }
            if (r1 == 0) goto L_0x018a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r1.<init>(r13)     // Catch:{ all -> 0x05fe }
            java.io.File r4 = r10.c     // Catch:{ all -> 0x05fe }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x05fe }
            java.lang.String r4 = r9.c((java.lang.String) r4)     // Catch:{ all -> 0x05fe }
            r1.append(r4)     // Catch:{ all -> 0x05fe }
            goto L_0x019c
        L_0x018a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r1.<init>(r11)     // Catch:{ all -> 0x05fe }
            java.io.File r4 = r10.f9214a     // Catch:{ all -> 0x05fe }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x05fe }
            java.lang.String r4 = r9.c((java.lang.String) r4)     // Catch:{ all -> 0x05fe }
            r1.append(r4)     // Catch:{ all -> 0x05fe }
        L_0x019c:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x05fe }
            r7 = r1
            java.lang.String r8 = ""
            r1 = r40
            r10 = 199(0xc7, float:2.79E-43)
            r3 = r0
            r4 = r5
            r5 = r12
            r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x05fe }
            com.alibaba.wireless.security.open.SecException r0 = new com.alibaba.wireless.security.open.SecException     // Catch:{ all -> 0x05fe }
            r0.<init>(r10)     // Catch:{ all -> 0x05fe }
            throw r0     // Catch:{ all -> 0x05fe }
        L_0x01b3:
            r9.b((java.lang.String) r0, (java.lang.String) r14)     // Catch:{ SecException -> 0x059b }
            boolean r2 = r17.booleanValue()     // Catch:{ all -> 0x05fe }
            r25 = r12
            java.lang.String r12 = ""
            if (r2 == 0) goto L_0x0274
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            java.lang.String r3 = "libsg"
            r2.<init>(r3)     // Catch:{ all -> 0x05fe }
            r2.append(r0)     // Catch:{ all -> 0x05fe }
            r2.append(r1)     // Catch:{ all -> 0x05fe }
            r2.append(r14)     // Catch:{ all -> 0x05fe }
            java.lang.String r3 = ".so"
            r2.append(r3)     // Catch:{ all -> 0x05fe }
            java.lang.String r27 = r2.toString()     // Catch:{ all -> 0x05fe }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            java.lang.String r3 = "sg"
            r2.<init>(r3)     // Catch:{ all -> 0x05fe }
            r2.append(r0)     // Catch:{ all -> 0x05fe }
            r2.append(r1)     // Catch:{ all -> 0x05fe }
            r2.append(r14)     // Catch:{ all -> 0x05fe }
            java.lang.String r28 = r2.toString()     // Catch:{ all -> 0x05fe }
            java.io.File r3 = r10.c     // Catch:{ all -> 0x05fe }
            boolean r2 = r10.d     // Catch:{ all -> 0x05fe }
            r1 = r40
            r29 = r2
            r2 = r7
            r26 = r3
            r30 = r12
            r12 = 199(0xc7, float:2.79E-43)
            r3 = r21
            r12 = r4
            r4 = r26
            r31 = r5
            r5 = r27
            r6 = r29
            boolean r1 = r1.a((java.lang.String) r2, (java.lang.String) r3, (java.io.File) r4, (java.lang.String) r5, (boolean) r6)     // Catch:{ all -> 0x05fe }
            if (r1 != 0) goto L_0x026f
            r2 = 100043(0x186cb, float:1.4019E-40)
            r3 = 107(0x6b, float:1.5E-43)
            java.lang.String r4 = ""
            int r0 = r44.length()     // Catch:{ all -> 0x05fe }
            if (r0 != 0) goto L_0x021d
            r6 = r15
            goto L_0x0230
        L_0x021d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r0.<init>()     // Catch:{ all -> 0x05fe }
            r0.append(r8)     // Catch:{ all -> 0x05fe }
            r0.append(r12)     // Catch:{ all -> 0x05fe }
            r0.append(r15)     // Catch:{ all -> 0x05fe }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x05fe }
            r6 = r0
        L_0x0230:
            java.io.File r0 = r10.c     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x0247
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r0.<init>(r13)     // Catch:{ all -> 0x05fe }
            java.io.File r1 = r10.c     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r9.c((java.lang.String) r1)     // Catch:{ all -> 0x05fe }
            r0.append(r1)     // Catch:{ all -> 0x05fe }
            goto L_0x0259
        L_0x0247:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r0.<init>(r11)     // Catch:{ all -> 0x05fe }
            java.io.File r1 = r10.f9214a     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r9.c((java.lang.String) r1)     // Catch:{ all -> 0x05fe }
            r0.append(r1)     // Catch:{ all -> 0x05fe }
        L_0x0259:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x05fe }
            r7 = r0
            java.lang.String r8 = ""
            r1 = r40
            r5 = r25
            r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x05fe }
            com.alibaba.wireless.security.open.SecException r0 = new com.alibaba.wireless.security.open.SecException     // Catch:{ all -> 0x05fe }
            r1 = 107(0x6b, float:1.5E-43)
            r0.<init>(r1)     // Catch:{ all -> 0x05fe }
            throw r0     // Catch:{ all -> 0x05fe }
        L_0x026f:
            r6 = r27
            r5 = r28
            goto L_0x027c
        L_0x0274:
            r31 = r5
            r30 = r12
            r12 = r4
            r5 = r30
            r6 = r5
        L_0x027c:
            if (r23 != 0) goto L_0x02df
            r2 = 100043(0x186cb, float:1.4019E-40)
            r3 = 199(0xc7, float:2.79E-43)
            java.lang.String r4 = "miss pluginclass"
            int r0 = r44.length()     // Catch:{ all -> 0x05fe }
            if (r0 != 0) goto L_0x028d
            r6 = r15
            goto L_0x02a0
        L_0x028d:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r0.<init>()     // Catch:{ all -> 0x05fe }
            r0.append(r8)     // Catch:{ all -> 0x05fe }
            r0.append(r12)     // Catch:{ all -> 0x05fe }
            r0.append(r15)     // Catch:{ all -> 0x05fe }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x05fe }
            r6 = r0
        L_0x02a0:
            java.io.File r0 = r10.c     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x02b7
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r0.<init>(r13)     // Catch:{ all -> 0x05fe }
            java.io.File r1 = r10.c     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r9.c((java.lang.String) r1)     // Catch:{ all -> 0x05fe }
            r0.append(r1)     // Catch:{ all -> 0x05fe }
            goto L_0x02c9
        L_0x02b7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r0.<init>(r11)     // Catch:{ all -> 0x05fe }
            java.io.File r1 = r10.f9214a     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r9.c((java.lang.String) r1)     // Catch:{ all -> 0x05fe }
            r0.append(r1)     // Catch:{ all -> 0x05fe }
        L_0x02c9:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x05fe }
            r7 = r0
            java.lang.String r8 = ""
            r1 = r40
            r5 = r25
            r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x05fe }
            com.alibaba.wireless.security.open.SecException r0 = new com.alibaba.wireless.security.open.SecException     // Catch:{ all -> 0x05fe }
            r1 = 199(0xc7, float:2.79E-43)
            r0.<init>(r1)     // Catch:{ all -> 0x05fe }
            throw r0     // Catch:{ all -> 0x05fe }
        L_0x02df:
            java.lang.String r4 = r23.trim()     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = "extractSoInPlugin"
            r23 = r6
            r3 = r24
            r24 = r5
            r5 = r31
            com.alibaba.wireless.security.framework.utils.a.a(r0, r3, r1, r5)     // Catch:{ all -> 0x05fe }
            long r1 = com.alibaba.wireless.security.framework.utils.a.b()     // Catch:{ all -> 0x05fe }
            boolean r5 = r10.d     // Catch:{ all -> 0x05fe }
            r6 = r21
            java.lang.ClassLoader r5 = r9.b(r7, r6, r5)     // Catch:{ all -> 0x05fe }
            java.lang.Class r21 = r9.a((java.lang.ClassLoader) r5, (java.lang.String) r4)     // Catch:{ all -> 0x05fe }
            r26 = r5
            java.lang.String r5 = "createClassLoader"
            com.alibaba.wireless.security.framework.utils.a.a(r0, r3, r5, r1)     // Catch:{ all -> 0x05fe }
            long r1 = com.alibaba.wireless.security.framework.utils.a.b()     // Catch:{ all -> 0x05fe }
            if (r21 != 0) goto L_0x0384
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = "load "
            r0.<init>(r1)     // Catch:{ all -> 0x05fe }
            r0.append(r4)     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = " failed from plugin "
            r0.append(r1)     // Catch:{ all -> 0x05fe }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x05fe }
            com.alibaba.wireless.security.framework.utils.a.b(r0)     // Catch:{ all -> 0x05fe }
            r2 = 100043(0x186cb, float:1.4019E-40)
            r3 = 199(0xc7, float:2.79E-43)
            java.lang.String r0 = "clazz == null"
            int r1 = r44.length()     // Catch:{ all -> 0x05fe }
            if (r1 != 0) goto L_0x0332
            r6 = r15
            goto L_0x0345
        L_0x0332:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r1.<init>()     // Catch:{ all -> 0x05fe }
            r1.append(r8)     // Catch:{ all -> 0x05fe }
            r1.append(r12)     // Catch:{ all -> 0x05fe }
            r1.append(r15)     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x05fe }
            r6 = r1
        L_0x0345:
            java.io.File r1 = r10.c     // Catch:{ all -> 0x05fe }
            if (r1 == 0) goto L_0x035c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r1.<init>(r13)     // Catch:{ all -> 0x05fe }
            java.io.File r5 = r10.c     // Catch:{ all -> 0x05fe }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ all -> 0x05fe }
            java.lang.String r5 = r9.c((java.lang.String) r5)     // Catch:{ all -> 0x05fe }
            r1.append(r5)     // Catch:{ all -> 0x05fe }
            goto L_0x036e
        L_0x035c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r1.<init>(r11)     // Catch:{ all -> 0x05fe }
            java.io.File r5 = r10.f9214a     // Catch:{ all -> 0x05fe }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ all -> 0x05fe }
            java.lang.String r5 = r9.c((java.lang.String) r5)     // Catch:{ all -> 0x05fe }
            r1.append(r5)     // Catch:{ all -> 0x05fe }
        L_0x036e:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x05fe }
            r7 = r1
            r1 = r40
            r8 = r4
            r4 = r0
            r5 = r25
            r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x05fe }
            com.alibaba.wireless.security.open.SecException r0 = new com.alibaba.wireless.security.open.SecException     // Catch:{ all -> 0x05fe }
            r1 = 199(0xc7, float:2.79E-43)
            r0.<init>(r1)     // Catch:{ all -> 0x05fe }
            throw r0     // Catch:{ all -> 0x05fe }
        L_0x0384:
            java.lang.Object r4 = r21.newInstance()     // Catch:{ InstantiationException -> 0x058e, IllegalAccessException -> 0x058a, SecException -> 0x047c }
            r33 = r4
            com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin r33 = (com.alibaba.wireless.security.open.initialize.ISecurityGuardPlugin) r33     // Catch:{ InstantiationException -> 0x058e, IllegalAccessException -> 0x058a, SecException -> 0x047c }
            com.alibaba.wireless.security.framework.c r21 = new com.alibaba.wireless.security.framework.c     // Catch:{ InstantiationException -> 0x058e, IllegalAccessException -> 0x058a, SecException -> 0x047c }
            r4 = r1
            r1 = r21
            r2 = r7
            r7 = r3
            r3 = r40
            r27 = r11
            r10 = r4
            r4 = r41
            r25 = r26
            r5 = r25
            r26 = r13
            r13 = r6
            r39 = r23
            r23 = r15
            r15 = r39
            r6 = r22
            r22 = r12
            r12 = r7
            r7 = r33
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ InstantiationException -> 0x058e, IllegalAccessException -> 0x058a, SecException -> 0x047a }
            java.lang.String r1 = r40.getMainPluginName()     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            boolean r1 = r0.equalsIgnoreCase(r1)     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            r2 = 3
            r3 = 2
            if (r1 == 0) goto L_0x042a
            boolean r1 = r9.f     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            boolean r4 = r9.j     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            if (r4 == 0) goto L_0x03c5
            r1 = r1 | 2
        L_0x03c5:
            java.lang.String r4 = r9.g     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            if (r4 == 0) goto L_0x03d3
            java.lang.String r4 = r9.g     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            int r4 = r4.length()     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            if (r4 <= 0) goto L_0x03d3
            r1 = r1 | 4
        L_0x03d3:
            android.content.Context r4 = r9.c     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            boolean r4 = com.alibaba.wireless.security.framework.utils.f.a(r4)     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            if (r4 == 0) goto L_0x03dd
            r1 = r1 | 8
        L_0x03dd:
            android.content.Context r4 = r9.c     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            boolean r4 = com.alibaba.wireless.security.framework.utils.f.b(r4)     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            if (r4 == 0) goto L_0x03e7
            r1 = r1 | 16
        L_0x03e7:
            com.alibaba.wireless.security.framework.b r4 = r9.i     // Catch:{ Exception -> 0x03f6 }
            if (r4 == 0) goto L_0x03f6
            com.alibaba.wireless.security.framework.b r4 = r9.i     // Catch:{ Exception -> 0x03f6 }
            org.json.JSONObject r4 = r4.a()     // Catch:{ Exception -> 0x03f6 }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x03f6 }
            goto L_0x03f8
        L_0x03f6:
            r4 = r30
        L_0x03f8:
            r35 = 0
            r5 = 4
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            r6 = 0
            r5[r6] = r1     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            r5[r19] = r4     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            java.io.File r1 = r9.l     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            r5[r3] = r1     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            java.lang.String r1 = r9.h     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            r5[r2] = r1     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            r34 = r43
            r36 = r21
            r37 = r24
            r38 = r5
            com.alibaba.wireless.security.framework.IRouterComponent r1 = r33.onPluginLoaded(r34, r35, r36, r37, r38)     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            r9.e = r1     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            java.lang.String r1 = "onPluginLoaded"
            com.alibaba.wireless.security.framework.utils.a.a(r0, r12, r1, r10)     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            long r4 = com.alibaba.wireless.security.framework.utils.a.b()     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            goto L_0x0441
        L_0x042a:
            r4 = 0
            com.alibaba.wireless.security.framework.SGPluginExtras.slot = r4     // Catch:{ all -> 0x046c }
            com.alibaba.wireless.security.framework.IRouterComponent r1 = r9.e     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            r34 = r43
            r35 = r1
            r36 = r21
            r37 = r24
            r38 = r5
            r33.onPluginLoaded(r34, r35, r36, r37, r38)     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            r4 = r10
        L_0x0441:
            boolean r1 = r17.booleanValue()     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            if (r1 == 0) goto L_0x0596
            boolean r1 = r18.booleanValue()     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            if (r1 != 0) goto L_0x0596
            r6 = r24
            r1 = r25
            java.lang.String r1 = com.alibaba.wireless.security.framework.utils.f.a(r1, r6)     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            com.alibaba.wireless.security.framework.IRouterComponent r6 = r9.e     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            r7 = 10102(0x2776, float:1.4156E-41)
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            r10 = 0
            r2[r10] = r0     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            r2[r19] = r14     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            r2[r3] = r1     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            r6.doCommand(r7, r2)     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            java.lang.String r1 = "10102"
            com.alibaba.wireless.security.framework.utils.a.a(r0, r12, r1, r4)     // Catch:{ InstantiationException -> 0x0475, IllegalAccessException -> 0x0470, SecException -> 0x047a }
            goto L_0x0596
        L_0x046c:
            r0 = move-exception
            r1 = r4
            goto L_0x0601
        L_0x0470:
            r0 = move-exception
            r20 = r21
            goto L_0x058b
        L_0x0475:
            r0 = move-exception
            r20 = r21
            goto L_0x058f
        L_0x047a:
            r0 = move-exception
            goto L_0x048a
        L_0x047c:
            r0 = move-exception
            r27 = r11
            r22 = r12
            r26 = r13
            r13 = r6
            r39 = r23
            r23 = r15
            r15 = r39
        L_0x048a:
            java.io.File r10 = new java.io.File     // Catch:{ all -> 0x05fe }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r1.<init>()     // Catch:{ all -> 0x05fe }
            r1.append(r13)     // Catch:{ all -> 0x05fe }
            java.lang.String r2 = java.io.File.separator     // Catch:{ all -> 0x05fe }
            r1.append(r2)     // Catch:{ all -> 0x05fe }
            r1.append(r15)     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x05fe }
            r10.<init>(r1)     // Catch:{ all -> 0x05fe }
            int r1 = r0.getErrorCode()     // Catch:{ all -> 0x05fe }
            r2 = 103(0x67, float:1.44E-43)
            if (r1 != r2) goto L_0x0540
            r2 = 100043(0x186cb, float:1.4019E-40)
            r3 = 103(0x67, float:1.44E-43)
            java.lang.String r4 = ""
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x05fe }
            int r1 = r44.length()     // Catch:{ all -> 0x05fe }
            if (r1 != 0) goto L_0x04c1
            r11 = r42
            r6 = r23
            goto L_0x04da
        L_0x04c1:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r1.<init>()     // Catch:{ all -> 0x05fe }
            r1.append(r8)     // Catch:{ all -> 0x05fe }
            r6 = r22
            r1.append(r6)     // Catch:{ all -> 0x05fe }
            r7 = r23
            r1.append(r7)     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x05fe }
            r11 = r42
            r6 = r1
        L_0x04da:
            java.io.File r1 = r11.c     // Catch:{ all -> 0x05fe }
            if (r1 == 0) goto L_0x04f3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r12 = r26
            r1.<init>(r12)     // Catch:{ all -> 0x05fe }
            java.io.File r7 = r11.c     // Catch:{ all -> 0x05fe }
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ all -> 0x05fe }
            java.lang.String r7 = r9.c((java.lang.String) r7)     // Catch:{ all -> 0x05fe }
            r1.append(r7)     // Catch:{ all -> 0x05fe }
            goto L_0x0507
        L_0x04f3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r13 = r27
            r1.<init>(r13)     // Catch:{ all -> 0x05fe }
            java.io.File r7 = r11.f9214a     // Catch:{ all -> 0x05fe }
            java.lang.String r7 = r7.getAbsolutePath()     // Catch:{ all -> 0x05fe }
            java.lang.String r7 = r9.c((java.lang.String) r7)     // Catch:{ all -> 0x05fe }
            r1.append(r7)     // Catch:{ all -> 0x05fe }
        L_0x0507:
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x05fe }
            r7 = r1
            java.lang.String r1 = r10.getAbsolutePath()     // Catch:{ all -> 0x05fe }
            java.lang.String r8 = r9.c((java.lang.String) r1)     // Catch:{ all -> 0x05fe }
            r1 = r40
            r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x05fe }
            boolean r1 = r11.d     // Catch:{ all -> 0x0535 }
            if (r1 != 0) goto L_0x0522
            com.alibaba.wireless.security.framework.utils.c r1 = r9.b     // Catch:{ all -> 0x0535 }
            r1.a()     // Catch:{ all -> 0x0535 }
        L_0x0522:
            boolean r1 = r10.exists()     // Catch:{ all -> 0x0535 }
            if (r1 == 0) goto L_0x052b
            r10.delete()     // Catch:{ all -> 0x0535 }
        L_0x052b:
            boolean r1 = r11.d     // Catch:{ all -> 0x05fe }
            if (r1 != 0) goto L_0x0589
            com.alibaba.wireless.security.framework.utils.c r1 = r9.b     // Catch:{ all -> 0x05fe }
            r1.b()     // Catch:{ all -> 0x05fe }
            goto L_0x0589
        L_0x0535:
            r0 = move-exception
            boolean r1 = r11.d     // Catch:{ all -> 0x05fe }
            if (r1 != 0) goto L_0x053f
            com.alibaba.wireless.security.framework.utils.c r1 = r9.b     // Catch:{ all -> 0x05fe }
            r1.b()     // Catch:{ all -> 0x05fe }
        L_0x053f:
            throw r0     // Catch:{ all -> 0x05fe }
        L_0x0540:
            r11 = r42
            r2 = 100043(0x186cb, float:1.4019E-40)
            r3 = 199(0xc7, float:2.79E-43)
            java.lang.String r4 = "native exception occurred"
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x05fe }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            java.lang.String r6 = "soName="
            r1.<init>(r6)     // Catch:{ all -> 0x05fe }
            r1.append(r15)     // Catch:{ all -> 0x05fe }
            java.lang.String r6 = ", authCode="
            r1.append(r6)     // Catch:{ all -> 0x05fe }
            java.lang.String r6 = r9.h     // Catch:{ all -> 0x05fe }
            r1.append(r6)     // Catch:{ all -> 0x05fe }
            java.lang.String r6 = ", errorCode="
            r1.append(r6)     // Catch:{ all -> 0x05fe }
            int r6 = r0.getErrorCode()     // Catch:{ all -> 0x05fe }
            r1.append(r6)     // Catch:{ all -> 0x05fe }
            java.lang.String r6 = r1.toString()     // Catch:{ all -> 0x05fe }
            java.io.File r1 = r11.f9214a     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x05fe }
            java.lang.String r7 = r9.c((java.lang.String) r1)     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r10.getAbsolutePath()     // Catch:{ all -> 0x05fe }
            java.lang.String r8 = r9.c((java.lang.String) r1)     // Catch:{ all -> 0x05fe }
            r1 = r40
            r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x05fe }
        L_0x0589:
            throw r0     // Catch:{ all -> 0x05fe }
        L_0x058a:
            r0 = move-exception
        L_0x058b:
            r1 = r30
            goto L_0x0591
        L_0x058e:
            r0 = move-exception
        L_0x058f:
            r1 = r30
        L_0x0591:
            com.alibaba.wireless.security.framework.utils.a.a(r1, r0)     // Catch:{ all -> 0x05fe }
            r21 = r20
        L_0x0596:
            r1 = 0
            com.alibaba.wireless.security.framework.SGPluginExtras.slot = r1
            return r21
        L_0x059b:
            r0 = move-exception
            r6 = r4
            r25 = r12
            r12 = r13
            r7 = r15
            r13 = r11
            r11 = r10
            r10 = r0
            r2 = 100043(0x186cb, float:1.4019E-40)
            r3 = 199(0xc7, float:2.79E-43)
            java.lang.String r4 = "isMeetReverseDependencies failed"
            int r0 = r44.length()     // Catch:{ all -> 0x05fe }
            if (r0 != 0) goto L_0x05b3
            r6 = r7
            goto L_0x05c6
        L_0x05b3:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r0.<init>()     // Catch:{ all -> 0x05fe }
            r0.append(r8)     // Catch:{ all -> 0x05fe }
            r0.append(r6)     // Catch:{ all -> 0x05fe }
            r0.append(r7)     // Catch:{ all -> 0x05fe }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x05fe }
            r6 = r0
        L_0x05c6:
            java.io.File r0 = r11.c     // Catch:{ all -> 0x05fe }
            if (r0 == 0) goto L_0x05dd
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r0.<init>(r12)     // Catch:{ all -> 0x05fe }
            java.io.File r1 = r11.c     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r9.c((java.lang.String) r1)     // Catch:{ all -> 0x05fe }
            r0.append(r1)     // Catch:{ all -> 0x05fe }
            goto L_0x05ef
        L_0x05dd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x05fe }
            r0.<init>(r13)     // Catch:{ all -> 0x05fe }
            java.io.File r1 = r11.f9214a     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r1.getAbsolutePath()     // Catch:{ all -> 0x05fe }
            java.lang.String r1 = r9.c((java.lang.String) r1)     // Catch:{ all -> 0x05fe }
            r0.append(r1)     // Catch:{ all -> 0x05fe }
        L_0x05ef:
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x05fe }
            r7 = r0
            java.lang.String r8 = ""
            r1 = r40
            r5 = r25
            r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x05fe }
            throw r10     // Catch:{ all -> 0x05fe }
        L_0x05fe:
            r0 = move-exception
            r1 = 0
        L_0x0601:
            com.alibaba.wireless.security.framework.SGPluginExtras.slot = r1
            goto L_0x0605
        L_0x0604:
            throw r0
        L_0x0605:
            goto L_0x0604
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.a(java.lang.String, com.alibaba.wireless.security.framework.d$a, android.content.Context, java.lang.String):com.alibaba.wireless.security.framework.c");
    }

    private File a(Context context) throws SecException {
        if (context != null) {
            String str = null;
            if (context != null) {
                try {
                    String str2 = context.getApplicationInfo().sourceDir;
                    if (str2 != null) {
                        File file = new File(str2);
                        if (file.exists()) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(file.lastModified() / 1000);
                            str = sb.toString();
                        }
                    }
                } catch (Exception e2) {
                    a(100038, 115, "", "".concat(String.valueOf(e2)), "", "", "");
                    throw new SecException((Throwable) e2, 115);
                }
            }
            if (str != null) {
                File dir = context.getDir("SGLib", 0);
                this.l = dir;
                if (dir == null || !dir.exists()) {
                    StringBuilder sb2 = new StringBuilder("");
                    sb2.append(this.l);
                    a(100038, 109, "", sb2.toString(), "", "", "");
                    throw new SecException(109);
                }
                File file2 = new File(this.l.getAbsolutePath(), "app_".concat(String.valueOf(str)));
                if (!file2.exists()) {
                    file2.mkdirs();
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                }
                if (p && file2.exists()) {
                    p = false;
                    a(this.l, "app_".concat(String.valueOf(str)));
                }
                if (file2.exists()) {
                    return file2;
                }
                a(100038, 114, "", "", "", "", "");
                throw new SecException(114);
            }
            throw new SecException(115);
        }
        a(100038, 116, "", "", "", "", "");
        throw new SecException(116);
    }

    private File a(Context context, b bVar) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(449727909, oncanceled);
            onCancelLoad.getMin(449727909, oncanceled);
        }
        if (f.a(context) || bVar == null || bVar.b() == 0 || bVar.c() == null || bVar.c().length() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.k.getAbsolutePath());
        sb.append(File.separator);
        sb.append("libs");
        sb.append(File.separator);
        sb.append(bVar.b());
        sb.append(File.separator);
        sb.append(bVar.c());
        File file = new File(sb.toString());
        if (!file.exists()) {
            return null;
        }
        return file;
    }

    private File a(String str) {
        String a2;
        if (this.g == null && (a2 = f.a(d.class.getClassLoader(), "sg".concat(String.valueOf(str)))) != null && a2.length() > 0) {
            return new File(a2);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.zip.ZipFile] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084 A[SYNTHETIC, Splitter:B:29:0x0084] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008c A[SYNTHETIC, Splitter:B:36:0x008c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.File a(java.lang.String r13, java.io.File r14) {
        /*
            r12 = this;
            r0 = 0
            android.content.Context r1 = r12.c     // Catch:{ Exception -> 0x000a }
            android.content.pm.ApplicationInfo r1 = r1.getApplicationInfo()     // Catch:{ Exception -> 0x000a }
            java.lang.String r1 = r1.sourceDir     // Catch:{ Exception -> 0x000a }
            goto L_0x000b
        L_0x000a:
            r1 = r0
        L_0x000b:
            if (r1 != 0) goto L_0x000e
            return r0
        L_0x000e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "libsg"
            r2.<init>(r3)
            r2.append(r13)
            java.lang.String r3 = ".so"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Plugin not existed in the application library path, maybe installed in x86 phone, or the armeabi-v7a existed"
            com.alibaba.wireless.security.framework.utils.a.b(r3)     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            r3.<init>(r1)     // Catch:{ IOException -> 0x0066, all -> 0x0064 }
            java.lang.String[] r4 = n     // Catch:{ IOException -> 0x0062 }
            int r5 = r4.length     // Catch:{ IOException -> 0x0062 }
            r6 = 0
        L_0x002f:
            if (r6 >= r5) goto L_0x005e
            r7 = r4[r6]     // Catch:{ IOException -> 0x0062 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0062 }
            java.lang.String r9 = "lib"
            r8.<init>(r9)     // Catch:{ IOException -> 0x0062 }
            java.lang.String r9 = java.io.File.separator     // Catch:{ IOException -> 0x0062 }
            r8.append(r9)     // Catch:{ IOException -> 0x0062 }
            r8.append(r7)     // Catch:{ IOException -> 0x0062 }
            java.lang.String r9 = java.io.File.separator     // Catch:{ IOException -> 0x0062 }
            r8.append(r9)     // Catch:{ IOException -> 0x0062 }
            r8.append(r2)     // Catch:{ IOException -> 0x0062 }
            java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x0062 }
            java.util.zip.ZipEntry r9 = r3.getEntry(r8)     // Catch:{ IOException -> 0x0062 }
            if (r9 == 0) goto L_0x005b
            f9210o = r7     // Catch:{ IOException -> 0x0062 }
            java.io.File r0 = r12.a((java.lang.String) r13, (java.io.File) r14, (java.util.zip.ZipFile) r3, (java.lang.String) r8)     // Catch:{ IOException -> 0x0062 }
            goto L_0x005e
        L_0x005b:
            int r6 = r6 + 1
            goto L_0x002f
        L_0x005e:
            r3.close()     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            return r0
        L_0x0062:
            r14 = move-exception
            goto L_0x0068
        L_0x0064:
            r13 = move-exception
            goto L_0x008a
        L_0x0066:
            r14 = move-exception
            r3 = r0
        L_0x0068:
            java.lang.String r2 = "getPluginFile throws exception"
            com.alibaba.wireless.security.framework.utils.a.a(r2, r14)     // Catch:{ all -> 0x0088 }
            r5 = 100047(0x186cf, float:1.40196E-40)
            r6 = 3
            java.lang.String r7 = r14.toString()     // Catch:{ all -> 0x0088 }
            java.lang.String r9 = r12.c((java.lang.String) r1)     // Catch:{ all -> 0x0088 }
            java.lang.String r10 = ""
            java.lang.String r11 = ""
            r4 = r12
            r8 = r13
            r4.a(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x0088 }
            if (r3 == 0) goto L_0x0087
            r3.close()     // Catch:{ Exception -> 0x0087 }
        L_0x0087:
            return r0
        L_0x0088:
            r13 = move-exception
            r0 = r3
        L_0x008a:
            if (r0 == 0) goto L_0x008f
            r0.close()     // Catch:{ Exception -> 0x008f }
        L_0x008f:
            goto L_0x0091
        L_0x0090:
            throw r13
        L_0x0091:
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.a(java.lang.String, java.io.File):java.io.File");
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.util.zip.ZipFile] */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r0v7 */
    /* JADX WARNING: type inference failed for: r0v8 */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
        if (r1 != null) goto L_0x0014;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0040 A[SYNTHETIC, Splitter:B:23:0x0040] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.io.File a(java.lang.String r11, java.io.File r12, java.lang.String r13, java.lang.String r14) {
        /*
            r10 = this;
            r0 = 0
            if (r13 == 0) goto L_0x0044
            if (r14 != 0) goto L_0x0006
            goto L_0x0044
        L_0x0006:
            java.lang.String r1 = "Plugin not existed in the application library path, maybe installed in x86 phone, or the armeabi-v7a existed"
            com.alibaba.wireless.security.framework.utils.a.b(r1)     // Catch:{ IOException -> 0x001c, all -> 0x001a }
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch:{ IOException -> 0x001c, all -> 0x001a }
            r1.<init>(r13)     // Catch:{ IOException -> 0x001c, all -> 0x001a }
            java.io.File r0 = r10.a((java.lang.String) r11, (java.io.File) r12, (java.util.zip.ZipFile) r1, (java.lang.String) r14)     // Catch:{ IOException -> 0x0018 }
        L_0x0014:
            r1.close()     // Catch:{ Exception -> 0x003b }
            goto L_0x003b
        L_0x0018:
            r12 = move-exception
            goto L_0x001e
        L_0x001a:
            r11 = move-exception
            goto L_0x003e
        L_0x001c:
            r12 = move-exception
            r1 = r0
        L_0x001e:
            java.lang.String r14 = "getPluginFile throws exception"
            com.alibaba.wireless.security.framework.utils.a.a(r14, r12)     // Catch:{ all -> 0x003c }
            r3 = 100047(0x186cf, float:1.40196E-40)
            r4 = 3
            java.lang.String r5 = r12.toString()     // Catch:{ all -> 0x003c }
            java.lang.String r7 = r10.c((java.lang.String) r13)     // Catch:{ all -> 0x003c }
            java.lang.String r8 = ""
            java.lang.String r9 = ""
            r2 = r10
            r6 = r11
            r2.a(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x003c }
            if (r1 == 0) goto L_0x003b
            goto L_0x0014
        L_0x003b:
            return r0
        L_0x003c:
            r11 = move-exception
            r0 = r1
        L_0x003e:
            if (r0 == 0) goto L_0x0043
            r0.close()     // Catch:{ Exception -> 0x0043 }
        L_0x0043:
            throw r11
        L_0x0044:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.a(java.lang.String, java.io.File, java.lang.String, java.lang.String):java.io.File");
    }

    private File a(String str, File file, ZipFile zipFile, String str2) throws IOException {
        ZipEntry entry;
        if (!(zipFile == null || str2 == null || (entry = zipFile.getEntry(str2)) == null || !b.a(entry.getName()))) {
            StringBuilder sb = new StringBuilder("Plugin existed  in ");
            sb.append(entry.getName());
            com.alibaba.wireless.security.framework.utils.a.b(sb.toString());
            StringBuilder sb2 = new StringBuilder("libsg");
            sb2.append(str);
            sb2.append("_inner");
            sb2.append(entry.getTime());
            sb2.append(".zip");
            File file2 = new File(file, sb2.toString());
            if ((!file2.exists() || file2.length() != entry.getSize()) && !f.a(zipFile, entry, file2)) {
                com.alibaba.wireless.security.framework.utils.a.b("Extract failed!!");
            } else {
                com.alibaba.wireless.security.framework.utils.a.b("Extract success");
                return file2;
            }
        }
        return null;
    }

    private Class<?> a(ClassLoader classLoader, String str) {
        Class<?> cls;
        long currentTimeMillis = System.currentTimeMillis();
        try {
            cls = Class.forName(str, true, classLoader);
        } catch (Throwable th) {
            a(100042, SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR, "Class.forName failed", "".concat(String.valueOf(th)), str, classLoader.toString(), "");
            cls = null;
        }
        StringBuilder sb = new StringBuilder("    loadClassFromClassLoader( ");
        sb.append(str);
        sb.append(" ) used time: ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        sb.append(" ms");
        com.alibaba.wireless.security.framework.utils.a.b(sb.toString());
        return cls;
    }

    private String a(Class<?> cls) {
        InterfacePluginInfo interfacePluginInfo = (InterfacePluginInfo) cls.getAnnotation(InterfacePluginInfo.class);
        if (interfacePluginInfo == null) {
            return null;
        }
        return interfacePluginInfo.pluginName();
    }

    private void a() throws SecException {
        File a2 = a(this.c);
        this.k = a2;
        if (a2 != null) {
            Context context = this.c;
            StringBuilder sb = new StringBuilder();
            sb.append(this.k);
            sb.append(File.separator);
            sb.append("lock.lock");
            this.b = new c(context, sb.toString());
            b b2 = b();
            this.i = b2;
            this.m = a(this.c, b2);
        }
    }

    private void a(int i2, int i3, String str, String str2, String str3, String str4, String str5) {
        UserTrackMethodJniBridge.addUtRecord("".concat(String.valueOf(i2)), i3, 0, com.alibaba.wireless.security.open.initialize.c.a(), 0, str, str2, str3, str4, str5);
    }

    /* access modifiers changed from: private */
    public void a(File file) {
        String[] list;
        if (file.isDirectory() && (list = file.list()) != null) {
            for (String file2 : list) {
                a(new File(file, file2));
            }
        }
        file.delete();
    }

    private void a(final File file, final String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-903707312, oncanceled);
            onCancelLoad.getMin(-903707312, oncanceled);
        }
        new Thread(new Runnable() {
            public void run() {
                File filesDir;
                File[] listFiles;
                File[] listFiles2;
                try {
                    if (file != null && file.isDirectory() && (listFiles2 = file.listFiles()) != null && listFiles2.length > 0) {
                        for (File file : listFiles2) {
                            if (file.isDirectory() && file.getName().startsWith("app_") && !file.getName().equals(str)) {
                                d.this.a(file);
                            } else if (file.getName().startsWith("libsg")) {
                                file.delete();
                            }
                        }
                    }
                    if (d.this.c != null && (filesDir = d.this.c.getFilesDir()) != null && filesDir.isDirectory() && (listFiles = filesDir.listFiles()) != null && listFiles.length > 0) {
                        for (File file2 : listFiles) {
                            if (file2.getName().startsWith("libsecuritysdk")) {
                                file2.delete();
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }).start();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a0, code lost:
        r1 = r0;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a3, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00a4, code lost:
        r3 = r20;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009f A[ExcHandler: all (r0v11 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:1:0x0029] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d6 A[SYNTHETIC, Splitter:B:50:0x00d6] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00e1 A[SYNTHETIC, Splitter:B:55:0x00e1] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00f1 A[SYNTHETIC, Splitter:B:63:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00fc A[SYNTHETIC, Splitter:B:68:0x00fc] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.io.File r20, java.io.File r21) {
        /*
            r19 = this;
            r9 = r19
            r1 = r21
            java.lang.String r10 = ""
            java.io.File r11 = new java.io.File
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r21.getAbsolutePath()
            r0.append(r2)
            java.lang.String r2 = ".tmp."
            r0.append(r2)
            int r2 = android.os.Process.myPid()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r11.<init>(r0)
            r12 = 0
            r2 = 0
            boolean r0 = r11.exists()     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
            if (r0 == 0) goto L_0x0032
            r11.delete()     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
        L_0x0032:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00a3, all -> 0x009f }
            r3 = r20
            r0.<init>(r3)     // Catch:{ Exception -> 0x009d, all -> 0x009f }
            java.nio.channels.FileChannel r4 = r0.getChannel()     // Catch:{ Exception -> 0x009d, all -> 0x009f }
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0099, all -> 0x0093 }
            r0.<init>(r11)     // Catch:{ Exception -> 0x0099, all -> 0x0093 }
            java.nio.channels.FileChannel r5 = r0.getChannel()     // Catch:{ Exception -> 0x0099, all -> 0x0093 }
            r15 = 0
            long r17 = r4.size()     // Catch:{ Exception -> 0x008f, all -> 0x0089 }
            r13 = r5
            r14 = r4
            r13.transferFrom(r14, r15, r17)     // Catch:{ Exception -> 0x008f, all -> 0x0089 }
            r4.close()     // Catch:{ Exception -> 0x008f, all -> 0x0089 }
            r5.close()     // Catch:{ Exception -> 0x0086, all -> 0x0083 }
            long r4 = r11.length()     // Catch:{ Exception -> 0x009d, all -> 0x009f }
            long r6 = r20.length()     // Catch:{ Exception -> 0x009d, all -> 0x009f }
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x007e
            boolean r0 = r21.exists()     // Catch:{ Exception -> 0x009d, all -> 0x009f }
            if (r0 == 0) goto L_0x007a
            long r4 = r21.length()     // Catch:{ Exception -> 0x009d, all -> 0x009f }
            long r6 = r20.length()     // Catch:{ Exception -> 0x009d, all -> 0x009f }
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0077
            r12 = 1
            goto L_0x007e
        L_0x0077:
            r21.delete()     // Catch:{ Exception -> 0x009d, all -> 0x009f }
        L_0x007a:
            boolean r12 = r11.renameTo(r1)     // Catch:{ Exception -> 0x009d, all -> 0x009f }
        L_0x007e:
            r11.delete()
            goto L_0x00eb
        L_0x0083:
            r0 = move-exception
            r1 = r0
            goto L_0x008c
        L_0x0086:
            r0 = move-exception
            r13 = r2
            goto L_0x0091
        L_0x0089:
            r0 = move-exception
            r1 = r0
            r2 = r4
        L_0x008c:
            r14 = r5
            goto L_0x00ef
        L_0x008f:
            r0 = move-exception
            r13 = r4
        L_0x0091:
            r14 = r5
            goto L_0x00a8
        L_0x0093:
            r0 = move-exception
            r1 = r0
            r14 = r2
            r2 = r4
            goto L_0x00ef
        L_0x0099:
            r0 = move-exception
            r14 = r2
            r13 = r4
            goto L_0x00a8
        L_0x009d:
            r0 = move-exception
            goto L_0x00a6
        L_0x009f:
            r0 = move-exception
            r1 = r0
            r14 = r2
            goto L_0x00ef
        L_0x00a3:
            r0 = move-exception
            r3 = r20
        L_0x00a6:
            r13 = r2
            r14 = r13
        L_0x00a8:
            com.alibaba.wireless.security.framework.utils.a.a(r10, r0)     // Catch:{ all -> 0x00ec }
            r2 = 100047(0x186cf, float:1.40196E-40)
            r4 = 2
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x00ec }
            java.lang.String r3 = r20.getAbsolutePath()     // Catch:{ all -> 0x00ec }
            java.lang.String r5 = r9.c((java.lang.String) r3)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = r21.getAbsolutePath()     // Catch:{ all -> 0x00ec }
            java.lang.String r6 = r9.c((java.lang.String) r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r1 = r11.getAbsolutePath()     // Catch:{ all -> 0x00ec }
            java.lang.String r7 = r9.c((java.lang.String) r1)     // Catch:{ all -> 0x00ec }
            java.lang.String r8 = ""
            r1 = r19
            r3 = r4
            r4 = r0
            r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00ec }
            if (r13 == 0) goto L_0x00df
            r13.close()     // Catch:{ Exception -> 0x00da }
            goto L_0x00df
        L_0x00da:
            r0 = move-exception
            r1 = r0
            com.alibaba.wireless.security.framework.utils.a.a(r10, r1)
        L_0x00df:
            if (r14 == 0) goto L_0x007e
            r14.close()     // Catch:{ Exception -> 0x00e5 }
            goto L_0x007e
        L_0x00e5:
            r0 = move-exception
            r1 = r0
            com.alibaba.wireless.security.framework.utils.a.a(r10, r1)
            goto L_0x007e
        L_0x00eb:
            return r12
        L_0x00ec:
            r0 = move-exception
            r1 = r0
            r2 = r13
        L_0x00ef:
            if (r2 == 0) goto L_0x00fa
            r2.close()     // Catch:{ Exception -> 0x00f5 }
            goto L_0x00fa
        L_0x00f5:
            r0 = move-exception
            r2 = r0
            com.alibaba.wireless.security.framework.utils.a.a(r10, r2)
        L_0x00fa:
            if (r14 == 0) goto L_0x0105
            r14.close()     // Catch:{ Exception -> 0x0100 }
            goto L_0x0105
        L_0x0100:
            r0 = move-exception
            r2 = r0
            com.alibaba.wireless.security.framework.utils.a.a(r10, r2)
        L_0x0105:
            r11.delete()
            goto L_0x010a
        L_0x0109:
            throw r1
        L_0x010a:
            goto L_0x0109
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.a(java.io.File, java.io.File):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006a, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0079, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0090, code lost:
        return true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00b2 A[Catch:{ all -> 0x009c, all -> 0x0009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00bb A[Catch:{ all -> 0x009c, all -> 0x0009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x00c0 A[Catch:{ all -> 0x009c, all -> 0x0009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00c9 A[Catch:{ all -> 0x009c, all -> 0x0009 }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00d7 A[SYNTHETIC, Splitter:B:80:0x00d7] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean a(java.lang.String r11, java.lang.String r12, java.io.File r13, java.lang.String r14, boolean r15) {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            if (r11 == 0) goto L_0x000c
            int r1 = r11.length()     // Catch:{ all -> 0x0009 }
            goto L_0x000d
        L_0x0009:
            r11 = move-exception
            goto L_0x00e4
        L_0x000c:
            r1 = 0
        L_0x000d:
            int r2 = o.dispatchOnCancelled.setMax(r1)     // Catch:{ all -> 0x0009 }
            r3 = 1
            if (r1 == r2) goto L_0x0022
            o.onCanceled r4 = new o.onCanceled     // Catch:{ all -> 0x0009 }
            r4.<init>(r1, r2, r3)     // Catch:{ all -> 0x0009 }
            r1 = 1413189916(0x543b911c, float:3.22237366E12)
            o.onCancelLoad.setMax(r1, r4)     // Catch:{ all -> 0x0009 }
            o.onCancelLoad.getMin(r1, r4)     // Catch:{ all -> 0x0009 }
        L_0x0022:
            android.content.Context r1 = r10.c     // Catch:{ all -> 0x0009 }
            boolean r1 = com.alibaba.wireless.security.framework.utils.f.a(r1)     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x0032
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0009 }
            r2 = 19
            if (r1 <= r2) goto L_0x0032
            monitor-exit(r10)
            return r3
        L_0x0032:
            java.lang.String r1 = r10.g     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x0038
            monitor-exit(r10)
            return r3
        L_0x0038:
            if (r13 == 0) goto L_0x004f
            java.io.File r11 = new java.io.File     // Catch:{ all -> 0x0009 }
            java.lang.String r1 = r13.getParent()     // Catch:{ all -> 0x0009 }
            r11.<init>(r1, r14)     // Catch:{ all -> 0x0009 }
            boolean r11 = r11.exists()     // Catch:{ all -> 0x0009 }
            if (r11 == 0) goto L_0x004b
            monitor-exit(r10)
            return r3
        L_0x004b:
            java.lang.String r11 = r13.getAbsolutePath()     // Catch:{ all -> 0x0009 }
        L_0x004f:
            if (r15 != 0) goto L_0x0056
            com.alibaba.wireless.security.framework.utils.c r1 = r10.b     // Catch:{ all -> 0x0009 }
            r1.a()     // Catch:{ all -> 0x0009 }
        L_0x0056:
            r1 = 0
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x009e }
            r2.<init>(r12, r14)     // Catch:{ Exception -> 0x009e }
            boolean r12 = r2.exists()     // Catch:{ Exception -> 0x0099 }
            if (r12 == 0) goto L_0x006b
            if (r15 != 0) goto L_0x0069
            com.alibaba.wireless.security.framework.utils.c r11 = r10.b     // Catch:{ all -> 0x0009 }
            r11.b()     // Catch:{ all -> 0x0009 }
        L_0x0069:
            monitor-exit(r10)
            return r3
        L_0x006b:
            boolean r12 = com.alibaba.wireless.security.framework.utils.f.a((java.lang.String) r11, (java.lang.String) r14, (java.io.File) r2)     // Catch:{ Exception -> 0x0099 }
            if (r12 == 0) goto L_0x007a
            if (r15 != 0) goto L_0x0078
            com.alibaba.wireless.security.framework.utils.c r11 = r10.b     // Catch:{ all -> 0x0009 }
            r11.b()     // Catch:{ all -> 0x0009 }
        L_0x0078:
            monitor-exit(r10)
            return r3
        L_0x007a:
            android.content.Context r12 = r10.c     // Catch:{ Exception -> 0x0099 }
            android.content.pm.ApplicationInfo r12 = r12.getApplicationInfo()     // Catch:{ Exception -> 0x0099 }
            java.lang.String r12 = r12.sourceDir     // Catch:{ Exception -> 0x0099 }
            boolean r11 = com.alibaba.wireless.security.framework.utils.f.a((java.lang.String) r12, (java.lang.String) r14, (java.io.File) r2)     // Catch:{ Exception -> 0x0099 }
            if (r11 == 0) goto L_0x0091
            if (r15 != 0) goto L_0x008f
            com.alibaba.wireless.security.framework.utils.c r11 = r10.b     // Catch:{ all -> 0x0009 }
            r11.b()     // Catch:{ all -> 0x0009 }
        L_0x008f:
            monitor-exit(r10)
            return r3
        L_0x0091:
            if (r15 != 0) goto L_0x00da
            com.alibaba.wireless.security.framework.utils.c r11 = r10.b     // Catch:{ all -> 0x0009 }
        L_0x0095:
            r11.b()     // Catch:{ all -> 0x0009 }
            goto L_0x00da
        L_0x0099:
            r12 = move-exception
            r1 = r2
            goto L_0x009f
        L_0x009c:
            r11 = move-exception
            goto L_0x00dc
        L_0x009e:
            r12 = move-exception
        L_0x009f:
            r3 = 100039(0x186c7, float:1.40184E-40)
            r4 = 107(0x6b, float:1.5E-43)
            java.lang.String r5 = r12.toString()     // Catch:{ all -> 0x009c }
            java.lang.String r6 = r10.c()     // Catch:{ all -> 0x009c }
            java.lang.String r7 = r10.c((java.lang.String) r11)     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x00bb
            java.lang.String r11 = r1.getAbsolutePath()     // Catch:{ all -> 0x009c }
            java.lang.String r11 = r10.c((java.lang.String) r11)     // Catch:{ all -> 0x009c }
            goto L_0x00bd
        L_0x00bb:
            java.lang.String r11 = ""
        L_0x00bd:
            r8 = r11
            if (r13 == 0) goto L_0x00c9
            java.lang.String r11 = r13.getAbsolutePath()     // Catch:{ all -> 0x009c }
            java.lang.String r11 = r10.c((java.lang.String) r11)     // Catch:{ all -> 0x009c }
            goto L_0x00cb
        L_0x00c9:
            java.lang.String r11 = ""
        L_0x00cb:
            r9 = r11
            r2 = r10
            r2.a(r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x009c }
            java.lang.String r11 = ""
            com.alibaba.wireless.security.framework.utils.a.a(r11, r12)     // Catch:{ all -> 0x009c }
            if (r15 != 0) goto L_0x00da
            com.alibaba.wireless.security.framework.utils.c r11 = r10.b     // Catch:{ all -> 0x0009 }
            goto L_0x0095
        L_0x00da:
            monitor-exit(r10)
            return r0
        L_0x00dc:
            if (r15 != 0) goto L_0x00e3
            com.alibaba.wireless.security.framework.utils.c r12 = r10.b     // Catch:{ all -> 0x0009 }
            r12.b()     // Catch:{ all -> 0x0009 }
        L_0x00e3:
            throw r11     // Catch:{ all -> 0x0009 }
        L_0x00e4:
            monitor-exit(r10)
            goto L_0x00e7
        L_0x00e6:
            throw r11
        L_0x00e7:
            goto L_0x00e6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.a(java.lang.String, java.lang.String, java.io.File, java.lang.String, boolean):boolean");
    }

    /* access modifiers changed from: private */
    public boolean a(String str, String str2, boolean z) throws SecException {
        String str3 = str2;
        if (str.trim().length() == 0) {
            return true;
        }
        String[] split = str.split(";");
        for (int i2 = 0; i2 < split.length; i2++) {
            String trim = split[i2].trim();
            if (trim.length() != 0) {
                String[] split2 = trim.split(":");
                if (split2.length == 2) {
                    int indexOf = str3.indexOf(split2[0]);
                    if (indexOf >= 0) {
                        int indexOf2 = str3.indexOf("(", indexOf);
                        int indexOf3 = str3.indexOf(")", indexOf);
                        if (indexOf2 < 0 || indexOf3 < 0 || indexOf2 > indexOf3) {
                            a(100040, SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR, "indexLeftP < 0 || indexRightP < 0 || indexLeftP > indexRightP", "".concat(String.valueOf(indexOf2)), "".concat(String.valueOf(indexOf3)), "", "".concat(String.valueOf(i2)));
                            throw new SecException(SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR);
                        }
                        String substring = str3.substring(indexOf2 + 1, indexOf3);
                        if (a(substring, split2[1]) < 0) {
                            StringBuilder sb = new StringBuilder("version ");
                            sb.append(substring);
                            sb.append(" of ");
                            sb.append(split2[0]);
                            sb.append(" is not meet the requirement: ");
                            sb.append(split2[1]);
                            String obj = sb.toString();
                            if (str2.length() != 0) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(obj);
                                sb2.append(", depended by: ");
                                sb2.append(str3);
                                obj = sb2.toString();
                            }
                            String str4 = obj;
                            if (!z) {
                                a(100040, 113, "versionCompare(parentPluginVersion, nameVersionPair[1]) < 0", substring, split2[0], split2[1], "".concat(String.valueOf(i2)));
                            }
                            throw new SecException(str4, 113);
                        }
                    } else {
                        ISGPluginInfo iSGPluginInfo = this.d.get(split2[0]);
                        if (iSGPluginInfo == null) {
                            try {
                                iSGPluginInfo = d(split2[0], str3, !z);
                                th = null;
                            } catch (Throwable th) {
                                th = th;
                            }
                            if (iSGPluginInfo == null) {
                                if (!z) {
                                    if (th instanceof SecException) {
                                        throw th;
                                    }
                                    a(100040, SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR, "throwable in loadPluginInner", "".concat(String.valueOf(th)), str, str2, "".concat(String.valueOf(i2)));
                                    throw new SecException(str3, (int) SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR);
                                }
                            }
                        }
                        if (a(iSGPluginInfo.getVersion(), split2[1]) < 0) {
                            StringBuilder sb3 = new StringBuilder("version ");
                            sb3.append(iSGPluginInfo.getVersion());
                            sb3.append(" of ");
                            sb3.append(split2[0]);
                            sb3.append(" is not meet the requirement: ");
                            sb3.append(split2[1]);
                            String obj2 = sb3.toString();
                            if (str2.length() != 0) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(obj2);
                                sb4.append(", depended by: ");
                                sb4.append(str3);
                                obj2 = sb4.toString();
                            }
                            if (!z) {
                                a(100040, 113, "versionCompare(dependPlugin.getVersion(), nameVersionPair[1]) < 0", iSGPluginInfo.getVersion(), split2[0], split2[1], "".concat(String.valueOf(i2)));
                            }
                            throw new SecException(obj2, 113);
                        }
                    }
                } else {
                    a(100040, SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR, "nameVersionPair.length != 2", trim, str2, "".concat(String.valueOf(z)), "".concat(String.valueOf(i2)));
                    throw new SecException(SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR);
                }
            }
        }
        return true;
    }

    private b b() {
        b bVar;
        File file = new File(this.k, "update.config");
        File file2 = new File(this.k, "init.config");
        if (this.j) {
            bVar = b.a(file);
            if (bVar == null) {
                return b.a(file2);
            }
            try {
                this.b.a();
                file2.delete();
                file.renameTo(file2);
            } catch (Throwable th) {
                this.b.b();
                throw th;
            }
        } else {
            try {
                this.b.a();
                bVar = b.a(file2);
            } catch (Throwable th2) {
                this.b.b();
                throw th2;
            }
        }
        this.b.b();
        return bVar;
    }

    private File b(String str) {
        String str2 = this.g;
        if (str2 == null) {
            try {
                str2 = this.c.getApplicationInfo().nativeLibraryDir;
            } catch (Exception unused) {
            }
        }
        if (str2 != null && str2.length() > 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(File.separator);
            sb.append("libsg");
            sb.append(str);
            sb.append(".so");
            File file = new File(sb.toString());
            if (file.exists()) {
                return file;
            }
        }
        return null;
    }

    private ClassLoader b(String str, String str2, boolean z) {
        Class<d> cls = d.class;
        if (!z) {
            try {
                this.b.a();
            } catch (Throwable th) {
                if (!z) {
                    this.b.b();
                }
                throw th;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.c.getApplicationInfo().nativeLibraryDir);
        sb.append(File.pathSeparator);
        sb.append(str2);
        String obj = sb.toString();
        if (this.g != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(File.pathSeparator);
            sb2.append(this.g);
            obj = sb2.toString();
            com.alibaba.wireless.security.framework.utils.a.b("add path to native classloader ".concat(String.valueOf(obj)));
        }
        if (f9210o != null) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(obj);
            sb3.append(File.pathSeparator);
            sb3.append(this.c.getApplicationInfo().sourceDir);
            sb3.append("!/lib/");
            sb3.append(f9210o);
            obj = sb3.toString();
        }
        ClassLoader dexClassLoader = (Build.VERSION.SDK_INT < 21 || "6.0.1".equalsIgnoreCase(Build.VERSION.RELEASE)) ? new DexClassLoader(str, str2, obj, cls.getClassLoader()) : new PathClassLoader(str, obj, cls.getClassLoader());
        if (!z) {
            this.b.b();
        }
        return dexClassLoader;
    }

    private boolean b(File file) {
        try {
            if (!file.getParentFile().getCanonicalPath().equals(file.getCanonicalFile().getParentFile().getCanonicalPath())) {
                return true;
            }
            return true ^ file.getName().equals(file.getCanonicalFile().getName());
        } catch (Exception e2) {
            com.alibaba.wireless.security.framework.utils.a.a("", e2);
            a(100047, 0, e2.toString(), file.getAbsolutePath(), "", "", "");
            return false;
        }
    }

    private boolean b(File file, File file2) {
        Method method;
        try {
            Object obj = null;
            if (Build.VERSION.SDK_INT >= 21) {
                method = Class.forName("android.system.Os").getDeclaredMethod("symlink", new Class[]{String.class, String.class});
            } else {
                Field declaredField = Class.forName("libcore.io.Libcore").getDeclaredField(H5GetLogInfoBridge.RESULT_OS);
                declaredField.setAccessible(true);
                obj = declaredField.get((Object) null);
                method = obj.getClass().getMethod("symlink", new Class[]{String.class, String.class});
            }
            method.invoke(obj, new Object[]{file.getAbsolutePath(), file2.getAbsolutePath()});
            return true;
        } catch (Exception e2) {
            StringBuilder sb = new StringBuilder("create symbolic link( ");
            sb.append(file2.getAbsolutePath());
            sb.append(" -> ");
            sb.append(file.getAbsolutePath());
            sb.append(" ) failed");
            com.alibaba.wireless.security.framework.utils.a.a(sb.toString(), e2);
            String obj2 = e2.toString();
            String absolutePath = file.getAbsolutePath();
            String absolutePath2 = file2.getAbsolutePath();
            StringBuilder sb2 = new StringBuilder("");
            sb2.append(Build.VERSION.SDK_INT);
            a(100047, 1, obj2, absolutePath, absolutePath2, sb2.toString(), "");
            return false;
        }
    }

    private boolean b(String str, String str2) throws SecException {
        String str3 = str;
        String str4 = str2;
        int length = str3 != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-597032726, oncanceled);
            onCancelLoad.getMin(-597032726, oncanceled);
        }
        for (Map.Entry next : this.d.entrySet()) {
            String str5 = (String) next.getKey();
            c cVar = (c) next.getValue();
            String a2 = cVar.a("reversedependencies");
            if (a2 != null) {
                String[] split = a2.split(";");
                for (int i2 = 0; i2 < split.length; i2++) {
                    String trim = split[i2].trim();
                    if (trim.length() != 0) {
                        String[] split2 = trim.split(":");
                        if (split2.length != 2) {
                            StringBuilder sb = new StringBuilder();
                            sb.append(str3);
                            sb.append("(");
                            sb.append(str4);
                            sb.append(")");
                            String obj = sb.toString();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str5);
                            sb2.append("(");
                            sb2.append(cVar.getVersion());
                            sb2.append(")");
                            a(100041, SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR, "nameVersionPair.length != 2", obj, sb2.toString(), c(cVar.getPluginPath()), a2);
                            throw new SecException(SecExceptionCode.SEC_ERROR_INIT_UNKNOWN_ERROR);
                        } else if (split2[0].equalsIgnoreCase(str3) && a(str4, split2[1]) < 0) {
                            StringBuilder sb3 = new StringBuilder("plugin ");
                            sb3.append(str3);
                            sb3.append("(");
                            sb3.append(str4);
                            sb3.append(") is not meet the reverse dependency of ");
                            sb3.append(str5);
                            sb3.append("(");
                            sb3.append(cVar.getVersion());
                            sb3.append("): ");
                            sb3.append(split2[0]);
                            sb3.append("(");
                            sb3.append(split2[1]);
                            sb3.append(")");
                            String obj2 = sb3.toString();
                            a(100041, 117, obj2, d.class.getClassLoader().toString(), c(cVar.getPluginPath()), a2, "".concat(String.valueOf(i2)));
                            throw new SecException(obj2, 117);
                        }
                    }
                }
                continue;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0055 A[SYNTHETIC, Splitter:B:17:0x0055] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0066 A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b7 A[Catch:{ all -> 0x0061 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ce  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.alibaba.wireless.security.framework.d.a c(java.lang.String r17, java.lang.String r18, boolean r19) throws com.alibaba.wireless.security.open.SecException {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            java.lang.String r2 = "!/"
            java.lang.String r3 = ".zip"
            java.io.File r4 = r1.m
            java.lang.String r5 = ".so"
            r6 = 1
            java.lang.String r7 = "libsg"
            r8 = 0
            if (r4 == 0) goto L_0x003a
            java.io.File r4 = new java.io.File
            java.io.File r10 = r1.m
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r7)
            r11.append(r0)
            r11.append(r5)
            java.lang.String r11 = r11.toString()
            r4.<init>(r10, r11)
            boolean r10 = r4.exists()
            if (r10 == 0) goto L_0x003a
            java.io.File r10 = r1.m
            java.io.File r10 = r1.d(r10)
            java.io.File r11 = r1.m
            if (r10 == r11) goto L_0x003c
            r11 = 1
            goto L_0x003d
        L_0x003a:
            r4 = 0
            r10 = 0
        L_0x003c:
            r11 = 0
        L_0x003d:
            if (r10 != 0) goto L_0x004c
            java.io.File r10 = r1.k
            java.io.File r10 = r1.d(r10)
            java.io.File r11 = r1.k
            if (r10 == r11) goto L_0x004b
            r11 = 1
            goto L_0x004c
        L_0x004b:
            r11 = 0
        L_0x004c:
            if (r11 != 0) goto L_0x0053
            com.alibaba.wireless.security.framework.utils.c r12 = r1.b
            r12.a()
        L_0x0053:
            if (r4 != 0) goto L_0x0064
            java.io.File r4 = r16.a((java.lang.String) r17)     // Catch:{ all -> 0x0061 }
            boolean r12 = r1.c((java.io.File) r4)     // Catch:{ all -> 0x0061 }
            if (r12 != 0) goto L_0x0064
            r4 = 0
            goto L_0x0064
        L_0x0061:
            r0 = move-exception
            goto L_0x017c
        L_0x0064:
            if (r4 == 0) goto L_0x00b5
            java.lang.String r12 = r4.getAbsolutePath()     // Catch:{ all -> 0x0061 }
            if (r4 == 0) goto L_0x00b5
            if (r12 == 0) goto L_0x00b5
            boolean r13 = r12.contains(r2)     // Catch:{ all -> 0x0061 }
            if (r13 == 0) goto L_0x00b5
            r13 = 2
            java.lang.String[] r2 = r12.split(r2, r13)     // Catch:{ all -> 0x0061 }
            r12 = r2[r8]     // Catch:{ all -> 0x0061 }
            r2 = r2[r6]     // Catch:{ all -> 0x0061 }
            java.lang.String[] r6 = n     // Catch:{ all -> 0x0061 }
            int r13 = r6.length     // Catch:{ all -> 0x0061 }
        L_0x0080:
            if (r8 >= r13) goto L_0x00b5
            r14 = r6[r8]     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = "lib"
            r15.<init>(r9)     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = java.io.File.separator     // Catch:{ all -> 0x0061 }
            r15.append(r9)     // Catch:{ all -> 0x0061 }
            r15.append(r14)     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = java.io.File.separator     // Catch:{ all -> 0x0061 }
            r15.append(r9)     // Catch:{ all -> 0x0061 }
            r15.append(r7)     // Catch:{ all -> 0x0061 }
            r15.append(r0)     // Catch:{ all -> 0x0061 }
            r15.append(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r9 = r15.toString()     // Catch:{ all -> 0x0061 }
            boolean r9 = r9.equals(r2)     // Catch:{ all -> 0x0061 }
            if (r9 == 0) goto L_0x00b2
            f9210o = r14     // Catch:{ all -> 0x0061 }
            java.io.File r4 = r1.a((java.lang.String) r0, (java.io.File) r10, (java.lang.String) r12, (java.lang.String) r2)     // Catch:{ all -> 0x0061 }
            goto L_0x00b5
        L_0x00b2:
            int r8 = r8 + 1
            goto L_0x0080
        L_0x00b5:
            if (r4 != 0) goto L_0x00bb
            java.io.File r4 = r16.b((java.lang.String) r17)     // Catch:{ all -> 0x0061 }
        L_0x00bb:
            if (r4 != 0) goto L_0x00c3
            if (r19 == 0) goto L_0x00c3
            java.io.File r4 = r1.a((java.lang.String) r0, (java.io.File) r10)     // Catch:{ all -> 0x0061 }
        L_0x00c3:
            if (r4 != 0) goto L_0x00ce
            if (r11 != 0) goto L_0x00cc
            com.alibaba.wireless.security.framework.utils.c r0 = r1.b
            r0.b()
        L_0x00cc:
            r2 = 0
            return r2
        L_0x00ce:
            r2 = 0
            java.lang.String r5 = r4.getAbsolutePath()     // Catch:{ all -> 0x0061 }
            boolean r5 = r5.endsWith(r3)     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x00e1
            com.alibaba.wireless.security.framework.d$a r0 = new com.alibaba.wireless.security.framework.d$a     // Catch:{ all -> 0x0061 }
            r0.<init>(r4, r10, r2, r11)     // Catch:{ all -> 0x0061 }
            r9 = r0
            goto L_0x0174
        L_0x00e1:
            boolean r5 = com.alibaba.wireless.security.framework.utils.f.a()     // Catch:{ all -> 0x0061 }
            if (r5 == 0) goto L_0x00ee
            com.alibaba.wireless.security.framework.d$a r9 = new com.alibaba.wireless.security.framework.d$a     // Catch:{ all -> 0x0061 }
            r9.<init>(r4, r10, r4, r11)     // Catch:{ all -> 0x0061 }
            goto L_0x0174
        L_0x00ee:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r6.<init>(r7)     // Catch:{ all -> 0x0061 }
            r6.append(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r8 = "_"
            r6.append(r8)     // Catch:{ all -> 0x0061 }
            long r8 = r4.lastModified()     // Catch:{ all -> 0x0061 }
            r6.append(r8)     // Catch:{ all -> 0x0061 }
            r6.append(r3)     // Catch:{ all -> 0x0061 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x0061 }
            r5.<init>(r10, r6)     // Catch:{ all -> 0x0061 }
            boolean r6 = r5.exists()     // Catch:{ all -> 0x0061 }
            if (r6 == 0) goto L_0x0126
            boolean r6 = r1.b((java.io.File) r5)     // Catch:{ all -> 0x0061 }
            if (r6 == 0) goto L_0x0126
            boolean r6 = r1.c(r5, r4)     // Catch:{ all -> 0x0061 }
            if (r6 != 0) goto L_0x0126
            com.alibaba.wireless.security.framework.d$a r9 = new com.alibaba.wireless.security.framework.d$a     // Catch:{ all -> 0x0061 }
            r9.<init>(r5, r10, r4, r11)     // Catch:{ all -> 0x0061 }
            goto L_0x0174
        L_0x0126:
            r5.delete()     // Catch:{ all -> 0x0061 }
            boolean r6 = r1.b((java.io.File) r4, (java.io.File) r5)     // Catch:{ all -> 0x0061 }
            if (r6 == 0) goto L_0x0135
            com.alibaba.wireless.security.framework.d$a r9 = new com.alibaba.wireless.security.framework.d$a     // Catch:{ all -> 0x0061 }
            r9.<init>(r5, r10, r4, r11)     // Catch:{ all -> 0x0061 }
            goto L_0x0174
        L_0x0135:
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x0061 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0061 }
            r6.<init>(r7)     // Catch:{ all -> 0x0061 }
            r6.append(r0)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = "_cp"
            r6.append(r0)     // Catch:{ all -> 0x0061 }
            long r7 = r4.lastModified()     // Catch:{ all -> 0x0061 }
            r6.append(r7)     // Catch:{ all -> 0x0061 }
            r6.append(r3)     // Catch:{ all -> 0x0061 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0061 }
            r5.<init>(r10, r0)     // Catch:{ all -> 0x0061 }
            boolean r0 = r5.exists()     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0167
            long r6 = r5.length()     // Catch:{ all -> 0x0061 }
            long r8 = r4.length()     // Catch:{ all -> 0x0061 }
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x016d
        L_0x0167:
            boolean r0 = r1.a((java.io.File) r4, (java.io.File) r5)     // Catch:{ all -> 0x0061 }
            if (r0 == 0) goto L_0x0173
        L_0x016d:
            com.alibaba.wireless.security.framework.d$a r9 = new com.alibaba.wireless.security.framework.d$a     // Catch:{ all -> 0x0061 }
            r9.<init>(r5, r10, r4, r11)     // Catch:{ all -> 0x0061 }
            goto L_0x0174
        L_0x0173:
            r9 = r2
        L_0x0174:
            if (r11 != 0) goto L_0x017b
            com.alibaba.wireless.security.framework.utils.c r0 = r1.b
            r0.b()
        L_0x017b:
            return r9
        L_0x017c:
            if (r11 != 0) goto L_0x0183
            com.alibaba.wireless.security.framework.utils.c r2 = r1.b
            r2.b()
        L_0x0183:
            goto L_0x0185
        L_0x0184:
            throw r0
        L_0x0185:
            goto L_0x0184
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.wireless.security.framework.d.c(java.lang.String, java.lang.String, boolean):com.alibaba.wireless.security.framework.d$a");
    }

    private String c() {
        StringBuilder sb = new StringBuilder();
        File file = this.k;
        if (file == null || !file.exists() || !file.isDirectory()) {
            sb.append("not exists!");
        } else {
            try {
                sb.append("[");
                File[] listFiles = file.listFiles();
                int i2 = 0;
                while (listFiles != null && i2 < listFiles.length) {
                    File file2 = listFiles[i2];
                    if (file2.getName().startsWith("libsg") && (file2.getName().endsWith("zip") || file2.getName().endsWith(".so"))) {
                        sb.append(file2.getName());
                        sb.append("(");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(b(file2));
                        sb2.append(" , ");
                        sb.append(sb2.toString());
                        sb.append(file2.length());
                        sb.append(") , ");
                    }
                    i2++;
                }
                sb.append("]");
            } catch (Throwable unused) {
            }
        }
        return sb.toString();
    }

    private String c(String str) {
        if (str == null || str.length() <= 0) {
            return "";
        }
        File file = new File(str);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (b(file)) {
            sb.append("->");
            try {
                sb.append(file.getCanonicalPath());
            } catch (Exception unused) {
            }
        }
        sb.append('[');
        StringBuilder sb2 = new StringBuilder("exists:");
        sb2.append(file.exists());
        sb2.append(",");
        sb.append(sb2.toString());
        StringBuilder sb3 = new StringBuilder("size:");
        sb3.append(file.length());
        sb3.append(",");
        sb.append(sb3.toString());
        StringBuilder sb4 = new StringBuilder("canRead:");
        sb4.append(file.canRead());
        sb4.append(",");
        sb.append(sb4.toString());
        StringBuilder sb5 = new StringBuilder("canWrite:");
        sb5.append(file.canWrite());
        sb5.append(",");
        sb.append(sb5.toString());
        StringBuilder sb6 = new StringBuilder("totalSpace:");
        sb6.append(file.getTotalSpace());
        sb6.append(",");
        sb.append(sb6.toString());
        StringBuilder sb7 = new StringBuilder("freeSpace:");
        sb7.append(file.getFreeSpace());
        sb7.append(",");
        sb.append(sb7.toString());
        sb.append(']');
        return sb.toString();
    }

    private boolean c(File file) {
        if (file != null) {
            try {
                String absolutePath = file.getAbsolutePath();
                if (absolutePath != null) {
                    if (absolutePath.length() > 0) {
                        if (f.a(this.c) || !absolutePath.startsWith("/system/")) {
                            return true;
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    private boolean c(File file, File file2) {
        try {
            return file.getCanonicalPath().equals(file2.getCanonicalPath());
        } catch (Exception e2) {
            com.alibaba.wireless.security.framework.utils.a.a("", e2);
            a(100046, 0, e2.toString(), file.getAbsolutePath(), file2.getAbsolutePath(), "", "");
            return false;
        }
    }

    private synchronized ISGPluginInfo d(String str, String str2, boolean z) throws SecException {
        StringBuilder sb;
        String a2 = com.alibaba.wireless.security.framework.utils.a.a();
        long b2 = com.alibaba.wireless.security.framework.utils.a.b();
        c cVar = this.d.get(str);
        if (cVar != null) {
            return cVar;
        }
        if (this.k == null || !this.k.exists()) {
            a();
        }
        a c2 = c(str, str2, z);
        if (!(c2 == null || c2.f9214a == null)) {
            if (c2.f9214a.exists()) {
                com.alibaba.wireless.security.framework.utils.a.a(str, a2, "getPluginFile", b2);
                long b3 = com.alibaba.wireless.security.framework.utils.a.b();
                c a3 = a(str, c2, this.c, str2);
                if (a3 == null) {
                    if (c2.c != null) {
                        sb = new StringBuilder("src:");
                        sb.append(c(c2.c.getAbsolutePath()));
                    } else {
                        sb = new StringBuilder("zipfile:");
                        sb.append(c(c2.f9214a.getAbsolutePath()));
                    }
                    a(100044, 110, "", str, str2, sb.toString(), "");
                    throw new SecException(str, 111);
                }
                com.alibaba.wireless.security.framework.utils.a.a(str, a2, "loadApk", b3);
                this.d.put(str, a3);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append("(");
                sb2.append(a3.getVersion());
                sb2.append(")");
                final String obj = sb2.toString();
                final String a4 = a3.a("weakdependencies");
                if (str2.length() != 0) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append("->");
                    sb3.append(obj);
                    obj = sb3.toString();
                }
                Looper myLooper = Looper.myLooper();
                if (myLooper == null || myLooper == Looper.getMainLooper()) {
                    com.alibaba.wireless.security.framework.utils.a.a("looper of current thread is null, try to create a new thread with a looper");
                    HandlerThread handlerThread = new HandlerThread("SGBackgroud");
                    handlerThread.start();
                    myLooper = handlerThread.getLooper();
                }
                new Handler(myLooper).postDelayed(new Runnable() {
                    public void run() {
                        try {
                            boolean unused = d.this.a(a4, obj, true);
                        } catch (SecException e) {
                            com.alibaba.wireless.security.framework.utils.a.a("load weak dependency", e);
                        }
                    }
                }, DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS);
                return a3;
            }
        }
        if (!z) {
            return null;
        }
        StringBuilder sb4 = new StringBuilder("plugin ");
        sb4.append(str);
        sb4.append(" not existed");
        String obj2 = sb4.toString();
        if (str2.length() != 0) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(obj2);
            sb5.append(", depended by ");
            sb5.append(str2);
            obj2 = sb5.toString();
        }
        a(100044, 110, "", str, str2, "", "");
        throw new SecException(obj2, 110);
    }

    private File d(File file) {
        if (!file.exists() || !file.isDirectory() || !this.j) {
            return file;
        }
        File file2 = new File(file, "main");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        return file2.exists() ? file2 : file;
    }

    public void a(Context context, String str, String str2, boolean z, Object... objArr) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(-1690128502, oncanceled);
                onCancelLoad.getMin(-1690128502, oncanceled);
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        this.c = context;
        this.h = str;
        this.j = f.c(context);
        this.f = z;
        UserTrackMethodJniBridge.init(this.c);
        if (str2 != null && !str2.isEmpty()) {
            this.g = str2;
        }
        try {
            a();
        } catch (SecException unused) {
        }
    }

    public synchronized <T> T getInterface(Class<T> cls) throws SecException {
        Object obj = this.f9211a.get(cls);
        if (obj != null) {
            return cls.cast(obj);
        }
        String str = null;
        if (this.i != null && ((str = this.i.d()) == null || str.length() == 0)) {
            str = this.i.a(cls.getName());
        }
        if (str == null || str.length() == 0) {
            str = a((Class<?>) cls);
        }
        if (str == null || str.length() == 0) {
            throw new SecException(150);
        }
        ISGPluginInfo pluginInfo = getPluginInfo(str);
        if (pluginInfo != null) {
            T t = pluginInfo.getSGPluginEntry().getInterface(cls);
            if (t != null) {
                this.f9211a.put(cls, t);
                return cls.cast(t);
            }
            String name = cls.getName();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("(");
            sb.append(pluginInfo.getVersion());
            sb.append(")");
            a(100045, 112, "", name, sb.toString(), c(pluginInfo.getPluginPath()), "");
            throw new SecException(112);
        }
        throw new SecException(110);
    }

    public String getMainPluginName() {
        return "main";
    }

    public ISGPluginInfo getPluginInfo(String str) throws SecException {
        return d(str, "", true);
    }

    public IRouterComponent getRouter() {
        return this.e;
    }
}
