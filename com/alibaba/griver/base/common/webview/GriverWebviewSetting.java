package com.alibaba.griver.base.common.webview;

import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.griver.api.common.webview.GriverUserAgentExtension;
import com.alibaba.griver.api.common.webview.GriverWebViewSettingExtension;

public class GriverWebviewSetting {
    public static final String SPACE = " ";

    /* renamed from: a  reason: collision with root package name */
    private static GriverWebViewSettingExtension f9164a = new GriverWebViewSettingExtension() {

        /* renamed from: a  reason: collision with root package name */
        private String f9165a = " Griver/2.25.2 AppContainer/10.5.10";

        public final String getUserAgent() {
            String userAgent = ((GriverUserAgentExtension) RVProxy.get(GriverUserAgentExtension.class)).getUserAgent();
            if (TextUtils.isEmpty(userAgent)) {
                return this.f9165a;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f9165a);
            sb.append(" ");
            sb.append(userAgent.trim());
            return sb.toString();
        }

        public final void setUserAgent(String str) {
            if (!TextUtils.isEmpty(str) && !this.f9165a.contains(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.f9165a);
                sb.append(" ");
                sb.append(str.trim());
                this.f9165a = sb.toString();
            }
        }
    };

    public static String getUserAgent() {
        return TextUtils.isEmpty(f9164a.getUserAgent()) ? "" : f9164a.getUserAgent();
    }

    public static void setUserAgent(String str) {
        f9164a.setUserAgent(str);
    }
}
