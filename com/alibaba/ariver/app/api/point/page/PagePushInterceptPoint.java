package com.alibaba.ariver.app.api.point.page;

import android.os.Bundle;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;

@AutoExtension
public interface PagePushInterceptPoint extends Extension {
    @ThreadType(ExecutorType.SYNC)
    String interceptPushPage(App app, String str, Bundle bundle);
}
