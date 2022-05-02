package com.alibaba.ariver.remotedebug.jsapi;

import android.app.Activity;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.remotedebug.view.ActionEventListener;
import com.alibaba.ariver.remotedebug.view.a;
import com.alibaba.ariver.remotedebug.view.b;
import com.alibaba.fastjson.JSONObject;
import java.lang.ref.WeakReference;

public class RemoteDebugViewBridgeExtension implements BridgeExtension {

    /* renamed from: a  reason: collision with root package name */
    private b f9032a;
    private a b;
    /* access modifiers changed from: private */
    public WeakReference<Page> c;
    /* access modifiers changed from: private */
    public WeakReference<Page> d;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x005f, code lost:
        if (r8.equals("connected") == false) goto L_0x0076;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083  */
    @com.alibaba.ariver.kernel.api.annotation.AutoCallback
    @com.alibaba.ariver.kernel.api.annotation.ThreadType(com.alibaba.ariver.kernel.common.service.executor.ExecutorType.UI)
    @com.alibaba.ariver.kernel.api.annotation.ActionFilter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse showRemoteDebugPanel(@com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode(com.alibaba.ariver.app.api.Page.class) com.alibaba.ariver.app.api.Page r7, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam({"status"}) java.lang.String r8, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam({"text"}) java.lang.String r9, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam({"buttonTitle"}) java.lang.String r10) {
        /*
            r6 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r1 = "AriverAPI:RemoteDebugViewBridgeExtension"
            r2 = 2
            if (r0 == 0) goto L_0x0013
            java.lang.String r7 = "status is empty"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r7)
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error r7 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.newError(r2, r7)
            return r7
        L_0x0013:
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 == 0) goto L_0x0023
            java.lang.String r7 = "text is empty"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r7)
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error r7 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.newError(r2, r7)
            return r7
        L_0x0023:
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L_0x0033
            java.lang.String r7 = "buttonTitle is empty"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r7)
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error r7 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.newError(r2, r7)
            return r7
        L_0x0033:
            com.alibaba.ariver.remotedebug.view.a r0 = r6.b(r7)
            if (r0 != 0) goto L_0x0043
            java.lang.String r7 = "panelView is null."
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r1, r7)
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse$Error r7 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.newError(r2, r7)
            return r7
        L_0x0043:
            r1 = -1
            int r3 = r8.hashCode()
            r4 = -1381388741(0xffffffffada9ae3b, float:-1.929045E-11)
            r5 = 1
            if (r3 == r4) goto L_0x006c
            r4 = -775651656(0xffffffffd1c47eb8, float:-1.05492447E11)
            if (r3 == r4) goto L_0x0062
            r4 = -579210487(0xffffffffdd79f309, float:-1.12567183E18)
            if (r3 == r4) goto L_0x0059
            goto L_0x0076
        L_0x0059:
            java.lang.String r3 = "connected"
            boolean r8 = r8.equals(r3)
            if (r8 == 0) goto L_0x0076
            goto L_0x0077
        L_0x0062:
            java.lang.String r2 = "connecting"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x0076
            r2 = 0
            goto L_0x0077
        L_0x006c:
            java.lang.String r2 = "disconnected"
            boolean r8 = r8.equals(r2)
            if (r8 == 0) goto L_0x0076
            r2 = 1
            goto L_0x0077
        L_0x0076:
            r2 = -1
        L_0x0077:
            if (r2 == 0) goto L_0x0083
            if (r2 == r5) goto L_0x007f
            r0.b()
            goto L_0x0086
        L_0x007f:
            r0.c()
            goto L_0x0086
        L_0x0083:
            r0.a()
        L_0x0086:
            r0.setStateText(r9)
            r0.setExitText(r10)
            java.lang.ref.WeakReference r8 = new java.lang.ref.WeakReference
            r8.<init>(r7)
            r6.d = r8
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse r7 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.SUCCESS
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.remotedebug.jsapi.RemoteDebugViewBridgeExtension.showRemoteDebugPanel(com.alibaba.ariver.app.api.Page, java.lang.String, java.lang.String, java.lang.String):com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse");
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse showRemoteDebugMask(@BindingNode(Page.class) Page page, @BindingParam({"text"}) String str, @BindingParam({"buttonTitle"}) String str2, @BindingParam({"hide"}) boolean z) {
        b a2 = a(page);
        if (a2 == null) {
            RVLogger.d("AriverAPI:RemoteDebugViewBridgeExtension", "maskView is null.");
            return BridgeResponse.newError(2, "maskView is null");
        }
        if (z) {
            a2.setVisibility(8);
        } else if (TextUtils.isEmpty(str)) {
            RVLogger.d("AriverAPI:RemoteDebugViewBridgeExtension", "text is empty");
            return BridgeResponse.newError(2, "text is empty");
        } else if (TextUtils.isEmpty(str2)) {
            RVLogger.d("AriverAPI:RemoteDebugViewBridgeExtension", "buttonTitle is empty");
            return BridgeResponse.newError(2, "buttonTitle is empty");
        } else {
            a2.setStateText(str);
            a2.setExitText(str2);
            a2.setVisibility(0);
        }
        this.c = new WeakReference<>(page);
        return BridgeResponse.SUCCESS;
    }

    @Nullable
    private b a(Page page) {
        Activity activity;
        if (this.f9032a == null) {
            RVLogger.d("AriverAPI:RemoteDebugViewBridgeExtension", "create panelView.");
            if (!(page.getPageContext() == null || (activity = page.getPageContext().getActivity()) == null)) {
                b bVar = new b(activity);
                this.f9032a = bVar;
                bVar.setActionEventListener(new ActionEventListener() {
                    public void exitRemoteDebug() {
                        if (RemoteDebugViewBridgeExtension.this.c == null || RemoteDebugViewBridgeExtension.this.c.get() == null) {
                            RVLogger.d("AriverAPI:RemoteDebugViewBridgeExtension", "mMaskPageRef or page is null");
                        } else {
                            EngineUtils.sendToRender(((Page) RemoteDebugViewBridgeExtension.this.c.get()).getRender(), "tinyRemoteDebugMaskButtonClick", (JSONObject) null, (SendToRenderCallback) null);
                        }
                    }
                });
            }
            RVLogger.d("AriverAPI:RemoteDebugViewBridgeExtension", "create panelView error!");
        }
        return this.f9032a;
    }

    @Nullable
    private a b(Page page) {
        Activity activity;
        if (this.b == null) {
            RVLogger.d("AriverAPI:RemoteDebugViewBridgeExtension", "create panelView.");
            if (!(page.getPageContext() == null || (activity = page.getPageContext().getActivity()) == null)) {
                a aVar = new a(activity);
                this.b = aVar;
                aVar.setActionEventListener(new ActionEventListener() {
                    public void exitRemoteDebug() {
                        if (RemoteDebugViewBridgeExtension.this.d == null || RemoteDebugViewBridgeExtension.this.d.get() == null) {
                            RVLogger.d("AriverAPI:RemoteDebugViewBridgeExtension", "mPanelPageRef or page is null");
                        } else {
                            EngineUtils.sendToRender(((Page) RemoteDebugViewBridgeExtension.this.d.get()).getRender(), "tinyRemoteDebugPanelButtonClick", (JSONObject) null, (SendToRenderCallback) null);
                        }
                    }
                });
            }
            RVLogger.d("AriverAPI:RemoteDebugViewBridgeExtension", "create panelView error!");
        }
        return this.b;
    }
}
