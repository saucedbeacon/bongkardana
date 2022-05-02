package com.ut.device;

import android.content.Context;
import com.ta.audid.a;

public class UTDevice {
    @Deprecated
    public static String getAid(String str, String str2, Context context) {
        return "";
    }

    @Deprecated
    public static void getAidAsync(String str, String str2, Context context, AidCallback aidCallback) {
    }

    public static String getUtdid(Context context) {
        return com.ta.utdid2.device.UTDevice.getUtdid(context);
    }

    @Deprecated
    public static String getUtdidForUpdate(Context context) {
        return com.ta.utdid2.device.UTDevice.getUtdidForUpdate(context);
    }

    public static void setAppKey(String str) {
        a.a().a(str);
    }

    public static void setAppChannel(String str) {
        a.a().setAppChannel(str);
    }

    @Deprecated
    public static void setDebug(boolean z) {
        a.a().setDebug(z);
    }

    @Deprecated
    public static void setOldMode(Context context, boolean z) {
        if (context != null) {
            a.a().a(context);
            a.a().a(z);
        }
    }
}
