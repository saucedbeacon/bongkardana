package com.alipay.zoloz.config.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Color;
import android.telephony.cdma.CdmaCellLocation;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import o.upFrom;

public class ConfigZipUtil {
    private static final String ATTACK_PREFIX_PATH = "../";
    private static final int BUFFER_SIZE = 8192;
    private static final String TAG = "ConfigZipUtil";
    public static final byte[] getMax = {121, -99, -81, 5, Ascii.RS, 19, Ascii.ESC, -33, 53, Ascii.NAK, Ascii.VT, -4, 53, -28, 55, Ascii.ESC, -56, 19, 9};
    private static int getMin = 0;
    private static int length = 1;
    public static final int setMin = 173;

    public static boolean unzip(String str, String str2) {
        if (!FileUtil.exists(str)) {
            ConfigLog.e(TAG, "zip path not exists!");
            return false;
        } else if (!FileUtil.mkdirs(str2, true)) {
            ConfigLog.e(TAG, "failed to create unzip folder.");
            return false;
        } else {
            try {
                ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(str));
                while (true) {
                    ZipEntry nextEntry = zipInputStream.getNextEntry();
                    if (nextEntry != null) {
                        String name = nextEntry.getName();
                        ConfigLog.d(TAG, "unzip entry ".concat(String.valueOf(name)));
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append("/");
                        sb.append(name);
                        String obj = sb.toString();
                        if (name.startsWith(ATTACK_PREFIX_PATH)) {
                            return false;
                        }
                        if (FileUtil.childOf(obj, str2)) {
                            if (nextEntry.isDirectory()) {
                                FileUtil.mkdirs(obj);
                            } else if (!FileUtil.create(obj, true)) {
                                ConfigLog.e(TAG, "failed to create file ".concat(String.valueOf(obj)));
                            } else {
                                FileOutputStream fileOutputStream = new FileOutputStream(obj);
                                byte[] bArr = new byte[8192];
                                while (true) {
                                    int read = zipInputStream.read(bArr);
                                    if (read == -1) {
                                        break;
                                    }
                                    fileOutputStream.write(bArr, 0, read);
                                }
                                fileOutputStream.close();
                                zipInputStream.closeEntry();
                            }
                        }
                    } else {
                        zipInputStream.close();
                        return true;
                    }
                }
            } catch (Exception e) {
                ConfigLog.e("unzip exception", e);
                return false;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005f, code lost:
        if (com.alipay.zoloz.config.util.FileUtil.mkdirs(r15, true) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        if (com.alipay.zoloz.config.util.FileUtil.mkdirs(r15, true) == false) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r2 = new java.util.zip.ZipInputStream(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        r13 = r2.getNextEntry();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x008b, code lost:
        if (r13 == null) goto L_0x0157;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        r6 = r13.getName();
        com.alipay.zoloz.config.util.ConfigLog.d(TAG, "unzip entry ".concat(java.lang.String.valueOf(r6)));
        r7 = new java.lang.StringBuilder();
        r7.append(r15);
        r7.append("/");
        r7.append(r6);
        r7 = r7.toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r9 = getMin + 93;
        length = r9 % 128;
        r9 = r9 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00da, code lost:
        if (((java.lang.Boolean) java.lang.String.class.getMethod("startsWith", new java.lang.Class[]{java.lang.String.class}).invoke(r6, new java.lang.Object[]{ATTACK_PREFIX_PATH})).booleanValue() == false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00dc, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e1, code lost:
        if (com.alipay.zoloz.config.util.FileUtil.childOf(r7, r15) == false) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e3, code lost:
        r6 = length + 59;
        getMin = r6 % 128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00ec, code lost:
        if ((r6 % 2) == 0) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ee, code lost:
        r6 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f0, code lost:
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f1, code lost:
        if (r6 == true) goto L_0x00ff;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        r13 = r13.isDirectory();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        super.hashCode();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00fa, code lost:
        if (r13 == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0103, code lost:
        if (r13.isDirectory() == false) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0105, code lost:
        com.alipay.zoloz.config.util.FileUtil.mkdirs(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0110, code lost:
        if (com.alipay.zoloz.config.util.FileUtil.create(r7, true) != false) goto L_0x0115;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0112, code lost:
        r13 = '*';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0115, code lost:
        r13 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0117, code lost:
        if (r13 == '*') goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0119, code lost:
        r13 = new java.io.FileOutputStream(r7);
        r6 = new byte[8192];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0122, code lost:
        r7 = r2.read(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0127, code lost:
        if (r7 == -1) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0129, code lost:
        r13.write(r6, 0, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x012d, code lost:
        r13.close();
        r2.closeEntry();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0135, code lost:
        r13 = getMin + 63;
        length = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        com.alipay.zoloz.config.util.ConfigLog.e(TAG, "failed to create file ".concat(java.lang.String.valueOf(r7)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x014d, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014e, code lost:
        r14 = r13.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0152, code lost:
        if (r14 != null) goto L_0x0154;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0154, code lost:
        throw r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0155, code lost:
        throw r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x015a, code lost:
        r13 = getMin + 1;
        length = r13 % 128;
        r13 = r13 % 2;
        r13 = getMin + 71;
        length = r13 % 128;
        r13 = r13 % 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x016b, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x016c, code lost:
        r13 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x016d, code lost:
        com.alipay.zoloz.config.util.ConfigLog.e("unzip exception", r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0172, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean unzip(android.content.Context r13, java.lang.String r14, java.lang.String r15) {
        /*
            r0 = 0
            android.content.res.Resources r13 = r13.getResources()     // Catch:{ IOException -> 0x017c }
            android.content.res.AssetManager r13 = r13.getAssets()     // Catch:{ IOException -> 0x017c }
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch:{ all -> 0x0173 }
            r3 = 1
            r2[r3] = r14     // Catch:{ all -> 0x0173 }
            r2[r0] = r13     // Catch:{ all -> 0x0173 }
            r13 = 0
            int r13 = android.widget.ExpandableListView.getPackedPositionType(r13)     // Catch:{ all -> 0x0173 }
            r14 = 19
            int r13 = 19 - r13
            int r4 = android.view.ViewConfiguration.getTouchSlop()     // Catch:{ all -> 0x0173 }
            int r4 = r4 >> 8
            r5 = 56348(0xdc1c, float:7.896E-41)
            int r6 = android.os.Process.myTid()     // Catch:{ all -> 0x0173 }
            int r6 = r6 >> 22
            int r5 = r5 - r6
            char r5 = (char) r5     // Catch:{ all -> 0x0173 }
            java.lang.Object r13 = o.upFrom.setMax(r13, r4, r5)     // Catch:{ all -> 0x0173 }
            java.lang.Class r13 = (java.lang.Class) r13     // Catch:{ all -> 0x0173 }
            java.lang.String r4 = "getMin"
            java.lang.Class[] r5 = new java.lang.Class[r1]     // Catch:{ all -> 0x0173 }
            java.lang.Class<android.content.res.AssetManager> r6 = android.content.res.AssetManager.class
            r5[r0] = r6     // Catch:{ all -> 0x0173 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r3] = r6     // Catch:{ all -> 0x0173 }
            java.lang.reflect.Method r13 = r13.getMethod(r4, r5)     // Catch:{ all -> 0x0173 }
            r4 = 0
            java.lang.Object r13 = r13.invoke(r4, r2)     // Catch:{ all -> 0x0173 }
            java.io.InputStream r13 = (java.io.InputStream) r13     // Catch:{ all -> 0x0173 }
            int r2 = getMin
            int r2 = r2 + 121
            int r5 = r2 % 128
            length = r5
            int r2 = r2 % r1
            if (r2 != 0) goto L_0x0056
            r2 = 1
            goto L_0x0057
        L_0x0056:
            r2 = 0
        L_0x0057:
            java.lang.String r5 = "ConfigZipUtil"
            if (r2 == 0) goto L_0x0065
            boolean r2 = com.alipay.zoloz.config.util.FileUtil.mkdirs(r15, r3)     // Catch:{ Exception -> 0x0062 }
            if (r2 != 0) goto L_0x0082
            goto L_0x006b
        L_0x0062:
            r13 = move-exception
            goto L_0x0156
        L_0x0065:
            boolean r2 = com.alipay.zoloz.config.util.FileUtil.mkdirs(r15, r3)
            if (r2 != 0) goto L_0x0082
        L_0x006b:
            java.lang.String r13 = "failed to create unzip folder."
            com.alipay.zoloz.config.util.ConfigLog.e((java.lang.String) r5, (java.lang.String) r13)
            int r13 = getMin     // Catch:{ Exception -> 0x0062 }
            int r13 = r13 + 81
            int r14 = r13 % 128
            length = r14     // Catch:{ Exception -> 0x0080 }
            int r13 = r13 % r1
            if (r13 != 0) goto L_0x007f
            int r13 = r4.length     // Catch:{ all -> 0x007d }
            return r0
        L_0x007d:
            r13 = move-exception
            throw r13
        L_0x007f:
            return r0
        L_0x0080:
            r13 = move-exception
            throw r13
        L_0x0082:
            java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream     // Catch:{ Exception -> 0x016c }
            r2.<init>(r13)     // Catch:{ Exception -> 0x016c }
        L_0x0087:
            java.util.zip.ZipEntry r13 = r2.getNextEntry()     // Catch:{ Exception -> 0x016c }
            if (r13 == 0) goto L_0x0157
            java.lang.String r6 = r13.getName()     // Catch:{ Exception -> 0x016c }
            java.lang.String r7 = "unzip entry "
            java.lang.String r8 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x016c }
            java.lang.String r7 = r7.concat(r8)     // Catch:{ Exception -> 0x016c }
            com.alipay.zoloz.config.util.ConfigLog.d(r5, r7)     // Catch:{ Exception -> 0x016c }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x016c }
            r7.<init>()     // Catch:{ Exception -> 0x016c }
            r7.append(r15)     // Catch:{ Exception -> 0x016c }
            java.lang.String r8 = "/"
            r7.append(r8)     // Catch:{ Exception -> 0x016c }
            r7.append(r6)     // Catch:{ Exception -> 0x016c }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x016c }
            java.lang.String r8 = "../"
            int r9 = getMin     // Catch:{ Exception -> 0x0062 }
            int r9 = r9 + 93
            int r10 = r9 % 128
            length = r10     // Catch:{ Exception -> 0x0062 }
            int r9 = r9 % 2
            java.lang.Object[] r9 = new java.lang.Object[r3]     // Catch:{ all -> 0x014d }
            r9[r0] = r8     // Catch:{ all -> 0x014d }
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            java.lang.String r10 = "startsWith"
            java.lang.Class[] r11 = new java.lang.Class[r3]     // Catch:{ all -> 0x014d }
            java.lang.Class<java.lang.String> r12 = java.lang.String.class
            r11[r0] = r12     // Catch:{ all -> 0x014d }
            java.lang.reflect.Method r8 = r8.getMethod(r10, r11)     // Catch:{ all -> 0x014d }
            java.lang.Object r6 = r8.invoke(r6, r9)     // Catch:{ all -> 0x014d }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x014d }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x014d }
            if (r6 == 0) goto L_0x00dd
            return r0
        L_0x00dd:
            boolean r6 = com.alipay.zoloz.config.util.FileUtil.childOf(r7, r15)     // Catch:{ Exception -> 0x016c }
            if (r6 == 0) goto L_0x0087
            int r6 = length
            int r6 = r6 + 59
            int r8 = r6 % 128
            getMin = r8
            int r6 = r6 % r1
            if (r6 == 0) goto L_0x00f0
            r6 = 0
            goto L_0x00f1
        L_0x00f0:
            r6 = 1
        L_0x00f1:
            if (r6 == r3) goto L_0x00ff
            boolean r13 = r13.isDirectory()     // Catch:{ Exception -> 0x016c }
            super.hashCode()     // Catch:{ all -> 0x00fd }
            if (r13 == 0) goto L_0x010a
            goto L_0x0105
        L_0x00fd:
            r13 = move-exception
            throw r13
        L_0x00ff:
            boolean r13 = r13.isDirectory()     // Catch:{ Exception -> 0x016c }
            if (r13 == 0) goto L_0x010a
        L_0x0105:
            com.alipay.zoloz.config.util.FileUtil.mkdirs(r7)     // Catch:{ Exception -> 0x016c }
            goto L_0x0087
        L_0x010a:
            boolean r13 = com.alipay.zoloz.config.util.FileUtil.create(r7, r3)     // Catch:{ Exception -> 0x016c }
            r6 = 42
            if (r13 != 0) goto L_0x0115
            r13 = 42
            goto L_0x0117
        L_0x0115:
            r13 = 19
        L_0x0117:
            if (r13 == r6) goto L_0x0135
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x016c }
            r13.<init>(r7)     // Catch:{ Exception -> 0x016c }
            r6 = 8192(0x2000, float:1.14794E-41)
            byte[] r6 = new byte[r6]     // Catch:{ Exception -> 0x016c }
        L_0x0122:
            int r7 = r2.read(r6)     // Catch:{ Exception -> 0x016c }
            r8 = -1
            if (r7 == r8) goto L_0x012d
            r13.write(r6, r0, r7)     // Catch:{ Exception -> 0x016c }
            goto L_0x0122
        L_0x012d:
            r13.close()     // Catch:{ Exception -> 0x016c }
            r2.closeEntry()     // Catch:{ Exception -> 0x016c }
            goto L_0x0087
        L_0x0135:
            int r13 = getMin
            int r13 = r13 + 63
            int r6 = r13 % 128
            length = r6
            int r13 = r13 % r1
            java.lang.String r13 = "failed to create file "
            java.lang.String r6 = java.lang.String.valueOf(r7)     // Catch:{ Exception -> 0x016c }
            java.lang.String r13 = r13.concat(r6)     // Catch:{ Exception -> 0x016c }
            com.alipay.zoloz.config.util.ConfigLog.e((java.lang.String) r5, (java.lang.String) r13)     // Catch:{ Exception -> 0x016c }
            goto L_0x0087
        L_0x014d:
            r13 = move-exception
            java.lang.Throwable r14 = r13.getCause()     // Catch:{ Exception -> 0x016c }
            if (r14 == 0) goto L_0x0155
            throw r14     // Catch:{ Exception -> 0x016c }
        L_0x0155:
            throw r13     // Catch:{ Exception -> 0x016c }
        L_0x0156:
            throw r13
        L_0x0157:
            r2.close()     // Catch:{ Exception -> 0x016c }
            int r13 = getMin
            int r13 = r13 + r3
            int r14 = r13 % 128
            length = r14
            int r13 = r13 % r1
            int r13 = getMin
            int r13 = r13 + 71
            int r14 = r13 % 128
            length = r14
            int r13 = r13 % r1
            return r3
        L_0x016c:
            r13 = move-exception
            java.lang.String r14 = "unzip exception"
            com.alipay.zoloz.config.util.ConfigLog.e((java.lang.String) r14, (java.lang.Exception) r13)
            return r0
        L_0x0173:
            r13 = move-exception
            java.lang.Throwable r14 = r13.getCause()     // Catch:{ IOException -> 0x017c }
            if (r14 == 0) goto L_0x017b
            throw r14     // Catch:{ IOException -> 0x017c }
        L_0x017b:
            throw r13     // Catch:{ IOException -> 0x017c }
        L_0x017c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.config.util.ConfigZipUtil.unzip(android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    public static boolean copyAssetsToTarget(Context context, String str, String str2) {
        try {
            if (Arrays.asList(context.getAssets().list(FileUtil.parentPath(str))).contains(str)) {
                return copyAssetsFiles(context, str, str2);
            }
            return true;
        } catch (IOException unused) {
            return true;
        }
    }

    private static boolean copyAssetsFiles(Context context, String str, String str2) {
        String str3;
        try {
            String[] list = context.getAssets().list(str);
            if (list.length == 0) {
                copyFile(context, str, str2);
                return true;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(str);
            new File(sb.toString()).mkdirs();
            for (String append : list) {
                if (str.equals("")) {
                    str3 = "";
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append("/");
                    str3 = sb2.toString();
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str3);
                sb3.append(append);
                copyAssetsFiles(context, sb3.toString(), str2);
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    private static void copyFile(Context context, String str, String str2) throws IOException {
        InputStream inputStream;
        String str3;
        Throwable cause;
        try {
            int i = getMin + 121;
            length = i % 128;
            if ((i % 2 == 0 ? (char) 5 : 27) != 27) {
                AssetManager assets = context.getAssets();
                try {
                    Object[] objArr = new Object[2];
                    objArr[1] = str;
                    objArr[0] = assets;
                    inputStream = (InputStream) ((Class) upFrom.setMax(View.combineMeasuredStates(0, 0) + 19, ViewConfiguration.getScrollBarSize() >> 8, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 56348))).getMethod("getMin", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr);
                    int i2 = 67 / 0;
                } catch (Exception e) {
                    throw e;
                } catch (Throwable th) {
                    Throwable cause2 = th.getCause();
                    if (cause2 != null) {
                        throw cause2;
                    }
                    throw th;
                }
            } else {
                AssetManager assets2 = context.getAssets();
                try {
                    Object[] objArr2 = new Object[2];
                    objArr2[1] = str;
                    objArr2[0] = assets2;
                    inputStream = (InputStream) ((Class) upFrom.setMax(Color.blue(0) + 19, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (char) (KeyEvent.normalizeMetaState(0) + 56348))).getMethod("getMin", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr2);
                } catch (Throwable th2) {
                    Throwable cause3 = th2.getCause();
                    if (cause3 != null) {
                        throw cause3;
                    }
                    throw th2;
                }
            }
            int i3 = length + 117;
            getMin = i3 % 128;
            int i4 = i3 % 2;
            try {
                if (((Boolean) String.class.getMethod("endsWith", new Class[]{String.class}).invoke(str, new Object[]{".jpg"})).booleanValue()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    try {
                        try {
                            Object[] objArr3 = new Object[2];
                            objArr3[1] = Integer.valueOf(((Integer) String.class.getMethod("length", (Class[]) null).invoke(str, (Object[]) null)).intValue() - 4);
                            objArr3[0] = 0;
                            sb.append((String) String.class.getMethod("substring", new Class[]{Integer.TYPE, Integer.TYPE}).invoke(str, objArr3));
                            str3 = sb.toString();
                        } catch (Throwable th3) {
                            if (cause != null) {
                                throw cause;
                            }
                            throw th3;
                        }
                    } finally {
                        cause = th3.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(str);
                    str3 = sb2.toString();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(str3);
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read != -1) {
                        int i5 = length + 75;
                        getMin = i5 % 128;
                        if (i5 % 2 != 0) {
                        }
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        inputStream.close();
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return;
                    }
                }
            } finally {
                Throwable cause4 = th.getCause();
                if (cause4 != null) {
                    throw cause4;
                }
            }
        } catch (Exception e2) {
            throw e2;
        }
    }
}
