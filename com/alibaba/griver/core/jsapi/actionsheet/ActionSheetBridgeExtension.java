package com.alibaba.griver.core.jsapi.actionsheet;

import android.app.Dialog;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.point.dialog.ActionSheetPoint;
import com.alibaba.ariver.engine.api.bridge.model.GoBackCallback;
import com.alibaba.ariver.engine.api.point.PageBackInterceptPoint;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;

@Keep
public class ActionSheetBridgeExtension implements PageBackInterceptPoint, BridgeExtension {
    private static final String TAG = "AriverAPI:ActionSheetBridgeExtension";
    private ActionSheetPoint actionSheetPoint;
    private Dialog dialog;
    private boolean sheetVisible = false;

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    public boolean interceptBackEvent(GoBackCallback goBackCallback) {
        return hide();
    }

    /* access modifiers changed from: private */
    public boolean hide() {
        Dialog dialog2 = this.dialog;
        if (dialog2 == null || !dialog2.isShowing()) {
            return false;
        }
        this.dialog.cancel();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f8  */
    @com.alibaba.ariver.kernel.api.annotation.ThreadType(com.alibaba.ariver.kernel.common.service.executor.ExecutorType.UI)
    @com.alibaba.ariver.kernel.api.annotation.ActionFilter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void actionSheet(@com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingApiContext(required = true) com.alibaba.ariver.engine.api.bridge.model.ApiContext r17, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode(com.alibaba.ariver.app.api.Page.class) com.alibaba.ariver.app.api.Page r18, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam({"title"}) java.lang.String r19, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam({"cancelBtn"}) java.lang.String r20, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam({"btns"}) com.alibaba.fastjson.JSONArray r21, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam({"badges"}) com.alibaba.fastjson.JSONArray r22, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r23) {
        /*
            r16 = this;
            r0 = r16
            r1 = r21
            r2 = r22
            r3 = r23
            java.lang.String r4 = "index"
            r16.hide()
            android.app.Activity r5 = r17.getActivity()
            java.lang.Class<com.alibaba.ariver.app.api.point.dialog.ActionSheetPoint> r6 = com.alibaba.ariver.app.api.point.dialog.ActionSheetPoint.class
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r6 = com.alibaba.ariver.kernel.api.extension.ExtensionPoint.as(r6)
            r7 = r18
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r6 = r6.node(r7)
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r6 = r6.nullable()
            com.alibaba.ariver.kernel.api.extension.Extension r6 = r6.create()
            com.alibaba.ariver.app.api.point.dialog.ActionSheetPoint r6 = (com.alibaba.ariver.app.api.point.dialog.ActionSheetPoint) r6
            r0.actionSheetPoint = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r9 = 0
            r10 = 1
            if (r1 == 0) goto L_0x00b4
            boolean r11 = r21.isEmpty()
            if (r11 != 0) goto L_0x00b4
            r11 = 0
        L_0x0043:
            int r12 = r21.size()
            if (r11 >= r12) goto L_0x0065
            java.lang.Object r12 = r1.get(r11)
            java.lang.String r12 = (java.lang.String) r12
            r7.add(r12)
            com.alibaba.griver.core.jsapi.actionsheet.ActionSheetItem r12 = new com.alibaba.griver.core.jsapi.actionsheet.ActionSheetItem
            r12.<init>()
            java.lang.Object r13 = r1.get(r11)
            java.lang.String r13 = (java.lang.String) r13
            r12.content = r13
            r6.add(r12)
            int r11 = r11 + 1
            goto L_0x0043
        L_0x0065:
            if (r2 == 0) goto L_0x00b4
            boolean r11 = r22.isEmpty()
            if (r11 != 0) goto L_0x00b4
            r11 = 0
        L_0x006e:
            int r12 = r22.size()
            if (r11 >= r12) goto L_0x00b2
            com.alibaba.fastjson.JSONObject r12 = r2.getJSONObject(r11)     // Catch:{ all -> 0x00a2 }
            int r13 = r12.getIntValue(r4)     // Catch:{ all -> 0x00a2 }
            if (r13 <= 0) goto L_0x00ac
            int r14 = r6.size()     // Catch:{ all -> 0x00a2 }
            if (r13 >= r14) goto L_0x00ac
            java.lang.Object r13 = r6.get(r13)     // Catch:{ all -> 0x00a2 }
            com.alibaba.griver.core.jsapi.actionsheet.ActionSheetItem r13 = (com.alibaba.griver.core.jsapi.actionsheet.ActionSheetItem) r13     // Catch:{ all -> 0x00a2 }
            com.alibaba.griver.core.jsapi.actionsheet.ActionSheetItem$BadgeInfo r14 = new com.alibaba.griver.core.jsapi.actionsheet.ActionSheetItem$BadgeInfo     // Catch:{ all -> 0x00a2 }
            r14.<init>()     // Catch:{ all -> 0x00a2 }
            java.lang.String r15 = "type"
            java.lang.String r15 = r12.getString(r15)     // Catch:{ all -> 0x00a2 }
            r14.type = r15     // Catch:{ all -> 0x00a2 }
            java.lang.String r15 = "text"
            java.lang.String r15 = r12.getString(r15)     // Catch:{ all -> 0x00a2 }
            r14.text = r15     // Catch:{ all -> 0x00a2 }
            r13.badgeInfo = r14     // Catch:{ all -> 0x00a2 }
            goto L_0x00ac
        L_0x00a2:
            com.alibaba.fastjson.JSONObject r12 = new com.alibaba.fastjson.JSONObject
            r12.<init>()
            java.lang.String r13 = "-1"
            r12.put((java.lang.String) r4, (java.lang.Object) r13)
        L_0x00ac:
            r8.add(r12)
            int r11 = r11 + 1
            goto L_0x006e
        L_0x00b2:
            r2 = 1
            goto L_0x00b5
        L_0x00b4:
            r2 = 0
        L_0x00b5:
            com.alibaba.ariver.app.api.point.dialog.ActionSheetPoint r4 = r0.actionSheetPoint
            java.lang.String r11 = "AriverAPI:ActionSheetBridgeExtension"
            if (r4 == 0) goto L_0x00f8
            java.lang.String r1 = "actionSheet use actionSheetPoint"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r11, r1)
            java.lang.String r1 = r19.trim()
            if (r2 != 0) goto L_0x00d9
            com.alibaba.ariver.app.api.point.dialog.CreateActionSheetParam r2 = new com.alibaba.ariver.app.api.point.dialog.CreateActionSheetParam
            r4 = 0
            r17 = r2
            r18 = r5
            r19 = r7
            r20 = r4
            r21 = r1
            r22 = r23
            r17.<init>(r18, r19, r20, r21, r22)
            goto L_0x00ea
        L_0x00d9:
            com.alibaba.ariver.app.api.point.dialog.CreateActionSheetParam r2 = new com.alibaba.ariver.app.api.point.dialog.CreateActionSheetParam
            r17 = r2
            r18 = r5
            r19 = r7
            r20 = r8
            r21 = r1
            r22 = r23
            r17.<init>(r18, r19, r20, r21, r22)
        L_0x00ea:
            com.alibaba.ariver.app.api.point.dialog.ActionSheetPoint r1 = r0.actionSheetPoint
            android.app.Dialog r1 = r1.getActionSheet(r2)
            r0.dialog = r1
            if (r1 == 0) goto L_0x00f7
            r1.show()
        L_0x00f7:
            return
        L_0x00f8:
            java.lang.String r2 = "actionSheet use default"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r11, r2)
            r2 = 0
            if (r1 == 0) goto L_0x011b
            boolean r4 = r21.isEmpty()
            if (r4 != 0) goto L_0x011b
            int r4 = r21.size()
            java.lang.String[] r4 = new java.lang.String[r4]
        L_0x010c:
            int r7 = r21.size()
            if (r9 >= r7) goto L_0x011c
            java.lang.String r7 = r1.getString(r9)
            r4[r9] = r7
            int r9 = r9 + 1
            goto L_0x010c
        L_0x011b:
            r4 = r2
        L_0x011c:
            if (r4 != 0) goto L_0x0123
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse r1 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.INVALID_PARAM
            r3.sendBridgeResponse(r1)
        L_0x0123:
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            int r4 = com.alibaba.griver.core.R.layout.griver_core_dialog_actionsheet
            android.view.View r1 = r1.inflate(r4, r2)
            int r2 = com.alibaba.griver.core.R.id.rv_actionsheet
            android.view.View r2 = r1.findViewById(r2)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            androidx.recyclerview.widget.LinearLayoutManager r4 = new androidx.recyclerview.widget.LinearLayoutManager
            r4.<init>(r5)
            r2.setLayoutManager(r4)
            com.alibaba.griver.core.jsapi.actionsheet.ActionSheetRecyclerAdapter r4 = new com.alibaba.griver.core.jsapi.actionsheet.ActionSheetRecyclerAdapter
            r4.<init>(r5, r6)
            com.alibaba.griver.core.jsapi.actionsheet.ActionSheetBridgeExtension$1 r6 = new com.alibaba.griver.core.jsapi.actionsheet.ActionSheetBridgeExtension$1
            r6.<init>(r3)
            r4.setOnItemClickListener(r6)
            r2.setAdapter(r4)
            android.app.AlertDialog$Builder r2 = new android.app.AlertDialog$Builder
            r2.<init>(r5)
            r4 = r19
            android.app.AlertDialog$Builder r2 = r2.setTitle(r4)
            android.app.AlertDialog$Builder r1 = r2.setView(r1)
            com.alibaba.griver.core.jsapi.actionsheet.ActionSheetBridgeExtension$2 r2 = new com.alibaba.griver.core.jsapi.actionsheet.ActionSheetBridgeExtension$2
            r2.<init>(r3)
            android.app.AlertDialog$Builder r1 = r1.setOnCancelListener(r2)
            android.app.AlertDialog r1 = r1.create()
            r0.dialog = r1
            r1.show()
            r0.sheetVisible = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.jsapi.actionsheet.ActionSheetBridgeExtension.actionSheet(com.alibaba.ariver.engine.api.bridge.model.ApiContext, com.alibaba.ariver.app.api.Page, java.lang.String, java.lang.String, com.alibaba.fastjson.JSONArray, com.alibaba.fastjson.JSONArray, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback):void");
    }

    public void onFinalized() {
        hide();
        ActionSheetPoint actionSheetPoint2 = this.actionSheetPoint;
        if (actionSheetPoint2 != null) {
            actionSheetPoint2.onRelease();
        }
    }
}
