package com.iap.ac.android.g0;

import android.os.SystemClock;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.model.LogResult;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.event.LogEventType;
import com.iap.ac.android.mpm.base.model.decode.result.DecodeResult;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public com.iap.ac.android.h0.a f9713a = new com.iap.ac.android.h0.a();

    public DecodeResult a(String str, boolean z) throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LogResult logResult = new LogResult();
        try {
            DecodeResult a2 = this.f9713a.a(str, z);
            if (a2 != null) {
                logResult.resultCode = a2.success ? "SUCCESS" : a2.errorCode;
                logResult.resultMessage = a2.errorMessage;
                logResult.traceId = a2.traceId;
            } else {
                logResult.resultMessage = "decode result is null";
                logResult.resultCode = ResultCode.UNKNOWN_EXCEPTION;
                logResult.traceId = "";
            }
            if (a2 == null || !a2.success) {
                ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_mpm_code_scan_error").addParams("resultMessage", logResult.resultMessage).addParams("resultCode", logResult.resultCode).addParams("traceId", logResult.traceId).setEventType(LogEventType.CRUCIAL_LOG).event();
            }
            ACLogEvent.commonEvent("ac_mpm_code_scan", elapsedRealtime, logResult);
            return a2;
        } catch (Exception e) {
            ACLog.e("DecodeRepository", "decode error:".concat(String.valueOf(e)));
            ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_mpm_code_scan_error", Utils.e(e));
            throw e;
        } catch (Throwable th) {
            ACLogEvent.commonEvent("ac_mpm_code_scan", elapsedRealtime, logResult);
            throw th;
        }
    }
}
