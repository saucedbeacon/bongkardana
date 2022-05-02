package com.iap.ac.android.biz.common.internal.oauth;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alipay.mobile.common.rpc.RpcException;
import com.iap.ac.android.biz.common.ACManager;
import com.iap.ac.android.biz.common.callback.IAuthLoginCallback;
import com.iap.ac.android.biz.common.constants.Constants;
import com.iap.ac.android.biz.common.internal.foundation.FoundationProxy;
import com.iap.ac.android.biz.common.model.remoteconfig.common.OAuthConfig;
import com.iap.ac.android.common.account.ACUserInfo;
import com.iap.ac.android.common.account.ACUserInfoManager;
import com.iap.ac.android.common.log.ACLog;
import com.iap.ac.android.common.rpc.RpcRequest;
import com.iap.ac.android.common.rpc.interfaces.FacadeInvoker;
import com.iap.ac.android.common.rpc.interfaces.RpcInterceptor;
import com.iap.ac.android.common.rpc.model.RpcExceptionInterceptResult;
import com.iap.ac.android.common.task.async.IAPAsyncTask;
import com.iap.ac.android.d.e;
import com.iap.ac.android.j.b;
import com.iap.ac.android.j.c;
import com.iap.ac.android.l.a;
import java.lang.reflect.Method;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public abstract class BaseAutoOAuthInterceptor implements RpcInterceptor, IAuthLoginCallback {

    /* renamed from: a  reason: collision with root package name */
    public final Object f9682a = new Object();
    public ReentrantLock b = new ReentrantLock();
    public AtomicInteger c = new AtomicInteger(0);
    public boolean d = false;
    public boolean e = false;
    public ThreadLocal<Boolean> f = new ThreadLocal<>();
    public a g = new a();
    public String h;
    public c i;

    public BaseAutoOAuthInterceptor(String str) {
        this.h = str;
        this.i = new c(ACManager.getInstance().getContext(), this.h, getLoginSessionKeyInCookie());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0081, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a() {
        /*
            r6 = this;
            monitor-enter(r6)
            com.iap.ac.android.biz.common.spi.SPIManager r0 = com.iap.ac.android.biz.common.spi.SPIManager.getInstance()     // Catch:{ all -> 0x0082 }
            java.lang.String r0 = r0.getOpenId()     // Catch:{ all -> 0x0082 }
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x0082 }
            r2 = 1
            if (r1 != 0) goto L_0x0080
            com.iap.ac.android.biz.common.ACManager r1 = com.iap.ac.android.biz.common.ACManager.getInstance()     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = "AC_LOCAL_OPEN_ID"
            java.lang.String r1 = r1.fetch(r3)     // Catch:{ all -> 0x0082 }
            boolean r1 = r0.equals(r1)     // Catch:{ all -> 0x0082 }
            if (r1 != 0) goto L_0x0080
            com.iap.ac.android.biz.common.ACManager r1 = com.iap.ac.android.biz.common.ACManager.getInstance()     // Catch:{ all -> 0x0082 }
            r1.clear()     // Catch:{ all -> 0x0082 }
            com.iap.ac.android.j.c r1 = r6.i     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = r1.h     // Catch:{ all -> 0x0082 }
            com.iap.ac.android.biz.common.internal.foundation.FoundationProxy r3 = com.iap.ac.android.biz.common.internal.foundation.FoundationProxy.getInstance(r3)     // Catch:{ all -> 0x0082 }
            com.iap.ac.android.biz.common.internal.foundation.FoundationProxy$NetworkType r3 = r3.getNetworkType()     // Catch:{ all -> 0x0082 }
            com.iap.ac.android.biz.common.internal.foundation.FoundationProxy$NetworkType r4 = com.iap.ac.android.biz.common.internal.foundation.FoundationProxy.NetworkType.NETWORK_TYPE_ACRPC     // Catch:{ all -> 0x0082 }
            r5 = 0
            if (r3 != r4) goto L_0x006b
            java.lang.String r3 = r1.c     // Catch:{ all -> 0x0082 }
            java.lang.String r4 = r1.i     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = com.iap.ac.android.d.e.a((java.lang.String) r3, (java.lang.String) r4)     // Catch:{ all -> 0x0082 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x005e
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ all -> 0x0082 }
            java.lang.String r4 = r1.h     // Catch:{ all -> 0x0082 }
            r3[r5] = r4     // Catch:{ all -> 0x0082 }
            java.lang.String r1 = r1.i     // Catch:{ all -> 0x0082 }
            r3[r2] = r1     // Catch:{ all -> 0x0082 }
            java.lang.String r1 = "startOAuthLogout(%s), there is no session %s in cookie, skip it."
            java.lang.String r1 = java.lang.String.format(r1, r3)     // Catch:{ all -> 0x0082 }
            java.lang.String r2 = "IAPConnect"
            com.iap.ac.android.common.log.ACLog.d(r2, r1)     // Catch:{ all -> 0x0082 }
            goto L_0x006b
        L_0x005e:
            com.iap.ac.android.m.a r2 = r1.d     // Catch:{ all -> 0x0082 }
            r2.a()     // Catch:{ all -> 0x0082 }
            r1.a()     // Catch:{ all -> 0x0082 }
            com.iap.ac.android.common.account.OAuthService r1 = com.iap.ac.android.common.account.OAuthService.INSTANCE     // Catch:{ all -> 0x0082 }
            r1.authLogout()     // Catch:{ all -> 0x0082 }
        L_0x006b:
            java.lang.String r1 = r6.h     // Catch:{ all -> 0x0082 }
            com.iap.ac.android.common.account.IUserInfoManager r1 = com.iap.ac.android.common.account.ACUserInfoManager.getInstance(r1)     // Catch:{ all -> 0x0082 }
            r2 = 0
            r1.setUserInfo(r2)     // Catch:{ all -> 0x0082 }
            com.iap.ac.android.biz.common.ACManager r1 = com.iap.ac.android.biz.common.ACManager.getInstance()     // Catch:{ all -> 0x0082 }
            java.lang.String r2 = "AC_LOCAL_OPEN_ID"
            r1.save(r2, r0)     // Catch:{ all -> 0x0082 }
            monitor-exit(r6)
            return r5
        L_0x0080:
            monitor-exit(r6)
            return r2
        L_0x0082:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.biz.common.internal.oauth.BaseAutoOAuthInterceptor.a():boolean");
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:72:0x01b2=Splitter:B:72:0x01b2, B:58:0x0175=Splitter:B:58:0x0175, B:61:0x0185=Splitter:B:61:0x0185, B:34:0x010a=Splitter:B:34:0x010a, B:42:0x012e=Splitter:B:42:0x012e} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r10 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            java.lang.String r2 = "iapconnect_center"
            java.lang.String r3 = "ac_common_oauth_interceptor_enter"
            com.iap.ac.android.biz.common.utils.log.ACLogEvent r2 = com.iap.ac.android.biz.common.utils.log.ACLogEvent.newLogger(r2, r3)
            r2.event()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "AutoOAuthInterceptor, tryToLogin, thread: "
            r2.<init>(r3)
            java.lang.Thread r3 = java.lang.Thread.currentThread()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            java.lang.String r3 = " enter tryToLogin"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "IAPConnect"
            com.iap.ac.android.common.log.ACLog.i(r3, r2)
            monitor-enter(r10)
            java.util.concurrent.atomic.AtomicInteger r2 = r10.c     // Catch:{ all -> 0x01cd }
            int r2 = r2.incrementAndGet()     // Catch:{ all -> 0x01cd }
            java.util.concurrent.locks.ReentrantLock r3 = r10.b     // Catch:{ all -> 0x01cd }
            r3.lock()     // Catch:{ all -> 0x01cd }
            monitor-exit(r10)     // Catch:{ all -> 0x01cd }
            java.lang.String r3 = "AutoOAuthInterceptor, tryToLogin, thread: "
            java.lang.StringBuilder r3 = com.iap.ac.android.a.a.a(r3)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            java.lang.String r4 = r4.getName()
            r3.append(r4)
            java.lang.String r4 = " get lock, cntInQueue: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "IAPConnect"
            com.iap.ac.android.common.log.ACLog.i(r4, r3)
            java.lang.Object r3 = r10.f9682a
            monitor-enter(r3)
            java.lang.ThreadLocal<java.lang.Boolean> r4 = r10.f     // Catch:{ Exception -> 0x0141 }
            java.lang.Boolean r5 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x0141 }
            r4.set(r5)     // Catch:{ Exception -> 0x0141 }
            r4 = 1
            if (r2 <= r4) goto L_0x006f
            boolean r2 = r10.d     // Catch:{ Exception -> 0x0141 }
            if (r2 != 0) goto L_0x010a
        L_0x006f:
            r2 = 0
            r10.d = r2     // Catch:{ Exception -> 0x0141 }
            r10.e = r2     // Catch:{ Exception -> 0x0141 }
            com.iap.ac.android.biz.common.ACManager r5 = com.iap.ac.android.biz.common.ACManager.getInstance()     // Catch:{ Exception -> 0x0141 }
            com.iap.ac.android.biz.common.ACManager r6 = com.iap.ac.android.biz.common.ACManager.getInstance()     // Catch:{ Exception -> 0x0141 }
            java.lang.String r7 = r10.h     // Catch:{ Exception -> 0x0141 }
            java.lang.String r6 = r6.getClientKeyStorageKey(r7)     // Catch:{ Exception -> 0x0141 }
            java.lang.String r5 = r5.fetch(r6)     // Catch:{ Exception -> 0x0141 }
            com.iap.ac.android.biz.common.ACManager r6 = com.iap.ac.android.biz.common.ACManager.getInstance()     // Catch:{ Exception -> 0x0141 }
            android.content.Context r6 = r6.getContext()     // Catch:{ Exception -> 0x0141 }
            java.lang.String r6 = com.iap.ac.android.common.instance.InstanceInfo.getInstanceId(r6)     // Catch:{ Exception -> 0x0141 }
            java.lang.String r7 = r10.h     // Catch:{ Exception -> 0x0141 }
            com.iap.ac.android.common.account.IUserInfoManager r7 = com.iap.ac.android.common.account.ACUserInfoManager.getInstance(r7)     // Catch:{ Exception -> 0x0141 }
            java.lang.String r7 = r7.getOpenId()     // Catch:{ Exception -> 0x0141 }
            boolean r8 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0141 }
            if (r8 != 0) goto L_0x00d4
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x0141 }
            if (r8 != 0) goto L_0x00d4
            java.lang.String r2 = "IAPConnect"
            java.lang.String r8 = "AutoOAuthInterceptor, begin to perform hold Login"
            com.iap.ac.android.common.log.ACLog.i(r2, r8)     // Catch:{ Exception -> 0x0141 }
            com.iap.ac.android.l.a r2 = r10.g     // Catch:{ Exception -> 0x0141 }
            boolean r2 = r2.a(r6, r5, r7)     // Catch:{ Exception -> 0x0141 }
            if (r2 == 0) goto L_0x00c3
            r10.d = r4     // Catch:{ Exception -> 0x0141 }
            r10.e = r4     // Catch:{ Exception -> 0x0141 }
            java.lang.String r2 = "IAPConnect"
            java.lang.String r4 = "AutoOAuthInterceptor, hold login success"
            com.iap.ac.android.common.log.ACLog.i(r2, r4)     // Catch:{ Exception -> 0x0141 }
            goto L_0x0101
        L_0x00c3:
            java.lang.String r2 = "IAPConnect"
            java.lang.String r4 = "AutoOAuthInterceptor, hold login fail, client key expired, begin auth login in"
            com.iap.ac.android.common.log.ACLog.i(r2, r4)     // Catch:{ Exception -> 0x0141 }
            com.iap.ac.android.j.c r2 = r10.i     // Catch:{ Exception -> 0x0141 }
            com.iap.ac.android.biz.common.model.remoteconfig.common.OAuthConfig r4 = r10.getOAuthConfig()     // Catch:{ Exception -> 0x0141 }
            r2.a((com.iap.ac.android.biz.common.model.remoteconfig.common.OAuthConfig) r4, (com.iap.ac.android.biz.common.callback.IAuthLoginCallback) r10)     // Catch:{ Exception -> 0x0141 }
            goto L_0x0101
        L_0x00d4:
            java.lang.String r6 = "IAPConnect"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0141 }
            java.lang.String r9 = "AutoOAuthInterceptor, begin to perform auth login, clientKey:"
            r8.<init>(r9)     // Catch:{ Exception -> 0x0141 }
            if (r5 == 0) goto L_0x00e1
            r5 = 1
            goto L_0x00e2
        L_0x00e1:
            r5 = 0
        L_0x00e2:
            r8.append(r5)     // Catch:{ Exception -> 0x0141 }
            java.lang.String r5 = ", openId: "
            r8.append(r5)     // Catch:{ Exception -> 0x0141 }
            if (r7 == 0) goto L_0x00ed
            goto L_0x00ee
        L_0x00ed:
            r4 = 0
        L_0x00ee:
            r8.append(r4)     // Catch:{ Exception -> 0x0141 }
            java.lang.String r2 = r8.toString()     // Catch:{ Exception -> 0x0141 }
            com.iap.ac.android.common.log.ACLog.i(r6, r2)     // Catch:{ Exception -> 0x0141 }
            com.iap.ac.android.j.c r2 = r10.i     // Catch:{ Exception -> 0x0141 }
            com.iap.ac.android.biz.common.model.remoteconfig.common.OAuthConfig r4 = r10.getOAuthConfig()     // Catch:{ Exception -> 0x0141 }
            r2.a((com.iap.ac.android.biz.common.model.remoteconfig.common.OAuthConfig) r4, (com.iap.ac.android.biz.common.callback.IAuthLoginCallback) r10)     // Catch:{ Exception -> 0x0141 }
        L_0x0101:
            boolean r2 = r10.e     // Catch:{ Exception -> 0x0141 }
            if (r2 != 0) goto L_0x010a
            java.lang.Object r2 = r10.f9682a     // Catch:{ Exception -> 0x0141 }
            r2.wait()     // Catch:{ Exception -> 0x0141 }
        L_0x010a:
            java.util.concurrent.atomic.AtomicInteger r2 = r10.c     // Catch:{ all -> 0x01ca }
            r2.decrementAndGet()     // Catch:{ all -> 0x01ca }
            java.util.concurrent.locks.ReentrantLock r2 = r10.b     // Catch:{ all -> 0x01ca }
            r2.unlock()     // Catch:{ all -> 0x01ca }
            java.lang.ThreadLocal<java.lang.Boolean> r2 = r10.f     // Catch:{ all -> 0x01ca }
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01ca }
            r2.set(r4)     // Catch:{ all -> 0x01ca }
            java.lang.String r2 = "iapconnect_center"
            java.lang.String r4 = "ac_common_oauth_interceptor"
            com.iap.ac.android.biz.common.utils.log.ACLogEvent r2 = com.iap.ac.android.biz.common.utils.log.ACLogEvent.newLogger(r2, r4)     // Catch:{ all -> 0x01ca }
            java.lang.String r4 = "result"
            boolean r5 = r10.d     // Catch:{ all -> 0x01ca }
            if (r5 == 0) goto L_0x012c
            java.lang.String r5 = "T"
            goto L_0x012e
        L_0x012c:
            java.lang.String r5 = "F"
        L_0x012e:
            com.iap.ac.android.biz.common.utils.log.ACLogEvent r2 = r2.addParams((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01ca }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ca }
            long r4 = r4 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x01ca }
            java.lang.String r1 = "timeCost"
            goto L_0x0185
        L_0x013f:
            r2 = move-exception
            goto L_0x018e
        L_0x0141:
            r2 = move-exception
            java.lang.String r4 = "IAPConnect"
            java.lang.String r5 = "OAuthInterceptor, wait exception: "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x013f }
            java.lang.String r2 = r5.concat(r2)     // Catch:{ all -> 0x013f }
            com.iap.ac.android.common.log.ACLog.e(r4, r2)     // Catch:{ all -> 0x013f }
            java.util.concurrent.atomic.AtomicInteger r2 = r10.c     // Catch:{ all -> 0x01ca }
            r2.decrementAndGet()     // Catch:{ all -> 0x01ca }
            java.util.concurrent.locks.ReentrantLock r2 = r10.b     // Catch:{ all -> 0x01ca }
            r2.unlock()     // Catch:{ all -> 0x01ca }
            java.lang.ThreadLocal<java.lang.Boolean> r2 = r10.f     // Catch:{ all -> 0x01ca }
            java.lang.Boolean r4 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01ca }
            r2.set(r4)     // Catch:{ all -> 0x01ca }
            java.lang.String r2 = "iapconnect_center"
            java.lang.String r4 = "ac_common_oauth_interceptor"
            com.iap.ac.android.biz.common.utils.log.ACLogEvent r2 = com.iap.ac.android.biz.common.utils.log.ACLogEvent.newLogger(r2, r4)     // Catch:{ all -> 0x01ca }
            java.lang.String r4 = "result"
            boolean r5 = r10.d     // Catch:{ all -> 0x01ca }
            if (r5 == 0) goto L_0x0173
            java.lang.String r5 = "T"
            goto L_0x0175
        L_0x0173:
            java.lang.String r5 = "F"
        L_0x0175:
            com.iap.ac.android.biz.common.utils.log.ACLogEvent r2 = r2.addParams((java.lang.String) r4, (java.lang.String) r5)     // Catch:{ all -> 0x01ca }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ca }
            long r4 = r4 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x01ca }
            java.lang.String r1 = "timeCost"
        L_0x0185:
            com.iap.ac.android.biz.common.utils.log.ACLogEvent r0 = r2.addParams((java.lang.String) r1, (java.lang.Object) r0)     // Catch:{ all -> 0x01ca }
            r0.event()     // Catch:{ all -> 0x01ca }
            monitor-exit(r3)     // Catch:{ all -> 0x01ca }
            return
        L_0x018e:
            java.util.concurrent.atomic.AtomicInteger r4 = r10.c     // Catch:{ all -> 0x01ca }
            r4.decrementAndGet()     // Catch:{ all -> 0x01ca }
            java.util.concurrent.locks.ReentrantLock r4 = r10.b     // Catch:{ all -> 0x01ca }
            r4.unlock()     // Catch:{ all -> 0x01ca }
            java.lang.ThreadLocal<java.lang.Boolean> r4 = r10.f     // Catch:{ all -> 0x01ca }
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x01ca }
            r4.set(r5)     // Catch:{ all -> 0x01ca }
            java.lang.String r4 = "iapconnect_center"
            java.lang.String r5 = "ac_common_oauth_interceptor"
            com.iap.ac.android.biz.common.utils.log.ACLogEvent r4 = com.iap.ac.android.biz.common.utils.log.ACLogEvent.newLogger(r4, r5)     // Catch:{ all -> 0x01ca }
            java.lang.String r5 = "result"
            boolean r6 = r10.d     // Catch:{ all -> 0x01ca }
            if (r6 == 0) goto L_0x01b0
            java.lang.String r6 = "T"
            goto L_0x01b2
        L_0x01b0:
            java.lang.String r6 = "F"
        L_0x01b2:
            com.iap.ac.android.biz.common.utils.log.ACLogEvent r4 = r4.addParams((java.lang.String) r5, (java.lang.String) r6)     // Catch:{ all -> 0x01ca }
            java.lang.String r5 = "timeCost"
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x01ca }
            long r6 = r6 - r0
            java.lang.Long r0 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x01ca }
            com.iap.ac.android.biz.common.utils.log.ACLogEvent r0 = r4.addParams((java.lang.String) r5, (java.lang.Object) r0)     // Catch:{ all -> 0x01ca }
            r0.event()     // Catch:{ all -> 0x01ca }
            throw r2     // Catch:{ all -> 0x01ca }
        L_0x01ca:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x01cd:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.iap.ac.android.biz.common.internal.oauth.BaseAutoOAuthInterceptor.b():void");
    }

    public void clear() {
        c cVar = this.i;
        if (FoundationProxy.getInstance(cVar.h).getNetworkType() == FoundationProxy.NetworkType.NETWORK_TYPE_ACRPC) {
            if (TextUtils.isEmpty(e.a(cVar.c, cVar.i))) {
                ACLog.d(Constants.TAG, String.format("startOAuthLogout(%s), there is no session %s in cookie, skip it.", new Object[]{cVar.h, cVar.i}));
            } else {
                IAPAsyncTask.asyncTask((Runnable) new b(cVar));
            }
        }
        ACUserInfoManager.getInstance(this.h).setUserInfo((ACUserInfo) null);
    }

    public abstract Set<String> getLoginIgnoredOpSet();

    public abstract Set<String> getLoginRequiredOpSet();

    public abstract String getLoginSessionKeyInCookie();

    public abstract OAuthConfig getOAuthConfig();

    public Object onAfterReceive(@Nullable RpcRequest rpcRequest, Object obj, FacadeInvoker facadeInvoker, Method method) {
        ACLog.i(Constants.TAG, "AutoOAuthInterceptor, after received");
        return null;
    }

    public void onBeforeSend(@Nullable RpcRequest rpcRequest) {
        ACLog.i(Constants.TAG, "AutoOAuthInterceptor, before send request");
        if (FoundationProxy.getInstance(this.h).getNetworkType() == FoundationProxy.NetworkType.NETWORK_TYPE_ACRPC) {
            if (rpcRequest == null) {
                ACLog.w(Constants.TAG, "AutoOAuthInterceptor, rpcRequest is null");
            } else if (getLoginRequiredOpSet().contains(rpcRequest.operationType)) {
                String loginSessionKeyInCookie = getLoginSessionKeyInCookie();
                String gateWayUrl = FoundationProxy.getInstance(this.h).getGateWayUrl();
                if (!TextUtils.isEmpty(gateWayUrl) && !TextUtils.isEmpty(loginSessionKeyInCookie)) {
                    if (TextUtils.isEmpty(e.a(gateWayUrl, loginSessionKeyInCookie)) || !a()) {
                        b();
                    }
                }
            }
        }
    }

    public RpcExceptionInterceptResult onExceptionOccurred(@Nullable RpcRequest rpcRequest, @Nullable Throwable th, FacadeInvoker facadeInvoker, Method method) {
        ACLog.i(Constants.TAG, "AutoOAuthInterceptor, on exception occurred");
        if (FoundationProxy.getInstance(this.h).getNetworkType() != FoundationProxy.NetworkType.NETWORK_TYPE_ACRPC) {
            return null;
        }
        if (rpcRequest == null || th == null) {
            ACLog.i(Constants.TAG, "AuthOAuthInterceptor, on exception, rpcRequest or throws is null");
            return null;
        }
        if (th instanceof RpcException) {
            RpcException rpcException = (RpcException) th;
            Set<String> loginIgnoredOpSet = getLoginIgnoredOpSet();
            if (loginIgnoredOpSet != null && loginIgnoredOpSet.contains(rpcRequest.operationType)) {
                ACLog.i(Constants.TAG, "AutoOAuthInterceptor, on exception, skip login and holdLogin rpc");
                return null;
            } else if (rpcException.getCode() == 2000 && (this.f.get() == null || !this.f.get().booleanValue())) {
                b();
                if (this.d) {
                    try {
                        Object invokeMethod = facadeInvoker.invokeMethod(method, rpcRequest);
                        RpcExceptionInterceptResult rpcExceptionInterceptResult = new RpcExceptionInterceptResult();
                        rpcExceptionInterceptResult.isHandled = true;
                        rpcExceptionInterceptResult.response = invokeMethod;
                        return rpcExceptionInterceptResult;
                    } catch (Exception e2) {
                        ACLog.e(Constants.TAG, "AutoOAuthInterceptor, resend request exception: ".concat(String.valueOf(e2)));
                    }
                } else {
                    ACLog.e(Constants.TAG, "AutoOAuthInterceptor, perform OAuth failed, skip it.");
                }
            }
        }
        return null;
    }

    public void onFailed() {
        synchronized (this.f9682a) {
            this.d = false;
            this.e = true;
            this.f9682a.notifyAll();
        }
    }

    public void onSuccess() {
        synchronized (this.f9682a) {
            this.d = true;
            this.e = true;
            this.f9682a.notifyAll();
        }
    }
}
