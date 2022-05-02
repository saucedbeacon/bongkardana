package com.alipay.iap.android.common.securityprofiles.provider;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface ProfileProvider {
    @Nullable
    String getProfileData(@NonNull Context context, @NonNull String str);
}
