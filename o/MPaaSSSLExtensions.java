package o;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Protocol;

final class MPaaSSSLExtensions extends MPaaSSCLogCatImpl {
    final Method getMin;
    final Method length;

    private MPaaSSSLExtensions(Method method, Method method2) {
        this.getMin = method;
        this.length = method2;
    }

    public final void getMin(SSLSocket sSLSocket, String str, List<Protocol> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> max = setMax(list);
            this.getMin.invoke(sSLParameters, new Object[]{max.toArray(new String[max.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw initCloseCode.length("unable to set ssl parameters", (Exception) e);
        }
    }

    @Nullable
    public final String setMin(SSLSocket sSLSocket) {
        try {
            String str = (String) this.length.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof UnsupportedOperationException) {
                return null;
            }
            throw initCloseCode.length("failed to get ALPN selected protocol", (Exception) e);
        } catch (IllegalAccessException e2) {
            throw initCloseCode.length("failed to get ALPN selected protocol", (Exception) e2);
        }
    }

    public final X509TrustManager setMax(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    public static MPaaSSSLExtensions getMin() {
        try {
            return new MPaaSSSLExtensions(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
