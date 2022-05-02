package com.alibaba.griver.base.common.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import o.upFrom;

public class KitUtils {
    private static int getMax = 1;
    private static int setMin;

    @NonNull
    public static String getAssetUrl(@NonNull String str) {
        return "file:///android_asset/".concat(String.valueOf(str));
    }

    @Nullable
    public static String base64(byte[] bArr) {
        if (bArr != null && bArr.length > 0) {
            try {
                return new String(Base64.encode(bArr, 0));
            } catch (Exception e) {
                GriverLogger.e("KitUtils", "", e);
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [java.lang.Object, byte[]] */
    /* JADX WARNING: type inference failed for: r7v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r7v2 */
    /* JADX WARNING: type inference failed for: r7v3 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002b, code lost:
        if ((r11 == null) != false) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0018, code lost:
        if (r11 == null) goto L_0x002d;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00ca A[SYNTHETIC, Splitter:B:60:0x00ca] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d3 A[SYNTHETIC, Splitter:B:65:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00e0 A[SYNTHETIC, Splitter:B:73:0x00e0] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:57:0x00c5=Splitter:B:57:0x00c5, B:62:0x00ce=Splitter:B:62:0x00ce} */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] getAssetBytesContent(@androidx.annotation.NonNull android.content.Context r11, @androidx.annotation.NonNull java.lang.String r12) {
        /*
            int r0 = getMax
            int r0 = r0 + 23
            int r1 = r0 % 128
            setMin = r1
            r1 = 2
            int r0 = r0 % r1
            java.lang.String r2 = "getAssetBytesContent failed"
            r3 = 1
            r4 = 0
            java.lang.String r5 = ""
            java.lang.String r6 = "KitUtils"
            r7 = 0
            if (r0 == 0) goto L_0x0026
            super.hashCode()     // Catch:{ IOException -> 0x0022, Exception -> 0x001e, all -> 0x001b }
            if (r11 != 0) goto L_0x0045
            goto L_0x002d
        L_0x001b:
            r11 = move-exception
            goto L_0x00de
        L_0x001e:
            r11 = move-exception
            r12 = r7
            goto L_0x00c5
        L_0x0022:
            r11 = move-exception
            r12 = r7
            goto L_0x00ce
        L_0x0026:
            if (r11 != 0) goto L_0x002a
            r0 = 1
            goto L_0x002b
        L_0x002a:
            r0 = 0
        L_0x002b:
            if (r0 == 0) goto L_0x0045
        L_0x002d:
            int r11 = getMax     // Catch:{ Exception -> 0x0043 }
            int r11 = r11 + 83
            int r0 = r11 % 128
            setMin = r0     // Catch:{ Exception -> 0x0043 }
            int r11 = r11 % r1
            if (r11 == 0) goto L_0x003e
            android.app.Application r11 = com.alibaba.griver.base.common.env.GriverEnv.getApplicationContext()     // Catch:{ IOException -> 0x0022, Exception -> 0x001e, all -> 0x001b }
            int r0 = r7.length     // Catch:{ IOException -> 0x0022, Exception -> 0x001e, all -> 0x001b }
            goto L_0x0045
        L_0x003e:
            android.app.Application r11 = com.alibaba.griver.base.common.env.GriverEnv.getApplicationContext()     // Catch:{ IOException -> 0x0022, Exception -> 0x001e, all -> 0x001b }
            goto L_0x0045
        L_0x0043:
            r11 = move-exception
            goto L_0x00a8
        L_0x0045:
            android.content.res.AssetManager r11 = r11.getAssets()     // Catch:{ IOException -> 0x0022, Exception -> 0x001e, all -> 0x001b }
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x00bc }
            r0[r3] = r12     // Catch:{ all -> 0x00bc }
            r0[r4] = r11     // Catch:{ all -> 0x00bc }
            int r11 = android.view.MotionEvent.axisFromString(r5)     // Catch:{ all -> 0x00bc }
            int r11 = 18 - r11
            int r12 = android.text.TextUtils.getTrimmedLength(r5)     // Catch:{ all -> 0x00bc }
            r8 = 56348(0xdc1c, float:7.896E-41)
            int r9 = android.view.View.getDefaultSize(r4, r4)     // Catch:{ all -> 0x00bc }
            int r8 = r8 - r9
            char r8 = (char) r8     // Catch:{ all -> 0x00bc }
            java.lang.Object r11 = o.upFrom.setMax(r11, r12, r8)     // Catch:{ all -> 0x00bc }
            java.lang.Class r11 = (java.lang.Class) r11     // Catch:{ all -> 0x00bc }
            java.lang.String r12 = "getMin"
            java.lang.Class[] r8 = new java.lang.Class[r1]     // Catch:{ all -> 0x00bc }
            java.lang.Class<android.content.res.AssetManager> r9 = android.content.res.AssetManager.class
            r8[r4] = r9     // Catch:{ all -> 0x00bc }
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r3] = r4     // Catch:{ all -> 0x00bc }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r8)     // Catch:{ all -> 0x00bc }
            java.lang.Object r11 = r11.invoke(r7, r0)     // Catch:{ all -> 0x00bc }
            java.io.InputStream r11 = (java.io.InputStream) r11     // Catch:{ all -> 0x00bc }
            int r12 = r11.available()     // Catch:{ IOException -> 0x00b7, Exception -> 0x00b2, all -> 0x00ae }
            byte[] r12 = new byte[r12]     // Catch:{ IOException -> 0x00b7, Exception -> 0x00b2, all -> 0x00ae }
            r11.read(r12)     // Catch:{ IOException -> 0x00b7, Exception -> 0x00b2, all -> 0x00ae }
            r0 = 70
            if (r11 == 0) goto L_0x008e
            r2 = 66
            goto L_0x0090
        L_0x008e:
            r2 = 70
        L_0x0090:
            if (r2 == r0) goto L_0x00ad
            int r0 = getMax
            int r0 = r0 + 81
            int r2 = r0 % 128
            setMin = r2
            int r0 = r0 % r1
            r11.close()     // Catch:{ IOException -> 0x00a9 }
            int r11 = getMax     // Catch:{ Exception -> 0x0043 }
            int r11 = r11 + 107
            int r0 = r11 % 128
            setMin = r0     // Catch:{ Exception -> 0x0043 }
            int r11 = r11 % r1
            goto L_0x00ad
        L_0x00a8:
            throw r11
        L_0x00a9:
            r11 = move-exception
            com.alibaba.griver.base.common.logger.GriverLogger.e(r6, r5, r11)
        L_0x00ad:
            return r12
        L_0x00ae:
            r12 = move-exception
            r7 = r11
            r11 = r12
            goto L_0x00de
        L_0x00b2:
            r12 = move-exception
            r10 = r12
            r12 = r11
            r11 = r10
            goto L_0x00c5
        L_0x00b7:
            r12 = move-exception
            r10 = r12
            r12 = r11
            r11 = r10
            goto L_0x00ce
        L_0x00bc:
            r11 = move-exception
            java.lang.Throwable r12 = r11.getCause()     // Catch:{ IOException -> 0x0022, Exception -> 0x001e, all -> 0x001b }
            if (r12 == 0) goto L_0x00c4
            throw r12     // Catch:{ IOException -> 0x0022, Exception -> 0x001e, all -> 0x001b }
        L_0x00c4:
            throw r11     // Catch:{ IOException -> 0x0022, Exception -> 0x001e, all -> 0x001b }
        L_0x00c5:
            com.alibaba.griver.base.common.logger.GriverLogger.e(r6, r2, r11)     // Catch:{ all -> 0x00dc }
            if (r12 == 0) goto L_0x00db
            r12.close()     // Catch:{ IOException -> 0x00d7 }
            goto L_0x00db
        L_0x00ce:
            com.alibaba.griver.base.common.logger.GriverLogger.e(r6, r2, r11)     // Catch:{ all -> 0x00dc }
            if (r12 == 0) goto L_0x00db
            r12.close()     // Catch:{ IOException -> 0x00d7 }
            goto L_0x00db
        L_0x00d7:
            r11 = move-exception
            com.alibaba.griver.base.common.logger.GriverLogger.e(r6, r5, r11)
        L_0x00db:
            return r7
        L_0x00dc:
            r11 = move-exception
            r7 = r12
        L_0x00de:
            if (r7 == 0) goto L_0x00e8
            r7.close()     // Catch:{ IOException -> 0x00e4 }
            goto L_0x00e8
        L_0x00e4:
            r12 = move-exception
            com.alibaba.griver.base.common.logger.GriverLogger.e(r6, r5, r12)
        L_0x00e8:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.KitUtils.getAssetBytesContent(android.content.Context, java.lang.String):byte[]");
    }

    @NonNull
    public static String getAssetContent(@NonNull Context context, @NonNull String str) {
        StringBuilder sb = new StringBuilder();
        if ((context == null ? '-' : 5) == '-') {
            try {
                context = GriverEnv.getApplicationContext();
            } catch (Exception e) {
                GriverLogger.e("KitUtils", "", e);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        AssetManager assets = context.getAssets();
        Object[] objArr = new Object[2];
        objArr[1] = str;
        objArr[0] = assets;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((InputStream) ((Class) upFrom.setMax(Color.blue(0) + 19, ViewConfiguration.getDoubleTapTimeout() >> 16, (char) (56348 - (ViewConfiguration.getTouchSlop() >> 8)))).getMethod("getMin", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr)));
        while (true) {
            String readLine = bufferedReader.readLine();
            if (!(readLine != null)) {
                break;
            }
            try {
                int i = getMax + 75;
                setMin = i % 128;
                int i2 = i % 2;
                sb.append(readLine);
                sb.append("\r\n");
                int i3 = setMin + 31;
                getMax = i3 % 128;
                int i4 = i3 % 2;
            } catch (Exception e2) {
                throw e2;
            }
        }
        bufferedReader.close();
        return sb.toString();
    }

    @Nullable
    public static String getDomain(String str) {
        try {
            return new URL(str).getHost();
        } catch (Exception unused) {
            return null;
        }
    }

    public static boolean isDomainMatch(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        String domain = getDomain(str2);
        if (TextUtils.isEmpty(domain)) {
            return false;
        }
        if (domain.equals(str)) {
            return true;
        }
        return domain.endsWith(".".concat(String.valueOf(str)));
    }

    @Nullable
    public static String getFileName(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("/");
        return (lastIndexOf <= 0 || lastIndexOf >= str.length()) ? str : str.substring(lastIndexOf + 1, str.length());
    }
}
