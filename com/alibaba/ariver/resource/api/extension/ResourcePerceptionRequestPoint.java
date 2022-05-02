package com.alibaba.ariver.resource.api.extension;

import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import java.util.Map;

@AutoExtension
public interface ResourcePerceptionRequestPoint extends Extension {
    @ThreadType(ExecutorType.URGENT)
    void onResourceRequest(String str, String str2, Map<String, String> map, long j);
}
