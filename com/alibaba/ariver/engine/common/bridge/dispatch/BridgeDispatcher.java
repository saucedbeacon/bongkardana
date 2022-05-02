package com.alibaba.ariver.engine.common.bridge.dispatch;

import com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper;
import com.alibaba.ariver.engine.api.bridge.model.ApiContext;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.proxy.RVJsStatTrackService;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.fastjson.JSONObject;

public class BridgeDispatcher {
    public static final String TAG;

    /* renamed from: a  reason: collision with root package name */
    private static volatile BridgeDispatcher f8979a;
    private ExtensionManager b;
    private RVConfigService c;
    /* access modifiers changed from: private */
    public JSONObject d;
    private RVJsStatTrackService e;

    static {
        StringBuilder sb = new StringBuilder("AriverEngine:");
        sb.append(BridgeDispatcher.class.getSimpleName());
        TAG = sb.toString();
    }

    private BridgeDispatcher() {
        RVConfigService rVConfigService = (RVConfigService) RVProxy.get(RVConfigService.class);
        this.c = rVConfigService;
        try {
            this.d = JSONObject.parseObject(rVConfigService.getConfig("ta_extension_dispatch_whitelist", (String) null, new RVConfigService.OnConfigChangeListener() {
                public void onChange(String str) {
                    try {
                        JSONObject unused = BridgeDispatcher.this.d = JSONObject.parseObject(str);
                    } catch (Exception unused2) {
                        JSONObject unused3 = BridgeDispatcher.this.d = null;
                    }
                }
            }));
        } catch (Exception unused) {
            this.d = null;
        }
        this.e = (RVJsStatTrackService) RVProxy.get(RVJsStatTrackService.class);
    }

    public static BridgeDispatcher getInstance() {
        if (f8979a == null) {
            synchronized (BridgeDispatcher.class) {
                if (f8979a == null) {
                    f8979a = new BridgeDispatcher();
                }
            }
        }
        return f8979a;
    }

    public void bindExtensionManager(ExtensionManager extensionManager) {
        this.b = extensionManager;
    }

    public ExtensionManager getExtensionManager() {
        return this.b;
    }

    public boolean dispatch(NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper, boolean z) {
        return dispatch(nativeCallContext, bridgeResponseHelper, z, this.b);
    }

    public boolean dispatch(NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper, boolean z, ExtensionManager extensionManager) {
        return dispatch(nativeCallContext, bridgeResponseHelper, z, extensionManager, (ApiContext) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x0173  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0191 A[Catch:{ all -> 0x01ad }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatch(com.alibaba.ariver.engine.api.bridge.model.NativeCallContext r16, com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper r17, boolean r18, com.alibaba.ariver.kernel.api.extension.ExtensionManager r19, @androidx.annotation.Nullable com.alibaba.ariver.engine.api.bridge.model.ApiContext r20) {
        /*
            r15 = this;
            r8 = r15
            r9 = r17
            r0 = r19
            java.lang.String r10 = "RV_JSAPI_Dispatch_"
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = "tinyDebugConsole"
            boolean r1 = r2.equals(r1)
            r11 = 1
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = "tinyAppConfig"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = "internalAPI"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = "remoteLog"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = "handleLoggingAction"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x006e
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = "postMessage"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L_0x006e
            com.alibaba.ariver.kernel.api.node.Node r1 = r16.getNode()
            boolean r1 = r1 instanceof com.alibaba.ariver.app.api.Page
            if (r1 == 0) goto L_0x006e
            com.alibaba.ariver.kernel.api.node.Node r1 = r16.getNode()
            com.alibaba.ariver.app.api.Page r1 = (com.alibaba.ariver.app.api.Page) r1
            java.lang.String r2 = "jsapiCount"
            int r3 = r1.getIntValue(r2)
            if (r3 != 0) goto L_0x006a
            r1.putIntValue(r2, r11)
            goto L_0x006e
        L_0x006a:
            int r3 = r3 + r11
            r1.putIntValue(r2, r3)
        L_0x006e:
            java.lang.String r1 = r16.getName()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r12 = 0
            if (r1 == 0) goto L_0x0081
            java.lang.String r0 = TAG
            java.lang.String r1 = "BridgeDispatcher dispatch context.getName() == null!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r0, r1)
            return r12
        L_0x0081:
            java.lang.String r1 = r16.getName()
            com.alibaba.ariver.kernel.api.extension.bridge.ActionMeta r13 = r0.findActionMeta(r1)
            if (r13 != 0) goto L_0x00a3
            java.lang.String r0 = TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "BridgeDispatcher dispatch findActionMeta == null!\t"
            r1.<init>(r2)
            java.lang.String r2 = r16.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r0, r1)
            return r12
        L_0x00a3:
            com.alibaba.fastjson.JSONObject r1 = r8.d
            if (r1 == 0) goto L_0x00fd
            java.lang.String r2 = r16.getName()
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L_0x00fd
            com.alibaba.fastjson.JSONObject r1 = r8.d
            java.lang.String r2 = r16.getName()
            com.alibaba.fastjson.JSONArray r1 = r1.getJSONArray(r2)
            boolean r2 = com.alibaba.ariver.kernel.common.utils.CollectionUtils.isEmpty((java.util.List) r1)
            if (r2 != 0) goto L_0x00fd
            com.alibaba.ariver.kernel.api.node.Node r2 = r16.getNode()
            if (r2 == 0) goto L_0x00fd
            com.alibaba.ariver.kernel.api.node.Node r2 = r16.getNode()
            java.lang.Class<com.alibaba.ariver.app.api.App> r3 = com.alibaba.ariver.app.api.App.class
            com.alibaba.ariver.kernel.api.node.Node r2 = r2.bubbleFindNode(r3)
            com.alibaba.ariver.app.api.App r2 = (com.alibaba.ariver.app.api.App) r2
            java.lang.String r2 = r2.getAppId()
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L_0x00fd
            java.lang.String r2 = "all"
            boolean r1 = r1.contains(r2)
            if (r1 != 0) goto L_0x00fd
            java.lang.String r0 = TAG
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "BridgeDispatch dispatch fallback extension "
            r1.<init>(r2)
            java.lang.String r2 = r16.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r1)
            return r12
        L_0x00fd:
            com.alibaba.ariver.kernel.api.node.Node r1 = r16.getNode()     // Catch:{ all -> 0x01c2 }
            java.lang.String r2 = r16.getName()     // Catch:{ all -> 0x01c2 }
            com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension r14 = r0.getBridgeExtensionByAction(r1, r2)     // Catch:{ all -> 0x01c2 }
            if (r14 != 0) goto L_0x0113
            java.lang.String r0 = TAG
            java.lang.String r1 = "BridgeDispatcher dispatch getBridgeExtensionByAction == null!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.w(r0, r1)
            return r12
        L_0x0113:
            r1 = r15
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r13
            r7 = r20
            com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker r0 = r1.a(r2, r3, r4, r5, r6, r7)
            r0.attacheTargetExtensions((com.alibaba.ariver.kernel.api.extension.Extension) r14)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ AccessControlException -> 0x0188, all -> 0x016e }
            r1.<init>(r10)     // Catch:{ AccessControlException -> 0x0188, all -> 0x016e }
            java.lang.String r2 = r16.getName()     // Catch:{ AccessControlException -> 0x0188, all -> 0x016e }
            r1.append(r2)     // Catch:{ AccessControlException -> 0x0188, all -> 0x016e }
            java.lang.String r1 = r1.toString()     // Catch:{ AccessControlException -> 0x0188, all -> 0x016e }
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceBeginSection(r1)     // Catch:{ AccessControlException -> 0x0188, all -> 0x016e }
            java.lang.reflect.Method r1 = r13.actionMethod     // Catch:{ AccessControlException -> 0x0188, all -> 0x016e }
            java.lang.Class[] r2 = r13.paramTypes     // Catch:{ AccessControlException -> 0x0188, all -> 0x016e }
            if (r2 != 0) goto L_0x0140
            goto L_0x0143
        L_0x0140:
            java.lang.Class[] r2 = r13.paramTypes     // Catch:{ AccessControlException -> 0x0188, all -> 0x016e }
            int r12 = r2.length     // Catch:{ AccessControlException -> 0x0188, all -> 0x016e }
        L_0x0143:
            java.lang.Object[] r2 = new java.lang.Object[r12]     // Catch:{ AccessControlException -> 0x0188, all -> 0x016e }
            com.alibaba.ariver.engine.api.proxy.RVJsStatTrackService r3 = r8.e     // Catch:{ AccessControlException -> 0x0188, all -> 0x016e }
            if (r3 == 0) goto L_0x0151
            com.alibaba.ariver.engine.api.proxy.RVJsStatTrackService r3 = r8.e     // Catch:{ AccessControlException -> 0x0188, all -> 0x016e }
            r4 = r16
            r3.onInvoke(r4)     // Catch:{ AccessControlException -> 0x016c, all -> 0x016a }
            goto L_0x0153
        L_0x0151:
            r4 = r16
        L_0x0153:
            r0.invoke(r14, r1, r2)     // Catch:{ AccessControlException -> 0x016c, all -> 0x016a }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r10)
        L_0x015b:
            java.lang.String r1 = r16.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r0)
            return r11
        L_0x016a:
            r0 = move-exception
            goto L_0x0171
        L_0x016c:
            r0 = move-exception
            goto L_0x018b
        L_0x016e:
            r0 = move-exception
            r4 = r16
        L_0x0171:
            if (r9 == 0) goto L_0x017b
            r1 = 3
            java.lang.String r2 = r0.getMessage()     // Catch:{ all -> 0x01ad }
            r9.sendError(r1, r2)     // Catch:{ all -> 0x01ad }
        L_0x017b:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x01ad }
            java.lang.String r2 = "bridge extension fail Throwable:"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r1, r2, r0)     // Catch:{ all -> 0x01ad }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r10)
            goto L_0x015b
        L_0x0188:
            r0 = move-exception
            r4 = r16
        L_0x018b:
            java.lang.String r1 = r0.getMessage()     // Catch:{ all -> 0x01ad }
            if (r9 == 0) goto L_0x01a0
            java.lang.String r2 = "N22"
            boolean r2 = r1.startsWith(r2)     // Catch:{ all -> 0x01ad }
            if (r2 == 0) goto L_0x019d
            r9.sendNoRigHtToInvoke(r1)     // Catch:{ all -> 0x01ad }
            goto L_0x01a0
        L_0x019d:
            r17.sendNoRigHtToInvoke()     // Catch:{ all -> 0x01ad }
        L_0x01a0:
            java.lang.String r1 = TAG     // Catch:{ all -> 0x01ad }
            java.lang.String r2 = "bridge extension fail AccessControlException:"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r1, r2, r0)     // Catch:{ all -> 0x01ad }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r10)
            goto L_0x015b
        L_0x01ad:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r10)
            java.lang.String r2 = r16.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.alibaba.ariver.kernel.common.utils.RVTraceUtils.traceEndSection(r1)
            throw r0
        L_0x01c2:
            r0 = move-exception
            java.lang.String r1 = TAG
            java.lang.String r2 = "dispatch BridgeExtension error"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r1, r2, r0)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.engine.common.bridge.dispatch.BridgeDispatcher.dispatch(com.alibaba.ariver.engine.api.bridge.model.NativeCallContext, com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper, boolean, com.alibaba.ariver.kernel.api.extension.ExtensionManager, com.alibaba.ariver.engine.api.bridge.model.ApiContext):boolean");
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [com.alibaba.ariver.engine.api.bridge.remote.RemoteBridgeExtensionInvoker] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker a(com.alibaba.ariver.engine.api.bridge.model.NativeCallContext r10, com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper r11, boolean r12, com.alibaba.ariver.kernel.api.extension.ExtensionManager r13, com.alibaba.ariver.kernel.api.extension.bridge.ActionMeta r14, @androidx.annotation.Nullable com.alibaba.ariver.engine.api.bridge.model.ApiContext r15) {
        /*
            r9 = this;
            java.lang.Class<com.alibaba.ariver.kernel.api.invoke.ExtensionInvokerFactory> r0 = com.alibaba.ariver.kernel.api.invoke.ExtensionInvokerFactory.class
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)
            com.alibaba.ariver.kernel.api.invoke.ExtensionInvokerFactory r0 = (com.alibaba.ariver.kernel.api.invoke.ExtensionInvokerFactory) r0
            com.alibaba.ariver.engine.common.extension.BindBridgeExtensionInvoker r8 = new com.alibaba.ariver.engine.common.extension.BindBridgeExtensionInvoker
            com.alibaba.ariver.kernel.api.node.Node r2 = r10.getNode()
            r7 = 0
            r1 = r8
            r3 = r10
            r4 = r11
            r5 = r14
            r6 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7)
            if (r11 != 0) goto L_0x001b
            r15 = 0
            goto L_0x001f
        L_0x001b:
            com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback r15 = r11.getInnerBridgeResponse()
        L_0x001f:
            boolean r1 = com.alibaba.ariver.kernel.common.utils.ProcessUtils.isMainProcess()
            if (r1 != 0) goto L_0x002f
            com.alibaba.ariver.engine.api.bridge.remote.RemoteBridgeExtensionInvoker r1 = new com.alibaba.ariver.engine.api.bridge.remote.RemoteBridgeExtensionInvoker
            com.alibaba.ariver.kernel.api.remote.RemoteController r2 = r13.getRemoteController()
            r1.<init>(r15, r10, r2, r8)
            r8 = r1
        L_0x002f:
            com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker r15 = r0.createScheduleExtensionInvoker(r8)
            com.alibaba.ariver.engine.common.extension.NativePermissionExtensionInvoker r1 = new com.alibaba.ariver.engine.common.extension.NativePermissionExtensionInvoker
            com.alibaba.ariver.kernel.api.node.Node r2 = r10.getNode()
            r1.<init>(r2, r11, r15, r14)
            if (r12 == 0) goto L_0x004f
            com.alibaba.ariver.permission.a r12 = new com.alibaba.ariver.permission.a
            r12.<init>(r10, r11, r13)
            com.alibaba.ariver.kernel.api.security.internal.DefaultAccessController r10 = new com.alibaba.ariver.kernel.api.security.internal.DefaultAccessController
            r10.<init>()
            r10.setAccessControlManagement(r12)
            com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker r1 = r0.createPermissionExtensionInvoker(r14, r10, r1)
        L_0x004f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.engine.common.bridge.dispatch.BridgeDispatcher.a(com.alibaba.ariver.engine.api.bridge.model.NativeCallContext, com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper, boolean, com.alibaba.ariver.kernel.api.extension.ExtensionManager, com.alibaba.ariver.kernel.api.extension.bridge.ActionMeta, com.alibaba.ariver.engine.api.bridge.model.ApiContext):com.alibaba.ariver.kernel.api.invoke.ExtensionInvoker");
    }
}
