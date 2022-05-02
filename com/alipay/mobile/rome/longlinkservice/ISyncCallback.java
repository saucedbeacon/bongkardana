package com.alipay.mobile.rome.longlinkservice;

import com.alipay.mobile.rome.longlinkservice.syncmodel.SyncMessage;

public interface ISyncCallback {
    void onReceiveMessage(SyncMessage syncMessage);
}
