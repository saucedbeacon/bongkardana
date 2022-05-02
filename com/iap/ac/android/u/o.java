package com.iap.ac.android.u;

import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.Result;
import com.alipay.iap.android.wallet.acl.member.MemberInfo;
import com.alipay.iap.android.wallet.acl.member.MemberInfoResult;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.biz.common.model.OpenUserInfo;
import com.iap.ac.android.biz.common.model.OpenUserInfoCallback;
import java.util.Map;
import o.SavedStateHandleController;
import o.desc;

public class o implements Callback<MemberInfoResult> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ OpenUserInfoCallback f9770a;
    public final /* synthetic */ p b;

    public /* synthetic */ o() {
    }

    public o(p pVar, OpenUserInfoCallback openUserInfoCallback) {
        this.b = pVar;
        this.f9770a = openUserInfoCallback;
    }

    public void result(Result result) {
        MemberInfo memberInfo;
        MemberInfoResult memberInfoResult = (MemberInfoResult) result;
        OpenUserInfo openUserInfo = new OpenUserInfo();
        if (memberInfoResult == null || (memberInfo = memberInfoResult.memberInfo) == null) {
            this.b.a(Constants.JS_API_GET_OPEN_USER_INFO, "ACL getMemberInfo error, result:".concat(String.valueOf(memberInfoResult)));
        } else {
            openUserInfo.avatar = memberInfo.avatar;
            Map<String, String> map = memberInfo.extendedInfo;
            if (map != null) {
                openUserInfo.city = map.get(desc.USER_CITY);
                openUserInfo.countryCode = memberInfoResult.memberInfo.extendedInfo.get(RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
                openUserInfo.province = memberInfoResult.memberInfo.extendedInfo.get("province");
                openUserInfo.nickName = memberInfoResult.memberInfo.extendedInfo.get("nickName");
            }
            MemberInfo memberInfo2 = memberInfoResult.memberInfo;
            openUserInfo.gender = memberInfo2.gender;
            openUserInfo.loginId = memberInfo2.loginId;
            openUserInfo.userId = memberInfo2.userId;
            openUserInfo.userName = memberInfo2.userName;
        }
        OpenUserInfoCallback openUserInfoCallback = this.f9770a;
        if (openUserInfoCallback != null) {
            openUserInfoCallback.onGetOpenUserInfo(openUserInfo);
        }
    }

    public static /* synthetic */ void length(JsonReader jsonReader, SavedStateHandleController.AnonymousClass1 r3) {
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
