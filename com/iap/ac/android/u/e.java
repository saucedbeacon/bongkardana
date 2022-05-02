package com.iap.ac.android.u;

import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.Result;
import com.alipay.iap.android.wallet.acl.oauth.OAuthPageConfirmResult;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.biz.common.model.AcCallback;
import com.iap.ac.android.biz.common.model.auth.AuthPageResult;
import o.SavedStateHandleController;

public class e implements Callback<OAuthPageConfirmResult> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ AcCallback f9760a;
    public final /* synthetic */ f b;

    public /* synthetic */ e() {
    }

    public e(f fVar, AcCallback acCallback) {
        this.b = fVar;
        this.f9760a = acCallback;
    }

    public void result(Result result) {
        OAuthPageConfirmResult oAuthPageConfirmResult = (OAuthPageConfirmResult) result;
        AuthPageResult authPageResult = new AuthPageResult();
        if (oAuthPageConfirmResult != null) {
            this.b.a(authPageResult, oAuthPageConfirmResult);
        } else {
            this.b.a(Constants.JS_API_GET_AUTH_CODE, "ACL showAuthPage for agree payment error, result is null");
        }
        AcCallback acCallback = this.f9760a;
        if (acCallback != null) {
            acCallback.onResult(authPageResult);
        }
    }

    public static /* synthetic */ void setMin(JsonReader jsonReader, SavedStateHandleController.AnonymousClass1 r3) {
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
