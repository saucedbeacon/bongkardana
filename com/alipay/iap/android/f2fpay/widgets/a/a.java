package com.alipay.iap.android.f2fpay.widgets.a;

import android.content.res.Resources;
import android.util.TypedValue;

public class a {
    public static int a(Resources resources, float f) {
        return (int) TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }
}
