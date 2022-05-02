package com.alibaba.ariver.integration.ipc.server;

import android.os.Bundle;
import android.util.Log;
import com.alibaba.ariver.app.ipc.IpcServerUtils;
import com.alibaba.ariver.kernel.api.IIpcChannel;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcChannelManager;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class b implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    private IIpcChannel f8992a;
    private String b;
    private String c;
    private long d;
    private long e;

    b(String str, String str2, long j, long j2) {
        this.e = j;
        this.c = str;
        this.f8992a = IpcChannelManager.getInstance().getClientChannel(j);
        this.d = j2;
        this.b = str2;
    }

    public Object invoke(Object obj, Method method, Object[] objArr) {
        if (this.f8992a == null) {
            StringBuilder sb = new StringBuilder("Client channel is not found!!!");
            sb.append(Log.getStackTraceString(new Throwable("Just Print!")));
            RVLogger.e("AriverInt:RemoteReplyHandler", sb.toString());
            return null;
        }
        if ("onCallback".equalsIgnoreCase(method.getName())) {
            boolean booleanValue = objArr[1].booleanValue();
            Bundle bundle = new Bundle();
            bundle.putByteArray("data", JSONUtils.marshallJSONObject(objArr[0]));
            bundle.putBoolean("keepCallback", booleanValue);
            bundle.putString("clientId", this.b);
            bundle.putLong(IpcMessageConstants.EXTRA_NODE_ID, this.d);
            RVLogger.d("AriverInt:RemoteReplyHandler", "send RemoteCall back to client: ".concat(String.valueOf(bundle)));
            IpcServerUtils.sendMsgToClient(this.c, this.e, 7, bundle);
        }
        return null;
    }
}
