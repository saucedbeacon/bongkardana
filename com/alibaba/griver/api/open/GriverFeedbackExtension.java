package com.alibaba.griver.api.open;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.griver.api.common.GriverExtension;

public interface GriverFeedbackExtension extends GriverExtension {
    String getFeedbackMiniProgramId(Page page);
}
