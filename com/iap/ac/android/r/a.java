package com.iap.ac.android.r;

import androidx.annotation.NonNull;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.model.LogResult;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.model.multilanguage.querycity.CityQueryRpcResult;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.event.LogEventType;
import com.iap.ac.android.s.b;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public b f11064a = new b();

    public CityQueryRpcResult a(@NonNull String str, @NonNull List<String> list) throws Exception {
        LogResult logResult = new LogResult();
        try {
            CityQueryRpcResult a2 = this.f11064a.a(str, list);
            if (a2 != null) {
                logResult.resultCode = a2.success ? "SUCCESS" : a2.errorCode;
                logResult.resultMessage = a2.errorMessage;
                logResult.traceId = a2.traceId;
            } else {
                logResult.resultMessage = "queryCity result is null";
                logResult.resultCode = ResultCode.UNKNOWN_EXCEPTION;
                logResult.traceId = "";
            }
            if (a2 == null || !a2.success) {
                ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_multilanguage_query_city_fail").addParams("resultMessage", logResult.resultMessage).addParams("resultCode", logResult.resultCode).addParams("traceId", logResult.traceId).setEventType(LogEventType.CRUCIAL_LOG).event();
            }
            return a2;
        } catch (Throwable th) {
            ACLog.e("QueryCityRepository", "queryCity error:".concat(String.valueOf(th)));
            ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_multilanguage_query_city_fail", Utils.e(th));
            throw th;
        }
    }
}
