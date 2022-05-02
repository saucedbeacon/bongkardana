package com.alipay.alipaysecuritysdk.apdid.attack;

import android.app.ActivityManager;
import android.bluetooth.BluetoothAdapter;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.location.Location;
import android.net.Proxy;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Debug;
import android.os.Process;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.Display;
import com.ap.zoloz.hummer.h5.ZolozEkycH5Handler;
import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import java.io.File;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static List<a> f10648a;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public int f10649a;
        public String b;
        public String c;
        public Class[] d;

        public a(int i, String str, String str2, Class[] clsArr) {
            this.f10649a = i;
            this.b = str;
            this.c = str2;
            this.d = clsArr;
        }
    }

    static {
        ArrayList arrayList = new ArrayList();
        f10648a = arrayList;
        arrayList.add(new a(0, Settings.System.class.getName(), "getString", new Class[]{ContentResolver.class, String.class}));
        f10648a.add(new a(1, SharedPreferences.Editor.class.getName(), "putString", new Class[]{String.class, String.class}));
        f10648a.add(new a(2, "android.os.SystemProperties", ContactEventType.CONTACT_GET, new Class[]{String.class, String.class}));
        f10648a.add(new a(3, TelephonyManager.class.getName(), "getSubscriberId", new Class[0]));
        f10648a.add(new a(5, TelephonyManager.class.getName(), "getDeviceId", new Class[0]));
        f10648a.add(new a(6, TelephonyManager.class.getName(), "getVoiceMailNumber", new Class[0]));
        f10648a.add(new a(7, TelephonyManager.class.getName(), "getSimSerialNumber", new Class[0]));
        f10648a.add(new a(8, TelephonyManager.class.getName(), "getNetworkCountryIso", new Class[0]));
        f10648a.add(new a(9, TelephonyManager.class.getName(), "getNetworkOperatorName", new Class[0]));
        f10648a.add(new a(10, TelephonyManager.class.getName(), "getSimOperatorName", new Class[0]));
        f10648a.add(new a(11, TelephonyManager.class.getName(), "getPhoneType", new Class[0]));
        f10648a.add(new a(12, TelephonyManager.class.getName(), "getNetworkType", new Class[0]));
        f10648a.add(new a(13, TelephonyManager.class.getName(), "getCellLocation", new Class[0]));
        f10648a.add(new a(14, TelephonyManager.class.getName(), "getDeviceSoftwareVersion", new Class[0]));
        f10648a.add(new a(15, WifiInfo.class.getName(), "getMacAddress", new Class[0]));
        f10648a.add(new a(16, WifiInfo.class.getName(), "getIpAddress", new Class[0]));
        f10648a.add(new a(17, WifiInfo.class.getName(), "getSSID", new Class[0]));
        f10648a.add(new a(18, WifiInfo.class.getName(), "getBSSID", new Class[0]));
        f10648a.add(new a(19, WifiManager.class.getName(), "getConnectionInfo", new Class[0]));
        f10648a.add(new a(20, WifiManager.class.getName(), "getDhcpInfo", new Class[0]));
        f10648a.add(new a(21, WifiManager.class.getName(), "getScanResults", new Class[0]));
        f10648a.add(new a(22, NetworkInterface.class.getName(), "getNetworkInterfaces", new Class[0]));
        f10648a.add(new a(23, Proxy.class.getName(), "getHost", new Class[]{Context.class}));
        f10648a.add(new a(24, Proxy.class.getName(), "getPort", new Class[]{Context.class}));
        f10648a.add(new a(25, System.class.getName(), "getProperty", new Class[]{String.class}));
        f10648a.add(new a(26, PackageManager.class.getName(), "getInstallerPackageName", new Class[]{String.class}));
        f10648a.add(new a(27, PackageManager.class.getName(), "getPackageInfo", new Class[]{String.class, Integer.TYPE}));
        f10648a.add(new a(28, PackageManager.class.getName(), "getInstalledPackages", new Class[]{Integer.TYPE}));
        f10648a.add(new a(29, File.class.getName(), "getAbsolutePath", new Class[0]));
        f10648a.add(new a(30, ActivityManager.class.getName(), "getRunningTasks", new Class[]{Integer.TYPE}));
        f10648a.add(new a(31, ComponentName.class.getName(), "getPackageName", new Class[0]));
        f10648a.add(new a(32, Modifier.class.getName(), "isNative", new Class[]{Integer.TYPE}));
        f10648a.add(new a(33, Debug.class.getName(), "isDebuggerConnected", new Class[0]));
        f10648a.add(new a(34, Process.class.getName(), "myPid", new Class[0]));
        f10648a.add(new a(35, TimeZone.class.getName(), "getRawOffset", new Class[0]));
        f10648a.add(new a(36, TimeZone.class.getName(), "getDSTSavings", new Class[0]));
        f10648a.add(new a(37, Locale.class.getName(), ZolozEkycH5Handler.HUMMER_FOUNDATION_GET_LANGUAGE, new Class[0]));
        f10648a.add(new a(38, Intent.class.getName(), "getIntent", new Class[]{String.class}));
        f10648a.add(new a(39, Intent.class.getName(), "getExtra", new Class[]{String.class}));
        f10648a.add(new a(40, Intent.class.getName(), "getBooleanExtra", new Class[]{String.class, Boolean.TYPE}));
        f10648a.add(new a(41, Intent.class.getName(), "getByteExtra", new Class[]{String.class, Byte.TYPE}));
        f10648a.add(new a(42, Intent.class.getName(), "getShortExtra", new Class[]{String.class, Short.TYPE}));
        f10648a.add(new a(43, Intent.class.getName(), "getCharExtra", new Class[]{String.class, Character.TYPE}));
        f10648a.add(new a(44, Intent.class.getName(), "getIntExtra", new Class[]{String.class, Integer.TYPE}));
        f10648a.add(new a(45, Intent.class.getName(), "getLongExtra", new Class[]{String.class, Long.TYPE}));
        f10648a.add(new a(46, Intent.class.getName(), "getFloatExtra", new Class[]{String.class, Float.TYPE}));
        f10648a.add(new a(47, Intent.class.getName(), "getDoubleExtra", new Class[]{String.class, Double.TYPE}));
        f10648a.add(new a(48, Intent.class.getName(), "getStringExtra", new Class[]{String.class}));
        f10648a.add(new a(49, Display.class.getName(), "getWidth", new Class[0]));
        f10648a.add(new a(50, Display.class.getName(), "getHeight", new Class[0]));
        f10648a.add(new a(51, BluetoothAdapter.class.getName(), "getAddress", new Class[0]));
        f10648a.add(new a(52, Settings.Secure.class.getName(), "getString", new Class[]{ContentResolver.class, String.class}));
        f10648a.add(new a(53, ActivityManager.class.getName(), "getMemoryInfo", new Class[]{ActivityManager.MemoryInfo.class}));
        f10648a.add(new a(54, StatFs.class.getName(), "getBlockSize", new Class[0]));
        f10648a.add(new a(55, StatFs.class.getName(), "getBlockSizeLong", new Class[0]));
        f10648a.add(new a(56, StatFs.class.getName(), "getBlockCount", new Class[0]));
        f10648a.add(new a(57, StatFs.class.getName(), "getBlockCountLong", new Class[0]));
        f10648a.add(new a(58, StatFs.class.getName(), "getAvailableBlocks", new Class[0]));
        f10648a.add(new a(59, StatFs.class.getName(), "getAvailableBlocksLong", new Class[0]));
        f10648a.add(new a(60, Location.class.getName(), "getLatitude", new Class[0]));
        f10648a.add(new a(61, Location.class.getName(), "getLongitude", new Class[0]));
        f10648a.add(new a(62, InetAddress.class.getName(), "isLoopbackAddress", new Class[0]));
        f10648a.add(new a(63, "android.os.SystemProperties", ContactEventType.CONTACT_GET, new Class[]{String.class}));
    }

    public static String a(String str) {
        for (a next : f10648a) {
            if (str.contains(next.b) && str.contains(next.c)) {
                Class[] clsArr = next.d;
                StringBuilder sb = new StringBuilder();
                for (Class cls : clsArr) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(cls.getName());
                }
                if (str.contains(sb.toString())) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(next.b);
                    sb2.append("#");
                    sb2.append(next.c);
                    return sb2.toString();
                }
            }
        }
        return "";
    }
}
