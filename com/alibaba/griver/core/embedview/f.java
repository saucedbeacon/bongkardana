package com.alibaba.griver.core.embedview;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.alibaba.ariver.app.PageNode;
import com.alibaba.ariver.app.api.EmbedType;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ui.PageContainer;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.model.LoadParams;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.integration.embedview.BaseEmbedView;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVEvents;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.StringUtils;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.api.INebulaPage;
import com.alibaba.griver.base.common.constants.GriverBaseConstants;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.core.GriverParam;
import com.alibaba.griver.core.ui.GriverPage;
import java.util.Map;
import o.restorePresenterStates;

public class f extends BaseEmbedView {

    /* renamed from: a  reason: collision with root package name */
    private GriverPage f10295a;
    /* access modifiers changed from: private */
    public View b;
    private Map<String, String> c;
    private FrameLayout d;
    private String e;
    private boolean f = false;
    private String g;
    /* access modifiers changed from: private */
    public boolean h;
    private View.OnLayoutChangeListener i = new View.OnLayoutChangeListener() {
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            StringBuilder sb = new StringBuilder("onLayoutChange! l: ");
            sb.append(i);
            sb.append(", t: ");
            sb.append(i2);
            sb.append(", r: ");
            sb.append(i3);
            sb.append(", b: ");
            sb.append(i4);
            RVLogger.d("Griver:NXEmbedWebView", sb.toString());
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    ViewGroup.LayoutParams layoutParams;
                    if (f.this.h) {
                        try {
                            RVLogger.d("Griver:NXEmbedWebView", "onLayoutChange ,check fill status");
                            Page outerPage = f.this.getOuterPage();
                            if (!(outerPage == null || outerPage.getRender() == null)) {
                                if (outerPage.getRender().getView() != null) {
                                    int width = outerPage.getRender().getView().getWidth();
                                    int height = outerPage.getRender().getView().getHeight();
                                    if ((f.this.b.getWidth() != width || f.this.b.getHeight() != height) && (layoutParams = f.this.b.getLayoutParams()) != null) {
                                        if (layoutParams.width != width || layoutParams.height != height) {
                                            layoutParams.width = width;
                                            layoutParams.height = height;
                                            f.this.b.setLayoutParams(layoutParams);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            RVLogger.e("Griver:NXEmbedWebView", "onLayoutChange ,view is null ");
                        } catch (Exception e) {
                            RVLogger.e("Griver:NXEmbedWebView", "layout adjust error", e);
                        }
                    }
                }
            }, 16);
        }
    };

    public String getType() {
        return "webview";
    }

    public void onDetachedToWebView() {
    }

    public void onEmbedViewVisibilityChanged(int i2) {
    }

    public void onRequestPermissionResult(int i2, String[] strArr, int[] iArr) {
    }

    public View getView(int i2, int i3, String str, String str2, Map<String, String> map) {
        StringBuilder sb = new StringBuilder("get NXEmbedWebView ...width=");
        sb.append(i2);
        sb.append(", height");
        sb.append(i3);
        sb.append(", viewId=");
        sb.append(str);
        sb.append(", type=");
        sb.append(str2);
        sb.append(",param=");
        sb.append(StringUtils.map2String(map));
        RVLogger.d("Griver:NXEmbedWebView", sb.toString());
        if (this.b == null) {
            this.c = map;
            this.e = map != null ? map.get("appId") : null;
            this.f = map != null && Boolean.parseBoolean(map.get("mini"));
            Bundle bundle = new Bundle();
            String string = BundleUtils.getString(this.mOuterPage.getStartParams(), "appId");
            bundle.putString("MINI-PROGRAM-WEB-VIEW-TAG", string);
            bundle.putString(RVStartParams.KEY_FRAGMENT_TYPE, RVStartParams.FRAGMENT_TYPE_SUB_TAB);
            bundle.putString("element", map.get("id"));
            bundle.putString(RVConstants.EXTRA_PARENT_APP_ID, string);
            bundle.putString("parentPackageNick", BundleUtils.getString(this.mOuterPage.getStartParams(), "package_nick"));
            bundle.putString("parentVersion", BundleUtils.getString(this.mOuterPage.getStartParams(), "appVersion"));
            bundle.putString("enablePolyfillWorker", BundleUtils.getString(this.mOuterPage.getStartParams(), "enablePolyfillWorker"));
            bundle.putString(RVStartParams.KEY_IS_REMOTE_DEBUG_MODE, BundleUtils.getString(this.mOuterPage.getStartParams(), RVStartParams.KEY_IS_REMOTE_DEBUG_MODE));
            bundle.putString(AppInfoScene.PARAM_SCENE, BundleUtils.getString(this.mOuterPage.getStartParams(), AppInfoScene.PARAM_SCENE));
            bundle.putString(AppInfoScene.PARAM_SOURCE, BundleUtils.getString(this.mOuterPage.getStartParams(), AppInfoScene.PARAM_SOURCE));
            bundle.putBoolean(GriverParam.IGNORE_EMBED_WEBVIEW_DOMAIN_VERIFY, BundleUtils.getBoolean(this.mOuterPage.getStartParams(), GriverParam.IGNORE_EMBED_WEBVIEW_DOMAIN_VERIFY, false));
            Bundle bundle2 = new Bundle();
            bundle2.putString(RVConstants.EXTRA_EMBED_VIEW_ID, this.mViewId);
            bundle2.putString("viewId", str);
            if (this.f) {
                bundle.putString("MINI-PROGRAM-MINI-WEB-VIEW-TAG", string);
            }
            this.f10295a = new GriverPage(this.mOuterApp, "", bundle, bundle2, this.f ? EmbedType.MINI : EmbedType.FULL);
            if (this.mOuterPage != null && (this.mOuterPage instanceof PageNode)) {
                ((PageNode) this.mOuterPage).setEmbedPage(this.f10295a);
            }
            this.f10295a.bindContext(new g(this.mOuterApp, this.mOuterPage));
            this.f10295a.setHandler(new INebulaPage.H5PageHandler() {
                public boolean shouldExit() {
                    return false;
                }
            });
            if (!this.f) {
                b();
            }
            this.f10295a.setExtra("MINI-PROGRAM-WEB-VIEW-PAGE-TAG", this.mOuterPage);
            if (this.mOuterPage != null && (this.mOuterPage instanceof GriverPage)) {
                ((GriverPage) this.mOuterPage).setExtra("MINI-PROGRAM-WEB-VIEW-PAGE-TAG", this.f10295a);
            }
            this.b = this.f10295a.getRender().getView();
            StringBuilder sb2 = new StringBuilder("new  embedWebView ");
            sb2.append(this.b);
            RVLogger.d("Griver:NXEmbedWebView", sb2.toString());
            if (this.f) {
                this.d.addView(this.b);
                this.b = this.d;
            }
        } else {
            StringBuilder sb3 = new StringBuilder("reuse  embedWebView ");
            sb3.append(this.b);
            RVLogger.d("Griver:NXEmbedWebView", sb3.toString());
        }
        return this.b;
    }

    public void onReceivedMessage(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        if (!"postMessage".equals(str)) {
            RVLogger.d("Griver:NXEmbedWebView", "onReceivedMessage...need not process actionType=".concat(String.valueOf(str)));
        } else if (this.f10295a == null) {
            RVLogger.d("Griver:NXEmbedWebView", "onReceivedMessage...mEmbedPage is null");
        } else if (jSONObject == null) {
            RVLogger.d("Griver:NXEmbedWebView", "onReceivedMessage...actionType=".concat(String.valueOf(str)));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("error", (Object) 2);
            jSONObject2.put("errorMessage", (Object) "data is null");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("data", (Object) jSONObject2);
            EngineUtils.sendToRender(this.f10295a.getRender(), RVEvents.ON_TO_WEBVIEW_MESSAGE, jSONObject3, (SendToRenderCallback) null);
        } else {
            JSONObject jSONObject4 = new JSONObject();
            int i2 = JSONUtils.getInt(jSONObject, "callback");
            JSONObject jSONObject5 = JSONUtils.getJSONObject(jSONObject, "res", (JSONObject) null);
            JSONObject jSONObject6 = new JSONObject();
            jSONObject6.put("callback", (Object) Integer.valueOf(i2));
            jSONObject6.put("res", (Object) jSONObject5);
            jSONObject4.put("data", (Object) jSONObject6);
            EngineUtils.sendToRender(this.f10295a.getRender(), RVEvents.ON_TO_WEBVIEW_MESSAGE, jSONObject4, (SendToRenderCallback) null);
        }
    }

    public void onReceivedRender(JSONObject jSONObject, BridgeCallback bridgeCallback) {
        RVLogger.d("Griver:NXEmbedWebView", "onReceivedRender ".concat(String.valueOf(jSONObject)));
        if (this.f10295a == null) {
            RVLogger.d("Griver:NXEmbedWebView", "onReceivedRender..webview mEmbedPage is null");
        } else if (jSONObject == null) {
            RVLogger.d("Griver:NXEmbedWebView", "onReceivedRender..params is null");
        } else {
            String string = JSONUtils.getString(jSONObject, "src");
            RVLogger.d("Griver:NXEmbedWebView", "onReceivedRender...url=".concat(String.valueOf(string)));
            if (TextUtils.equals(GriverBaseConstants.GRIVER_EMBEDDED_MOCK_URL, string) && this.f10295a.getApp() != null) {
                AppModel appModel = (AppModel) this.f10295a.getApp().getData(AppModel.class);
                if (this.f10295a.getApp().getStartParams() != null) {
                    String string2 = this.f10295a.getApp().getStartParams().getString("query");
                    if (!TextUtils.isEmpty(string2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(AppInfoUtils.getEmbeddedAppMainUrl(appModel));
                        sb.append("?");
                        sb.append(string2);
                        string = sb.toString();
                        RVLogger.d("Griver:NXEmbedWebView", "onReceivedRender real url=".concat(String.valueOf(string)));
                    }
                }
                string = AppInfoUtils.getEmbeddedAppMainUrl(appModel);
                RVLogger.d("Griver:NXEmbedWebView", "onReceivedRender real url=".concat(String.valueOf(string)));
            }
            if (this.f) {
                b(string);
            } else {
                a(string);
            }
        }
    }

    public void triggerPreSnapshot() {
        RVLogger.d("Griver:NXEmbedWebView", "triggerPreSnapshot...");
        restorePresenterStates length = restorePresenterStates.length(this.mOuterApp.getAppContext().getContext());
        Intent intent = new Intent();
        intent.setAction("embedview.snapshot.complete");
        length.setMin(intent);
    }

    public void onWebViewResume() {
        RVLogger.e("Griver:NXEmbedWebView", "onWebViewResume ");
        if (this.f10295a == null) {
            RVLogger.e("Griver:NXEmbedWebView", "onWebViewResume mEmbedPage is null");
        } else if (this.mOuterApp == null || !(this.mOuterApp instanceof GriverPage)) {
            RVLogger.e("Griver:NXEmbedWebView", "onWebViewResume mOuterApp is null or not instanceof NebulaApp");
        } else {
            JSONObject jSONObject = new JSONObject();
            GriverPage griverPage = (GriverPage) this.mOuterApp;
            if (griverPage.getData() != null) {
                String str = griverPage.getData().get(GriverParam.H5_SESSION_POP_PARAM);
                String str2 = griverPage.getData().get(GriverParam.H5_SESSION_RESUME_PARAM);
                if (!TextUtils.isEmpty(str)) {
                    JSONObject parseObject = JSONUtils.parseObject(str);
                    if (parseObject != null) {
                        jSONObject.put("data", (Object) parseObject);
                    } else {
                        JSONArray parseArray = JSONUtils.parseArray(str);
                        if (parseArray != null) {
                            jSONObject.put("data", (Object) parseArray);
                        } else {
                            jSONObject.put("data", (Object) str);
                        }
                    }
                }
                if (!TextUtils.isEmpty(str2)) {
                    jSONObject.put("resumeParams", (Object) JSONUtils.parseObject(str2));
                }
            }
            EngineUtils.sendToRender(this.f10295a.getRender(), RVEvents.RESUME, jSONObject, (SendToRenderCallback) null);
        }
    }

    public void onWebViewPause() {
        RVLogger.d("Griver:NXEmbedWebView", "onWebViewPause");
    }

    public void onAttachedToWebView() {
        RVLogger.d("Griver:NXEmbedWebView", "onAttachedToWebView");
        try {
            a(this.c);
        } catch (Throwable th) {
            RVLogger.e("Griver:NXEmbedWebView", "onAttachedToWebView ", th);
        }
    }

    public Bitmap getSnapshot() {
        return a(this.b);
    }

    public void onDestroy() {
        super.onDestroy();
        GriverPage griverPage = this.f10295a;
        if (griverPage != null) {
            griverPage.setHandler((INebulaPage.H5PageHandler) null);
            this.f10295a.exit(false);
        }
        this.b = null;
        this.f10295a = null;
    }

    private void a(String str) {
        if (TextUtils.isEmpty(this.e) && !TextUtils.isEmpty(str)) {
            LoadParams loadParams = new LoadParams();
            loadParams.url = str;
            this.f10295a.getRender().load(loadParams);
        }
    }

    private void b(String str) {
        if (TextUtils.isEmpty(this.e) && !TextUtils.isEmpty(str) && !str.equalsIgnoreCase(this.g)) {
            LoadParams loadParams = new LoadParams();
            loadParams.url = str;
            this.f10295a.getRender().load(loadParams);
            this.g = str;
        }
        try {
            this.b.setScrollContainer(false);
            this.b.setHorizontalScrollBarEnabled(false);
            this.b.setVerticalScrollBarEnabled(false);
        } catch (Throwable th) {
            RVLogger.e("Griver:NXEmbedWebView", "set mini web-view no scroll ", th);
        }
    }

    private void a(Map<String, String> map) {
        View view;
        boolean z;
        boolean z2;
        String[] split;
        if (map == null || !a()) {
            RVLogger.d("Griver:NXEmbedWebView", "don't check WebViewFill");
            return;
        }
        String str = map.get(TtmlNode.TAG_STYLE);
        RVLogger.d("Griver:NXEmbedWebView", "style: ".concat(String.valueOf(str)));
        boolean z3 = true;
        if (!TextUtils.isEmpty(str)) {
            String[] split2 = str.split(";");
            if (split2 != null && split2.length > 0) {
                z2 = false;
                z = false;
                for (String str2 : split2) {
                    if (z2 && z) {
                        break;
                    }
                    String trim = str2.trim();
                    if (trim.startsWith("width:")) {
                        String[] split3 = trim.split(":");
                        if (split3 != null && split3.length == 2) {
                            z2 = TextUtils.equals(split3[1].trim(), "100%");
                        }
                    } else if (trim.startsWith("height:") && (split = trim.split(":")) != null && split.length == 2) {
                        z = TextUtils.equals(split[1].trim(), "100%");
                    }
                }
            } else {
                z2 = false;
                z = false;
            }
            boolean z4 = z2 && z;
            this.h = z4;
            if (z4 && this.mOuterPage != null && (this.mOuterPage instanceof GriverPage)) {
                ((GriverPage) this.mOuterPage).setExtra("MINI-PROGRAM-WEB-VIEW-FILL", "yes");
            }
        }
        StringBuilder sb = new StringBuilder("prepareCheckWebViewFill ");
        sb.append(this.h);
        sb.append(", mRealView != null? ");
        if (this.b == null) {
            z3 = false;
        }
        sb.append(z3);
        RVLogger.d("Griver:NXEmbedWebView", sb.toString());
        if (this.h && (view = this.b) != null) {
            view.removeOnLayoutChangeListener(this.i);
            this.b.addOnLayoutChangeListener(this.i);
        }
    }

    private boolean a() {
        return "1".equals(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig("ta_webview_fill_check", ""));
    }

    private Bitmap a(View view) {
        if (view == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        view.layout(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        Drawable background = view.getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        view.draw(canvas);
        return createBitmap;
    }

    private void b() {
        a(this.mOuterPage);
    }

    private PageContainer a(Page page) {
        return page.getPageContext().getPageContainer();
    }
}
