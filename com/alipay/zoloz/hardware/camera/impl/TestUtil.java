package com.alipay.zoloz.hardware.camera.impl;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.alipay.zoloz.config.ConfigCenter;
import com.alipay.zoloz.config.util.FileUtil;
import java.io.File;
import java.io.FileInputStream;

public class TestUtil {
    public static final String DATA_CAPTURE_MODE_COLLECT = "collect";
    public static final String DATA_CAPTURE_MODE_MOCK = "mock";
    public static String dataCaptureMode = null;
    private static int frameIndex = 0;
    public static String isRunOnTestKey = "zoloz.test.autoRun";
    public static String testModeKey = "zoloz.test.auto.mode";

    public static boolean isDebug(Context context) {
        try {
            if ((context.getPackageManager().getPackageInfo(context.getPackageName(), 0).applicationInfo.flags & 2) != 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
        }
    }

    public static boolean isRunTest() {
        Boolean bool = (Boolean) ConfigCenter.getInstance().getFrameworkValue(isRunOnTestKey);
        if (bool == null) {
            return false;
        }
        return bool.booleanValue();
    }

    public static boolean isCaptureMode() {
        if (!TextUtils.equals((String) ConfigCenter.getInstance().getFrameworkValue(testModeKey), "collect")) {
            return false;
        }
        dataCaptureMode = "collect";
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0080, code lost:
        if (r1 == null) goto L_0x0083;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005c */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d A[SYNTHETIC, Splitter:B:28:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074 A[SYNTHETIC, Splitter:B:32:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x007b A[SYNTHETIC, Splitter:B:39:0x007b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void saveFrame(byte[] r4) {
        /*
            java.io.File r0 = new java.io.File
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "smatch_test_"
            r2.<init>(r3)
            java.lang.String r3 = dataCaptureMode
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L_0x0022
            r0.mkdirs()
        L_0x0022:
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "camera_data"
            r2.<init>(r3)
            int r3 = frameIndex
            r2.append(r3)
            java.lang.String r3 = ".dat"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r0, r2)
            r0 = 0
            boolean r2 = r1.exists()     // Catch:{ Exception -> 0x0078, all -> 0x0069 }
            if (r2 == 0) goto L_0x0046
            r1.delete()     // Catch:{ Exception -> 0x0078, all -> 0x0069 }
        L_0x0046:
            r1.createNewFile()     // Catch:{ Exception -> 0x0078, all -> 0x0069 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x0078, all -> 0x0069 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x0078, all -> 0x0069 }
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x0066, all -> 0x0062 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x0066, all -> 0x0062 }
            r1.write(r4)     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
            r1.flush()     // Catch:{ Exception -> 0x0067, all -> 0x0060 }
            r2.close()     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            r1.close()     // Catch:{ Exception -> 0x0083 }
            goto L_0x0083
        L_0x0060:
            r4 = move-exception
            goto L_0x0064
        L_0x0062:
            r4 = move-exception
            r1 = r0
        L_0x0064:
            r0 = r2
            goto L_0x006b
        L_0x0066:
            r1 = r0
        L_0x0067:
            r0 = r2
            goto L_0x0079
        L_0x0069:
            r4 = move-exception
            r1 = r0
        L_0x006b:
            if (r0 == 0) goto L_0x0072
            r0.close()     // Catch:{ IOException -> 0x0071 }
            goto L_0x0072
        L_0x0071:
        L_0x0072:
            if (r1 == 0) goto L_0x0077
            r1.close()     // Catch:{ Exception -> 0x0077 }
        L_0x0077:
            throw r4
        L_0x0078:
            r1 = r0
        L_0x0079:
            if (r0 == 0) goto L_0x0080
            r0.close()     // Catch:{ IOException -> 0x007f }
            goto L_0x0080
        L_0x007f:
        L_0x0080:
            if (r1 == 0) goto L_0x0083
            goto L_0x005c
        L_0x0083:
            int r4 = frameIndex
            int r4 = r4 + 1
            frameIndex = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.zoloz.hardware.camera.impl.TestUtil.saveFrame(byte[]):void");
    }

    public static byte[] readFrame() {
        File file = new File(Environment.getExternalStorageDirectory(), "smatch_test");
        if (file.listFiles() == null) {
            return null;
        }
        if (frameIndex > file.listFiles().length - 1) {
            frameIndex = 0;
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        StringBuilder sb = new StringBuilder("smatch_test");
        sb.append(File.separator);
        sb.append("camera_data");
        sb.append(frameIndex);
        sb.append(".dat");
        byte[] readFile = readFile(new File(externalStorageDirectory, sb.toString()));
        if (readFile == null) {
            return null;
        }
        frameIndex++;
        return readFile;
    }

    private static byte[] readFile(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            return bArr;
        } catch (Exception unused) {
            return null;
        }
    }

    public static int getWidth() {
        return ((Integer) ConfigCenter.getInstance().getFrameworkValue("testWidth")).intValue();
    }

    public static int getHeight() {
        return ((Integer) ConfigCenter.getInstance().getFrameworkValue("testHeight")).intValue();
    }

    public static boolean isMockMode() {
        if (!TextUtils.equals((String) ConfigCenter.getInstance().getFrameworkValue(testModeKey), "mock")) {
            return false;
        }
        dataCaptureMode = "mock";
        return true;
    }

    public static void reset() {
        frameIndex = 0;
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        StringBuilder sb = new StringBuilder("smatch_test_");
        sb.append(dataCaptureMode);
        FileUtil.delete(new File(externalStorageDirectory, sb.toString()));
    }
}
