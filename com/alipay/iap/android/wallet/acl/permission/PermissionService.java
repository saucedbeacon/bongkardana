package com.alipay.iap.android.wallet.acl.permission;

import com.alipay.iap.android.wallet.acl.base.APIContext;
import com.alipay.iap.android.wallet.acl.base.BaseResult;
import com.alipay.iap.android.wallet.acl.base.BaseService;
import com.alipay.iap.android.wallet.acl.base.Callback;
import com.alipay.iap.android.wallet.acl.base.ServiceCategory;
import com.alipay.iap.android.wallet.acl.base.ServiceMetaInfo;
import com.alipay.iap.android.wallet.acl.base.ServiceType;
import com.alipay.iap.android.wallet.acl.permission.Permission;

@ServiceMetaInfo(category = ServiceCategory.ACL, serviceName = "aplus.service.permission", type = ServiceType.PERMISSION)
public interface PermissionService extends BaseService {
    void checkPermission(Callback<PermissionListResult> callback, APIContext aPIContext, Permission.PermissionType... permissionTypeArr);

    void requestPermission(Callback<BaseResult> callback, APIContext aPIContext, Permission.PermissionType permissionType);
}
