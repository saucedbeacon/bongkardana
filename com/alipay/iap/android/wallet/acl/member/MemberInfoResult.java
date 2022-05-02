package com.alipay.iap.android.wallet.acl.member;

import com.alipay.iap.android.wallet.acl.base.BaseResult;

public class MemberInfoResult extends BaseResult {
    public MemberInfo memberInfo;

    public MemberInfoResult(MemberInfo memberInfo2) {
        this.memberInfo = memberInfo2;
    }

    public MemberInfo getMemberInfo() {
        return this.memberInfo;
    }
}
