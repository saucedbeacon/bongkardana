package com.alibaba.griver.api.open;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.GriverExtension;

public interface GriverAboutUrlExtension extends GriverExtension {
    String getAboutUrl(Page page);
}
