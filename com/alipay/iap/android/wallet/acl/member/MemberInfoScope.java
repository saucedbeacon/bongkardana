package com.alipay.iap.android.wallet.acl.member;

import java.util.Map;
import java.util.Set;

public class MemberInfoScope {
    private String appId;
    private Map<String, String> extendedInfo;
    private Set<String> scopes;

    public MemberInfoScope(String str, Set<String> set, Map<String, String> map) {
        this.appId = str;
        this.scopes = set;
        this.extendedInfo = map;
    }

    public String getAppId() {
        return this.appId;
    }

    public void setAppId(String str) {
        this.appId = str;
    }

    public Set<String> getScopes() {
        return this.scopes;
    }

    public void setScopes(Set<String> set) {
        this.scopes = set;
    }

    public Map<String, String> getExtendedInfo() {
        return this.extendedInfo;
    }

    public void setExtendedInfo(Map<String, String> map) {
        this.extendedInfo = map;
    }
}
