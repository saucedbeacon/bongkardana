package com.alipay.iap.android.wallet.acl.capability;

import com.alipay.iap.android.wallet.acl.base.BaseService;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.ServiceCategory;
import com.alipay.iap.android.wallet.acl.base.ServiceMetaInfo;
import com.alipay.iap.android.wallet.acl.base.ServiceType;
import com.alipay.iap.android.wallet.acl.capability.scanner.ScannerOption;
import com.alipay.iap.android.wallet.acl.capability.scanner.ScannerResult;
import java.net.URL;

@ServiceMetaInfo(category = ServiceCategory.ACL, serviceName = "aplus.service.capability", type = ServiceType.OPEN_CAPABILITY)
public interface OpenCapabilityService extends BaseService {
    boolean open(URL url);

    void scan(ScannerOption scannerOption, Callback<ScannerResult> callback);
}
