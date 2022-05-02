package com.alibaba.griver.base.api;

import android.content.Context;
import android.webkit.WebResourceResponse;
import com.alibaba.ariver.kernel.common.Proxiable;

public interface NXUcService extends Proxiable {
    Object createWebView(Context context, boolean z);

    String getDefaultUserAgent(Context context);

    WebResourceResponse getResponse(String str);

    String getUcVersion();

    boolean init(boolean z);

    @Deprecated
    String initUC7zSo();
}
