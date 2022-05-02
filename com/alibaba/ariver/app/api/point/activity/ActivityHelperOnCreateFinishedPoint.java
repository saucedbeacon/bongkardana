package com.alibaba.ariver.app.api.point.activity;

import androidx.fragment.app.FragmentActivity;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.activity.StartClientBundle;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;

@AutoExtension
public interface ActivityHelperOnCreateFinishedPoint extends Extension {
    @ThreadType(ExecutorType.SYNC)
    void onActivityHelperOnCreateFinished(App app, FragmentActivity fragmentActivity, StartClientBundle startClientBundle);
}
