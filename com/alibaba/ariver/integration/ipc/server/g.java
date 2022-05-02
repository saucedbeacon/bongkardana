package com.alibaba.ariver.integration.ipc.server;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.engine.common.extension.BindBridgeExtensionInvoker;
import com.alibaba.ariver.kernel.api.extension.Extension;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.bridge.ActionMeta;
import com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker;
import com.alibaba.ariver.kernel.api.invoke.ExtensionInvokerFactory;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.remote.RemoteCallArgs;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.ipc.ShadowNodePool;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class g {

    /* renamed from: a  reason: collision with root package name */
    private final ExtensionManager f8996a;

    g(ExtensionManager extensionManager) {
        this.f8996a = extensionManager;
    }

    /* access modifiers changed from: package-private */
    public void a(RemoteCallArgs remoteCallArgs) {
        Bundle bundle;
        String str;
        long j;
        Render render;
        Method method;
        Object obj;
        ExtensionInvoker extensionInvoker;
        try {
            RVLogger.d("AriverKernel:ServerSideRemoteApiCaller", "begin remoteCall for ".concat(String.valueOf(remoteCallArgs)));
            long nodeId = remoteCallArgs.getNodeId();
            String action = remoteCallArgs.getAction();
            Node createOrGetNode = ShadowNodePool.getInstance().createOrGetNode(remoteCallArgs.getNode(), nodeId);
            if (createOrGetNode instanceof Page) {
                App app = ((Page) createOrGetNode).getApp();
                String appId = app.getAppId();
                long startToken = app.getStartToken();
                Bundle startParams = ((Page) createOrGetNode).getStartParams();
                f.a(app);
                f.a((Page) createOrGetNode);
                render = ((Page) createOrGetNode).getRender();
                str = appId;
                j = startToken;
                bundle = startParams;
            } else if (createOrGetNode instanceof App) {
                String appId2 = ((App) createOrGetNode).getAppId();
                long startToken2 = ((App) createOrGetNode).getStartToken();
                Bundle startParams2 = ((App) createOrGetNode).getStartParams();
                f.a((App) createOrGetNode);
                str = appId2;
                j = startToken2;
                bundle = startParams2;
                render = null;
            } else {
                j = -1;
                render = null;
                str = null;
                bundle = null;
            }
            if (!TextUtils.isEmpty(action)) {
                Parcelable data = remoteCallArgs.getData();
                if (data instanceof NativeCallContext) {
                    NativeCallContext nativeCallContext = (NativeCallContext) data;
                    SendToNativeCallback a2 = a(str, nativeCallContext.getId(), j, nodeId);
                    d dVar = new d(render, j, str, bundle, remoteCallArgs.getSourceProcessName(), nativeCallContext.getPluginId());
                    ActionMeta findActionMeta = this.f8996a.findActionMeta(action);
                    BridgeResponseHelper bridgeResponseHelper = new BridgeResponseHelper(a2);
                    obj = null;
                    ExtensionInvoker createScheduleExtensionInvoker = ((ExtensionInvokerFactory) RVProxy.get(ExtensionInvokerFactory.class)).createScheduleExtensionInvoker(new BindBridgeExtensionInvoker(createOrGetNode, nativeCallContext, bridgeResponseHelper, findActionMeta, dVar, (Class<? extends Extension>) null));
                    Method method2 = findActionMeta.actionMethod;
                    createScheduleExtensionInvoker.attacheTargetExtensions((Extension) this.f8996a.getBridgeExtensionByAction(createOrGetNode, action));
                    extensionInvoker = createScheduleExtensionInvoker;
                    method = method2;
                } else {
                    throw new IllegalStateException("Remote call of BridgeExtension not transact NativeCallContext!");
                }
            } else {
                obj = null;
                extensionInvoker = null;
                method = null;
            }
            if (method == null) {
                RVLogger.e("AriverKernel:ServerSideRemoteApiCaller", "action method not found");
            } else {
                extensionInvoker.invoke(obj, method, remoteCallArgs.getArgs());
            }
        } catch (Throwable th) {
            RVLogger.e("AriverKernel:ServerSideRemoteApiCaller", "remoteCall exception!", th);
        }
    }

    private SendToNativeCallback a(String str, String str2, long j, long j2) {
        b bVar = new b(str, str2, j, j2);
        return (SendToNativeCallback) Proxy.newProxyInstance(getClass().getClassLoader(), new Class[]{SendToNativeCallback.class}, bVar);
    }
}
