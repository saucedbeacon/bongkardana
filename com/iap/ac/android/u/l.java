package com.iap.ac.android.u;

import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.Result;
import com.alipay.iap.android.wallet.acl.payment.PaymentResult;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.iap.ac.android.biz.common.callback.IPayCallback;
import com.iap.ac.android.biz.common.model.PayResult;
import com.iap.ac.android.biz.common.model.PayResultCode;
import o.SavedStateHandleController;

public class l implements Callback<PaymentResult> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IPayCallback f9767a;

    public /* synthetic */ l() {
    }

    public l(m mVar, IPayCallback iPayCallback) {
        this.f9767a = iPayCallback;
    }

    public void result(Result result) {
        PaymentResult paymentResult = (PaymentResult) result;
        if (paymentResult == null) {
            paymentResult = new PaymentResult();
            paymentResult.setResultCode("4000");
            paymentResult.setResultMessage("paymentResult null from acl");
        }
        PayResult payResult = new PayResult();
        String resultCode = paymentResult.getResultCode();
        char c = 65535;
        int hashCode = resultCode.hashCode();
        if (hashCode != 1656379) {
            if (hashCode != 1715960) {
                if (hashCode == 1745751 && resultCode.equals("9000")) {
                    c = 0;
                }
            } else if (resultCode.equals("8000")) {
                c = 1;
            }
        } else if (resultCode.equals("6001")) {
            c = 2;
        }
        if (c == 0) {
            payResult.setResultCode(PayResultCode.PAY_SUCCESS);
        } else if (c == 1) {
            payResult.setResultCode(PayResultCode.PAY_PENDING);
        } else if (c != 2) {
            payResult.setResultCode(PayResultCode.PAY_FAILURE);
        } else {
            payResult.setResultCode("USER_CANCEL");
        }
        payResult.setResultMessage(paymentResult.getResultMessage());
        IPayCallback iPayCallback = this.f9767a;
        if (iPayCallback != null) {
            iPayCallback.onResult(payResult);
        }
    }

    public static /* synthetic */ void getMin(JsonReader jsonReader, SavedStateHandleController.AnonymousClass1 r3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r3.getMin(jsonReader);
            do {
                jsonReader.peek();
                JsonToken jsonToken = JsonToken.NULL;
            } while (min == 21);
            jsonReader.skipValue();
        }
        jsonReader.endObject();
    }
}
