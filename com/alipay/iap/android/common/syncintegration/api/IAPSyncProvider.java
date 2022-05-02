package com.alipay.iap.android.common.syncintegration.api;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.mobile.rome.longlinkservice.syncmodel.SyncMessage;

public interface IAPSyncProvider {
    void initialize(@NonNull Context context);

    boolean isConnected();

    boolean registerReceiveCallback(@NonNull String str, @NonNull IAPSyncCallback iAPSyncCallback);

    void reportMsgReceived(@Nullable SyncMessage syncMessage);

    boolean unregisterReceiveCallback(@NonNull String str);

    void updateUserInfo(String str, String str2);
}
