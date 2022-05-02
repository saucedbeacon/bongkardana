package com.alibaba.ariver.console.view;

import android.view.View;
import com.alibaba.fastjson.JSONObject;

public interface IConsoleView {
    void destroy();

    View getView();

    void sendMsg(String str, JSONObject jSONObject);
}
