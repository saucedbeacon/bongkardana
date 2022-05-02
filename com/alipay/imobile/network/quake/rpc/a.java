package com.alipay.imobile.network.quake.rpc;

import com.alipay.mobile.framework.service.annotation.OperationType;
import java.lang.reflect.Method;

class a {
    static String a(Method method, Object[] objArr) throws IllegalStateException {
        OperationType operationType = (OperationType) method.getAnnotation(OperationType.class);
        if (operationType != null) {
            return operationType.value();
        }
        throw new IllegalStateException("OperationType must be set.");
    }
}
