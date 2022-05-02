package com.alipay.iap.android.wallet.acl.member;

import com.alipay.iap.android.wallet.acl.base.APIContext;
import com.alipay.iap.android.wallet.acl.base.BaseService;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.ServiceCategory;
import com.alipay.iap.android.wallet.acl.base.ServiceMetaInfo;
import com.alipay.iap.android.wallet.acl.base.ServiceType;

@ServiceMetaInfo(category = ServiceCategory.ACL, serviceName = "aplus.service.member", type = ServiceType.MEMBER)
public interface MemberService extends BaseService {

    public enum MemberInfoFetchStrategy {
        LOCAL_USER_ID_ONLY,
        LOCAL_CACHED,
        REMOTE_FETCH
    }

    void getMemberInfo(MemberInfoFetchStrategy memberInfoFetchStrategy, MemberInfoScope memberInfoScope, APIContext aPIContext, Callback<MemberInfoResult> callback);
}
