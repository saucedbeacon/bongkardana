package com.alibaba.ariver.app.api.point.error;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;

@AutoExtension
public interface BlankScreenPoint extends Extension {
    @ThreadType(ExecutorType.IO)
    void onBlankScreen(Page page, JSONObject jSONObject);
}
