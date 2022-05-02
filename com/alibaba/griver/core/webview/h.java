package com.alibaba.griver.core.webview;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import com.alibaba.griver.base.api.APWebResourceRequest;
import java.util.Map;

public class h implements APWebResourceRequest {

    /* renamed from: a  reason: collision with root package name */
    private WebResourceRequest f10389a;

    public h(WebResourceRequest webResourceRequest) {
        this.f10389a = webResourceRequest;
    }

    public String getMethod() {
        WebResourceRequest webResourceRequest = this.f10389a;
        if (webResourceRequest != null) {
            return webResourceRequest.getMethod();
        }
        return null;
    }

    public Map<String, String> getRequestHeaders() {
        WebResourceRequest webResourceRequest = this.f10389a;
        if (webResourceRequest != null) {
            return webResourceRequest.getRequestHeaders();
        }
        return null;
    }

    public Uri getUrl() {
        WebResourceRequest webResourceRequest = this.f10389a;
        if (webResourceRequest != null) {
            return webResourceRequest.getUrl();
        }
        return null;
    }

    public boolean hasGesture() {
        WebResourceRequest webResourceRequest = this.f10389a;
        if (webResourceRequest != null) {
            return webResourceRequest.hasGesture();
        }
        return false;
    }

    public boolean isForMainFrame() {
        WebResourceRequest webResourceRequest = this.f10389a;
        if (webResourceRequest != null) {
            return webResourceRequest.isForMainFrame();
        }
        return false;
    }
}
