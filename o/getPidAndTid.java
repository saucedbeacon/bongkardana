package o;

import android.os.Build;
import com.iap.ac.android.gol.google.supergw.SuperGwUtils;
import id.dana.lib.gcontainer.app.bridge.contact.ContactEventType;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

class getPidAndTid extends MPaaSSCLogCatImpl {
    private final noteTraficConsume<Socket> getMax;
    private final Class<?> getMin;
    private final getMin isInside = getMin.setMin();
    private final noteTraficConsume<Socket> length;
    private final noteTraficConsume<Socket> setMax;
    private final noteTraficConsume<Socket> setMin;

    public final void setMax(int i, String str, @Nullable Throwable th) {
    }

    getPidAndTid(Class<?> cls, noteTraficConsume<Socket> notetraficconsume, noteTraficConsume<Socket> notetraficconsume2, noteTraficConsume<Socket> notetraficconsume3, noteTraficConsume<Socket> notetraficconsume4) {
        this.getMin = cls;
        this.setMax = notetraficconsume;
        this.setMin = notetraficconsume2;
        this.length = notetraficconsume3;
        this.getMax = notetraficconsume4;
    }

    public final void length(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (initCloseCode.getMax(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (SecurityException e2) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT == 26) {
                IOException iOException2 = new IOException("Exception in connect");
                iOException2.initCause(e3);
                throw iOException2;
            }
            throw e3;
        }
    }

    /* access modifiers changed from: protected */
    @Nullable
    public final X509TrustManager setMax(SSLSocketFactory sSLSocketFactory) {
        Object max = setMax((Object) sSLSocketFactory, this.getMin, "sslParameters");
        if (max == null) {
            try {
                max = setMax((Object) sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.setMax(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) setMax((Object) max, X509TrustManager.class, "x509TrustManager");
        if (x509TrustManager != null) {
            return x509TrustManager;
        }
        return (X509TrustManager) setMax((Object) max, X509TrustManager.class, "trustManager");
    }

    public void getMin(SSLSocket sSLSocket, String str, List<Protocol> list) throws IOException {
        if (str != null) {
            this.setMax.setMin(sSLSocket, Boolean.TRUE);
            this.setMin.setMin(sSLSocket, str);
        }
        noteTraficConsume<Socket> notetraficconsume = this.getMax;
        if (notetraficconsume != null && notetraficconsume.getMin(sSLSocket)) {
            this.getMax.setMax(sSLSocket, setMin(list));
        }
    }

    @Nullable
    public String setMin(SSLSocket sSLSocket) {
        byte[] bArr;
        noteTraficConsume<Socket> notetraficconsume = this.length;
        if (notetraficconsume == null || !notetraficconsume.getMin(sSLSocket) || (bArr = (byte[]) this.length.setMax(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, initCloseCode.setMax);
    }

    public final Object getMin(String str) {
        return this.isInside.length(str);
    }

    public final void getMax(String str, Object obj) {
        this.isInside.getMax(obj);
    }

    public final boolean setMin(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return super.setMin(str);
        }
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return setMin(str, cls, cls.getMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.setMin(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            throw initCloseCode.length("unable to determine cleartext support", e);
        }
    }

    private boolean setMin(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[]{String.class}).invoke(obj, new Object[]{str})).booleanValue();
        } catch (NoSuchMethodException unused) {
            return getMax(str, cls, obj);
        }
    }

    private boolean getMax(String str, Class<?> cls, Object obj) throws InvocationTargetException, IllegalAccessException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.setMin(str);
        }
    }

    private static boolean getMin() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final executeLowPri getMin(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new setMax(cls.getConstructor(new Class[]{X509TrustManager.class}).newInstance(new Object[]{x509TrustManager}), cls.getMethod("checkServerTrusted", new Class[]{X509Certificate[].class, String.class, String.class}));
        } catch (Exception unused) {
            return super.getMin(x509TrustManager);
        }
    }

    public static MPaaSSCLogCatImpl getMax() {
        Class<?> cls;
        noteTraficConsume notetraficconsume;
        noteTraficConsume notetraficconsume2;
        Class<byte[]> cls2 = byte[].class;
        if (!MPaaSSCLogCatImpl.equals()) {
            return null;
        }
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
        noteTraficConsume notetraficconsume3 = new noteTraficConsume((Class<?>) null, "setUseSessionTickets", Boolean.TYPE);
        noteTraficConsume notetraficconsume4 = new noteTraficConsume((Class<?>) null, "setHostname", String.class);
        if (getMin()) {
            noteTraficConsume notetraficconsume5 = new noteTraficConsume(cls2, "getAlpnSelectedProtocol", new Class[0]);
            notetraficconsume = new noteTraficConsume((Class<?>) null, "setAlpnProtocols", cls2);
            notetraficconsume2 = notetraficconsume5;
        } else {
            notetraficconsume2 = null;
            notetraficconsume = null;
        }
        return new getPidAndTid(cls3, notetraficconsume3, notetraficconsume4, notetraficconsume2, notetraficconsume);
    }

    public final enableTlsExtensions setMax(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", new Class[]{X509Certificate.class});
            declaredMethod.setAccessible(true);
            return new length(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.setMax(x509TrustManager);
        }
    }

    static final class setMax extends executeLowPri {
        private final Method getMax;
        private final Object getMin;

        public final int hashCode() {
            return 0;
        }

        setMax(Object obj, Method method) {
            this.getMin = obj;
            this.getMax = method;
        }

        public final List<Certificate> setMin(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.getMax.invoke(this.getMin, new Object[]{(X509Certificate[]) list.toArray(new X509Certificate[list.size()]), SuperGwUtils.SIGN_TYPE, str});
            } catch (InvocationTargetException e) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e.getMessage());
                sSLPeerUnverifiedException.initCause(e);
                throw sSLPeerUnverifiedException;
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            }
        }

        public final boolean equals(Object obj) {
            return obj instanceof setMax;
        }
    }

    static final class getMin {
        private final Method getMax;
        private final Method length;
        private final Method setMax;

        private getMin(Method method, Method method2, Method method3) {
            this.setMax = method;
            this.length = method2;
            this.getMax = method3;
        }

        /* access modifiers changed from: package-private */
        public final Object length(String str) {
            Method method = this.setMax;
            if (method != null) {
                try {
                    Object invoke = method.invoke((Object) null, new Object[0]);
                    this.length.invoke(invoke, new Object[]{str});
                    return invoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        public final boolean getMax(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.getMax.invoke(obj, new Object[0]);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        static getMin setMin() {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod(ContactEventType.CONTACT_GET, new Class[0]);
                method = cls.getMethod("open", new Class[]{String.class});
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
                method3 = method4;
            } catch (Exception unused) {
                method2 = null;
                method = null;
            }
            return new getMin(method3, method, method2);
        }
    }

    static final class length implements enableTlsExtensions {
        private final Method length;
        private final X509TrustManager setMax;

        length(X509TrustManager x509TrustManager, Method method) {
            this.length = method;
            this.setMax = x509TrustManager;
        }

        public final X509Certificate getMax(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.length.invoke(this.setMax, new Object[]{x509Certificate});
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e) {
                throw initCloseCode.length("unable to get issues and signature", (Exception) e);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof length)) {
                return false;
            }
            length length2 = (length) obj;
            return this.setMax.equals(length2.setMax) && this.length.equals(length2.length);
        }

        public final int hashCode() {
            return this.setMax.hashCode() + (this.length.hashCode() * 31);
        }
    }

    public final SSLContext setMin() {
        boolean z = true;
        try {
            if (Build.VERSION.SDK_INT < 16 || Build.VERSION.SDK_INT >= 22) {
                z = false;
            }
        } catch (NoClassDefFoundError unused) {
        }
        if (z) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused2) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    static int setMax() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }
}
