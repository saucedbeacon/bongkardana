package com.alibaba.griver.base.api;

import android.webkit.ValueCallback;

public interface APWebViewPerformance {
    void getStartupPerformanceStatistics(ValueCallback<String> valueCallback);
}
