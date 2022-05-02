package com.alipay.mobile.verifyidentity.business.menu.product;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.alipay.mobile.verifyidentity.base.message.Message;
import com.alipay.mobile.verifyidentity.base.product.IProduct;
import com.alipay.mobile.verifyidentity.base.product.SecVIModule;
import com.alipay.mobile.verifyidentity.business.menu.activity.MenuActivity;

public class MenuModule extends SecVIModule {
    public String getProductName() {
        return null;
    }

    public void setProductName() {
    }

    public void stop() {
    }

    public void start(Context context, Message message, IProduct.ICallback iCallback) {
        Intent intent = new Intent(context, MenuActivity.class);
        intent.putExtra("message", message);
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        context.startActivity(intent);
    }
}
