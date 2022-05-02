package com.alipay.iap.android.common.securityprofiles.extractor;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.securityprofiles.provider.ProfileProvider;
import com.alipay.iap.android.common.securityprofiles.provider.SecurityGuardProfileProvider;

public class SecurityProfileExtractor extends ProfileExtractor {
    public SecurityProfileExtractor(@NonNull Context context, @NonNull String str) {
        super(context, str);
    }

    /* access modifiers changed from: protected */
    @NonNull
    public ProfileProvider createProfileProvider() {
        return new SecurityGuardProfileProvider(this.mAuthCode);
    }
}
