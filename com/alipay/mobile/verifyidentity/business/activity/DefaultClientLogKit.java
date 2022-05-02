package com.alipay.mobile.verifyidentity.business.activity;

import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.log.MonitorWrapper;
import com.iap.ac.android.gol.google.GolGoogleAuthActivity;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class DefaultClientLogKit implements ClientLogKit {
    public void log(String str, String[] strArr, Map<String, String> map, String str2, String str3, String str4, String str5, boolean z) {
        String str6;
        String valueOf = String.valueOf(System.currentTimeMillis() / 1000);
        if (strArr != null) {
            StringBuffer stringBuffer = new StringBuffer();
            for (String append : strArr) {
                stringBuffer.append(append);
                stringBuffer.append(",");
            }
            if (stringBuffer.length() > 0) {
                stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            }
            str6 = stringBuffer.toString();
        } else {
            str6 = "";
        }
        if (map == null) {
            map = new HashMap<>();
        }
        map.put(TinyAppLogUtil.TINY_APP_STANDARD_EXTRA_TIMESTAMP, valueOf);
        map.put("verifyId", str5);
        map.put(GolGoogleAuthActivity.URL_PARAM_BIZ_CONTENT, str6);
        map.put("seed", str3);
        MonitorWrapper.behaviour(str3, map);
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry next : map.entrySet()) {
            try {
                jSONObject.put((String) next.getKey(), next.getValue());
            } catch (JSONException unused) {
            }
        }
        LoggerWrapper.d("IAPLogTypeSecVICode", jSONObject.toString());
    }
}
