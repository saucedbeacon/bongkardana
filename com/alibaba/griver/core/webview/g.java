package com.alibaba.griver.core.webview;

import android.os.Handler;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import com.alibaba.griver.base.api.APWebMessagePort;
import com.alibaba.griver.base.nebula.APWebMessage;

public class g extends APWebMessagePort {

    /* renamed from: a  reason: collision with root package name */
    private WebMessagePort f10387a;

    g(WebMessagePort webMessagePort) {
        this.f10387a = webMessagePort;
    }

    public WebMessagePort a() {
        return this.f10387a;
    }

    public void postMessage(APWebMessage aPWebMessage) {
        this.f10387a.postMessage(new WebMessage(aPWebMessage.getData()));
    }

    public void close() {
        this.f10387a.close();
    }

    public void setWebMessageCallback(APWebMessagePort.APWebMessageCallback aPWebMessageCallback) {
        setWebMessageCallback(aPWebMessageCallback, (Handler) null);
    }

    public void setWebMessageCallback(final APWebMessagePort.APWebMessageCallback aPWebMessageCallback, Handler handler) {
        this.f10387a.setWebMessageCallback(new WebMessagePort.WebMessageCallback() {
            public void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
                aPWebMessageCallback.onMessage(new g(webMessagePort), new APWebMessage(webMessage.getData()));
            }
        }, handler);
    }
}
