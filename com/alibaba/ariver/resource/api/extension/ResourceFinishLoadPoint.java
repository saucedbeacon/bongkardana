package com.alibaba.ariver.resource.api.extension;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;

@AutoExtension
public interface ResourceFinishLoadPoint extends Extension {
    void onResourceFinishLoad(Page page, String str, long j, long j2);
}
