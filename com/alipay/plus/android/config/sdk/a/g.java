package com.alipay.plus.android.config.sdk.a;

import android.content.Context;
import androidx.annotation.NonNull;
import com.alipay.plus.android.config.sdk.delegate.ConfigIdentifierProvider;
import com.ta.utdid2.device.UTDevice;

public class g extends ConfigIdentifierProvider {
    @NonNull
    public String getUtdId(@NonNull Context context) {
        return UTDevice.getUtdid(context);
    }
}
