package com.alipay.iap.android.wallet.acl.onboarding;

import com.alipay.iap.android.wallet.acl.base.BaseResult;
import java.util.Map;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class LoginResult extends BaseResult {
    private String clientKey;
    private Map<String, String> extendedInfo;
    private String sessionId;
    private String userId;

    public LoginResult(String str, String str2, String str3, Map<String, String> map) {
        this.userId = str;
        this.sessionId = str2;
        this.clientKey = str3;
        this.extendedInfo = map;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        int length = str != null ? str.length() : 0;
        int max = dispatchOnCancelled.setMax(length);
        if (length != max) {
            onCanceled oncanceled = new onCanceled(length, max, 1);
            onCancelLoad.setMax(-96662995, oncanceled);
            onCancelLoad.getMin(-96662995, oncanceled);
        }
        this.userId = str;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public String getClientKey() {
        return this.clientKey;
    }

    public void setClientKey(String str) {
        this.clientKey = str;
    }

    public Map<String, String> getExtendedInfo() {
        return this.extendedInfo;
    }

    public void setExtendedInfo(Map<String, String> map) {
        this.extendedInfo = map;
    }
}
