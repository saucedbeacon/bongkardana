package com.iap.ac.android.common.account;

public class ACUserInfo {
    public String openId;

    public String toString() {
        StringBuilder sb = new StringBuilder("ACUserInfo{openId='");
        sb.append(this.openId);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }
}
