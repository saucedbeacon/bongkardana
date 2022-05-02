package com.alipay.imobile.network.quake;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.cache.Cache;
import com.alipay.imobile.network.quake.cache.DiskBasedCache;
import com.alipay.imobile.network.quake.exception.ClientException;
import com.alipay.imobile.network.quake.exception.ReinitializationException;
import com.alipay.imobile.network.quake.protocol.Protocol;
import com.alipay.imobile.network.quake.protocol.SimpleRpcServiceProtocolV1;
import com.alipay.imobile.network.quake.protocol.json.SignedJsonProtocolV1;
import com.alipay.imobile.network.quake.transport.Transporter;
import com.alipay.imobile.network.quake.transport.http.DefaultHttpTransport;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.framework.service.ext.SimpleRpcService;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static f f9362a;
    private Map<String, Protocol<?>> b;
    private Map<String, Cache> c;
    private Map<String, Transporter> d;
    private Context e;
    private String f;
    private String g;
    private String h = "";
    private String i = "INNER_JSON_SIGN_V1";
    private String j = "INNER_DISK_V1";
    private String k = "INNER_HTTP_V1";
    private String l = null;
    private String m;
    private String n;

    /* renamed from: o  reason: collision with root package name */
    private String f9363o;
    private QuakeConfig p;
    private boolean q = false;

    private f(Context context) {
        if (context != null) {
            this.b = new HashMap();
            this.c = new HashMap();
            this.d = new HashMap();
            this.e = context;
            return;
        }
        throw new RpcException((Integer) 9, "QuakeContext can not be initialized with null parameters.");
    }

    public static synchronized f a() throws RpcException {
        f fVar;
        synchronized (f.class) {
            if (f9362a != null) {
                fVar = f9362a;
            } else {
                throw new RpcException((Integer) 9, "QuakeContext instance has not been initialized.");
            }
        }
        return fVar;
    }

    public static synchronized f a(Context context) {
        f fVar;
        synchronized (f.class) {
            if (f9362a == null) {
                f9362a = new f(context);
            }
            fVar = f9362a;
        }
        return fVar;
    }

    private void o() {
        Protocol protocol = null;
        try {
            Class<?> cls = Class.forName("com.google.gson.Gson");
            Class<?> cls2 = Class.forName("com.alipay.imobile.network.quake.ext.protocol.gson.GsonProtocol");
            if (!(cls == null || cls2 == null || !Protocol.class.isAssignableFrom(cls2))) {
                LoggerWrapper.i(Quake.TAG, "register gson protocol as the default protocol");
                protocol = (Protocol) cls2.getDeclaredConstructor(new Class[]{Context.class}).newInstance(new Object[]{this.e});
            }
        } catch (Exception unused) {
            LoggerWrapper.i(Quake.TAG, "gson or gson protocol is not exist");
        }
        if (protocol == null) {
            LoggerWrapper.i(Quake.TAG, "register fastjson protocol as the default protocol");
            protocol = new SignedJsonProtocolV1(this.e);
        }
        f9362a.a("INNER_JSON_SIGN_V1", (Protocol<?>) protocol);
        f9362a.a(SimpleRpcService.OPERATION_TYPE, (Protocol<?>) new SimpleRpcServiceProtocolV1(this.e));
    }

    public void a(QuakeConfig quakeConfig) throws ReinitializationException {
        QuakeConfig quakeConfig2 = this.p;
        if (quakeConfig2 == null || quakeConfig == quakeConfig2) {
            this.p = quakeConfig;
            this.l = quakeConfig.getGwUrl();
            this.g = this.p.getAppId();
            this.f = this.p.getAppKeyForSecurityGuard();
            this.h = this.p.getAuthCodeForSecurityGuard();
            this.m = this.p.getVersion();
            this.n = this.p.getWorkspaceId();
            this.f9363o = this.p.getTenantId();
            b();
            return;
        }
        throw new ReinitializationException(9, "Error to duplicate setting QuakeConfig.");
    }

    public void a(String str) throws ReinitializationException {
        if (!TextUtils.isEmpty(str) && !this.i.equals(str) && !"INNER_JSON_SIGN_V1".equals(str)) {
            if ("INNER_JSON_SIGN_V1".equals(this.i)) {
                this.i = str;
                return;
            }
            throw new ReinitializationException(9, "The default protocol has been set");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(java.lang.String r4, com.alipay.imobile.network.quake.cache.Cache r5) throws com.alipay.imobile.network.quake.exception.ReinitializationException {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x005c
            if (r5 != 0) goto L_0x000a
            goto L_0x005c
        L_0x000a:
            java.util.Map<java.lang.String, com.alipay.imobile.network.quake.cache.Cache> r0 = r3.c     // Catch:{ all -> 0x005e }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0046
            java.util.Map<java.lang.String, com.alipay.imobile.network.quake.cache.Cache> r0 = r3.c     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x005e }
            com.alipay.imobile.network.quake.cache.Cache r0 = (com.alipay.imobile.network.quake.cache.Cache) r0     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0046
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0023
            goto L_0x0046
        L_0x0023:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            java.lang.String r1 = "The cache specified with name="
            r0.<init>(r1)     // Catch:{ all -> 0x005e }
            r0.append(r4)     // Catch:{ all -> 0x005e }
            java.lang.String r4 = " has already exist, and it is not equals to "
            r0.append(r4)     // Catch:{ all -> 0x005e }
            r0.append(r5)     // Catch:{ all -> 0x005e }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x005e }
            java.lang.String r5 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x005e }
            com.alipay.iap.android.common.log.LoggerWrapper.e(r5, r4)     // Catch:{ all -> 0x005e }
            com.alipay.imobile.network.quake.exception.ReinitializationException r5 = new com.alipay.imobile.network.quake.exception.ReinitializationException     // Catch:{ all -> 0x005e }
            r0 = 9
            r5.<init>(r0, r4)     // Catch:{ all -> 0x005e }
            throw r5     // Catch:{ all -> 0x005e }
        L_0x0046:
            java.lang.String r0 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x005e }
            java.lang.String r1 = "register cache with the name="
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x005e }
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x005e }
            com.alipay.iap.android.common.log.LoggerWrapper.d(r0, r1)     // Catch:{ all -> 0x005e }
            java.util.Map<java.lang.String, com.alipay.imobile.network.quake.cache.Cache> r0 = r3.c     // Catch:{ all -> 0x005e }
            r0.put(r4, r5)     // Catch:{ all -> 0x005e }
            monitor-exit(r3)
            return
        L_0x005c:
            monitor-exit(r3)
            return
        L_0x005e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.f.a(java.lang.String, com.alipay.imobile.network.quake.cache.Cache):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0083, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(java.lang.String r5, com.alipay.imobile.network.quake.protocol.Protocol<?> r6) throws com.alipay.imobile.network.quake.exception.ReinitializationException {
        /*
            r4 = this;
            monitor-enter(r4)
            if (r5 == 0) goto L_0x000b
            int r0 = r5.length()     // Catch:{ all -> 0x0008 }
            goto L_0x000c
        L_0x0008:
            r5 = move-exception
            goto L_0x0084
        L_0x000b:
            r0 = 0
        L_0x000c:
            int r1 = o.dispatchOnCancelled.setMax(r0)     // Catch:{ all -> 0x0008 }
            if (r0 == r1) goto L_0x0021
            o.onCanceled r2 = new o.onCanceled     // Catch:{ all -> 0x0008 }
            r3 = 1
            r2.<init>(r0, r1, r3)     // Catch:{ all -> 0x0008 }
            r0 = -1529164091(0xffffffffa4dacec5, float:-9.489271E-17)
            o.onCancelLoad.setMax(r0, r2)     // Catch:{ all -> 0x0008 }
            o.onCancelLoad.getMin(r0, r2)     // Catch:{ all -> 0x0008 }
        L_0x0021:
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x0008 }
            if (r0 != 0) goto L_0x0082
            if (r6 != 0) goto L_0x002a
            goto L_0x0082
        L_0x002a:
            java.util.Map<java.lang.String, com.alipay.imobile.network.quake.protocol.Protocol<?>> r0 = r4.b     // Catch:{ all -> 0x0008 }
            boolean r0 = r0.containsKey(r5)     // Catch:{ all -> 0x0008 }
            r1 = 9
            if (r0 == 0) goto L_0x0066
            java.util.Map<java.lang.String, com.alipay.imobile.network.quake.protocol.Protocol<?>> r0 = r4.b     // Catch:{ all -> 0x0008 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0008 }
            com.alipay.imobile.network.quake.protocol.Protocol r0 = (com.alipay.imobile.network.quake.protocol.Protocol) r0     // Catch:{ all -> 0x0008 }
            if (r0 == 0) goto L_0x006e
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x0008 }
            if (r0 == 0) goto L_0x0045
            goto L_0x006e
        L_0x0045:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0008 }
            java.lang.String r2 = "The protocol specified with name="
            r0.<init>(r2)     // Catch:{ all -> 0x0008 }
            r0.append(r5)     // Catch:{ all -> 0x0008 }
            java.lang.String r5 = " has already exist, and it is not equals to "
            r0.append(r5)     // Catch:{ all -> 0x0008 }
            r0.append(r6)     // Catch:{ all -> 0x0008 }
            java.lang.String r5 = r0.toString()     // Catch:{ all -> 0x0008 }
            java.lang.String r6 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x0008 }
            com.alipay.iap.android.common.log.LoggerWrapper.e(r6, r5)     // Catch:{ all -> 0x0008 }
            com.alipay.imobile.network.quake.exception.ReinitializationException r6 = new com.alipay.imobile.network.quake.exception.ReinitializationException     // Catch:{ all -> 0x0008 }
            r6.<init>(r1, r5)     // Catch:{ all -> 0x0008 }
            throw r6     // Catch:{ all -> 0x0008 }
        L_0x0066:
            java.lang.String r0 = "Quake"
            boolean r0 = r5.startsWith(r0)     // Catch:{ all -> 0x0008 }
            if (r0 != 0) goto L_0x0075
        L_0x006e:
            java.util.Map<java.lang.String, com.alipay.imobile.network.quake.protocol.Protocol<?>> r0 = r4.b     // Catch:{ all -> 0x0008 }
            r0.put(r5, r6)     // Catch:{ all -> 0x0008 }
            monitor-exit(r4)
            return
        L_0x0075:
            java.lang.String r5 = "The name of the request protocol can not start with 'Quake' and 'quake'"
            java.lang.String r6 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x0008 }
            com.alipay.iap.android.common.log.LoggerWrapper.e(r6, r5)     // Catch:{ all -> 0x0008 }
            com.alipay.imobile.network.quake.exception.ReinitializationException r6 = new com.alipay.imobile.network.quake.exception.ReinitializationException     // Catch:{ all -> 0x0008 }
            r6.<init>(r1, r5)     // Catch:{ all -> 0x0008 }
            throw r6     // Catch:{ all -> 0x0008 }
        L_0x0082:
            monitor-exit(r4)
            return
        L_0x0084:
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.f.a(java.lang.String, com.alipay.imobile.network.quake.protocol.Protocol):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(java.lang.String r4, com.alipay.imobile.network.quake.transport.Transporter r5) throws com.alipay.imobile.network.quake.exception.ReinitializationException {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x005c
            if (r5 != 0) goto L_0x000a
            goto L_0x005c
        L_0x000a:
            java.util.Map<java.lang.String, com.alipay.imobile.network.quake.transport.Transporter> r0 = r3.d     // Catch:{ all -> 0x005e }
            boolean r0 = r0.containsKey(r4)     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0046
            java.util.Map<java.lang.String, com.alipay.imobile.network.quake.transport.Transporter> r0 = r3.d     // Catch:{ all -> 0x005e }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x005e }
            com.alipay.imobile.network.quake.transport.Transporter r0 = (com.alipay.imobile.network.quake.transport.Transporter) r0     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0046
            boolean r0 = r0.equals(r5)     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0023
            goto L_0x0046
        L_0x0023:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x005e }
            java.lang.String r1 = "The transporter specified with name="
            r0.<init>(r1)     // Catch:{ all -> 0x005e }
            r0.append(r4)     // Catch:{ all -> 0x005e }
            java.lang.String r4 = " has already exist, and it is not equals to "
            r0.append(r4)     // Catch:{ all -> 0x005e }
            r0.append(r5)     // Catch:{ all -> 0x005e }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x005e }
            java.lang.String r5 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x005e }
            com.alipay.iap.android.common.log.LoggerWrapper.e(r5, r4)     // Catch:{ all -> 0x005e }
            com.alipay.imobile.network.quake.exception.ReinitializationException r5 = new com.alipay.imobile.network.quake.exception.ReinitializationException     // Catch:{ all -> 0x005e }
            r0 = 9
            r5.<init>(r0, r4)     // Catch:{ all -> 0x005e }
            throw r5     // Catch:{ all -> 0x005e }
        L_0x0046:
            java.lang.String r0 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x005e }
            java.lang.String r1 = "register transporter with the name="
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x005e }
            java.lang.String r1 = r1.concat(r2)     // Catch:{ all -> 0x005e }
            com.alipay.iap.android.common.log.LoggerWrapper.d(r0, r1)     // Catch:{ all -> 0x005e }
            java.util.Map<java.lang.String, com.alipay.imobile.network.quake.transport.Transporter> r0 = r3.d     // Catch:{ all -> 0x005e }
            r0.put(r4, r5)     // Catch:{ all -> 0x005e }
            monitor-exit(r3)
            return
        L_0x005c:
            monitor-exit(r3)
            return
        L_0x005e:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.f.a(java.lang.String, com.alipay.imobile.network.quake.transport.Transporter):void");
    }

    public synchronized Protocol b(String str) throws ClientException {
        Protocol protocol;
        String concat = "can not find request protocol which name is ".concat(String.valueOf(str));
        if (!TextUtils.isEmpty(str)) {
            protocol = this.b.get(str);
            if (protocol == null) {
                throw new ClientException((Integer) 18, concat);
            }
        } else {
            throw new ClientException((Integer) 18, concat);
        }
        return protocol;
    }

    /* access modifiers changed from: protected */
    public void b() {
        if (!this.q) {
            o();
            f9362a.a("INNER_HTTP_V1", (Transporter) new DefaultHttpTransport());
            f9362a.a("INNER_DISK_V1", (Cache) new DiskBasedCache(new File(this.e.getCacheDir(), "quake")));
            this.q = true;
        }
    }

    public synchronized void c() {
        f9362a = null;
        this.i = "INNER_JSON_SIGN_V1";
        this.b.clear();
        this.j = "INNER_DISK_V1";
        this.c.clear();
        this.k = "INNER_HTTP_V1";
        this.d.clear();
        this.e = null;
    }

    public void c(String str) throws ReinitializationException {
        if (!TextUtils.isEmpty(str) && !this.j.equals(str) && !"INNER_DISK_V1".equals(str)) {
            if ("INNER_DISK_V1".equals(this.j)) {
                this.j = str;
                return;
            }
            throw new ReinitializationException(9, "The default cache has been set");
        }
    }

    public Context d() {
        return this.e;
    }

    public synchronized Cache d(String str) throws ClientException {
        Cache cache;
        String concat = "can not find cache which name is ".concat(String.valueOf(str));
        if (!TextUtils.isEmpty(str)) {
            cache = this.c.get(str);
            if (cache == null) {
                throw new ClientException((Integer) 19, concat);
            }
        } else {
            throw new ClientException((Integer) 19, concat);
        }
        return cache;
    }

    public QuakeConfig e() {
        return this.p;
    }

    public void e(String str) throws ReinitializationException {
        if (!TextUtils.isEmpty(str) && !this.k.equals(str) && !"INNER_HTTP_V1".equals(str)) {
            if ("INNER_HTTP_V1".equals(this.k)) {
                this.k = str;
                return;
            }
            throw new ReinitializationException(9, "The default transport has been set");
        }
    }

    public synchronized Transporter f(String str) throws ClientException {
        Transporter transporter;
        String concat = "can not find transporter which name is ".concat(String.valueOf(str));
        if (!TextUtils.isEmpty(str)) {
            transporter = this.d.get(str);
            if (transporter == null) {
                throw new ClientException((Integer) 1, concat);
            }
        } else {
            throw new ClientException((Integer) 1, concat);
        }
        return transporter;
    }

    public String f() {
        return this.i;
    }

    public String g() {
        return this.j;
    }

    public String h() {
        return this.k;
    }

    public String i() {
        return this.g;
    }

    public String j() {
        return this.f;
    }

    public String k() {
        return this.h;
    }

    public String l() {
        return this.m;
    }

    public String m() {
        return this.n;
    }

    public String n() {
        return this.f9363o;
    }
}
