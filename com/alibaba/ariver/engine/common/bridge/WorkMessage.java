package com.alibaba.ariver.engine.common.bridge;

import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.fastjson.JSONObject;

public class WorkMessage {

    /* renamed from: a  reason: collision with root package name */
    private String f10059a;
    private String b;
    private JSONObject c;
    private String d;
    private JSONObject e;

    public JSONObject getData() {
        return null;
    }

    public WorkMessage(String str) {
        JSONObject parseObject = JSONUtils.parseObject(str);
        this.e = parseObject;
        if (parseObject != null) {
            this.d = parseObject.getString("handlerName");
            this.f10059a = this.e.getString("clientId");
            JSONObject jSONObject = JSONUtils.getJSONObject(this.e, "data", (JSONObject) null);
            this.c = jSONObject;
            if (jSONObject == null) {
                this.b = jSONObject.getString("viewId");
            }
        }
    }

    public String getClientID() {
        return this.f10059a;
    }

    public String getRenderId() {
        return this.b;
    }

    public String getHandlerName() {
        return this.d;
    }

    public JSONObject getRaw() {
        return this.e;
    }
}
