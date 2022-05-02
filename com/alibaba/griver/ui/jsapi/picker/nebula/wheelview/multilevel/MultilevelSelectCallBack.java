package com.alibaba.griver.ui.jsapi.picker.nebula.wheelview.multilevel;

import com.alibaba.fastjson.JSONArray;

public interface MultilevelSelectCallBack {
    void onCancel();

    void onSuccess(JSONArray jSONArray);
}
