package com.alipay.mobile.verifyidentity.business.otp.product;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alipay.mobile.verifyidentity.base.message.Message;
import com.alipay.mobile.verifyidentity.base.product.IProduct;
import com.alipay.mobile.verifyidentity.base.product.SecVIModule;
import com.alipay.mobile.verifyidentity.business.otp.activity.OtpActivity;

public class OtpModule extends SecVIModule {
    public String getProductName() {
        return "OTP";
    }

    public void setProductName() {
    }

    public void stop() {
    }

    public void start(Context context, Message message, IProduct.ICallback iCallback) {
        OtpActivity.setCallback(iCallback);
        OtpActivity.setOtpProduct(this);
        Intent intent = new Intent(context, OtpActivity.class);
        intent.putExtra("message", message);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
