package com.alipay.iap.android.wallet.acl.contact;

import com.alipay.iap.android.wallet.acl.base.APIContext;
import com.alipay.iap.android.wallet.acl.base.BaseService;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.ServiceCategory;
import com.alipay.iap.android.wallet.acl.base.ServiceMetaInfo;
import com.alipay.iap.android.wallet.acl.base.ServiceType;

@ServiceMetaInfo(category = ServiceCategory.ACL, serviceName = "aplus.service.contact", type = ServiceType.CONTACTS)
public interface ContactService extends BaseService {
    void getContacts(APIContext aPIContext, Callback<ContactRetrieveResult> callback);
}
