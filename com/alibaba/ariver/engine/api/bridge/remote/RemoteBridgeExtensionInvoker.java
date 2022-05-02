package com.alibaba.ariver.engine.api.bridge.remote;

import android.os.Bundle;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.remote.RemoteCallArgs;
import com.alibaba.ariver.kernel.api.remote.RemoteController;
import com.alibaba.ariver.kernel.common.immutable.ImmutableList;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.IpcClientKernelUtils;
import com.alibaba.ariver.kernel.ipc.IpcMessageConstants;
import java.lang.reflect.Method;

public class RemoteBridgeExtensionInvoker extends ExtensionInvoker {

    /* renamed from: a  reason: collision with root package name */
    private RemoteController f10055a;
    private SendToNativeCallback b;
    private NativeCallContext c;

    public RemoteBridgeExtensionInvoker(SendToNativeCallback sendToNativeCallback, NativeCallContext nativeCallContext, RemoteController remoteController, ExtensionInvoker extensionInvoker) {
        super(extensionInvoker);
        this.b = sendToNativeCallback;
        this.f10055a = remoteController;
        this.c = nativeCallContext;
    }

    public ExtensionInvoker.InvokeResult onInvoke(ImmutableList<Extension> immutableList, Object obj, Method method, Object[] objArr) {
        Node node = this.c.getNode();
        if (node == null) {
            RVLogger.w("AriverKernel:ExtensionInvoker:Remote", "RemoteBridgeExtensionInvoker can only call with a node!!!");
            return ExtensionInvoker.InvokeResult.proceed();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f10055a != null) {
            Extension extension = immutableList.get(0);
            if (this.f10055a.isRemoteCallExtension(extension, method)) {
                StringBuilder sb = new StringBuilder("extension: ");
                sb.append(extension.getClass());
                sb.append(" method: ");
                sb.append(method);
                sb.append(" isRemote!");
                RVLogger.d("AriverKernel:ExtensionInvoker:Remote", sb.toString());
                RemoteCallbackPool.getInstance().registerCallback(this.c, this.b);
                RemoteCallArgs remoteCallArgs = new RemoteCallArgs(node, extension, method, objArr, this.c);
                Bundle bundle = new Bundle();
                bundle.putParcelable(IpcMessageConstants.EXTRA_REMOTE_CALL_ARGS, remoteCallArgs);
                IpcClientKernelUtils.sendMsgToServer(IpcMessageConstants.BIZ_APP, 6, bundle);
                StringBuilder sb2 = new StringBuilder("extension ");
                sb2.append(extension);
                sb2.append(" method: ");
                sb2.append(method);
                sb2.append(" call remote cost ");
                sb2.append(System.currentTimeMillis() - currentTimeMillis);
                RVLogger.debug("AriverKernel:ExtensionInvoker:Remote", sb2.toString());
                return ExtensionInvoker.InvokeResult.decide((Object) null);
            }
        }
        return ExtensionInvoker.InvokeResult.proceed();
    }
}
