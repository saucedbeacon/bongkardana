package com.iap.ac.android.k;

import android.content.Context;
import com.iap.ac.android.biz.common.base.BaseNetwork;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.rpc.facade.MobilePaymentLoginRpcFacade;
import com.iap.ac.android.biz.common.rpc.request.MobilePaymentLoginRequest;
import com.iap.ac.android.biz.common.rpc.result.MobilePaymentLoginResult;
import com.iap.ac.android.common.instance.InstanceInfo;
import com.iap.ac.android.common.log.ACLog;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class a extends BaseNetwork<MobilePaymentLoginRpcFacade> {
    public MobilePaymentLoginResult a(Context context, String str) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.setMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 8);
                onCancelLoad.setMax(1194437137, oncanceled);
                onCancelLoad.getMin(1194437137, oncanceled);
            }
        }
        MobilePaymentLoginRequest mobilePaymentLoginRequest = new MobilePaymentLoginRequest();
        mobilePaymentLoginRequest.instanceId = InstanceInfo.getInstanceId(context);
        mobilePaymentLoginRequest.authCode = str;
        ACLog.i(Constants.TAG, "startOAuthLogin begin");
        return ((MobilePaymentLoginRpcFacade) getFacade()).login(mobilePaymentLoginRequest);
    }

    public Class<MobilePaymentLoginRpcFacade> getFacadeClass() {
        return MobilePaymentLoginRpcFacade.class;
    }
}
