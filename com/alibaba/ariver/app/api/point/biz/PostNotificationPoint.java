package com.alibaba.ariver.app.api.point.biz;

import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.api.annotation.AutoExtension;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.fastjson.JSONObject;

@AutoExtension
public interface PostNotificationPoint extends Extension {
    void handlePostNotification(String str, JSONObject jSONObject, Page page);
}
