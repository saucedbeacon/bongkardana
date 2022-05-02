package com.alipay.iap.android.f2fpay.extension;

import java.util.Map;

public interface IF2FPayLogger {
    void event(String str, Map<String, String> map);
}
