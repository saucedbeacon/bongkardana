package com.alipay.imobile.network.quake;

import androidx.annotation.NonNull;
import com.alipay.imobile.network.quake.Request;
import com.alipay.mobile.common.rpc.RpcException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class RequestFuture implements Request.ErrorListener, Request.Listener, Future {

    /* renamed from: a  reason: collision with root package name */
    private Request f9344a;
    private boolean b = false;
    private Object c;
    private RpcException d;

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized java.lang.Object a(java.lang.Long r6) throws java.lang.InterruptedException, java.util.concurrent.ExecutionException, java.util.concurrent.TimeoutException {
        /*
            r5 = this;
            monitor-enter(r5)
            com.alipay.mobile.common.rpc.RpcException r0 = r5.d     // Catch:{ all -> 0x0044 }
            if (r0 != 0) goto L_0x003c
            boolean r0 = r5.b     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x000d
            java.lang.Object r6 = r5.c     // Catch:{ all -> 0x0044 }
            monitor-exit(r5)
            return r6
        L_0x000d:
            r0 = 0
            if (r6 != 0) goto L_0x0015
        L_0x0011:
            r5.wait(r0)     // Catch:{ all -> 0x0044 }
            goto L_0x0022
        L_0x0015:
            long r2 = r6.longValue()     // Catch:{ all -> 0x0044 }
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L_0x0022
            long r0 = r6.longValue()     // Catch:{ all -> 0x0044 }
            goto L_0x0011
        L_0x0022:
            com.alipay.mobile.common.rpc.RpcException r6 = r5.d     // Catch:{ all -> 0x0044 }
            if (r6 != 0) goto L_0x0034
            boolean r6 = r5.b     // Catch:{ all -> 0x0044 }
            if (r6 == 0) goto L_0x002e
            java.lang.Object r6 = r5.c     // Catch:{ all -> 0x0044 }
            monitor-exit(r5)
            return r6
        L_0x002e:
            java.util.concurrent.TimeoutException r6 = new java.util.concurrent.TimeoutException     // Catch:{ all -> 0x0044 }
            r6.<init>()     // Catch:{ all -> 0x0044 }
            throw r6     // Catch:{ all -> 0x0044 }
        L_0x0034:
            java.util.concurrent.ExecutionException r6 = new java.util.concurrent.ExecutionException     // Catch:{ all -> 0x0044 }
            com.alipay.mobile.common.rpc.RpcException r0 = r5.d     // Catch:{ all -> 0x0044 }
            r6.<init>(r0)     // Catch:{ all -> 0x0044 }
            throw r6     // Catch:{ all -> 0x0044 }
        L_0x003c:
            java.util.concurrent.ExecutionException r6 = new java.util.concurrent.ExecutionException     // Catch:{ all -> 0x0044 }
            com.alipay.mobile.common.rpc.RpcException r0 = r5.d     // Catch:{ all -> 0x0044 }
            r6.<init>(r0)     // Catch:{ all -> 0x0044 }
            throw r6     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r6 = move-exception
            monitor-exit(r5)
            goto L_0x0048
        L_0x0047:
            throw r6
        L_0x0048:
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.imobile.network.quake.RequestFuture.a(java.lang.Long):java.lang.Object");
    }

    public synchronized boolean cancel(boolean z) {
        if (this.f9344a == null) {
            return false;
        }
        if (isDone()) {
            return false;
        }
        this.f9344a.cancel();
        return true;
    }

    public Object get() throws InterruptedException, ExecutionException {
        try {
            return a((Long) null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    public Object get(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return a(Long.valueOf(TimeUnit.MILLISECONDS.convert(j, timeUnit)));
    }

    public boolean isCancelled() {
        Request request = this.f9344a;
        return request != null && request.isCanceled();
    }

    public synchronized boolean isDone() {
        return this.b || this.d != null || isCancelled();
    }

    public synchronized void onErrorResponse(RpcException rpcException) {
        this.d = rpcException;
        notifyAll();
    }

    public synchronized void onResponse(Object obj) {
        this.b = true;
        this.c = obj;
        notifyAll();
    }

    public void setRequest(Request request) {
        this.f9344a = request;
    }
}
