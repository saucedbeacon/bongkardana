package com.iap.ac.android.t;

import android.os.SystemClock;
import com.iap.ac.android.acs.multilanguage.utils.MultiLanguageLogger;
import com.iap.ac.android.biz.common.base.BaseNetwork;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.rpc.facade.MobilePaymentTokenIdPostFacade;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentTokenIdPostRequest;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentTokenIdPostResult;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;

public class a extends BaseNetwork<MobilePaymentTokenIdPostFacade> {
    public boolean a(String str) {
        MobilePaymentTokenIdPostRequest mobilePaymentTokenIdPostRequest = new MobilePaymentTokenIdPostRequest();
        mobilePaymentTokenIdPostRequest.apdidToken = str;
        int i = 0;
        while (i < 3) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            try {
                MobilePaymentTokenIdPostResult reportTokenId = ((MobilePaymentTokenIdPostFacade) getFacade()).reportTokenId(mobilePaymentTokenIdPostRequest);
                if (reportTokenId == null || !reportTokenId.success) {
                    if (reportTokenId != null) {
                        String str2 = reportTokenId.traceId;
                        a(false, reportTokenId.errorCode, reportTokenId.errorMessage, SystemClock.elapsedRealtime() - elapsedRealtime, str2);
                    } else {
                        a(false, (String) null, (String) null, SystemClock.elapsedRealtime() - elapsedRealtime, (String) null);
                    }
                    Thread.sleep(500);
                    i++;
                } else {
                    a(true, (String) null, (String) null, SystemClock.elapsedRealtime() - elapsedRealtime, reportTokenId.traceId);
                    return true;
                }
            } catch (Throwable unused) {
                a(false, (String) null, (String) null, SystemClock.elapsedRealtime() - elapsedRealtime, (String) null);
            }
        }
        return false;
    }

    public Class<MobilePaymentTokenIdPostFacade> getFacadeClass() {
        return MobilePaymentTokenIdPostFacade.class;
    }

    public final void a(boolean z, String str, String str2, long j, String str3) {
        ACLog.d(Constants.TAG, String.format("reportUploadTokenIdResult: %s, errorCode: %s, errorMessage: %s", new Object[]{Boolean.valueOf(z), str, str2}));
        if (z) {
            ACLogEvent.commonRpcSuccessEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_apdidtoken_upload", j, str3);
        } else {
            ACLogEvent.commonRpcFailEvent(MultiLanguageLogger.BIZCODE_CENTER, "ac_apdidtoken_upload", str, str2, j, str3);
        }
    }
}
