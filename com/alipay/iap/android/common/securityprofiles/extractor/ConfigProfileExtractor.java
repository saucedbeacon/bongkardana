package com.alipay.iap.android.common.securityprofiles.extractor;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.securityprofiles.provider.ConfigProfileProvider;
import com.alipay.iap.android.common.securityprofiles.provider.ProfileProvider;

public class ConfigProfileExtractor extends ProfileExtractor {
    private String mProfileJson;

    public ConfigProfileExtractor(@NonNull Context context, @NonNull String str, @NonNull String str2) {
        super(context, str);
        this.mProfileJson = str2;
    }

    /* access modifiers changed from: protected */
    @NonNull
    public ProfileProvider createProfileProvider() {
        return new ConfigProfileProvider(this.mProfileJson);
    }
}
