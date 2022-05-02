package com.alibaba.griver.api.ui.titlebar;

import com.alibaba.ariver.app.api.ui.titlebar.TitleBar;
import com.alibaba.fastjson.JSONArray;

public interface GVTitleBar extends TitleBar {
    void enableBackButton(boolean z);

    void enableCloseButton(boolean z);

    void setOptionMenu(String str, String str2, String str3, boolean z, String str4, boolean z2, JSONArray jSONArray, boolean z3, String str5, String str6, String str7);

    void setToolbarMenu(JSONArray jSONArray, boolean z, boolean z2);

    void showCloseButton(boolean z);
}
