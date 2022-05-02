package com.iap.ac.android.l;

import android.os.SystemClock;
import com.iap.ac.android.biz.common.base.BaseNetwork;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.rpc.facade.MobilePaymentHoldLoginRpcFacade;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentHoldLoginRequest;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentHoldLoginResult;
import com.iap.ac.android.biz.common.utils.Utils;
import com.iap.ac.android.common.log.ACLog;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class a extends BaseNetwork<MobilePaymentHoldLoginRpcFacade> {
    public synchronized boolean a(String str, String str2, String str3) {
        int i;
        long elapsedRealtime;
        if (str != null) {
            try {
                i = str.length();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            i = 0;
        }
        int max = dispatchOnCancelled.setMax(i);
        if (i != max) {
            onCanceled oncanceled = new onCanceled(i, max, 1);
            onCancelLoad.setMax(460291815, oncanceled);
            onCancelLoad.getMin(460291815, oncanceled);
        }
        elapsedRealtime = SystemClock.elapsedRealtime();
        MobilePaymentHoldLoginRequest mobilePaymentHoldLoginRequest = new MobilePaymentHoldLoginRequest();
        mobilePaymentHoldLoginRequest.instanceId = str;
        mobilePaymentHoldLoginRequest.openId = str3;
        mobilePaymentHoldLoginRequest.nonce = Utils.getNonce();
        mobilePaymentHoldLoginRequest.timestamp = System.currentTimeMillis();
        mobilePaymentHoldLoginRequest.clientKeyDigest = Utils.SHA256(String.format("%s||%s||%s", new Object[]{str2, mobilePaymentHoldLoginRequest.nonce, String.valueOf(mobilePaymentHoldLoginRequest.timestamp)}));
        MobilePaymentHoldLoginResult holdLogin = ((MobilePaymentHoldLoginRpcFacade) getFacade()).holdLogin(mobilePaymentHoldLoginRequest);
        if (holdLogin == null || !holdLogin.success) {
            ACLog.e(Constants.TAG, "holdLoginInWorker error: ".concat(String.valueOf(holdLogin)));
            if (holdLogin != null) {
                reportRpcResult("ac_common_hold_login", false, holdLogin.errorCode, holdLogin.errorMessage, SystemClock.elapsedRealtime() - elapsedRealtime, holdLogin.traceId);
            } else {
                reportRpcResult("ac_common_hold_login", false, ResultCode.INVALID_NETWORK, "Oops! System busy. Try again later!", SystemClock.elapsedRealtime() - elapsedRealtime, "");
            }
        } else {
            ACLog.i(Constants.TAG, "holdLoginInWorker success");
            reportRpcResult("ac_common_hold_login", true, (String) null, (String) null, SystemClock.elapsedRealtime() - elapsedRealtime, holdLogin.traceId);
            return true;
        }
        return false;
    }

    public Class<MobilePaymentHoldLoginRpcFacade> getFacadeClass() {
        return MobilePaymentHoldLoginRpcFacade.class;
    }
}
