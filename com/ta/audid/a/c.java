package com.ta.audid.a;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.fingerprint.FingerprintManager;
import android.location.LocationManager;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.ta.audid.g.i;
import com.ta.audid.g.m;
import com.ta.utdid2.a.a.e;
import id.dana.danah5.akulaku.AkuEventParamsKey;
import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.util.List;
import java.util.regex.Pattern;

public class c {
    /* renamed from: a  reason: collision with other method in class */
    public static String m1312a(Context context) {
        String str;
        String str2;
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                str2 = telephonyManager.getDeviceId();
            } else {
                str2 = "";
            }
            try {
                if (e.isBlank(str2)) {
                    return "";
                }
                return str2;
            } catch (Exception e) {
                Exception exc = e;
                str = str2;
                e = exc;
                m.i("", e.toString());
                return str;
            }
        } catch (Exception e2) {
            e = e2;
            str = "";
            m.i("", e.toString());
            return str;
        }
    }

    public static String b(Context context) {
        String str;
        String str2;
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                str2 = telephonyManager.getSubscriberId();
            } else {
                str2 = "";
            }
            try {
                if (e.isBlank(str2)) {
                    return "";
                }
                return str2;
            } catch (Exception e) {
                Exception exc = e;
                str = str2;
                e = exc;
                m.i("", e.toString());
                return str;
            }
        } catch (Exception e2) {
            e = e2;
            str = "";
            m.i("", e.toString());
            return str;
        }
    }

    public static String c(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return c();
        }
        return d(context);
    }

    private static String c() {
        String str;
        try {
            byte[] hardwareAddress = NetworkInterface.getByName("wlan0").getHardwareAddress();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < hardwareAddress.length; i++) {
                Object[] objArr = new Object[2];
                objArr[0] = Byte.valueOf(hardwareAddress[i]);
                if (i < hardwareAddress.length - 1) {
                    str = ":";
                } else {
                    str = "";
                }
                objArr[1] = str;
                sb.append(String.format("%02X%s", objArr));
            }
            return sb.toString();
        } catch (Exception e) {
            m.i("", e);
            return "";
        }
    }

    private static String d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            WifiInfo connectionInfo = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo();
            if (connectionInfo == null) {
                return "";
            }
            String macAddress = connectionInfo.getMacAddress();
            if (TextUtils.isEmpty(macAddress)) {
                return "";
            }
            return macAddress;
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String d() {
        try {
            BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
            if (defaultAdapter != null) {
                if (defaultAdapter.isEnabled()) {
                    String address = defaultAdapter.getAddress();
                    if (e.isBlank(address)) {
                        return "";
                    }
                    return address;
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    public static String e(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    public static String e() {
        return i.get("ro.serialno", "");
    }

    public static String f(Context context) {
        String str;
        try {
            str = ((TelephonyManager) context.getSystemService("phone")).getSimSerialNumber();
        } catch (Exception unused) {
            str = "";
        }
        if (e.isBlank(str)) {
            return "";
        }
        return str;
    }

    public static String f() {
        return com.ta.audid.g.c.g("/sys/block/mmcblk0/device/cid");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004a */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051 A[Catch:{ Exception -> 0x0054 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String g() {
        /*
            java.lang.String r0 = ""
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x004e }
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x004e }
            java.lang.String r3 = "cat /proc/cpuinfo | grep Serial"
            java.lang.Process r2 = r2.exec(r3)     // Catch:{ all -> 0x004e }
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ all -> 0x004e }
            r1.<init>(r2)     // Catch:{ all -> 0x004e }
            java.io.LineNumberReader r2 = new java.io.LineNumberReader     // Catch:{ all -> 0x004f }
            r2.<init>(r1)     // Catch:{ all -> 0x004f }
            r3 = 0
        L_0x001b:
            r4 = 100
            if (r3 >= r4) goto L_0x0047
            java.lang.String r4 = r2.readLine()     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x0042
            java.lang.String r5 = "Serial"
            int r5 = r4.indexOf(r5)     // Catch:{ all -> 0x0042 }
            if (r5 < 0) goto L_0x0042
            java.lang.String r5 = ":"
            int r5 = r4.indexOf(r5)     // Catch:{ all -> 0x0042 }
            int r5 = r5 + 1
            int r6 = r4.length()     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = r4.substring(r5, r6)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = r4.trim()     // Catch:{ all -> 0x0042 }
            goto L_0x0047
        L_0x0042:
            int r3 = r3 + 1
            int r3 = r3 + 1
            goto L_0x001b
        L_0x0047:
            r1.close()     // Catch:{ Exception -> 0x004a }
        L_0x004a:
            r2.close()     // Catch:{ Exception -> 0x0054 }
            goto L_0x0054
        L_0x004e:
            r1 = 0
        L_0x004f:
            if (r1 == 0) goto L_0x0054
            r1.close()     // Catch:{ Exception -> 0x0054 }
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.a.c.g():java.lang.String");
    }

    public static String g(Context context) {
        String str = null;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    str = telephonyManager.getLine1Number();
                }
            } catch (Exception unused) {
            }
        }
        return e.isBlank(str) ? "" : str;
    }

    public static String h() {
        try {
            return String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new FileFilter() {
                public final boolean accept(File file) {
                    return Pattern.matches("cpu[0-9]+", file.getName());
                }
            }).length);
        } catch (Exception unused) {
            return "1";
        }
    }

    public static String i() {
        return com.ta.audid.g.c.g("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
    }

    public static String j() {
        String g = com.ta.audid.g.c.g("/proc/meminfo");
        return g != null ? g.split("\\s+")[1] : "";
    }

    public static String h(Context context) {
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService(AkuEventParamsKey.KEY_ACTIVITY)).getMemoryInfo(memoryInfo);
            return String.valueOf(memoryInfo.availMem >> 10);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String i(Context context) {
        try {
            StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
            return String.valueOf(((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize()));
        } catch (Throwable unused) {
            return "";
        }
    }

    public static String j(Context context) {
        try {
            StringBuilder sb = new StringBuilder("");
            sb.append(context.getResources().getDisplayMetrics().densityDpi);
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String k(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toString(displayMetrics.widthPixels));
            sb.append("*");
            sb.append(Integer.toString(displayMetrics.heightPixels));
            return sb.toString();
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m1313a(Context context) {
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                return b(context);
            }
            return c(context);
        } catch (Exception unused) {
            return false;
        }
    }

    @TargetApi(24)
    /* renamed from: b  reason: collision with other method in class */
    private static boolean m1314b(Context context) {
        List<StorageVolume> storageVolumes = ((StorageManager) context.getSystemService("storage")).getStorageVolumes();
        if (storageVolumes == null) {
            return false;
        }
        for (StorageVolume next : storageVolumes) {
            if (next.isRemovable() && next.getState().equals("mounted")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c  reason: collision with other method in class */
    private static boolean m1315c(Context context) {
        StorageManager storageManager = (StorageManager) context.getSystemService("storage");
        try {
            Method method = StorageManager.class.getMethod("getVolumeList", new Class[0]);
            method.setAccessible(true);
            Object[] objArr = (Object[]) method.invoke(storageManager, new Object[0]);
            if (objArr != null) {
                for (Object obj : objArr) {
                    if (((Boolean) obj.getClass().getMethod("isRemovable", new Class[0]).invoke(obj, new Object[0])).booleanValue() && ((String) obj.getClass().getMethod("getState", new Class[0]).invoke(obj, new Object[0])).equals("mounted")) {
                        return true;
                    }
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean a(Context context, int i) {
        List<Sensor> sensorList = ((SensorManager) context.getSystemService("sensor")).getSensorList(i);
        return sensorList != null && sensorList.size() > 0;
    }

    /* renamed from: d  reason: collision with other method in class */
    public static boolean m1316d(Context context) {
        List<String> allProviders;
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager == null || (allProviders = locationManager.getAllProviders()) == null) {
            return false;
        }
        return allProviders.contains("gps");
    }

    @TargetApi(23)
    /* renamed from: e  reason: collision with other method in class */
    public static boolean m1317e(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                if (((FingerprintManager) context.getSystemService("fingerprint")).isHardwareDetected()) {
                    return true;
                }
            } catch (Throwable th) {
                m.d("", th);
            }
        }
        return false;
    }

    public static String l(Context context) {
        if (Build.VERSION.SDK_INT < 21) {
            return k();
        }
        int a2 = a(context);
        if (a2 > 0) {
            return "".concat(String.valueOf(a2));
        }
        return k();
    }

    @TargetApi(21)
    private static int a(Context context) {
        try {
            return ((BatteryManager) context.getSystemService("batterymanager")).getIntProperty(4);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x004a */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0051 A[Catch:{ Exception -> 0x0054 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String k() {
        /*
            java.lang.String r0 = ""
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x004e }
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch:{ all -> 0x004e }
            java.lang.String r3 = "cat /sys/class/power_supply/battery/uevent"
            java.lang.Process r2 = r2.exec(r3)     // Catch:{ all -> 0x004e }
            java.io.InputStream r2 = r2.getInputStream()     // Catch:{ all -> 0x004e }
            r1.<init>(r2)     // Catch:{ all -> 0x004e }
            java.io.LineNumberReader r2 = new java.io.LineNumberReader     // Catch:{ all -> 0x004f }
            r2.<init>(r1)     // Catch:{ all -> 0x004f }
            r3 = 0
        L_0x001b:
            r4 = 100
            if (r3 >= r4) goto L_0x0047
            java.lang.String r4 = r2.readLine()     // Catch:{ all -> 0x0042 }
            if (r4 == 0) goto L_0x0047
            java.lang.String r5 = "POWER_SUPPLY_CAPACITY"
            boolean r5 = r4.contains(r5)     // Catch:{ all -> 0x0042 }
            if (r5 == 0) goto L_0x0042
            java.lang.String r5 = "="
            int r5 = r4.indexOf(r5)     // Catch:{ all -> 0x0042 }
            int r5 = r5 + 1
            int r6 = r4.length()     // Catch:{ all -> 0x0042 }
            java.lang.String r4 = r4.substring(r5, r6)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = r4.trim()     // Catch:{ all -> 0x0042 }
            goto L_0x0047
        L_0x0042:
            int r3 = r3 + 1
            int r3 = r3 + 1
            goto L_0x001b
        L_0x0047:
            r1.close()     // Catch:{ Exception -> 0x004a }
        L_0x004a:
            r2.close()     // Catch:{ Exception -> 0x0054 }
            goto L_0x0054
        L_0x004e:
            r1 = 0
        L_0x004f:
            if (r1 == 0) goto L_0x0054
            r1.close()     // Catch:{ Exception -> 0x0054 }
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ta.audid.a.c.k():java.lang.String");
    }
}
