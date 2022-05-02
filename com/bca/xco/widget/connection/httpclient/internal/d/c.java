package com.bca.xco.widget.connection.httpclient.internal.d;

import com.bca.xco.widget.connection.httpclient.s;
import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.net.ssl.SSLSocket;
import o.CustomTabsIntent$ShareState;
import o.PostMessageService;

public final class c extends PostMessageService {
    private final Method getMax;
    private final Class<?> getMin;
    private final Method length;
    private final Method setMax;
    private final Class<?> setMin;

    private c(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.setMax = method;
        this.getMax = method2;
        this.length = method3;
        this.setMin = cls;
        this.getMin = cls2;
    }

    public final void setMax(SSLSocket sSLSocket, String str, List<s> list) {
        List<String> length2 = length(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(PostMessageService.class.getClassLoader(), new Class[]{this.setMin, this.getMin}, new a(length2));
            this.setMax.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new AssertionError(e);
        }
    }

    public final void setMin(SSLSocket sSLSocket) {
        try {
            this.length.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }

    public final String getMin(SSLSocket sSLSocket) {
        try {
            a aVar = (a) Proxy.getInvocationHandler(this.getMax.invoke((Object) null, new Object[]{sSLSocket}));
            if (!aVar.getMax && aVar.setMin == null) {
                PostMessageService.getMax().setMin(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (aVar.getMax) {
                return null;
            } else {
                return aVar.setMin;
            }
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }

    public static PostMessageService setMax() {
        try {
            Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN");
            StringBuilder sb = new StringBuilder();
            sb.append("org.eclipse.jetty.alpn.ALPN");
            sb.append("$Provider");
            Class<?> cls2 = Class.forName(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append("org.eclipse.jetty.alpn.ALPN");
            sb2.append("$ClientProvider");
            Class<?> cls3 = Class.forName(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append("org.eclipse.jetty.alpn.ALPN");
            sb3.append("$ServerProvider");
            Class<?> cls4 = Class.forName(sb3.toString());
            Method method = cls.getMethod("put", new Class[]{SSLSocket.class, cls2});
            return new c(method, cls.getMethod(ContactEventType.CONTACT_GET, new Class[]{SSLSocket.class}), cls.getMethod("remove", new Class[]{SSLSocket.class}), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    static class a implements InvocationHandler {
        /* access modifiers changed from: private */
        public boolean getMax;
        private final List<String> setMax;
        /* access modifiers changed from: private */
        public String setMin;

        public a(List<String> list) {
            this.setMax = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = CustomTabsIntent$ShareState.setMax;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.getMax = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.setMax;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.setMax.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.setMin = str;
                            return str;
                        }
                    }
                    String str2 = this.setMax.get(0);
                    this.setMin = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.setMin = (String) objArr[0];
                    return null;
                }
            }
        }
    }
}
