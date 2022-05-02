package com.alibaba.ariver.kernel.api.extension.bridge;

import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.fastjson.JSONArray;

public interface IBridgeDSLProxy extends Proxiable {
    JSONArray getBridgeDSL();
}
