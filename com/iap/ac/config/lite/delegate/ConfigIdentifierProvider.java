package com.iap.ac.config.lite.delegate;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.utils.MiscUtils;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;

public abstract class ConfigIdentifierProvider {
    @NonNull
    public String getConfigUserId(@NonNull Context context) {
        int max;
        Context applicationContext = context != null ? context.getApplicationContext() : null;
        if (!(applicationContext == null || (max = dispatchOnCancelled.setMax(applicationContext, 0, 0)) == 0)) {
            onCanceled oncanceled = new onCanceled(0, max, 2);
            onCancelLoad.setMax(338368580, oncanceled);
            onCancelLoad.getMin(338368580, oncanceled);
        }
        String utdId = getUtdId(context);
        if (TextUtils.isEmpty(utdId)) {
            return "";
        }
        String md5 = MiscUtils.md5(utdId);
        if (md5.length() >= 16) {
            return md5.substring(0, 16).toUpperCase();
        }
        return "";
    }

    @NonNull
    public abstract String getUtdId(@NonNull Context context);
}
