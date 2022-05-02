package com.alibaba.ariver.engine.common.extension.bind;

public class BindException extends RuntimeException {
    public BindException(String str) {
        super(str);
    }

    public BindException(String str, Throwable th) {
        super(str, th);
    }
}
