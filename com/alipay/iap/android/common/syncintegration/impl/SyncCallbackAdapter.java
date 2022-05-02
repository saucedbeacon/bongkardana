package com.alipay.iap.android.common.syncintegration.impl;

import androidx.annotation.NonNull;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncCallback;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncMessage;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncProvider;
import com.alipay.mobile.rome.longlinkservice.ISyncCallback;
import com.alipay.mobile.rome.longlinkservice.syncmodel.SyncMessage;

public class SyncCallbackAdapter implements ISyncCallback {
    private String biz;
    private IAPSyncCallback callback;
    private IAPSyncProvider syncProvider;

    public SyncCallbackAdapter(String str, IAPSyncProvider iAPSyncProvider, IAPSyncCallback iAPSyncCallback) {
        this.biz = str;
        this.syncProvider = iAPSyncProvider;
        this.callback = iAPSyncCallback;
    }

    public void onReceiveMessage(SyncMessage syncMessage) {
        IAPSyncProvider iAPSyncProvider = this.syncProvider;
        if (iAPSyncProvider != null) {
            iAPSyncProvider.reportMsgReceived(syncMessage);
        }
        if (this.callback != null) {
            this.callback.onReceiveMessage(convertSyncMessage(syncMessage));
        }
    }

    @NonNull
    public IAPSyncMessage convertSyncMessage(@NonNull SyncMessage syncMessage) {
        IAPSyncMessage iAPSyncMessage = new IAPSyncMessage();
        iAPSyncMessage.biz = syncMessage.biz;
        iAPSyncMessage.hasMore = syncMessage.hasMore;
        iAPSyncMessage.messageId = syncMessage.f9404id;
        iAPSyncMessage.msgData = syncMessage.msgData;
        iAPSyncMessage.userId = syncMessage.userId;
        return iAPSyncMessage;
    }
}
