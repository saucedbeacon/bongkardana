package com.alibaba.ariver.ipc;

import android.content.Context;
import android.content.ServiceConnection;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.uniform.UniformIpcUtils;

class IpcCallClientHelper {

    /* renamed from: a  reason: collision with root package name */
    private Context f8998a = ProcessUtils.getContext();
    private Class b;
    private ServiceConnection c;
    private boolean d = false;
    private int e = 0;

    IpcCallClientHelper() {
    }

    public void bindService(Class cls, ServiceConnection serviceConnection) {
        this.b = cls;
        this.c = serviceConnection;
    }

    public void bindContext(Context context) {
        this.f8998a = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0075, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean bind() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.Class r0 = r5.b     // Catch:{ all -> 0x0076 }
            r1 = 0
            if (r0 == 0) goto L_0x0074
            android.content.ServiceConnection r0 = r5.c     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x0074
            android.content.Context r0 = r5.f8998a     // Catch:{ all -> 0x0076 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0074
        L_0x000f:
            boolean r0 = r5.isBind()     // Catch:{ all -> 0x0076 }
            r2 = 1
            if (r0 == 0) goto L_0x0018
            monitor-exit(r5)
            return r2
        L_0x0018:
            java.lang.String r0 = "AriverKernel:RemoteCall"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0076 }
            r3.<init>()     // Catch:{ all -> 0x0076 }
            java.lang.Class r4 = r5.b     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = r4.getSimpleName()     // Catch:{ all -> 0x0076 }
            r3.append(r4)     // Catch:{ all -> 0x0076 }
            java.lang.String r4 = " bind with context: "
            r3.append(r4)     // Catch:{ all -> 0x0076 }
            android.content.Context r4 = r5.f8998a     // Catch:{ all -> 0x0076 }
            r3.append(r4)     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0076 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r3)     // Catch:{ all -> 0x0076 }
            android.content.Intent r0 = new android.content.Intent     // Catch:{ all -> 0x0076 }
            android.content.Context r3 = r5.f8998a     // Catch:{ all -> 0x0076 }
            java.lang.Class r4 = r5.b     // Catch:{ all -> 0x0076 }
            r0.<init>(r3, r4)     // Catch:{ all -> 0x0076 }
            java.lang.String r3 = "AriverKernel:RemoteCall"
            java.lang.String r4 = "IpcCallClientHelper start service begin!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r3, r4)     // Catch:{ all -> 0x005e }
            android.content.Context r3 = r5.f8998a     // Catch:{ all -> 0x005e }
            r3.startService(r0)     // Catch:{ all -> 0x005e }
            java.lang.String r3 = "AriverKernel:RemoteCall"
            java.lang.String r4 = "IpcCallClientHelper start service end!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r3, r4)     // Catch:{ all -> 0x005e }
            android.content.Context r3 = r5.f8998a     // Catch:{ all -> 0x0068 }
            android.content.ServiceConnection r4 = r5.c     // Catch:{ all -> 0x0068 }
            r3.bindService(r0, r4, r1)     // Catch:{ all -> 0x0068 }
            monitor-exit(r5)
            return r2
        L_0x005e:
            r0 = move-exception
            java.lang.String r2 = "AriverKernel:RemoteCall"
            java.lang.String r3 = "IpcCallClientHelper start service failed!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r2, r3, r0)     // Catch:{ all -> 0x0068 }
            monitor-exit(r5)
            return r1
        L_0x0068:
            r0 = move-exception
            java.lang.String r2 = "AriverKernel:RemoteCall"
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ all -> 0x0076 }
            com.alibaba.ariver.kernel.common.utils.RVLogger.e((java.lang.String) r2, (java.lang.String) r0)     // Catch:{ all -> 0x0076 }
            monitor-exit(r5)
            return r1
        L_0x0074:
            monitor-exit(r5)
            return r1
        L_0x0076:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.ipc.IpcCallClientHelper.bind():boolean");
    }

    public void unbind() {
        if (this.d) {
            this.f8998a.unbindService(this.c);
            this.d = false;
        }
    }

    public void rebind() {
        unbind();
        if (this.e < 3) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.b.getSimpleName());
            sb.append(" retry bind ");
            sb.append(this.e);
            RVLogger.d(UniformIpcUtils.TAG, sb.toString());
            this.e++;
            bind();
        }
    }

    public void setBind(boolean z) {
        this.d = z;
    }

    public boolean isBind() {
        return this.d;
    }
}
