package com.iap.ac.android.u;

import com.alipay.iap.android.wallet.acl.base.BaseResult;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.Result;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.iap.ac.android.biz.common.callback.OpenBizSceneCallback;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.common.json.JsonUtils;
import com.iap.ac.android.common.log.ACLog;
import o.SavedStateHandleController;
import org.json.JSONException;
import org.json.JSONObject;

public class j implements Callback<BaseResult> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OpenBizSceneCallback f9765a;

    public /* synthetic */ j() {
    }

    public j(k kVar, OpenBizSceneCallback openBizSceneCallback) {
        this.f9765a = openBizSceneCallback;
    }

    public void result(Result result) {
        JSONObject jSONObject;
        BaseResult baseResult = (BaseResult) result;
        try {
            jSONObject = new JSONObject(JsonUtils.toJson(baseResult));
            try {
                jSONObject.put("success", !baseResult.isHasError());
            } catch (JSONException e) {
                e = e;
            }
        } catch (JSONException e2) {
            e = e2;
            jSONObject = null;
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            ACLog.w(Constants.TAG, "openBizScene json error: ".concat(String.valueOf(e)));
            this.f9765a.sendJSONResponse(jSONObject);
        }
        this.f9765a.sendJSONResponse(jSONObject);
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
