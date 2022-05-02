package com.alibaba.ariver.kernel.common.utils;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import androidx.annotation.Nullable;
import com.alibaba.griver.base.common.utils.MD5Util;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import kotlin.text.Typography;

public class FileUtils {
    public static final String TAG = "AriverKernel:FileUtils";
    private static char[] getMin = {'*', 'T', 'M', '9', '2'};
    private static int length = 0;
    private static int setMax = 1;

    public static long calculateSize(String str) {
        int i = setMax + 41;
        length = i % 128;
        int i2 = i % 2;
        if (!(str == null)) {
            try {
                return calculateSize(new File(str));
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i3 = setMax + 31;
            length = i3 % 128;
            int i4 = i3 % 2;
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0047, code lost:
        if (r3 == 0) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0056, code lost:
        if ((r8.length == 0 ? 'B' : '1') != '1') goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long calculateSize(java.io.File r8) {
        /*
            boolean r0 = exists((java.io.File) r8)
            r1 = 0
            if (r0 != 0) goto L_0x0016
            int r8 = length     // Catch:{ Exception -> 0x0013 }
            int r8 = r8 + 59
            int r0 = r8 % 128
            setMax = r0     // Catch:{ Exception -> 0x0013 }
            int r8 = r8 % 2
            return r1
        L_0x0013:
            r8 = move-exception
            goto L_0x00a5
        L_0x0016:
            boolean r0 = r8.isFile()
            r3 = 87
            if (r0 == 0) goto L_0x0021
            r0 = 87
            goto L_0x0023
        L_0x0021:
            r0 = 64
        L_0x0023:
            r4 = 0
            if (r0 == r3) goto L_0x008f
            java.io.File[] r8 = r8.listFiles()     // Catch:{ Exception -> 0x008d }
            r0 = 1
            if (r8 == 0) goto L_0x002f
            r3 = 0
            goto L_0x0030
        L_0x002f:
            r3 = 1
        L_0x0030:
            if (r3 == 0) goto L_0x0033
            goto L_0x0058
        L_0x0033:
            int r3 = length
            int r3 = r3 + 3
            int r5 = r3 % 128
            setMax = r5
            int r3 = r3 % 2
            if (r3 != 0) goto L_0x0041
            r3 = 0
            goto L_0x0042
        L_0x0041:
            r3 = 1
        L_0x0042:
            if (r3 == r0) goto L_0x004c
            int r3 = r8.length
            r5 = 0
            int r5 = r5.length     // Catch:{ all -> 0x004a }
            if (r3 != 0) goto L_0x0059
            goto L_0x0058
        L_0x004a:
            r8 = move-exception
            throw r8
        L_0x004c:
            int r3 = r8.length
            r5 = 49
            if (r3 != 0) goto L_0x0054
            r3 = 66
            goto L_0x0056
        L_0x0054:
            r3 = 49
        L_0x0056:
            if (r3 == r5) goto L_0x0059
        L_0x0058:
            return r1
        L_0x0059:
            int r3 = r8.length
            int r5 = setMax
            int r5 = r5 + 73
            int r6 = r5 % 128
            length = r6
            int r5 = r5 % 2
            r5 = 0
        L_0x0065:
            if (r5 >= r3) goto L_0x0069
            r6 = 1
            goto L_0x006a
        L_0x0069:
            r6 = 0
        L_0x006a:
            if (r6 == 0) goto L_0x008c
            int r6 = setMax
            int r6 = r6 + 13
            int r7 = r6 % 128
            length = r7
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x0082
            r6 = r8[r5]
            long r6 = calculateSize((java.io.File) r6)
            long r1 = r1 ^ r6
            int r5 = r5 + 91
            goto L_0x0065
        L_0x0082:
            r6 = r8[r5]
            long r6 = calculateSize((java.io.File) r6)
            long r1 = r1 + r6
            int r5 = r5 + 1
            goto L_0x0065
        L_0x008c:
            return r1
        L_0x008d:
            r8 = move-exception
            throw r8
        L_0x008f:
            int r0 = setMax
            int r0 = r0 + 45
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            if (r0 == 0) goto L_0x00a6
            long r0 = r8.length()     // Catch:{ Exception -> 0x0013 }
            r8 = 62
            int r8 = r8 / r4
            goto L_0x00aa
        L_0x00a3:
            r8 = move-exception
            throw r8
        L_0x00a5:
            throw r8
        L_0x00a6:
            long r0 = r8.length()
        L_0x00aa:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.FileUtils.calculateSize(java.io.File):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0020, code lost:
        if ((r8 != null ? '6' : 'E') != 'E') goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002a, code lost:
        if ((r8 != null) != true) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0051, code lost:
        if (r6 == 0) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x005b, code lost:
        if (r9.length() == 0) goto L_0x00d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String combinePath(java.lang.String r8, java.lang.String r9) {
        /*
            int r0 = length     // Catch:{ Exception -> 0x0114 }
            int r0 = r0 + 29
            int r1 = r0 % 128
            setMax = r1     // Catch:{ Exception -> 0x0112 }
            int r0 = r0 % 2
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            r3 = 0
            if (r0 == 0) goto L_0x0025
            super.hashCode()     // Catch:{ all -> 0x0023 }
            r0 = 69
            if (r8 == 0) goto L_0x001e
            r4 = 54
            goto L_0x0020
        L_0x001e:
            r4 = 69
        L_0x0020:
            if (r4 == r0) goto L_0x0033
            goto L_0x002d
        L_0x0023:
            r8 = move-exception
            throw r8
        L_0x0025:
            if (r8 == 0) goto L_0x0029
            r0 = 1
            goto L_0x002a
        L_0x0029:
            r0 = 0
        L_0x002a:
            if (r0 == r2) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            int r0 = r8.length()
            if (r0 != 0) goto L_0x0034
        L_0x0033:
            return r9
        L_0x0034:
            int r0 = r8.length()
            java.lang.String r4 = "/"
            r5 = 47
            if (r9 == 0) goto L_0x00d2
            int r6 = setMax
            int r6 = r6 + 15
            int r7 = r6 % 128
            length = r7
            int r6 = r6 % 2
            if (r6 == 0) goto L_0x0057
            int r6 = r9.length()
            super.hashCode()     // Catch:{ all -> 0x0055 }
            if (r6 != 0) goto L_0x005e
            goto L_0x00d2
        L_0x0055:
            r8 = move-exception
            throw r8
        L_0x0057:
            int r6 = r9.length()
            if (r6 != 0) goto L_0x005e
            goto L_0x00d2
        L_0x005e:
            java.lang.String r3 = "./"
            boolean r3 = r9.startsWith(r3)
            if (r3 == 0) goto L_0x006a
            java.lang.String r9 = r9.substring(r2)
        L_0x006a:
            int r0 = r0 - r2
            char r0 = r8.charAt(r0)
            r3 = 38
            if (r0 != r5) goto L_0x0076
            r0 = 38
            goto L_0x0078
        L_0x0076:
            r0 = 71
        L_0x0078:
            if (r0 == r3) goto L_0x00a3
            char r0 = r9.charAt(r1)
            if (r0 != r5) goto L_0x0090
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            return r8
        L_0x0090:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r4)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            return r8
        L_0x00a3:
            char r0 = r9.charAt(r1)
            if (r0 != r5) goto L_0x00c2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r3 = r8.length()
            int r3 = r3 - r2
            java.lang.String r8 = r8.substring(r1, r3)
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            return r8
        L_0x00c2:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r8)
            r0.append(r9)
            java.lang.String r8 = r0.toString()
            return r8
        L_0x00d2:
            int r0 = r0 - r2
            char r9 = r8.charAt(r0)
            if (r9 != r5) goto L_0x00da
            r1 = 1
        L_0x00da:
            if (r1 == 0) goto L_0x00e7
            int r9 = length
            int r9 = r9 + 51
            int r0 = r9 % 128
            setMax = r0
            int r9 = r9 % 2
            return r8
        L_0x00e7:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r8)     // Catch:{ Exception -> 0x0112 }
            r9.append(r4)     // Catch:{ Exception -> 0x0112 }
            java.lang.String r8 = r9.toString()     // Catch:{ Exception -> 0x0112 }
            int r9 = setMax
            int r9 = r9 + 107
            int r0 = r9 % 128
            length = r0
            int r9 = r9 % 2
            r0 = 84
            if (r9 == 0) goto L_0x0107
            r9 = 82
            goto L_0x0109
        L_0x0107:
            r9 = 84
        L_0x0109:
            if (r9 == r0) goto L_0x0111
            super.hashCode()     // Catch:{ all -> 0x010f }
            return r8
        L_0x010f:
            r8 = move-exception
            throw r8
        L_0x0111:
            return r8
        L_0x0112:
            r8 = move-exception
            throw r8
        L_0x0114:
            r8 = move-exception
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.FileUtils.combinePath(java.lang.String, java.lang.String):java.lang.String");
    }

    public static boolean create(String str) {
        int i = setMax + 11;
        length = i % 128;
        return i % 2 != 0 ? create(str, true) : create(str, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (android.text.TextUtils.isEmpty(r4) != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0033, code lost:
        if (exists(r4) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4 = setMax + 11;
        length = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003f, code lost:
        r4 = length + 33;
        setMax = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004c, code lost:
        mkdirs(getParent(r4), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        return new java.io.File(r4).createNewFile();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005d, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x005e, code lost:
        com.alibaba.ariver.kernel.common.utils.RVLogger.e(TAG, "exception detail", r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0065, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0066, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0067, code lost:
        throw r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if ((!r0) != false) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean create(java.lang.String r4, boolean r5) {
        /*
            int r0 = length
            int r0 = r0 + 103
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001e
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r3 = 0
            int r3 = r3.length     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0018
            r0 = 0
            goto L_0x0019
        L_0x0018:
            r0 = 1
        L_0x0019:
            if (r0 == 0) goto L_0x0024
            goto L_0x002f
        L_0x001c:
            r4 = move-exception
            throw r4
        L_0x001e:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x002f
        L_0x0024:
            int r4 = setMax
            int r4 = r4 + 109
            int r5 = r4 % 128
            length = r5
            int r4 = r4 % 2
            return r2
        L_0x002f:
            boolean r0 = exists((java.lang.String) r4)     // Catch:{ Exception -> 0x0066 }
            if (r0 == 0) goto L_0x004c
            int r4 = setMax     // Catch:{ Exception -> 0x004a }
            int r4 = r4 + 11
            int r5 = r4 % 128
            length = r5     // Catch:{ Exception -> 0x004a }
            int r4 = r4 % 2
            int r4 = length
            int r4 = r4 + 33
            int r5 = r4 % 128
            setMax = r5
            int r4 = r4 % 2
            return r1
        L_0x004a:
            r4 = move-exception
            throw r4
        L_0x004c:
            java.lang.String r0 = getParent((java.lang.String) r4)
            mkdirs(r0, r5)
            java.io.File r5 = new java.io.File     // Catch:{ Exception -> 0x005d }
            r5.<init>(r4)     // Catch:{ Exception -> 0x005d }
            boolean r4 = r5.createNewFile()     // Catch:{ Exception -> 0x005d }
            return r4
        L_0x005d:
            r4 = move-exception
            java.lang.String r5 = "AriverKernel:FileUtils"
            java.lang.String r0 = "exception detail"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r5, r0, r4)
            return r2
        L_0x0066:
            r4 = move-exception
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.FileUtils.create(java.lang.String, boolean):boolean");
    }

    public static boolean mkdirs(String str, boolean z) {
        File file = new File(str);
        if (exists(str)) {
            int i = length + 107;
            setMax = i % 128;
            int i2 = i % 2;
            try {
                if ((!file.isDirectory() ? 'b' : Typography.amp) != '&') {
                    if (!z) {
                        int i3 = length + 9;
                        try {
                            setMax = i3 % 128;
                            return i3 % 2 == 0;
                        } catch (Exception e) {
                            throw e;
                        }
                    } else {
                        delete(file);
                    }
                }
            } catch (Exception e2) {
                throw e2;
            }
        }
        try {
            file.mkdirs();
        } catch (Exception e3) {
            RVLogger.e(TAG, "exception detail", e3);
        }
        boolean exists = exists(file);
        int i4 = length + 9;
        setMax = i4 % 128;
        int i5 = i4 % 2;
        return exists;
    }

    public static boolean move(String str, String str2) {
        int i = setMax + 13;
        length = i % 128;
        if (i % 2 != 0) {
        }
        try {
            return move(str, str2, false);
        } catch (Exception e) {
            throw e;
        }
    }

    public static boolean move(String str, String str2, boolean z) {
        boolean z2 = true;
        if (!TextUtils.isEmpty(str)) {
            try {
                int i = length + 1;
                setMax = i % 128;
                int i2 = i % 2;
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        if (exists(str)) {
                            z2 = false;
                        }
                        if (z2) {
                            return false;
                        }
                        if (exists(str2)) {
                            if (!z) {
                                int i3 = setMax + 75;
                                length = i3 % 128;
                                int i4 = i3 % 2;
                                return false;
                            }
                            delete(str2);
                        }
                        try {
                            return new File(str).renameTo(new File(str2));
                        } catch (Exception e) {
                            RVLogger.e(TAG, "exception detail", e);
                            return false;
                        }
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } catch (Exception e3) {
                throw e3;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if (r0 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003b, code lost:
        if ((android.text.TextUtils.equals(r6, "/")) != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005a, code lost:
        if ((!r6.contains("../")) != true) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006b, code lost:
        if ((!r0 ? (char) 24 : 13) != 24) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x008f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkPathValid(java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x000a
            r0 = 1
            goto L_0x000b
        L_0x000a:
            r0 = 0
        L_0x000b:
            if (r0 == 0) goto L_0x0093
            int r0 = setMax
            int r0 = r0 + 25
            int r3 = r0 % 128
            length = r3
            int r0 = r0 % 2
            r3 = 67
            if (r0 == 0) goto L_0x001e
            r0 = 8
            goto L_0x0020
        L_0x001e:
            r0 = 67
        L_0x0020:
            java.lang.String r4 = "/"
            r5 = 0
            if (r0 == r3) goto L_0x0032
            boolean r0 = android.text.TextUtils.equals(r6, r4)     // Catch:{ Exception -> 0x002f }
            int r3 = r5.length     // Catch:{ all -> 0x002d }
            if (r0 != 0) goto L_0x008f
            goto L_0x003e
        L_0x002d:
            r6 = move-exception
            throw r6
        L_0x002f:
            r6 = move-exception
            goto L_0x0092
        L_0x0032:
            boolean r0 = android.text.TextUtils.equals(r6, r4)
            if (r0 != 0) goto L_0x003a
            r0 = 0
            goto L_0x003b
        L_0x003a:
            r0 = 1
        L_0x003b:
            if (r0 == 0) goto L_0x003e
            goto L_0x008f
        L_0x003e:
            int r0 = length
            int r0 = r0 + 77
            int r3 = r0 % 128
            setMax = r3
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x004c
            r0 = 0
            goto L_0x004d
        L_0x004c:
            r0 = 1
        L_0x004d:
            java.lang.String r3 = "../"
            if (r0 == 0) goto L_0x005d
            boolean r0 = r6.contains(r3)
            if (r0 != 0) goto L_0x0059
            r0 = 1
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 == r2) goto L_0x006e
            goto L_0x008f
        L_0x005d:
            boolean r0 = r6.contains(r3)     // Catch:{ Exception -> 0x002f }
            int r3 = r5.length     // Catch:{ all -> 0x0090 }
            r3 = 24
            if (r0 != 0) goto L_0x0069
            r0 = 24
            goto L_0x006b
        L_0x0069:
            r0 = 13
        L_0x006b:
            if (r0 == r3) goto L_0x006e
            goto L_0x008f
        L_0x006e:
            int r0 = setMax
            int r0 = r0 + 59
            int r3 = r0 % 128
            length = r3
            int r0 = r0 % 2
            java.lang.String r3 = "/.."
            boolean r6 = r6.contains(r3)
            if (r0 == 0) goto L_0x008d
            int r0 = r5.length     // Catch:{ all -> 0x008b }
            r0 = 4
            if (r6 == 0) goto L_0x0086
            r6 = 4
            goto L_0x0088
        L_0x0086:
            r6 = 22
        L_0x0088:
            if (r6 == r0) goto L_0x008f
            goto L_0x0093
        L_0x008b:
            r6 = move-exception
            throw r6
        L_0x008d:
            if (r6 == 0) goto L_0x0093
        L_0x008f:
            return r1
        L_0x0090:
            r6 = move-exception
            throw r6
        L_0x0092:
            throw r6
        L_0x0093:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.FileUtils.checkPathValid(java.lang.String):boolean");
    }

    public static boolean noPermissionDelete(String str) {
        int i = length + 125;
        setMax = i % 128;
        int i2 = i % 2;
        boolean isEmpty = TextUtils.isEmpty(str);
        int i3 = setMax + 83;
        length = i3 % 128;
        if (i3 % 2 == 0) {
            return isEmpty;
        }
        Object[] objArr = null;
        int length2 = objArr.length;
        return isEmpty;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0022, code lost:
        if (r0 != false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = delete(new java.io.File(r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0047, code lost:
        r0 = setMax + 89;
        length = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0051, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0053, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0019, code lost:
        if (noPermissionDelete(r2) != false) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean delete(java.lang.String r2) {
        /*
            int r0 = length
            int r0 = r0 + 39
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 97
            if (r0 != 0) goto L_0x0011
            r0 = 97
            goto L_0x0013
        L_0x0011:
            r0 = 59
        L_0x0013:
            if (r0 == r1) goto L_0x001c
            boolean r0 = noPermissionDelete(r2)
            if (r0 == 0) goto L_0x003e
            goto L_0x0024
        L_0x001c:
            boolean r0 = noPermissionDelete(r2)
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x003e
        L_0x0024:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "path: "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = " not valid to download by resource"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "AriverKernel:FileUtils"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r0, r2)
            r2 = 0
            return r2
        L_0x003e:
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r2 = delete((java.io.File) r0)     // Catch:{ Exception -> 0x0052 }
            int r0 = setMax
            int r0 = r0 + 89
            int r1 = r0 % 128
            length = r1
            int r0 = r0 % 2
            return r2
        L_0x0052:
            r2 = move-exception
            throw r2
        L_0x0054:
            r2 = move-exception
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.FileUtils.delete(java.lang.String):boolean");
    }

    public static boolean delete(File file) {
        boolean z = true;
        if (!exists(file)) {
            return true;
        }
        int i = 0;
        if (noPermissionDelete(file.getAbsolutePath())) {
            StringBuilder sb = new StringBuilder("path: ");
            sb.append(file.getAbsolutePath());
            sb.append(" not valid to download by resource");
            RVLogger.w(TAG, sb.toString());
            return false;
        } else if (file.isFile()) {
            StringBuilder sb2 = new StringBuilder("deleteFile:");
            sb2.append(file.getAbsolutePath());
            RVLogger.d(TAG, sb2.toString());
            return file.delete();
        } else {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                int i2 = setMax + 93;
                length = i2 % 128;
                int i3 = i2 % 2;
                return true;
            }
            int i4 = setMax + 81;
            length = i4 % 128;
            while (true) {
                int i5 = i4 % 2;
                if ((i < listFiles.length ? '!' : 27) != '!') {
                    try {
                        boolean delete = file.delete() | z;
                        StringBuilder sb3 = new StringBuilder("deleteFile:");
                        sb3.append(file.getAbsolutePath());
                        sb3.append(" result:");
                        sb3.append(delete);
                        RVLogger.d(TAG, sb3.toString());
                        return delete;
                    } catch (Exception e) {
                        throw e;
                    }
                } else {
                    int i6 = setMax + 97;
                    length = i6 % 128;
                    if ((i6 % 2 != 0 ? '_' : Typography.amp) != '&') {
                        z ^= delete(listFiles[i]);
                        i += 64;
                    } else {
                        z |= delete(listFiles[i]);
                        i++;
                    }
                    i4 = length + 27;
                    setMax = i4 % 128;
                }
            }
        }
    }

    public static boolean exists(String str) {
        int i = setMax + 113;
        length = i % 128;
        int i2 = i % 2;
        if ((TextUtils.isEmpty(str) ? (char) 22 : 7) != 22) {
            try {
                boolean exists = exists(new File(str));
                int i3 = setMax + 17;
                length = i3 % 128;
                if (i3 % 2 == 0) {
                    return exists;
                }
                int i4 = 79 / 0;
                return exists;
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i5 = length + 37;
            setMax = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }
    }

    public static boolean exists(File file) {
        int i = length + 97;
        setMax = i % 128;
        int i2 = i % 2;
        if ((file != null ? 'K' : 31) != 31) {
            int i3 = length + 21;
            setMax = i3 % 128;
            int i4 = i3 % 2;
            if (!(!file.exists())) {
                int i5 = length + 29;
                setMax = i5 % 128;
                int i6 = i5 % 2;
                return true;
            }
        }
        return false;
    }

    public static String getParent(String str) {
        int i = setMax + 59;
        length = i % 128;
        int i2 = i % 2;
        try {
            if (!(TextUtils.isEmpty(str))) {
                try {
                    return getParent(new File(cleanPath(str)));
                } catch (Exception e) {
                    throw e;
                }
            } else {
                int i3 = setMax + 123;
                length = i3 % 128;
                if (!(i3 % 2 != 0)) {
                    return null;
                }
                int i4 = 16 / 0;
                return null;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.String] */
    public static String getParent(File file) {
        int i = setMax + 35;
        length = i % 128;
        int i2 = i % 2;
        ? r2 = 0;
        if ((file == null ? '?' : 12) != '?') {
            try {
                String parent = file.getParent();
                int i3 = length + 113;
                setMax = i3 % 128;
                if (!(i3 % 2 == 0)) {
                    return parent;
                }
                int length2 = r2.length;
                return parent;
            } catch (Exception e) {
                throw e;
            }
        } else {
            int i4 = length + 117;
            setMax = i4 % 128;
            int i5 = i4 % 2;
            return r2;
        }
    }

    public static String cleanPath(String str) {
        boolean z = false;
        if (TextUtils.isEmpty(str)) {
            int i = setMax + 5;
            length = i % 128;
            int i2 = i % 2;
            return str;
        }
        try {
            str = new File(str).getCanonicalPath();
        } catch (Exception e) {
            RVLogger.e(TAG, "Exception", e);
        }
        try {
            int i3 = setMax + 61;
            length = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
            }
            if (z) {
                return str;
            }
            Object obj = null;
            super.hashCode();
            return str;
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if ((!android.text.TextUtils.isEmpty(r0)) != true) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x004f, code lost:
        r5 = length + 41;
        setMax = r5 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0059, code lost:
        if ((r5 % 2) != 0) goto L_0x005c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005b, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005c, code lost:
        if (r1 == false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x005e, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        r5 = 43 / 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0062, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if ((!android.text.TextUtils.isEmpty(r0)) != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getFileExtensionFromUrl(java.lang.String r5) {
        /*
            int r0 = length
            int r0 = r0 + 31
            int r1 = r0 % 128
            setMax = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0023
            java.lang.String r0 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r5)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            r4 = 69
            int r4 = r4 / r2
            if (r3 == 0) goto L_0x001d
            r3 = 0
            goto L_0x001e
        L_0x001d:
            r3 = 1
        L_0x001e:
            if (r3 == 0) goto L_0x0032
            goto L_0x004f
        L_0x0021:
            r5 = move-exception
            throw r5
        L_0x0023:
            java.lang.String r0 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r5)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x002f
            r3 = 0
            goto L_0x0030
        L_0x002f:
            r3 = 1
        L_0x0030:
            if (r3 == r1) goto L_0x004f
        L_0x0032:
            java.lang.String r5 = getExtension(r5)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x004d
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ Exception -> 0x004b }
            java.lang.String r1 = r5.toLowerCase()     // Catch:{ Exception -> 0x004b }
            boolean r0 = r0.hasExtension(r1)     // Catch:{ Exception -> 0x004b }
            if (r0 == 0) goto L_0x004d
            return r5
        L_0x004b:
            r5 = move-exception
            throw r5
        L_0x004d:
            r5 = 0
            return r5
        L_0x004f:
            int r5 = length
            int r5 = r5 + 41
            int r3 = r5 % 128
            setMax = r3
            int r5 = r5 % 2
            if (r5 != 0) goto L_0x005c
            r1 = 0
        L_0x005c:
            if (r1 == 0) goto L_0x005f
            return r0
        L_0x005f:
            r5 = 43
            int r5 = r5 / r2
            return r0
        L_0x0063:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.FileUtils.getFileExtensionFromUrl(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0048, code lost:
        if ((r0 >= r6.length() % 1 ? 'W' : 'A') != 'W') goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0050, code lost:
        if (r0 >= (r6.length() - 1)) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getExtension(java.lang.String r6) {
        /*
            int r0 = length     // Catch:{ Exception -> 0x006e }
            int r0 = r0 + 53
            int r1 = r0 % 128
            setMax = r1     // Catch:{ Exception -> 0x006e }
            int r0 = r0 % 2
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 33
            if (r0 == 0) goto L_0x0015
            r0 = 33
            goto L_0x0017
        L_0x0015:
            r0 = 78
        L_0x0017:
            java.lang.String r2 = ""
            if (r0 == r1) goto L_0x0063
            r0 = 46
            int r0 = r6.lastIndexOf(r0)
            r1 = 0
            r3 = 1
            if (r0 < 0) goto L_0x0027
            r4 = 0
            goto L_0x0028
        L_0x0027:
            r4 = 1
        L_0x0028:
            if (r4 == r3) goto L_0x0059
            int r4 = length
            int r4 = r4 + 61
            int r5 = r4 % 128
            setMax = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r1 = 1
        L_0x0038:
            if (r1 == r3) goto L_0x004b
            int r1 = r6.length()
            int r1 = r1 % r3
            r4 = 87
            if (r0 < r1) goto L_0x0046
            r1 = 87
            goto L_0x0048
        L_0x0046:
            r1 = 65
        L_0x0048:
            if (r1 == r4) goto L_0x0059
            goto L_0x0053
        L_0x004b:
            int r1 = r6.length()
            int r1 = r1 - r3
            if (r0 < r1) goto L_0x0053
            goto L_0x0059
        L_0x0053:
            int r0 = r0 + r3
            java.lang.String r6 = r6.substring(r0)
            return r6
        L_0x0059:
            int r6 = setMax
            int r6 = r6 + r3
            int r0 = r6 % 128
            length = r0
            int r6 = r6 % 2
            return r2
        L_0x0063:
            int r6 = setMax
            int r6 = r6 + 45
            int r0 = r6 % 128
            length = r0
            int r6 = r6 % 2
            return r2
        L_0x006e:
            r6 = move-exception
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.FileUtils.getExtension(java.lang.String):java.lang.String");
    }

    public static String getMimeType(String str) {
        String str2;
        int i = setMax + 9;
        length = i % 128;
        int i2 = i % 2;
        try {
            String fileExtensionFromUrl = getFileExtensionFromUrl(str);
            try {
                if (("js".equalsIgnoreCase(fileExtensionFromUrl) ? 11 : '2') != '2') {
                    return "application/javascript";
                }
                if ((fileExtensionFromUrl != null ? 9 : '/') != 9) {
                    return null;
                }
                int i3 = length + 19;
                setMax = i3 % 128;
                if (i3 % 2 == 0) {
                    str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                    int i4 = 25 / 0;
                } else {
                    str2 = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
                }
                return str2;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    @Nullable
    public static String getMimeTypeFromContentType(String str) {
        String[] strArr;
        int i = setMax + 7;
        length = i % 128;
        if ((i % 2 != 0 ? 'N' : '(') != 'N') {
            try {
                strArr = str.split(";");
                if ((strArr[0] != null ? 'B' : 30) == 30) {
                    return null;
                }
            } catch (Throwable th) {
                RVLogger.e(TAG, "getMimeTypeFromContentType", th);
                return null;
            }
        } else {
            strArr = str.split(";");
            if (strArr[0] == null) {
                return null;
            }
        }
        String trim = strArr[0].trim();
        int i2 = setMax + 63;
        length = i2 % 128;
        int i3 = i2 % 2;
        return trim;
    }

    public static String getMD5(String str) {
        if ((TextUtils.isEmpty(str) ? '_' : 'D') != 'D') {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(MD5Util.ALGORIGTHM_MD5);
            try {
                int i = setMax + 7;
                length = i % 128;
                int i2 = i % 2;
                int i3 = length + 55;
                setMax = i3 % 128;
                int i4 = i3 % 2;
                char[] charArray = str.toCharArray();
                byte[] bArr = new byte[charArray.length];
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    if ((i6 < charArray.length ? '5' : ':') != '5') {
                        break;
                    }
                    bArr[i6] = (byte) charArray[i6];
                    i6++;
                    int i7 = setMax + 97;
                    length = i7 % 128;
                    int i8 = i7 % 2;
                }
                byte[] digest = instance.digest(bArr);
                StringBuilder sb = new StringBuilder();
                while (i5 < digest.length) {
                    byte b = digest[i5] & 255;
                    if ((b < 16 ? '/' : 'R') != 'R') {
                        sb.append("0");
                    }
                    sb.append(Integer.toHexString(b));
                    i5++;
                    int i9 = setMax + 19;
                    length = i9 % 128;
                    int i10 = i9 % 2;
                }
                return sb.toString();
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            RVLogger.e(TAG, "exception detail", e2);
            return null;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String read(java.lang.String r4) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x001e, all -> 0x001c }
            r1.<init>(r4)     // Catch:{ Exception -> 0x001e, all -> 0x001c }
            java.lang.String r0 = read((java.io.InputStream) r1)     // Catch:{ Exception -> 0x001a }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r1)     // Catch:{ Exception -> 0x0018 }
            int r4 = setMax
            int r4 = r4 + 103
            int r1 = r4 % 128
            length = r1
            int r4 = r4 % 2
            goto L_0x002a
        L_0x0018:
            r4 = move-exception
            throw r4
        L_0x001a:
            r4 = move-exception
            goto L_0x0020
        L_0x001c:
            r4 = move-exception
            goto L_0x0037
        L_0x001e:
            r4 = move-exception
            r1 = r0
        L_0x0020:
            java.lang.String r2 = "AriverKernel:FileUtils"
            java.lang.String r3 = "Exception"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r2, r3, r4)     // Catch:{ all -> 0x0035 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r1)
        L_0x002a:
            int r4 = length
            int r4 = r4 + 121
            int r1 = r4 % 128
            setMax = r1
            int r4 = r4 % 2
            return r0
        L_0x0035:
            r4 = move-exception
            r0 = r1
        L_0x0037:
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.kernel.common.utils.FileUtils.read(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.String] */
    public static String read(InputStream inputStream) {
        int i = length + 99;
        setMax = i % 128;
        int i2 = i % 2;
        if (inputStream != null) {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[2048];
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, setMax(new int[]{0, 5, 0, 0}, PhoneNumberUtils.isStartsPostDial('0'), new byte[]{1, 1, 0, 1, 1}).intern());
                while (true) {
                    int read = inputStreamReader.read(cArr, 0, 2048);
                    if (read < 0) {
                        break;
                    }
                    sb.append(cArr, 0, read);
                }
            } catch (Exception e) {
                RVLogger.e(TAG, "Exception", e);
            }
            return sb.toString();
        }
        int i3 = length + 49;
        setMax = i3 % 128;
        ? r0 = 0;
        if (i3 % 2 == 0) {
            int length2 = r0.length;
        }
        return r0;
    }

    public static String formatFileSize(long j) {
        String str;
        float f = (float) j;
        if ((f > 900.0f ? ']' : '2') != '2') {
            int i = setMax + 5;
            length = i % 128;
            int i2 = i % 2;
            f /= 1000.0f;
            str = " KB";
        } else {
            str = " B";
        }
        if (f > 900.0f) {
            f /= 1000.0f;
            str = " MB";
        }
        if ((f > 900.0f ? (char) 27 : 31) != 31) {
            f /= 1000.0f;
            str = " GB";
        }
        if (f > 900.0f) {
            f /= 1000.0f;
            str = " TB";
        }
        if (f > 900.0f) {
            f /= 1000.0f;
            str = " PB";
        }
        Object obj = null;
        String str2 = "%.2f";
        if ((f < 1.0f ? 'b' : 3) == 'b') {
            int i3 = setMax + 5;
            length = i3 % 128;
            if ((i3 % 2 != 0 ? ')' : '?') == ')') {
                super.hashCode();
            }
        } else if (f < 10.0f) {
            int i4 = setMax + 45;
            length = i4 % 128;
            if (i4 % 2 != 0) {
                super.hashCode();
            }
        } else {
            if ((f < 100.0f ? 31 : 'G') != 31) {
                str2 = "%.0f";
                int i5 = setMax + 49;
                length = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(str2, new Object[]{Float.valueOf(f)}));
        sb.append(str);
        return sb.toString();
    }

    private static String setMax(int[] iArr, boolean z, byte[] bArr) {
        int i = 0;
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        try {
            char[] cArr = new char[i3];
            try {
                System.arraycopy(getMin, i2, cArr, 0, i3);
                if (bArr != null) {
                    char[] cArr2 = new char[i3];
                    int i6 = 0;
                    char c = 0;
                    while (true) {
                        if ((i6 < i3 ? '4' : '*') == '*') {
                            break;
                        }
                        int i7 = length + 3;
                        setMax = i7 % 128;
                        if (i7 % 2 != 0 ? bArr[i6] != 1 : bArr[i6] != 1) {
                            cArr2[i6] = (char) ((cArr[i6] << 1) - c);
                        } else {
                            cArr2[i6] = (char) (((cArr[i6] << 1) + 1) - c);
                        }
                        c = cArr2[i6];
                        i6++;
                    }
                    cArr = cArr2;
                }
                if (i5 > 0) {
                    int i8 = length + 9;
                    setMax = i8 % 128;
                    int i9 = i8 % 2;
                    char[] cArr3 = new char[i3];
                    System.arraycopy(cArr, 0, cArr3, 0, i3);
                    int i10 = i3 - i5;
                    System.arraycopy(cArr3, 0, cArr, i10, i5);
                    System.arraycopy(cArr3, i5, cArr, 0, i10);
                }
                if ((z ? '_' : 0) != 0) {
                    char[] cArr4 = new char[i3];
                    for (int i11 = 0; i11 < i3; i11++) {
                        cArr4[i11] = cArr[(i3 - i11) - 1];
                    }
                    cArr = cArr4;
                }
                if (i4 > 0) {
                    while (true) {
                        if ((i < i3 ? 'L' : ',') != 'L') {
                            break;
                        }
                        int i12 = setMax + 77;
                        length = i12 % 128;
                        int i13 = i12 % 2;
                        cArr[i] = (char) (cArr[i] - iArr[2]);
                        i++;
                    }
                }
                return new String(cArr);
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
