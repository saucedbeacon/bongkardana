package o;

import com.ap.zoloz.hummer.biz.HummerConstants;
import com.bca.xco.widget.connection.httpclient.internal.d.c;
import com.bca.xco.widget.connection.httpclient.s;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public class PostMessageService {
    private static final PostMessageService getMin;
    private static final Logger setMin = Logger.getLogger(getCardElevation.class.getName());

    /* renamed from: o.PostMessageService$1  reason: invalid class name */
    public interface AnonymousClass1 {
    }

    public boolean getMax(String str) {
        return true;
    }

    public String getMin(SSLSocket sSLSocket) {
        return null;
    }

    public void setMax(SSLSocket sSLSocket, String str, List<s> list) {
    }

    public void setMin(SSLSocket sSLSocket) {
    }

    public static PostMessageService getMax() {
        return getMin;
    }

    public X509TrustManager setMin(SSLSocketFactory sSLSocketFactory) {
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

    public void getMax(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public void setMin(int i, String str, Throwable th) {
        setMin.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public static List<String> length(List<s> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            s sVar = list.get(i);
            if (sVar != s.HTTP_1_0) {
                arrayList.add(sVar.toString());
            }
        }
        return arrayList;
    }

    public CustomTabsSession$MockSession length(X509TrustManager x509TrustManager) {
        return new onServiceConnected(TrustedWebActivityService.getMin(x509TrustManager));
    }

    static byte[] setMin(List<s> list) {
        maxSize maxsize = new maxSize();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            s sVar = list.get(i);
            if (sVar != s.HTTP_1_0) {
                maxsize.getMin(sVar.toString().length());
                String obj = sVar.toString();
                maxsize.setMin(obj, 0, obj.length());
            }
        }
        return maxsize.FastBitmap$CoordinateSystem();
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK, PHI: r4 
      PHI: (r4v1 java.lang.Object) = (r4v0 java.lang.Object), (r4v2 java.lang.Object) binds: [B:0:0x0000, B:20:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
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
        throw new UnsupportedOperationException("Method not decompiled: o.PostMessageService.setMax(java.lang.Object, java.lang.Class, java.lang.String):java.lang.Object");
    }

    static {
        PostMessageService length = setApplicationContext.length();
        if (length == null && (length = CustomTabsSessionToken$MockCallback.setMin()) == null && (length = c.setMax()) == null) {
            length = new PostMessageService();
        }
        getMin = length;
    }
}
