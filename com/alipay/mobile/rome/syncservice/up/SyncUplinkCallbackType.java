package com.alipay.mobile.rome.syncservice.up;

public enum SyncUplinkCallbackType {
    TYPE_NONE,
    TYPE_NORMAL,
    TYPE_LIKE_RPC;

    public static SyncUplinkCallbackType toType(int i) {
        if (i == 1) {
            return TYPE_NORMAL;
        }
        if (i != 2) {
            return TYPE_NONE;
        }
        return TYPE_LIKE_RPC;
    }
}
