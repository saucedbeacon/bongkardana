package com.alipay.iap.android.common.syncintegration.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.securityprofiles.profile.SyncProfile;
import com.alipay.iap.android.common.syncintegration.SyncIntegration;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncCallback;
import com.alipay.iap.android.common.syncintegration.api.IAPSyncProvider;
import com.alipay.mobile.rome.longlinkservice.LongLinkSyncService;
import com.alipay.mobile.rome.longlinkservice.syncmodel.SyncMessage;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class SyncProvider implements IAPSyncProvider {
    private static final String TAG = "SyncProvider";
    private LongLinkSyncService syncService;

    public SyncProvider() {
        if (isIncludeSyncService()) {
            this.syncService = LongLinkSyncService.getInstance();
        }
    }

    public void initialize(@NonNull Context context) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(129582435, oncanceled);
            onCancelLoad.getMin(129582435, oncanceled);
        }
        LongLinkSyncService longLinkSyncService = this.syncService;
        if (longLinkSyncService != null) {
            longLinkSyncService.initialize(context);
        }
    }

    public void initialize(@NonNull Context context, @NonNull SyncProfile syncProfile) {
        LongLinkSyncService longLinkSyncService = this.syncService;
        if (longLinkSyncService != null) {
            longLinkSyncService.initialize(context, SyncIntegration.convertConfig(syncProfile));
        }
    }

    public boolean registerReceiveCallback(@NonNull String str, @NonNull IAPSyncCallback iAPSyncCallback) {
        LongLinkSyncService longLinkSyncService = this.syncService;
        if (longLinkSyncService == null) {
            return false;
        }
        longLinkSyncService.registerBiz(str, new SyncCallbackAdapter(str, this, iAPSyncCallback));
        return true;
    }

    public boolean unregisterReceiveCallback(@NonNull String str) {
        LongLinkSyncService longLinkSyncService = this.syncService;
        if (longLinkSyncService == null) {
            return false;
        }
        longLinkSyncService.unregisterBiz(str);
        return true;
    }

    public boolean isConnected() {
        LongLinkSyncService longLinkSyncService = this.syncService;
        return longLinkSyncService != null && longLinkSyncService.isConnected();
    }

    public void updateUserInfo(String str, String str2) {
        LongLinkSyncService longLinkSyncService = this.syncService;
        if (longLinkSyncService != null) {
            longLinkSyncService.updateUserInfo(str, str2);
        }
    }

    public void reportMsgReceived(SyncMessage syncMessage) {
        LongLinkSyncService longLinkSyncService;
        if (syncMessage != null && (longLinkSyncService = this.syncService) != null) {
            longLinkSyncService.reportMsgReceived(syncMessage);
        }
    }

    private static boolean isIncludeSyncService() {
        try {
            return Class.forName("com.alipay.mobile.rome.longlinkservice.LongLinkSyncService") != null;
        } catch (ClassNotFoundException e) {
            LoggerWrapper.e(TAG, e.getMessage(), e);
            return false;
        }
    }
}
