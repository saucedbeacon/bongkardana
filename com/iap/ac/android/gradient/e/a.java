package com.iap.ac.android.gradient.e;

import android.content.Context;
import com.iap.ac.android.common.log.ACLog;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Field;

public class a {
    private static int getMax = 1;
    private static int getMin;

    public static String a(Context context, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(context.getCacheDir());
        sb.append("/gradient/");
        sb.append(str);
        return sb.toString();
    }

    public static String a(String str) {
        StringBuilder sb = new StringBuilder("gradient/");
        sb.append(str);
        sb.append("/");
        return sb.toString();
    }

    public static String a(String str, String str2) {
        StringBuilder sb = new StringBuilder("gradient_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append(".jar");
        return sb.toString();
    }

    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                StringBuilder sb = new StringBuilder("safeClose: ");
                sb.append(e);
                ACLog.e("SdkUtil", sb.toString());
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: java.io.BufferedReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.io.InputStreamReader} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String b(android.content.Context r9, java.lang.String r10) {
        /*
            android.content.res.AssetManager r9 = r9.getAssets()     // Catch:{ Exception -> 0x00db }
            r0 = 2
            r1 = 0
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x00a0 }
            r3 = 1
            r2[r3] = r10     // Catch:{ all -> 0x00a0 }
            r10 = 0
            r2[r10] = r9     // Catch:{ all -> 0x00a0 }
            long r4 = android.view.ViewConfiguration.getGlobalActionKeyTimeout()     // Catch:{ all -> 0x00a0 }
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            int r9 = r9 + 18
            int r4 = android.view.ViewConfiguration.getDoubleTapTimeout()     // Catch:{ all -> 0x00a0 }
            int r4 = r4 >> 16
            r5 = 56348(0xdc1c, float:7.896E-41)
            int r6 = android.view.ViewConfiguration.getWindowTouchSlop()     // Catch:{ all -> 0x00a0 }
            int r6 = r6 >> 8
            int r5 = r5 - r6
            char r5 = (char) r5     // Catch:{ all -> 0x00a0 }
            java.lang.Object r9 = o.upFrom.setMax(r9, r4, r5)     // Catch:{ all -> 0x00a0 }
            java.lang.Class r9 = (java.lang.Class) r9     // Catch:{ all -> 0x00a0 }
            java.lang.String r4 = "getMin"
            java.lang.Class[] r5 = new java.lang.Class[r0]     // Catch:{ all -> 0x00a0 }
            java.lang.Class<android.content.res.AssetManager> r6 = android.content.res.AssetManager.class
            r5[r10] = r6     // Catch:{ all -> 0x00a0 }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r5[r3] = r10     // Catch:{ all -> 0x00a0 }
            java.lang.reflect.Method r9 = r9.getMethod(r4, r5)     // Catch:{ all -> 0x00a0 }
            java.lang.Object r9 = r9.invoke(r1, r2)     // Catch:{ all -> 0x00a0 }
            java.io.InputStream r9 = (java.io.InputStream) r9     // Catch:{ all -> 0x00a0 }
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            r10.<init>(r9)     // Catch:{ Exception -> 0x009d, all -> 0x009a }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
            r2.<init>(r10)     // Catch:{ Exception -> 0x0097, all -> 0x0095 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0093 }
            r4.<init>()     // Catch:{ Exception -> 0x0093 }
            int r5 = getMin
            int r5 = r5 + 23
            int r6 = r5 % 128
            getMax = r6
        L_0x005c:
            int r5 = r5 % r0
            java.lang.String r5 = r2.readLine()     // Catch:{ Exception -> 0x0093 }
            r6 = 25
            if (r5 == 0) goto L_0x0068
            r7 = 25
            goto L_0x006a
        L_0x0068:
            r7 = 12
        L_0x006a:
            if (r7 == r6) goto L_0x007a
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0093 }
            a((java.io.Closeable) r2)
            a((java.io.Closeable) r10)
            a((java.io.Closeable) r9)
            return r0
        L_0x007a:
            int r6 = getMax
            int r6 = r6 + 55
            int r7 = r6 % 128
            getMin = r7
            int r6 = r6 % r0
            r4.append(r5)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r5 = "\n"
            r4.append(r5)     // Catch:{ Exception -> 0x0093 }
            int r5 = getMax
            int r5 = r5 + r3
            int r6 = r5 % 128
            getMin = r6
            goto L_0x005c
        L_0x0093:
            r0 = move-exception
            goto L_0x00b3
        L_0x0095:
            r0 = move-exception
            goto L_0x00ce
        L_0x0097:
            r0 = move-exception
            r2 = r1
            goto L_0x00b3
        L_0x009a:
            r10 = move-exception
            r0 = r10
            goto L_0x00ac
        L_0x009d:
            r10 = move-exception
            r0 = r10
            goto L_0x00b1
        L_0x00a0:
            r9 = move-exception
            java.lang.Throwable r10 = r9.getCause()     // Catch:{ Exception -> 0x00ae, all -> 0x00a9 }
            if (r10 == 0) goto L_0x00a8
            throw r10     // Catch:{ Exception -> 0x00ae, all -> 0x00a9 }
        L_0x00a8:
            throw r9     // Catch:{ Exception -> 0x00ae, all -> 0x00a9 }
        L_0x00a9:
            r9 = move-exception
            r0 = r9
            r9 = r1
        L_0x00ac:
            r10 = r1
            goto L_0x00d1
        L_0x00ae:
            r9 = move-exception
            r0 = r9
            r9 = r1
        L_0x00b1:
            r10 = r1
            r2 = r10
        L_0x00b3:
            java.lang.String r3 = "SdkUtil"
            java.lang.String r4 = "readAssetFile failed: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00cc }
            java.lang.String r0 = r4.concat(r0)     // Catch:{ all -> 0x00cc }
            com.iap.ac.android.common.log.ACLog.e(r3, r0)     // Catch:{ all -> 0x00cc }
            a((java.io.Closeable) r2)
            a((java.io.Closeable) r10)
            a((java.io.Closeable) r9)
            return r1
        L_0x00cc:
            r0 = move-exception
            r1 = r2
        L_0x00ce:
            r8 = r1
            r1 = r10
            r10 = r8
        L_0x00d1:
            a((java.io.Closeable) r10)
            a((java.io.Closeable) r1)
            a((java.io.Closeable) r9)
            throw r0
        L_0x00db:
            r9 = move-exception
            goto L_0x00de
        L_0x00dd:
            throw r9
        L_0x00de:
            goto L_0x00dd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.gradient.e.a.b(android.content.Context, java.lang.String):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r0v2 */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r0 = 0
            r1 = 2
            r2 = 0
            java.io.File r3 = new java.io.File     // Catch:{ Exception -> 0x00ab }
            r3.<init>(r10)     // Catch:{ Exception -> 0x00ab }
            boolean r10 = r3.exists()     // Catch:{ Exception -> 0x00ab }
            if (r10 != 0) goto L_0x001f
            int r10 = getMin     // Catch:{ Exception -> 0x001d }
            int r10 = r10 + 51
            int r4 = r10 % 128
            getMax = r4     // Catch:{ Exception -> 0x001b }
            int r10 = r10 % r1
            r3.mkdirs()     // Catch:{ Exception -> 0x00ab }
            goto L_0x001f
        L_0x001b:
            r8 = move-exception
            throw r8
        L_0x001d:
            r8 = move-exception
            throw r8
        L_0x001f:
            java.io.File r10 = new java.io.File     // Catch:{ Exception -> 0x00ab }
            r10.<init>(r3, r11)     // Catch:{ Exception -> 0x00ab }
            boolean r11 = r10.exists()     // Catch:{ Exception -> 0x00a8 }
            if (r11 != 0) goto L_0x00a7
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch:{ Exception -> 0x00a8 }
            java.lang.Object[] r11 = new java.lang.Object[r1]     // Catch:{ all -> 0x009e }
            r3 = 1
            r11[r3] = r9     // Catch:{ all -> 0x009e }
            r11[r2] = r8     // Catch:{ all -> 0x009e }
            int r8 = android.view.ViewConfiguration.getScrollBarFadeDuration()     // Catch:{ all -> 0x009e }
            int r8 = r8 >> 16
            int r8 = r8 + 19
            long r4 = android.widget.ExpandableListView.getPackedPositionForChild(r2, r2)     // Catch:{ all -> 0x009e }
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            int r9 = r9 + r3
            r4 = 56348(0xdc1c, float:7.896E-41)
            int r5 = android.graphics.Color.alpha(r2)     // Catch:{ all -> 0x009e }
            int r4 = r4 - r5
            char r4 = (char) r4     // Catch:{ all -> 0x009e }
            java.lang.Object r8 = o.upFrom.setMax(r8, r9, r4)     // Catch:{ all -> 0x009e }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x009e }
            java.lang.String r9 = "getMin"
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ all -> 0x009e }
            java.lang.Class<android.content.res.AssetManager> r5 = android.content.res.AssetManager.class
            r4[r2] = r5     // Catch:{ all -> 0x009e }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r3] = r5     // Catch:{ all -> 0x009e }
            java.lang.reflect.Method r8 = r8.getMethod(r9, r4)     // Catch:{ all -> 0x009e }
            java.lang.Object r8 = r8.invoke(r0, r11)     // Catch:{ all -> 0x009e }
            java.io.InputStream r8 = (java.io.InputStream) r8     // Catch:{ all -> 0x009e }
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch:{ all -> 0x0095 }
            r9.<init>(r10)     // Catch:{ all -> 0x0095 }
            r11 = 1024(0x400, float:1.435E-42)
            byte[] r11 = new byte[r11]     // Catch:{ all -> 0x0092 }
        L_0x0074:
            int r0 = r8.read(r11)     // Catch:{ all -> 0x0092 }
            r3 = -1
            if (r0 == r3) goto L_0x0088
            int r3 = getMax
            int r3 = r3 + 95
            int r4 = r3 % 128
            getMin = r4
            int r3 = r3 % r1
            r9.write(r11, r2, r0)     // Catch:{ all -> 0x0092 }
            goto L_0x0074
        L_0x0088:
            r9.flush()     // Catch:{ all -> 0x0092 }
            a((java.io.Closeable) r8)     // Catch:{ Exception -> 0x00a8 }
            a((java.io.Closeable) r9)     // Catch:{ Exception -> 0x00a8 }
            return
        L_0x0092:
            r11 = move-exception
            r0 = r9
            goto L_0x0097
        L_0x0095:
            r9 = move-exception
            r11 = r9
        L_0x0097:
            a((java.io.Closeable) r8)     // Catch:{ Exception -> 0x00a8 }
            a((java.io.Closeable) r0)     // Catch:{ Exception -> 0x00a8 }
            throw r11     // Catch:{ Exception -> 0x00a8 }
        L_0x009e:
            r8 = move-exception
            java.lang.Throwable r9 = r8.getCause()     // Catch:{ Exception -> 0x00a8 }
            if (r9 == 0) goto L_0x00a6
            throw r9     // Catch:{ Exception -> 0x00a8 }
        L_0x00a6:
            throw r8     // Catch:{ Exception -> 0x00a8 }
        L_0x00a7:
            return
        L_0x00a8:
            r8 = move-exception
            r0 = r10
            goto L_0x00ac
        L_0x00ab:
            r8 = move-exception
        L_0x00ac:
            r9 = 50
            r10 = 86
            if (r0 == 0) goto L_0x00b5
            r11 = 50
            goto L_0x00b7
        L_0x00b5:
            r11 = 86
        L_0x00b7:
            if (r11 != r9) goto L_0x00d0
            boolean r9 = r0.exists()
            if (r9 == 0) goto L_0x00c0
            goto L_0x00c2
        L_0x00c0:
            r2 = 86
        L_0x00c2:
            if (r2 == r10) goto L_0x00d0
            int r9 = getMin
            int r9 = r9 + 99
            int r10 = r9 % 128
            getMax = r10
            int r9 = r9 % r1
            r0.delete()
        L_0x00d0:
            goto L_0x00d2
        L_0x00d1:
            throw r8
        L_0x00d2:
            goto L_0x00d1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.gradient.e.a.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public static void a(Class<?> cls, ClassLoader classLoader, ClassLoader classLoader2) {
        Field field;
        ClassLoader classLoader3 = cls.getClassLoader();
        ClassLoader parent = classLoader3.getParent();
        Field[] declaredFields = ClassLoader.class.getDeclaredFields();
        int length = declaredFields.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                field = null;
                break;
            }
            field = declaredFields[i];
            try {
                boolean isAccessible = field.isAccessible();
                field.setAccessible(true);
                Object obj = field.get(classLoader3);
                field.setAccessible(isAccessible);
                if (obj == parent) {
                    break;
                }
                i++;
            } catch (IllegalAccessException unused) {
            }
        }
        if (field != null) {
            field.setAccessible(true);
            field.set(classLoader, classLoader2);
            return;
        }
        throw new RuntimeException("not found the field of parent");
    }
}
