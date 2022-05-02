package com.ta.utdid2.a.a;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Random;

public class d {
    public static String getUniqueID() {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        int nanoTime = (int) System.nanoTime();
        int nextInt = new Random().nextInt();
        int nextInt2 = new Random().nextInt();
        byte[] bytes = c.getBytes(currentTimeMillis);
        byte[] bytes2 = c.getBytes(nanoTime);
        byte[] bytes3 = c.getBytes(nextInt);
        byte[] bytes4 = c.getBytes(nextInt2);
        byte[] bArr = new byte[16];
        System.arraycopy(bytes, 0, bArr, 0, 4);
        System.arraycopy(bytes2, 0, bArr, 4, 4);
        System.arraycopy(bytes3, 0, bArr, 8, 4);
        System.arraycopy(bytes4, 0, bArr, 12, 4);
        return b.encodeToString(bArr, 2);
    }

    public static String getImei(Context context) {
        String str = null;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    str = telephonyManager.getDeviceId();
                }
            } catch (Exception unused) {
            }
        }
        if (e.isEmpty(str)) {
            str = Y();
        }
        return e.isEmpty(str) ? getUniqueID() : str;
    }

    private static String Y() {
        String str = f.get("ro.aliyun.clouduuid", "");
        if (TextUtils.isEmpty(str)) {
            str = f.get("ro.sys.aliyun.clouduuid", "");
        }
        return TextUtils.isEmpty(str) ? Z() : str;
    }

    private static String Z() {
        try {
            return (String) Class.forName("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            return "";
        }
    }

    public static String getImsi(Context context) {
        String str = null;
        if (context != null) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                if (telephonyManager != null) {
                    str = telephonyManager.getSubscriberId();
                }
            } catch (Exception unused) {
            }
        }
        return e.isEmpty(str) ? getUniqueID() : str;
    }
}
