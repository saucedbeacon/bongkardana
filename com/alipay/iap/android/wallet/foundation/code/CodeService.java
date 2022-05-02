package com.alipay.iap.android.wallet.foundation.code;

import android.graphics.Bitmap;
import com.alipay.iap.android.wallet.acl.base.APIContext;
import com.alipay.iap.android.wallet.acl.base.BaseService;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.ServiceCategory;
import com.alipay.iap.android.wallet.acl.base.ServiceMetaInfo;
import com.alipay.iap.android.wallet.acl.base.ServiceType;

@ServiceMetaInfo(category = ServiceCategory.FOUNDATION, serviceName = "aplus.service.code", type = ServiceType.CODE)
public interface CodeService extends BaseService {
    Bitmap generateCodeImage(CodeImageOption codeImageOption, APIContext aPIContext);

    void scan(ScannerOption scannerOption, APIContext aPIContext, Callback<ScannerResult> callback);
}
