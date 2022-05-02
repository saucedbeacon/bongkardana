package org.mozilla.javascript;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import o.checkOpen;

public class Undefined$1 implements InvocationHandler {
    public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
        if (method.getName().equals("toString")) {
            return "undefined";
        }
        if (method.getName().equals("equals")) {
            boolean z = false;
            if (objArr.length > 0 && checkOpen.isUndefined(objArr[0])) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
        StringBuilder sb = new StringBuilder("undefined doesn't support ");
        sb.append(method.getName());
        throw new UnsupportedOperationException(sb.toString());
    }
}
