package com.alipay.iap.android.f2fpay.components.defaults;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.common.product.delegate.IAPLoginUserInfo;
import com.alipay.iap.android.common.product.delegate.IAPUserChangeObserver;
import com.alipay.iap.android.common.product.delegate.IAPUserDelegate;
import com.alipay.iap.android.f2fpay.client.IF2FPayClient;
import com.alipay.iap.android.f2fpay.common.F2FPayConstants;
import com.alipay.iap.android.f2fpay.components.IF2FPayInitializeComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayOpenComponent;
import com.alipay.iap.android.f2fpay.components.IF2FPayUserSwitchComponent;

public class DefaultUserSwitchComponent extends DefaultBaseComponent implements IAPUserChangeObserver, IF2FPayUserSwitchComponent {
    protected String mCurrentF2FPayUserId;

    private void a(@Nullable String str) {
        ((IF2FPayInitializeComponent) getComponent(IF2FPayInitializeComponent.class)).clearOtpInfo();
        setCurrentF2FPayUserId(str);
        if (!TextUtils.isEmpty(str)) {
            IF2FPayOpenComponent iF2FPayOpenComponent = (IF2FPayOpenComponent) getComponent(IF2FPayOpenComponent.class);
            if (iF2FPayOpenComponent == null) {
                LoggerWrapper.w(F2FPayConstants.TAG, "open component is null, init directly");
                IF2FPayInitializeComponent iF2FPayInitializeComponent = (IF2FPayInitializeComponent) getComponent(IF2FPayInitializeComponent.class);
                if (iF2FPayInitializeComponent == null) {
                    LoggerWrapper.e(F2FPayConstants.TAG, "initializeComponent is null, cannot init otp seed");
                } else {
                    iF2FPayInitializeComponent.asyncInitializeOtpInfo();
                }
            } else {
                iF2FPayOpenComponent.setLocalOpenFlag(false);
                iF2FPayOpenComponent.checkOpen();
            }
        }
    }

    private boolean a(@Nullable IAPLoginUserInfo iAPLoginUserInfo) {
        return iAPLoginUserInfo != null && !TextUtils.isEmpty(iAPLoginUserInfo.userID) && TextUtils.equals(iAPLoginUserInfo.userID, this.mCurrentF2FPayUserId);
    }

    @Nullable
    private String b(@Nullable IAPLoginUserInfo iAPLoginUserInfo) {
        if (iAPLoginUserInfo != null) {
            return iAPLoginUserInfo.userID;
        }
        return null;
    }

    public String getCurrentF2FPayUserId() {
        return this.mCurrentF2FPayUserId;
    }

    public void initialize(IF2FPayClient iF2FPayClient) {
        super.initialize(iF2FPayClient);
        IAPUserDelegate userDelegate = getUserDelegate();
        String userId = userDelegate.getUserId();
        LoggerWrapper.d(F2FPayConstants.TAG, "initialize. userId = ".concat(String.valueOf(userId)));
        setCurrentF2FPayUserId(userId);
        userDelegate.addUserChangeObserver(this);
    }

    public void onDestroy() {
        getUserDelegate().removeUserChangeObserver(this);
    }

    public void onUserChanged(IAPLoginUserInfo iAPLoginUserInfo) {
        LoggerWrapper.d(F2FPayConstants.TAG, String.format("onUserChanged. oldUserId = %s, newUserId = %s", new Object[]{this.mCurrentF2FPayUserId, b(iAPLoginUserInfo)}));
        if (!a(iAPLoginUserInfo)) {
            a(iAPLoginUserInfo.userID);
        }
    }

    public void onUserLogin(IAPLoginUserInfo iAPLoginUserInfo) {
        LoggerWrapper.d(F2FPayConstants.TAG, String.format("onUserLogin. oldUserId = %s, newUserId = %s", new Object[]{this.mCurrentF2FPayUserId, b(iAPLoginUserInfo)}));
        if (!a(iAPLoginUserInfo)) {
            a(iAPLoginUserInfo.userID);
        }
    }

    public void onUserLogout() {
        LoggerWrapper.d(F2FPayConstants.TAG, String.format("onUserLogin. oldUserId = %s, newUserId = null", new Object[]{this.mCurrentF2FPayUserId}));
        a((String) null);
    }

    public void setCurrentF2FPayUserId(String str) {
        LoggerWrapper.d(F2FPayConstants.TAG, String.format("setCurrentF2FPayUserId. oldUserId = %s, newUserId = %s", new Object[]{this.mCurrentF2FPayUserId, str}));
        this.mCurrentF2FPayUserId = str;
    }
}
