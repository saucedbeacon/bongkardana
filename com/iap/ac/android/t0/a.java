package com.iap.ac.android.t0;

import android.os.SystemClock;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.model.LogResult;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.log.event.LogEventType;
import com.iap.ac.android.mpm.base.model.oauth.result.PrepareCollectionCodeAuthResult;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public com.iap.ac.android.u0.a f9756a = new com.iap.ac.android.u0.a();

    public PrepareCollectionCodeAuthResult a(String str, String str2) throws Exception {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LogResult logResult = new LogResult();
        try {
            PrepareCollectionCodeAuthResult a2 = this.f9756a.a(str, str2);
            if (a2 != null) {
                logResult.resultCode = a2.success ? "SUCCESS" : a2.errorCode;
                logResult.resultMessage = a2.errorMessage;
                logResult.traceId = a2.traceId;
            } else {
                logResult.resultMessage = "prepare result is null";
                logResult.resultCode = ResultCode.UNKNOWN_EXCEPTION;
                logResult.traceId = "";
            }
            if (a2 == null || !a2.success) {
                ACLogEvent.newLogger(MultiLanguageLogger.BIZCODE_CENTER, "ac_mpm_collectioncode_auth_prepare_error").addParams("resultMessage", logResult.resultMessage).addParams("resultCode", logResult.resultCode).addParams("traceId", logResult.traceId).setEventType(LogEventType.CRUCIAL_LOG).event();
            }
            ACLogEvent.commonEvent("ac_mpm_collectioncode_auth_prepare", elapsedRealtime, logResult);
            return a2;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("prepareCollectionCodeAuth error:");
            sb.append(Utils.e(e));
            ACLog.e("CollectionCodeAuthRepository", sb.toString());
            ACLogEvent.crucialEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_mpm_collectioncode_auth_prepare_error", Utils.e(e));
            throw e;
        } catch (Throwable th) {
            ACLogEvent.commonEvent("ac_mpm_collectioncode_auth_prepare", elapsedRealtime, logResult);
            throw th;
        }
    }
}
