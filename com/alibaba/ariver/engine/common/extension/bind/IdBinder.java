package com.alibaba.ariver.engine.common.extension.bind;

import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingId;

public class IdBinder implements Binder<BindingId, String> {

    /* renamed from: a  reason: collision with root package name */
    private String f8984a;

    public IdBinder(String str) {
        this.f8984a = str;
    }

    public String bind(Class<String> cls, BindingId bindingId) {
        return this.f8984a;
    }
}
