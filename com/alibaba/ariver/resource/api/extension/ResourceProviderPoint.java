package com.alibaba.ariver.resource.api.extension;

import androidx.annotation.Keep;
import com.alibaba.ariver.engine.api.resources.Resource;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.resource.api.content.ResourceQuery;

@AutoExtension
@Keep
public interface ResourceProviderPoint extends Extension {
    Resource getResource(ResourceQuery resourceQuery);
}
