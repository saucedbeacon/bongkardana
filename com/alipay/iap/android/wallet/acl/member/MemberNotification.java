package com.alipay.iap.android.wallet.acl.member;

import com.alipay.iap.android.wallet.acl.base.BaseResult;

public class MemberNotification extends BaseResult {
    private MemberInfo memberInfo;
    private NotificationType notificationType;

    public enum NotificationType {
        LOGIN,
        UPDATE,
        LOGOUT
    }

    public MemberInfo getMemberInfo() {
        return this.memberInfo;
    }

    public void setMemberInfo(MemberInfo memberInfo2) {
        this.memberInfo = memberInfo2;
    }

    public NotificationType getNotificationType() {
        return this.notificationType;
    }

    public void setNotificationType(NotificationType notificationType2) {
        this.notificationType = notificationType2;
    }
}
