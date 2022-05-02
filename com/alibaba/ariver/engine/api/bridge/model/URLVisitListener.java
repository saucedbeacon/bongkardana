package com.alibaba.ariver.engine.api.bridge.model;

import com.alibaba.ariver.kernel.api.node.DataNode;

public interface URLVisitListener {
    DataNode onVisitStart(String str);
}
