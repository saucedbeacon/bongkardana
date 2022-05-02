package com.iap.ac.android.common.instance;

import android.content.Context;
import androidx.annotation.NonNull;

public class InstanceInfo {
    private static final String TAG = "InstanceInfo";
    private static IInstanceInfo instanceInfo;

    public static String getInstanceId(@NonNull Context context) {
        IInstanceInfo iInstanceInfo = instanceInfo;
        if (iInstanceInfo != null) {
            return iInstanceInfo.getInstanceId(context);
        }
        return null;
    }

    public static String getTid(@NonNull Context context) {
        IInstanceInfo iInstanceInfo = instanceInfo;
        if (iInstanceInfo != null) {
            return iInstanceInfo.getTid(context);
        }
        return null;
    }

    public static IInstanceInfo getInstanceInfoImpl() {
        return instanceInfo;
    }

    public static void setInstanceInfoImpl(IInstanceInfo iInstanceInfo) {
        instanceInfo = iInstanceInfo;
    }
}
