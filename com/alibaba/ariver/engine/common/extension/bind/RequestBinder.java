package com.alibaba.ariver.engine.common.extension.bind;

import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

public class RequestBinder<T> implements Binder<BindingRequest, T> {

    /* renamed from: a  reason: collision with root package name */
    private JSONObject f8987a;

    public RequestBinder(JSONObject jSONObject) {
        this.f8987a = jSONObject;
    }

    public T bind(Class<T> cls, BindingRequest bindingRequest) {
        JSONObject jSONObject = this.f8987a;
        if (jSONObject != null) {
            try {
                return JSON.toJavaObject(jSONObject, cls);
            } catch (Throwable th) {
                throw new BindException(th.getMessage());
            }
        } else {
            throw new BindException("input JSON is null");
        }
    }
}
