package com.iap.ac.android.acs.plugin.biz.auth;

import androidx.annotation.Nullable;
import com.iap.ac.android.biz.common.model.AuthResult;

public interface AuthResultObserver {
    void onGetAuthResult(@Nullable AuthResult authResult);
}
