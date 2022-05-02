package com.iap.ac.android.u;

import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.Result;
import com.alipay.iap.android.wallet.acl.oauth.OAuthResult;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.biz.common.callback.IAuthCallback;
import com.iap.ac.android.biz.common.model.AuthResult;
import o.SavedStateHandleController;

public class c implements Callback<OAuthResult> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ IAuthCallback f9758a;
    public final /* synthetic */ f b;

    public /* synthetic */ c() {
    }

    public c(f fVar, IAuthCallback iAuthCallback) {
        this.b = fVar;
        this.f9758a = iAuthCallback;
    }

    public void result(Result result) {
        OAuthResult oAuthResult = (OAuthResult) result;
        AuthResult authResult = new AuthResult();
        if (oAuthResult != null) {
            this.b.a(authResult, oAuthResult);
        } else {
            this.b.a(Constants.JS_API_GET_AUTH_CODE, "ACL getAuthCode for agree payment error, result is null");
        }
        IAuthCallback iAuthCallback = this.f9758a;
        if (iAuthCallback != null) {
            iAuthCallback.onResult(authResult);
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
