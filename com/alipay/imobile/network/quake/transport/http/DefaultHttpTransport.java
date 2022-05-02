package com.alipay.imobile.network.quake.transport.http;

import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.Quake;
import com.alipay.imobile.network.quake.Request;
import com.alipay.imobile.network.quake.ext.proxy.OkHttpProxy;
import com.alipay.imobile.network.quake.transport.TransporterCallBack;
import com.alipay.imobile.network.quake.transport.http.UrlTransport;
import com.alipay.imobile.network.tls.TlsSupportSocketFactory;
import com.alipay.mobile.common.rpc.RpcException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Map;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;

public class DefaultHttpTransport extends AbstractHttpTransport {

    /* renamed from: a  reason: collision with root package name */
    private AbstractHttpTransport f9379a;

    public DefaultHttpTransport() {
        try {
            this.f9379a = new OkHttpProxy(true);
            LoggerWrapper.d(Quake.TAG, "use okhttp proxy");
        } catch (ClassNotFoundException unused) {
            try {
                SSLContext instance = SSLContext.getInstance("TLS");
                instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
                this.f9379a = new UrlTransport((UrlTransport.a) null, TlsSupportSocketFactory.patchSSLSocketFactory(instance.getSocketFactory()));
                LoggerWrapper.d(Quake.TAG, "use UrlTransport");
            } catch (GeneralSecurityException unused2) {
                LoggerWrapper.d(Quake.TAG, "unable to instantiate UrlTransport");
            }
        }
    }

    /* access modifiers changed from: protected */
    public HttpResponse performRequest(Request request, Map<String, String> map) throws IOException, RpcException {
        return this.f9379a.performRequest(request, map);
    }

    public void setUserAgent(String str) {
        this.f9379a.setUserAgent(str);
    }

    public void submitRequest(Request request, TransporterCallBack transporterCallBack) {
        this.f9379a.submitRequest(request, transporterCallBack);
    }
}
