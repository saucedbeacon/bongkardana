package com.iap.ac.android.q0;

import com.iap.ac.android.biz.common.callback.IPayCallback;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.PayResult;
import com.iap.ac.android.biz.common.model.PayResultCode;
import com.iap.ac.android.biz.common.model.Result;
import com.iap.ac.android.biz.common.model.ResultCode;
import com.iap.ac.android.biz.common.utils.log.ACLogEvent;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.mpm.base.interfaces.INodeCallback;
import com.iap.ac.android.mpm.base.model.route.DecodeActionType;

public class a implements IPayCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ long f9755a;
    public final /* synthetic */ INodeCallback b;

    public a(b bVar, long j, INodeCallback iNodeCallback) {
        this.f9755a = j;
        this.b = iNodeCallback;
    }

    public void onResult(PayResult payResult) {
        ACLog.i(Constants.TAG, "pay finished");
        if (payResult == null) {
            payResult = new PayResult();
            payResult.setResultCode(PayResultCode.PAY_FAILURE);
            payResult.setResultMessage(ResultCode.PARAM_ILLEGAL);
        }
        Result result = new Result(payResult, false);
        ACLogEvent.commonEvent("ac_pay_end", this.f9755a, result);
        Result result2 = new Result(payResult, true);
        d dVar = new d();
        dVar.e = payResult;
        dVar.f9748a = result2;
        dVar.b = result.resultCode;
        dVar.c = result.resultMessage;
        dVar.d = DecodeActionType.PAY;
        this.b.onResult(dVar);
    }
}
