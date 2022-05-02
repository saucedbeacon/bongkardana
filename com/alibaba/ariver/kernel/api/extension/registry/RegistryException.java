package com.alibaba.ariver.kernel.api.extension.registry;

public class RegistryException extends RuntimeException {
    public RegistryException(String str) {
        super(str);
    }

    public RegistryException(String str, Throwable th) {
        super(str, th);
    }
}
