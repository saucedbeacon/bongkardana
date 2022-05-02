package com.alipay.mobile.rome.syncsdk.service;

import com.alipay.mobile.rome.syncsdk.util.c;

public class ConnStateFsm {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9412a = ConnStateFsm.class.getSimpleName();
    private volatile State b = State.INIT;

    public enum State {
        INIT,
        CONNECTED,
        WAIT_DEVICE_BINDED,
        DEVICE_BINDED,
        WAIT_USER_BINDED,
        USER_BINDED,
        WAIT_REGISTERED,
        REGISTERED,
        WAIT_USER_UNBINDED
    }

    public final synchronized void a() {
        this.b = State.INIT;
        String str = f9412a;
        StringBuilder sb = new StringBuilder("toInitState [ currState=");
        sb.append(this.b);
        sb.append(" ]");
        c.b(str, sb.toString());
    }

    public final synchronized State b() {
        String str = f9412a;
        StringBuilder sb = new StringBuilder("getCurrState [ currState=");
        sb.append(this.b);
        sb.append(" ]");
        c.b(str, sb.toString());
        return this.b;
    }

    public final synchronized void c() {
        int i = c.f9427a[this.b.ordinal()];
        if (i == 2) {
            this.b = State.DEVICE_BINDED;
        } else if (i == 3) {
            this.b = State.USER_BINDED;
        } else if (i == 4) {
            this.b = State.REGISTERED;
        } else if (i == 5) {
            this.b = State.DEVICE_BINDED;
        } else {
            String str = f9412a;
            StringBuilder sb = new StringBuilder("onRecvRegisterReply: [state error] [ currState=");
            sb.append(this.b);
            sb.append(" ]");
            c.d(str, sb.toString());
            throw new Exception("");
        }
        String str2 = f9412a;
        StringBuilder sb2 = new StringBuilder("onRecvRegisterReply [ currState=");
        sb2.append(this.b);
        sb2.append(" ]");
        c.b(str2, sb2.toString());
    }

    public final synchronized void d() {
        this.b = State.CONNECTED;
        String str = f9412a;
        StringBuilder sb = new StringBuilder("onConnectSucceeded [ currState=");
        sb.append(this.b);
        sb.append(" ]");
        c.b(str, sb.toString());
    }

    public final synchronized void e() {
        this.b = State.WAIT_REGISTERED;
        String str = f9412a;
        StringBuilder sb = new StringBuilder("onRegisterSended [ currState=");
        sb.append(this.b);
        sb.append(" ]");
        c.b(str, sb.toString());
    }

    public final synchronized void f() {
        this.b = State.WAIT_DEVICE_BINDED;
        String str = f9412a;
        StringBuilder sb = new StringBuilder("onDeviceBindSended [ currState=");
        sb.append(this.b);
        sb.append(" ]");
        c.b(str, sb.toString());
    }

    public final synchronized void g() {
        this.b = State.WAIT_USER_BINDED;
        String str = f9412a;
        StringBuilder sb = new StringBuilder("onUserBindSended [ currState=");
        sb.append(this.b);
        sb.append(" ]");
        c.b(str, sb.toString());
    }

    public final synchronized void h() {
        this.b = State.WAIT_USER_UNBINDED;
        String str = f9412a;
        StringBuilder sb = new StringBuilder("onUserUnBindSended [ currState=");
        sb.append(this.b);
        sb.append(" ]");
        c.b(str, sb.toString());
    }

    public final synchronized boolean i() {
        return this.b != State.INIT;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean j() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.alipay.mobile.rome.syncsdk.service.ConnStateFsm$State r0 = r5.b     // Catch:{ all -> 0x0028 }
            com.alipay.mobile.rome.syncsdk.service.ConnStateFsm$State r1 = com.alipay.mobile.rome.syncsdk.service.ConnStateFsm.State.DEVICE_BINDED     // Catch:{ all -> 0x0028 }
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r0 = 1
            goto L_0x000c
        L_0x000b:
            r0 = 0
        L_0x000c:
            com.alipay.mobile.rome.syncsdk.service.ConnStateFsm$State r1 = r5.b     // Catch:{ all -> 0x0028 }
            com.alipay.mobile.rome.syncsdk.service.ConnStateFsm$State r4 = com.alipay.mobile.rome.syncsdk.service.ConnStateFsm.State.WAIT_USER_BINDED     // Catch:{ all -> 0x0028 }
            if (r1 == r4) goto L_0x001b
            com.alipay.mobile.rome.syncsdk.service.ConnStateFsm$State r1 = r5.b     // Catch:{ all -> 0x0028 }
            com.alipay.mobile.rome.syncsdk.service.ConnStateFsm$State r4 = com.alipay.mobile.rome.syncsdk.service.ConnStateFsm.State.USER_BINDED     // Catch:{ all -> 0x0028 }
            if (r1 != r4) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r1 = 0
            goto L_0x001c
        L_0x001b:
            r1 = 1
        L_0x001c:
            r0 = r0 | r1
            com.alipay.mobile.rome.syncsdk.service.ConnStateFsm$State r1 = r5.b     // Catch:{ all -> 0x0028 }
            com.alipay.mobile.rome.syncsdk.service.ConnStateFsm$State r4 = com.alipay.mobile.rome.syncsdk.service.ConnStateFsm.State.REGISTERED     // Catch:{ all -> 0x0028 }
            if (r1 != r4) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r2 = 0
        L_0x0025:
            r0 = r0 | r2
            monitor-exit(r5)
            return r0
        L_0x0028:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.mobile.rome.syncsdk.service.ConnStateFsm.j():boolean");
    }

    public final synchronized boolean k() {
        return this.b == State.USER_BINDED || this.b == State.REGISTERED;
    }
}
