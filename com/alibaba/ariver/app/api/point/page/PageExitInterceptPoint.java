package com.alibaba.ariver.app.api.point.page;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;

@AutoExtension
public interface PageExitInterceptPoint extends Extension {
    boolean interceptPageExit(Page page);
}
