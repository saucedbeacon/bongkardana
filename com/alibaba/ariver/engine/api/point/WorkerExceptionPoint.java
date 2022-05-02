package com.alibaba.ariver.engine.api.point;

import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;

@AutoExtension
public interface WorkerExceptionPoint extends Extension {
    void onCreateWorkerException(String str);
}
