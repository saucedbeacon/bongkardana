package com.alipay.zoloz.config.util;

import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

public class FileUtil {
    private static final int IO_BUFFER_SIZE = 16384;
    public static final String TAG = "FileUtil";

    public static boolean create(String str) {
        return create(str, false);
    }

    public static boolean create(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (exists(str)) {
            return true;
        }
        mkdirs(getParent(str), z);
        try {
            return new File(str).createNewFile();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean mkdirs(String str) {
        return mkdirs(str, false);
    }

    public static boolean mkdirs(String str, boolean z) {
        File file = new File(str);
        if (exists(str) && !isFolder(str)) {
            if (!z) {
                return false;
            }
            delete(file);
        }
        try {
            file.mkdirs();
        } catch (Exception unused) {
        }
        return exists(file);
    }

    public static boolean move(String str, String str2) {
        return move(str, str2, false);
    }

    public static boolean move(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !exists(str)) {
            return false;
        }
        if (exists(str2)) {
            if (!z) {
                return false;
            }
            delete(str2);
        }
        try {
            return new File(str).renameTo(new File(str2));
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean delete(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return delete(new File(str));
    }

    public static boolean delete(File file) {
        boolean z = true;
        if (!exists(file)) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        for (File delete : listFiles) {
            z |= delete(delete);
        }
        return file.delete() | z;
    }

    public static boolean exists(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return exists(new File(str));
    }

    public static boolean exists(File file) {
        if (file == null) {
            return false;
        }
        return file.exists();
    }

    public static final String getParent(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return getParent(new File(cleanPath(str)));
    }

    public static final String getParent(File file) {
        if (file == null) {
            return null;
        }
        return file.getParent();
    }

    public static boolean childOf(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            String cleanPath = cleanPath(str);
            String cleanPath2 = cleanPath(str2);
            StringBuilder sb = new StringBuilder();
            sb.append(cleanPath2);
            sb.append(File.separator);
            if (cleanPath.startsWith(sb.toString())) {
                return true;
            }
        }
        return false;
    }

    public static int childCount(String str) {
        File[] listFiles;
        if (!exists(str) || (listFiles = new File(str).listFiles()) == null || listFiles.length == 0) {
            return 0;
        }
        return listFiles.length;
    }

    public static String cleanPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return new File(str).getCanonicalPath();
        } catch (Exception unused) {
            return str;
        }
    }

    public static long size(String str) {
        if (str == null) {
            return 0;
        }
        return size(new File(str));
    }

    public static long size(File file) {
        long j = 0;
        if (!exists(file)) {
            return 0;
        }
        if (isFile(file)) {
            return file.length();
        }
        File[] listFiles = file.listFiles();
        if (!(listFiles == null || listFiles.length == 0)) {
            for (File size : listFiles) {
                j += size(size);
            }
        }
        return j;
    }

    public static boolean copy(String str, String str2) {
        return copy(str, str2, false);
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x0061 */
    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean copy(java.lang.String r4, java.lang.String r5, boolean r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L_0x0067
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x000e
            goto L_0x0067
        L_0x000e:
            boolean r0 = r4.equals(r5)
            r2 = 1
            if (r0 == 0) goto L_0x0016
            return r2
        L_0x0016:
            boolean r0 = exists((java.lang.String) r4)
            if (r0 == 0) goto L_0x0067
            boolean r0 = isFile((java.lang.String) r4)
            if (r0 != 0) goto L_0x0023
            goto L_0x0067
        L_0x0023:
            boolean r0 = exists((java.lang.String) r5)
            if (r0 == 0) goto L_0x002f
            if (r6 != 0) goto L_0x002c
            return r1
        L_0x002c:
            delete((java.lang.String) r5)
        L_0x002f:
            boolean r6 = create(r5)
            if (r6 != 0) goto L_0x0036
            return r1
        L_0x0036:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0067 }
            r6.<init>(r4)     // Catch:{ Exception -> 0x0067 }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0067 }
            r4.<init>(r5)     // Catch:{ Exception -> 0x0067 }
            r5 = 16384(0x4000, float:2.2959E-41)
            byte[] r5 = new byte[r5]     // Catch:{ Exception -> 0x0061, all -> 0x0059 }
        L_0x0044:
            int r0 = r6.read(r5)     // Catch:{ Exception -> 0x0061, all -> 0x0059 }
            r3 = -1
            if (r0 == r3) goto L_0x004f
            r4.write(r5, r1, r0)     // Catch:{ Exception -> 0x0061, all -> 0x0059 }
            goto L_0x0044
        L_0x004f:
            r4.flush()     // Catch:{ Exception -> 0x0061, all -> 0x0059 }
            r6.close()     // Catch:{ Exception -> 0x0058 }
            r4.close()     // Catch:{ Exception -> 0x0058 }
        L_0x0058:
            return r2
        L_0x0059:
            r5 = move-exception
            r6.close()     // Catch:{ Exception -> 0x0060 }
            r4.close()     // Catch:{ Exception -> 0x0060 }
        L_0x0060:
            throw r5
        L_0x0061:
            r6.close()     // Catch:{  }
            r4.close()     // Catch:{  }
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.config.util.FileUtil.copy(java.lang.String, java.lang.String, boolean):boolean");
    }

    public static String fileName(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new File(cleanPath(str)).getName();
    }

    public static String parentPath(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        cleanPath(str);
        File file = new File(str);
        if (file.getParent() == null) {
            return "";
        }
        return file.getParent();
    }

    public static String getExtension(File file) {
        if (file == null) {
            return null;
        }
        return getExtension(file.getName());
    }

    public static String getExtension(String str) {
        int lastIndexOf;
        if (!TextUtils.isEmpty(str) && (lastIndexOf = str.lastIndexOf(46)) >= 0 && lastIndexOf < str.length() - 1) {
            return str.substring(lastIndexOf + 1);
        }
        return "";
    }

    public static String getMimeType(File file) {
        if (file == null) {
            return "*/*";
        }
        return getMimeType(file.getName());
    }

    public static String getMimeType(String str) {
        if (TextUtils.isEmpty(str)) {
            return "*/*";
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(getExtension(str));
        if (TextUtils.isEmpty(mimeTypeFromExtension)) {
            return "*/*";
        }
        return mimeTypeFromExtension;
    }

    public static final boolean isFile(String str) {
        if (!exists(str)) {
            return false;
        }
        return isFile(new File(str));
    }

    public static final boolean isFile(File file) {
        if (file == null) {
            return false;
        }
        return file.isFile();
    }

    public static final boolean isFolder(String str) {
        if (!exists(str)) {
            return false;
        }
        return new File(str).isDirectory();
    }

    public static final String getFileName(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("/");
        return (lastIndexOf <= 0 || lastIndexOf >= str.length() + -1) ? str : str.substring(lastIndexOf + 1, str.length());
    }

    public static final String getFileStem(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf(".");
        return lastIndexOf > 0 ? str.substring(0, lastIndexOf) : "";
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getFileSHA1(java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r5 = r0.exists()
            if (r5 == 0) goto L_0x0054
            boolean r5 = r0.isDirectory()
            if (r5 == 0) goto L_0x001a
            goto L_0x0054
        L_0x001a:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0020 }
            r5.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0020 }
            goto L_0x0021
        L_0x0020:
            r5 = r1
        L_0x0021:
            if (r5 != 0) goto L_0x0024
            return r1
        L_0x0024:
            java.lang.String r0 = "SHA-1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ Exception -> 0x0045 }
            r2 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x0045 }
        L_0x002e:
            int r3 = r5.read(r2)     // Catch:{ Exception -> 0x0045 }
            if (r3 <= 0) goto L_0x0039
            r4 = 0
            r0.update(r2, r4, r3)     // Catch:{ Exception -> 0x0045 }
            goto L_0x002e
        L_0x0039:
            r5.close()     // Catch:{ Exception -> 0x0045 }
            byte[] r0 = r0.digest()     // Catch:{ Exception -> 0x0045 }
            java.lang.String r1 = com.alipay.zoloz.config.util.SecurityUtil.bytes2Hex(r0)     // Catch:{ Exception -> 0x0045 }
            goto L_0x004a
        L_0x0045:
            r5.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x004a
        L_0x0049:
        L_0x004a:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x0054
            java.lang.String r1 = r1.trim()
        L_0x0054:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.config.util.FileUtil.getFileSHA1(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0045 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getFileMD5(java.lang.String r5) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r5 = r0.exists()
            if (r5 == 0) goto L_0x0054
            boolean r5 = r0.isDirectory()
            if (r5 == 0) goto L_0x001a
            goto L_0x0054
        L_0x001a:
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ FileNotFoundException -> 0x0020 }
            r5.<init>(r0)     // Catch:{ FileNotFoundException -> 0x0020 }
            goto L_0x0021
        L_0x0020:
            r5 = r1
        L_0x0021:
            if (r5 != 0) goto L_0x0024
            return r1
        L_0x0024:
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch:{ Exception -> 0x0045 }
            r2 = 16384(0x4000, float:2.2959E-41)
            byte[] r2 = new byte[r2]     // Catch:{ Exception -> 0x0045 }
        L_0x002e:
            int r3 = r5.read(r2)     // Catch:{ Exception -> 0x0045 }
            if (r3 <= 0) goto L_0x0039
            r4 = 0
            r0.update(r2, r4, r3)     // Catch:{ Exception -> 0x0045 }
            goto L_0x002e
        L_0x0039:
            r5.close()     // Catch:{ Exception -> 0x0045 }
            byte[] r0 = r0.digest()     // Catch:{ Exception -> 0x0045 }
            java.lang.String r1 = com.alipay.zoloz.config.util.SecurityUtil.bytes2Hex(r0)     // Catch:{ Exception -> 0x0045 }
            goto L_0x004a
        L_0x0045:
            r5.close()     // Catch:{ IOException -> 0x0049 }
            goto L_0x004a
        L_0x0049:
        L_0x004a:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 != 0) goto L_0x0054
            java.lang.String r1 = r1.trim()
        L_0x0054:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.config.util.FileUtil.getFileMD5(java.lang.String):java.lang.String");
    }

    public static String getText(String str) {
        if (!exists(str)) {
            return null;
        }
        File file = new File(str);
        int length = (int) file.length();
        if (length > 20480) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            byte[] bArr = new byte[1024];
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, 1024);
                if (-1 != read) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    bufferedInputStream.close();
                    byteArrayOutputStream.close();
                    return byteArrayOutputStream.toString();
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
