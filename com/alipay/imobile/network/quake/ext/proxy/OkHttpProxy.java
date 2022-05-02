package com.alipay.imobile.network.quake.ext.proxy;

import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.Quake;
import com.alipay.imobile.network.quake.Request;
import com.alipay.imobile.network.quake.f;
import com.alipay.imobile.network.quake.transport.Transporter;
import com.alipay.imobile.network.quake.transport.TransporterCallBack;
import com.alipay.imobile.network.quake.transport.http.AbstractHttpTransport;
import com.alipay.imobile.network.quake.transport.http.CookieJar;
import com.alipay.imobile.network.quake.transport.http.HttpResponse;
import com.alipay.imobile.network.quake.util.a;
import com.alipay.mobile.common.rpc.RpcException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

public class OkHttpProxy extends AbstractHttpTransport {

    /* renamed from: a  reason: collision with root package name */
    private static Class<?> f9359a;
    private static Class<?> b;
    private static Class<?> c;
    private static Class<?> d;
    private Transporter e;

    static {
        try {
            f9359a = a.a("okhttp3.internal.huc.HttpURLConnectionImpl");
            b = a.a("o.generateKey");
            c = a.a("o.recordWsHsTime");
            d = a.a("com.alipay.imobile.network.quake.ext.okhttp.OkhttpBridge");
        } catch (Exception e2) {
            LoggerWrapper.e(Quake.TAG, "could not find okhttp dependence", e2);
        }
    }

    public OkHttpProxy(CookieJar cookieJar, boolean z) throws ClassNotFoundException {
        this(cookieJar, z, 5);
    }

    public OkHttpProxy(CookieJar cookieJar, boolean z, int i) throws ClassNotFoundException {
        if (f9359a == null) {
            throw new ClassNotFoundException("could not find dependence of okhttp urlconnection v3.2.0+");
        } else if (b == null) {
            throw new ClassNotFoundException("could not find dependence of okhttp v3.2.0+");
        } else if (c != null) {
            Class<?> cls = d;
            if (cls != null) {
                try {
                    this.e = (AbstractHttpTransport) cls.getConstructor(new Class[]{CookieJar.class, Boolean.TYPE}).newInstance(new Object[]{cookieJar, Boolean.valueOf(z)});
                } catch (NoSuchMethodException e2) {
                    LoggerWrapper.e(Quake.TAG, "", e2);
                    throw new ClassNotFoundException("could not find dependence of quake-okhttp");
                } catch (IllegalAccessException e3) {
                    LoggerWrapper.e(Quake.TAG, "", e3);
                    throw new ClassNotFoundException("could not find dependence of quake-okhttp");
                } catch (InstantiationException e4) {
                    LoggerWrapper.e(Quake.TAG, "", e4);
                    throw new ClassNotFoundException("could not find dependence of quake-okhttp");
                } catch (InvocationTargetException e5) {
                    LoggerWrapper.e(Quake.TAG, "", e5);
                    throw new ClassNotFoundException("could not find dependence of quake-okhttp");
                }
            } else {
                throw new ClassNotFoundException("could not find dependence of quake-okhttp");
            }
        } else {
            throw new ClassNotFoundException("could not find dependence of okio v1.6.0+");
        }
    }

    public OkHttpProxy(boolean z) throws ClassNotFoundException {
        this(f.a().e().getCookieJar(), z, 5);
    }

    public OkHttpProxy(boolean z, int i) throws ClassNotFoundException {
        this(f.a().e().getCookieJar(), z, i);
    }

    public HttpResponse performRequest(Request request, Map<String, String> map) throws IOException, RpcException {
        return null;
    }

    public void submitRequest(Request request, TransporterCallBack transporterCallBack) {
        Transporter transporter = this.e;
        if (transporter != null) {
            transporter.submitRequest(request, transporterCallBack);
        }
    }
}
