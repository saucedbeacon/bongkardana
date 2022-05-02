package com.alipay.plus.android.push.fcm;

import android.app.Application;
import android.content.Context;
import java.lang.reflect.Method;

public class UtdidDeviceIdProvider {
    private static final String TAG = "UtdidDeviceIdProvider";

    public static String getDeviceId(Application application) {
        Method declaredMethod;
        if (application == null) {
            return " ";
        }
        try {
            Class<?> cls = Class.forName("com.ut.device.UTDevice");
            if (cls == null || (declaredMethod = cls.getDeclaredMethod("getUtdid", new Class[]{Context.class})) == null) {
                return " ";
            }
            return (String) declaredMethod.invoke((Object) null, new Object[]{application});
        } catch (Exception unused) {
            return " ";
        }
    }
}
