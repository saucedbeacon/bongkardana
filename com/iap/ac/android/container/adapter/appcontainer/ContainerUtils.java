package com.iap.ac.android.container.adapter.appcontainer;

import android.app.Activity;
import android.os.Build;
import com.alibaba.fastjson.JSON;
import com.alipay.mobile.h5container.service.H5Service;
import com.alipay.mobile.nebula.util.H5Utils;
import com.iap.ac.android.common.log.ACLog;
import org.json.JSONObject;

public class ContainerUtils {
    private static final String TAG = "";

    public static JSONObject fastJsonToJson(com.alibaba.fastjson.JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new JSONObject(jSONObject.toString());
        } catch (Exception e) {
            ACLog.e("", "fastJsonToJson error: ", e);
            return null;
        }
    }

    public static com.alibaba.fastjson.JSONObject jsonObjectToFastJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return JSON.parseObject(jSONObject.toString());
        } catch (Exception e) {
            ACLog.e("", "jsonObjectToFastJson error: ", e);
            return null;
        }
    }

    public static boolean isACContainerExist() {
        try {
            return Class.forName("com.iap.ac.android.container.ACContainer") != null;
        } catch (ClassNotFoundException e) {
            ACLog.w("", "ACContainer library not found.", e);
            return false;
        }
    }

    public static boolean isAppContainerExist() {
        try {
            return Class.forName("com.alipay.iap.android.webapp.sdk.kit.AppContainerKit") != null;
        } catch (ClassNotFoundException e) {
            ACLog.w("", "AppContainer library not found.", e);
            return false;
        }
    }

    public static boolean isAppContainerInit() {
        return ((H5Service) H5Utils.findServiceByInterface(H5Service.class.getName())) != null;
    }

    public static boolean isActivityRunning(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 17 || !activity.isDestroyed()) {
            return true;
        }
        return false;
    }
}
