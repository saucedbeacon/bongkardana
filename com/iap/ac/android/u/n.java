package com.iap.ac.android.u;

import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.Result;
import com.alipay.iap.android.wallet.acl.member.MemberInfo;
import com.alipay.iap.android.wallet.acl.member.MemberInfoResult;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import o.SavedStateHandleController;

public class n implements Callback<MemberInfoResult> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ p f9769a;

    public /* synthetic */ n() {
    }

    public n(p pVar) {
        this.f9769a = pVar;
    }

    public void result(Result result) {
        MemberInfo memberInfo;
        MemberInfoResult memberInfoResult = (MemberInfoResult) result;
        if (memberInfoResult == null || (memberInfo = memberInfoResult.memberInfo) == null) {
            this.f9769a.a("getOpenId", "ACL getMemberInfo for userId error, result:".concat(String.valueOf(memberInfoResult)));
            return;
        }
        this.f9769a.b = memberInfo.userId;
    }

    public static /* synthetic */ void setMax(JsonReader jsonReader, SavedStateHandleController.AnonymousClass1 r3) {
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
