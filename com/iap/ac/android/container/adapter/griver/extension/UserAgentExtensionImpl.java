package com.iap.ac.android.container.adapter.griver.extension;

import com.alibaba.griver.api.common.webview.GriverUserAgentExtension;
import com.iap.ac.android.common.container.provider.ContainerUaProvider;

public class UserAgentExtensionImpl implements GriverUserAgentExtension {
    private ContainerUaProvider uaProvider;

    public UserAgentExtensionImpl(ContainerUaProvider containerUaProvider) {
        this.uaProvider = containerUaProvider;
    }

    public String getUserAgent() {
        ContainerUaProvider containerUaProvider = this.uaProvider;
        if (containerUaProvider != null) {
            return containerUaProvider.getUa("");
        }
        return "";
    }
}
