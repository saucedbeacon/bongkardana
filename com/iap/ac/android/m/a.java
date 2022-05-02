package com.iap.ac.android.m;

import android.os.SystemClock;
import com.iap.ac.android.biz.common.base.BaseNetwork;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.LogResult;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.rpc.facade.MobilePaymentLogoutRpcFacade;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentLogoutRequest;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentLogoutResult;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;

public class a extends BaseNetwork<MobilePaymentLogoutRpcFacade> {
    public boolean a() {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        LogResult logResult = new LogResult();
        try {
            MobilePaymentLogoutResult logout = ((MobilePaymentLogoutRpcFacade) getFacade()).logout(new MobilePaymentLogoutRequest());
            if (logout == null || !logout.success) {
                if (logout != null) {
                    logResult.resultCode = logout.errorCode;
                    logResult.resultMessage = logout.errorMessage;
                    logResult.traceId = logout.traceId;
                } else {
                    logResult.resultCode = ResultCode.INVALID_NETWORK;
                    logResult.resultMessage = "empty RPC result from server";
                }
                ACLogEvent.commonEvent("ac_common_auth_logout", elapsedRealtime, logResult);
                return false;
            }
            logResult.resultCode = "SUCCESS";
            logResult.traceId = logout.traceId;
            ACLogEvent.commonEvent("ac_common_auth_logout", elapsedRealtime, logResult);
            return true;
        } catch (Exception e) {
            String concat = "LogoutProcessor exception: ".concat(String.valueOf(e));
            ACLog.e(Constants.TAG, concat);
            logResult.resultCode = ResultCode.INVALID_NETWORK;
            logResult.resultMessage = concat;
        } catch (Throwable th) {
            ACLogEvent.commonEvent("ac_common_auth_logout", elapsedRealtime, logResult);
            throw th;
        }
    }

    public Class<MobilePaymentLogoutRpcFacade> getFacadeClass() {
        return MobilePaymentLogoutRpcFacade.class;
    }
}
