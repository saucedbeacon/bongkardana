package com.alibaba.griver.core.webview.extension;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.GriverExtension;
import com.alibaba.griver.core.render.c;
import com.alibaba.griver.core.render.e;
import com.alibaba.griver.core.render.k;

public interface GriverWebChromeClientExtension extends GriverExtension {
    k createWebChromeClient(Page page, c cVar, e eVar, boolean z);
}
