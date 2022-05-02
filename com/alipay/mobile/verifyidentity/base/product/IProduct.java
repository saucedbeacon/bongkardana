package com.alipay.mobile.verifyidentity.base.product;

import android.content.Context;
import com.alipay.mobile.verifyidentity.base.message.Message;
import com.alipay.mobile.verifyidentity.base.message.VIRespone;

public interface IProduct {

    public interface ICallback {
        void onAction(String str);

        void onResult(IProduct iProduct, VIRespone vIRespone);
    }

    String getProductName();

    void setProductName();

    void startProduct(Context context, Message message, ICallback iCallback);

    void stop();
}
