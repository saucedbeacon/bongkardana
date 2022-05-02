package com.iap.ac.android.u;

import android.text.TextUtils;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.Result;
import com.alipay.iap.android.wallet.foundation.code.ScannerResult;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.iap.ac.android.biz.common.model.ScanCallback;
import com.iap.ac.android.biz.common.model.ScanErrorCode;
import o.SavedStateHandleController;

public class i implements Callback<ScannerResult> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ScanCallback f9764a;

    public /* synthetic */ i() {
    }

    public i(k kVar, ScanCallback scanCallback) {
        this.f9764a = scanCallback;
    }

    public void result(Result result) {
        ScannerResult scannerResult = (ScannerResult) result;
        if (scannerResult == null || TextUtils.isEmpty(scannerResult.getCode())) {
            ScanCallback scanCallback = this.f9764a;
            if (scanCallback != null) {
                scanCallback.onFailure(ScanErrorCode.OPERATION_FAIL, "Oops! System busy. Try again later!");
                return;
            }
            return;
        }
        this.f9764a.onSuccess(scannerResult.getCode());
    }

    public static /* synthetic */ void setMin(JsonReader jsonReader, SavedStateHandleController.AnonymousClass1 r3) {
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
