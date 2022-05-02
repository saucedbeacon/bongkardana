package com.alipay.alipaysecuritysdk.common.collector;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.alibaba.ariver.kernel.common.service.executor.RVScheduleType;
import com.alipay.alipaysecuritysdk.common.e.d;
import com.alipay.alipaysecuritysdk.common.e.e;
import id.dana.data.sendmoney.model.TransferUserInfoResult;
import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import id.dana.utils.permission.ManifestPermission;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static b f9272a = new b();
    private static long b = 0;

    private b() {
    }

    @SuppressLint({"HardwareIds", "MissingPermission"})
    public static String a(Context context) {
        String str = "";
        if (d.a(context, "android.permission.READ_PHONE_STATE")) {
            return str;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                str = telephonyManager.getDeviceId();
            }
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
        }
        return e.e(str);
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    public static String b(Context context) {
        String str = "";
        if (d.a(context, "android.permission.READ_PHONE_STATE")) {
            return str;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                str = telephonyManager.getSubscriberId();
            }
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
        }
        return e.e(str);
    }

    public static String c(Context context) {
        int i = 0;
        try {
            i = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
        }
        return i == 1 ? "1" : "0";
    }

    public static String a() {
        long j;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j = ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            j = 0;
        }
        return String.valueOf(j);
    }

    public static String b() {
        File externalStorageDirectory;
        long j = 0;
        try {
            if ("mounted".equals(Environment.getExternalStorageState()) && (externalStorageDirectory = Environment.getExternalStorageDirectory()) != null) {
                StatFs statFs = new StatFs(externalStorageDirectory.getPath());
                j = ((long) statFs.getBlockSize()) * ((long) statFs.getAvailableBlocks());
            }
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
        }
        return String.valueOf(j);
    }

    public static String d(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                int i = audioManager.getRingerMode() == 0 ? 1 : 0;
                int streamVolume = audioManager.getStreamVolume(0);
                int streamVolume2 = audioManager.getStreamVolume(1);
                int streamVolume3 = audioManager.getStreamVolume(2);
                int streamVolume4 = audioManager.getStreamVolume(3);
                int streamVolume5 = audioManager.getStreamVolume(4);
                jSONObject.put("ringermode", String.valueOf(i));
                jSONObject.put("call", String.valueOf(streamVolume));
                jSONObject.put("system", String.valueOf(streamVolume2));
                jSONObject.put("ring", String.valueOf(streamVolume3));
                jSONObject.put("music", String.valueOf(streamVolume4));
                jSONObject.put("alarm", String.valueOf(streamVolume5));
            }
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
        }
        return jSONObject.toString();
    }

    public static String e(Context context) {
        String str = null;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                str = telephonyManager.getSimOperatorName();
            }
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
        }
        return e.e(str);
    }

    public static String f(Context context) {
        String str = null;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                str = telephonyManager.getNetworkOperatorName();
            }
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
        }
        return (str == null || "null".equals(str)) ? "" : str;
    }

    public static String g(Context context) {
        List<Sensor> sensorList;
        String str = null;
        try {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            if (!(sensorManager == null || (sensorList = sensorManager.getSensorList(-1)) == null || sensorList.size() <= 0)) {
                StringBuilder sb = new StringBuilder();
                for (Sensor next : sensorList) {
                    sb.append(next.getName());
                    sb.append(next.getVersion());
                    sb.append(next.getVendor());
                }
                str = com.alipay.alipaysecuritysdk.common.b.b.a(sb.toString());
            }
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
        }
        return e.e(str);
    }

    public static String h(Context context) {
        List<Sensor> sensorList;
        JSONArray jSONArray = new JSONArray();
        try {
            SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
            if (!(sensorManager == null || (sensorList = sensorManager.getSensorList(-1)) == null || sensorList.size() <= 0)) {
                for (Sensor next : sensorList) {
                    if (next != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("name", next.getName());
                        jSONObject.put("version", next.getVersion());
                        jSONObject.put("vendor", next.getVendor());
                        jSONArray.put(jSONObject);
                    }
                }
            }
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
        }
        return jSONArray.toString();
    }

    public static String i(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toString(displayMetrics.widthPixels));
            sb.append("*");
            sb.append(Integer.toString(displayMetrics.heightPixels));
            return sb.toString();
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            return "";
        }
    }

    public static String j(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.widthPixels);
            return sb.toString();
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            return "";
        }
    }

    public static String k(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.heightPixels);
            return sb.toString();
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            return "";
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        if ("02:00:00:00:00:00".equals(r4) != false) goto L_0x002f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @android.annotation.SuppressLint({"HardwareIds"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String l(android.content.Context r4) {
        /*
            java.lang.String r0 = "02:00:00:00:00:00"
            java.lang.String r1 = "android.permission.ACCESS_WIFI_STATE"
            boolean r1 = com.alipay.alipaysecuritysdk.common.e.d.a(r4, r1)
            java.lang.String r2 = ""
            if (r1 == 0) goto L_0x000d
            return r2
        L_0x000d:
            java.lang.String r1 = "wifi"
            java.lang.Object r4 = r4.getSystemService(r1)     // Catch:{ all -> 0x0048 }
            android.net.wifi.WifiManager r4 = (android.net.wifi.WifiManager) r4     // Catch:{ all -> 0x0048 }
            if (r4 == 0) goto L_0x0046
            android.net.wifi.WifiInfo r4 = r4.getConnectionInfo()     // Catch:{ all -> 0x0048 }
            java.lang.String r4 = r4.getMacAddress()     // Catch:{ all -> 0x0048 }
            boolean r1 = com.alipay.alipaysecuritysdk.common.e.e.c(r4)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = "wlan0"
            if (r1 != 0) goto L_0x002f
            boolean r1 = r0.equals(r4)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x0033
        L_0x002f:
            java.lang.String r4 = a((java.lang.String) r3)     // Catch:{ all -> 0x0044 }
        L_0x0033:
            boolean r1 = com.alipay.alipaysecuritysdk.common.e.e.c(r4)     // Catch:{ all -> 0x0044 }
            if (r1 != 0) goto L_0x003f
            boolean r1 = r0.equals(r4)     // Catch:{ all -> 0x0044 }
            if (r1 == 0) goto L_0x004f
        L_0x003f:
            java.lang.String r4 = b((java.lang.String) r3)     // Catch:{ all -> 0x0044 }
            goto L_0x004f
        L_0x0044:
            r1 = move-exception
            goto L_0x004a
        L_0x0046:
            r4 = r2
            goto L_0x004f
        L_0x0048:
            r1 = move-exception
            r4 = r2
        L_0x004a:
            java.lang.String r3 = "SEC_SDK-tool"
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r3, (java.lang.Throwable) r1)
        L_0x004f:
            boolean r0 = r0.equals(r4)
            if (r0 == 0) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r2 = r4
        L_0x0057:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.common.collector.b.l(android.content.Context):java.lang.String");
    }

    private static String a(String str) {
        String str2 = "";
        try {
            while (true) {
                String str3 = str2;
                for (T t : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                    try {
                        if (!(t == null || t.getName() == null || !str.equalsIgnoreCase(t.getName()))) {
                            byte[] hardwareAddress = t.getHardwareAddress();
                            if (hardwareAddress != null) {
                                StringBuilder sb = new StringBuilder();
                                int length = hardwareAddress.length;
                                for (int i = 0; i < length; i++) {
                                    sb.append(String.format("%02X:", new Object[]{Integer.valueOf(hardwareAddress[i] & 255)}));
                                }
                                if (sb.length() > 0) {
                                    sb.deleteCharAt(sb.length() - 1);
                                }
                                str3 = sb.toString();
                            }
                        }
                    } catch (Exception e) {
                        e = e;
                        str2 = str3;
                        com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", (Throwable) e);
                        return str2;
                    }
                }
                return str3;
            }
        } catch (Exception e2) {
            e = e2;
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", (Throwable) e);
            return str2;
        }
    }

    private static String b(String str) {
        String str2;
        Exception e;
        try {
            File file = new File("/sys/class/net/".concat(String.valueOf(str)), "address");
            if (!file.exists() || !file.isFile() || !file.canRead()) {
                return "";
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            fileInputStream.read(bArr, 0, available);
            str2 = new String(bArr);
            try {
                str2 = str2.substring(0, 17).toUpperCase();
                if (!Pattern.matches("[0-9a-fA-F]{2}(:[0-9a-fA-F]{2}){5}", str2) && !Pattern.matches("[0-9a-fA-F]{2}(-[0-9a-fA-F]{2}){5}", str2)) {
                    return "";
                }
            } catch (Exception e2) {
                e = e2;
                com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", (Throwable) e);
                return str2;
            }
            return str2;
        } catch (Exception e3) {
            e = e3;
            str2 = "";
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", (Throwable) e);
            return str2;
        }
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    public static String m(Context context) {
        String str = "";
        if (d.a(context, "android.permission.READ_PHONE_STATE")) {
            return str;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return str;
            }
            String simSerialNumber = telephonyManager.getSimSerialNumber();
            try {
                if (e.c(simSerialNumber)) {
                    return str;
                }
                return simSerialNumber;
            } catch (Throwable th) {
                th = th;
                str = simSerialNumber;
                com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
                return str;
            }
        } catch (Throwable th2) {
            th = th2;
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            return str;
        }
    }

    @SuppressLint({"HardwareIds"})
    public static String n(Context context) {
        String str;
        try {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            str = "";
        }
        return e.e(str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:0|(8:1|2|3|4|5|6|7|(2:8|(3:10|11|(2:13|(2:59|15)(1:16))(0))(0)))|22|23|42|44|(4:(2:(2:55|56)|58)|(1:58)|(3:(2:51|52)|(0)|58)|(0))) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x006e, code lost:
        if (r2 != null) goto L_0x0048;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0045 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0048 */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0062 A[SYNTHETIC, Splitter:B:34:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0069 A[SYNTHETIC, Splitter:B:38:0x0069] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0087 A[SYNTHETIC, Splitter:B:55:0x0087] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c() {
        /*
            java.lang.String r0 = "0000000000000000"
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x0056 }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x0056 }
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch:{ all -> 0x0056 }
            r2.<init>(r3)     // Catch:{ all -> 0x0056 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0051 }
            r3.<init>(r2)     // Catch:{ all -> 0x0051 }
            java.io.LineNumberReader r4 = new java.io.LineNumberReader     // Catch:{ all -> 0x004c }
            r4.<init>(r3)     // Catch:{ all -> 0x004c }
            r1 = 1
            r5 = 1
        L_0x001b:
            r6 = 100
            if (r5 >= r6) goto L_0x0042
            java.lang.String r6 = r4.readLine()     // Catch:{ all -> 0x0040 }
            if (r6 == 0) goto L_0x0042
            java.lang.String r7 = "Serial"
            boolean r7 = r6.contains(r7)     // Catch:{ all -> 0x0040 }
            if (r7 == 0) goto L_0x003d
            java.lang.String r5 = ":"
            int r5 = r6.indexOf(r5)     // Catch:{ all -> 0x0040 }
            int r5 = r5 + r1
            java.lang.String r1 = r6.substring(r5)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = r1.trim()     // Catch:{ all -> 0x0040 }
            goto L_0x0042
        L_0x003d:
            int r5 = r5 + 1
            goto L_0x001b
        L_0x0040:
            r1 = move-exception
            goto L_0x005b
        L_0x0042:
            r4.close()     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r3.close()     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r2.close()     // Catch:{ all -> 0x0071 }
            goto L_0x0071
        L_0x004c:
            r4 = move-exception
            r8 = r4
            r4 = r1
            r1 = r8
            goto L_0x005b
        L_0x0051:
            r3 = move-exception
            r4 = r1
            r1 = r3
            r3 = r4
            goto L_0x005b
        L_0x0056:
            r2 = move-exception
            r3 = r1
            r4 = r3
            r1 = r2
            r2 = r4
        L_0x005b:
            java.lang.String r5 = "SEC_SDK-tool"
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r5, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0076 }
            if (r4 == 0) goto L_0x0067
            r4.close()     // Catch:{ all -> 0x0066 }
            goto L_0x0067
        L_0x0066:
        L_0x0067:
            if (r3 == 0) goto L_0x006e
            r3.close()     // Catch:{ all -> 0x006d }
            goto L_0x006e
        L_0x006d:
        L_0x006e:
            if (r2 == 0) goto L_0x0071
            goto L_0x0048
        L_0x0071:
            java.lang.String r0 = com.alipay.alipaysecuritysdk.common.e.e.e(r0)
            return r0
        L_0x0076:
            r0 = move-exception
            if (r4 == 0) goto L_0x007e
            r4.close()     // Catch:{ all -> 0x007d }
            goto L_0x007e
        L_0x007d:
        L_0x007e:
            if (r3 == 0) goto L_0x0085
            r3.close()     // Catch:{ all -> 0x0084 }
            goto L_0x0085
        L_0x0084:
        L_0x0085:
            if (r2 == 0) goto L_0x008a
            r2.close()     // Catch:{ all -> 0x008a }
        L_0x008a:
            goto L_0x008c
        L_0x008b:
            throw r0
        L_0x008c:
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.common.collector.b.c():java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:0|(8:1|2|3|4|5|6|7|(2:8|(3:10|11|(2:13|(2:58|15)(1:16))(0))(0)))|22|23|42|(4:(0)|(2:(2:54|55)|57)|(1:57)|(3:(2:50|51)|(0)|57))) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0072, code lost:
        if (r2 != null) goto L_0x004c;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0049 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x004c */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0066 A[SYNTHETIC, Splitter:B:34:0x0066] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x006d A[SYNTHETIC, Splitter:B:38:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0087 A[SYNTHETIC, Splitter:B:54:0x0087] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String d() {
        /*
            java.lang.String r0 = "-1"
            r1 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ all -> 0x005a }
            java.io.File r3 = new java.io.File     // Catch:{ all -> 0x005a }
            java.lang.String r4 = "/proc/cpuinfo"
            r3.<init>(r4)     // Catch:{ all -> 0x005a }
            r2.<init>(r3)     // Catch:{ all -> 0x005a }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ all -> 0x0055 }
            r3.<init>(r2)     // Catch:{ all -> 0x0055 }
            java.io.LineNumberReader r4 = new java.io.LineNumberReader     // Catch:{ all -> 0x0050 }
            r4.<init>(r3)     // Catch:{ all -> 0x0050 }
            r1 = 1
            r5 = 1
        L_0x001b:
            r6 = 100
            if (r5 >= r6) goto L_0x0046
            java.lang.String r6 = r4.readLine()     // Catch:{ all -> 0x0044 }
            if (r6 == 0) goto L_0x0046
            java.lang.String r7 = "Hardware"
            boolean r7 = r6.contains(r7)     // Catch:{ all -> 0x0044 }
            if (r7 == 0) goto L_0x0041
            java.lang.String r5 = ":"
            int r5 = r6.indexOf(r5)     // Catch:{ all -> 0x0044 }
            int r5 = r5 + r1
            int r1 = r6.length()     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r6.substring(r5, r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = r1.trim()     // Catch:{ all -> 0x0044 }
            goto L_0x0046
        L_0x0041:
            int r5 = r5 + 1
            goto L_0x001b
        L_0x0044:
            r1 = move-exception
            goto L_0x005f
        L_0x0046:
            r4.close()     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r3.close()     // Catch:{ all -> 0x004c }
        L_0x004c:
            r2.close()     // Catch:{ all -> 0x0075 }
            goto L_0x0075
        L_0x0050:
            r4 = move-exception
            r8 = r4
            r4 = r1
            r1 = r8
            goto L_0x005f
        L_0x0055:
            r3 = move-exception
            r4 = r1
            r1 = r3
            r3 = r4
            goto L_0x005f
        L_0x005a:
            r2 = move-exception
            r3 = r1
            r4 = r3
            r1 = r2
            r2 = r4
        L_0x005f:
            java.lang.String r5 = "SEC_SDK-tool"
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r5, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0076 }
            if (r4 == 0) goto L_0x006b
            r4.close()     // Catch:{ all -> 0x006a }
            goto L_0x006b
        L_0x006a:
        L_0x006b:
            if (r3 == 0) goto L_0x0072
            r3.close()     // Catch:{ all -> 0x0071 }
            goto L_0x0072
        L_0x0071:
        L_0x0072:
            if (r2 == 0) goto L_0x0075
            goto L_0x004c
        L_0x0075:
            return r0
        L_0x0076:
            r0 = move-exception
            if (r4 == 0) goto L_0x007e
            r4.close()     // Catch:{ all -> 0x007d }
            goto L_0x007e
        L_0x007d:
        L_0x007e:
            if (r3 == 0) goto L_0x0085
            r3.close()     // Catch:{ all -> 0x0084 }
            goto L_0x0085
        L_0x0084:
        L_0x0085:
            if (r2 == 0) goto L_0x008a
            r2.close()     // Catch:{ all -> 0x008a }
        L_0x008a:
            goto L_0x008c
        L_0x008b:
            throw r0
        L_0x008c:
            goto L_0x008b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.common.collector.b.d():java.lang.String");
    }

    class a implements FileFilter {
        a() {
        }

        public final boolean accept(File file) {
            return Pattern.matches("cpu[0-9]+", file.getName());
        }
    }

    public static String e() {
        try {
            return String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new a()).length);
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            return "1";
        }
    }

    public static String f() {
        String v = v();
        if (!e.c(v)) {
            return v;
        }
        return w();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|16|17|18|45) */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return "";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0020 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0027 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003d A[SYNTHETIC, Splitter:B:28:0x003d] */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String v() {
        /*
            java.lang.String r0 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
            r1 = 0
            java.io.FileReader r2 = new java.io.FileReader     // Catch:{ all -> 0x0032 }
            r2.<init>(r0)     // Catch:{ all -> 0x0032 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x002d }
            r3 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r2, r3)     // Catch:{ all -> 0x002d }
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x002b }
            boolean r3 = com.alipay.alipaysecuritysdk.common.e.e.c(r1)     // Catch:{ all -> 0x002b }
            if (r3 != 0) goto L_0x0024
            java.lang.String r1 = r1.trim()     // Catch:{ all -> 0x002b }
            r0.close()     // Catch:{ all -> 0x0020 }
        L_0x0020:
            r2.close()     // Catch:{ all -> 0x0023 }
        L_0x0023:
            return r1
        L_0x0024:
            r0.close()     // Catch:{ all -> 0x0027 }
        L_0x0027:
            r2.close()     // Catch:{ all -> 0x0045 }
            goto L_0x0045
        L_0x002b:
            r1 = move-exception
            goto L_0x0036
        L_0x002d:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x0036
        L_0x0032:
            r0 = move-exception
            r2 = r1
            r1 = r0
            r0 = r2
        L_0x0036:
            java.lang.String r3 = "SEC_SDK-tool"
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r3, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0042
            r0.close()     // Catch:{ all -> 0x0041 }
            goto L_0x0042
        L_0x0041:
        L_0x0042:
            if (r2 == 0) goto L_0x0045
            goto L_0x0027
        L_0x0045:
            java.lang.String r0 = ""
            return r0
        L_0x0048:
            r1 = move-exception
            if (r0 == 0) goto L_0x0050
            r0.close()     // Catch:{ all -> 0x004f }
            goto L_0x0050
        L_0x004f:
        L_0x0050:
            if (r2 == 0) goto L_0x0055
            r2.close()     // Catch:{ all -> 0x0055 }
        L_0x0055:
            goto L_0x0057
        L_0x0056:
            throw r1
        L_0x0057:
            goto L_0x0056
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.common.collector.b.v():java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|(3:3|4|(3:5|6|(3:8|(2:10|(2:45|14))(1:46)|44)(0)))|17|18|32|(3:(2:(2:40|41)|43)|(0)|(1:43))) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0056, code lost:
        if (r0 == null) goto L_0x0059;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003b */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0051 A[SYNTHETIC, Splitter:B:28:0x0051] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String w() {
        /*
            java.lang.String r0 = "/proc/cpuinfo"
            java.lang.String r1 = ""
            r2 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch:{ all -> 0x0046 }
            r3.<init>(r0)     // Catch:{ all -> 0x0046 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0041 }
            r4 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r4)     // Catch:{ all -> 0x0041 }
        L_0x0011:
            java.lang.String r2 = r0.readLine()     // Catch:{ all -> 0x003f }
            if (r2 == 0) goto L_0x0038
            boolean r4 = com.alipay.alipaysecuritysdk.common.e.e.c(r2)     // Catch:{ all -> 0x003f }
            if (r4 != 0) goto L_0x0011
            java.lang.String r4 = ":"
            java.lang.String[] r2 = r2.split(r4)     // Catch:{ all -> 0x003f }
            int r4 = r2.length     // Catch:{ all -> 0x003f }
            r5 = 1
            if (r4 <= r5) goto L_0x0011
            r4 = 0
            r4 = r2[r4]     // Catch:{ all -> 0x003f }
            java.lang.String r6 = "BogoMIPS"
            boolean r4 = r4.contains(r6)     // Catch:{ all -> 0x003f }
            if (r4 == 0) goto L_0x0011
            r2 = r2[r5]     // Catch:{ all -> 0x003f }
            java.lang.String r1 = r2.trim()     // Catch:{ all -> 0x003f }
        L_0x0038:
            r3.close()     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0.close()     // Catch:{ all -> 0x0059 }
            goto L_0x0059
        L_0x003f:
            r2 = move-exception
            goto L_0x004a
        L_0x0041:
            r0 = move-exception
            r7 = r2
            r2 = r0
            r0 = r7
            goto L_0x004a
        L_0x0046:
            r0 = move-exception
            r3 = r2
            r2 = r0
            r0 = r3
        L_0x004a:
            java.lang.String r4 = "SEC_SDK-tool"
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r4, (java.lang.Throwable) r2)     // Catch:{ all -> 0x005a }
            if (r3 == 0) goto L_0x0056
            r3.close()     // Catch:{ all -> 0x0055 }
            goto L_0x0056
        L_0x0055:
        L_0x0056:
            if (r0 == 0) goto L_0x0059
            goto L_0x003b
        L_0x0059:
            return r1
        L_0x005a:
            r1 = move-exception
            if (r3 == 0) goto L_0x0062
            r3.close()     // Catch:{ all -> 0x0061 }
            goto L_0x0062
        L_0x0061:
        L_0x0062:
            if (r0 == 0) goto L_0x0067
            r0.close()     // Catch:{ all -> 0x0067 }
        L_0x0067:
            goto L_0x0069
        L_0x0068:
            throw r1
        L_0x0069:
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.common.collector.b.w():java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:15|16|17|18|45) */
    /* JADX WARNING: Code restructure failed: missing block: B:43:?, code lost:
        return "";
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0021 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0028 */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x003e A[SYNTHETIC, Splitter:B:28:0x003e] */
    /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String g() {
        /*
            r0 = 0
            java.io.FileReader r1 = new java.io.FileReader     // Catch:{ all -> 0x0033 }
            java.lang.String r2 = "/proc/cpuinfo"
            r1.<init>(r2)     // Catch:{ all -> 0x0033 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ all -> 0x002e }
            r2.<init>(r1)     // Catch:{ all -> 0x002e }
            java.lang.String r0 = r2.readLine()     // Catch:{ all -> 0x002c }
            java.lang.String r3 = ":\\s+"
            r4 = 2
            java.lang.String[] r0 = r0.split(r3, r4)     // Catch:{ all -> 0x002c }
            int r3 = r0.length     // Catch:{ all -> 0x002c }
            r4 = 1
            if (r3 <= r4) goto L_0x0025
            r0 = r0[r4]     // Catch:{ all -> 0x002c }
            r1.close()     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r2.close()     // Catch:{ all -> 0x0024 }
        L_0x0024:
            return r0
        L_0x0025:
            r1.close()     // Catch:{ all -> 0x0028 }
        L_0x0028:
            r2.close()     // Catch:{ all -> 0x0046 }
            goto L_0x0046
        L_0x002c:
            r0 = move-exception
            goto L_0x0037
        L_0x002e:
            r2 = move-exception
            r5 = r2
            r2 = r0
            r0 = r5
            goto L_0x0037
        L_0x0033:
            r1 = move-exception
            r2 = r0
            r0 = r1
            r1 = r2
        L_0x0037:
            java.lang.String r3 = "SEC_SDK-tool"
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x0049 }
            if (r1 == 0) goto L_0x0043
            r1.close()     // Catch:{ all -> 0x0042 }
            goto L_0x0043
        L_0x0042:
        L_0x0043:
            if (r2 == 0) goto L_0x0046
            goto L_0x0028
        L_0x0046:
            java.lang.String r0 = ""
            return r0
        L_0x0049:
            r0 = move-exception
            if (r1 == 0) goto L_0x0051
            r1.close()     // Catch:{ all -> 0x0050 }
            goto L_0x0051
        L_0x0050:
        L_0x0051:
            if (r2 == 0) goto L_0x0056
            r2.close()     // Catch:{ all -> 0x0056 }
        L_0x0056:
            goto L_0x0058
        L_0x0057:
            throw r0
        L_0x0058:
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.common.collector.b.g():java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|(2:8|9)|10|11|12|13|27|29|(3:(2:(2:36|37)|39)|(0)|(1:39))) */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        if (r0 == null) goto L_0x0047;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0029 */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x003f A[SYNTHETIC, Splitter:B:23:0x003f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String h() {
        /*
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            r2 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ all -> 0x0034 }
            r4.<init>(r0)     // Catch:{ all -> 0x0034 }
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x002f }
            r5 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r4, r5)     // Catch:{ all -> 0x002f }
            java.lang.String r1 = r0.readLine()     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0026
            java.lang.String r5 = "\\s+"
            java.lang.String[] r1 = r1.split(r5)     // Catch:{ all -> 0x002d }
            r5 = 1
            r1 = r1[r5]     // Catch:{ all -> 0x002d }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x002d }
            long r1 = (long) r1
            r2 = r1
        L_0x0026:
            r4.close()     // Catch:{ all -> 0x0029 }
        L_0x0029:
            r0.close()     // Catch:{ all -> 0x0047 }
            goto L_0x0047
        L_0x002d:
            r1 = move-exception
            goto L_0x0038
        L_0x002f:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x0038
        L_0x0034:
            r0 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0038:
            java.lang.String r5 = "SEC_SDK-tool"
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r5, (java.lang.Throwable) r1)     // Catch:{ all -> 0x004c }
            if (r4 == 0) goto L_0x0044
            r4.close()     // Catch:{ all -> 0x0043 }
            goto L_0x0044
        L_0x0043:
        L_0x0044:
            if (r0 == 0) goto L_0x0047
            goto L_0x0029
        L_0x0047:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            return r0
        L_0x004c:
            r1 = move-exception
            if (r4 == 0) goto L_0x0054
            r4.close()     // Catch:{ all -> 0x0053 }
            goto L_0x0054
        L_0x0053:
        L_0x0054:
            if (r0 == 0) goto L_0x0059
            r0.close()     // Catch:{ all -> 0x0059 }
        L_0x0059:
            goto L_0x005b
        L_0x005a:
            throw r1
        L_0x005b:
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.common.collector.b.h():java.lang.String");
    }

    public static String i() {
        long j;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j = ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            j = 0;
        }
        return String.valueOf(j);
    }

    public static String j() {
        long j = 0;
        try {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                StatFs statFs = new StatFs(Environment.getExternalStorageDirectory().getPath());
                j = ((long) statFs.getBlockSize()) * ((long) statFs.getBlockCount());
            }
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
        }
        return String.valueOf(j);
    }

    @SuppressLint({"MissingPermission", "HardwareIds"})
    private static String x() {
        BluetoothAdapter bluetoothAdapter;
        String str = "";
        try {
            bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
            if (bluetoothAdapter != null) {
                try {
                    if (!bluetoothAdapter.isEnabled()) {
                        return str;
                    }
                    str = bluetoothAdapter.getAddress();
                } catch (Throwable th) {
                    th = th;
                    com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
                    try {
                        str = a(bluetoothAdapter);
                    } catch (Throwable th2) {
                        com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th2);
                    }
                    return e.e(str);
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bluetoothAdapter = null;
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            str = a(bluetoothAdapter);
            return e.e(str);
        }
        if (str == null || str.endsWith("00:00:00:00:00")) {
            str = a(bluetoothAdapter);
        }
        return e.e(str);
    }

    public static String o(Context context) {
        String str = "";
        if (d.a(context, "android.permission.BLUETOOTH")) {
            return str;
        }
        String x = x();
        try {
            if (e.c(x) || "02:00:00:00:00:00".equals(x)) {
                x = Settings.Secure.getString(context.getContentResolver(), "bluetooth_address");
            }
            if (x != null) {
                str = x;
            }
            return str;
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            return x;
        }
    }

    private static String a(BluetoothAdapter bluetoothAdapter) {
        try {
            Field declaredField = BluetoothAdapter.class.getDeclaredField("mService");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(bluetoothAdapter);
            if (obj == null) {
                return null;
            }
            Method declaredMethod = obj.getClass().getDeclaredMethod("getAddress", new Class[0]);
            declaredMethod.setAccessible(true);
            Object invoke = declaredMethod.invoke(obj, new Object[0]);
            if (invoke instanceof String) {
                return (String) invoke;
            }
            return null;
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static String p(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                return String.valueOf(telephonyManager.getNetworkType());
            }
            return "";
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            return "";
        }
    }

    public static String k() {
        String str;
        try {
            str = a("gsm.version.baseband", "no message");
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            str = "";
        }
        return e.e(str);
    }

    public static String q(Context context) {
        String str = "";
        if (!(d.b(context, "android.permission.ACCESS_FINE_LOCATION") || (d.b(context, ManifestPermission.ACCESS_COARSE_LOCATION) && Build.VERSION.SDK_INT > 27))) {
            return str;
        }
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager != null && wifiManager.isWifiEnabled()) {
                str = wifiManager.getConnectionInfo().getBSSID();
            }
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
        }
        return e.e(str);
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0038 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042 A[Catch:{ all -> 0x005c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String l() {
        /*
            java.lang.String r0 = "SEC_SDK-tool"
            java.lang.String r1 = ""
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ all -> 0x006d }
            java.lang.String r4 = "/proc/version"
            r3.<init>(r4)     // Catch:{ all -> 0x006d }
            r4 = 0
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ all -> 0x0030 }
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ all -> 0x0030 }
            r6.<init>(r3)     // Catch:{ all -> 0x0030 }
            r7 = 8192(0x2000, float:1.14794E-41)
            r5.<init>(r6, r7)     // Catch:{ all -> 0x0030 }
        L_0x001d:
            java.lang.String r4 = r5.readLine()     // Catch:{ all -> 0x002e }
            if (r4 == 0) goto L_0x0027
            r2.append(r4)     // Catch:{ all -> 0x002e }
            goto L_0x001d
        L_0x0027:
            r5.close()     // Catch:{ all -> 0x0038 }
            r3.close()     // Catch:{ all -> 0x0038 }
            goto L_0x0038
        L_0x002e:
            r4 = move-exception
            goto L_0x0034
        L_0x0030:
            r5 = move-exception
            r8 = r5
            r5 = r4
            r4 = r8
        L_0x0034:
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r0, (java.lang.Throwable) r4)     // Catch:{ all -> 0x0065 }
            goto L_0x0027
        L_0x0038:
            java.lang.String r3 = r2.toString()     // Catch:{ all -> 0x005c }
            boolean r3 = com.alipay.alipaysecuritysdk.common.e.e.d(r3)     // Catch:{ all -> 0x005c }
            if (r3 == 0) goto L_0x0060
            java.lang.String r3 = "version "
            int r3 = r2.indexOf(r3)     // Catch:{ all -> 0x005c }
            int r3 = r3 + 8
            java.lang.String r2 = r2.substring(r3)     // Catch:{ all -> 0x005c }
            java.lang.String r3 = " "
            int r3 = r2.indexOf(r3)     // Catch:{ all -> 0x005c }
            r4 = 0
            java.lang.String r0 = r2.substring(r4, r3)     // Catch:{ all -> 0x005c }
            r1 = r0
            goto L_0x0060
        L_0x005c:
            r2 = move-exception
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r0, (java.lang.Throwable) r2)
        L_0x0060:
            java.lang.String r0 = com.alipay.alipaysecuritysdk.common.e.e.e(r1)
            return r0
        L_0x0065:
            r0 = move-exception
            r5.close()     // Catch:{ all -> 0x006c }
            r3.close()     // Catch:{ all -> 0x006c }
        L_0x006c:
            throw r0
        L_0x006d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.common.collector.b.l():java.lang.String");
    }

    @SuppressLint({"HardwareIds"})
    public static String r(Context context) {
        String str = "";
        try {
            if (Build.VERSION.SDK_INT < 29) {
                if (Build.VERSION.SDK_INT < 28) {
                    str = Build.SERIAL;
                } else if (d.b(context, "android.permission.READ_PHONE_STATE")) {
                    str = Build.getSerial();
                }
            }
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
        }
        return e.e(str);
    }

    public static String m() {
        String str;
        try {
            str = Locale.getDefault().toString();
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            str = "";
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String n() {
        String str;
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            str = "";
        }
        return e.e(str);
    }

    public static String s(Context context) {
        try {
            String v = v(context);
            String y = y();
            if (!e.d(v) || !e.d(y)) {
                return "";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(v);
            sb.append(":");
            sb.append(y());
            return sb.toString();
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            return "";
        }
    }

    private static String v(Context context) {
        NetworkInfo networkInfo;
        if (d.a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                networkInfo = null;
            } else {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo == null) {
                return null;
            }
            if (networkInfo.getType() == 1) {
                return "WIFI";
            }
            if (networkInfo.getType() != 0) {
                return "";
            }
            int subtype = networkInfo.getSubtype();
            if (!(subtype == 4 || subtype == 1 || subtype == 2 || subtype == 7)) {
                if (subtype != 11) {
                    if (!(subtype == 3 || subtype == 5 || subtype == 6 || subtype == 8 || subtype == 9 || subtype == 10 || subtype == 12 || subtype == 14)) {
                        if (subtype != 15) {
                            return subtype == 13 ? "4G" : RVScheduleType.UNKNOW;
                        }
                    }
                    return "3G";
                }
            }
            return "2G";
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            return "";
        }
    }

    private static String y() {
        try {
            Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
            while (networkInterfaces.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = networkInterfaces.nextElement().getInetAddresses();
                while (true) {
                    if (inetAddresses.hasMoreElements()) {
                        InetAddress nextElement = inetAddresses.nextElement();
                        if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                            return nextElement.getHostAddress();
                        }
                    }
                }
            }
            return "";
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            return "";
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    @android.annotation.SuppressLint({"NewApi"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String t(android.content.Context r8) {
        /*
            java.lang.String r0 = "SEC_SDK-tool"
            java.lang.String r1 = "keyguard"
            java.lang.Object r8 = r8.getSystemService(r1)     // Catch:{ all -> 0x004e }
            android.app.KeyguardManager r8 = (android.app.KeyguardManager) r8     // Catch:{ all -> 0x004e }
            if (r8 == 0) goto L_0x004b
            boolean r8 = r8.isKeyguardSecure()     // Catch:{ all -> 0x004e }
            if (r8 != 0) goto L_0x0013
            goto L_0x004b
        L_0x0013:
            r1 = 0
            java.lang.String r8 = "/data/system/password.key"
            java.lang.String r3 = "/data/system/gesture.key"
            java.lang.String r4 = "/data/system/gatekeeper.password.key"
            java.lang.String r5 = "/data/system/gatekeeper.gesture.key"
            java.lang.String r6 = "/data/system/gatekeeper.pattern.key"
            java.lang.String[] r8 = new java.lang.String[]{r8, r3, r4, r5, r6}     // Catch:{ all -> 0x004e }
            r3 = 0
        L_0x0024:
            r4 = 5
            if (r3 >= r4) goto L_0x0040
            r4 = r8[r3]     // Catch:{ all -> 0x004e }
            r5 = -1
            java.io.File r7 = new java.io.File     // Catch:{ all -> 0x0035 }
            r7.<init>(r4)     // Catch:{ all -> 0x0035 }
            long r5 = r7.lastModified()     // Catch:{ all -> 0x0035 }
            goto L_0x0039
        L_0x0035:
            r4 = move-exception
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r0, (java.lang.Throwable) r4)     // Catch:{ all -> 0x004e }
        L_0x0039:
            long r1 = java.lang.Math.max(r5, r1)     // Catch:{ all -> 0x004e }
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0040:
            java.lang.String r8 = "1:"
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x004e }
            java.lang.String r8 = r8.concat(r1)     // Catch:{ all -> 0x004e }
            return r8
        L_0x004b:
            java.lang.String r8 = "0:0"
            return r8
        L_0x004e:
            r8 = move-exception
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r0, (java.lang.Throwable) r8)
            java.lang.String r8 = ""
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.common.collector.b.t(android.content.Context):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030 A[Catch:{ all -> 0x0045 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0033 A[Catch:{ all -> 0x0045 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String u(android.content.Context r4) {
        /*
            java.lang.String r0 = ""
            android.content.IntentFilter r1 = new android.content.IntentFilter     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = "android.intent.action.BATTERY_CHANGED"
            r1.<init>(r2)     // Catch:{ all -> 0x0045 }
            r2 = 0
            android.content.Intent r4 = r4.registerReceiver(r2, r1)     // Catch:{ all -> 0x0045 }
            if (r4 != 0) goto L_0x0011
            return r0
        L_0x0011:
            java.lang.String r1 = "level"
            r2 = -1
            int r1 = r4.getIntExtra(r1, r2)     // Catch:{ all -> 0x0045 }
            java.lang.String r3 = "status"
            int r4 = r4.getIntExtra(r3, r2)     // Catch:{ all -> 0x0045 }
            r2 = 2
            if (r4 == r2) goto L_0x0028
            r2 = 5
            if (r4 != r2) goto L_0x0026
            goto L_0x0028
        L_0x0026:
            r4 = 0
            goto L_0x0029
        L_0x0028:
            r4 = 1
        L_0x0029:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0045 }
            r2.<init>()     // Catch:{ all -> 0x0045 }
            if (r4 == 0) goto L_0x0033
            java.lang.String r4 = "1"
            goto L_0x0035
        L_0x0033:
            java.lang.String r4 = "0"
        L_0x0035:
            r2.append(r4)     // Catch:{ all -> 0x0045 }
            java.lang.String r4 = ":"
            r2.append(r4)     // Catch:{ all -> 0x0045 }
            r2.append(r1)     // Catch:{ all -> 0x0045 }
            java.lang.String r4 = r2.toString()     // Catch:{ all -> 0x0045 }
            return r4
        L_0x0045:
            r4 = move-exception
            java.lang.String r1 = "SEC_SDK-tool"
            com.alipay.alipaysecuritysdk.common.c.b.a((java.lang.String) r1, (java.lang.Throwable) r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.common.collector.b.u(android.content.Context):java.lang.String");
    }

    public static String o() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(SystemClock.elapsedRealtime());
            return sb.toString();
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            return "";
        }
    }

    public static String p() {
        try {
            StringBuilder sb = new StringBuilder();
            String[] strArr = {"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
            sb.append(TransferUserInfoResult.KycLevel.KYC_0);
            sb.append(":");
            for (int i = 0; i < 7; i++) {
                if (new File(strArr[i]).exists()) {
                    sb.append("1");
                } else {
                    sb.append("0");
                }
            }
            return sb.toString();
        } catch (Throwable th) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", th);
            return "";
        }
    }

    public static String q() {
        String[] strArr = {"dalvik.system.Taint"};
        StringBuilder sb = new StringBuilder();
        sb.append(TransferUserInfoResult.KycLevel.KYC_0);
        sb.append(":");
        for (int i = 0; i <= 0; i++) {
            try {
                Class.forName(strArr[0]);
                sb.append("1");
            } catch (Throwable unused) {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0074 A[SYNTHETIC, Splitter:B:21:0x0074] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x002f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String r() {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            java.lang.String r2 = "/system/build.prop"
            java.lang.String r3 = "ro.product.name=sdk"
            r1.put(r2, r3)
            java.lang.String r2 = "goldfish"
            java.lang.String r3 = "/proc/tty/drivers"
            r1.put(r3, r2)
            java.lang.String r3 = "/proc/cpuinfo"
            r1.put(r3, r2)
            java.lang.String r2 = "00"
            r0.append(r2)
            java.lang.String r2 = ":"
            r0.append(r2)
            java.util.Set r2 = r1.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x002f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0078
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            r5 = 48
            java.io.LineNumberReader r6 = new java.io.LineNumberReader     // Catch:{ all -> 0x006f }
            java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ all -> 0x006f }
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch:{ all -> 0x006f }
            r8.<init>(r3)     // Catch:{ all -> 0x006f }
            r7.<init>(r8)     // Catch:{ all -> 0x006f }
            r6.<init>(r7)     // Catch:{ all -> 0x006f }
        L_0x004d:
            java.lang.String r4 = r6.readLine()     // Catch:{ all -> 0x006e }
            if (r4 == 0) goto L_0x0065
            java.lang.String r4 = r4.toLowerCase()     // Catch:{ all -> 0x006e }
            java.lang.Object r7 = r1.get(r3)     // Catch:{ all -> 0x006e }
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7     // Catch:{ all -> 0x006e }
            boolean r4 = r4.contains(r7)     // Catch:{ all -> 0x006e }
            if (r4 == 0) goto L_0x004d
            r5 = 49
        L_0x0065:
            r0.append(r5)
            r6.close()     // Catch:{ all -> 0x006c }
            goto L_0x002f
        L_0x006c:
            goto L_0x002f
        L_0x006e:
            r4 = r6
        L_0x006f:
            r0.append(r5)
            if (r4 == 0) goto L_0x002f
            r4.close()     // Catch:{ all -> 0x006c }
            goto L_0x002f
        L_0x0078:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.alipaysecuritysdk.common.collector.b.r():java.lang.String");
    }

    public static String s() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransferUserInfoResult.KycLevel.KYC_0);
        sb.append(":");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("BRAND", "generic");
        linkedHashMap.put("BOARD", "unknown");
        linkedHashMap.put("DEVICE", "generic");
        linkedHashMap.put("HARDWARE", "goldfish");
        linkedHashMap.put("PRODUCT", "sdk");
        linkedHashMap.put("MODEL", "sdk");
        for (String str : linkedHashMap.keySet()) {
            char c = '0';
            try {
                String str2 = null;
                String str3 = (String) Build.class.getField(str).get((Object) null);
                String str4 = (String) linkedHashMap.get(str);
                if (str3 != null) {
                    str2 = str3.toLowerCase();
                }
                if (str2 != null && str2.contains(str4)) {
                    c = '1';
                }
            } catch (Throwable th) {
                sb.append('0');
                throw th;
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static String t() {
        StringBuilder sb = new StringBuilder();
        sb.append(TransferUserInfoResult.KycLevel.KYC_0);
        sb.append(":");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ro.hardware", "goldfish");
        linkedHashMap.put("ro.kernel.qemu", "1");
        linkedHashMap.put("ro.product.device", "generic");
        linkedHashMap.put("ro.product.model", "sdk");
        linkedHashMap.put("ro.product.brand", "generic");
        linkedHashMap.put("ro.product.name", "sdk");
        linkedHashMap.put("ro.build.fingerprint", "test-keys");
        linkedHashMap.put("ro.product.manufacturer", "unknow");
        for (String str : linkedHashMap.keySet()) {
            char c = '0';
            String str2 = (String) linkedHashMap.get(str);
            String a2 = a(str, "");
            if (a2 != null && a2.contains(str2)) {
                c = '1';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    public static long u() {
        try {
            if (b == 0) {
                b = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            }
        } catch (Throwable unused) {
        }
        return b;
    }

    private static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod(ContactEventType.CONTACT_GET, new Class[]{String.class, String.class}).invoke((Object) null, new Object[]{str, str2});
        } catch (Exception e) {
            com.alipay.alipaysecuritysdk.common.c.b.a("SEC_SDK-tool", (Throwable) e);
            return str2;
        }
    }
}
