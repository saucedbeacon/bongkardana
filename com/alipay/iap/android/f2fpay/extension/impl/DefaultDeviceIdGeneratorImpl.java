package com.alipay.iap.android.f2fpay.extension.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.alipay.iap.android.f2fpay.extension.IF2FPayDeviceIdGenerator;
import com.alipay.iap.android.f2fpay.util.DeviceUtils;
import java.util.UUID;

public class DefaultDeviceIdGeneratorImpl implements IF2FPayDeviceIdGenerator {

    /* renamed from: a  reason: collision with root package name */
    private String f10669a;

    @NonNull
    public String generateDeviceId(Context context) {
        if (TextUtils.isEmpty(this.f10669a)) {
            String deviceId = DeviceUtils.getDeviceId(context);
            this.f10669a = deviceId;
            if (TextUtils.isEmpty(deviceId)) {
                this.f10669a = UUID.randomUUID().toString();
            }
        }
        return this.f10669a;
    }
}
