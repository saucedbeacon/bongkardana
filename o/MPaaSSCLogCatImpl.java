package o;

import com.ap.zoloz.hummer.biz.HummerConstants;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;
import okhttp3.internal.platform.JdkWithJettyBootPlatform;

public class MPaaSSCLogCatImpl {
    private static final MPaaSSCLogCatImpl length;
    private static final Logger setMin = Logger.getLogger(generateKey.class.getName());

    public static String toFloatRange() {
        return "OkHttp";
    }

    public void getMax(SSLSocketFactory sSLSocketFactory) {
    }

    public void getMin(SSLSocket sSLSocket, @Nullable String str, List<Protocol> list) throws IOException {
    }

    public void setMax(SSLSocket sSLSocket) {
    }

    @Nullable
    public String setMin(SSLSocket sSLSocket) {
        return null;
    }

    public boolean setMin(String str) {
        return true;
    }

    public static MPaaSSCLogCatImpl toIntRange() {
        return length;
    }

    /* access modifiers changed from: protected */
    @Nullable
    public X509TrustManager setMax(SSLSocketFactory sSLSocketFactory) {
        try {
            Object max = setMax((Object) sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), HummerConstants.CONTEXT);
            if (max == null) {
                return null;
            }
            return (X509TrustManager) setMax((Object) max, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public void length(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public void setMax(int i, String str, @Nullable Throwable th) {
        setMin.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public Object getMin(String str) {
        if (setMin.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public void getMax(String str, Object obj) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = sb.toString();
        }
        setMax(5, str, (Throwable) obj);
    }

    public static List<String> setMax(List<Protocol> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                arrayList.add(protocol.toString());
            }
        }
        return arrayList;
    }

    public executeLowPri getMin(X509TrustManager x509TrustManager) {
        return new MPaaSNetworkAsyncTaskExecutor(setMax(x509TrustManager));
    }

    public final executeLowPri getMin(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager max = setMax(sSLSocketFactory);
        if (max != null) {
            return getMin(max);
        }
        StringBuilder sb = new StringBuilder("Unable to extract the trust manager on ");
        sb.append(length);
        sb.append(", sslSocketFactory is ");
        sb.append(sSLSocketFactory.getClass());
        throw new IllegalStateException(sb.toString());
    }

    private static boolean setMax() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public static boolean equals() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    static byte[] setMin(List<Protocol> list) {
        submitLazy submitlazy = new submitLazy();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Protocol protocol = list.get(i);
            if (protocol != Protocol.HTTP_1_0) {
                submitlazy.equals(protocol.toString().length());
                String obj = protocol.toString();
                submitlazy.setMin(obj, 0, obj.length());
            }
        }
        return submitlazy.valueOf();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 java.lang.Object) = (r4v0 java.lang.Object), (r4v2 java.lang.Object) binds: [B:0:0x0000, B:20:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    @javax.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> T setMax(java.lang.Object r4, java.lang.Class<T> r5, java.lang.String r6) {
        /*
        L_0x0000:
            java.lang.Class r0 = r4.getClass()
        L_0x0004:
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r2 = 0
            if (r0 == r1) goto L_0x002f
            java.lang.reflect.Field r1 = r0.getDeclaredField(r6)     // Catch:{ NoSuchFieldException -> 0x002a, IllegalAccessException -> 0x0024 }
            r3 = 1
            r1.setAccessible(r3)     // Catch:{ NoSuchFieldException -> 0x002a, IllegalAccessException -> 0x0024 }
            java.lang.Object r1 = r1.get(r4)     // Catch:{ NoSuchFieldException -> 0x002a, IllegalAccessException -> 0x0024 }
            if (r1 == 0) goto L_0x0023
            boolean r3 = r5.isInstance(r1)     // Catch:{ NoSuchFieldException -> 0x002a, IllegalAccessException -> 0x0024 }
            if (r3 != 0) goto L_0x001e
            goto L_0x0023
        L_0x001e:
            java.lang.Object r4 = r5.cast(r1)     // Catch:{ NoSuchFieldException -> 0x002a, IllegalAccessException -> 0x0024 }
            return r4
        L_0x0023:
            return r2
        L_0x0024:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            r4.<init>()
            throw r4
        L_0x002a:
            java.lang.Class r0 = r0.getSuperclass()
            goto L_0x0004
        L_0x002f:
            java.lang.String r0 = "delegate"
            boolean r1 = r6.equals(r0)
            if (r1 != 0) goto L_0x0040
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            java.lang.Object r4 = setMax((java.lang.Object) r4, r1, (java.lang.String) r0)
            if (r4 == 0) goto L_0x0040
            goto L_0x0000
        L_0x0040:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: o.MPaaSSCLogCatImpl.setMax(java.lang.Object, java.lang.Class, java.lang.String):java.lang.Object");
    }

    public SSLContext setMin() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public enableTlsExtensions setMax(X509TrustManager x509TrustManager) {
        return new executeLazy(x509TrustManager.getAcceptedIssuers());
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    static {
        MPaaSSCLogCatImpl mPaaSSCLogCatImpl;
        if (equals()) {
            mPaaSSCLogCatImpl = printInfo.length();
            if (mPaaSSCLogCatImpl == null && (mPaaSSCLogCatImpl = getPidAndTid.getMax()) == null) {
                throw new NullPointerException("No platform found on Android");
            }
        } else if ((!setMax() || (mPaaSSCLogCatImpl = MPaaSMonitorPrinter.length()) == null) && (mPaaSSCLogCatImpl = MPaaSSSLExtensions.getMin()) == null && (mPaaSSCLogCatImpl = JdkWithJettyBootPlatform.length()) == null) {
            mPaaSSCLogCatImpl = new MPaaSSCLogCatImpl();
        }
        length = mPaaSSCLogCatImpl;
    }
}
