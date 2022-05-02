package com.alipay.iap.android.common.syncintegration;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.product.delegate.IAPLoginUserInfo;
import com.alipay.iap.android.common.product.delegate.IAPUserChangeObserver;
import com.alipay.iap.android.common.product.delegate.UserInfoManager;
import com.alipay.iap.android.common.securityprofiles.profile.SyncProfile;
import com.alipay.iap.android.common.syncintegration.monitor.SyncMonitor;
import com.alipay.mobile.rome.longlinkservice.LongLinkAppConfig;
import com.alipay.mobile.rome.longlinkservice.LongLinkSyncService;

public class SyncIntegration implements IAPUserChangeObserver {
    private static SyncIntegration INSTANCE = null;
    private static final String TAG = "SyncIntegration";
    private LongLinkSyncService syncService;

    private SyncIntegration() {
    }

    public static SyncIntegration instance() {
        if (INSTANCE == null) {
            INSTANCE = new SyncIntegration();
        }
        return INSTANCE;
    }

    public void initialize(@NonNull Context context, @NonNull SyncProfile syncProfile) {
        if (this.syncService != null) {
            LoggerWrapper.e(TAG, "Sync already initialized!");
            return;
        }
        LongLinkSyncService instance = LongLinkSyncService.getInstance();
        this.syncService = instance;
        instance.initialize(context, convertConfig(syncProfile));
        UserInfoManager.instance().addUserChangeObserver(this);
        SyncMonitor.monitorSyncConnectState();
    }

    @VisibleForTesting
    public static void clear() {
        SyncIntegration syncIntegration = INSTANCE;
        if (syncIntegration != null) {
            syncIntegration.syncService = null;
            UserInfoManager.instance().removeUserChangeObserver(INSTANCE);
            INSTANCE = null;
        }
    }

    public boolean isSyncInitialized() {
        return this.syncService != null;
    }

    @NonNull
    public static LongLinkAppConfig convertConfig(@NonNull SyncProfile syncProfile) {
        LongLinkAppConfig longLinkAppConfig = new LongLinkAppConfig();
        longLinkAppConfig.productId = syncProfile.productId;
        longLinkAppConfig.productVersion = syncProfile.productVersion;
        longLinkAppConfig.appId = syncProfile.appId;
        longLinkAppConfig.appKey = syncProfile.appKey;
        longLinkAppConfig.authCode = syncProfile.authCode;
        longLinkAppConfig.workspaceId = syncProfile.workspaceId;
        longLinkAppConfig.servHost = syncProfile.syncServerAddress;
        longLinkAppConfig.servPort = syncProfile.syncServerPort;
        return longLinkAppConfig;
    }

    public void onUserChanged(IAPLoginUserInfo iAPLoginUserInfo) {
        updateUserInfo(iAPLoginUserInfo);
    }

    public void onUserLogin(IAPLoginUserInfo iAPLoginUserInfo) {
        updateUserInfo(iAPLoginUserInfo);
    }

    private void updateUserInfo(IAPLoginUserInfo iAPLoginUserInfo) {
        LongLinkSyncService longLinkSyncService = this.syncService;
        if (longLinkSyncService != null) {
            if (iAPLoginUserInfo == null) {
                longLinkSyncService.updateUserInfo((String) null, (String) null);
            } else {
                longLinkSyncService.updateUserInfo(iAPLoginUserInfo.userID, iAPLoginUserInfo.sessionID);
            }
        }
    }

    public void onUserLogout() {
        LongLinkSyncService longLinkSyncService = this.syncService;
        if (longLinkSyncService != null) {
            longLinkSyncService.updateUserInfo((String) null, (String) null);
        }
    }

    public void appToBackground() {
        LongLinkSyncService longLinkSyncService = this.syncService;
        if (longLinkSyncService != null) {
            longLinkSyncService.appToBackground();
        }
    }

    public void appToForeground() {
        LongLinkSyncService longLinkSyncService = this.syncService;
        if (longLinkSyncService != null) {
            longLinkSyncService.appToForeground();
        }
    }
}
