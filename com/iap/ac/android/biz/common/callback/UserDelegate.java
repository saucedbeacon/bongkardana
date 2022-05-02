package com.iap.ac.android.biz.common.callback;

import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.model.OAuthUserInfo;
import com.iap.ac.android.biz.common.model.OpenUserInfoCallback;

public interface UserDelegate {
    String getOpenId();

    void getOpenUserInfo(@NonNull OAuthUserInfo oAuthUserInfo, @NonNull OpenUserInfoCallback openUserInfoCallback);
}
