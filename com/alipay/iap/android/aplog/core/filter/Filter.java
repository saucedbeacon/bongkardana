package com.alipay.iap.android.aplog.core.filter;

public interface Filter {
    boolean shouldUpload(String str, int i);

    boolean shouldWrite(String str);
}
