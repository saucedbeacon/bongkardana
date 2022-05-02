package com.iap.ac.android.diagnoselog.util;

import android.text.TextUtils;
import com.iap.ac.android.diagnoselog.a.d;
import java.io.File;

public class ProcessUtil {
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b0 A[SYNTHETIC, Splitter:B:54:0x00b0] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(android.content.Context r9) {
        /*
            int r0 = android.os.Process.myPid()
            java.lang.String r1 = ""
            if (r9 == 0) goto L_0x00b4
            if (r0 <= 0) goto L_0x00b4
            java.lang.String r2 = "activity"
            java.lang.Object r9 = r9.getSystemService(r2)
            android.app.ActivityManager r9 = (android.app.ActivityManager) r9
            java.lang.String r2 = "getProcessNameInternal exception:"
            r3 = 0
            java.lang.String r4 = "ProcessUtil"
            if (r9 == 0) goto L_0x004e
            java.util.List r9 = r9.getRunningAppProcesses()     // Catch:{ Exception -> 0x003a }
            if (r9 == 0) goto L_0x004e
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Exception -> 0x003a }
        L_0x0023:
            boolean r5 = r9.hasNext()     // Catch:{ Exception -> 0x003a }
            if (r5 == 0) goto L_0x0034
            java.lang.Object r5 = r9.next()     // Catch:{ Exception -> 0x003a }
            android.app.ActivityManager$RunningAppProcessInfo r5 = (android.app.ActivityManager.RunningAppProcessInfo) r5     // Catch:{ Exception -> 0x003a }
            int r6 = r5.pid     // Catch:{ Exception -> 0x003a }
            if (r6 != r0) goto L_0x0023
            goto L_0x0035
        L_0x0034:
            r5 = r3
        L_0x0035:
            if (r5 == 0) goto L_0x004e
            java.lang.String r9 = r5.processName     // Catch:{ Exception -> 0x003a }
            return r9
        L_0x003a:
            r9 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>(r2)
            java.lang.String r9 = r9.getMessage()
            r5.append(r9)
            java.lang.String r9 = r5.toString()
            com.iap.ac.android.loglite.utils.LoggerWrapper.e(r4, r9)
        L_0x004e:
            r9 = 128(0x80, float:1.794E-43)
            byte[] r5 = new byte[r9]
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0093 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0093 }
            java.lang.String r8 = "/proc/"
            r7.<init>(r8)     // Catch:{ Exception -> 0x0093 }
            r7.append(r0)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r0 = "/cmdline"
            r7.append(r0)     // Catch:{ Exception -> 0x0093 }
            java.lang.String r0 = r7.toString()     // Catch:{ Exception -> 0x0093 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x0093 }
            int r0 = r6.read(r5)     // Catch:{ Exception -> 0x008e, all -> 0x008b }
            if (r0 <= 0) goto L_0x00aa
            r3 = 0
            r7 = 0
        L_0x0072:
            if (r7 >= r0) goto L_0x0082
            byte r8 = r5[r7]     // Catch:{ Exception -> 0x008e, all -> 0x008b }
            r8 = r8 & 255(0xff, float:3.57E-43)
            if (r8 > r9) goto L_0x0081
            byte r8 = r5[r7]     // Catch:{ Exception -> 0x008e, all -> 0x008b }
            if (r8 <= 0) goto L_0x0081
            int r7 = r7 + 1
            goto L_0x0072
        L_0x0081:
            r0 = r7
        L_0x0082:
            java.lang.String r9 = new java.lang.String     // Catch:{ Exception -> 0x008e, all -> 0x008b }
            r9.<init>(r5, r3, r0)     // Catch:{ Exception -> 0x008e, all -> 0x008b }
            r6.close()     // Catch:{ Exception -> 0x008a }
        L_0x008a:
            return r9
        L_0x008b:
            r9 = move-exception
            r3 = r6
            goto L_0x00ae
        L_0x008e:
            r9 = move-exception
            r3 = r6
            goto L_0x0094
        L_0x0091:
            r9 = move-exception
            goto L_0x00ae
        L_0x0093:
            r9 = move-exception
        L_0x0094:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0091 }
            r0.<init>(r2)     // Catch:{ all -> 0x0091 }
            java.lang.String r9 = r9.getMessage()     // Catch:{ all -> 0x0091 }
            r0.append(r9)     // Catch:{ all -> 0x0091 }
            java.lang.String r9 = r0.toString()     // Catch:{ all -> 0x0091 }
            com.iap.ac.android.loglite.utils.LoggerWrapper.e(r4, r9)     // Catch:{ all -> 0x0091 }
            if (r3 == 0) goto L_0x00ad
            r6 = r3
        L_0x00aa:
            r6.close()     // Catch:{ Exception -> 0x00ad }
        L_0x00ad:
            return r1
        L_0x00ae:
            if (r3 == 0) goto L_0x00b3
            r3.close()     // Catch:{ Exception -> 0x00b3 }
        L_0x00b3:
            throw r9
        L_0x00b4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.diagnoselog.util.ProcessUtil.a(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:38|39|40|41|42|43|44|84) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x0092 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:42:0x0095 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00a5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(java.util.List<java.io.File> r10, java.lang.String r11, java.io.File r12, com.iap.ac.android.diagnoselog.util.ZipUtil$ZipFileHandler r13) throws java.lang.Exception {
        /*
            if (r10 == 0) goto L_0x00dc
            boolean r12 = r10.isEmpty()
            if (r12 != 0) goto L_0x00dc
            if (r11 == 0) goto L_0x00d4
            int r12 = r11.length()
            if (r12 == 0) goto L_0x00d4
            java.io.File r12 = new java.io.File
            r12.<init>(r11)
            boolean r0 = r12.isDirectory()
            if (r0 != 0) goto L_0x00c4
            java.io.File r12 = r12.getParentFile()     // Catch:{ all -> 0x002a }
            if (r12 == 0) goto L_0x002a
            boolean r0 = r12.exists()     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x002a
            r12.mkdirs()     // Catch:{ all -> 0x002a }
        L_0x002a:
            r12 = 0
            java.util.zip.ZipOutputStream r0 = new java.util.zip.ZipOutputStream     // Catch:{ all -> 0x00ae }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ all -> 0x00ae }
            r1.<init>(r11)     // Catch:{ all -> 0x00ae }
            r0.<init>(r1)     // Catch:{ all -> 0x00ae }
            r11 = 8192(0x2000, float:1.14794E-41)
            byte[] r11 = new byte[r11]     // Catch:{ all -> 0x00ac }
            r1 = 0
            r3 = r12
            r2 = 0
        L_0x003c:
            int r4 = r10.size()     // Catch:{ all -> 0x00a9 }
            if (r2 >= r4) goto L_0x00a0
            java.lang.Object r4 = r10.get(r2)     // Catch:{ all -> 0x00a9 }
            java.io.File r4 = (java.io.File) r4     // Catch:{ all -> 0x00a9 }
            if (r4 == 0) goto L_0x009d
            boolean r5 = r4.exists()     // Catch:{ all -> 0x00a9 }
            if (r5 == 0) goto L_0x009d
            boolean r5 = r4.isFile()     // Catch:{ all -> 0x00a9 }
            if (r5 == 0) goto L_0x009d
            long r5 = r4.length()     // Catch:{ all -> 0x00a9 }
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 == 0) goto L_0x009d
            java.lang.String r5 = a(r12, r4, r13)     // Catch:{ all -> 0x00a9 }
            java.util.zip.ZipEntry r6 = new java.util.zip.ZipEntry     // Catch:{ all -> 0x00a9 }
            r6.<init>(r5)     // Catch:{ all -> 0x00a9 }
            long r7 = r4.length()     // Catch:{ all -> 0x00a9 }
            r6.setSize(r7)     // Catch:{ all -> 0x00a9 }
            long r7 = r4.lastModified()     // Catch:{ all -> 0x00a9 }
            r6.setTime(r7)     // Catch:{ all -> 0x00a9 }
            r0.putNextEntry(r6)     // Catch:{ all -> 0x00a9 }
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch:{ all -> 0x00a9 }
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ all -> 0x00a9 }
            r6.<init>(r4)     // Catch:{ all -> 0x00a9 }
            r5.<init>(r6)     // Catch:{ all -> 0x00a9 }
        L_0x0084:
            int r3 = r5.read(r11)     // Catch:{ all -> 0x009a }
            r4 = -1
            if (r3 == r4) goto L_0x008f
            r0.write(r11, r1, r3)     // Catch:{ all -> 0x009a }
            goto L_0x0084
        L_0x008f:
            r5.close()     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r0.flush()     // Catch:{ all -> 0x0095 }
        L_0x0095:
            r0.closeEntry()     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r3 = r5
            goto L_0x009d
        L_0x009a:
            r10 = move-exception
            r12 = r5
            goto L_0x00b0
        L_0x009d:
            int r2 = r2 + 1
            goto L_0x003c
        L_0x00a0:
            if (r3 == 0) goto L_0x00a5
            r3.close()     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r0.close()     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            return
        L_0x00a9:
            r10 = move-exception
            r12 = r3
            goto L_0x00b0
        L_0x00ac:
            r10 = move-exception
            goto L_0x00b0
        L_0x00ae:
            r10 = move-exception
            r0 = r12
        L_0x00b0:
            java.lang.Exception r11 = new java.lang.Exception     // Catch:{ all -> 0x00b6 }
            r11.<init>(r10)     // Catch:{ all -> 0x00b6 }
            throw r11     // Catch:{ all -> 0x00b6 }
        L_0x00b6:
            r10 = move-exception
            if (r12 == 0) goto L_0x00be
            r12.close()     // Catch:{ all -> 0x00bd }
            goto L_0x00be
        L_0x00bd:
        L_0x00be:
            if (r0 == 0) goto L_0x00c3
            r0.close()     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            throw r10
        L_0x00c4:
            java.lang.Exception r10 = new java.lang.Exception
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r12 = "zipFilePath is directory: "
            java.lang.String r11 = r12.concat(r11)
            r10.<init>(r11)
            throw r10
        L_0x00d4:
            java.lang.Exception r10 = new java.lang.Exception
            java.lang.String r11 = "zipFilePath is none"
            r10.<init>(r11)
            throw r10
        L_0x00dc:
            java.lang.Exception r10 = new java.lang.Exception
            java.lang.String r11 = "willZipList is empty"
            r10.<init>(r11)
            goto L_0x00e5
        L_0x00e4:
            throw r10
        L_0x00e5:
            goto L_0x00e4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.diagnoselog.util.ProcessUtil.a(java.util.List, java.lang.String, java.io.File, com.iap.ac.android.diagnoselog.util.ZipUtil$ZipFileHandler):void");
    }

    public static String a(File file, File file2, ZipUtil$ZipFileHandler zipUtil$ZipFileHandler) {
        if (file == null) {
            file = file2.getParentFile();
        }
        String str = null;
        if (zipUtil$ZipFileHandler != null) {
            try {
                str = ((d) zipUtil$ZipFileHandler).a(file2);
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = file2.getName();
        }
        while (true) {
            file2 = file2.getParentFile();
            if (file2 == null || file2.equals(file)) {
                break;
            }
            String name = file2.getName();
            if (TextUtils.isEmpty(name)) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(name);
            sb.append('/');
            sb.append(str);
            str = sb.toString();
        }
        return str;
    }
}
