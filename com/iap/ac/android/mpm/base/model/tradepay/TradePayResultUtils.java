package com.iap.ac.android.mpm.base.model.tradepay;

import android.text.TextUtils;
import com.iap.ac.android.a.a;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.ResultCode;
import org.json.JSONObject;

public class TradePayResultUtils {
    public static final String RESULT_CODE_KEY = "resultCode";
    public static final String TRADE_PAY_CODE_PAY_CANCELED = "6001";
    public static final String TRADE_PAY_CODE_PAY_FAILED = "4000";
    public static final String TRADE_PAY_CODE_PAY_PROCESSING = "8000";
    public static final String TRADE_PAY_CODE_PAY_SUCCEED = "9000";

    public static JSONObject getTradePayResultJsonObject(String str) {
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (TextUtils.equals("SUCCESS", str)) {
            str2 = "9000";
        } else if (TextUtils.equals(ResultCode.PROCESSING, str)) {
            str2 = "8000";
        } else {
            str2 = TextUtils.equals(str, "USER_CANCEL") ? "6001" : "4000";
        }
        try {
            jSONObject.put("resultCode", str2);
        } catch (Throwable th) {
            a.a("getTradePayResultJsonObject exception: ", th, Constants.TAG);
        }
        return jSONObject;
    }
}
