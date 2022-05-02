package com.iap.ac.android.u;

import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.Result;
import com.alipay.iap.android.wallet.acl.base.ResultError;
import com.alipay.iap.android.wallet.acl.onboarding.TrustLoginInfoFetchResult;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.iap.ac.android.biz.common.model.AcCallback;
import com.iap.ac.android.biz.common.model.auth.TrustLoginInfo;
import o.SavedStateHandleController;

public class g implements Callback<TrustLoginInfoFetchResult> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AcCallback f9762a;
    public final /* synthetic */ h b;

    public /* synthetic */ g() {
    }

    public g(h hVar, AcCallback acCallback) {
        this.b = hVar;
        this.f9762a = acCallback;
    }

    public void result(Result result) {
        TrustLoginInfo trustLoginInfo;
        TrustLoginInfoFetchResult trustLoginInfoFetchResult = (TrustLoginInfoFetchResult) result;
        if (this.f9762a != null) {
            if (trustLoginInfoFetchResult == null) {
                trustLoginInfo = this.b.a("null result from ACL");
            } else {
                TrustLoginInfo trustLoginInfo2 = new TrustLoginInfo();
                trustLoginInfo2.signedCredential = trustLoginInfoFetchResult.getSignedCredential();
                trustLoginInfo2.success = !trustLoginInfoFetchResult.isHasError();
                ResultError resultError = trustLoginInfoFetchResult.getResultError();
                if (resultError != null) {
                    trustLoginInfo2.errorCode = String.valueOf(resultError.errorCode);
                    trustLoginInfo2.errorMessage = resultError.errorDesc;
                }
                trustLoginInfo = trustLoginInfo2;
            }
            this.f9762a.onResult(trustLoginInfo);
        }
    }

    public static /* synthetic */ void setMax(JsonReader jsonReader, SavedStateHandleController.AnonymousClass1 r3) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int min = r3.getMin(jsonReader);
            while (true) {
                jsonReader.peek();
                JsonToken jsonToken = JsonToken.NULL;
                if (min != 21 && min != 47) {
                    break;
                }
            }
            jsonReader.skipValue();
        }
        jsonReader.endObject();
    }
}
