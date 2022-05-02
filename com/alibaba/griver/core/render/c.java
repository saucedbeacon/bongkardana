package com.alibaba.griver.core.render;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.RVEngine;
import com.alibaba.ariver.engine.api.bridge.RenderBridge;
import com.alibaba.ariver.engine.api.bridge.model.CreateParams;
import com.alibaba.ariver.engine.api.bridge.model.LoadParams;
import com.alibaba.ariver.engine.api.bridge.model.ScrollChangedCallback;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.resolver.ResultResolver;
import com.alibaba.ariver.kernel.api.node.DataNode;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.permission.api.proxy.AuthenticationProxy;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.appinfo.AppType;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.base.api.APWebView;
import com.alibaba.griver.base.api.H5ScrollChangedCallback;
import com.alibaba.griver.base.api.NXH5PageAdapter;
import com.alibaba.griver.base.api.ShouldLoadUrlPoint;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.base.common.utils.AppTypeUtils;
import com.alibaba.griver.base.common.utils.H5UrlHelper;
import com.alibaba.griver.base.common.webview.GriverWebviewSetting;
import com.alibaba.griver.base.nebula.H5DevConfig;
import com.alibaba.griver.base.nebula.H5Utils;
import com.alibaba.griver.base.nebula.WebViewType;
import com.alibaba.griver.base.resource.utils.ErrorPageUtils;
import com.alibaba.griver.core.GriverParam;
import com.alibaba.griver.core.webview.extension.GriverWebChromeClientExtension;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.HashMap;
import java.util.List;
import java.util.regex.Pattern;

public class c extends a implements NXH5PageAdapter {
    /* access modifiers changed from: private */
    public String e = "Griver:GriverWebRenderImpl";
    private d f;
    private k g;
    private j h;
    private e i;
    private h j;
    private f k;
    private RenderBridge l;
    private CreateParams m;
    private boolean n;

    private void i() {
    }

    public void showErrorView(View view) {
    }

    public c(RVEngine rVEngine, Activity activity, Node node, CreateParams createParams) {
        super(rVEngine, activity, (DataNode) node, createParams);
        boolean z = false;
        this.n = false;
        this.m = createParams;
        if (node instanceof Page) {
            Bundle bundle = createParams.startParams;
            String a2 = a(bundle);
            Bundle bundle2 = new Bundle();
            bundle2.putString("bizType", a2);
            APWebView a3 = l.a().a(a2, activity, bundle, true);
            this.h = new j((Page) node, true);
            f fVar = new f(activity, this.f9074a, bundle2, a3, this.h);
            this.k = fVar;
            this.j = new h(this, fVar, this.h);
            this.l = new b(node, a3);
            String str = this.e;
            StringBuilder sb = new StringBuilder("apWebView == ");
            sb.append(a3 == null);
            RVLogger.d(str, sb.toString());
            if (((GriverEnv.isDebuggable() ? H5DevConfig.getBooleanConfig(H5DevConfig.H5_FORCE_V8WORKER, false) : z) || (this.k.getType() == WebViewType.SYSTEM_BUILD_IN && bundle.getBoolean(RVParams.isTinyApp) && !SummaryActivity.CHECKED.equalsIgnoreCase(bundle.getString("enablePolyfillWorker")))) && H5Utils.isWebWorkerSupported()) {
                bundle.putString("enablePolyfillWorker", SummaryActivity.CHECKED);
                RVLogger.d(this.e, "degradeToSystemWebView...switch is supported");
            }
            RVLogger.d(this.e, "GriverWebRenderImpl constructed ");
            this.i = new e(this.f9074a, this.k);
            g gVar = new g(this);
            gVar.setBackBehavior(BundleUtils.getString(getStartParams(), "backBehavior"));
            setBackPerform(gVar);
            a(createParams, a3);
            if (!"no".equalsIgnoreCase(GriverConfig.getConfig(GriverConfigConstants.KEY_USE_CUSTOM_CHROME_CLIENT, "YES"))) {
                this.g = ((GriverWebChromeClientExtension) RVProxy.get(GriverWebChromeClientExtension.class)).createWebChromeClient(this.f9074a, this, this.i, true);
            }
            if (this.g == null) {
                this.g = new k(this.f9074a, this, this.i, true);
            }
            d dVar = new d(this.f9074a);
            this.f = dVar;
            this.j.a(new i(dVar));
            a(this.j);
            this.k.setWebChromeClient(this.g);
            this.k.setWebViewClient(this.f);
            return;
        }
        RVLogger.e("Griver:GriverWebRenderImpl", "GriverWebRenderImpl construct params  node is not a H5Page");
        throw new IllegalArgumentException("node must is  H5Page Node");
    }

    public synchronized String getUserAgent() {
        return this.k.getSettings().getUserAgentString();
    }

    private void a(CreateParams createParams, APWebView aPWebView) {
        boolean equalsIgnoreCase = SummaryActivity.CHECKED.equalsIgnoreCase(BundleUtils.getString(createParams.startParams, "enablePolyfillWorker", "false"));
        if (aPWebView.getType() == WebViewType.SYSTEM_BUILD_IN && !equalsIgnoreCase) {
            sendEvent("showUCFailDialog", (JSONObject) null);
        }
    }

    private String a(Bundle bundle) {
        String string = BundleUtils.getString(bundle, "bizType", "");
        if (TextUtils.isEmpty(string)) {
            string = BundleUtils.getString(bundle, GriverParam.PUBLIC_ID, "");
        }
        return TextUtils.isEmpty(string) ? BundleUtils.getString(bundle, "appId") : string;
    }

    public void load(final LoadParams loadParams) {
        super.load(loadParams);
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                c.this.a(loadParams);
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(LoadParams loadParams) {
        boolean z;
        String str = this.e;
        StringBuilder sb = new StringBuilder("nxh5webview start load url,url=");
        sb.append(loadParams.url);
        RVLogger.d(str, sb.toString());
        H5Utils.handleTinyAppKeyEvent("main", "H5PageImpl.loadUrl()");
        JSONObject a2 = a(loadParams.url);
        App app = (App) getPage().bubbleFindNode(App.class);
        AppModel appModel = (AppModel) app.getData(AppModel.class);
        if (appModel == null || appModel.getAppInfoModel() == null || !loadParams.url.startsWith(appModel.getAppInfoModel().getVhost())) {
            z = false;
        } else {
            RVLogger.d(this.e, "nxh5webview loadUrl from onlineHost direct load!");
            z = true;
        }
        boolean z2 = BundleUtils.getBoolean(app.getStartParams(), RVParams.isTinyApp, false);
        if ((loadParams.forceLoad || z) && z2) {
            a(loadParams.url, a2.getString("Referer"), this.m.startParams);
        } else if (((AuthenticationProxy) RVProxy.get(AuthenticationProxy.class)).interceptSchemeForTiny(loadParams.url, (Page) getPage()) != ApiPermissionCheckResult.IGNORE) {
            a((int) ErrorPageUtils.WEB_VIEW_SCHEME_ERROR, a2, loadParams.url);
            String str2 = this.e;
            StringBuilder sb2 = new StringBuilder("interceptSchemeForTiny =");
            sb2.append(loadParams.url);
            RVLogger.d(str2, sb2.toString());
        } else if (ExtensionPoint.as(ShouldLoadUrlPoint.class).node(getPage()).defaultValue(Boolean.TRUE).resolve(new ResultResolver<Boolean>() {
            /* renamed from: a */
            public Boolean resolve(List<Boolean> list) {
                if (list == null || list.isEmpty()) {
                    return Boolean.TRUE;
                }
                int i = 0;
                while (i < list.size()) {
                    Boolean bool = list.get(i);
                    if (bool == null || bool.booleanValue()) {
                        i++;
                    } else {
                        String a2 = c.this.e;
                        StringBuilder sb = new StringBuilder("shouldLoad false in index ");
                        sb.append(i);
                        sb.append(" !!!");
                        RVLogger.w(a2, sb.toString());
                        return Boolean.FALSE;
                    }
                }
                return Boolean.TRUE;
            }
        }).create().shouldLoad(a2, loadParams.url)) {
            if (AppTypeUtils.isEmbedPage(this.b)) {
                String str3 = loadParams.url;
                try {
                    Uri parse = Uri.parse(str3);
                    if (parse == null || TextUtils.isEmpty(str3) || !str3.startsWith("http")) {
                        a((int) ErrorPageUtils.WEB_VIEW_SCHEME_ERROR, a2, str3);
                        return;
                    } else if (!str3.startsWith("https")) {
                        if (!e()) {
                            a((int) ErrorPageUtils.WEB_VIEW_HTTP_FORBIDDEN, a2, str3);
                            return;
                        }
                        JSONArray g2 = g();
                        if (g2 != null && !g2.isEmpty() && !g2.contains(parse.getHost())) {
                            String str4 = this.e;
                            StringBuilder sb3 = new StringBuilder("the url: ");
                            sb3.append(str3);
                            sb3.append(" in web-view is not in whitelist, do not load");
                            GriverLogger.d(str4, sb3.toString());
                            a((int) ErrorPageUtils.WEB_VIEW_HTTP_FORBIDDEN, a2, str3);
                            return;
                        }
                    }
                } catch (Exception e2) {
                    GriverLogger.e(this.e, "parse uri failed for ".concat(String.valueOf(str3)), e2);
                    a((int) ErrorPageUtils.WEB_VIEW_SCHEME_ERROR, a2, str3);
                    return;
                }
            }
            a(JSONUtils.getString(a2, "url"), a2.getString("Referer"), this.m.startParams);
        }
    }

    private void a(int i2, JSONObject jSONObject, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format(ErrorPageUtils.getErrorStatusPageUrl(), new Object[]{getAppId(), Integer.valueOf(i2), ErrorPageUtils.ERROR_TYPE_MINI}));
        sb.append("&url=");
        sb.append(H5UrlHelper.encode(str));
        a(sb.toString(), jSONObject.getString("Referer"), this.m.startParams);
    }

    private boolean e() {
        return JSONUtils.getBoolean(f(), "enable", false);
    }

    private JSONObject f() {
        return JSONUtils.parseObject(GriverConfig.getConfig(GriverConfigConstants.KEY_EMBEDED_WEBVIEW_HTTP_CONTROL, "{\"enable\":false,\"whitelist\":[]}"));
    }

    private JSONArray g() {
        return f().getJSONArray("whitelist");
    }

    public View getView() {
        return this.k.getView();
    }

    public boolean b() {
        return this.g.a();
    }

    public void a(int i2) {
        getBackPerform().updatePageStatus(i2);
    }

    public void setTextSize(int i2) {
        f fVar = this.k;
        if (fVar == null) {
            RVLogger.d(this.e, "setTextSize webview is null");
        } else if (i2 != -1) {
            fVar.a(i2);
        }
    }

    public void reload() {
        f fVar = this.k;
        if (fVar != null) {
            fVar.reload();
        }
    }

    private JSONObject a(String str) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("url", (Object) str);
        jSONObject.put("requestPreAuth", (Object) Boolean.valueOf(BundleUtils.getBoolean(this.m.startParams, "requestPreAuth", false)));
        if (this.m.startParams.containsKey("Referer")) {
            jSONObject.put("Referer", (Object) BundleUtils.getString(this.m.startParams, "Referer"));
        }
        jSONObject.put(GriverParam.PUBLIC_ID, (Object) BundleUtils.getString(this.m.startParams, GriverParam.PUBLIC_ID, ""));
        f fVar = this.k;
        if (fVar != null && TextUtils.isEmpty(fVar.getUrl())) {
            jSONObject.put("appId", (Object) BundleUtils.getString(this.m.startParams, "appId"));
            String string = BundleUtils.getString(this.m.startParams, RVParams.LONG_PRESSO_LOGIN);
            String string2 = BundleUtils.getString(this.m.startParams, RVParams.LONG_PRESSO_LOGIN_BINDINGPAGE);
            String string3 = BundleUtils.getString(this.m.startParams, RVParams.LONG_PRESSO_LOGIN_URL);
            jSONObject.put(RVParams.PRESSO_LOGIN, (Object) string);
            jSONObject.put(RVParams.PRESSO_LOGIN_BINDINGPAGE, (Object) string2);
            jSONObject.put(RVParams.PRESSO_LOGIN_URL, (Object) string3);
            jSONObject.put(RVParams.START_URL, (Object) Boolean.TRUE);
        }
        return jSONObject;
    }

    public void a(String str, String str2, Bundle bundle) {
        if (TextUtils.isEmpty(str)) {
            RVLogger.d(this.e, "internal load url null");
        } else if (this.k == null) {
            RVLogger.d(this.e, "internal load h5WebView null");
        } else {
            RVLogger.d(this.e, "internal load url,url=".concat(String.valueOf(str)));
            if (TextUtils.equals(BundleUtils.getString(bundle, "openUrlMethod"), "POST")) {
                String string = BundleUtils.getString(bundle, "openUrlPostParams");
                if (bundle != null) {
                    bundle.putString("openUrlMethod", "GET");
                    bundle.putString("openUrlPostParams", "");
                }
                RVLogger.d(this.e, "postUrl   url=".concat(String.valueOf(str)));
                this.k.postUrl(str, string.getBytes());
            } else if (!TextUtils.isEmpty(str2)) {
                HashMap hashMap = new HashMap();
                hashMap.put("Referer", str2);
                this.k.loadUrl(str, hashMap);
            } else {
                this.k.loadUrl(str);
            }
        }
    }

    public int getPageId() {
        if (this.f9074a == null) {
            return -1;
        }
        return this.f9074a.getPageId();
    }

    public void onDestroy() {
        RVLogger.d(this.e, "destroy nx view");
        f fVar = this.k;
        if (fVar != null) {
            fVar.c();
            this.k = null;
        }
        this.j = null;
        if (this.f != null) {
            this.f = null;
        }
        k kVar = this.g;
        if (kVar != null) {
            kVar.b();
            this.g = null;
        }
        this.h = null;
        this.i = null;
        this.f9074a = null;
    }

    public void onResume() {
        super.onResume();
        if (this.k != null && Build.VERSION.SDK_INT >= 11) {
            try {
                this.k.onResume();
            } catch (Exception e2) {
                RVLogger.e(this.e, "webview on resume exception", e2);
            }
        }
    }

    public void onPause() {
        super.onPause();
        if (this.k != null && Build.VERSION.SDK_INT >= 11) {
            try {
                this.k.onPause();
            } catch (Exception e2) {
                RVLogger.e(this.e, "webview on pause exception", e2);
            }
        }
    }

    public void setScrollChangedCallback(final ScrollChangedCallback scrollChangedCallback) {
        this.k.setOnScrollChangedCallback(new H5ScrollChangedCallback() {
            public void onScroll(int i, int i2) {
                scrollChangedCallback.onScroll(i, i2);
            }
        });
    }

    public void init() {
        RVLogger.d(this.e, "start init nxh5webview ");
        boolean b = b(this.m.startParams);
        RVLogger.d(this.e, "allow webview access from file URL ".concat(String.valueOf(b)));
        this.k.a(b);
        h();
        i();
        a(getActivity(), this.k);
    }

    private void h() {
        String userAgentString = this.k.getSettings().getUserAgentString();
        StringBuilder sb = new StringBuilder();
        sb.append(userAgentString);
        sb.append(" Language/en ");
        sb.append(EngineUtils.getUserAgentSuffix());
        sb.append(GriverWebviewSetting.getUserAgent());
        String obj = sb.toString();
        if (AppType.parse(this.f9074a.getApp().getAppType()).isTiny() && !Pattern.compile(".*[\\\\]'.*").matcher(obj).matches()) {
            obj = obj.replace("'", "\\'");
        }
        if (AppTypeUtils.isEmbedPage(this.b) || AppInfoUtils.isEmbeddedApp(this.b)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(obj);
            sb2.append(" MiniProgram");
            obj = sb2.toString();
        }
        GriverLogger.d(this.e, "set final user agent: ".concat(String.valueOf(obj)));
        this.k.getSettings().setUserAgentString(obj);
    }

    public void triggerSaveSnapshot() {
        super.triggerSaveSnapshot();
        if (BundleUtils.getBoolean(getStartParams(), RVParams.isTinyApp, false) && !AppTypeUtils.isEmbedPage(this.b)) {
            String str = this.e;
            StringBuilder sb = new StringBuilder("handleSnapshotEvent webView.loadUrl(), call saveSnapshot jsapi, appId: ");
            sb.append(getAppId());
            RVLogger.d(str, sb.toString());
            f fVar = this.k;
            if (fVar != null) {
                StringBuilder sb2 = new StringBuilder("javascript: AlipayJSBridge.call('saveSnapshot', {snapshot: document.documentElement.outerHTML.replace(");
                sb2.append("/<script src=\\\"https:\\/\\/appx\\/af-appx.min.js#nebula-addcors\\\" crossorigin=\\\"\\\"><\\/script>\\n/g");
                sb2.append(", '')});");
                fVar.loadUrl(sb2.toString());
                return;
            }
            RVLogger.e(this.e, "triggerSaveSnapshot webview is null!");
        }
    }

    private void a(Activity activity, f fVar) {
        final GestureDetector gestureDetector = new GestureDetector(activity, new GestureDetector.SimpleOnGestureListener() {
            public boolean onDown(MotionEvent motionEvent) {
                return false;
            }
        });
        fVar.getView().setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint({"ClickableViewAccessibility"})
            public boolean onTouch(View view, MotionEvent motionEvent) {
                gestureDetector.onTouchEvent(motionEvent);
                return false;
            }
        });
    }

    public int getScrollY() {
        f fVar = this.k;
        if (fVar != null) {
            return fVar.getScrollY();
        }
        RVLogger.d(this.e, "getScrollY web view  is null");
        return 0;
    }

    public f a() {
        return this.k;
    }

    private boolean b(Bundle bundle) {
        Uri parseUrl = H5UrlHelper.parseUrl(BundleUtils.getString(bundle, "url"));
        if (parseUrl == null || !"file".equals(parseUrl.getScheme())) {
            return false;
        }
        String path = parseUrl.getPath();
        RVLogger.d(this.e, "uri path : ".concat(String.valueOf(path)));
        if (TextUtils.isEmpty(path) || path.contains("..") || path.contains("\\") || path.contains("%")) {
            return false;
        }
        if (path.startsWith("/android_asset") || path.startsWith("/android_res")) {
        }
        return true;
    }

    public void sendEvent(String str, JSONObject jSONObject) {
        if (a(str, jSONObject)) {
            RVLogger.d(this.e, "sendEvent handled by event point!");
        }
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        f fVar = this.k;
        if (fVar == null) {
            RVLogger.d(this.e, "loadDataWithBaseURL web view  is null");
        } else {
            fVar.loadDataWithBaseURL(str, str2, str3, str4, str5);
        }
    }

    public boolean scriptbizLoadedAndBridgeLoaded() {
        e eVar = this.i;
        return eVar != null && eVar.f10327a && this.i.b;
    }

    public k c() {
        return this.g;
    }

    public Bitmap getCapture(int i2) {
        if (this.k == null) {
            return null;
        }
        if (i2 == 1) {
            RVLogger.d(this.e, "getCapture CAPTURE_RANGE_DOCUMENT");
            try {
                Picture capturePicture = this.k.capturePicture();
                if (capturePicture == null) {
                    return null;
                }
                Bitmap createBitmap = Bitmap.createBitmap(capturePicture.getWidth(), capturePicture.getHeight(), Bitmap.Config.ARGB_8888);
                capturePicture.draw(new Canvas(createBitmap));
                return createBitmap;
            } catch (Throwable th) {
                RVLogger.e(this.e, "getCapture CAPTURE_RANGE_DOCUMENT exception!", th);
            }
        }
        RVLogger.d(this.e, "getCapture CAPTURE_RANGE_VIEWPORT");
        try {
            View view = this.k.getView();
            view.setDrawingCacheEnabled(true);
            Bitmap copy = view.getDrawingCache().copy(view.getDrawingCache().getConfig(), false);
            view.setDrawingCacheEnabled(false);
            return copy;
        } catch (Throwable th2) {
            RVLogger.e(this.e, "getCapture CAPTURE_RANGE_VIEWPORT exception!", th2);
            return null;
        }
    }

    public RenderBridge getRenderBridge() {
        return this.l;
    }

    public e d() {
        return this.i;
    }
}
