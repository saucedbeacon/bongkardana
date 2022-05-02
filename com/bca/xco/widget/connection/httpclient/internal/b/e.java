package com.bca.xco.widget.connection.httpclient.internal.b;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class e extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private static final Method f10775a;
    private IOException b;

    static {
        Method method;
        try {
            method = Throwable.class.getDeclaredMethod("addSuppressed", new Class[]{Throwable.class});
        } catch (Exception unused) {
            method = null;
        }
        f10775a = method;
    }

    public e(IOException iOException) {
        super(iOException);
        this.b = iOException;
    }

    public final IOException a() {
        return this.b;
    }

    public final void a(IOException iOException) {
        a(iOException, this.b);
        this.b = iOException;
    }

    private void a(IOException iOException, IOException iOException2) {
        Method method = f10775a;
        if (method != null) {
            try {
                method.invoke(iOException, new Object[]{iOException2});
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }
}
