package com.alipay.imobile.network.quake.rpc;

import android.text.TextUtils;
import android.webkit.CookieManager;
import androidx.annotation.Nullable;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.imobile.network.quake.IQuake;
import com.alipay.imobile.network.quake.Quake;
import com.alipay.imobile.network.quake.QuakeConfig;
import com.alipay.imobile.network.quake.Request;
import com.alipay.imobile.network.quake.exception.ClientException;
import com.alipay.imobile.network.quake.exception.ServerException;
import com.alipay.imobile.network.quake.transport.strategy.RetryPolicy;
import com.alipay.imobile.network.quake.util.SignUtil;
import com.alipay.mobile.common.rpc.RpcException;
import com.alipay.mobile.framework.service.annotation.CheckLogin;
import com.alipay.mobile.framework.service.annotation.OperationType;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

public class RpcInvocationHandler implements InvocationHandler {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final ThreadLocal<Object> f9369a = new ThreadLocal<>();
    /* access modifiers changed from: private */
    public static final ThreadLocal<Map<String, Object>> b = new ThreadLocal<>();
    private static Request.CheckLoginListener f = new Request.CheckLoginListener() {
        public final void checkLogin(Request request) throws RpcException {
            if (request instanceof RpcRequest) {
                RpcInvocationHandler.b((RpcRequest) request);
            }
        }
    };
    private Class c;
    private IQuakeRpc d;
    private IQuake e;
    private QuakeConfig g;
    private QuakeConfig h;

    interface a {
        boolean a(RpcInterceptor rpcInterceptor, String str) throws RpcException;
    }

    public RpcInvocationHandler(IQuakeRpc iQuakeRpc, Class cls) {
        this.c = cls;
        this.d = iQuakeRpc;
        IQuake quake = iQuakeRpc.getQuake();
        this.e = quake;
        this.g = quake.getConfig();
    }

    private void a(Object obj, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr) throws RpcException {
        final Object obj2 = obj;
        final Class<?> cls2 = cls;
        final Method method2 = method;
        final Object[] objArr2 = objArr;
        a(annotationArr, new a() {
            public boolean a(RpcInterceptor rpcInterceptor, String str) throws RpcException {
                if (rpcInterceptor.preHandle(obj2, RpcInvocationHandler.f9369a, new byte[0], cls2, method2, objArr2, str, RpcInvocationHandler.b)) {
                    return true;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(rpcInterceptor);
                sb.append("preHandle stop this call.");
                throw new ClientException((Integer) 9, sb.toString());
            }
        });
    }

    private void a(Object obj, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr) throws RpcException {
        final Object obj2 = obj;
        final byte[] bArr2 = bArr;
        final Class<?> cls2 = cls;
        final Method method2 = method;
        final Object[] objArr2 = objArr;
        a(annotationArr, new a() {
            public boolean a(RpcInterceptor rpcInterceptor, String str) throws RpcException {
                if (rpcInterceptor.postHandle(obj2, RpcInvocationHandler.f9369a, bArr2, cls2, method2, objArr2, str)) {
                    return true;
                }
                StringBuilder sb = new StringBuilder();
                sb.append(rpcInterceptor);
                sb.append("postHandle stop this call.");
                throw new ClientException((Integer) 9, sb.toString());
            }
        });
    }

    private void a(Object obj, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr, RpcException rpcException) throws RpcException {
        final Object obj2 = obj;
        final byte[] bArr2 = bArr;
        final Class<?> cls2 = cls;
        final Method method2 = method;
        final Object[] objArr2 = objArr;
        final RpcException rpcException2 = rpcException;
        Annotation[] annotationArr2 = annotationArr;
        if (a(annotationArr, new a() {
            public boolean a(RpcInterceptor rpcInterceptor, String str) throws RpcException {
                if (rpcInterceptor.exceptionHandle(obj2, RpcInvocationHandler.f9369a, bArr2, cls2, method2, objArr2, rpcException2, str)) {
                    LoggerWrapper.d(Quake.TAG, LoggerWrapper.buildMessage("%s need process", rpcException2.getMsg()), rpcException2);
                    return true;
                }
                LoggerWrapper.d(Quake.TAG, LoggerWrapper.buildMessage("%s need process", rpcException2.getMsg()), rpcException2);
                return false;
            }
        })) {
            throw rpcException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0015, code lost:
        r1 = r7.a(r4, r3.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean a(java.lang.annotation.Annotation[] r6, com.alipay.imobile.network.quake.rpc.RpcInvocationHandler.a r7) throws com.alipay.mobile.common.rpc.RpcException {
        /*
            r5 = this;
            int r0 = r6.length
            r1 = 1
            r2 = 0
        L_0x0003:
            if (r2 >= r0) goto L_0x0022
            r3 = r6[r2]
            java.lang.Class r3 = r3.annotationType()
            if (r3 == 0) goto L_0x001f
            com.alipay.imobile.network.quake.rpc.IQuakeRpc r4 = r5.d
            com.alipay.imobile.network.quake.rpc.RpcInterceptor r4 = r4.getRpcInterceptor(r3)
            if (r4 == 0) goto L_0x001f
            java.lang.String r1 = r3.toString()
            boolean r1 = r7.a(r4, r1)
            if (r1 == 0) goto L_0x0022
        L_0x001f:
            int r2 = r2 + 1
            goto L_0x0003
        L_0x0022:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.rpc.RpcInvocationHandler.a(java.lang.annotation.Annotation[], com.alipay.imobile.network.quake.rpc.RpcInvocationHandler$a):boolean");
    }

    /* access modifiers changed from: private */
    public static void b(RpcRequest rpcRequest) throws RpcException {
        Method operationMethod;
        LoggerWrapper.d(Quake.TAG, "check login");
        if (rpcRequest != null && (operationMethod = rpcRequest.getOperationMethod()) != null) {
            try {
                OperationType operationType = (OperationType) operationMethod.getAnnotation(OperationType.class);
                if (operationType != null) {
                    String url = rpcRequest.getUrl();
                    if (com.alipay.imobile.network.quake.transport.strategy.a.b(url) && ((CheckLogin) operationMethod.getAnnotation(CheckLogin.class)) != null) {
                        String cookie = CookieManager.getInstance().getCookie(url);
                        if (TextUtils.isEmpty(cookie)) {
                            String str = Quake.TAG;
                            StringBuilder sb = new StringBuilder("CheckLogin_prejudge: cookie is empty  API=[");
                            sb.append(operationType.value());
                            sb.append("]");
                            LoggerWrapper.w(str, sb.toString());
                            throw new ServerException((Integer) 2000, "Session is timeout, please login again");
                        } else if (!cookie.contains("ALIPAYJSESSIONID")) {
                            String str2 = Quake.TAG;
                            StringBuilder sb2 = new StringBuilder("CheckLogin_prejudge: cookie not contains ALIPAYJSESSIONID!  API=[");
                            sb2.append(operationType.value());
                            sb2.append("]");
                            LoggerWrapper.w(str2, sb2.toString());
                            throw new ServerException((Integer) 2000, "Session is timeout, please login again");
                        }
                    }
                }
            } catch (Exception e2) {
                LoggerWrapper.e(Quake.TAG, "", e2);
            }
        }
    }

    private String d() {
        QuakeConfig quakeConfig = this.h;
        if (quakeConfig != null) {
            String gwUrl = quakeConfig.getGwUrl();
            if (!TextUtils.isEmpty(gwUrl)) {
                return gwUrl;
            }
        }
        return this.g.getGwUrl();
    }

    private Map<String, String> e() {
        QuakeConfig quakeConfig = this.h;
        if (quakeConfig == null || quakeConfig.getExternalInfo() == null) {
            return null;
        }
        return this.h.getExternalInfo();
    }

    private RetryPolicy f() {
        QuakeConfig quakeConfig = this.h;
        return quakeConfig != null ? quakeConfig.getRetryPolicy() : this.g.getRetryPolicy();
    }

    @Nullable
    private SignUtil.SignInfo g() {
        QuakeConfig quakeConfig = this.h;
        if (quakeConfig == null) {
            return null;
        }
        String appKeyForSecurityGuard = quakeConfig.getAppKeyForSecurityGuard();
        if (TextUtils.isEmpty(appKeyForSecurityGuard)) {
            return null;
        }
        return new SignUtil.SignInfo(appKeyForSecurityGuard, this.h.getAuthCodeForSecurityGuard());
    }

    public QuakeConfig a() {
        if (this.h == null) {
            this.h = new QuakeConfig(this.g);
        }
        return this.h;
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0296 A[Catch:{ InterruptedException -> 0x01cf, ExecutionException -> 0x01b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x029c A[Catch:{ InterruptedException -> 0x01cf, ExecutionException -> 0x01b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x01c0 A[Catch:{ InterruptedException -> 0x01cf, ExecutionException -> 0x01b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c5 A[Catch:{ InterruptedException -> 0x01cf, ExecutionException -> 0x01b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0243 A[Catch:{ InterruptedException -> 0x01cf, ExecutionException -> 0x01b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x024f A[Catch:{ InterruptedException -> 0x01cf, ExecutionException -> 0x01b1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0283 A[Catch:{ InterruptedException -> 0x01cf, ExecutionException -> 0x01b1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.lang.Object invoke(java.lang.Object r24, java.lang.reflect.Method r25, java.lang.Object[] r26) throws com.alipay.mobile.common.rpc.RpcException {
        /*
            r23 = this;
            r9 = r23
            r10 = r26
            monitor-enter(r23)
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x02a9 }
            long r11 = r0.getId()     // Catch:{ all -> 0x02a9 }
            java.lang.String r13 = r25.getName()     // Catch:{ all -> 0x02a9 }
            java.lang.String r0 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x02a9 }
            java.lang.String r1 = "ThreadId=[%d]  invoke.object=[%s]  methodName=[%s]"
            r14 = 3
            java.lang.Object[] r2 = new java.lang.Object[r14]     // Catch:{ all -> 0x02a9 }
            java.lang.Long r3 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x02a9 }
            r15 = 0
            r2[r15] = r3     // Catch:{ all -> 0x02a9 }
            java.lang.Class r3 = r25.getDeclaringClass()     // Catch:{ all -> 0x02a9 }
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x02a9 }
            r8 = 1
            r2[r8] = r3     // Catch:{ all -> 0x02a9 }
            r16 = 2
            r2[r16] = r13     // Catch:{ all -> 0x02a9 }
            java.lang.String r1 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r1, r2)     // Catch:{ all -> 0x02a9 }
            com.alipay.iap.android.common.log.LoggerWrapper.d(r0, r1)     // Catch:{ all -> 0x02a9 }
            boolean r0 = com.alipay.imobile.network.quake.util.e.a()     // Catch:{ all -> 0x02a9 }
            if (r0 != 0) goto L_0x02a1
            java.lang.String r0 = "toString"
            boolean r0 = r0.equals(r13)     // Catch:{ all -> 0x02a9 }
            r7 = 9
            if (r0 == 0) goto L_0x008a
            java.lang.Throwable r0 = new java.lang.Throwable     // Catch:{ all -> 0x02a9 }
            r0.<init>()     // Catch:{ all -> 0x02a9 }
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()     // Catch:{ all -> 0x02a9 }
            int r1 = r0.length     // Catch:{ all -> 0x02a9 }
            if (r1 <= r8) goto L_0x0086
        L_0x0052:
            if (r8 >= r1) goto L_0x0086
            r2 = r0[r8]     // Catch:{ all -> 0x02a9 }
            java.lang.String r3 = r2.getClassName()     // Catch:{ all -> 0x02a9 }
            java.lang.Class<com.alipay.imobile.network.quake.rpc.RpcInvocationHandler> r4 = com.alipay.imobile.network.quake.rpc.RpcInvocationHandler.class
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x02a9 }
            boolean r3 = r3.equals(r4)     // Catch:{ all -> 0x02a9 }
            if (r3 != 0) goto L_0x0075
            java.lang.String r3 = "invoke"
            java.lang.String r2 = r2.getMethodName()     // Catch:{ all -> 0x02a9 }
            boolean r2 = r3.equals(r2)     // Catch:{ all -> 0x02a9 }
            if (r2 != 0) goto L_0x0075
            int r8 = r8 + 1
            goto L_0x0052
        L_0x0075:
            java.lang.String r0 = "Do not call proxy.toString() in the RpcInterceptor"
            java.lang.String r1 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x02a9 }
            com.alipay.iap.android.common.log.LoggerWrapper.e(r1, r0)     // Catch:{ all -> 0x02a9 }
            com.alipay.mobile.common.rpc.RpcException r1 = new com.alipay.mobile.common.rpc.RpcException     // Catch:{ all -> 0x02a9 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x02a9 }
            r1.<init>((java.lang.Integer) r2, (java.lang.String) r0)     // Catch:{ all -> 0x02a9 }
            throw r1     // Catch:{ all -> 0x02a9 }
        L_0x0086:
            java.lang.String r0 = ""
            monitor-exit(r23)
            return r0
        L_0x008a:
            java.lang.String r0 = "getRpcConfig"
            boolean r0 = r0.equals(r13)     // Catch:{ all -> 0x02a9 }
            if (r0 == 0) goto L_0x00a3
            com.alipay.imobile.network.quake.QuakeConfig r0 = r9.h     // Catch:{ all -> 0x02a9 }
            if (r0 != 0) goto L_0x009f
            com.alipay.imobile.network.quake.QuakeConfig r0 = new com.alipay.imobile.network.quake.QuakeConfig     // Catch:{ all -> 0x02a9 }
            com.alipay.imobile.network.quake.QuakeConfig r1 = r9.g     // Catch:{ all -> 0x02a9 }
            r0.<init>(r1)     // Catch:{ all -> 0x02a9 }
            r9.h = r0     // Catch:{ all -> 0x02a9 }
        L_0x009f:
            com.alipay.imobile.network.quake.QuakeConfig r0 = r9.h     // Catch:{ all -> 0x02a9 }
            monitor-exit(r23)
            return r0
        L_0x00a3:
            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02a9 }
            java.lang.ThreadLocal<java.lang.Object> r0 = f9369a     // Catch:{ all -> 0x02a9 }
            r6 = 0
            r0.set(r6)     // Catch:{ all -> 0x02a9 }
            java.lang.ThreadLocal<java.util.Map<java.lang.String, java.lang.Object>> r0 = b     // Catch:{ all -> 0x02a9 }
            r0.set(r6)     // Catch:{ all -> 0x02a9 }
            java.lang.Class r3 = r9.c     // Catch:{ all -> 0x02a9 }
            java.lang.annotation.Annotation[] r0 = r25.getAnnotations()     // Catch:{ all -> 0x02a9 }
            r1 = r23
            r2 = r24
            r4 = r25
            r5 = r26
            r14 = r6
            r6 = r0
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x02a9 }
            com.alipay.imobile.network.quake.RequestFuture r0 = new com.alipay.imobile.network.quake.RequestFuture     // Catch:{ InterruptedException -> 0x01cf, ExecutionException -> 0x01b1 }
            r0.<init>()     // Catch:{ InterruptedException -> 0x01cf, ExecutionException -> 0x01b1 }
            com.alipay.imobile.network.quake.rpc.RpcRequest r6 = new com.alipay.imobile.network.quake.rpc.RpcRequest     // Catch:{ InterruptedException -> 0x01cf, ExecutionException -> 0x01b1 }
            java.lang.String r1 = r23.d()     // Catch:{ InterruptedException -> 0x01cf, ExecutionException -> 0x01b1 }
            r6.<init>(r1, r14, r0, r0)     // Catch:{ InterruptedException -> 0x01cf, ExecutionException -> 0x01b1 }
            com.alipay.imobile.network.quake.IQuake r1 = r9.e     // Catch:{ InterruptedException -> 0x01ab, ExecutionException -> 0x01a5 }
            java.lang.String r1 = r1.getDefaultProtocolName()     // Catch:{ InterruptedException -> 0x01ab, ExecutionException -> 0x01a5 }
            r6.setProtocolName(r1)     // Catch:{ InterruptedException -> 0x01ab, ExecutionException -> 0x01a5 }
            com.alipay.imobile.network.quake.IQuake r1 = r9.e     // Catch:{ InterruptedException -> 0x01ab, ExecutionException -> 0x01a5 }
            java.lang.String r1 = r1.getDefaultCacheName()     // Catch:{ InterruptedException -> 0x01ab, ExecutionException -> 0x01a5 }
            r6.setCacheName(r1)     // Catch:{ InterruptedException -> 0x01ab, ExecutionException -> 0x01a5 }
            com.alipay.imobile.network.quake.IQuake r1 = r9.e     // Catch:{ InterruptedException -> 0x01ab, ExecutionException -> 0x01a5 }
            java.lang.String r1 = r1.getDefaultTransportName()     // Catch:{ InterruptedException -> 0x01ab, ExecutionException -> 0x01a5 }
            r6.setTransportName(r1)     // Catch:{ InterruptedException -> 0x01ab, ExecutionException -> 0x01a5 }
            r5 = r25
            r6.setOperationMethod(r5)     // Catch:{ InterruptedException -> 0x01a3, ExecutionException -> 0x01a1 }
            r6.setParams(r10)     // Catch:{ InterruptedException -> 0x01a3, ExecutionException -> 0x01a1 }
            com.alipay.imobile.network.quake.util.SignUtil$SignInfo r1 = r23.g()     // Catch:{ InterruptedException -> 0x01a3, ExecutionException -> 0x01a1 }
            r6.setSignInfo(r1)     // Catch:{ InterruptedException -> 0x01a3, ExecutionException -> 0x01a1 }
            com.alipay.imobile.network.quake.transport.strategy.RetryPolicy r1 = r23.f()     // Catch:{ InterruptedException -> 0x01a3, ExecutionException -> 0x01a1 }
            r6.setRetryPolicy(r1)     // Catch:{ InterruptedException -> 0x01a3, ExecutionException -> 0x01a1 }
            java.util.Map r1 = r23.e()     // Catch:{ InterruptedException -> 0x01a3, ExecutionException -> 0x01a1 }
            if (r1 == 0) goto L_0x010d
            r6.addExternalInfo(r1)     // Catch:{ InterruptedException -> 0x01a3, ExecutionException -> 0x01a1 }
        L_0x010d:
            java.lang.String r1 = com.alipay.imobile.network.quake.rpc.a.a(r25, r26)     // Catch:{ InterruptedException -> 0x01a3, ExecutionException -> 0x01a1 }
            if (r1 == 0) goto L_0x014d
            java.lang.String r2 = "alipay.client.executerpc"
            boolean r2 = android.text.TextUtils.equals(r1, r2)     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            if (r2 == 0) goto L_0x0131
            r2 = r10[r15]     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            java.lang.String r1 = java.lang.String.valueOf(r2)     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            int r2 = r10.length     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            if (r2 <= r8) goto L_0x0131
            r2 = r10[r8]     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            r6.setParams(r2)     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            java.lang.String r2 = "alipay.client.executerpc"
            r6.setProtocolName(r2)     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            r6.skipRequestSerialize()     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
        L_0x0131:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            r2.<init>()     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            java.lang.Class r3 = r9.c     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            r2.append(r3)     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            r2.append(r1)     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            java.lang.String r2 = r2.toString()     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            r6.setTag(r2)     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            r6.setOperationType(r1)     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            goto L_0x0169
        L_0x014d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            r2.<init>()     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            java.lang.Class r3 = r9.c     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            r2.append(r3)     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            java.lang.String r3 = r25.getName()     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            r2.append(r3)     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            java.lang.String r2 = r2.toString()     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            r6.setTag(r2)     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
        L_0x0169:
            com.alipay.imobile.network.quake.Request$CheckLoginListener r2 = f     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            r6.setCheckLoginListener(r2)     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            com.alipay.imobile.network.quake.IQuake r2 = r9.e     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            r2.addRequest(r6)     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            java.lang.Object r2 = r0.get()     // Catch:{ InterruptedException -> 0x019a, ExecutionException -> 0x0193 }
            java.lang.reflect.Type r0 = r25.getGenericReturnType()     // Catch:{ InterruptedException -> 0x018f, ExecutionException -> 0x018b }
            java.lang.Class r3 = java.lang.Void.TYPE     // Catch:{ InterruptedException -> 0x018f, ExecutionException -> 0x018b }
            if (r0 == r3) goto L_0x0184
            java.lang.ThreadLocal<java.lang.Object> r0 = f9369a     // Catch:{ InterruptedException -> 0x018f, ExecutionException -> 0x018b }
            r0.set(r2)     // Catch:{ InterruptedException -> 0x018f, ExecutionException -> 0x018b }
        L_0x0184:
            r0 = r1
            r14 = r2
            r8 = r6
            r20 = 1
            goto L_0x0207
        L_0x018b:
            r0 = move-exception
            r14 = r6
            r6 = r2
            goto L_0x01b6
        L_0x018f:
            r0 = move-exception
            r14 = r6
            r6 = r2
            goto L_0x01d4
        L_0x0193:
            r0 = move-exception
            r22 = r14
            r14 = r6
            r6 = r22
            goto L_0x01b6
        L_0x019a:
            r0 = move-exception
            r22 = r14
            r14 = r6
            r6 = r22
            goto L_0x01d4
        L_0x01a1:
            r0 = move-exception
            goto L_0x01a8
        L_0x01a3:
            r0 = move-exception
            goto L_0x01ae
        L_0x01a5:
            r0 = move-exception
            r5 = r25
        L_0x01a8:
            r1 = r14
            r14 = r6
            goto L_0x01b5
        L_0x01ab:
            r0 = move-exception
            r5 = r25
        L_0x01ae:
            r1 = r14
            r14 = r6
            goto L_0x01d3
        L_0x01b1:
            r0 = move-exception
            r5 = r25
            r1 = r14
        L_0x01b5:
            r6 = r1
        L_0x01b6:
            java.lang.Throwable r0 = r0.getCause()     // Catch:{ all -> 0x02a9 }
            if (r0 == 0) goto L_0x01c5
            boolean r2 = r0 instanceof com.alipay.mobile.common.rpc.RpcException     // Catch:{ all -> 0x02a9 }
            if (r2 == 0) goto L_0x01c5
            com.alipay.mobile.common.rpc.RpcException r0 = (com.alipay.mobile.common.rpc.RpcException) r0     // Catch:{ all -> 0x02a9 }
            r7 = r0
            r0 = r1
            goto L_0x01e1
        L_0x01c5:
            com.alipay.imobile.network.quake.exception.ClientException r2 = new com.alipay.imobile.network.quake.exception.ClientException     // Catch:{ all -> 0x02a9 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x02a9 }
            r2.<init>((java.lang.Integer) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x02a9 }
            goto L_0x01df
        L_0x01cf:
            r0 = move-exception
            r5 = r25
            r1 = r14
        L_0x01d3:
            r6 = r1
        L_0x01d4:
            com.alipay.imobile.network.quake.exception.ClientException r2 = new com.alipay.imobile.network.quake.exception.ClientException     // Catch:{ all -> 0x02a9 }
            r3 = 13
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x02a9 }
            r2.<init>((java.lang.Integer) r3, (java.lang.Throwable) r0)     // Catch:{ all -> 0x02a9 }
        L_0x01df:
            r0 = r1
            r7 = r2
        L_0x01e1:
            r19 = r14
            r14 = r6
            java.lang.String r1 = com.alipay.imobile.network.quake.rpc.a.a(r25, r26)     // Catch:{ all -> 0x02a9 }
            r7.setOperationType(r1)     // Catch:{ all -> 0x02a9 }
            r3 = 0
            java.lang.Class r4 = r9.c     // Catch:{ all -> 0x02a9 }
            java.lang.annotation.Annotation[] r20 = r25.getAnnotations()     // Catch:{ all -> 0x02a9 }
            r1 = r23
            r2 = r24
            r5 = r25
            r6 = r26
            r21 = r7
            r7 = r20
            r20 = 1
            r8 = r21
            r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x02a9 }
            r8 = r19
        L_0x0207:
            r3 = 0
            java.lang.Class r4 = r9.c     // Catch:{ all -> 0x02a9 }
            java.lang.annotation.Annotation[] r7 = r25.getAnnotations()     // Catch:{ all -> 0x02a9 }
            r1 = r23
            r2 = r24
            r5 = r25
            r6 = r26
            r1.a(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x02a9 }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02a9 }
            long r1 = r1 - r17
            java.lang.String r3 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x02a9 }
            java.lang.String r4 = "ThreadId=[%d] methodName=[%s] invokeTiming=[%d]"
            r5 = 3
            java.lang.Object[] r6 = new java.lang.Object[r5]     // Catch:{ all -> 0x02a9 }
            java.lang.Long r5 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x02a9 }
            r6[r15] = r5     // Catch:{ all -> 0x02a9 }
            r6[r20] = r13     // Catch:{ all -> 0x02a9 }
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x02a9 }
            r6[r16] = r1     // Catch:{ all -> 0x02a9 }
            java.lang.String r1 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r4, r6)     // Catch:{ all -> 0x02a9 }
            com.alipay.iap.android.common.log.LoggerWrapper.d(r3, r1)     // Catch:{ all -> 0x02a9 }
            java.lang.ThreadLocal<java.lang.Object> r1 = f9369a     // Catch:{ all -> 0x02a9 }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x02a9 }
            if (r1 == 0) goto L_0x0249
            java.lang.ThreadLocal<java.lang.Object> r1 = f9369a     // Catch:{ all -> 0x02a9 }
            java.lang.Object r14 = r1.get()     // Catch:{ all -> 0x02a9 }
        L_0x0249:
            boolean r1 = com.alipay.iap.android.common.log.LoggerWrapper.isDebuggable()     // Catch:{ all -> 0x02a9 }
            if (r1 == 0) goto L_0x0267
            java.lang.String r1 = com.alipay.imobile.network.quake.Quake.TAG     // Catch:{ all -> 0x02a9 }
            java.lang.String r2 = "ThreadId=[%d] methodName=[%s] returnObj=[%s]"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x02a9 }
            java.lang.Long r4 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x02a9 }
            r3[r15] = r4     // Catch:{ all -> 0x02a9 }
            r3[r20] = r13     // Catch:{ all -> 0x02a9 }
            r3[r16] = r14     // Catch:{ all -> 0x02a9 }
            java.lang.String r2 = com.alipay.iap.android.common.log.LoggerWrapper.buildMessage(r2, r3)     // Catch:{ all -> 0x02a9 }
            com.alipay.iap.android.common.log.LoggerWrapper.i(r1, r2)     // Catch:{ all -> 0x02a9 }
        L_0x0267:
            java.util.HashMap r1 = new java.util.HashMap     // Catch:{ all -> 0x02a9 }
            r2 = 4
            r1.<init>(r2)     // Catch:{ all -> 0x02a9 }
            java.lang.String r2 = "duration"
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02a9 }
            long r3 = r3 - r17
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x02a9 }
            r1.put(r2, r3)     // Catch:{ all -> 0x02a9 }
            java.lang.String r2 = "operation_type"
            r1.put(r2, r0)     // Catch:{ all -> 0x02a9 }
            if (r8 == 0) goto L_0x0289
            r8.addSofaId(r1)     // Catch:{ all -> 0x02a9 }
            r8.addRpcTraceId(r1)     // Catch:{ all -> 0x02a9 }
        L_0x0289:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x02a9 }
            long r2 = r2 - r17
            r4 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L_0x029c
            java.lang.String r0 = "iap_net_task_cost"
        L_0x0298:
            com.alipay.iap.android.common.log.MonitorWrapper.behaviour(r0, r1)     // Catch:{ all -> 0x02a9 }
            goto L_0x029f
        L_0x029c:
            java.lang.String r0 = "iap_net_task_cost_long"
            goto L_0x0298
        L_0x029f:
            monitor-exit(r23)
            return r14
        L_0x02a1:
            java.lang.IllegalThreadStateException r0 = new java.lang.IllegalThreadStateException     // Catch:{ all -> 0x02a9 }
            java.lang.String r1 = "can't call rpc in main thread."
            r0.<init>(r1)     // Catch:{ all -> 0x02a9 }
            throw r0     // Catch:{ all -> 0x02a9 }
        L_0x02a9:
            r0 = move-exception
            monitor-exit(r23)
            goto L_0x02ad
        L_0x02ac:
            throw r0
        L_0x02ad:
            goto L_0x02ac
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.rpc.RpcInvocationHandler.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
