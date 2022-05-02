package com.alibaba.griver.base.api;

import android.content.Context;
import android.os.Bundle;
import android.webkit.WebResourceResponse;

public abstract class UcService {

    public interface UCInitListener {
        void onFailed();

        void onSuccess();
    }

    public abstract void addInitSuccessListener(UCInitListener uCInitListener);

    public abstract boolean clearServiceWorkerCacheEnabled();

    public abstract APWebView createWebView(Context context, boolean z);

    public abstract APWebView createWebView(Context context, boolean z, Bundle bundle);

    public APWebView createWebViewForNebulaX(Context context, boolean z) {
        return null;
    }

    public abstract String getDefaultUserAgent(Context context);

    public abstract WebResourceResponse getResponse(String str);

    public abstract String getUcVersion();

    public abstract boolean init(boolean z);

    public abstract boolean init(boolean z, Bundle bundle);

    @Deprecated
    public abstract String initUC7zSo();

    public abstract void removeInitSuccessListener(UCInitListener uCInitListener);
}
