package com.ta.audid.a;

import android.content.Context;
import android.os.Build;
import com.ta.audid.g.i;
import com.ta.audid.g.n;

class f {
    public static boolean isEmulator(Context context) {
        try {
            if (Build.HARDWARE.contains("goldfish") || Build.PRODUCT.contains("sdk") || Build.FINGERPRINT.contains("generic")) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String l() {
        if (n.e()) {
            return "yp";
        }
        return n.f() ? "yt" : "a";
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static String m() {
        return Build.VERSION.RELEASE;
    }

    public static String n() {
        return Build.VERSION.SDK;
    }

    public static String o() {
        return Build.TYPE;
    }

    public static String p() {
        return Build.TAGS;
    }

    public static String q() {
        return Build.DISPLAY;
    }

    public static String getBuildID() {
        return Build.ID;
    }

    public static String r() {
        StringBuilder sb = new StringBuilder("");
        sb.append(Build.TIME);
        return sb.toString();
    }

    public static String s() {
        return Build.BOARD;
    }

    public static String t() {
        return Build.DEVICE;
    }

    public static String getManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String u() {
        return Build.PRODUCT;
    }

    public static String v() {
        return Build.VERSION.INCREMENTAL;
    }

    public static String w() {
        return i.get("gsm.sim.state", "");
    }

    public static String x() {
        return i.get("gsm.sim.state.2", "");
    }

    public static String y() {
        return i.get("ro.kernel.qemu", "0");
    }

    public static String z() {
        return i.get("sys.usb.state", "");
    }

    public static String A() {
        return i.get("wifi.interface", "");
    }

    public static String B() {
        return i.get("gsm.version.baseband", "");
    }
}
