package com.alibaba.ariver.app.api.point.app;

import android.os.Bundle;
import com.alibaba.ariver.app.api.AppLoadResult;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;

@AutoExtension
public interface AppLoadPoint extends Extension {

    public interface LoadResultCallback {
        void onResult(AppLoadResult appLoadResult);
    }

    @ThreadType(transSyncThreadNames = {"BIZ_SPECIFIC", "BIZ_SPECIFIC_SCHEDULED", "URGENT", "URGENT_DISPLAY"}, value = ExecutorType.URGENT_DISPLAY)
    void loadApp(String str, Bundle bundle, Bundle bundle2, LoadResultCallback loadResultCallback);
}
