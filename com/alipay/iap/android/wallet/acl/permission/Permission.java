package com.alipay.iap.android.wallet.acl.permission;

public class Permission {
    PermissionStatus permissionStatus;
    PermissionType permissionType;

    public enum PermissionType {
        STEP,
        CONTACT_READ
    }

    public enum PermissionStatus {
        UKNOWN,
        AUTHORISED,
        NOT_AVAILABLE,
        UNSUPPORTED
    }

    public Permission(PermissionStatus permissionStatus2, PermissionType permissionType2) {
        this.permissionStatus = permissionStatus2;
        this.permissionType = permissionType2;
    }

    public PermissionStatus getPermissionStatus() {
        return this.permissionStatus;
    }

    public void setPermissionStatus(PermissionStatus permissionStatus2) {
        this.permissionStatus = permissionStatus2;
    }

    public PermissionType getPermissionType() {
        return this.permissionType;
    }

    public void setPermissionType(PermissionType permissionType2) {
        this.permissionType = permissionType2;
    }
}
