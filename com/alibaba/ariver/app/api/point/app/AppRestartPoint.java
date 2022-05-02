package com.alibaba.ariver.app.api.point.app;

import android.os.Bundle;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.AppRestartResult;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;

@AutoExtension
public interface AppRestartPoint extends Extension {
    @ThreadType(ExecutorType.SYNC)
    AppRestartResult onAppRestart(App app, Bundle bundle, Bundle bundle2);
}
