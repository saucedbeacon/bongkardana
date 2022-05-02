package com.iap.ac.android.biz.common.callback;

import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.model.AuthResult;

public interface IAuthCallback {
    void onResult(@NonNull AuthResult authResult);
}
