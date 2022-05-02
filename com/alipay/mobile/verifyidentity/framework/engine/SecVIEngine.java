package com.alipay.mobile.verifyidentity.framework.engine;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.mobile.verifyidentity.base.message.ProductConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class SecVIEngine extends VIEngine {
    public static String envDataWithOption(int i, Context context) {
        if (i == 1) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("envData", VIEngineUtils.getEnvData(context));
            } catch (JSONException unused) {
            }
            return jSONObject.toString();
        } else if (i == 2) {
            JSONObject jSONObject2 = new JSONObject();
            if (ifaaData != null) {
                try {
                    jSONObject2.put("secData", ifaaData.getPayData(context));
                } catch (JSONException unused2) {
                }
            }
            return jSONObject2.toString();
        } else if (i != 3) {
            return "";
        } else {
            JSONObject jSONObject3 = new JSONObject();
            if (!TextUtils.isEmpty(VIEngineUtils.getZolozFaceData(context.getApplicationContext()))) {
                try {
                    jSONObject3.put(ProductConstants.KEY_PRODUCT_ENV_ZOLOZ, VIEngineUtils.getZolozFaceData(context.getApplicationContext()));
                } catch (JSONException unused3) {
                }
            }
            return jSONObject3.toString();
        }
    }

    public static void queryAuthenticationStatusWithOption(Context context, int i, Map<String, Object> map, QueryStateInterface queryStateInterface) {
        if (i != 2 && i == 3) {
            ProductUtils.getFaceState(context, map, queryStateInterface);
        }
    }
}
