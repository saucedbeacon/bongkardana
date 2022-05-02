package com.alipay.imobile.network.quake.rpc;

import com.alipay.imobile.network.quake.Request;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

public class RpcRequest extends Request {

    /* renamed from: a  reason: collision with root package name */
    private Method f9373a = null;
    private String b = null;
    private boolean c = false;

    public RpcRequest(String str, Type type, Request.Listener listener, Request.ErrorListener errorListener) {
        super(str, type, listener, errorListener);
    }

    private Type a() {
        Method method = this.f9373a;
        return method == null ? Void.TYPE : method.getGenericReturnType();
    }

    public String getActionType() {
        return this.b;
    }

    public final Method getOperationMethod() {
        return this.f9373a;
    }

    public Type getResponseType() {
        return a();
    }

    public boolean isSkipRequestSerialize() {
        return this.c;
    }

    public final void setOperationMethod(Method method) {
        if (method != null) {
            this.f9373a = method;
        }
    }

    public final void setOperationType(String str) {
        if (str != null) {
            this.b = str;
        }
    }

    public void skipRequestSerialize() {
        this.c = true;
    }
}
