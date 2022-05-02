package com.alibaba.griver.core.extensions;

import android.app.Activity;
import android.view.View;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.Render;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.embedview.IEmbedView;
import com.alibaba.ariver.engine.api.embedview.IEmbedViewManager;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.DimensionUtil;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.base.common.config.GriverInnerConfig;
import com.alibaba.griver.base.nebula.WebViewType;
import com.alibaba.griver.core.jsapi.embedview.EmbedViewBridgeExtension;
import com.alibaba.griver.core.render.a;
import com.alibaba.griver.core.render.f;
import com.alibaba.griver.core.webview.AndroidWebView;
import java.util.Collections;

public class GriverEmbedViewBridgeExtension extends EmbedViewBridgeExtension {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f9068a = (!"NO".equalsIgnoreCase(GriverInnerConfig.getConfigWithProcessCache(GriverConfigConstants.KEY_MP_USE_SYSTEM_EMBED_VIEW, "")));

    @ThreadType(ExecutorType.UI)
    @ActionFilter("NBComponent.render")
    public void render(@BindingParam({"element"}) String str, @BindingParam({"props"}) JSONObject jSONObject, @BindingParam({"data"}) JSONObject jSONObject2, @BindingParam({"version"}) String str2, @BindingCallback BridgeCallback bridgeCallback, @BindingNode(Page.class) Page page) {
        if (!this.f9068a) {
            super.render(str, jSONObject, jSONObject2, str2, bridgeCallback, page);
            return;
        }
        Render render = page.getRender();
        if (render instanceof a) {
            f a2 = ((a) render).a();
            if (a2.getType() == WebViewType.SYSTEM_BUILD_IN) {
                RVLogger.d("Griver:GriverEmbedViewBridgeExtension", "NBComponent.render with android webview!");
                AndroidWebView androidWebView = (AndroidWebView) a2.e();
                final Page page2 = page;
                final BridgeCallback bridgeCallback2 = bridgeCallback;
                final String str3 = str;
                final AndroidWebView androidWebView2 = androidWebView;
                final JSONObject jSONObject3 = jSONObject;
                final JSONObject jSONObject4 = jSONObject2;
                final String str4 = str2;
                String str5 = str;
                androidWebView.a(str, new AndroidWebView.EmbedViewRenderCallback() {
                    public void onRender(String str, String str2, int i, int i2, int i3, int i4) {
                        String str3 = str2;
                        int i5 = i;
                        int i6 = i2;
                        int i7 = i3;
                        int i8 = i4;
                        StringBuilder sb = new StringBuilder("onRender ");
                        sb.append(str);
                        sb.append(" ");
                        sb.append(str3);
                        sb.append(" x: ");
                        sb.append(i5);
                        sb.append(", y: ");
                        sb.append(i6);
                        sb.append(", w: ");
                        sb.append(i7);
                        sb.append(", h: ");
                        sb.append(i8);
                        RVLogger.d("Griver:GriverEmbedViewBridgeExtension", sb.toString());
                        if (page2.isExited() || page2.getPageContext() == null) {
                            RVLogger.d("Griver:GriverEmbedViewBridgeExtension", "onRender but exited!");
                            bridgeCallback2.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                            return;
                        }
                        Activity activity = page2.getPageContext().getActivity();
                        int dip2px = DimensionUtil.dip2px(activity, (float) i5);
                        int dip2px2 = DimensionUtil.dip2px(activity, (float) i6);
                        int dip2px3 = DimensionUtil.dip2px(activity, (float) i7);
                        int dip2px4 = DimensionUtil.dip2px(activity, (float) i8);
                        IEmbedViewManager embedViewManager = page2.getPageContext().getEmbedViewManager();
                        if (embedViewManager.findViewById(str3) == null) {
                            RVLogger.d("Griver:GriverEmbedViewBridgeExtension", "render in fist time, createView!");
                            IEmbedView createView = embedViewManager.createView(str3, str3);
                            if (createView == null) {
                                RVLogger.d("Griver:GriverEmbedViewBridgeExtension", "onRender createEmbedView null!");
                                bridgeCallback2.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
                                return;
                            }
                            androidWebView2.a(str, createView.getView(dip2px3, dip2px4, str, str2, Collections.EMPTY_MAP), dip2px3, dip2px4, dip2px2, dip2px);
                        } else {
                            androidWebView2.a(str, (View) null, dip2px3, dip2px4, dip2px2, dip2px);
                        }
                        GriverEmbedViewBridgeExtension.super.render(str3, jSONObject3, jSONObject4, str4, bridgeCallback2, page2);
                    }

                    public void onError(String str) {
                        bridgeCallback2.sendBridgeResponse(BridgeResponse.newError(5, str));
                    }
                });
                return;
            }
        }
        String str6 = str;
        super.render(str, jSONObject, jSONObject2, str2, bridgeCallback, page);
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter("NBComponent.remove")
    public BridgeResponse remove(@BindingParam({"element"}) String str, @BindingParam({"version"}) String str2, @BindingCallback BridgeCallback bridgeCallback, @BindingNode(Page.class) Page page) {
        if (!this.f9068a) {
            return super.remove(str, str2, bridgeCallback, page);
        }
        Render render = page.getRender();
        if (render instanceof a) {
            f a2 = ((a) render).a();
            if (a2.getType() == WebViewType.SYSTEM_BUILD_IN) {
                RVLogger.d("Griver:GriverEmbedViewBridgeExtension", "NBComponent.remove with android webview!");
                ((AndroidWebView) a2.e()).a(str);
                return BridgeResponse.SUCCESS;
            }
        }
        return super.remove(str, str2, bridgeCallback, page);
    }
}
