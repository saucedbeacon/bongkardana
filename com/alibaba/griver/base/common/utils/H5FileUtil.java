package com.alibaba.griver.base.common.utils;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.parser.JSONLexer;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.security.MessageDigest;
import kotlin.text.Typography;
import o.onActivityPostCreated;

public class H5FileUtil {
    public static final String TAG = "H5FileUtil";
    private static int getMax = 0;
    private static char getMin = '䤳';
    private static char length = '悊';
    private static char setMax = '䭽';
    private static char setMin = '퀆';
    private static int toFloatRange = 1;

    public static boolean create(String str) {
        try {
            int i = getMax + 117;
            toFloatRange = i % 128;
            int i2 = i % 2;
            boolean create = create(str, false);
            int i3 = getMax + 81;
            toFloatRange = i3 % 128;
            int i4 = i3 % 2;
            return create;
        } catch (Exception e) {
            throw e;
        }
    }

    public static boolean create(String str, boolean z) {
        if ((TextUtils.isEmpty(str) ? '-' : 'V') != '-') {
            if ((exists(str) ? JSONLexer.EOI : 20) != 26) {
                try {
                    mkdirs(getParent(str), z);
                    try {
                        return new File(str).createNewFile();
                    } catch (Exception e) {
                        RVLogger.e(TAG, "exception detail", e);
                        return false;
                    }
                } catch (Exception e2) {
                    throw e2;
                }
            } else {
                try {
                    int i = toFloatRange + 125;
                    getMax = i % 128;
                    if (i % 2 != 0) {
                    }
                    return true;
                } catch (Exception e3) {
                    throw e3;
                }
            }
        } else {
            int i2 = getMax + 105;
            toFloatRange = i2 % 128;
            if (i2 % 2 == 0) {
            }
            return false;
        }
    }

    public static boolean mkdirs(String str) {
        int i = toFloatRange + 121;
        getMax = i % 128;
        int i2 = i % 2;
        boolean z = false;
        boolean mkdirs = mkdirs(str, false);
        try {
            int i3 = getMax + 41;
            toFloatRange = i3 % 128;
            if (i3 % 2 == 0) {
                z = true;
            }
            if (!z) {
                return mkdirs;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return mkdirs;
        } catch (Exception e) {
            throw e;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0034, code lost:
        if ((!r4 ? 5 : '!') != '!') goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0039, code lost:
        if (r4 == false) goto L_0x003b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0050, code lost:
        delete(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean mkdirs(java.lang.String r3, boolean r4) {
        /*
            java.lang.String r0 = "H5FileUtil"
            java.io.File r1 = new java.io.File
            r1.<init>(r3)
            boolean r2 = exists((java.lang.String) r3)     // Catch:{ Exception -> 0x007a }
            if (r2 == 0) goto L_0x0053
            boolean r3 = isFolder(r3)
            if (r3 != 0) goto L_0x0053
            int r3 = getMax
            int r3 = r3 + 103
            int r2 = r3 % 128
            toFloatRange = r2
            int r3 = r3 % 2
            r2 = 31
            if (r3 != 0) goto L_0x0024
            r3 = 18
            goto L_0x0026
        L_0x0024:
            r3 = 31
        L_0x0026:
            if (r3 == r2) goto L_0x0039
            r3 = 0
            super.hashCode()     // Catch:{ all -> 0x0037 }
            r3 = 33
            if (r4 != 0) goto L_0x0032
            r4 = 5
            goto L_0x0034
        L_0x0032:
            r4 = 33
        L_0x0034:
            if (r4 == r3) goto L_0x0050
            goto L_0x003b
        L_0x0037:
            r3 = move-exception
            throw r3
        L_0x0039:
            if (r4 != 0) goto L_0x0050
        L_0x003b:
            int r3 = getMax
            int r3 = r3 + 73
            int r4 = r3 % 128
            toFloatRange = r4
            int r3 = r3 % 2
            r4 = 0
            r0 = 1
            if (r3 != 0) goto L_0x004b
            r3 = 1
            goto L_0x004c
        L_0x004b:
            r3 = 0
        L_0x004c:
            if (r3 == r0) goto L_0x004f
            return r4
        L_0x004f:
            return r0
        L_0x0050:
            delete((java.io.File) r1)
        L_0x0053:
            boolean r3 = r1.mkdirs()     // Catch:{ Exception -> 0x006f }
            java.lang.String r4 = "create dir "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ Exception -> 0x006f }
            java.lang.String r3 = r4.concat(r3)     // Catch:{ Exception -> 0x006f }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r3)     // Catch:{ Exception -> 0x006f }
            int r3 = getMax
            int r3 = r3 + 99
            int r4 = r3 % 128
            toFloatRange = r4
            int r3 = r3 % 2
            goto L_0x0075
        L_0x006f:
            r3 = move-exception
            java.lang.String r4 = "exception detail"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r0, r4, r3)
        L_0x0075:
            boolean r3 = exists((java.io.File) r1)
            return r3
        L_0x007a:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.H5FileUtil.mkdirs(java.lang.String, boolean):boolean");
    }

    public static boolean checkPathValid(String str) {
        int i = getMax + 17;
        toFloatRange = i % 128;
        int i2 = i % 2;
        if ((!TextUtils.isEmpty(str) ? 8 : 'X') == 'X') {
            return true;
        }
        if (!TextUtils.equals(str, "/")) {
            try {
                int i3 = getMax + 61;
                toFloatRange = i3 % 128;
                int i4 = i3 % 2;
                if (!str.contains("../")) {
                    if ((str.contains("/..") ? (char) 18 : 19) == 19) {
                        return true;
                    }
                }
            } catch (Exception e) {
                throw e;
            }
        }
        int i5 = toFloatRange + 123;
        getMax = i5 % 128;
        int i6 = i5 % 2;
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        if (r0 != false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        if ((r4.equals("/") ? 1 : 'I') != 1) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean delete(java.lang.String r4) {
        /*
            int r0 = toFloatRange
            int r0 = r0 + 117
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L_0x0054
            int r0 = toFloatRange
            int r0 = r0 + 41
            int r2 = r0 % 128
            getMax = r2
            int r0 = r0 % 2
            r2 = 1
            if (r0 == 0) goto L_0x0020
            r0 = 1
            goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            java.lang.String r3 = "/"
            if (r0 == 0) goto L_0x0034
            boolean r0 = r4.equals(r3)     // Catch:{ Exception -> 0x0032 }
            r2 = 0
            super.hashCode()     // Catch:{ all -> 0x0030 }
            if (r0 == 0) goto L_0x0040
            goto L_0x0054
        L_0x0030:
            r4 = move-exception
            throw r4
        L_0x0032:
            r4 = move-exception
            throw r4
        L_0x0034:
            boolean r0 = r4.equals(r3)
            if (r0 == 0) goto L_0x003c
            r0 = 1
            goto L_0x003e
        L_0x003c:
            r0 = 73
        L_0x003e:
            if (r0 == r2) goto L_0x0054
        L_0x0040:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r4 = delete((java.io.File) r0)
            int r0 = toFloatRange
            int r0 = r0 + 11
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            return r4
        L_0x0054:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.H5FileUtil.delete(java.lang.String):boolean");
    }

    public static boolean delete(File file) {
        boolean z = true;
        if ((exists(file) ? 24 : 'L') != 'L') {
            int i = toFloatRange + 73;
            getMax = i % 128;
            int i2 = i % 2;
            if ((TextUtils.equals("/", file.getAbsolutePath()) ? 29 : 'M') == 'M') {
                if (file.isFile()) {
                    StringBuilder sb = new StringBuilder("deleteFile:");
                    sb.append(file.getAbsolutePath());
                    RVLogger.d(TAG, sb.toString());
                    return file.delete();
                }
                File[] listFiles = file.listFiles();
                int i3 = 0;
                if (listFiles == null) {
                    int i4 = getMax + 69;
                    toFloatRange = i4 % 128;
                    if ((i4 % 2 == 0 ? '*' : 'N') != '*') {
                        return true;
                    }
                    return false;
                }
                while (true) {
                    if ((i3 < listFiles.length ? 'S' : '2') != '2') {
                        z |= delete(listFiles[i3]);
                        i3++;
                    } else {
                        try {
                            boolean delete = file.delete() | z;
                            StringBuilder sb2 = new StringBuilder("deleteFile:");
                            sb2.append(file.getAbsolutePath());
                            sb2.append(" result:");
                            sb2.append(delete);
                            RVLogger.d(TAG, sb2.toString());
                            return delete;
                        } catch (Exception e) {
                            throw e;
                        }
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if ((r0) != true) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0030, code lost:
        if ((!android.text.TextUtils.isEmpty(r4)) != true) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0033, code lost:
        r4 = exists(new java.io.File(r4));
        r0 = toFloatRange + 81;
        getMax = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean exists(java.lang.String r4) {
        /*
            int r0 = toFloatRange
            int r0 = r0 + 31
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 69
            if (r0 == 0) goto L_0x0011
            r0 = 22
            goto L_0x0013
        L_0x0011:
            r0 = 69
        L_0x0013:
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0027
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0021
            r0 = 1
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == r3) goto L_0x0032
            goto L_0x0033
        L_0x0025:
            r4 = move-exception
            throw r4
        L_0x0027:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x002f
            r0 = 0
            goto L_0x0030
        L_0x002f:
            r0 = 1
        L_0x0030:
            if (r0 == r3) goto L_0x0033
        L_0x0032:
            return r2
        L_0x0033:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r4 = exists((java.io.File) r0)
            int r0 = toFloatRange
            int r0 = r0 + 81
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.H5FileUtil.exists(java.lang.String):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        if ((!r3) != true) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003c, code lost:
        if ((r3.exists() ? 'E' : 'J') != 'J') goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean exists(java.io.File r3) {
        /*
            int r0 = toFloatRange     // Catch:{ Exception -> 0x004c }
            int r0 = r0 + 65
            int r1 = r0 % 128
            getMax = r1     // Catch:{ Exception -> 0x004c }
            int r0 = r0 % 2
            r0 = 0
            if (r3 == 0) goto L_0x003f
            int r1 = toFloatRange
            int r1 = r1 + 81
            int r2 = r1 % 128
            getMax = r2
            int r1 = r1 % 2
            r2 = 1
            if (r1 == 0) goto L_0x001c
            r1 = 0
            goto L_0x001d
        L_0x001c:
            r1 = 1
        L_0x001d:
            if (r1 == r2) goto L_0x002f
            boolean r3 = r3.exists()
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x002d }
            if (r3 == 0) goto L_0x0029
            r3 = 0
            goto L_0x002a
        L_0x0029:
            r3 = 1
        L_0x002a:
            if (r3 == r2) goto L_0x003f
            goto L_0x003e
        L_0x002d:
            r3 = move-exception
            throw r3
        L_0x002f:
            boolean r3 = r3.exists()
            r1 = 74
            if (r3 == 0) goto L_0x003a
            r3 = 69
            goto L_0x003c
        L_0x003a:
            r3 = 74
        L_0x003c:
            if (r3 == r1) goto L_0x003f
        L_0x003e:
            return r2
        L_0x003f:
            int r3 = toFloatRange     // Catch:{ Exception -> 0x004a }
            int r3 = r3 + 59
            int r1 = r3 % 128
            getMax = r1     // Catch:{ Exception -> 0x004a }
            int r3 = r3 % 2
            return r0
        L_0x004a:
            r3 = move-exception
            throw r3
        L_0x004c:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.H5FileUtil.exists(java.io.File):boolean");
    }

    public static String getParent(String str) {
        if ((TextUtils.isEmpty(str) ? Typography.greater : 'a') != '>') {
            String parent = getParent(new File(cleanPath(str)));
            int i = toFloatRange + 17;
            getMax = i % 128;
            int i2 = i % 2;
            return parent;
        }
        int i3 = getMax + 31;
        toFloatRange = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.String] */
    public static String getParent(File file) {
        int i = getMax + 81;
        toFloatRange = i % 128;
        int i2 = i % 2;
        if ((file == null ? 'S' : '_') != 'S') {
            return file.getParent();
        }
        int i3 = toFloatRange + 23;
        getMax = i3 % 128;
        ? r1 = 0;
        if ((i3 % 2 != 0 ? 'L' : '?') == '?') {
            return r1;
        }
        int length2 = r1.length;
        return r1;
    }

    public static String cleanPath(String str) {
        try {
            int i = getMax + 103;
            try {
                toFloatRange = i % 128;
                int i2 = i % 2;
                if ((TextUtils.isEmpty(str) ? 'D' : 22) != 22) {
                    return str;
                }
                try {
                    str = new File(str).getCanonicalPath();
                    int i3 = toFloatRange + 27;
                    getMax = i3 % 128;
                    int i4 = i3 % 2;
                } catch (Exception e) {
                    RVLogger.e(TAG, "Exception", e);
                }
                return str;
            } catch (Exception e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw e3;
        }
    }

    public static long size(String str) {
        int i = toFloatRange + 87;
        getMax = i % 128;
        int i2 = i % 2;
        if (!(str != null)) {
            int i3 = getMax + 109;
            toFloatRange = i3 % 128;
            int i4 = i3 % 2;
            return 0;
        }
        try {
            long size = size(new File(str));
            int i5 = toFloatRange + 43;
            getMax = i5 % 128;
            int i6 = i5 % 2;
            return size;
        } catch (Exception e) {
            throw e;
        }
    }

    public static long size(File file) {
        long j = 0;
        if (!exists(file)) {
            return 0;
        }
        if (isFile(file)) {
            int i = getMax + 15;
            toFloatRange = i % 128;
            int i2 = i % 2;
            long length2 = file.length();
            try {
                int i3 = toFloatRange + 41;
                try {
                    getMax = i3 % 128;
                    int i4 = i3 % 2;
                    return length2;
                } catch (Exception e) {
                    throw e;
                }
            } catch (Exception e2) {
                throw e2;
            }
        } else {
            File[] listFiles = file.listFiles();
            int i5 = 0;
            if (listFiles != null) {
                if (!(listFiles.length == 0)) {
                    int length3 = listFiles.length;
                    while (i5 < length3) {
                        int i6 = toFloatRange + 97;
                        getMax = i6 % 128;
                        if (i6 % 2 != 0) {
                            j ^= size(listFiles[i5]);
                            i5 += 37;
                        } else {
                            j += size(listFiles[i5]);
                            i5++;
                        }
                    }
                }
            }
            return j;
        }
    }

    public static boolean copy(String str, String str2) {
        try {
            int i = toFloatRange + 45;
            getMax = i % 128;
            int i2 = i % 2;
            boolean copy = copy(str, str2, false);
            int i3 = getMax + 93;
            toFloatRange = i3 % 128;
            if ((i3 % 2 == 0 ? 'X' : 28) != 'X') {
                return copy;
            }
            Object[] objArr = null;
            int length2 = objArr.length;
            return copy;
        } catch (Exception e) {
            throw e;
        }
    }

    public static boolean copy(String str, String str2, boolean z) {
        try {
            int i = getMax + 103;
            toFloatRange = i % 128;
            int i2 = i % 2;
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                if (str.equals(str2)) {
                    return true;
                }
                if (exists(str)) {
                    if (!(!isFile(str))) {
                        if (exists(str2)) {
                            if (!z) {
                                int i3 = toFloatRange + 79;
                                getMax = i3 % 128;
                                if ((i3 % 2 != 0 ? ']' : 'L') != ']') {
                                    return false;
                                }
                                Object[] objArr = null;
                                int length2 = objArr.length;
                                return false;
                            }
                            delete(str2);
                        }
                        if ((!create(str2) ? Typography.less : '8') != '8') {
                            int i4 = toFloatRange + 71;
                            getMax = i4 % 128;
                            if (i4 % 2 != 0) {
                                return true;
                            }
                            return false;
                        }
                        try {
                            FileInputStream fileInputStream = new FileInputStream(str);
                            FileOutputStream fileOutputStream = new FileOutputStream(str2);
                            try {
                                byte[] buf = IOUtils.getBuf(2048);
                                while (true) {
                                    try {
                                        int read = fileInputStream.read(buf);
                                        if (!(read != -1)) {
                                            fileOutputStream.flush();
                                            return true;
                                        }
                                        fileOutputStream.write(buf, 0, read);
                                    } catch (Exception e) {
                                        RVLogger.e(TAG, "exception detail", e);
                                        return false;
                                    } finally {
                                        IOUtils.returnBuf(buf);
                                        IOUtils.closeQuietly(fileInputStream);
                                        IOUtils.closeQuietly(fileOutputStream);
                                    }
                                }
                            } catch (Exception e2) {
                                throw e2;
                            }
                        } catch (Exception e3) {
                            RVLogger.e(TAG, "exception detail", e3);
                        }
                    }
                }
            }
            return false;
        } catch (Exception e4) {
            throw e4;
        }
    }

    public static String fileName(String str) {
        if (!(!TextUtils.isEmpty(str))) {
            try {
                int i = getMax + 73;
                toFloatRange = i % 128;
                int i2 = i % 2;
                int i3 = getMax + 59;
                toFloatRange = i3 % 128;
                if (i3 % 2 != 0) {
                    return null;
                }
                int i4 = 16 / 0;
                return null;
            } catch (Exception e) {
                throw e;
            }
        } else {
            try {
                return new File(cleanPath(str)).getName();
            } catch (Exception e2) {
                throw e2;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getFileExtensionFromUrl(java.lang.String r3) {
        /*
            java.lang.String r0 = android.webkit.MimeTypeMap.getFileExtensionFromUrl(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 17
            if (r1 == 0) goto L_0x000f
            r1 = 17
            goto L_0x0011
        L_0x000f:
            r1 = 55
        L_0x0011:
            if (r1 == r2) goto L_0x0014
            return r0
        L_0x0014:
            int r0 = getMax
            int r0 = r0 + 7
            int r1 = r0 % 128
            toFloatRange = r1
            int r0 = r0 % 2
            java.lang.String r3 = getExtension(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 90
            if (r0 != 0) goto L_0x002d
            r0 = 90
            goto L_0x002e
        L_0x002d:
            r0 = 0
        L_0x002e:
            r2 = 0
            if (r0 == r1) goto L_0x0032
            goto L_0x005f
        L_0x0032:
            int r0 = getMax     // Catch:{ Exception -> 0x0062 }
            int r0 = r0 + 97
            int r1 = r0 % 128
            toFloatRange = r1     // Catch:{ Exception -> 0x0060 }
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0050
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()     // Catch:{ Exception -> 0x0060 }
            java.lang.String r1 = r3.toLowerCase()     // Catch:{ Exception -> 0x0060 }
            boolean r0 = r0.hasExtension(r1)     // Catch:{ Exception -> 0x0060 }
            int r1 = r2.length     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x005f
            goto L_0x005e
        L_0x004e:
            r3 = move-exception
            throw r3
        L_0x0050:
            android.webkit.MimeTypeMap r0 = android.webkit.MimeTypeMap.getSingleton()
            java.lang.String r1 = r3.toLowerCase()
            boolean r0 = r0.hasExtension(r1)
            if (r0 == 0) goto L_0x005f
        L_0x005e:
            return r3
        L_0x005f:
            return r2
        L_0x0060:
            r3 = move-exception
            throw r3
        L_0x0062:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.H5FileUtil.getFileExtensionFromUrl(java.lang.String):java.lang.String");
    }

    @Deprecated
    public static String getExtension(String str) {
        try {
            if (!(!TextUtils.isEmpty(str))) {
                int i = getMax + 75;
                toFloatRange = i % 128;
                if ((i % 2 == 0 ? Typography.dollar : 'Y') == 'Y') {
                    return "";
                }
                int i2 = 77 / 0;
                return "";
            }
            try {
                int lastIndexOf = str.lastIndexOf(46);
                if (lastIndexOf >= 0) {
                    int i3 = toFloatRange + 119;
                    getMax = i3 % 128;
                    int i4 = i3 % 2;
                    if (!(lastIndexOf >= str.length() - 1)) {
                        String substring = str.substring(lastIndexOf + 1);
                        int i5 = toFloatRange + 17;
                        getMax = i5 % 128;
                        if ((i5 % 2 != 0 ? '0' : 11) != '0') {
                            return substring;
                        }
                        int i6 = 21 / 0;
                        return substring;
                    }
                }
                return "";
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, java.lang.String] */
    public static String getMimeType(String str) {
        int i = toFloatRange + 19;
        getMax = i % 128;
        int i2 = i % 2;
        String fileExtensionFromUrl = getFileExtensionFromUrl(str);
        ? r1 = 0;
        if ("js".equalsIgnoreCase(fileExtensionFromUrl)) {
            int i3 = toFloatRange + 17;
            getMax = i3 % 128;
            if ((i3 % 2 != 0 ? Typography.less : 'Q') != '<') {
                return "application/javascript";
            }
            super.hashCode();
            return "application/javascript";
        }
        boolean z = false;
        if (fileExtensionFromUrl == null) {
            return r1;
        }
        int i4 = getMax + 109;
        toFloatRange = i4 % 128;
        if (i4 % 2 == 0) {
            z = true;
        }
        if (z) {
            String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
            int length2 = r1.length;
            return mimeTypeFromExtension;
        }
        try {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        } catch (Exception e) {
            throw e;
        }
    }

    public static String getExtensionFromMimeType(String str) {
        try {
            int i = getMax + 59;
            toFloatRange = i % 128;
            int i2 = i % 2;
            try {
                if (!(TextUtils.isEmpty(str))) {
                    return MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
                }
                int i3 = toFloatRange + 109;
                getMax = i3 % 128;
                int i4 = i3 % 2;
                return null;
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    public static boolean isFile(String str) {
        try {
            int i = toFloatRange + 7;
            getMax = i % 128;
            int i2 = i % 2;
            if (!exists(str)) {
                int i3 = toFloatRange + 43;
                getMax = i3 % 128;
                int i4 = i3 % 2;
                return false;
            }
            try {
                return isFile(new File(str));
            } catch (Exception e) {
                throw e;
            }
        } catch (Exception e2) {
            throw e2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        if ((r4 == null) != true) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        if (r4 != null) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isFile(java.io.File r4) {
        /*
            int r0 = toFloatRange
            int r0 = r0 + 73
            int r1 = r0 % 128
            getMax = r1
            int r0 = r0 % 2
            r1 = 87
            if (r0 == 0) goto L_0x0011
            r0 = 38
            goto L_0x0013
        L_0x0011:
            r0 = 87
        L_0x0013:
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x0025
            r0 = 0
            super.hashCode()     // Catch:{ all -> 0x0023 }
            if (r4 == 0) goto L_0x001f
            r0 = 0
            goto L_0x0020
        L_0x001f:
            r0 = 1
        L_0x0020:
            if (r0 == r3) goto L_0x0038
            goto L_0x0027
        L_0x0023:
            r4 = move-exception
            throw r4
        L_0x0025:
            if (r4 == 0) goto L_0x0038
        L_0x0027:
            boolean r4 = r4.isFile()
            r0 = 16
            if (r4 == 0) goto L_0x0032
            r4 = 16
            goto L_0x0034
        L_0x0032:
            r4 = 15
        L_0x0034:
            if (r4 == r0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            return r3
        L_0x0038:
            int r4 = toFloatRange
            int r4 = r4 + 95
            int r0 = r4 % 128
            getMax = r0
            int r4 = r4 % 2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.H5FileUtil.isFile(java.io.File):boolean");
    }

    public static boolean isFolder(String str) {
        int i = getMax + 37;
        toFloatRange = i % 128;
        int i2 = i % 2;
        if (exists(str)) {
            return new File(str).isDirectory();
        }
        int i3 = getMax + 61;
        toFloatRange = i3 % 128;
        if (i3 % 2 == 0) {
        }
        int i4 = getMax + 55;
        toFloatRange = i4 % 128;
        if (!(i4 % 2 == 0)) {
            return false;
        }
        Object obj = null;
        super.hashCode();
        return false;
    }

    public static String getFileSHA1(String str) {
        FileInputStream fileInputStream;
        int i = toFloatRange + 125;
        getMax = i % 128;
        int i2 = i % 2;
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            try {
                int i3 = getMax + 77;
                toFloatRange = i3 % 128;
                int i4 = i3 % 2;
                return null;
            } catch (Exception e) {
                throw e;
            }
        } else {
            File file = new File(str);
            if (!(file.exists()) || file.isDirectory()) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(file);
            } catch (FileNotFoundException e2) {
                RVLogger.e(TAG, "exception detail.", e2);
                fileInputStream = null;
            }
            if (fileInputStream == null) {
                return null;
            }
            byte[] buf = IOUtils.getBuf(2048);
            try {
                MessageDigest instance = MessageDigest.getInstance("SHA-1");
                int i5 = getMax + 37;
                toFloatRange = i5 % 128;
                int i6 = i5 % 2;
                while (true) {
                    int read = fileInputStream.read(buf);
                    if (read <= 0) {
                        break;
                    }
                    instance.update(buf, 0, read);
                }
                str2 = H5SecurityUtil.bytes2Hex(instance.digest());
                try {
                    return !TextUtils.isEmpty(str2) ? str2.trim() : str2;
                } catch (Exception e3) {
                    throw e3;
                }
            } catch (Exception e4) {
                RVLogger.e(TAG, "exception detail", e4);
            } finally {
                IOUtils.returnBuf(buf);
                IOUtils.closeQuietly(fileInputStream);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v17, resolved type: java.io.FileInputStream} */
    /* JADX WARNING: type inference failed for: r8v4, types: [java.io.Closeable, java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getFileMD5(java.lang.String r8) {
        /*
            java.lang.String r0 = "H5FileUtil"
            boolean r1 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x00a7 }
            r2 = 0
            if (r1 == 0) goto L_0x0025
            int r8 = getMax
            int r8 = r8 + 43
            int r0 = r8 % 128
            toFloatRange = r0
            int r8 = r8 % 2
            r0 = 21
            if (r8 != 0) goto L_0x001a
            r8 = 21
            goto L_0x001c
        L_0x001a:
            r8 = 11
        L_0x001c:
            if (r8 == r0) goto L_0x001f
            goto L_0x0022
        L_0x001f:
            super.hashCode()     // Catch:{ all -> 0x0023 }
        L_0x0022:
            return r2
        L_0x0023:
            r8 = move-exception
            throw r8
        L_0x0025:
            java.io.File r1 = new java.io.File
            r1.<init>(r8)
            boolean r8 = r1.exists()     // Catch:{ Exception -> 0x00a7 }
            if (r8 == 0) goto L_0x00a6
            boolean r8 = r1.isDirectory()
            if (r8 == 0) goto L_0x0038
            goto L_0x00a6
        L_0x0038:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x004a }
            r8.<init>(r1)     // Catch:{ FileNotFoundException -> 0x004a }
            int r1 = toFloatRange     // Catch:{ Exception -> 0x00a7 }
            int r1 = r1 + 55
            int r3 = r1 % 128
            getMax = r3     // Catch:{ Exception -> 0x0048 }
            int r1 = r1 % 2
            goto L_0x0051
        L_0x0048:
            r8 = move-exception
            goto L_0x00a5
        L_0x004a:
            r8 = move-exception
            java.lang.String r1 = "exception detail."
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r0, r1, r8)
            r8 = r2
        L_0x0051:
            if (r8 != 0) goto L_0x0054
            return r2
        L_0x0054:
            r1 = 2048(0x800, float:2.87E-42)
            byte[] r1 = com.alibaba.ariver.kernel.common.utils.IOUtils.getBuf(r1)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r3 = "MD5"
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch:{ Exception -> 0x0082 }
        L_0x0060:
            int r4 = r8.read(r1)     // Catch:{ Exception -> 0x0082 }
            r5 = 1
            r6 = 0
            if (r4 <= 0) goto L_0x006a
            r7 = 1
            goto L_0x006b
        L_0x006a:
            r7 = 0
        L_0x006b:
            if (r7 == r5) goto L_0x007c
            byte[] r3 = r3.digest()     // Catch:{ Exception -> 0x0082 }
            java.lang.String r2 = com.alibaba.griver.base.common.utils.H5SecurityUtil.bytes2Hex(r3)     // Catch:{ Exception -> 0x0082 }
        L_0x0075:
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r1)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r8)
            goto L_0x0093
        L_0x007c:
            r3.update(r1, r6, r4)     // Catch:{ Exception -> 0x0082 }
            goto L_0x0060
        L_0x0080:
            r0 = move-exception
            goto L_0x009e
        L_0x0082:
            r3 = move-exception
            java.lang.String r4 = "exception detail"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r0, r4, r3)     // Catch:{ all -> 0x0080 }
            r8.close()     // Catch:{ IOException -> 0x008c }
            goto L_0x0075
        L_0x008c:
            r3 = move-exception
            java.lang.String r4 = "IOException"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r0, r4, r3)     // Catch:{ all -> 0x0080 }
            goto L_0x0075
        L_0x0093:
            boolean r8 = android.text.TextUtils.isEmpty(r2)
            if (r8 != 0) goto L_0x009d
            java.lang.String r2 = r2.trim()
        L_0x009d:
            return r2
        L_0x009e:
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r1)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r8)
            throw r0
        L_0x00a5:
            throw r8
        L_0x00a6:
            return r2
        L_0x00a7:
            r8 = move-exception
            goto L_0x00aa
        L_0x00a9:
            throw r8
        L_0x00aa:
            goto L_0x00a9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.H5FileUtil.getFileMD5(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r7v13, types: [java.io.BufferedInputStream, java.io.Closeable, java.io.InputStream] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getText(java.lang.String r7) {
        /*
            boolean r0 = exists((java.lang.String) r7)
            r1 = 0
            if (r0 != 0) goto L_0x001a
            int r7 = toFloatRange
            int r7 = r7 + 103
            int r0 = r7 % 128
            getMax = r0
            int r7 = r7 % 2
            if (r7 == 0) goto L_0x0019
            super.hashCode()     // Catch:{ all -> 0x0017 }
            return r1
        L_0x0017:
            r7 = move-exception
            throw r7
        L_0x0019:
            return r1
        L_0x001a:
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            long r2 = r0.length()     // Catch:{ Exception -> 0x00c6 }
            int r7 = (int) r2
            r2 = 20480(0x5000, float:2.8699E-41)
            r3 = 0
            if (r7 <= r2) goto L_0x002b
            r2 = 0
            goto L_0x002c
        L_0x002b:
            r2 = 1
        L_0x002c:
            if (r2 == 0) goto L_0x00bb
            r2 = 1024(0x400, float:1.435E-42)
            byte[] r2 = com.alibaba.ariver.kernel.common.utils.IOUtils.getBuf(r2)
            com.alibaba.ariver.kernel.common.io.PoolingByteArrayOutputStream r4 = new com.alibaba.ariver.kernel.common.io.PoolingByteArrayOutputStream     // Catch:{ Exception -> 0x0093, all -> 0x0090 }
            r4.<init>((int) r7)     // Catch:{ Exception -> 0x0093, all -> 0x0090 }
            java.io.BufferedInputStream r7 = new java.io.BufferedInputStream     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            r5.<init>(r0)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
            r7.<init>(r5)     // Catch:{ Exception -> 0x008d, all -> 0x008a }
        L_0x0043:
            r0 = -1
            int r5 = r7.read(r2)     // Catch:{ Exception -> 0x0088 }
            r6 = 93
            if (r0 == r5) goto L_0x004f
            r0 = 47
            goto L_0x0051
        L_0x004f:
            r0 = 93
        L_0x0051:
            if (r0 == r6) goto L_0x006a
            int r0 = toFloatRange
            int r0 = r0 + 91
            int r6 = r0 % 128
            getMax = r6
            int r0 = r0 % 2
            r6 = 73
            if (r0 == 0) goto L_0x0064
            r0 = 37
            goto L_0x0066
        L_0x0064:
            r0 = 73
        L_0x0066:
            r4.write(r2, r3, r5)     // Catch:{ Exception -> 0x0088 }
            goto L_0x0043
        L_0x006a:
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0088 }
            com.alibaba.ariver.kernel.common.io.ByteArrayPool r1 = com.alibaba.ariver.kernel.common.utils.IOUtils.getByteArrayPool()     // Catch:{ Exception -> 0x0086 }
            r1.returnBuf(r2)     // Catch:{ Exception -> 0x00c6 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r4)     // Catch:{ Exception -> 0x00c6 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r7)     // Catch:{ Exception -> 0x00c6 }
            int r7 = getMax
            int r7 = r7 + 67
            int r1 = r7 % 128
            toFloatRange = r1
            int r7 = r7 % 2
            return r0
        L_0x0086:
            r7 = move-exception
            throw r7
        L_0x0088:
            r0 = move-exception
            goto L_0x0096
        L_0x008a:
            r0 = move-exception
            r7 = r1
            goto L_0x00ac
        L_0x008d:
            r0 = move-exception
            r7 = r1
            goto L_0x0096
        L_0x0090:
            r0 = move-exception
            r7 = r1
            goto L_0x00ad
        L_0x0093:
            r0 = move-exception
            r7 = r1
            r4 = r7
        L_0x0096:
            java.lang.String r3 = "H5FileUtil"
            java.lang.String r5 = "exception detail"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r3, r5, r0)     // Catch:{ all -> 0x00ab }
            com.alibaba.ariver.kernel.common.io.ByteArrayPool r0 = com.alibaba.ariver.kernel.common.utils.IOUtils.getByteArrayPool()
            r0.returnBuf(r2)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r4)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r7)
            return r1
        L_0x00ab:
            r0 = move-exception
        L_0x00ac:
            r1 = r4
        L_0x00ad:
            com.alibaba.ariver.kernel.common.io.ByteArrayPool r3 = com.alibaba.ariver.kernel.common.utils.IOUtils.getByteArrayPool()
            r3.returnBuf(r2)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r1)
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r7)
            throw r0
        L_0x00bb:
            int r7 = getMax
            int r7 = r7 + 75
            int r0 = r7 % 128
            toFloatRange = r0
            int r7 = r7 % 2
            return r1
        L_0x00c6:
            r7 = move-exception
            goto L_0x00c9
        L_0x00c8:
            throw r7
        L_0x00c9:
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.H5FileUtil.getText(java.lang.String):java.lang.String");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.FileInputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String read(java.lang.String r4) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x001c, all -> 0x001a }
            r1.<init>(r4)     // Catch:{ Exception -> 0x001c, all -> 0x001a }
            java.lang.String r4 = read((java.io.InputStream) r1)     // Catch:{ Exception -> 0x0018 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r1)
            int r1 = getMax
            int r1 = r1 + 125
            int r2 = r1 % 128
            toFloatRange = r2
            int r1 = r1 % 2
            goto L_0x0029
        L_0x0018:
            r4 = move-exception
            goto L_0x001e
        L_0x001a:
            r4 = move-exception
            goto L_0x0044
        L_0x001c:
            r4 = move-exception
            r1 = r0
        L_0x001e:
            java.lang.String r2 = "H5FileUtil"
            java.lang.String r3 = "Exception"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r2, r3, r4)     // Catch:{ all -> 0x0042 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r1)
            r4 = r0
        L_0x0029:
            int r1 = toFloatRange
            int r1 = r1 + 107
            int r2 = r1 % 128
            getMax = r2
            int r1 = r1 % 2
            r2 = 1
            if (r1 == 0) goto L_0x0038
            r1 = 1
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            if (r1 == r2) goto L_0x003c
            return r4
        L_0x003c:
            super.hashCode()     // Catch:{ all -> 0x0040 }
            return r4
        L_0x0040:
            r4 = move-exception
            throw r4
        L_0x0042:
            r4 = move-exception
            r0 = r1
        L_0x0044:
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.H5FileUtil.read(java.lang.String):java.lang.String");
    }

    public static final String read(InputStream inputStream) {
        boolean z = true;
        if (inputStream != null) {
            StringBuilder sb = new StringBuilder();
            char[] cArr = new char[2048];
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream, length(new char[]{63881, 52504, 1016, 28842, 65179, 6087}).intern());
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
            String obj = sb.toString();
            int i = toFloatRange + 67;
            getMax = i % 128;
            int i2 = i % 2;
            return obj;
        }
        int i3 = getMax + 95;
        toFloatRange = i3 % 128;
        if (i3 % 2 != 0) {
            z = false;
        }
        if (!z) {
            return null;
        }
        int i4 = 97 / 0;
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        if ((!r0) != true) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r3 = toFloatRange + 57;
        getMax = r3 % 128;
        r3 = r3 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (exists(r3) == false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static long getCreateTime(java.lang.String r3) {
        /*
            int r0 = getMax     // Catch:{ Exception -> 0x004c }
            int r0 = r0 + 99
            int r1 = r0 % 128
            toFloatRange = r1     // Catch:{ Exception -> 0x004c }
            int r0 = r0 % 2
            r1 = 50
            if (r0 != 0) goto L_0x0011
            r0 = 50
            goto L_0x0013
        L_0x0011:
            r0 = 81
        L_0x0013:
            if (r0 == r1) goto L_0x001c
            boolean r0 = exists((java.lang.String) r3)
            if (r0 != 0) goto L_0x002a
            goto L_0x003d
        L_0x001c:
            boolean r0 = exists((java.lang.String) r3)
            r1 = 0
            int r1 = r1.length     // Catch:{ all -> 0x004a }
            r1 = 1
            if (r0 != 0) goto L_0x0027
            r0 = 1
            goto L_0x0028
        L_0x0027:
            r0 = 0
        L_0x0028:
            if (r0 == r1) goto L_0x003d
        L_0x002a:
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            long r0 = r0.lastModified()
            java.util.Date r3 = new java.util.Date
            r3.<init>(r0)
            long r0 = r3.getTime()
            return r0
        L_0x003d:
            r0 = 0
            int r3 = toFloatRange
            int r3 = r3 + 57
            int r2 = r3 % 128
            getMax = r2
            int r3 = r3 % 2
            return r0
        L_0x004a:
            r3 = move-exception
            throw r3
        L_0x004c:
            r3 = move-exception
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.H5FileUtil.getCreateTime(java.lang.String):long");
    }

    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v1, types: [java.io.Closeable] */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean copyToFile(java.io.InputStream r5, java.io.File r6) {
        /*
            r0 = 0
            boolean r1 = r6.exists()     // Catch:{ IOException -> 0x0064 }
            r2 = 1
            if (r1 == 0) goto L_0x000a
            r1 = 0
            goto L_0x000b
        L_0x000a:
            r1 = 1
        L_0x000b:
            r3 = 0
            if (r1 == r2) goto L_0x0024
            int r1 = toFloatRange
            int r1 = r1 + 125
            int r4 = r1 % 128
            getMax = r4
            int r1 = r1 % 2
            if (r1 == 0) goto L_0x0021
            r6.delete()     // Catch:{ IOException -> 0x0064 }
            int r1 = r3.length     // Catch:{ all -> 0x001f }
            goto L_0x0024
        L_0x001f:
            r5 = move-exception
            throw r5
        L_0x0021:
            r6.delete()     // Catch:{ IOException -> 0x0064 }
        L_0x0024:
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r1 = com.alibaba.ariver.kernel.common.utils.IOUtils.getBuf(r1)     // Catch:{ IOException -> 0x0064 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x005c }
            r4.<init>(r6)     // Catch:{ all -> 0x005c }
        L_0x002f:
            int r6 = r5.read(r1)     // Catch:{ all -> 0x0059 }
            if (r6 < 0) goto L_0x0037
            r3 = 0
            goto L_0x0038
        L_0x0037:
            r3 = 1
        L_0x0038:
            if (r3 == 0) goto L_0x004b
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r1)     // Catch:{ IOException -> 0x0064 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r4)     // Catch:{ IOException -> 0x0064 }
            int r5 = toFloatRange
            int r5 = r5 + 49
            int r6 = r5 % 128
            getMax = r6
            int r5 = r5 % 2
            return r2
        L_0x004b:
            r4.write(r1, r0, r6)     // Catch:{ all -> 0x0059 }
            int r6 = getMax
            int r6 = r6 + 23
            int r3 = r6 % 128
            toFloatRange = r3
            int r6 = r6 % 2
            goto L_0x002f
        L_0x0059:
            r5 = move-exception
            r3 = r4
            goto L_0x005d
        L_0x005c:
            r5 = move-exception
        L_0x005d:
            com.alibaba.ariver.kernel.common.utils.IOUtils.returnBuf(r1)     // Catch:{ IOException -> 0x0064 }
            com.alibaba.ariver.kernel.common.utils.IOUtils.closeQuietly(r3)     // Catch:{ IOException -> 0x0064 }
            throw r5     // Catch:{ IOException -> 0x0064 }
        L_0x0064:
            r5 = move-exception
            java.lang.String r6 = "H5FileUtil"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r6, (java.lang.Throwable) r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.base.common.utils.H5FileUtil.copyToFile(java.io.InputStream, java.io.File):boolean");
    }

    private static String length(char[] cArr) {
        int i = getMax + 79;
        toFloatRange = i % 128;
        int i2 = i % 2;
        char[] cArr2 = new char[cArr.length];
        char[] cArr3 = new char[2];
        int i3 = 0;
        while (true) {
            if (i3 >= cArr.length) {
                String str = new String(cArr2, 1, cArr2[0]);
                try {
                    int i4 = toFloatRange + 109;
                    getMax = i4 % 128;
                    int i5 = i4 % 2;
                    return str;
                } catch (Exception e) {
                    throw e;
                }
            } else {
                cArr3[0] = cArr[i3];
                int i6 = i3 + 1;
                cArr3[1] = cArr[i6];
                onActivityPostCreated.setMax(cArr3, getMin, length, setMax, setMin);
                cArr2[i3] = cArr3[0];
                cArr2[i6] = cArr3[1];
                i3 += 2;
            }
        }
    }
}
