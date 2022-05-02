package com.iap.ac.android.biz.acs;

import com.alibaba.griver.image.photo.utils.DiskFormatter;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.event.LogEventType;

public class AcBizLog {
    public static final String FUNC_NAME_PRECREATE = "handleAcTradePay";

    public static void onCallPreCreateOrder(String str, String str2, String str3, boolean z, boolean z2) {
        ACLogEvent addParams = ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_mp_tradepay_on_call_precreate").addParams("appId", str).addParams("defaultAcquirerId", str2).addParams("currentAcquirerId", str3);
        String str4 = DiskFormatter.TB;
        ACLogEvent addParams2 = addParams.addParams("hasOrderStr", z ? str4 : "F");
        if (!z2) {
            str4 = "F";
        }
        addParams2.addParams("hasTradeNO", str4).event();
    }

    public static void onCallPreCreateOrderError(String str) {
        ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_mp_tradepay_call_error").setEventType(LogEventType.CRUCIAL_LOG).addParams("functionName", FUNC_NAME_PRECREATE).addParams("resultMessage", str).event();
    }
}
