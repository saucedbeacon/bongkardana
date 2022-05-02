package com.alibaba.ariver.engine.api.extensions;

import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.node.Node;

@AutoExtension
public interface WorkerCreateConfigPoint extends Extension {
    boolean isAsyncCreateWorker(Node node, String str, String str2);
}
