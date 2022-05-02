package com.alipay.iap.android.aplog.core;

import android.content.Context;
import com.alipay.iap.android.aplog.api.DeviceIdProvider;
import java.lang.reflect.Method;

public class UtdidDeviceIdProvider implements DeviceIdProvider {
    private static final String TAG = "UtdidDeviceIdProvider";

    public String getDeviceId() {
        Method declaredMethod;
        try {
            Class<?> cls = Class.forName("com.ut.device.UTDevice");
            if (cls == null || (declaredMethod = cls.getDeclaredMethod("getUtdid", new Class[]{Context.class})) == null) {
                return " ";
            }
            return (String) declaredMethod.invoke((Object) null, new Object[]{LoggerFactory.getLogContext().getApplicationContext()});
        } catch (Exception e) {
            LoggerFactory.getTraceLogger().error(TAG, (Throwable) e);
            return " ";
        }
    }
}
