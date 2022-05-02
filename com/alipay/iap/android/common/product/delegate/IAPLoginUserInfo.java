package com.alipay.iap.android.common.product.delegate;

import java.io.Serializable;

public class IAPLoginUserInfo implements Serializable {
    public String loginID;
    public String sessionID;
    public String userID;

    public IAPLoginUserInfo clone() {
        IAPLoginUserInfo iAPLoginUserInfo = new IAPLoginUserInfo();
        iAPLoginUserInfo.userID = this.userID;
        iAPLoginUserInfo.sessionID = this.sessionID;
        iAPLoginUserInfo.loginID = this.loginID;
        return iAPLoginUserInfo;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            IAPLoginUserInfo iAPLoginUserInfo = (IAPLoginUserInfo) obj;
            String str = this.userID;
            if (str == null ? iAPLoginUserInfo.userID != null : !str.equals(iAPLoginUserInfo.userID)) {
                return false;
            }
            String str2 = this.sessionID;
            if (str2 == null ? iAPLoginUserInfo.sessionID != null : !str2.equals(iAPLoginUserInfo.sessionID)) {
                return false;
            }
            String str3 = this.loginID;
            String str4 = iAPLoginUserInfo.loginID;
            if (str3 != null) {
                return str3.equals(str4);
            }
            if (str4 == null) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.userID;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sessionID;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.loginID;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }
}
