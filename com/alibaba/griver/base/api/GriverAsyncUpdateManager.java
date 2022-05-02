package com.alibaba.griver.base.api;

import com.alibaba.ariver.kernel.common.Proxiable;
import com.alibaba.fastjson.JSONObject;

public interface GriverAsyncUpdateManager extends Proxiable {
    String getAppId();

    void onDownloadResult(boolean z);

    void onUpdateResult(boolean z);

    void sendToRender(String str, JSONObject jSONObject);

    void setAppId(String str);
}
