package com.alibaba.ariver.engine.api.extensions;

import android.os.Bundle;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;

@AutoExtension
public interface WorkerStartParamInjectPoint extends Extension {
    void injectStartParam(Bundle bundle);
}
