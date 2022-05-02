package com.iap.ac.android.biz.common.internal.foundation.facade;

import android.content.Context;
import android.text.TextUtils;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.model.CommonConfig;
import com.iap.ac.android.common.account.ACUserInfo;
import com.iap.ac.android.common.account.ACUserInfoManager;
import com.iap.ac.android.common.account.IOAuthLoginCallback;
import com.iap.ac.android.common.account.IOAuthService;
import com.iap.ac.android.common.account.IUserInfoManager;
import com.iap.ac.android.common.account.OAuthObserver;
import com.iap.ac.android.common.account.OAuthService;
import com.iap.ac.android.common.log.ACLog;
import java.util.ArrayList;
import java.util.List;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class UserInfoFacade extends BaseFacade implements IUserInfoManager, IOAuthService {
    public static boolean mInitialized = false;
    public List<OAuthObserver> mOAuthObservers = new ArrayList();
    public ACUserInfo mUserInfo;

    public String getOpenId() {
        ACUserInfo aCUserInfo = this.mUserInfo;
        if (aCUserInfo != null) {
            return aCUserInfo.openId;
        }
        ACLog.e(Constants.TAG, "UserInfoFacade, getOpenId error, null userInfo");
        return null;
    }

    public ACUserInfo getUserInfo() {
        return this.mUserInfo;
    }

    public void initComponent(Context context, String str, CommonConfig commonConfig) {
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (applicationContext != null) {
            int length = str != null ? str.length() : 0;
            int min = dispatchOnCancelled.getMin(applicationContext, length);
            if (length != min) {
                onCanceled oncanceled = new onCanceled(length, min, 32);
                onCancelLoad.setMax(128172403, oncanceled);
                onCancelLoad.getMin(128172403, oncanceled);
            }
        }
        super.initComponent(context, str, commonConfig);
        synchronized (this) {
            mInitialized = false;
            ACUserInfoManager.setUserInfoManager(this, str);
            String fetch = ACManager.getInstance().fetch(ACManager.getInstance().getOpenIdStorageKey(str));
            if (!TextUtils.isEmpty(fetch)) {
                ACUserInfo aCUserInfo = new ACUserInfo();
                this.mUserInfo = aCUserInfo;
                aCUserInfo.openId = fetch;
            }
            OAuthService.INSTANCE.setOAuthService(this);
            StringBuilder sb = new StringBuilder("UserInfo component initialize finish, openId: ");
            sb.append(getOpenId());
            ACLog.i(Constants.TAG, sb.toString());
            mInitialized = true;
        }
    }

    public boolean isAuthorized() {
        return false;
    }

    public boolean isInitialized() {
        return mInitialized;
    }

    public void notifyOAuthLogin(String str, IOAuthLoginCallback iOAuthLoginCallback) {
        ACLog.i(Constants.TAG, "notifyOAuthLogin enter");
        synchronized (this.mOAuthObservers) {
            for (OAuthObserver onOAuthLogin : this.mOAuthObservers) {
                onOAuthLogin.onOAuthLogin();
            }
        }
    }

    public void notifyOAuthLogout() {
        ACLog.i(Constants.TAG, "notifyOAuthLogout enter");
        synchronized (this.mOAuthObservers) {
            for (OAuthObserver onOAuthLogout : this.mOAuthObservers) {
                onOAuthLogout.onOAuthLogout();
            }
        }
    }

    public void registerOAuthEventObserver(OAuthObserver oAuthObserver) {
        ACLog.i(Constants.TAG, "registerOAuthEventObserver enter");
        if (oAuthObserver == null) {
            ACLog.e(Constants.TAG, "registerOAuthEventObserver with null observer");
            return;
        }
        synchronized (this.mOAuthObservers) {
            this.mOAuthObservers.add(oAuthObserver);
        }
    }

    public boolean setUserInfo(ACUserInfo aCUserInfo) {
        this.mUserInfo = aCUserInfo;
        return true;
    }

    public void unregisterAllOAuthEventObservers() {
        ACLog.i(Constants.TAG, "unregisterAllOAuthEventObservers enter");
        synchronized (this.mOAuthObservers) {
            this.mOAuthObservers.clear();
        }
    }

    public void unregisterOAuthEventObserver(OAuthObserver oAuthObserver) {
        ACLog.i(Constants.TAG, "unregisterOAuthEventObserver enter");
        if (oAuthObserver == null) {
            ACLog.e(Constants.TAG, "unregisterOAuthEventObserver with null observer");
            return;
        }
        synchronized (this.mOAuthObservers) {
            this.mOAuthObservers.remove(oAuthObserver);
        }
    }
}
