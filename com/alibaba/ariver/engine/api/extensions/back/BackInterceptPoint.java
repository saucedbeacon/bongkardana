package com.alibaba.ariver.engine.api.extensions.back;

import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.model.GoBackCallback;
import com.alibaba.ariver.engine.api.common.CommonBackPerform;
import com.alibaba.ariver.kernel.api.extension.Extension;

public interface BackInterceptPoint extends Extension {
    boolean intercepted(Render render, int i, CommonBackPerform.BackHandler backHandler, GoBackCallback goBackCallback);
}
