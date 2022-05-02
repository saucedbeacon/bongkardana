package com.alibaba.ariver.resource.api.extension;

import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;

@AutoExtension
public interface ResourceInterceptPoint extends Extension {
    Resource intercept(Resource resource);
}
