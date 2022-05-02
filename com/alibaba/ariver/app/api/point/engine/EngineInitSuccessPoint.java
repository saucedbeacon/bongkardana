package com.alibaba.ariver.app.api.point.engine;

import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;

@AutoExtension
public interface EngineInitSuccessPoint extends Extension {
    void onInitSuccess();
}
