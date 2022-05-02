package com.alibaba.griver.api.common.menu;

import android.text.TextUtils;

public abstract class GRVMPMoreMenuItem extends GriverMenuItem {
    public GRVMPMoreMenuItemChangeListener dataChangeListener;
    public boolean showBadge;
    public String uniqueKey;

    public void enableBadge(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.identifier);
        this.uniqueKey = sb.toString();
    }

    public boolean isShowBadge() {
        return !TextUtils.isEmpty(this.uniqueKey);
    }

    public void notifyDataSetChanged() {
        GRVMPMoreMenuItemChangeListener gRVMPMoreMenuItemChangeListener = this.dataChangeListener;
        if (gRVMPMoreMenuItemChangeListener != null) {
            gRVMPMoreMenuItemChangeListener.onMenuItemChange(this);
        }
    }
}
