package com.alipay.iap.android.f2fpay.extension;

import android.content.Context;
import androidx.annotation.NonNull;

public interface IF2FPayDeviceIdGenerator {
    @NonNull
    String generateDeviceId(Context context);
}
