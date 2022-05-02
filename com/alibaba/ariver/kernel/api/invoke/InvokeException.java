package com.alibaba.ariver.kernel.api.invoke;

public class InvokeException extends Exception {
    public InvokeException() {
    }

    public InvokeException(String str) {
        super(str);
    }

    public InvokeException(String str, Throwable th) {
        super(str, th);
    }

    public InvokeException(Throwable th) {
        super(th);
    }
}
