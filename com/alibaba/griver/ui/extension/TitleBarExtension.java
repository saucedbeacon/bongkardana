package com.alibaba.griver.ui.extension;

import com.alibaba.ariver.app.api.EmbedType;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.PageContext;
import com.alibaba.ariver.app.api.point.view.TitleBarOptionClickPoint;
import com.alibaba.ariver.app.api.point.view.TitleBarSegCheckPoint;
import com.alibaba.ariver.app.api.point.view.TitleBarShowClosePoint;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.h5.point.GriverOptionMenuClickPoint;
import com.alibaba.griver.api.ui.optionmenu.GriverOptionMenuEvent;
import com.alibaba.griver.api.ui.optionmenu.ToolbarMenu;
import com.alibaba.griver.api.ui.optionmenu.ToolbarMenuClickListener;
import com.alibaba.griver.base.api.ReceivedTitlePoint;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.ui.titlebar.GriverTitleBar;
import java.lang.ref.WeakReference;

public class TitleBarExtension implements TitleBarOptionClickPoint, TitleBarSegCheckPoint, TitleBarShowClosePoint, NodeAware<Page>, ReceivedTitlePoint {

    /* renamed from: a  reason: collision with root package name */
    private String f10579a;
    private WeakReference<Page> b;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    /* access modifiers changed from: private */
    public GriverTitleBar a() {
        PageContext pageContext;
        WeakReference<Page> weakReference = this.b;
        if (weakReference == null || weakReference.get() == null || (pageContext = this.b.get().getPageContext()) == null) {
            return null;
        }
        return (GriverTitleBar) pageContext.getTitleBar();
    }

    public void setNode(WeakReference<Page> weakReference) {
        this.b = weakReference;
        if (weakReference.get() != null && this.b.get().getApp() != null) {
            this.f10579a = this.b.get().getApp().getAppType();
        }
    }

    public Class<Page> getNodeType() {
        return Page.class;
    }

    public void onOptionClick(int i, boolean z) {
        WeakReference<Page> weakReference = this.b;
        if (weakReference != null && weakReference.get() != null) {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("index", (Object) Integer.valueOf(i));
            jSONObject2.put("fromMenu", (Object) Boolean.valueOf(z));
            jSONObject.put("data", (Object) jSONObject2);
            final Page page = this.b.get();
            EngineUtils.sendToRender(page.getRender(), "optionMenu", jSONObject, (SendToRenderCallback) null);
            boolean z2 = BundleUtils.getBoolean(page.getStartParams(), RVParams.isH5App, false);
            GriverOptionMenuEvent create = ExtensionPoint.as(GriverOptionMenuEvent.class).node(page).create();
            create.optionMenuClicked(page.getOriginalURI(), page.getApp().getAppId(), i);
            if (!z) {
                return;
            }
            if (!z2 || !create.interceptH5OptionMenuClick(page.getPageContext().getActivity(), page.getOriginalURI(), new ToolbarMenuClickListener() {
                public void onClick(ToolbarMenu toolbarMenu) {
                    if (toolbarMenu != null) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("name", (Object) toolbarMenu.getName());
                        jSONObject.put("tag", (Object) toolbarMenu.getTag());
                        jSONObject.put("title", (Object) toolbarMenu.getName());
                        ExtensionPoint.as(GriverOptionMenuClickPoint.class).node(page).create().menuClick(jSONObject);
                    }
                }
            })) {
                ((GriverTitleBar) this.b.get().getPageContext().getTitleBar()).onOptionMenuClick();
            } else {
                GriverLogger.d("TitleBarExtension", "option menu click is intercepted");
            }
        }
    }

    public void showClose(boolean z) {
        WeakReference<Page> weakReference = this.b;
        if (weakReference == null || weakReference.get() == null || !this.b.get().isUseForEmbed()) {
            GriverTitleBar a2 = a();
            if (a2 != null && a2.getTitleView() != null) {
                a2.getTitleView().showCloseButton(z);
                return;
            }
            return;
        }
        RVLogger.d("TitleBarExtension", "embed webview not supprt showClose Button");
    }

    public void onSegItemChecked(int i) {
        WeakReference<Page> weakReference = this.b;
        if (weakReference != null && weakReference.get() != null) {
            RVLogger.d("TitleBarExtension", "segmentGroup checked index is :\t".concat(String.valueOf(i)));
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("index", (Object) Integer.valueOf(i));
            jSONObject.put("data", (Object) jSONObject2);
            EngineUtils.sendToRender(this.b.get().getRender(), "segControlClick", jSONObject, new SegControlCheckCallback());
        }
    }

    public void onReceivedTitle(String str, String str2) {
        WeakReference<Page> weakReference = this.b;
        if (weakReference == null || weakReference.get() == null || EmbedType.MINI != this.b.get().getEmbedType()) {
            WeakReference<Page> weakReference2 = this.b;
            if (weakReference2 == null || weakReference2.get() == null || EmbedType.FULL != this.b.get().getEmbedType()) {
                GriverTitleBar a2 = a();
                if (a2 != null) {
                    a2.onReceivedTitle(str, str2);
                    return;
                }
                return;
            }
            RVLogger.d("TitleBarExtension", "full embed webView onReceivedTitle  force update  title");
            GriverTitleBar a3 = a();
            if (a3 != null && a3.getTitleView() != null) {
                a3.getTitleView().setTitle(str2);
                return;
            }
            return;
        }
        RVLogger.d("TitleBarExtension", "mini embed webView onReceivedTitle don't change title");
    }

    class SegControlCheckCallback implements SendToRenderCallback {
        SegControlCheckCallback() {
        }

        public void onCallBack(JSONObject jSONObject) {
            boolean z = JSONUtils.getBoolean(jSONObject, "prevent", false);
            RVLogger.d("TitleBarExtension", "segControlClick event prevent: ".concat(String.valueOf(z)));
            GriverTitleBar access$000 = TitleBarExtension.this.a();
            if (access$000 != null) {
                access$000.getTitleView().performLastSegItemChecked(z);
            }
        }
    }
}
