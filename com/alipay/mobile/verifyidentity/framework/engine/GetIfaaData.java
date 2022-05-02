package com.alipay.mobile.verifyidentity.framework.engine;

import android.content.Context;

public interface GetIfaaData {
    String getPayData(Context context);

    String getRegData(Context context, String str);
}
