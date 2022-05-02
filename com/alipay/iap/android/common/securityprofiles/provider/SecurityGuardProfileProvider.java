package com.alipay.iap.android.common.securityprofiles.provider;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.securityprofiles.utils.SecurityProfileUtils;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public class SecurityGuardProfileProvider implements ProfileProvider {
    private static final String TAG = "SecurityGuardProfileProvider";
    private String mAuthCode;

    public SecurityGuardProfileProvider(@NonNull String str) {
        this.mAuthCode = str;
    }

    @Nullable
    public String getProfileData(@NonNull Context context, @NonNull String str) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(464079815, oncanceled);
            onCancelLoad.getMin(464079815, oncanceled);
        }
        return SecurityProfileUtils.getSecurityExtraData(context, this.mAuthCode, str);
    }
}
