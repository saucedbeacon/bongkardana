package com.alibaba.ariver.console;

import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.fastjson.JSONObject;

public interface DebugConsolePoint extends Extension {
    boolean isDebugPanelExists();

    void sendMsgToConsoleView(JSONObject jSONObject);

    void showToggleButton(boolean z);

    void toggleConsoleView();
}
