package com.alipay.mobile.verifyidentity.business.pin.product;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alipay.mobile.verifyidentity.base.message.Message;
import com.alipay.mobile.verifyidentity.base.product.IProduct;
import com.alipay.mobile.verifyidentity.base.product.SecVIModule;
import com.alipay.mobile.verifyidentity.business.pin.activity.PinActivity;

public class PinModule extends SecVIModule {
    public String getProductName() {
        return "PIN";
    }

    public void setProductName() {
    }

    public void stop() {
    }

    public void start(Context context, Message message, IProduct.ICallback iCallback) {
        PinActivity.setCallback(iCallback);
        PinActivity.setPinProduct(this);
        Intent intent = new Intent(context, PinActivity.class);
        intent.putExtra("message", message);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
