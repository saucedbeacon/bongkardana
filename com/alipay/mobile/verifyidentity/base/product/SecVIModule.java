package com.alipay.mobile.verifyidentity.base.product;

import android.content.Context;
import android.content.Intent;
import com.alipay.mobile.verifyidentity.base.LocalBroadcastCompt;
import com.alipay.mobile.verifyidentity.base.message.Message;
import com.alipay.mobile.verifyidentity.base.message.ProductConstants;
import com.alipay.mobile.verifyidentity.base.product.IProduct;

public abstract class SecVIModule implements IProduct {
    /* access modifiers changed from: protected */
    public abstract void start(Context context, Message message, IProduct.ICallback iCallback);

    public void startProduct(Context context, Message message, IProduct.ICallback iCallback) {
        sendBroadcastWhenCreate(context, message.getVerifyId());
        start(context, message, iCallback);
    }

    /* access modifiers changed from: protected */
    public void sendBroadcastWhenCreate(Context context, String str) {
        Intent intent = new Intent();
        intent.setAction(ProductConstants.KEY_CREATE_PRODUCT);
        intent.putExtra(ProductConstants.KEY_PRODUCT_VERIFY_ID, str);
        LocalBroadcastCompt.sendBroadcast(context, intent);
    }
}
