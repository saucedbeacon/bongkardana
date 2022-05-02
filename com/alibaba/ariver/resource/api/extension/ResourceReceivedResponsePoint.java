package com.alibaba.ariver.resource.api.extension;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;
import java.util.Map;

@AutoExtension
public interface ResourceReceivedResponsePoint extends Extension {
    void onResourceResponse(Page page, String str, int i, Map<String, String> map, long j);
}
