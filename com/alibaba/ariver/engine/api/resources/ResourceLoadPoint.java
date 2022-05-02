package com.alibaba.ariver.engine.api.resources;

import com.alibaba.ariver.engine.api.extensions.resources.model.ResourceLoadContext;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;

@AutoExtension
public interface ResourceLoadPoint extends Extension {
    @ThreadType(ExecutorType.SYNC)
    Resource load(ResourceLoadContext resourceLoadContext);

    @ThreadType(ExecutorType.SYNC)
    Resource loadGlobalResource(String str);
}
