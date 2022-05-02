package com.alipay.iap.android.wallet.acl.payment;

import com.alipay.iap.android.wallet.acl.base.APIContext;
import com.alipay.iap.android.wallet.acl.base.BaseService;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.ServiceCategory;
import com.alipay.iap.android.wallet.acl.base.ServiceMetaInfo;
import com.alipay.iap.android.wallet.acl.base.ServiceType;

@ServiceMetaInfo(category = ServiceCategory.ACL, serviceName = "aplus.service.pay", type = ServiceType.PAYMENT)
public interface PaymentService extends BaseService {
    void pay(PaymentRequest paymentRequest, APIContext aPIContext, Callback<PaymentResult> callback);
}
