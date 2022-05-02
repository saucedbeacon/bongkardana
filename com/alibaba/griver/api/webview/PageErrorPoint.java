package com.alibaba.griver.api.webview;

import com.alibaba.ariver.kernel.api.extension.Extension;

public interface PageErrorPoint extends Extension {
    void onPageError(String str);
}
