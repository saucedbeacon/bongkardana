package okhttp3.internal.platform;

import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import o.MPaaSSCLogCatImpl;
import o.initCloseCode;
import okhttp3.Protocol;

public final class JdkWithJettyBootPlatform extends MPaaSSCLogCatImpl {
    private final Method getMax;
    private final Class<?> getMin;
    private final Method length;
    private final Method setMax;
    private final Class<?> setMin;

    private JdkWithJettyBootPlatform(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2) {
        this.setMax = method;
        this.getMax = method2;
        this.length = method3;
        this.setMin = cls;
        this.getMin = cls2;
    }

    public final void getMin(SSLSocket sSLSocket, String str, List<Protocol> list) {
        List<String> max = setMax(list);
        try {
            Object newProxyInstance = Proxy.newProxyInstance(MPaaSSCLogCatImpl.class.getClassLoader(), new Class[]{this.setMin, this.getMin}, new JettyNegoProvider(max));
            this.setMax.invoke((Object) null, new Object[]{sSLSocket, newProxyInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw initCloseCode.length("unable to set alpn", (Exception) e);
        }
    }

    public final void setMax(SSLSocket sSLSocket) {
        try {
            this.length.invoke((Object) null, new Object[]{sSLSocket});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw initCloseCode.length("unable to remove alpn", (Exception) e);
        }
    }

    @Nullable
    public final String setMin(SSLSocket sSLSocket) {
        try {
            JettyNegoProvider jettyNegoProvider = (JettyNegoProvider) Proxy.getInvocationHandler(this.getMax.invoke((Object) null, new Object[]{sSLSocket}));
            if (!jettyNegoProvider.setMin && jettyNegoProvider.getMin == null) {
                MPaaSSCLogCatImpl.toIntRange().setMax(4, "ALPN callback dropped: HTTP/2 is disabled. Is alpn-boot on the boot class path?", (Throwable) null);
                return null;
            } else if (jettyNegoProvider.setMin) {
                return null;
            } else {
                return jettyNegoProvider.getMin;
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw initCloseCode.length("unable to get selected protocol", (Exception) e);
        }
    }

    public static MPaaSSCLogCatImpl length() {
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
            return new JdkWithJettyBootPlatform(method, cls.getMethod(ContactEventType.CONTACT_GET, new Class[]{SSLSocket.class}), cls.getMethod("remove", new Class[]{SSLSocket.class}), cls3, cls4);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return null;
        }
    }

    static class JettyNegoProvider implements InvocationHandler {
        String getMin;
        private final List<String> length;
        boolean setMin;

        JettyNegoProvider(List<String> list) {
            this.length = list;
        }

        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = initCloseCode.getMin;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.setMin = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.length;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        if (this.length.contains(list.get(i))) {
                            String str = (String) list.get(i);
                            this.getMin = str;
                            return str;
                        }
                    }
                    String str2 = this.length.get(0);
                    this.getMin = str2;
                    return str2;
                } else if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                    return method.invoke(this, objArr);
                } else {
                    this.getMin = (String) objArr[0];
                    return null;
                }
            }
        }
    }
}
