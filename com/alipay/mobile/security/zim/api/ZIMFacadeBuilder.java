package com.alipay.mobile.security.zim.api;

import android.content.Context;
import com.alipay.mobile.security.zim.biz.ZimPlatform;

public class ZIMFacadeBuilder {
    public static ZIMFacade create(Context context) {
        if (context != null) {
            return new ZimPlatform(context);
        }
        throw new RuntimeException("context Can't be null");
    }
}
