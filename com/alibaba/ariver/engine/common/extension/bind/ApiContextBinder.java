package com.alibaba.ariver.engine.common.extension.bind;

import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;

public class ApiContextBinder implements Binder<BindingApiContext, ApiContext> {

    /* renamed from: a  reason: collision with root package name */
    private ApiContext f8982a;

    public ApiContextBinder(ApiContext apiContext) {
        this.f8982a = apiContext;
    }

    public ApiContext bind(Class<ApiContext> cls, BindingApiContext bindingApiContext) {
        if (!bindingApiContext.required() || this.f8982a != null) {
            return this.f8982a;
        }
        throw new BindException("Required ApiContext but not inject!!!");
    }
}
