package com.iap.ac.android.acs.multilanguage.utils;

import androidx.annotation.NonNull;
import com.iap.ac.android.common.log.ACLog;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileUtils {
    private static final String TAG = LanguagePackageUtil.logTag(com.alibaba.griver.image.framework.utils.FileUtils.TAG);
    private static int length = 1;
    private static int setMin;

    public static void writeStringToFile(@NonNull String str, @NonNull String str2, @NonNull String str3) throws Exception {
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream = null;
        try {
            File file = new File(str);
            String str4 = TAG;
            StringBuilder sb = new StringBuilder("writeStringToFile() dir = ");
            sb.append(file.getAbsolutePath());
            ACLog.d(str4, sb.toString());
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, str2);
            if (file2.exists()) {
                file2.delete();
            }
            file2.createNewFile();
            fileOutputStream = new FileOutputStream(file2);
            try {
                BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                try {
                    bufferedOutputStream2.write(str3.getBytes());
                    closeStream(bufferedOutputStream2);
                    closeStream(fileOutputStream);
                } catch (Throwable th) {
                    bufferedOutputStream = bufferedOutputStream2;
                    th = th;
                    closeStream(bufferedOutputStream);
                    closeStream(fileOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                closeStream(bufferedOutputStream);
                closeStream(fileOutputStream);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
            closeStream(bufferedOutputStream);
            closeStream(fileOutputStream);
            throw th;
        }
    }

    public static String readStringFromFile(@NonNull String str, @NonNull String str2) throws Exception {
        BufferedReader bufferedReader;
        FileInputStream fileInputStream;
        Throwable th;
        try {
            fileInputStream = new FileInputStream(new File(str, str2));
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            } catch (Throwable th2) {
                th = th2;
                bufferedReader = null;
                closeStream(bufferedReader);
                closeStream(fileInputStream);
                throw th;
            }
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine != null) {
                        sb.append(readLine);
                    } else {
                        String obj = sb.toString();
                        closeStream(bufferedReader);
                        closeStream(fileInputStream);
                        return obj;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                closeStream(bufferedReader);
                closeStream(fileInputStream);
                throw th;
            }
        } catch (Throwable th4) {
            bufferedReader = null;
            th = th4;
            fileInputStream = null;
            closeStream(bufferedReader);
            closeStream(fileInputStream);
            throw th;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.InputStreamReader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.InputStreamReader} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String readConfigFromAsset(android.content.Context r7, java.lang.String r8) {
        /*
            java.lang.String r0 = ""
            android.content.res.AssetManager r7 = r7.getAssets()
            r1 = 2
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch:{ all -> 0x0097 }
            r4 = 1
            r3[r4] = r8     // Catch:{ all -> 0x0097 }
            r8 = 0
            r3[r8] = r7     // Catch:{ all -> 0x0097 }
            int r7 = android.view.View.MeasureSpec.getMode(r8)     // Catch:{ all -> 0x0097 }
            int r7 = 19 - r7
            r5 = 48
            int r5 = android.text.TextUtils.lastIndexOf(r0, r5, r8, r8)     // Catch:{ all -> 0x0097 }
            int r5 = -1 - r5
            r6 = 56347(0xdc1b, float:7.8959E-41)
            int r0 = android.view.MotionEvent.axisFromString(r0)     // Catch:{ all -> 0x0097 }
            int r6 = r6 - r0
            char r0 = (char) r6     // Catch:{ all -> 0x0097 }
            java.lang.Object r7 = o.upFrom.setMax(r7, r5, r0)     // Catch:{ all -> 0x0097 }
            java.lang.Class r7 = (java.lang.Class) r7     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "getMin"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ all -> 0x0097 }
            java.lang.Class<android.content.res.AssetManager> r6 = android.content.res.AssetManager.class
            r5[r8] = r6     // Catch:{ all -> 0x0097 }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r5[r4] = r8     // Catch:{ all -> 0x0097 }
            java.lang.reflect.Method r7 = r7.getMethod(r0, r5)     // Catch:{ all -> 0x0097 }
            java.lang.Object r7 = r7.invoke(r2, r3)     // Catch:{ all -> 0x0097 }
            java.io.InputStream r7 = (java.io.InputStream) r7     // Catch:{ all -> 0x0097 }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0094, all -> 0x0091 }
            r8.<init>(r7)     // Catch:{ Exception -> 0x0094, all -> 0x0091 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ Exception -> 0x008e, all -> 0x008c }
            r0.<init>(r8)     // Catch:{ Exception -> 0x008e, all -> 0x008c }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008a }
            r3.<init>()     // Catch:{ Exception -> 0x008a }
            int r4 = length     // Catch:{ Exception -> 0x0088 }
            int r4 = r4 + 39
            int r5 = r4 % 128
            setMin = r5     // Catch:{ Exception -> 0x0088 }
            int r4 = r4 % r1
        L_0x005b:
            java.lang.String r1 = r0.readLine()     // Catch:{ Exception -> 0x008a }
            r4 = 58
            if (r1 == 0) goto L_0x0066
            r5 = 58
            goto L_0x0068
        L_0x0066:
            r5 = 82
        L_0x0068:
            if (r5 == r4) goto L_0x0078
            java.lang.String r1 = r3.toString()     // Catch:{ Exception -> 0x008a }
            closeStream(r0)
            closeStream(r8)
            closeStream(r7)
            return r1
        L_0x0078:
            int r4 = setMin     // Catch:{ Exception -> 0x0086 }
            int r4 = r4 + 77
            int r5 = r4 % 128
            length = r5     // Catch:{ Exception -> 0x0086 }
            int r4 = r4 % 2
            r3.append(r1)     // Catch:{ Exception -> 0x008a }
            goto L_0x005b
        L_0x0086:
            r7 = move-exception
            throw r7
        L_0x0088:
            r7 = move-exception
            throw r7
        L_0x008a:
            r1 = move-exception
            goto L_0x00a8
        L_0x008c:
            r1 = move-exception
            goto L_0x00c3
        L_0x008e:
            r1 = move-exception
            r0 = r2
            goto L_0x00a8
        L_0x0091:
            r1 = move-exception
            r8 = r2
            goto L_0x00c3
        L_0x0094:
            r1 = move-exception
            r8 = r2
            goto L_0x00a7
        L_0x0097:
            r7 = move-exception
            java.lang.Throwable r8 = r7.getCause()     // Catch:{ Exception -> 0x00a4, all -> 0x00a0 }
            if (r8 == 0) goto L_0x009f
            throw r8     // Catch:{ Exception -> 0x00a4, all -> 0x00a0 }
        L_0x009f:
            throw r7     // Catch:{ Exception -> 0x00a4, all -> 0x00a0 }
        L_0x00a0:
            r1 = move-exception
            r7 = r2
            r8 = r7
            goto L_0x00c3
        L_0x00a4:
            r1 = move-exception
            r7 = r2
            r8 = r7
        L_0x00a7:
            r0 = r8
        L_0x00a8:
            java.lang.String r3 = "IAPConnect"
            java.lang.String r4 = "readConfigFromAsset failed: "
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = r4.concat(r1)     // Catch:{ all -> 0x00c1 }
            com.iap.ac.android.common.log.ACLog.e(r3, r1)     // Catch:{ all -> 0x00c1 }
            closeStream(r0)
            closeStream(r8)
            closeStream(r7)
            return r2
        L_0x00c1:
            r1 = move-exception
            r2 = r0
        L_0x00c3:
            closeStream(r2)
            closeStream(r8)
            closeStream(r7)
            goto L_0x00ce
        L_0x00cd:
            throw r1
        L_0x00ce:
            goto L_0x00cd
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.acs.multilanguage.utils.FileUtils.readConfigFromAsset(android.content.Context, java.lang.String):java.lang.String");
    }

    public static boolean isFileExists(String str, String str2) {
        File file = new File(str, str2);
        return file.exists() && file.length() > 0;
    }

    public static boolean deleteFile(String str, String str2) {
        if (isFileExists(str, str2)) {
            return new File(str, str2).delete();
        }
        return false;
    }

    private static void closeStream(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                ACLog.d(TAG, "closeStream() failed, error: ".concat(String.valueOf(e)));
            }
        }
    }
}
