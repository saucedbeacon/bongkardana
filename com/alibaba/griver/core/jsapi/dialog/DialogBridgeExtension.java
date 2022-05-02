package com.alibaba.griver.core.jsapi.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.dialog.CreateDialogParam;
import com.alibaba.ariver.app.api.point.dialog.DialogPoint;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.ui.dialog.GriverDialogExtension;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.core.R;

@Keep
public class DialogBridgeExtension implements BridgeExtension {
    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void alert(@BindingNode(Page.class) Page page, @BindingParam(name = {"title"}) String str, @BindingParam(name = {"message"}) String str2, @BindingParam(name = {"button"}) String str3, @BindingParam(name = {"align"}) String str4, @BindingParam(name = {"confirmColor"}) String str5, @BindingParam(name = {"cancelColor"}) String str6, @BindingCallback final BridgeCallback bridgeCallback) {
        if (page.getPageContext() == null) {
            bridgeCallback.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        if (TextUtils.isEmpty(str3) && GriverEnv.getResources() != null) {
            str3 = GriverEnv.getResources().getString(R.string.griver_base_ok);
        }
        CreateDialogParam createDialogParam = new CreateDialogParam(str, str2, str3, (String) null, str4);
        createDialogParam.positiveTextColor = str5;
        createDialogParam.cancelColor = str6;
        createDialogParam.positiveListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                bridgeCallback.sendBridgeResponse((BridgeResponse) null);
            }
        };
        createDialogParam.cancelListener = new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                bridgeCallback.sendBridgeResponse((BridgeResponse) null);
            }
        };
        Dialog createDialog = ExtensionPoint.as(DialogPoint.class).node(page).create().createDialog(page.getPageContext().getActivity(), createDialogParam);
        if (createDialog != null) {
            createDialog.show();
            ((GriverDialogExtension) RVProxy.get(GriverDialogExtension.class)).applyShow(createDialog, createDialogParam);
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void confirm(@BindingNode(Page.class) Page page, @BindingParam(name = {"title"}) String str, @BindingParam(name = {"message"}) String str2, @BindingParam(name = {"okButton"}) String str3, @BindingParam(name = {"cancelButton"}) String str4, @BindingParam(name = {"align"}) String str5, @BindingParam(name = {"confirmColor"}) String str6, @BindingParam(name = {"cancelColor"}) String str7, @BindingCallback BridgeCallback bridgeCallback) {
        final BridgeCallback bridgeCallback2 = bridgeCallback;
        if (page.getPageContext() == null) {
            bridgeCallback2.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        Resources resources = GriverEnv.getResources();
        Page page2 = page;
        CreateDialogParam createDialogParam = new CreateDialogParam(str, str2, (!TextUtils.isEmpty(str3) || resources == null) ? str3 : resources.getString(R.string.griver_base_ok), (!TextUtils.isEmpty(str4) || resources == null) ? str4 : resources.getString(R.string.griver_base_cancel), str5);
        createDialogParam.positiveTextColor = str6;
        createDialogParam.cancelColor = str7;
        createDialogParam.positiveListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ok", (Object) Boolean.TRUE);
                bridgeCallback2.sendJSONResponse(jSONObject);
            }
        };
        createDialogParam.negativeListener = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                if (dialogInterface != null) {
                    dialogInterface.dismiss();
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ok", (Object) Boolean.FALSE);
                bridgeCallback2.sendJSONResponse(jSONObject);
            }
        };
        createDialogParam.cancelListener = new DialogInterface.OnCancelListener() {
            public void onCancel(DialogInterface dialogInterface) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ok", (Object) Boolean.FALSE);
                bridgeCallback2.sendJSONResponse(jSONObject);
            }
        };
        Dialog createDialog = ExtensionPoint.as(DialogPoint.class).node(page).create().createDialog(page.getPageContext().getActivity(), createDialogParam);
        if (createDialog != null) {
            createDialog.show();
            ((GriverDialogExtension) RVProxy.get(GriverDialogExtension.class)).applyShow(createDialog, createDialogParam);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002b, code lost:
        if (android.text.TextUtils.equals(r14, "确定") != false) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (android.text.TextUtils.equals(r15, "取消") != false) goto L_0x004c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0061 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @com.alibaba.ariver.kernel.api.annotation.ThreadType(com.alibaba.ariver.kernel.common.service.executor.ExecutorType.UI)
    @com.alibaba.ariver.kernel.api.annotation.ActionFilter
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void prompt(@com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode(com.alibaba.ariver.app.api.Page.class) com.alibaba.ariver.app.api.Page r11, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"title"}) java.lang.String r12, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"message"}) java.lang.String r13, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"okButton"}) java.lang.String r14, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"cancelButton"}) java.lang.String r15, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"placeholder"}) java.lang.String r16, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"confirmColor"}) java.lang.String r17, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"cancelColor"}) java.lang.String r18, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam(name = {"align"}) java.lang.String r19, @com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback r20) {
        /*
            r10 = this;
            r0 = r10
            r1 = r20
            if (r11 == 0) goto L_0x00bc
            com.alibaba.ariver.app.api.PageContext r2 = r11.getPageContext()
            if (r2 == 0) goto L_0x00bc
            boolean r2 = r11.isDestroyed()
            if (r2 != 0) goto L_0x00bc
            boolean r2 = r11.isExited()
            if (r2 == 0) goto L_0x0019
            goto L_0x00bc
        L_0x0019:
            android.content.res.Resources r2 = com.alibaba.griver.base.common.env.GriverEnv.getResources()
            boolean r3 = android.text.TextUtils.isEmpty(r14)
            if (r3 != 0) goto L_0x002e
            java.lang.String r3 = "确定"
            r4 = r14
            boolean r3 = android.text.TextUtils.equals(r14, r3)
            if (r3 == 0) goto L_0x0039
            goto L_0x002f
        L_0x002e:
            r4 = r14
        L_0x002f:
            if (r2 == 0) goto L_0x0039
            int r3 = com.alibaba.griver.core.R.string.griver_base_ok
            java.lang.String r3 = r2.getString(r3)
            r7 = r3
            goto L_0x003a
        L_0x0039:
            r7 = r4
        L_0x003a:
            boolean r3 = android.text.TextUtils.isEmpty(r15)
            if (r3 != 0) goto L_0x004b
            java.lang.String r3 = "取消"
            r4 = r15
            boolean r3 = android.text.TextUtils.equals(r15, r3)
            if (r3 == 0) goto L_0x0056
            goto L_0x004c
        L_0x004b:
            r4 = r15
        L_0x004c:
            if (r2 == 0) goto L_0x0056
            int r3 = com.alibaba.griver.core.R.string.griver_base_cancel
            java.lang.String r3 = r2.getString(r3)
            r8 = r3
            goto L_0x0057
        L_0x0056:
            r8 = r4
        L_0x0057:
            java.lang.String r3 = "请输入内容"
            r4 = r13
            boolean r3 = android.text.TextUtils.equals(r13, r3)
            if (r3 == 0) goto L_0x006b
            if (r2 == 0) goto L_0x006b
            int r3 = com.alibaba.griver.core.R.string.griver_core_prompt_message_placeholder
            java.lang.String r2 = r2.getString(r3)
            r6 = r2
            goto L_0x006c
        L_0x006b:
            r6 = r4
        L_0x006c:
            com.alibaba.griver.api.ui.dialog.GriverCreatePromptParam r2 = new com.alibaba.griver.api.ui.dialog.GriverCreatePromptParam
            r4 = r2
            r5 = r12
            r9 = r16
            r4.<init>(r5, r6, r7, r8, r9)
            r3 = r19
            r2.setAlign(r3)
            r3 = r17
            r2.positiveTextColor = r3
            r3 = r18
            r2.cancelColor = r3
            com.alibaba.griver.core.jsapi.dialog.DialogBridgeExtension$6 r3 = new com.alibaba.griver.core.jsapi.dialog.DialogBridgeExtension$6
            r3.<init>(r1)
            r2.positiveListener = r3
            com.alibaba.griver.core.jsapi.dialog.DialogBridgeExtension$7 r3 = new com.alibaba.griver.core.jsapi.dialog.DialogBridgeExtension$7
            r3.<init>(r1)
            r2.negativeListener = r3
            com.alibaba.griver.core.jsapi.dialog.DialogBridgeExtension$8 r3 = new com.alibaba.griver.core.jsapi.dialog.DialogBridgeExtension$8
            r3.<init>(r1)
            r2.cancelListener = r3
            java.lang.Class<com.alibaba.griver.api.ui.dialog.GriverPromptExtension> r1 = com.alibaba.griver.api.ui.dialog.GriverPromptExtension.class
            java.lang.Object r1 = com.alibaba.ariver.kernel.common.RVProxy.get(r1)
            com.alibaba.griver.api.ui.dialog.GriverPromptExtension r1 = (com.alibaba.griver.api.ui.dialog.GriverPromptExtension) r1
            com.alibaba.ariver.app.api.PageContext r3 = r11.getPageContext()
            android.app.Activity r3 = r3.getActivity()
            android.app.Dialog r1 = r1.createDialog(r3, r2)
            if (r1 == 0) goto L_0x00bb
            r1.show()
            java.lang.Class<com.alibaba.griver.api.ui.dialog.GriverPromptExtension> r3 = com.alibaba.griver.api.ui.dialog.GriverPromptExtension.class
            java.lang.Object r3 = com.alibaba.ariver.kernel.common.RVProxy.get(r3)
            com.alibaba.griver.api.ui.dialog.GriverPromptExtension r3 = (com.alibaba.griver.api.ui.dialog.GriverPromptExtension) r3
            r3.applyShow(r1, r2)
        L_0x00bb:
            return
        L_0x00bc:
            com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse r2 = com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse.UNKNOWN_ERROR
            r1.sendBridgeResponse(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.jsapi.dialog.DialogBridgeExtension.prompt(com.alibaba.ariver.app.api.Page, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback):void");
    }
}
