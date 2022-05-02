package com.alibaba.griver.api.webview;

import com.alibaba.ariver.kernel.api.extension.Extension;

public interface PageFinishedPoint extends Extension {
    void onPageFinished(String str);
}
