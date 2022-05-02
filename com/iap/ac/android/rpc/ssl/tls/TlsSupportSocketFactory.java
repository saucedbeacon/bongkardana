package com.iap.ac.android.rpc.ssl.tls;

import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.common.log.ACLog;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

public class TlsSupportSocketFactory extends SSLSocketFactory {
    @NonNull
    private static final String[] PATCH_TLS_PROTOCOLS = {"SSLv3", "TLSv1", "TLSv1.1", "TLSv1.2"};
    private static final String TAG = "Quake-TLS";
    @NonNull
    private SSLSocketFactory mProxyFactory;

    public TlsSupportSocketFactory(@NonNull SSLSocketFactory sSLSocketFactory) {
        this.mProxyFactory = sSLSocketFactory;
    }

    @Nullable
    public static SSLSocketFactory createDefaultPatchSSLSocketFactory() {
        try {
            SSLContext instance = SSLContext.getInstance("TLS");
            instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
            return patchSSLSocketFactory(instance.getSocketFactory());
        } catch (Throwable th) {
            ACLog.w(TAG, "patchSSLSocketFactory error: ".concat(String.valueOf(th)));
            return null;
        }
    }

    @Nullable
    public static SSLSocketFactory patchSSLSocketFactory(@Nullable SSLSocketFactory sSLSocketFactory) {
        if (sSLSocketFactory == null) {
            return null;
        }
        if (!isNeedPatchTlsSupport()) {
            return sSLSocketFactory;
        }
        return new TlsSupportSocketFactory(sSLSocketFactory);
    }

    public static boolean isNeedPatchTlsSupport() {
        if (Build.VERSION.SDK_INT < 16 || Build.VERSION.SDK_INT >= 21) {
            StringBuilder sb = new StringBuilder("[enableTlsSupport] skip for osVersion = ");
            sb.append(Build.VERSION.SDK_INT);
            ACLog.d(TAG, sb.toString());
            return false;
        }
        StringBuilder sb2 = new StringBuilder("[enableTlsSupport] patch for osVersion = ");
        sb2.append(Build.VERSION.SDK_INT);
        ACLog.d(TAG, sb2.toString());
        return true;
    }

    public String[] getDefaultCipherSuites() {
        return this.mProxyFactory.getDefaultCipherSuites();
    }

    public String[] getSupportedCipherSuites() {
        return this.mProxyFactory.getSupportedCipherSuites();
    }

    public Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return patchTlsSocket(this.mProxyFactory.createSocket(socket, str, i, z));
    }

    private Socket patchTlsSocket(@Nullable Socket socket) {
        if (socket instanceof SSLSocket) {
            try {
                ((SSLSocket) socket).setEnabledProtocols(PATCH_TLS_PROTOCOLS);
            } catch (Throwable th) {
                ACLog.w(TAG, "patchTlsSocket error: ".concat(String.valueOf(th)));
            }
        }
        return socket;
    }

    public Socket createSocket() throws IOException {
        return patchTlsSocket(this.mProxyFactory.createSocket());
    }

    public Socket createSocket(String str, int i) throws IOException, UnknownHostException {
        return patchTlsSocket(this.mProxyFactory.createSocket(str, i));
    }

    public Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException, UnknownHostException {
        return patchTlsSocket(this.mProxyFactory.createSocket(str, i, inetAddress, i2));
    }

    public Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return patchTlsSocket(this.mProxyFactory.createSocket(inetAddress, i));
    }

    public Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return patchTlsSocket(this.mProxyFactory.createSocket(inetAddress, i, inetAddress2, i2));
    }
}
