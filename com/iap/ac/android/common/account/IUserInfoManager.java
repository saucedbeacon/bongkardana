package com.iap.ac.android.common.account;

public interface IUserInfoManager {
    String getOpenId();

    ACUserInfo getUserInfo();

    boolean setUserInfo(ACUserInfo aCUserInfo);
}
