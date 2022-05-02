package com.iap.ac.android.biz.common.callback;

import androidx.annotation.NonNull;
import com.iap.ac.android.biz.common.model.AcCallback;
import com.iap.ac.android.biz.common.model.auth.AuthPageRequest;
import com.iap.ac.android.biz.common.model.auth.AuthPageResult;
import com.iap.ac.android.biz.common.model.auth.AuthRequest;
import java.util.List;

public interface IOAuth {
    void getAuthCode(@NonNull AuthRequest authRequest, @NonNull IAuthCallback iAuthCallback);

    void getAuthCode(@NonNull String str, @NonNull IAuthCallback iAuthCallback);

    void getAuthCode(@NonNull String str, @NonNull String str2, @NonNull List<String> list, @NonNull IAuthCallback iAuthCallback);

    void showAuthPage(@NonNull AuthPageRequest authPageRequest, @NonNull AcCallback<AuthPageResult> acCallback);
}
