package com.alibaba.ariver.integration.ipc.server;

import android.os.SystemClock;
import androidx.annotation.Keep;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker;
import com.alibaba.ariver.kernel.api.invoke.ExtensionInvokerFactory;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.remote.IRemoteCaller;
import com.alibaba.ariver.kernel.api.remote.RemoteCallArgs;
import com.alibaba.ariver.kernel.api.remote.RemoteCallResult;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.ReflectUtils;
import com.alibaba.ariver.kernel.ipc.ShadowNodePool;
import java.lang.reflect.Method;

@Keep
public class ServerSideRemoteExtensionCaller extends IRemoteCaller.Stub {
    private static final String TAG = "AriverKernel:ServerSideRemoteApiCaller";
    private final ExtensionManager mExtensionManager;
    private long mRemoteCallCounter = SystemClock.elapsedRealtime();

    public ServerSideRemoteExtensionCaller(ExtensionManager extensionManager) {
        this.mExtensionManager = extensionManager;
    }

    public RemoteCallResult remoteCall(RemoteCallArgs remoteCallArgs) {
        RemoteCallResult remoteCallResult;
        long j = this.mRemoteCallCounter;
        this.mRemoteCallCounter = 1 + j;
        try {
            StringBuilder sb = new StringBuilder("begin remoteCall id: ");
            sb.append(j);
            sb.append(" args: ");
            sb.append(remoteCallArgs);
            RVLogger.d(TAG, sb.toString());
            long nodeId = remoteCallArgs.getNodeId();
            Node createOrGetNode = ShadowNodePool.getInstance().createOrGetNode(remoteCallArgs.getNode(), nodeId);
            Class<?> cls = Class.forName(remoteCallArgs.getClassName());
            ExtensionInvokerFactory extensionInvokerFactory = (ExtensionInvokerFactory) RVProxy.get(ExtensionInvokerFactory.class);
            ExtensionInvoker createScheduleExtensionInvoker = extensionInvokerFactory.createScheduleExtensionInvoker(extensionInvokerFactory.createAwareExtensionInvoker(createOrGetNode, (ExtensionInvoker.InvokeCallback) null, cls));
            Method findMethod = ReflectUtils.findMethod(cls, remoteCallArgs.getMethodName(), remoteCallArgs.getArgTypes());
            Extension extensionByName = this.mExtensionManager.getExtensionByName(createOrGetNode, remoteCallArgs.getClassName());
            RVLogger.d(TAG, "remoteCall found targetExtension: ".concat(String.valueOf(extensionByName)));
            createScheduleExtensionInvoker.attacheTargetExtensions(extensionByName);
            if (findMethod == null) {
                RVLogger.e(TAG, "action method not found");
                RemoteCallResult remoteCallResult2 = new RemoteCallResult((Object) null);
                RVLogger.d(TAG, "end remoteCall id: ".concat(String.valueOf(j)));
                return remoteCallResult2;
            }
            remoteCallResult = new RemoteCallResult(createScheduleExtensionInvoker.invoke((Object) null, findMethod, remoteCallArgs.getArgs()));
            RVLogger.d(TAG, "end remoteCall id: ".concat(String.valueOf(j)));
            return remoteCallResult;
        } catch (Throwable th) {
            RVLogger.d(TAG, "end remoteCall id: ".concat(String.valueOf(j)));
            throw th;
        }
    }
}
