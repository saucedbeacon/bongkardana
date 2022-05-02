package com.alibaba.griver.api.ui;

import com.alibaba.ariver.app.api.App;
import com.alibaba.griver.api.common.GriverExtension;

public interface GriverAppExtension extends GriverExtension {
    App getAppByAppId(String str);

    App getAppByUrl(String str);

    void onAppExit(App app);

    void onAppStart(App app);
}
