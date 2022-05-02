package com.alipay.iap.android.aplog.util;

import android.os.Environment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.alipay.iap.android.aplog.core.LoggerFactory;
import java.io.File;
import java.util.Calendar;
import java.util.TimeZone;
import kotlin.text.Typography;

public class LoggingUtil {
    private static final char EXT_PARAM_GAP = '^';
    private static final char LOG_GAP = ',';
    private static final String TAG = "LoggingUtil";
    public static String UNDERLINE = "_";
    private static boolean debuggable = false;
    private static int getMin = 1;
    private static int length;
    private static long setMin;

    static void setMax() {
        setMin = 4741385576750036554L;
    }

    static {
        setMax();
        int i = length + 65;
        getMin = i % 128;
        int i2 = i % 2;
    }

    public static File getCommonExternalStorageDir() {
        File file;
        try {
            file = new File(Environment.getExternalStorageDirectory(), "iapLog");
        } catch (Throwable unused) {
            file = new File("/sdcard/iapLog");
        }
        try {
            if ((file.exists() ? ' ' : ';') != ';') {
                if ((file.isFile() ? '*' : 5) == '*') {
                    try {
                        int i = getMin + 37;
                        length = i % 128;
                        int i2 = i % 2;
                        FileUtil.deleteFileNotDir(file);
                        file.mkdirs();
                        return file;
                    } catch (Exception e) {
                        throw e;
                    }
                }
            } else {
                file.mkdirs();
            }
            int i3 = getMin + 53;
            length = i3 % 128;
            int i4 = i3 % 2;
        } catch (Throwable unused2) {
        }
        return file;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.io.File} */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r2v2, types: [java.io.File] */
    /* JADX WARNING: type inference failed for: r2v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (com.alipay.iap.android.aplog.util.FileUtil.sdCardAvailable() != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002e, code lost:
        if (r0 != false) goto L_0x0030;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File getStorageFilesDir(android.content.Context r6, java.lang.String r7) {
        /*
            boolean r0 = debuggable
            r1 = 38
            if (r0 == 0) goto L_0x0009
            r0 = 38
            goto L_0x000b
        L_0x0009:
            r0 = 60
        L_0x000b:
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == r1) goto L_0x0011
            goto L_0x0045
        L_0x0011:
            int r0 = length     // Catch:{ Exception -> 0x0075 }
            int r0 = r0 + 63
            int r1 = r0 % 128
            getMin = r1     // Catch:{ Exception -> 0x0075 }
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x001f
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            if (r0 == 0) goto L_0x0029
            boolean r0 = com.alipay.iap.android.aplog.util.FileUtil.sdCardAvailable()
            if (r0 == 0) goto L_0x0045
            goto L_0x0030
        L_0x0029:
            boolean r0 = com.alipay.iap.android.aplog.util.FileUtil.sdCardAvailable()     // Catch:{ Exception -> 0x0075 }
            int r1 = r2.length     // Catch:{ all -> 0x0073 }
            if (r0 == 0) goto L_0x0045
        L_0x0030:
            java.io.File r0 = getCommonExternalStorageDir()     // Catch:{ all -> 0x0044 }
            java.io.File r1 = new java.io.File     // Catch:{ all -> 0x0044 }
            java.lang.String r5 = r6.getPackageName()     // Catch:{ all -> 0x0044 }
            r1.<init>(r0, r5)     // Catch:{ all -> 0x0044 }
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0044 }
            r0.<init>(r1, r7)     // Catch:{ all -> 0x0044 }
            r2 = r0
            goto L_0x0045
        L_0x0044:
        L_0x0045:
            if (r2 != 0) goto L_0x0053
            java.io.File r0 = new java.io.File     // Catch:{ all -> 0x0052 }
            java.io.File r6 = r6.getFilesDir()     // Catch:{ all -> 0x0052 }
            r0.<init>(r6, r7)     // Catch:{ all -> 0x0052 }
            r2 = r0
            goto L_0x0053
        L_0x0052:
        L_0x0053:
            if (r2 == 0) goto L_0x0057
            r6 = 0
            goto L_0x0058
        L_0x0057:
            r6 = 1
        L_0x0058:
            if (r6 == 0) goto L_0x005b
            goto L_0x0072
        L_0x005b:
            int r6 = getMin
            int r6 = r6 + 81
            int r7 = r6 % 128
            length = r7
            int r6 = r6 % 2
            boolean r6 = r2.exists()
            if (r6 != 0) goto L_0x006c
            goto L_0x006d
        L_0x006c:
            r3 = 1
        L_0x006d:
            if (r3 == r4) goto L_0x0072
            r2.mkdirs()
        L_0x0072:
            return r2
        L_0x0073:
            r6 = move-exception
            throw r6
        L_0x0075:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.LoggingUtil.getStorageFilesDir(android.content.Context, java.lang.String):java.io.File");
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.OutputStream] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x004b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0018 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] gzipDataByBytes(byte[] r3, int r4, int r5) throws java.lang.IllegalStateException {
        /*
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 0
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0034 }
            r2.<init>(r0)     // Catch:{ all -> 0x0034 }
            r2.write(r3, r4, r5)     // Catch:{ all -> 0x0031 }
            r2.finish()     // Catch:{ all -> 0x0031 }
            byte[] r3 = r0.toByteArray()     // Catch:{ all -> 0x0031 }
            r2.close()     // Catch:{ all -> 0x0018 }
        L_0x0018:
            r0.close()     // Catch:{ all -> 0x001b }
        L_0x001b:
            int r4 = length
            int r4 = r4 + 47
            int r5 = r4 % 128
            getMin = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0029
            r4 = 0
            goto L_0x002a
        L_0x0029:
            r4 = 1
        L_0x002a:
            if (r4 == 0) goto L_0x002d
            return r3
        L_0x002d:
            int r4 = r1.length     // Catch:{ all -> 0x002f }
            return r3
        L_0x002f:
            r3 = move-exception
            throw r3
        L_0x0031:
            r3 = move-exception
            r1 = r2
            goto L_0x0035
        L_0x0034:
            r3 = move-exception
        L_0x0035:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003b }
            r4.<init>(r3)     // Catch:{ all -> 0x003b }
            throw r4     // Catch:{ all -> 0x003b }
        L_0x003b:
            r3 = move-exception
            if (r1 == 0) goto L_0x004b
            r1.close()     // Catch:{ all -> 0x004b }
            int r4 = length
            int r4 = r4 + 31
            int r5 = r4 % 128
            getMin = r5
            int r4 = r4 % 2
        L_0x004b:
            r0.close()     // Catch:{ all -> 0x004e }
        L_0x004e:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.LoggingUtil.gzipDataByBytes(byte[], int, int):byte[]");
    }

    public static String getMdapStyleName(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        sb.append("_");
        sb.append(str);
        String obj = sb.toString();
        int i = length + 39;
        getMin = i % 128;
        int i2 = i % 2;
        return obj;
    }

    public static byte[] gzipDataByString(String str) throws IllegalStateException {
        byte[] bArr;
        int i = length + 63;
        getMin = i % 128;
        if (!(i % 2 == 0)) {
            try {
                bArr = str.getBytes(setMin(new char[]{21787, 58116, 7208, 18781, 57867, 8181}).intern());
            } catch (Throwable th) {
                throw new IllegalStateException(th);
            }
        } else {
            bArr = str.getBytes(setMin(new char[]{21787, 58116, 7208, 18781, 57867, 8181}).intern());
            Object[] objArr = null;
            int length2 = objArr.length;
        }
        int i2 = getMin + 111;
        length = i2 % 128;
        int i3 = i2 % 2;
        return gzipDataByBytes(bArr, 0, bArr.length);
    }

    public static boolean isDebuggable() {
        int i = getMin + 83;
        length = i % 128;
        int i2 = i % 2;
        boolean z = debuggable;
        try {
            int i3 = getMin + 1;
            try {
                length = i3 % 128;
                int i4 = i3 % 2;
                return z;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static void setDebuggable(boolean z) {
        try {
            int i = getMin + 61;
            length = i % 128;
            if (i % 2 == 0) {
                try {
                    debuggable = z;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                debuggable = z;
                Object[] objArr = null;
                int length2 = objArr.length;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static String getNowTime() {
        int i;
        Calendar instance = Calendar.getInstance(TimeZone.getDefault());
        StringBuilder sb = new StringBuilder();
        int i2 = instance.get(1);
        char c = 2;
        int i3 = instance.get(2) + 1;
        int i4 = instance.get(5);
        int i5 = instance.get(11);
        int i6 = instance.get(12);
        int i7 = instance.get(13);
        int i8 = instance.get(14);
        sb.append(i2);
        sb.append('-');
        if (!(i3 >= 10)) {
            try {
                i = getMin + 77;
            } catch (Exception e) {
                throw e;
            }
            try {
                length = i % 128;
                if (i % 2 != 0) {
                    sb.append('f');
                } else {
                    sb.append('0');
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        sb.append(i3);
        sb.append('-');
        if (i4 < 10) {
            sb.append('0');
        }
        sb.append(i4);
        sb.append(' ');
        if (i5 < 10) {
            int i9 = getMin + 9;
            length = i9 % 128;
            int i10 = i9 % 2;
            sb.append('0');
        }
        sb.append(i5);
        sb.append(':');
        if (i6 < 10) {
            sb.append('0');
        }
        sb.append(i6);
        sb.append(':');
        if ((i7 < 10 ? 24 : Typography.amp) == 24) {
            int i11 = getMin + 97;
            length = i11 % 128;
            if (i11 % 2 != 0) {
                sb.append(0);
            } else {
                sb.append('0');
            }
        }
        sb.append(i7);
        sb.append('.');
        if ((i8 < 100 ? 21 : '9') == 21) {
            sb.append('0');
        }
        if (i8 < 10) {
            int i12 = getMin + 37;
            length = i12 % 128;
            if (i12 % 2 == 0) {
                c = 31;
            }
            if (c != 31) {
                sb.append(28);
            } else {
                sb.append('0');
            }
        }
        sb.append(i8);
        return sb.toString();
    }

    public static StringBuilder appendParam(StringBuilder sb, String str) {
        int i = length + 37;
        getMin = i % 128;
        boolean z = false;
        if ((i % 2 == 0 ? '?' : 13) == '?') {
            int i2 = 37 / 0;
            if ((sb == null ? 4 : '?') != '?') {
                return null;
            }
        } else if (sb == null) {
            return null;
        }
        try {
            sb.append(LOG_GAP);
            if (str != null) {
                z = true;
            }
            if (z) {
                sb.append(str.replace(LOG_GAP, ' '));
                int i3 = getMin + 11;
                length = i3 % 128;
                int i4 = i3 % 2;
            }
            return sb;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0056, code lost:
        if (r4 == null) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006d, code lost:
        if (r4 == null) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.StringBuilder appendExtParam(java.lang.StringBuilder r9, java.util.Map<java.lang.String, java.lang.String> r10) {
        /*
            r0 = 0
            r1 = 1
            if (r9 != 0) goto L_0x0006
            r2 = 1
            goto L_0x0007
        L_0x0006:
            r2 = 0
        L_0x0007:
            if (r2 == r1) goto L_0x00b5
            r2 = 44
            r9.append(r2)
            r3 = 29
            if (r10 == 0) goto L_0x0015
            r4 = 62
            goto L_0x0017
        L_0x0015:
            r4 = 29
        L_0x0017:
            if (r4 == r3) goto L_0x00b4
            int r3 = r10.size()
            if (r3 != 0) goto L_0x0021
            goto L_0x00b4
        L_0x0021:
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
            r3 = 1
        L_0x002a:
            boolean r4 = r10.hasNext()     // Catch:{ Exception -> 0x00b2 }
            if (r4 == 0) goto L_0x00b1
            int r4 = getMin
            int r4 = r4 + 33
            int r5 = r4 % 128
            length = r5
            int r4 = r4 % 2
            if (r4 == 0) goto L_0x003e
            r4 = 0
            goto L_0x003f
        L_0x003e:
            r4 = 1
        L_0x003f:
            if (r4 == r1) goto L_0x005b
            java.lang.Object r4 = r10.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            r6 = 97
            int r6 = r6 / r0
            if (r4 != 0) goto L_0x0071
            goto L_0x006f
        L_0x0059:
            r9 = move-exception
            throw r9
        L_0x005b:
            java.lang.Object r4 = r10.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r5 = r4.getKey()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r4 = r4.getValue()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L_0x0071
        L_0x006f:
            java.lang.String r4 = ""
        L_0x0071:
            if (r5 == 0) goto L_0x002a
            if (r4 == 0) goto L_0x002a
            java.lang.String r4 = fliterChar(r4)
            r6 = 94
            if (r3 == 0) goto L_0x007f
            r3 = 0
            goto L_0x0082
        L_0x007f:
            r9.append(r6)
        L_0x0082:
            r7 = 32
            java.lang.String r5 = r5.replace(r2, r7)
            java.lang.String r5 = r5.replace(r6, r7)
            r8 = 61
            java.lang.String r5 = r5.replace(r8, r7)
            r9.append(r5)
            r9.append(r8)
            java.lang.String r4 = r4.replace(r2, r7)
            java.lang.String r4 = r4.replace(r6, r7)
            r9.append(r4)
            int r4 = getMin     // Catch:{ Exception -> 0x00af }
            int r4 = r4 + 87
            int r5 = r4 % 128
            length = r5     // Catch:{ Exception -> 0x00af }
            int r4 = r4 % 2
            goto L_0x002a
        L_0x00af:
            r9 = move-exception
            throw r9
        L_0x00b1:
            return r9
        L_0x00b2:
            r9 = move-exception
            throw r9
        L_0x00b4:
            return r9
        L_0x00b5:
            int r9 = getMin
            int r9 = r9 + 31
            int r10 = r9 % 128
            length = r10
            int r9 = r9 % 2
            r9 = 0
            int r10 = length
            int r10 = r10 + 115
            int r0 = r10 % 128
            getMin = r0
            int r10 = r10 % 2
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.LoggingUtil.appendExtParam(java.lang.StringBuilder, java.util.Map):java.lang.StringBuilder");
    }

    public static String fliterChar(String str) {
        try {
            if ((!TextUtils.isEmpty(str) ? 'H' : 'A') != 'A') {
                str = str.replace("\r\n", "###").replace("\n", "###").replace("\r", "###");
                int i = getMin + 23;
                length = i % 128;
                int i2 = i % 2;
            }
            int i3 = getMin + 117;
            length = i3 % 128;
            if ((i3 % 2 != 0 ? '(' : ' ') == ' ') {
                return str;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return str;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if ((r1 ? 'a' : '/') != 'a') goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        if (android.text.TextUtils.isEmpty(r9) != false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        java.lang.System.loadLibrary(r9);
        com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger().info(TAG, "success to System.loadLibrary : ".concat(java.lang.String.valueOf(r9)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0041, code lost:
        r8 = getMin + 45;
        length = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004c, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004d, code lost:
        com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger().error(TAG, "failed to System.loadLibrary : ".concat(java.lang.String.valueOf(r9)), r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (r8 == null) goto L_0x0060;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0062, code lost:
        r8 = getMin + 49;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        length = r8 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006a, code lost:
        if ((r8 % 2) != 0) goto L_0x006c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x006e, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006f, code lost:
        if (r8 != true) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0074, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0077, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0078, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0079, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x007a, code lost:
        r2 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        r8 = r8.getDir("plugins_lib", 0);
        r5 = new java.lang.StringBuilder("lib");
        r5.append(r9);
        r5.append(".so");
        r2 = new java.io.File(r8, r5.toString()).getAbsolutePath();
        java.lang.System.load(r2);
        com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger().info(TAG, "success to System.load : ".concat(java.lang.String.valueOf(r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b2, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00b3, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b4, code lost:
        com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger().error(TAG, "failed to System.load : ".concat(java.lang.String.valueOf(r2)), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c5, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean loadLibrary(android.content.Context r8, java.lang.String r9) {
        /*
            java.lang.String r0 = "LoggingUtil"
            int r1 = getMin     // Catch:{ Exception -> 0x00c6 }
            int r1 = r1 + 13
            int r2 = r1 % 128
            length = r2     // Catch:{ Exception -> 0x00c6 }
            int r1 = r1 % 2
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x0025
            boolean r1 = android.text.TextUtils.isEmpty(r9)     // Catch:{ Exception -> 0x00c6 }
            super.hashCode()     // Catch:{ all -> 0x0023 }
            r4 = 97
            if (r1 == 0) goto L_0x001e
            r1 = 97
            goto L_0x0020
        L_0x001e:
            r1 = 47
        L_0x0020:
            if (r1 == r4) goto L_0x002b
            goto L_0x002c
        L_0x0023:
            r8 = move-exception
            throw r8
        L_0x0025:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 == 0) goto L_0x002c
        L_0x002b:
            return r3
        L_0x002c:
            r1 = 1
            java.lang.System.loadLibrary(r9)     // Catch:{ all -> 0x004c }
            com.alipay.iap.android.aplog.core.logger.TraceLogger r4 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()     // Catch:{ all -> 0x004c }
            java.lang.String r5 = "success to System.loadLibrary : "
            java.lang.String r6 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x004c }
            java.lang.String r5 = r5.concat(r6)     // Catch:{ all -> 0x004c }
            r4.info(r0, r5)     // Catch:{ all -> 0x004c }
            int r8 = getMin
            int r8 = r8 + 45
            int r9 = r8 % 128
            length = r9
            int r8 = r8 % 2
            return r1
        L_0x004c:
            r4 = move-exception
            com.alipay.iap.android.aplog.core.logger.TraceLogger r5 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r6 = java.lang.String.valueOf(r9)
            java.lang.String r7 = "failed to System.loadLibrary : "
            java.lang.String r6 = r7.concat(r6)
            r5.error(r0, r6, r4)
            if (r8 != 0) goto L_0x007a
            int r8 = getMin     // Catch:{ Exception -> 0x0078 }
            int r8 = r8 + 49
            int r9 = r8 % 128
            length = r9     // Catch:{ Exception -> 0x0078 }
            int r8 = r8 % 2
            if (r8 == 0) goto L_0x006e
            r8 = 0
            goto L_0x006f
        L_0x006e:
            r8 = 1
        L_0x006f:
            if (r8 == r1) goto L_0x0077
            super.hashCode()     // Catch:{ all -> 0x0075 }
            return r3
        L_0x0075:
            r8 = move-exception
            throw r8
        L_0x0077:
            return r3
        L_0x0078:
            r8 = move-exception
            throw r8
        L_0x007a:
            java.lang.String r2 = ""
            java.lang.String r4 = "plugins_lib"
            java.io.File r8 = r8.getDir(r4, r3)     // Catch:{ all -> 0x00b3 }
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x00b3 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b3 }
            java.lang.String r6 = "lib"
            r5.<init>(r6)     // Catch:{ all -> 0x00b3 }
            r5.append(r9)     // Catch:{ all -> 0x00b3 }
            java.lang.String r9 = ".so"
            r5.append(r9)     // Catch:{ all -> 0x00b3 }
            java.lang.String r9 = r5.toString()     // Catch:{ all -> 0x00b3 }
            r4.<init>(r8, r9)     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = r4.getAbsolutePath()     // Catch:{ all -> 0x00b3 }
            java.lang.System.load(r2)     // Catch:{ all -> 0x00b3 }
            com.alipay.iap.android.aplog.core.logger.TraceLogger r8 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()     // Catch:{ all -> 0x00b3 }
            java.lang.String r9 = "success to System.load : "
            java.lang.String r4 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x00b3 }
            java.lang.String r9 = r9.concat(r4)     // Catch:{ all -> 0x00b3 }
            r8.info(r0, r9)     // Catch:{ all -> 0x00b3 }
            return r1
        L_0x00b3:
            r8 = move-exception
            com.alipay.iap.android.aplog.core.logger.TraceLogger r9 = com.alipay.iap.android.aplog.core.LoggerFactory.getTraceLogger()
            java.lang.String r1 = java.lang.String.valueOf(r2)
            java.lang.String r2 = "failed to System.load : "
            java.lang.String r1 = r2.concat(r1)
            r9.error(r0, r1, r8)
            return r3
        L_0x00c6:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.LoggingUtil.loadLibrary(android.content.Context, java.lang.String):boolean");
    }

    public static void reflectErrorLog(String str, String str2, boolean z) {
        try {
            StringBuilder sb = new StringBuilder();
            if ((z ? 'P' : 'N') == 'P') {
                try {
                    int i = length + 29;
                    try {
                        getMin = i % 128;
                        if ((i % 2 == 0 ? '9' : '.') != '9') {
                            sb.append('[');
                            sb.append(Thread.currentThread().getName());
                            sb.append(']');
                        } else {
                            sb.append('_');
                            sb.append(Thread.currentThread().getName());
                            sb.append('S');
                        }
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            }
            sb.append(str2);
            Class.forName("android.util.Log").getMethod("e", new Class[]{String.class, String.class}).invoke((Object) null, new Object[]{str, sb.toString()});
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r4 != null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        if ((r4 != null ? 'S' : '!') != 'S') goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getViewID(java.lang.String r4) {
        /*
            int r0 = length
            int r0 = r0 + 119
            int r1 = r0 % 128
            getMin = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L_0x001c
            int r0 = r1.length     // Catch:{ all -> 0x001a }
            r0 = 83
            if (r4 == 0) goto L_0x0015
            r2 = 83
            goto L_0x0017
        L_0x0015:
            r2 = 33
        L_0x0017:
            if (r2 == r0) goto L_0x001e
            goto L_0x0053
        L_0x001a:
            r4 = move-exception
            throw r4
        L_0x001c:
            if (r4 == 0) goto L_0x0053
        L_0x001e:
            int r0 = getMin
            int r0 = r0 + 123
            int r2 = r0 % 128
            length = r2
            int r0 = r0 % 2
            java.lang.String r0 = UNDERLINE
            boolean r0 = r4.contains(r0)
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0034:
            r0 = 1
        L_0x0035:
            if (r0 == r3) goto L_0x0038
            goto L_0x0053
        L_0x0038:
            java.lang.String r0 = UNDERLINE
            java.lang.String[] r4 = r4.split(r0)
            r4 = r4[r2]
            int r0 = getMin
            int r0 = r0 + 29
            int r2 = r0 % 128
            length = r2
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x0052
            super.hashCode()     // Catch:{ all -> 0x0050 }
            return r4
        L_0x0050:
            r4 = move-exception
            throw r4
        L_0x0052:
            return r4
        L_0x0053:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.LoggingUtil.getViewID(java.lang.String):java.lang.String");
    }

    public static String getResolution() {
        DisplayMetrics displayMetrics = LoggerFactory.getLogContext().getApplicationContext().getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append("*");
        sb.append(i2);
        String obj = sb.toString();
        int i3 = length + 33;
        getMin = i3 % 128;
        int i4 = i3 % 2;
        return obj;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0019, code lost:
        if ((r2 == null) != false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        if (r2 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0037, code lost:
        r2 = getMin + 125;
        length = r2 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0043, code lost:
        if ((r2 % 2) == 0) goto L_0x0048;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0045, code lost:
        r2 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        r2 = kotlin.text.Typography.amp;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x004a, code lost:
        if (r2 == '&') goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        r2 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004d, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0050, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String throwableToString(java.lang.Throwable r2) {
        /*
            int r0 = getMin     // Catch:{ Exception -> 0x0053 }
            int r0 = r0 + 43
            int r1 = r0 % 128
            length = r1     // Catch:{ Exception -> 0x0051 }
            int r0 = r0 % 2
            r1 = 0
            if (r0 == 0) goto L_0x001e
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)
            super.hashCode()     // Catch:{ all -> 0x001c }
            if (r2 == 0) goto L_0x0018
            r0 = 0
            goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            if (r0 == 0) goto L_0x0024
            goto L_0x0037
        L_0x001c:
            r2 = move-exception
            throw r2
        L_0x001e:
            java.lang.String r2 = android.util.Log.getStackTraceString(r2)
            if (r2 == 0) goto L_0x0037
        L_0x0024:
            int r0 = getMin
            int r0 = r0 + 105
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            java.lang.String r0 = "$$"
            java.lang.String r1 = "<2$>"
            java.lang.String r2 = r2.replace(r0, r1)     // Catch:{ Exception -> 0x0053 }
            return r2
        L_0x0037:
            int r2 = getMin
            int r2 = r2 + 125
            int r0 = r2 % 128
            length = r0
            int r2 = r2 % 2
            r0 = 38
            if (r2 == 0) goto L_0x0048
            r2 = 12
            goto L_0x004a
        L_0x0048:
            r2 = 38
        L_0x004a:
            if (r2 == r0) goto L_0x0050
            int r2 = r1.length     // Catch:{ all -> 0x004e }
            return r1
        L_0x004e:
            r2 = move-exception
            throw r2
        L_0x0050:
            return r1
        L_0x0051:
            r2 = move-exception
            throw r2
        L_0x0053:
            r2 = move-exception
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.LoggingUtil.throwableToString(java.lang.Throwable):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: char} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: char} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String setMin(char[] r10) {
        /*
            int r0 = length     // Catch:{ Exception -> 0x005c }
            int r0 = r0 + 121
            int r1 = r0 % 128
            getMin = r1     // Catch:{ Exception -> 0x005a }
            int r0 = r0 % 2
            r0 = 0
            char r1 = r10[r0]
            int r2 = r10.length
            r3 = 1
            int r2 = r2 - r3
            char[] r2 = new char[r2]
            r4 = 1
        L_0x0013:
            int r5 = r10.length
            if (r4 >= r5) goto L_0x0018
            r5 = 1
            goto L_0x0019
        L_0x0018:
            r5 = 0
        L_0x0019:
            if (r5 == r3) goto L_0x0021
            java.lang.String r10 = new java.lang.String
            r10.<init>(r2)
            return r10
        L_0x0021:
            int r5 = length
            int r5 = r5 + 61
            int r6 = r5 % 128
            getMin = r6
            int r5 = r5 % 2
            r6 = 89
            if (r5 != 0) goto L_0x0032
            r5 = 89
            goto L_0x0034
        L_0x0032:
            r5 = 58
        L_0x0034:
            if (r5 == r6) goto L_0x0048
            int r5 = r4 + -1
            char r6 = r10[r4]
            int r7 = r4 * r1
            r6 = r6 ^ r7
            long r6 = (long) r6
            long r8 = setMin     // Catch:{ Exception -> 0x005c }
            long r6 = r6 ^ r8
            int r7 = (int) r6
            char r6 = (char) r7
            r2[r5] = r6
            int r4 = r4 + 1
            goto L_0x0013
        L_0x0048:
            int r5 = r4 << 1
            char r6 = r10[r4]
            int r7 = r4 >> r1
            r6 = r6 ^ r7
            long r6 = (long) r6
            long r8 = setMin
            long r6 = r6 & r8
            int r7 = (int) r6
            char r6 = (char) r7
            r2[r5] = r6
            int r4 = r4 + 114
            goto L_0x0013
        L_0x005a:
            r10 = move-exception
            throw r10
        L_0x005c:
            r10 = move-exception
            goto L_0x005f
        L_0x005e:
            throw r10
        L_0x005f:
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.aplog.util.LoggingUtil.setMin(char[]):java.lang.String");
    }
}
