package com.alibaba.griver.core.ui.menu;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.api.open.GriverAboutUrlExtension;
import com.alibaba.griver.base.common.config.GriverInnerConfig;

public class GriverAboutUrlExtensionImpl implements GriverAboutUrlExtension {
    public String getAboutUrl(Page page) {
        return GriverInnerConfig.getConfig(GriverConfigConstants.KEY_ABOUT_PAGE_URL);
    }
}
