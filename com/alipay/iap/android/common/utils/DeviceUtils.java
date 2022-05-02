package com.alipay.iap.android.common.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.alipay.iap.android.common.log.LoggerWrapper;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;
import java.util.regex.Pattern;

public class DeviceUtils {
    private static final FileFilter CPU_FILTER = new FileFilter() {
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };
    public static final int DEVICEINFO_NO_INIT = -100;
    public static final int DEVICEINFO_UNKNOWN = -1;
    private static final String SHARED_PREFERENCE_DEVICE_ID = "SHARE_PREFERENCE_DEVICE_ID";
    private static final String SHARED_PREFERENCE_DEVICE_ID_UUID = "SHARED_PREFERENCE_DEVICE_ID_UUID";
    private static final String TAG = DeviceUtils.class.getSimpleName();
    private static String sClientKey;
    static int sCoreNum = -100;
    private static String sDeviceId;
    private static String sIMEI;
    private static String sTerminalIdentifier;

    private DeviceUtils() {
    }

    @Deprecated
    public static String getIMEI(Context context) {
        LoggerWrapper.e(TAG, "getIMEI interface is deprecated, please use the other interface instead, it will return null");
        return sIMEI;
    }

    public static synchronized String getDeviceId(Context context) {
        Method declaredMethod;
        synchronized (DeviceUtils.class) {
            if (!TextUtils.isEmpty(sDeviceId)) {
                String str = TAG;
                StringBuilder sb = new StringBuilder("Get device id from memory, device id: ");
                sb.append(sDeviceId);
                LoggerWrapper.d(str, sb.toString());
                String str2 = sDeviceId;
                return str2;
            }
            try {
                Class<?> cls = Class.forName("com.ut.device.UTDevice");
                if (!(cls == null || (declaredMethod = cls.getDeclaredMethod("getUtdid", new Class[]{Context.class})) == null)) {
                    sDeviceId = (String) declaredMethod.invoke((Object) null, new Object[]{context});
                }
            } catch (Exception e) {
                LoggerWrapper.e(TAG, e.toString());
            }
            if (!TextUtils.isEmpty(sDeviceId)) {
                String str3 = TAG;
                StringBuilder sb2 = new StringBuilder("Get device id from utdid, device id: ");
                sb2.append(sDeviceId);
                LoggerWrapper.d(str3, sb2.toString());
                String str4 = sDeviceId;
                return str4;
            }
            getDeviceIdFromSharedPreference(context);
            String str5 = sDeviceId;
            return str5;
        }
    }

    private static void getDeviceIdFromSharedPreference(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCE_DEVICE_ID, 0);
        String string = sharedPreferences.getString(SHARED_PREFERENCE_DEVICE_ID_UUID, "");
        if (TextUtils.isEmpty(string)) {
            sDeviceId = UUID.randomUUID().toString();
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(SHARED_PREFERENCE_DEVICE_ID_UUID, sDeviceId);
            edit.apply();
        } else {
            sDeviceId = string;
        }
        String str = TAG;
        StringBuilder sb = new StringBuilder("Get device id from uuid, device id: ");
        sb.append(sDeviceId);
        LoggerWrapper.d(str, sb.toString());
    }

    public static synchronized void setDeviceId(String str) {
        synchronized (DeviceUtils.class) {
            sDeviceId = str;
            String str2 = TAG;
            StringBuilder sb = new StringBuilder("Set device id , device id: ");
            sb.append(sDeviceId);
            LoggerWrapper.d(str2, sb.toString());
        }
    }

    public static String generateTerminalIdentifier(Context context, String str) {
        if (sTerminalIdentifier == null) {
            if (TextUtils.isEmpty(str) || context == null) {
                LoggerWrapper.e(TAG, "can not generate terminal identifier cause of the input deviceId is empty.");
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(context.getPackageName());
                String obj = sb.toString();
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    instance.reset();
                    byte[] digest = instance.digest(obj.getBytes());
                    StringBuilder sb2 = new StringBuilder("%0");
                    sb2.append(digest.length * 2);
                    sb2.append("X");
                    sTerminalIdentifier = String.format(sb2.toString(), new Object[]{new BigInteger(1, digest)});
                } catch (NoSuchAlgorithmException e) {
                    LoggerWrapper.e(TAG, "can not generate terminal identifier cause of sha-256 algorithm not found.", e);
                }
            }
        }
        return sTerminalIdentifier;
    }

    public static String generateClientKey(Context context, String str) {
        String str2;
        if (sClientKey == null) {
            if (TextUtils.isEmpty(str) || context == null) {
                LoggerWrapper.e(TAG, "can not generate terminal identifier cause of the input deviceId is empty.");
            } else {
                String packageName = context.getPackageName();
                if (PermissionUtils.hasPermission(context, "android.permission.READ_PHONE_STATE")) {
                    String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(deviceId);
                    sb.append(packageName);
                    str2 = sb.toString();
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(packageName);
                    str2 = sb2.toString();
                }
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    instance.reset();
                    byte[] digest = instance.digest(str2.getBytes());
                    StringBuilder sb3 = new StringBuilder("%0");
                    sb3.append(digest.length * 2);
                    sb3.append("X");
                    sClientKey = String.format(sb3.toString(), new Object[]{new BigInteger(1, digest)});
                } catch (NoSuchAlgorithmException e) {
                    LoggerWrapper.e(TAG, "can not generate terminal identifier cause of sha-256 algorithm not found.", e);
                }
            }
        }
        return sClientKey;
    }

    public static long getTotalMemory() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"), 8192);
            String trim = Pattern.compile("[^0-9]").matcher(bufferedReader.readLine()).replaceAll("").trim();
            bufferedReader.close();
            return Long.parseLong(trim);
        } catch (Exception e) {
            LoggerWrapper.w(TAG, (Throwable) e);
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024 A[SYNTHETIC, Splitter:B:15:0x0024] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x002b A[SYNTHETIC, Splitter:B:21:0x002b] */
    /* JADX WARNING: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int getCoresFromFileInfo(java.lang.String r2) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0028, all -> 0x0021 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            r0.<init>(r1)     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            r2.<init>(r0)     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            java.lang.String r2 = r2.readLine()     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            int r2 = getCoresFromFileString(r2)     // Catch:{ IOException -> 0x001f, all -> 0x001c }
            r1.close()     // Catch:{ all -> 0x001b }
        L_0x001b:
            return r2
        L_0x001c:
            r2 = move-exception
            r0 = r1
            goto L_0x0022
        L_0x001f:
            r0 = r1
            goto L_0x0029
        L_0x0021:
            r2 = move-exception
        L_0x0022:
            if (r0 == 0) goto L_0x0027
            r0.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            throw r2
        L_0x0028:
        L_0x0029:
            if (r0 == 0) goto L_0x002e
            r0.close()     // Catch:{ all -> 0x002e }
        L_0x002e:
            r2 = -1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.common.utils.DeviceUtils.getCoresFromFileInfo(java.lang.String):int");
    }

    private static int getCoresFromFileString(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return Integer.valueOf(str.substring(2)).intValue() + 1;
    }

    private static int getCoresFromCPUFileList() {
        return new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        sCoreNum = -1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0035 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int getNumberOfCPUCores() {
        /*
            int r0 = sCoreNum
            r1 = -1
            if (r0 != r1) goto L_0x0006
            return r0
        L_0x0006:
            r2 = -100
            if (r0 != r2) goto L_0x003c
            java.lang.Class<com.alipay.iap.android.common.utils.DeviceUtils> r0 = com.alipay.iap.android.common.utils.DeviceUtils.class
            monitor-enter(r0)
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0039 }
            r3 = 10
            if (r2 > r3) goto L_0x0018
            r1 = 1
            sCoreNum = r1     // Catch:{ all -> 0x0039 }
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            return r1
        L_0x0018:
            java.lang.String r2 = "/sys/devices/system/cpu/possible"
            int r2 = getCoresFromFileInfo(r2)     // Catch:{ all -> 0x0035 }
            sCoreNum = r2     // Catch:{ all -> 0x0035 }
            if (r2 != r1) goto L_0x002a
            java.lang.String r2 = "/sys/devices/system/cpu/present"
            int r2 = getCoresFromFileInfo(r2)     // Catch:{ all -> 0x0035 }
            sCoreNum = r2     // Catch:{ all -> 0x0035 }
        L_0x002a:
            int r2 = sCoreNum     // Catch:{ all -> 0x0035 }
            if (r2 != r1) goto L_0x0037
            int r2 = getCoresFromCPUFileList()     // Catch:{ all -> 0x0035 }
            sCoreNum = r2     // Catch:{ all -> 0x0035 }
            goto L_0x0037
        L_0x0035:
            sCoreNum = r1     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0039 }
            goto L_0x003c
        L_0x0039:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        L_0x003c:
            int r0 = sCoreNum
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.iap.android.common.utils.DeviceUtils.getNumberOfCPUCores():int");
    }
}
