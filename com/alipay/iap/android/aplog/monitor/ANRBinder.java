package com.alipay.iap.android.aplog.monitor;

import android.content.Context;

public class ANRBinder {
    public static void startAnrWatch(Context context) {
        ANRHandler.a(context);
    }

    public static void stopAnrWatch() {
        ANRHandler.a();
    }
}
