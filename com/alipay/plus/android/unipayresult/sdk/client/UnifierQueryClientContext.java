package com.alipay.plus.android.unipayresult.sdk.client;

import com.alipay.iap.android.common.syncintegration.api.IAPSyncProvider;

public class UnifierQueryClientContext {
    public IAPSyncProvider mSyncProvider;

    public UnifierQueryClientContext(IAPSyncProvider iAPSyncProvider) {
        this.mSyncProvider = iAPSyncProvider;
    }
}
