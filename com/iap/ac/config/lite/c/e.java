package com.iap.ac.config.lite.c;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alipay.iap.android.f2fpay.util.DeviceUtils;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.verifyidentity.base.message.EnvDataConstants;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.utils.MiscUtils;
import com.iap.ac.config.lite.ConfigCenter;
import com.iap.ac.config.lite.ConfigCenterContext;
import com.iap.ac.config.lite.ConfigGetter;
import com.iap.ac.config.lite.common.AmcsConstants;
import com.iap.ac.config.lite.delegate.ConfigIdentifierProvider;
import com.iap.ac.config.lite.fetcher.FetchException;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.io.Closeable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.UndeclaredThrowableException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9799a = b("SdkUtils");
    private static int length = 0;
    private static int setMax = 1;

    @NonNull
    public static FetchException a(@NonNull Throwable th, boolean z) {
        Throwable undeclaredThrowable;
        while (!(th instanceof FetchException)) {
            if (th instanceof RpcException) {
                RpcException rpcException = (RpcException) th;
                return new FetchException(String.valueOf(rpcException.getCode()), a(rpcException.getMsg(), "unknown_rpc_exception"));
            } else if (!(th instanceof UndeclaredThrowableException) || !z || (undeclaredThrowable = ((UndeclaredThrowableException) th).getUndeclaredThrowable()) == null) {
                String message = th.getMessage();
                if (TextUtils.isEmpty(message)) {
                    message = "unknown_fetch_exception";
                }
                return new FetchException(message);
            } else {
                th = undeclaredThrowable;
                z = false;
            }
        }
        return (FetchException) th;
    }

    public static String b(String str) {
        return "Amcs-".concat(String.valueOf(str));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v14, resolved type: java.io.InputStreamReader} */
    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(android.content.Context r11, java.lang.String r12) {
        /*
            android.content.res.AssetManager r11 = r11.getAssets()     // Catch:{ Exception -> 0x00f5 }
            r0 = 2
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x00bd }
            r3 = 1
            r2[r3] = r12     // Catch:{ all -> 0x00bd }
            r12 = 0
            r2[r12] = r11     // Catch:{ all -> 0x00bd }
            int r11 = android.view.ViewConfiguration.getEdgeSlop()     // Catch:{ all -> 0x00bd }
            int r11 = r11 >> 16
            int r11 = 19 - r11
            java.lang.String r4 = ""
            r5 = 48
            int r4 = android.text.TextUtils.lastIndexOf(r4, r5, r12)     // Catch:{ all -> 0x00bd }
            int r4 = -1 - r4
            r5 = 56348(0xdc1c, float:7.896E-41)
            int r6 = android.os.Process.myTid()     // Catch:{ all -> 0x00bd }
            r7 = 22
            int r6 = r6 >> r7
            int r6 = r6 + r5
            char r5 = (char) r6     // Catch:{ all -> 0x00bd }
            java.lang.Object r11 = o.upFrom.setMax(r11, r4, r5)     // Catch:{ all -> 0x00bd }
            java.lang.Class r11 = (java.lang.Class) r11     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = "getMin"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x00bd }
            java.lang.Class<android.content.res.AssetManager> r6 = android.content.res.AssetManager.class
            r5[r12] = r6     // Catch:{ all -> 0x00bd }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r3] = r6     // Catch:{ all -> 0x00bd }
            java.lang.reflect.Method r11 = r11.getMethod(r4, r5)     // Catch:{ all -> 0x00bd }
            java.lang.Object r11 = r11.invoke(r1, r2)     // Catch:{ all -> 0x00bd }
            java.io.InputStream r11 = (java.io.InputStream) r11     // Catch:{ all -> 0x00bd }
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            r2.<init>(r11)     // Catch:{ Exception -> 0x00bb, all -> 0x00b9 }
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            r4.<init>(r2)     // Catch:{ Exception -> 0x00b6, all -> 0x00b3 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b1 }
            r5.<init>()     // Catch:{ Exception -> 0x00b1 }
        L_0x0057:
            java.lang.String r6 = r4.readLine()     // Catch:{ Exception -> 0x00b1 }
            r8 = 87
            if (r6 == 0) goto L_0x0062
            r9 = 87
            goto L_0x0064
        L_0x0062:
            r9 = 22
        L_0x0064:
            if (r9 == r8) goto L_0x0089
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00b1 }
            a((java.io.Closeable) r4)
            a((java.io.Closeable) r2)
            a((java.io.Closeable) r11)
            int r11 = setMax
            int r11 = r11 + 23
            int r2 = r11 % 128
            length = r2
            int r11 = r11 % r0
            if (r11 == 0) goto L_0x007f
            goto L_0x0080
        L_0x007f:
            r3 = 0
        L_0x0080:
            if (r3 == 0) goto L_0x0088
            super.hashCode()     // Catch:{ all -> 0x0086 }
            return r5
        L_0x0086:
            r11 = move-exception
            throw r11
        L_0x0088:
            return r5
        L_0x0089:
            int r8 = setMax     // Catch:{ Exception -> 0x00f5 }
            int r8 = r8 + 79
            int r9 = r8 % 128
            length = r9     // Catch:{ Exception -> 0x00f5 }
            int r8 = r8 % 2
            r9 = 61
            if (r8 == 0) goto L_0x009a
            r8 = 38
            goto L_0x009c
        L_0x009a:
            r8 = 61
        L_0x009c:
            java.lang.String r10 = "\n"
            if (r8 == r9) goto L_0x00aa
            r5.append(r6)     // Catch:{ Exception -> 0x00b1 }
            r5.append(r10)     // Catch:{ Exception -> 0x00b1 }
            r6 = 84
            int r6 = r6 / r12
            goto L_0x0057
        L_0x00aa:
            r5.append(r6)     // Catch:{ Exception -> 0x00b1 }
            r5.append(r10)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x0057
        L_0x00b1:
            r12 = move-exception
            goto L_0x00d0
        L_0x00b3:
            r12 = move-exception
            r4 = r1
            goto L_0x00ea
        L_0x00b6:
            r12 = move-exception
            r4 = r1
            goto L_0x00d0
        L_0x00b9:
            r12 = move-exception
            goto L_0x00c9
        L_0x00bb:
            r12 = move-exception
            goto L_0x00ce
        L_0x00bd:
            r11 = move-exception
            java.lang.Throwable r12 = r11.getCause()     // Catch:{ Exception -> 0x00cb, all -> 0x00c6 }
            if (r12 == 0) goto L_0x00c5
            throw r12     // Catch:{ Exception -> 0x00cb, all -> 0x00c6 }
        L_0x00c5:
            throw r11     // Catch:{ Exception -> 0x00cb, all -> 0x00c6 }
        L_0x00c6:
            r11 = move-exception
            r12 = r11
            r11 = r1
        L_0x00c9:
            r4 = r1
            goto L_0x00eb
        L_0x00cb:
            r11 = move-exception
            r12 = r11
            r11 = r1
        L_0x00ce:
            r2 = r1
            r4 = r2
        L_0x00d0:
            java.lang.String r0 = f9799a     // Catch:{ all -> 0x00e9 }
            java.lang.String r3 = "readAssetFile failed: "
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x00e9 }
            java.lang.String r12 = r3.concat(r12)     // Catch:{ all -> 0x00e9 }
            com.iap.ac.android.common.log.ACLog.e(r0, r12)     // Catch:{ all -> 0x00e9 }
            a((java.io.Closeable) r4)
            a((java.io.Closeable) r2)
            a((java.io.Closeable) r11)
            return r1
        L_0x00e9:
            r12 = move-exception
        L_0x00ea:
            r1 = r2
        L_0x00eb:
            a((java.io.Closeable) r4)
            a((java.io.Closeable) r1)
            a((java.io.Closeable) r11)
            throw r12
        L_0x00f5:
            r11 = move-exception
            goto L_0x00f8
        L_0x00f7:
            throw r11
        L_0x00f8:
            goto L_0x00f7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.config.lite.c.e.b(android.content.Context, java.lang.String):java.lang.String");
    }

    @NonNull
    private static String a(@Nullable String str, @NonNull String str2) {
        return !TextUtils.isEmpty(str) ? str : str2;
    }

    public static boolean a(@NonNull Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(AkuEventParamsKey.KEY_ACTIVITY);
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                return false;
            }
            String packageName = context.getPackageName();
            for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
                if (next.processName.equals(packageName) && next.importance == 100) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            String str = f9799a;
            StringBuilder sb = new StringBuilder("isAppInForeground error: ");
            sb.append(th.getMessage());
            ACLog.e(str, sb.toString());
        }
    }

    @NonNull
    public static String a() {
        return Build.VERSION.RELEASE;
    }

    @SuppressLint({"SimpleDateFormat"})
    @NonNull
    public static String a(long j) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(j));
    }

    @Nullable
    public static String a(@Nullable Iterator<? extends CharSequence> it, char c) {
        if (it == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            sb.append((CharSequence) it.next());
            sb.append(c);
        }
        if (sb.length() <= 0) {
            return null;
        }
        return sb.deleteCharAt(sb.length() - 1).toString();
    }

    public static JSONObject a(ConfigCenterContext configCenterContext, Map<String, Object> map) {
        Context context = configCenterContext.getContext();
        ConfigIdentifierProvider identifierProvider = configCenterContext.getIdentifierProvider();
        String versionName = MiscUtils.getVersionName(configCenterContext.getContext());
        if (TextUtils.isEmpty(versionName)) {
            versionName = "1.0";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("utdid", identifierProvider.getUtdId(context));
            jSONObject.put("reference", identifierProvider.getConfigUserId(context));
            jSONObject.put("mobileModel", Build.MODEL);
            jSONObject.put("mobileBrand", Build.BRAND);
            jSONObject.put(EnvDataConstants.MANUFACTURER, Build.MANUFACTURER);
            jSONObject.put("osVersion", a());
            jSONObject.put(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_CLIENTVERSION, versionName);
            jSONObject.put("systemType", DeviceUtils.PLATFORM_TYPE);
            if (map != null) {
                for (Map.Entry next : map.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
            }
        } catch (JSONException e) {
            ACLog.w(f9799a, "buildParameters failed", e);
        }
        return jSONObject;
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                ACLog.e(f9799a, "safeClose failed: ".concat(String.valueOf(e)));
            }
        }
    }

    public static boolean a(String str) {
        try {
            return Class.forName(str) != null;
        } catch (Exception e) {
            String str2 = f9799a;
            StringBuilder sb = new StringBuilder("check class [");
            sb.append(str);
            sb.append("] exception: ");
            sb.append(e);
            ACLog.e(str2, sb.toString());
            return false;
        }
    }

    private static String a(InputStream inputStream) {
        Throwable th;
        InputStreamReader inputStreamReader;
        try {
            inputStreamReader = new InputStreamReader(inputStream);
            try {
                char[] cArr = new char[1024];
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = inputStreamReader.read(cArr);
                    if (read != -1) {
                        sb.append(cArr, 0, read);
                    } else {
                        String obj = sb.toString();
                        a((Closeable) inputStreamReader);
                        a((Closeable) inputStream);
                        return obj;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    ACLog.e(f9799a, "readInputStream", th);
                    return null;
                } finally {
                    a((Closeable) inputStreamReader);
                    a((Closeable) inputStream);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            inputStreamReader = null;
            ACLog.e(f9799a, "readInputStream", th);
            return null;
        }
    }

    @Nullable
    public static String a(Context context, String str) {
        try {
            FileInputStream openFileInput = context.openFileInput(str);
            if (openFileInput == null) {
                return null;
            }
            String a2 = a((InputStream) openFileInput);
            int length2 = a2 != null ? a2.getBytes().length : 0;
            ACLog.i(f9799a, String.format("** loadFile Success! bytes = %s.", new Object[]{Integer.valueOf(length2)}));
            return a2;
        } catch (Throwable th) {
            ACLog.w(f9799a, String.format("** loadFile Failed! Take it easy, cache file not exists. message = %s.", new Object[]{th.getMessage()}));
            return null;
        }
    }

    public static boolean a(Context context, String str, String str2) {
        FileOutputStream fileOutputStream;
        byte[] bArr;
        try {
            fileOutputStream = context.openFileOutput(str, 0);
            if (fileOutputStream == null) {
                a((Closeable) fileOutputStream);
                return false;
            }
            if (str2 != null) {
                try {
                    bArr = str2.getBytes();
                } catch (Throwable th) {
                    th = th;
                    try {
                        ACLog.e(f9799a, "saveFile Error!", th);
                        return false;
                    } finally {
                        a((Closeable) fileOutputStream);
                    }
                }
            } else {
                bArr = new byte[0];
            }
            fileOutputStream.write(bArr);
            String str3 = f9799a;
            ACLog.i(str3, String.format("** saveFile Success! bytes = %s.", new Object[]{Integer.valueOf(bArr.length)}));
            a((Closeable) fileOutputStream);
            return true;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream = null;
            ACLog.e(f9799a, "saveFile Error!", th);
            return false;
        }
    }

    public static boolean a(ConfigCenter configCenter) {
        JSONObject jSONConfig;
        ConfigGetter sectionConfigGetter = configCenter.getSectionConfigGetter(AmcsConstants.X_AMCS_SECTION_KEY);
        if (sectionConfigGetter == null || (jSONConfig = sectionConfigGetter.getJSONConfig(AmcsConstants.CDN_END_COMPUTING_KEY)) == null || !jSONConfig.optBoolean(AmcsConstants.CDN_ENABLE) || configCenter.getConfigContext().getVersion() != ConfigCenterContext.SchemeVersion.V2) {
            return false;
        }
        return true;
    }
}
