package com.alibaba.griver.base.common.utils;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.security.GriverSecurity;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;

public class DeviceUtils {
    public static String getIMEI(Context context) {
        String str = null;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    str = telephonyManager.getDeviceId();
                }
            } catch (Throwable unused) {
            }
        }
        return str == null ? "" : str;
    }

    public static String getIMEIEncrypt(Context context) {
        return GriverSecurity.getInstance().encrypt(getIMEI(context));
    }

    public static String getAndroidId(Context context) {
        String str;
        try {
            str = Settings.Secure.getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    public static String getAndroidIdEncrypt(Context context) {
        return GriverSecurity.getInstance().encrypt(getAndroidId(context));
    }

    public static String getMacEncrypt(Context context) {
        return GriverSecurity.getInstance().encrypt(getMac(context));
    }

    public static String getMac(Context context) {
        try {
            String macAddress = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            if (macAddress != null) {
                try {
                    if (macAddress.length() != 0 && !"02:00:00:00:00:00".equals(macAddress)) {
                        return macAddress;
                    }
                } catch (Throwable unused) {
                    return macAddress;
                }
            }
            return a();
        } catch (Throwable unused2) {
            return "";
        }
    }

    private static String a() {
        try {
            ArrayList<T> list = Collections.list(NetworkInterface.getNetworkInterfaces());
            if (list == null) {
                return "02:00:00:00:00:00";
            }
            for (T t : list) {
                if (t != null && t.getName() != null && t.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = t.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "02:00:00:00:00:00";
                    }
                    StringBuilder sb = new StringBuilder();
                    int length = hardwareAddress.length;
                    for (int i = 0; i < length; i++) {
                        sb.append(String.format("%02X:", new Object[]{Integer.valueOf(hardwareAddress[i] & 255)}));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return "02:00:00:00:00:00";
        } catch (Throwable unused) {
            return "02:00:00:00:00:00";
        }
    }

    public static String getSerialNumber() {
        String str;
        try {
            str = b();
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    private static String b() {
        if (Build.VERSION.SDK_INT > 27) {
            return null;
        }
        if (Build.VERSION.SDK_INT != 27) {
            return Build.SERIAL;
        }
        if (GriverEnv.getApplicationContext().checkSelfPermission("android.permission.READ_PHONE_STATE") == 0) {
            return Build.getSerial();
        }
        return null;
    }

    public static String getSerialNumberEncrypt() {
        return GriverSecurity.getInstance().encrypt(getSerialNumber());
    }

    public static String getUtdid(Context context) {
        try {
            return (String) Class.forName("com.ut.device.UTDevice").getMethod("getUtdid", new Class[]{Context.class}).invoke((Object) null, new Object[]{context});
        } catch (Exception unused) {
            GriverLogger.d("TinyDeviceUtils", "[*] UTDID error.");
            return "";
        }
    }

    public static String getUtdidEncrypt(Context context) {
        return GriverSecurity.getInstance().encrypt(getUtdid(context));
    }
}
