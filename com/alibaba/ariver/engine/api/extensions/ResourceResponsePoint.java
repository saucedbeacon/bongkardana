package com.alibaba.ariver.engine.api.extensions;

import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;

@AutoExtension
public interface ResourceResponsePoint extends Extension {
    void onResourceResponse(ResourceResponseInfo resourceResponseInfo);
}
