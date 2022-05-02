package com.alipay.imobile.network.quake;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.CookieSyncManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.cache.Cache;
import com.alipay.imobile.network.quake.exception.ReinitializationException;
import com.alipay.imobile.network.quake.protocol.Protocol;
import com.alipay.imobile.network.quake.request.RequestInterceptor;
import com.alipay.imobile.network.quake.transport.Transporter;
import com.alipay.imobile.network.quake.transport.strategy.a;
import com.alipay.imobile.network.quake.util.SignUtil;
import com.alipay.imobile.network.sslpinning.api.ISSLPinningManager;
import com.alipay.mobile.common.rpc.RpcException;
import java.util.LinkedList;
import java.util.List;

public class Quake implements IQuake {
    public static String TAG = "Quake";

    /* renamed from: a  reason: collision with root package name */
    private static IQuake f9338a;
    private g b;
    private f c;
    private Context d;
    private List<RequestInterceptor> e = new LinkedList();
    private ISSLPinningManager f;

    private Quake(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            this.d = applicationContext;
            LoggerWrapper.init(applicationContext);
            this.c = f.a(this.d);
            SignUtil.a();
            if (Build.VERSION.SDK_INT < 21) {
                CookieSyncManager.createInstance(this.d);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Context param must not be null.");
    }

    private void a() {
        if (this.b == null) {
            f fVar = this.c;
            g gVar = new g(fVar, fVar.e().getConcurrentRequestNumber());
            this.b = gVar;
            gVar.a();
        }
    }

    public static synchronized IQuake createInstance(Context context) {
        IQuake iQuake;
        synchronized (Quake.class) {
            if (f9338a == null) {
                f9338a = new Quake(context);
            }
            iQuake = f9338a;
        }
        return iQuake;
    }

    public static synchronized IQuake instance() throws RpcException {
        IQuake iQuake;
        synchronized (Quake.class) {
            if (f9338a != null) {
                iQuake = f9338a;
            } else {
                throw new RpcException((Integer) 9, "IQuake has not been initialized by createInstance(Context).");
            }
        }
        return iQuake;
    }

    public static void setLogTag(String str) {
        if (!TextUtils.isEmpty(str)) {
            TAG = str;
        }
    }

    public synchronized Request addRequest(Request request) {
        if (request == null) {
            return null;
        }
        if (this.b == null) {
            a();
        }
        for (RequestInterceptor beforeSendRequest : this.e) {
            beforeSendRequest.beforeSendRequest(request);
        }
        this.b.b(request);
        return request;
    }

    public void addRequestInterceptor(RequestInterceptor requestInterceptor) {
        if (requestInterceptor != null) {
            this.e.add(requestInterceptor);
        }
    }

    public synchronized void cancelRequest(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (this.b != null) {
                this.b.a((Object) str);
            }
        }
    }

    public synchronized void config(QuakeConfig quakeConfig) throws ReinitializationException {
        this.c.a(quakeConfig);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        com.alipay.iap.android.common.log.LoggerWrapper.d(TAG, "can not resolve the cache with the name=".concat(java.lang.String.valueOf(r3)));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.alipay.imobile.network.quake.cache.Cache getCache(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.alipay.imobile.network.quake.f r0 = r2.c     // Catch:{ ClientException -> 0x000b }
            com.alipay.imobile.network.quake.cache.Cache r3 = r0.d(r3)     // Catch:{ ClientException -> 0x000b }
            monitor-exit(r2)
            return r3
        L_0x0009:
            r3 = move-exception
            goto L_0x001d
        L_0x000b:
            java.lang.String r0 = TAG     // Catch:{ all -> 0x0009 }
            java.lang.String r1 = "can not resolve the cache with the name="
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0009 }
            java.lang.String r3 = r1.concat(r3)     // Catch:{ all -> 0x0009 }
            com.alipay.iap.android.common.log.LoggerWrapper.d(r0, r3)     // Catch:{ all -> 0x0009 }
            r3 = 0
            monitor-exit(r2)
            return r3
        L_0x001d:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.Quake.getCache(java.lang.String):com.alipay.imobile.network.quake.cache.Cache");
    }

    public synchronized QuakeConfig getConfig() {
        return this.c.e();
    }

    public Context getContext() {
        return this.d;
    }

    public synchronized String getDefaultCacheName() {
        return this.c.g();
    }

    public synchronized String getDefaultProtocolName() {
        return this.c.f();
    }

    public synchronized String getDefaultTransportName() {
        return this.c.h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        com.alipay.iap.android.common.log.LoggerWrapper.d(TAG, "can not resolve the protocol with the name=".concat(java.lang.String.valueOf(r3)));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.alipay.imobile.network.quake.protocol.Protocol getProtocol(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.alipay.imobile.network.quake.f r0 = r2.c     // Catch:{ ClientException -> 0x000b }
            com.alipay.imobile.network.quake.protocol.Protocol r3 = r0.b(r3)     // Catch:{ ClientException -> 0x000b }
            monitor-exit(r2)
            return r3
        L_0x0009:
            r3 = move-exception
            goto L_0x001d
        L_0x000b:
            java.lang.String r0 = TAG     // Catch:{ all -> 0x0009 }
            java.lang.String r1 = "can not resolve the protocol with the name="
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0009 }
            java.lang.String r3 = r1.concat(r3)     // Catch:{ all -> 0x0009 }
            com.alipay.iap.android.common.log.LoggerWrapper.d(r0, r3)     // Catch:{ all -> 0x0009 }
            r3 = 0
            monitor-exit(r2)
            return r3
        L_0x001d:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.Quake.getProtocol(java.lang.String):com.alipay.imobile.network.quake.protocol.Protocol");
    }

    @NonNull
    public List<RequestInterceptor> getRequestInterceptors() {
        return this.e;
    }

    @Nullable
    public ISSLPinningManager getSSLPinningManager() {
        return this.f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001c, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        com.alipay.iap.android.common.log.LoggerWrapper.d(TAG, "can not resolve the transport with the name=".concat(java.lang.String.valueOf(r3)));
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x000b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized com.alipay.imobile.network.quake.transport.Transporter getTransport(java.lang.String r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            com.alipay.imobile.network.quake.f r0 = r2.c     // Catch:{ ClientException -> 0x000b }
            com.alipay.imobile.network.quake.transport.Transporter r3 = r0.f(r3)     // Catch:{ ClientException -> 0x000b }
            monitor-exit(r2)
            return r3
        L_0x0009:
            r3 = move-exception
            goto L_0x001d
        L_0x000b:
            java.lang.String r0 = TAG     // Catch:{ all -> 0x0009 }
            java.lang.String r1 = "can not resolve the transport with the name="
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x0009 }
            java.lang.String r3 = r1.concat(r3)     // Catch:{ all -> 0x0009 }
            com.alipay.iap.android.common.log.LoggerWrapper.d(r0, r3)     // Catch:{ all -> 0x0009 }
            r3 = 0
            monitor-exit(r2)
            return r3
        L_0x001d:
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.Quake.getTransport(java.lang.String):com.alipay.imobile.network.quake.transport.Transporter");
    }

    public synchronized void registerCache(String str, Cache cache) throws ReinitializationException {
        String str2 = TAG;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = cache == null ? null : cache.getClass().getName();
        LoggerWrapper.d(str2, LoggerWrapper.buildMessage("register cache with the name=%s, and class=%s", objArr));
        this.c.a(str, cache);
    }

    public synchronized void registerProtocol(String str, Protocol<?> protocol) throws ReinitializationException {
        String str2 = TAG;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = protocol == null ? null : protocol.getClass().getName();
        LoggerWrapper.d(str2, LoggerWrapper.buildMessage("register protocol with the name=%s, and class=%s", objArr));
        this.c.a(str, protocol);
    }

    public synchronized void registerTransport(String str, Transporter transporter) throws ReinitializationException {
        String str2 = TAG;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        objArr[1] = transporter == null ? null : transporter.getClass().getName();
        LoggerWrapper.d(str2, LoggerWrapper.buildMessage("register transporter with the name=%s, and class=%s", objArr));
        this.c.a(str, transporter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void release() {
        /*
            r3 = this;
            monitor-enter(r3)
            com.alipay.imobile.network.quake.IQuake r0 = f9338a     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0007
            monitor-exit(r3)
            return
        L_0x0007:
            r0 = 0
            f9338a = r0     // Catch:{ all -> 0x002b }
            java.lang.String r1 = TAG     // Catch:{ all -> 0x002b }
            java.lang.String r2 = "release Quake resource"
            com.alipay.iap.android.common.log.LoggerWrapper.d(r1, r2)     // Catch:{ all -> 0x002b }
            r3.d = r0     // Catch:{ all -> 0x002b }
            com.alipay.imobile.network.quake.g r1 = r3.b     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x001e
            com.alipay.imobile.network.quake.g r1 = r3.b     // Catch:{ all -> 0x002b }
            r1.b()     // Catch:{ all -> 0x002b }
            r3.b = r0     // Catch:{ all -> 0x002b }
        L_0x001e:
            com.alipay.imobile.network.quake.f r1 = r3.c     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0029
            com.alipay.imobile.network.quake.f r1 = r3.c     // Catch:{ all -> 0x002b }
            r1.c()     // Catch:{ all -> 0x002b }
            r3.c = r0     // Catch:{ all -> 0x002b }
        L_0x0029:
            monitor-exit(r3)
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.Quake.release():void");
    }

    public void removeRequestInterceptor(RequestInterceptor requestInterceptor) {
        this.e.remove(requestInterceptor);
    }

    public synchronized void setDefaultCacheName(String str) throws ReinitializationException {
        LoggerWrapper.d(TAG, "specify the default cache name: ".concat(String.valueOf(str)));
        this.c.c(str);
    }

    public synchronized void setDefaultProtocolName(String str) throws ReinitializationException {
        LoggerWrapper.d(TAG, "specify the default request protocol name: ".concat(String.valueOf(str)));
        this.c.a(str);
    }

    public synchronized void setDefaultTransportName(String str) throws ReinitializationException {
        LoggerWrapper.d(TAG, "specify the default transport name: ".concat(String.valueOf(str)));
        this.c.e(str);
    }

    public synchronized void setDefaultUserAgent(String str) {
        a.a(str);
    }

    public void setSSLPinningManager(@NonNull ISSLPinningManager iSSLPinningManager) {
        this.f = iSSLPinningManager;
    }
}
