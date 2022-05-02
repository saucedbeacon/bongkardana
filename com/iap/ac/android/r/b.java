package com.iap.ac.android.r;

import androidx.annotation.NonNull;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.model.LogResult;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.model.multilanguage.queryregioncode.RegionCodeQueryRpcResult;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.event.LogEventType;
import com.iap.ac.android.s.c;

public class b {

    /* renamed from: a  reason: collision with root package name */
    public c f11065a = new c();

    public RegionCodeQueryRpcResult a(@NonNull String str) throws Exception {
        LogResult logResult = new LogResult();
        try {
            RegionCodeQueryRpcResult a2 = this.f11065a.a(str);
            if (a2 != null) {
                logResult.resultCode = a2.success ? "SUCCESS" : a2.errorCode;
                logResult.resultMessage = a2.errorMessage;
                logResult.traceId = a2.traceId;
            } else {
                logResult.resultMessage = "queryRegionCode result is null";
                logResult.resultCode = ResultCode.UNKNOWN_EXCEPTION;
                logResult.traceId = "";
            }
            if (a2 == null || !a2.success) {
                ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_multilanguage_query_region_code_fail").addParams("resultMessage", logResult.resultMessage).addParams("resultCode", logResult.resultCode).addParams("traceId", logResult.traceId).setEventType(LogEventType.CRUCIAL_LOG).event();
            }
            return a2;
        } catch (Throwable th) {
            ACLog.e("QueryRegionCodeRepository", "queryRegionCode error:".concat(String.valueOf(th)));
            ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_multilanguage_query_region_code_fail", Utils.e(th));
            throw th;
        }
    }
}
