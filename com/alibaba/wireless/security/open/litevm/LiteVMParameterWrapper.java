package com.alibaba.wireless.security.open.litevm;

import com.alibaba.wireless.security.open.litevm.LiteVMParamType;

public class LiteVMParameterWrapper {

    /* renamed from: a  reason: collision with root package name */
    private LiteVMParamType.PARAM_TYPE f10642a;
    private Object b;

    public LiteVMParameterWrapper(LiteVMParamType.PARAM_TYPE param_type, Object obj) {
        this.f10642a = param_type;
        this.b = obj;
    }

    public int getType() {
        return this.f10642a.getValue();
    }

    public Object getValue() {
        return this.b;
    }
}
