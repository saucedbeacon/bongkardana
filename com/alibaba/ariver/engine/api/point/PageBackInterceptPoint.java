package com.alibaba.ariver.engine.api.point;

import com.alibaba.ariver.engine.api.bridge.model.GoBackCallback;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;

@AutoExtension
public interface PageBackInterceptPoint extends Extension {
    boolean interceptBackEvent(GoBackCallback goBackCallback);
}
