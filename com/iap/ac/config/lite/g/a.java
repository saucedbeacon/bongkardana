package com.iap.ac.config.lite.g;

import com.iap.ac.android.common.account.ACUserInfo;
import com.iap.ac.android.common.account.IUserInfoManager;
import com.iap.ac.config.lite.ConfigCenterContext;

public class a implements IUserInfoManager {

    /* renamed from: a  reason: collision with root package name */
    ConfigCenterContext f11069a;
    ACUserInfo b;

    public a(ConfigCenterContext configCenterContext) {
        this.f11069a = configCenterContext;
    }

    public String getOpenId() {
        return this.f11069a.getIdentifierProvider().getConfigUserId(this.f11069a.getContext());
    }

    public ACUserInfo getUserInfo() {
        if (this.b == null) {
            ACUserInfo aCUserInfo = new ACUserInfo();
            this.b = aCUserInfo;
            aCUserInfo.openId = getOpenId();
        }
        return this.b;
    }

    public boolean setUserInfo(ACUserInfo aCUserInfo) {
        return false;
    }
}
