package com.alibaba.griver.device.proxy;

import android.app.Activity;
import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.ariver.resource.api.models.AppModel;
import java.util.Map;

public interface GriverOpenSettingExtension extends Proxiable {

    public interface SettingChangeCallback {
        void onSettingChange(Map<String, Boolean> map);
    }

    void showOpenSettingView(Activity activity, Map<String, Boolean> map, AppModel appModel, SettingChangeCallback settingChangeCallback);
}
