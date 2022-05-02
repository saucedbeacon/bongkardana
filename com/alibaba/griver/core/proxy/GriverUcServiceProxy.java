package com.alibaba.griver.core.proxy;

import android.content.Context;
import android.webkit.WebResourceResponse;
import com.alibaba.griver.base.api.NXUcService;
import com.alibaba.griver.base.api.UcService;
import com.alibaba.griver.base.common.utils.UCUtils;
import com.alibaba.griver.uc.UcServiceImpl;

public class GriverUcServiceProxy implements NXUcService {

    /* renamed from: a  reason: collision with root package name */
    private UcService f10312a;

    private synchronized UcService a() {
        if (this.f10312a == null && UCUtils.UCExist()) {
            this.f10312a = new UcServiceImpl();
        }
        return this.f10312a;
    }

    public boolean init(boolean z) {
        return a().init(z);
    }

    public Object createWebView(Context context, boolean z) {
        return a().createWebViewForNebulaX(context, z);
    }

    public WebResourceResponse getResponse(String str) {
        return a().getResponse(str);
    }

    public String initUC7zSo() {
        return a().initUC7zSo();
    }

    public String getUcVersion() {
        return a().getUcVersion();
    }

    public String getDefaultUserAgent(Context context) {
        return a().getDefaultUserAgent(context);
    }
}
