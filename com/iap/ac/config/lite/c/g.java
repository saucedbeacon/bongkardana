package com.iap.ac.config.lite.c;

import android.content.Context;
import androidx.annotation.NonNull;
import com.iap.ac.android.common.instance.InstanceInfo;
import com.iap.ac.config.lite.delegate.ConfigIdentifierProvider;

public class g extends ConfigIdentifierProvider {
    @NonNull
    public String getUtdId(@NonNull Context context) {
        return InstanceInfo.getInstanceId(context);
    }
}
