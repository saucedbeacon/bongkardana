package com.alibaba.griver.api.h5.point;

import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.fastjson.JSONObject;

public interface GriverOptionMenuClickPoint extends Extension {
    void menuClick(JSONObject jSONObject);
}
