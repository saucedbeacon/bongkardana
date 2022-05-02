package com.alipay.iap.android.wallet.acl.member;

import java.util.Map;

public class MemberInfo {
    public String avatar;
    public String birthday;
    public Map<String, String> extendedInfo;
    public String gender;
    public String loginId;
    public String loginIdType;
    public String sessionId;
    public String userId;
    public String userName;

    public MemberInfo() {
    }

    public MemberInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Map<String, String> map) {
        this.userId = str;
        this.sessionId = str2;
        this.loginId = str3;
        this.loginIdType = str4;
        this.avatar = str5;
        this.gender = str6;
        this.birthday = str7;
        this.userName = str8;
        this.extendedInfo = map;
    }

    public String getSessionId() {
        return this.sessionId;
    }

    public void setSessionId(String str) {
        this.sessionId = str;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String str) {
        this.userId = str;
    }

    public String getLoginId() {
        return this.loginId;
    }

    public void setLoginId(String str) {
        this.loginId = str;
    }

    public String getLoginIdType() {
        return this.loginIdType;
    }

    public void setLoginIdType(String str) {
        this.loginIdType = str;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public void setAvatar(String str) {
        this.avatar = str;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String str) {
        this.gender = str;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String str) {
        this.birthday = str;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String str) {
        this.userName = str;
    }

    public Map<String, String> getExtendedInfo() {
        return this.extendedInfo;
    }

    public void setExtendedInfo(Map<String, String> map) {
        this.extendedInfo = map;
    }
}
