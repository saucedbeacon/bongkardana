package com.alipay.mobile.verifyidentity.business.security_verification.product;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alipay.mobile.verifyidentity.base.message.Message;
import com.alipay.mobile.verifyidentity.base.product.IProduct;
import com.alipay.mobile.verifyidentity.base.product.SecVIModule;
import com.alipay.mobile.verifyidentity.business.security_verification.activity.VerifySecurityActivity;

public class SecurityVerifyModule extends SecVIModule {
    public String getProductName() {
        return "Security";
    }

    public void setProductName() {
    }

    public void stop() {
    }

    public void start(Context context, Message message, IProduct.ICallback iCallback) {
        VerifySecurityActivity.setCallback(iCallback);
        VerifySecurityActivity.setPinProduct(this);
        Intent intent = new Intent(context, VerifySecurityActivity.class);
        intent.putExtra("message", message);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
