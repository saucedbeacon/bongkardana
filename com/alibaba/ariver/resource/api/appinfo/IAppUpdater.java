package com.alibaba.ariver.resource.api.appinfo;

import androidx.annotation.Nullable;

public interface IAppUpdater {
    void updateApp(UpdateAppParam updateAppParam, @Nullable UpdateAppCallback updateAppCallback);
}
