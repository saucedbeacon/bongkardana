package com.alipay.iap.android.common.syncintegration.api;

import androidx.annotation.NonNull;

public interface IAPSyncCallback {
    void onReceiveCommand(@NonNull IAPSyncCommand iAPSyncCommand);

    void onReceiveMessage(@NonNull IAPSyncMessage iAPSyncMessage);
}
