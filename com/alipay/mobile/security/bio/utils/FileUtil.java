package com.alipay.mobile.security.bio.utils;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.os.Process;
import android.telephony.PhoneNumberUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;
import o.upFrom;

public class FileUtil {
    public static final int STREAM_BUFFER_SIZE = 8192;
    private static int length = 0;
    private static int setMax = 1;

    public static synchronized byte[] toByteArray(String str) throws IOException {
        byte[] byteArray;
        synchronized (FileUtil.class) {
            File file = new File(str);
            if (file.exists()) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) file.length());
                BufferedInputStream bufferedInputStream = null;
                try {
                    BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int read = bufferedInputStream2.read(bArr, 0, 1024);
                            if (-1 != read) {
                                byteArrayOutputStream.write(bArr, 0, read);
                            } else {
                                byteArray = byteArrayOutputStream.toByteArray();
                                InputStreamUtils.close(bufferedInputStream2);
                                OutputStreamUtils.close(byteArrayOutputStream);
                            }
                        }
                    } catch (IOException e) {
                        e = e;
                        bufferedInputStream = bufferedInputStream2;
                        try {
                            throw e;
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedInputStream = bufferedInputStream2;
                        InputStreamUtils.close(bufferedInputStream);
                        OutputStreamUtils.close(byteArrayOutputStream);
                        throw th;
                    }
                } catch (IOException e2) {
                    e = e2;
                    throw e;
                }
            } else {
                throw new FileNotFoundException(str);
            }
        }
        return byteArray;
    }

    public static byte[] bitmapToByteArray(Bitmap bitmap, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
        try {
            byteArrayOutputStream.flush();
            byteArrayOutputStream.close();
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void bitmap2File(Bitmap bitmap, File file) {
        if (file.exists()) {
            file.delete();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            bitmap.compress(Bitmap.CompressFormat.PNG, 90, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException | IOException unused) {
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r6v0 */
    /* JADX WARNING: type inference failed for: r6v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r6v3 */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r9 = r8.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0062, code lost:
        if (r9 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        throw r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0066, code lost:
        r9 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b8, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r9 = r8.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00bd, code lost:
        if (r9 != null) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bf, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00c0, code lost:
        throw r8;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0019, B:8:0x001d, B:25:0x006e] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] getAssetsData(android.content.Context r8, java.lang.String r9) {
        /*
            int r0 = setMax
            int r0 = r0 + 95
            int r1 = r0 % 128
            length = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            java.lang.String r4 = "getMin"
            r5 = 56348(0xdc1c, float:7.896E-41)
            r6 = 0
            if (r0 == r2) goto L_0x006a
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x005d }
            r0[r2] = r9     // Catch:{ all -> 0x005d }
            r0[r3] = r8     // Catch:{ all -> 0x005d }
            int r8 = android.os.Process.myTid()     // Catch:{ all -> 0x005d }
            int r8 = r8 >> 22
            int r8 = r8 + 19
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            int r7 = android.graphics.Color.rgb(r3, r3, r3)     // Catch:{ all -> 0x005d }
            int r9 = r9 - r7
            java.lang.String r7 = ""
            int r7 = android.text.TextUtils.getOffsetAfter(r7, r3)     // Catch:{ all -> 0x005d }
            int r5 = r5 - r7
            char r5 = (char) r5     // Catch:{ all -> 0x005d }
            java.lang.Object r8 = o.upFrom.setMax(r8, r9, r5)     // Catch:{ all -> 0x005d }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x005d }
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch:{ all -> 0x005d }
            java.lang.Class<android.content.res.AssetManager> r5 = android.content.res.AssetManager.class
            r9[r3] = r5     // Catch:{ all -> 0x005d }
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r9[r2] = r3     // Catch:{ all -> 0x005d }
            java.lang.reflect.Method r8 = r8.getMethod(r4, r9)     // Catch:{ all -> 0x005d }
            java.lang.Object r8 = r8.invoke(r6, r0)     // Catch:{ all -> 0x005d }
            java.io.InputStream r8 = (java.io.InputStream) r8     // Catch:{ all -> 0x005d }
            byte[] r9 = com.alipay.mobile.security.bio.utils.InputStreamUtils.input2byte(r8)     // Catch:{ IOException -> 0x00c5, all -> 0x00b5 }
            com.alipay.mobile.security.bio.utils.InputStreamUtils.close(r8)
        L_0x005b:
            r6 = r9
            goto L_0x00a9
        L_0x005d:
            r8 = move-exception
            java.lang.Throwable r9 = r8.getCause()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            if (r9 == 0) goto L_0x0065
            throw r9     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
        L_0x0065:
            throw r8     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
        L_0x0066:
            r9 = move-exception
            goto L_0x00c1
        L_0x0068:
            r8 = r6
            goto L_0x00c5
        L_0x006a:
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x00b8 }
            r0[r2] = r9     // Catch:{ all -> 0x00b8 }
            r0[r3] = r8     // Catch:{ all -> 0x00b8 }
            int r8 = android.view.View.combineMeasuredStates(r3, r3)     // Catch:{ all -> 0x00b8 }
            int r8 = r8 + 19
            int r9 = android.view.View.combineMeasuredStates(r3, r3)     // Catch:{ all -> 0x00b8 }
            int r7 = android.graphics.Color.red(r3)     // Catch:{ all -> 0x00b8 }
            int r7 = r7 + r5
            char r5 = (char) r7     // Catch:{ all -> 0x00b8 }
            java.lang.Object r8 = o.upFrom.setMax(r8, r9, r5)     // Catch:{ all -> 0x00b8 }
            java.lang.Class r8 = (java.lang.Class) r8     // Catch:{ all -> 0x00b8 }
            java.lang.Class[] r9 = new java.lang.Class[r1]     // Catch:{ all -> 0x00b8 }
            java.lang.Class<android.content.res.AssetManager> r5 = android.content.res.AssetManager.class
            r9[r3] = r5     // Catch:{ all -> 0x00b8 }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r9[r2] = r5     // Catch:{ all -> 0x00b8 }
            java.lang.reflect.Method r8 = r8.getMethod(r4, r9)     // Catch:{ all -> 0x00b8 }
            java.lang.Object r8 = r8.invoke(r6, r0)     // Catch:{ all -> 0x00b8 }
            java.io.InputStream r8 = (java.io.InputStream) r8     // Catch:{ all -> 0x00b8 }
            byte[] r9 = com.alipay.mobile.security.bio.utils.InputStreamUtils.input2byte(r8)     // Catch:{ IOException -> 0x00c5, all -> 0x00b5 }
            com.alipay.mobile.security.bio.utils.InputStreamUtils.close(r8)
            r8 = 77
            int r8 = r8 / r3
            goto L_0x005b
        L_0x00a9:
            int r8 = length
            int r8 = r8 + 59
            int r9 = r8 % 128
            setMax = r9
            int r8 = r8 % r1
            goto L_0x00c8
        L_0x00b3:
            r8 = move-exception
            throw r8
        L_0x00b5:
            r9 = move-exception
            r6 = r8
            goto L_0x00c1
        L_0x00b8:
            r8 = move-exception
            java.lang.Throwable r9 = r8.getCause()     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
            if (r9 == 0) goto L_0x00c0
            throw r9     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
        L_0x00c0:
            throw r8     // Catch:{ IOException -> 0x0068, all -> 0x0066 }
        L_0x00c1:
            com.alipay.mobile.security.bio.utils.InputStreamUtils.close(r6)
            throw r9
        L_0x00c5:
            com.alipay.mobile.security.bio.utils.InputStreamUtils.close(r8)
        L_0x00c8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.utils.FileUtil.getAssetsData(android.content.Context, java.lang.String):byte[]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r10 = r9.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r10 != null) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        throw r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        r10 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006b, code lost:
        r9 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c0, code lost:
        r9 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        r10 = r9.getCause();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c5, code lost:
        if (r10 != null) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c7, code lost:
        throw r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c8, code lost:
        throw r9;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:6:0x0016, B:8:0x001a, B:27:0x0071] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] getAssetsData(android.content.res.Resources r9, java.lang.String r10) {
        /*
            int r0 = length
            int r0 = r0 + 57
            int r1 = r0 % 128
            setMax = r1
            r1 = 2
            int r0 = r0 % r1
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L_0x0010
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            java.lang.String r4 = "getMin"
            r5 = 0
            if (r0 == r3) goto L_0x006d
            android.content.res.AssetManager r9 = r9.getAssets()     // Catch:{ IOException -> 0x006b, all -> 0x0069 }
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x0060 }
            r0[r3] = r10     // Catch:{ all -> 0x0060 }
            r0[r2] = r9     // Catch:{ all -> 0x0060 }
            int r9 = android.view.ViewConfiguration.getJumpTapTimeout()     // Catch:{ all -> 0x0060 }
            int r9 = r9 >> 16
            int r9 = r9 + 19
            int r10 = android.view.ViewConfiguration.getKeyRepeatTimeout()     // Catch:{ all -> 0x0060 }
            int r10 = r10 >> 16
            r6 = 56348(0xdc1c, float:7.896E-41)
            float r7 = android.media.AudioTrack.getMinVolume()     // Catch:{ all -> 0x0060 }
            r8 = 0
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            int r6 = r6 - r7
            char r6 = (char) r6     // Catch:{ all -> 0x0060 }
            java.lang.Object r9 = o.upFrom.setMax(r9, r10, r6)     // Catch:{ all -> 0x0060 }
            java.lang.Class r9 = (java.lang.Class) r9     // Catch:{ all -> 0x0060 }
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch:{ all -> 0x0060 }
            java.lang.Class<android.content.res.AssetManager> r6 = android.content.res.AssetManager.class
            r10[r2] = r6     // Catch:{ all -> 0x0060 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r10[r3] = r2     // Catch:{ all -> 0x0060 }
            java.lang.reflect.Method r9 = r9.getMethod(r4, r10)     // Catch:{ all -> 0x0060 }
            java.lang.Object r9 = r9.invoke(r5, r0)     // Catch:{ all -> 0x0060 }
            java.io.InputStream r9 = (java.io.InputStream) r9     // Catch:{ all -> 0x0060 }
            byte[] r10 = com.alipay.mobile.security.bio.utils.InputStreamUtils.input2byte(r9)     // Catch:{ IOException -> 0x00cd, all -> 0x005d }
            com.alipay.mobile.security.bio.utils.InputStreamUtils.close(r9)
        L_0x005b:
            r5 = r10
            goto L_0x00b2
        L_0x005d:
            r10 = move-exception
            r5 = r9
            goto L_0x00c9
        L_0x0060:
            r9 = move-exception
            java.lang.Throwable r10 = r9.getCause()     // Catch:{ IOException -> 0x006b, all -> 0x0069 }
            if (r10 == 0) goto L_0x0068
            throw r10     // Catch:{ IOException -> 0x006b, all -> 0x0069 }
        L_0x0068:
            throw r9     // Catch:{ IOException -> 0x006b, all -> 0x0069 }
        L_0x0069:
            r10 = move-exception
            goto L_0x00c9
        L_0x006b:
            r9 = r5
            goto L_0x00cd
        L_0x006d:
            android.content.res.AssetManager r9 = r9.getAssets()     // Catch:{ IOException -> 0x006b, all -> 0x0069 }
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x00c0 }
            r0[r3] = r10     // Catch:{ all -> 0x00c0 }
            r0[r2] = r9     // Catch:{ all -> 0x00c0 }
            int r9 = android.view.ViewConfiguration.getFadingEdgeLength()     // Catch:{ all -> 0x00c0 }
            int r9 = r9 >> 16
            int r9 = r9 + 19
            r6 = 0
            int r10 = android.widget.ExpandableListView.getPackedPositionChild(r6)     // Catch:{ all -> 0x00c0 }
            int r10 = r10 + r3
            r6 = 56349(0xdc1d, float:7.8962E-41)
            int r7 = android.graphics.ImageFormat.getBitsPerPixel(r2)     // Catch:{ all -> 0x00c0 }
            int r7 = r7 + r6
            char r6 = (char) r7     // Catch:{ all -> 0x00c0 }
            java.lang.Object r9 = o.upFrom.setMax(r9, r10, r6)     // Catch:{ all -> 0x00c0 }
            java.lang.Class r9 = (java.lang.Class) r9     // Catch:{ all -> 0x00c0 }
            java.lang.Class[] r10 = new java.lang.Class[r1]     // Catch:{ all -> 0x00c0 }
            java.lang.Class<android.content.res.AssetManager> r6 = android.content.res.AssetManager.class
            r10[r2] = r6     // Catch:{ all -> 0x00c0 }
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r10[r3] = r2     // Catch:{ all -> 0x00c0 }
            java.lang.reflect.Method r9 = r9.getMethod(r4, r10)     // Catch:{ all -> 0x00c0 }
            java.lang.Object r9 = r9.invoke(r5, r0)     // Catch:{ all -> 0x00c0 }
            java.io.InputStream r9 = (java.io.InputStream) r9     // Catch:{ all -> 0x00c0 }
            byte[] r10 = com.alipay.mobile.security.bio.utils.InputStreamUtils.input2byte(r9)     // Catch:{ IOException -> 0x00cd, all -> 0x005d }
            com.alipay.mobile.security.bio.utils.InputStreamUtils.close(r9)     // Catch:{ Exception -> 0x00be }
            int r9 = r5.length     // Catch:{ all -> 0x00bc }
            goto L_0x005b
        L_0x00b2:
            int r9 = setMax
            int r9 = r9 + 21
            int r10 = r9 % 128
            length = r10
            int r9 = r9 % r1
            goto L_0x00d0
        L_0x00bc:
            r9 = move-exception
            throw r9
        L_0x00be:
            r9 = move-exception
            throw r9
        L_0x00c0:
            r9 = move-exception
            java.lang.Throwable r10 = r9.getCause()     // Catch:{ IOException -> 0x006b, all -> 0x0069 }
            if (r10 == 0) goto L_0x00c8
            throw r10     // Catch:{ IOException -> 0x006b, all -> 0x0069 }
        L_0x00c8:
            throw r9     // Catch:{ IOException -> 0x006b, all -> 0x0069 }
        L_0x00c9:
            com.alipay.mobile.security.bio.utils.InputStreamUtils.close(r5)
            throw r10
        L_0x00cd:
            com.alipay.mobile.security.bio.utils.InputStreamUtils.close(r9)
        L_0x00d0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.utils.FileUtil.getAssetsData(android.content.res.Resources, java.lang.String):byte[]");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: byte[]} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] getRawData(android.content.Context r1, int r2) {
        /*
            r0 = 0
            android.content.res.Resources r1 = r1.getResources()     // Catch:{ IOException -> 0x0016, all -> 0x0011 }
            java.io.InputStream r1 = r1.openRawResource(r2)     // Catch:{ IOException -> 0x0016, all -> 0x0011 }
            byte[] r0 = com.alipay.mobile.security.bio.utils.InputStreamUtils.input2byte(r1)     // Catch:{ IOException -> 0x0017, all -> 0x000e }
            goto L_0x0017
        L_0x000e:
            r2 = move-exception
            r0 = r1
            goto L_0x0012
        L_0x0011:
            r2 = move-exception
        L_0x0012:
            com.alipay.mobile.security.bio.utils.InputStreamUtils.close(r0)
            throw r2
        L_0x0016:
            r1 = r0
        L_0x0017:
            com.alipay.mobile.security.bio.utils.InputStreamUtils.close(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.utils.FileUtil.getRawData(android.content.Context, int):byte[]");
    }

    public static synchronized boolean save(File file, byte[] bArr) {
        boolean z;
        FileOutputStream fileOutputStream;
        BufferedOutputStream bufferedOutputStream;
        synchronized (FileUtil.class) {
            z = false;
            if (!(file == null || bArr == null)) {
                if (file.exists()) {
                    file.delete();
                } else {
                    try {
                        file.createNewFile();
                    } catch (IOException unused) {
                    }
                }
                BufferedOutputStream bufferedOutputStream2 = null;
                try {
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                    } catch (IOException unused2) {
                        OutputStreamUtils.close(bufferedOutputStream2);
                        OutputStreamUtils.close(fileOutputStream);
                        return z;
                    } catch (Throwable th) {
                        th = th;
                        OutputStreamUtils.close(bufferedOutputStream2);
                        OutputStreamUtils.close(fileOutputStream);
                        throw th;
                    }
                    try {
                        bufferedOutputStream.write(bArr);
                        bufferedOutputStream.flush();
                        z = true;
                        OutputStreamUtils.close(bufferedOutputStream);
                    } catch (IOException unused3) {
                        bufferedOutputStream2 = bufferedOutputStream;
                        OutputStreamUtils.close(bufferedOutputStream2);
                        OutputStreamUtils.close(fileOutputStream);
                        return z;
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream2 = bufferedOutputStream;
                        OutputStreamUtils.close(bufferedOutputStream2);
                        OutputStreamUtils.close(fileOutputStream);
                        throw th;
                    }
                } catch (IOException unused4) {
                    fileOutputStream = null;
                    OutputStreamUtils.close(bufferedOutputStream2);
                    OutputStreamUtils.close(fileOutputStream);
                    return z;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                    OutputStreamUtils.close(bufferedOutputStream2);
                    OutputStreamUtils.close(fileOutputStream);
                    throw th;
                }
                OutputStreamUtils.close(fileOutputStream);
            }
        }
        return z;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:24|25|(0)|32|33) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:32:0x0043 */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0040 A[SYNTHETIC, Splitter:B:30:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0046 A[SYNTHETIC, Splitter:B:36:0x0046] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void saveContent(java.io.File r5, java.lang.String r6, boolean r7) {
        /*
            java.lang.Class<com.alipay.mobile.security.bio.utils.FileUtil> r0 = com.alipay.mobile.security.bio.utils.FileUtil.class
            monitor-enter(r0)
            if (r5 != 0) goto L_0x000e
            if (r6 == 0) goto L_0x0008
            goto L_0x000e
        L_0x0008:
            com.alipay.mobile.security.bio.exception.BioIllegalArgumentException r5 = new com.alipay.mobile.security.bio.exception.BioIllegalArgumentException     // Catch:{ all -> 0x004e }
            r5.<init>()     // Catch:{ all -> 0x004e }
            throw r5     // Catch:{ all -> 0x004e }
        L_0x000e:
            boolean r1 = r5.exists()     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x001e
            java.io.File r1 = r5.getParentFile()     // Catch:{ IOException -> 0x001e }
            r1.mkdirs()     // Catch:{ IOException -> 0x001e }
            r5.createNewFile()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            r1 = 0
            java.io.BufferedWriter r2 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            java.io.OutputStreamWriter r3 = new java.io.OutputStreamWriter     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            r4.<init>(r5, r7)     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            r3.<init>(r4)     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0044, all -> 0x003d }
            r2.write(r6)     // Catch:{ Exception -> 0x003b, all -> 0x0038 }
            r2.close()     // Catch:{ IOException -> 0x0036 }
            monitor-exit(r0)
            return
        L_0x0036:
            monitor-exit(r0)
            return
        L_0x0038:
            r5 = move-exception
            r1 = r2
            goto L_0x003e
        L_0x003b:
            r1 = r2
            goto L_0x0044
        L_0x003d:
            r5 = move-exception
        L_0x003e:
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            throw r5     // Catch:{ all -> 0x004e }
        L_0x0044:
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ IOException -> 0x004a }
            goto L_0x004c
        L_0x004a:
            monitor-exit(r0)
            return
        L_0x004c:
            monitor-exit(r0)
            return
        L_0x004e:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.security.bio.utils.FileUtil.saveContent(java.io.File, java.lang.String, boolean):void");
    }

    public static void recursionDeleteFile(File file) {
        if (file != null) {
            if (file.isFile()) {
                file.delete();
            } else if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null || listFiles.length == 0) {
                    file.delete();
                    return;
                }
                for (File recursionDeleteFile : listFiles) {
                    recursionDeleteFile(recursionDeleteFile);
                }
                file.delete();
            }
        }
    }

    public static void copyDirectory(String str, String str2) throws IOException {
        File file = new File(str);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (int i = 0; i < listFiles.length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(File.separator);
                sb.append(listFiles[i].getName());
                String obj = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str2);
                sb2.append(File.separator);
                sb2.append(listFiles[i].getName());
                String obj2 = sb2.toString();
                File file2 = new File(str2);
                if (!file2.exists()) {
                    file2.mkdir();
                }
                copyDirectory(obj, obj2);
            }
        } else if (file.isFile()) {
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream(str)));
            DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(str2)));
            byte[] bArr = new byte[524288];
            while (dataInputStream.read(bArr) != -1) {
                dataOutputStream.write(bArr);
            }
            dataInputStream.close();
            dataOutputStream.close();
        }
    }

    public static File extractAssets(Context context, String str) {
        AssetManager assets = context.getAssets();
        File file = new File(context.getFilesDir().getAbsolutePath());
        file.mkdirs();
        File file2 = new File(file, str);
        try {
            if (assets.list(str) != null) {
                Object[] objArr = new Object[2];
                objArr[1] = str;
                objArr[0] = assets;
                streamToStream((InputStream) ((Class) upFrom.setMax(18 - Process.getGidForName(""), View.getDefaultSize(0, 0), (char) (PhoneNumberUtils.toaFromString("") + 56219))).getMethod("getMin", new Class[]{AssetManager.class, String.class}).invoke((Object) null, objArr), new FileOutputStream(file2));
            }
            int i = length + 11;
            setMax = i % 128;
            int i2 = i % 2;
        } catch (IOException unused) {
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
        return file2;
    }

    public static boolean streamToStream(InputStream inputStream, OutputStream outputStream) {
        boolean z = false;
        try {
            byte[] bArr = new byte[8192];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            }
            outputStream.flush();
            z = true;
        } catch (Exception unused) {
        } catch (Throwable th) {
            closeSafely(outputStream);
            closeSafely(inputStream);
            throw th;
        }
        closeSafely(outputStream);
        closeSafely(inputStream);
        return z;
    }

    public static void closeSafely(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, java.lang.String] */
    public static String assetsToString(Context context, String str) {
        String str2;
        ? r0 = 0;
        try {
            Object assets = context.getAssets();
            Object[] objArr = new Object[2];
            boolean z = true;
            objArr[1] = str;
            objArr[0] = assets;
            Scanner useDelimiter = new Scanner((InputStream) ((Class) upFrom.setMax(19 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.resolveSize(0, 0), (char) (56347 - ExpandableListView.getPackedPositionChild(0)))).getMethod("getMin", new Class[]{AssetManager.class, String.class}).invoke(r0, objArr)).useDelimiter("\\A");
            if ((useDelimiter.hasNext() ? ' ' : '#') != '#') {
                int i = length + 1;
                setMax = i % 128;
                if (i % 2 != 0) {
                    z = false;
                }
                if (z) {
                    str2 = useDelimiter.next();
                    int length2 = r0.length;
                } else {
                    str2 = useDelimiter.next();
                }
            } else {
                str2 = "";
                int i2 = length + 61;
                setMax = i2 % 128;
                int i3 = i2 % 2;
            }
            return str2;
        } catch (IOException unused) {
            return r0;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
