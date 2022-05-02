package com.ap.zoloz.hummer.h5;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.utils.StringUtil;
import com.ap.zoloz.hummer.api.BaseFacade;
import com.ap.zoloz.hummer.biz.HummerLogger;

public class ZolozBaseH5Handler {
    public static final String TAG = "ZolozBaseH5Handler";
    private static final String ZIM_IDENTIFY_ACTION = "action";
    public static final String ZIM_IDENTIFY_GET_META_INFO = "getMetaInfo";

    public void identify(JSONObject jSONObject, Context context, IH5HandlerCallback iH5HandlerCallback) {
        if (jSONObject != null && context != null) {
            StringBuilder sb = new StringBuilder(" jsapi");
            sb.append(jSONObject.toJSONString());
            HummerLogger.i(TAG, sb.toString());
            String string = jSONObject.getString("action");
            if (!StringUtil.isNullorEmpty(string) && iH5HandlerCallback != null && ZIM_IDENTIFY_GET_META_INFO.equals(string)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("metaInfo", (Object) BaseFacade.getMetaInfo(context.getApplicationContext()));
                iH5HandlerCallback.onCompletion(jSONObject2);
            }
        }
    }
}
