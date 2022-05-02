package com.alipay.plus.android.config.sdk.delegate;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.iap.android.common.utils.MiscUtils;

public abstract class ConfigIdentifierProvider {
    @NonNull
    public String getConfigUserId(@NonNull Context context) {
        String utdId = getUtdId(context);
        if (TextUtils.isEmpty(utdId)) {
            return "";
        }
        String md5 = MiscUtils.md5(utdId);
        return md5.length() >= 16 ? md5.substring(0, 16).toUpperCase() : "";
    }

    @NonNull
    public abstract String getUtdId(@NonNull Context context);
}
