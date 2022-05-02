package com.alibaba.griver.api.resource.appinfo;

public interface GriverAppUpdaterProxy {
    void updateApp(UpdateAppParam updateAppParam, UpdateAppCallback updateAppCallback);
}
