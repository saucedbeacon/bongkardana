package o;

import com.bca.xco.widget.connection.httpclient.s;
import com.iap.ac.android.gol.google.supergw.SuperGwUtils;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

final class setApplicationContext extends PostMessageService {
    private final Class<?> getMax;
    private final onCustomTabsServiceConnected<Socket> getMin;
    private final onCustomTabsServiceConnected<Socket> length;
    private final onCustomTabsServiceConnected<Socket> setMax;
    private final onCustomTabsServiceConnected<Socket> setMin;

    public final void setMin(int i, String str, Throwable th) {
    }

    private setApplicationContext(Class<?> cls, onCustomTabsServiceConnected<Socket> oncustomtabsserviceconnected, onCustomTabsServiceConnected<Socket> oncustomtabsserviceconnected2, onCustomTabsServiceConnected<Socket> oncustomtabsserviceconnected3, onCustomTabsServiceConnected<Socket> oncustomtabsserviceconnected4) {
        this.getMax = cls;
        this.setMax = oncustomtabsserviceconnected;
        this.setMin = oncustomtabsserviceconnected2;
        this.getMin = oncustomtabsserviceconnected3;
        this.length = oncustomtabsserviceconnected4;
    }

    public final void getMax(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (CustomTabsIntent$ShareState.getMin(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (SecurityException e2) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        }
    }

    public final X509TrustManager setMin(SSLSocketFactory sSLSocketFactory) {
        Object max = setMax((Object) sSLSocketFactory, this.getMax, "sslParameters");
        if (max == null) {
            try {
                max = setMax((Object) sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.setMin(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) setMax((Object) max, X509TrustManager.class, "x509TrustManager");
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        return (X509TrustManager) setMax((Object) max, X509TrustManager.class, "trustManager");
    }

    public final void setMax(SSLSocket sSLSocket, String str, List<s> list) {
        if (str != null) {
            this.setMax.length(sSLSocket, Boolean.TRUE);
            this.setMin.length(sSLSocket, str);
        }
        onCustomTabsServiceConnected<Socket> oncustomtabsserviceconnected = this.length;
        if (oncustomtabsserviceconnected != null && oncustomtabsserviceconnected.getMax(sSLSocket)) {
            this.length.getMin(sSLSocket, setMin(list));
        }
    }

    public final String getMin(SSLSocket sSLSocket) {
        byte[] bArr;
        onCustomTabsServiceConnected<Socket> oncustomtabsserviceconnected = this.getMin;
        if (oncustomtabsserviceconnected == null || !oncustomtabsserviceconnected.getMax(sSLSocket) || (bArr = (byte[]) this.getMin.getMin(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, CustomTabsIntent$ShareState.length);
    }

    public final boolean getMax(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(invoke, new Object[]{str})).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.getMax(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused2) {
            throw new AssertionError();
        }
    }

    public final CustomTabsSession$MockSession length(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new setMin(cls.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, String.class, String.class}));
        } catch (Exception unused) {
            return super.length(x509TrustManager);
        }
    }

    public static PostMessageService length() {
        Class<?> cls;
        onCustomTabsServiceConnected oncustomtabsserviceconnected;
        onCustomTabsServiceConnected oncustomtabsserviceconnected2;
        Class<byte[]> cls2 = byte[].class;
        try {
            cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
        } catch (ClassNotFoundException unused) {
            try {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            } catch (ClassNotFoundException unused2) {
                return null;
            }
        }
        Class<?> cls3 = cls;
        onCustomTabsServiceConnected oncustomtabsserviceconnected3 = new onCustomTabsServiceConnected((Class<?>) null, "setUseSessionTickets", Boolean.TYPE);
        onCustomTabsServiceConnected oncustomtabsserviceconnected4 = new onCustomTabsServiceConnected((Class<?>) null, "setHostname", String.class);
        try {
            Class.forName("android.net.Network");
            oncustomtabsserviceconnected2 = new onCustomTabsServiceConnected(cls2, "getAlpnSelectedProtocol", new Class[0]);
            try {
                oncustomtabsserviceconnected = new onCustomTabsServiceConnected((Class<?>) null, "setAlpnProtocols", cls2);
            } catch (ClassNotFoundException unused3) {
                oncustomtabsserviceconnected = null;
                return new setApplicationContext(cls3, oncustomtabsserviceconnected3, oncustomtabsserviceconnected4, oncustomtabsserviceconnected2, oncustomtabsserviceconnected);
            }
        } catch (ClassNotFoundException unused4) {
            oncustomtabsserviceconnected2 = null;
            oncustomtabsserviceconnected = null;
            return new setApplicationContext(cls3, oncustomtabsserviceconnected3, oncustomtabsserviceconnected4, oncustomtabsserviceconnected2, oncustomtabsserviceconnected);
        }
        return new setApplicationContext(cls3, oncustomtabsserviceconnected3, oncustomtabsserviceconnected4, oncustomtabsserviceconnected2, oncustomtabsserviceconnected);
    }

    static final class setMin extends CustomTabsSession$MockSession {
        private final Object setMax;
        private final Method setMin;

        setMin(Object obj, Method method) {
            this.setMax = obj;
            this.setMin = method;
        }

        public final List<Certificate> setMax(List<Certificate> list, String str) {
            try {
                return (List) this.setMin.invoke(this.setMax, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), SuperGwUtils.SIGN_TYPE, str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }
    }
}
