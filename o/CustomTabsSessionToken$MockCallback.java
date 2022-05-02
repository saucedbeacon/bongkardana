package o;

import com.bca.xco.widget.connection.httpclient.s;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

final class CustomTabsSessionToken$MockCallback extends PostMessageService {
    final Method getMin;
    final Method setMin;

    private CustomTabsSessionToken$MockCallback(Method method, Method method2) {
        this.setMin = method;
        this.getMin = method2;
    }

    public final void setMax(SSLSocket sSLSocket, String str, List<s> list) {
        try {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            List<String> length = length(list);
            this.setMin.invoke(sSLParameters, new Object[]{length.toArray(new String[length.size()])});
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }

    public final String getMin(SSLSocket sSLSocket) {
        try {
            String str = (String) this.getMin.invoke(sSLSocket, new Object[0]);
            if (str == null || str.equals("")) {
                return null;
            }
            return str;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            throw new AssertionError();
        }
    }

    public final X509TrustManager setMin(SSLSocketFactory sSLSocketFactory) {
        throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on JDK 9+");
    }

    public static CustomTabsSessionToken$MockCallback setMin() {
        try {
            return new CustomTabsSessionToken$MockCallback(SSLParameters.class.getMethod("setApplicationProtocols", new Class[]{String[].class}), SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }
}
