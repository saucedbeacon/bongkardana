package com.alibaba.ariver.engine.common.extension.bind;

public class RequiredParamNotFoundException extends BindException {
    public RequiredParamNotFoundException(String str) {
        super(str);
    }

    public RequiredParamNotFoundException(String str, Throwable th) {
        super(str, th);
    }
}
