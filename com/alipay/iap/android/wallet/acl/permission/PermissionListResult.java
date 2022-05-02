package com.alipay.iap.android.wallet.acl.permission;

import com.alipay.iap.android.wallet.acl.base.BaseResult;

public class PermissionListResult extends BaseResult {
    Permission[] permissionList;

    public Permission[] getPermissionList() {
        return this.permissionList;
    }

    public void setPermissionList(Permission[] permissionArr) {
        this.permissionList = permissionArr;
    }
}
