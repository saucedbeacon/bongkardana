package com.alibaba.griver.core.render;

import android.app.Activity;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.VideoView;
import com.alibaba.ariver.a.a.b;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.dialog.CreateDialogParam;
import com.alibaba.ariver.app.api.point.dialog.DialogPoint;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.bridge.model.RenderCallContext;
import com.alibaba.ariver.engine.api.bridge.model.SendToNativeCallback;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.webview.GriverFullScreenEvent;
import com.alibaba.griver.api.h5.file.GriverChooseFileExtension;
import com.alibaba.griver.api.stauts.PageStatus;
import com.alibaba.griver.api.ui.dialog.GriverDialogExtension;
import com.alibaba.griver.api.webview.GriverGeoLocationExtension;
import com.alibaba.griver.base.api.APJsPromptResult;
import com.alibaba.griver.base.api.APJsResult;
import com.alibaba.griver.base.api.APWebChromeClient;
import com.alibaba.griver.base.api.APWebView;
import com.alibaba.griver.base.api.PageProcessPoint;
import com.alibaba.griver.base.api.ReceivedTitlePoint;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.utils.AppTypeUtils;
import com.alibaba.griver.core.GriverParam;
import com.alibaba.griver.core.R;
import com.alibaba.griver.core.ui.activity.GriverFileChooserActivity;
import com.alibaba.griver.core.ui.view.H5PromptDialog;
import com.iap.ac.android.container.js.ACJSBridge;
import o.restorePresenterStates;

public class k implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, APWebChromeClient {
    private static JSONArray c;

    /* renamed from: a  reason: collision with root package name */
    public String f10341a = "NXWebChromeClient";
    public APWebChromeClient.CustomViewCallback b;
    private Page d;
    /* access modifiers changed from: private */
    public BroadcastReceiver e;
    private boolean f = false;
    private boolean g = true;
    private boolean h = false;
    private Node i;
    /* access modifiers changed from: private */
    public Page j;
    private Dialog k;
    /* access modifiers changed from: private */
    public APJsResult l;
    private Dialog m;
    /* access modifiers changed from: private */
    public APJsResult n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public H5PromptDialog f10342o;
    /* access modifiers changed from: private */
    public APJsPromptResult p;
    /* access modifiers changed from: private */
    public c q;
    private boolean r = true;
    private e s;
    private boolean t;
    private View u;
    private ViewGroup v;
    private FrameLayout w;
    private APWebChromeClient.CustomViewCallback x;

    public Bitmap getDefaultVideoPoster() {
        return null;
    }

    public void getVisitedHistory(ValueCallback<String[]> valueCallback) {
    }

    public void onCloseWindow(APWebView aPWebView) {
    }

    public boolean onCreateWindow(APWebView aPWebView, boolean z, boolean z2, Message message) {
        return false;
    }

    public boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
        return false;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
    }

    public void onRequestFocus(APWebView aPWebView) {
    }

    public k(Page page, c cVar, e eVar, boolean z) {
        this.r = z;
        this.i = page;
        this.j = page;
        this.q = cVar;
        this.s = eVar;
        this.u = page.getPageContext().getActivity().findViewById(R.id.fragment_container);
        this.v = (ViewGroup) page.getPageContext().getActivity().findViewById(R.id.videoLayout);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f10341a);
        sb.append(hashCode());
        this.f10341a = sb.toString();
        if (page != null && BundleUtils.getBoolean(page.getStartParams(), GriverParam.LONG_ISPRERENDER, false)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f10341a);
            sb2.append("_preRender");
            this.f10341a = sb2.toString();
        }
        this.d = page;
        if ("NO".equals(GriverConfig.getConfigWithProcessCache("h5_asyncConsoleMessage", ""))) {
            this.f = false;
        }
        if ("NO".equalsIgnoreCase(GriverConfig.getConfigWithProcessCache("h5_handleUncaughtJsError", ""))) {
            this.g = false;
        }
        if ("1".equalsIgnoreCase(GriverConfig.getConfigWithProcessCache("ta_interceptInternalAPI", ""))) {
            this.h = true;
        }
    }

    public static Activity a(Context context) {
        int i2 = 5;
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (context instanceof ContextWrapper) {
                context = ((ContextWrapper) context).getBaseContext();
            }
            int i3 = i2 - 1;
            if (i2 <= 0) {
                break;
            }
            i2 = i3;
        }
        return null;
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        if (consoleMessage == null || this.i == null) {
            String str = this.f10341a;
            StringBuilder sb = new StringBuilder("onConsoleMessage input illegal: ");
            sb.append(consoleMessage);
            sb.append(", ");
            sb.append(this.i);
            RVLogger.d(str, sb.toString());
            return false;
        }
        String message = consoleMessage.message();
        int lineNumber = consoleMessage.lineNumber();
        String str2 = this.f10341a;
        StringBuilder sb2 = new StringBuilder("onConsoleMessage : ");
        sb2.append(message);
        sb2.append(", ");
        sb2.append(lineNumber);
        RVLogger.d(str2, sb2.toString());
        return a(message);
    }

    private boolean a(String str) {
        Page page;
        if (!TextUtils.isEmpty(str) && (page = this.j) != null && !page.isExited()) {
            RVLogger.d(this.f10341a, str);
            String str2 = this.f10341a;
            StringBuilder sb = new StringBuilder("token == ");
            sb.append(b.a(this.j));
            RVLogger.d(str2, sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b.a(this.j));
            sb2.append(ACJSBridge.JSAPI_PREFIX);
            String obj = sb2.toString();
            if (str.startsWith(obj)) {
                JSONObject parseObject = JSONUtils.parseObject(str.replaceFirst(obj, ""));
                if (parseObject == null || parseObject.isEmpty()) {
                    RVLogger.d(this.f10341a, "msgText json object is empty");
                    return false;
                }
                final String string = JSONUtils.getString(parseObject, "clientId");
                final String string2 = JSONUtils.getString(parseObject, "func");
                JSONObject jSONObject = JSONUtils.getJSONObject(parseObject, "param", (JSONObject) null);
                if (TextUtils.isEmpty(string)) {
                    RVLogger.d(this.f10341a, "clientId IS empty");
                    return false;
                }
                RVLogger.d(this.f10341a, "sendToNative == ".concat(String.valueOf(string2)));
                this.q.getEngine().getBridge().sendToNative(new NativeCallContext.Builder().name(string2).params(jSONObject).node(this.j).id(string).render(this.j.getRender()).build(), new SendToNativeCallback() {
                    public void onCallback(JSONObject jSONObject, boolean z) {
                        String str = k.this.f10341a;
                        StringBuilder sb = new StringBuilder("onCallback == ");
                        sb.append(JSON.toJSONString(jSONObject));
                        RVLogger.d(str, sb.toString());
                        k.this.q.getRenderBridge().sendToRender(RenderCallContext.newBuilder(k.this.j.getRender()).action(string2).eventId(string).type("callback").keep(z).param(jSONObject).build(), (SendToRenderCallback) null);
                    }
                });
                return true;
            }
            if (!str.startsWith("invokeJS msgType") && !str.contains("load AlipayJSBridge")) {
                String str3 = this.f10341a;
                StringBuilder sb3 = new StringBuilder("AppId/");
                sb3.append(this.j.getApp().getAppId());
                sb3.append(",");
                sb3.append(str);
                RVLogger.d(str3, sb3.toString());
            }
            int indexOf = str.indexOf(ACJSBridge.JSAPI_PREFIX);
            if (indexOf >= 0 && str.length() > indexOf) {
                RVLogger.d(this.f10341a, "handleMsgFromJS token invalid! prefixStr = ".concat(String.valueOf(str.substring(0, indexOf))));
            }
        }
        return false;
    }

    public void onProgressChanged(APWebView aPWebView, int i2) {
        if (this.i != null) {
            RVLogger.debug(this.f10341a, "onProgressChanged [progress] ".concat(String.valueOf(i2)));
            RVLogger.d(this.f10341a, "invoke point PageProcessPoint");
            ExtensionPoint.as(PageProcessPoint.class).node(this.i).create().onProgressChanged(aPWebView.getUrl(), i2);
        }
    }

    public void onReceivedTitle(APWebView aPWebView, String str) {
        String str2 = this.f10341a;
        StringBuilder sb = new StringBuilder("onReceivedTitle [title] ");
        sb.append(str);
        sb.append(" ");
        sb.append(aPWebView.getUrl());
        RVLogger.d(str2, sb.toString());
        ExtensionPoint.as(ReceivedTitlePoint.class).node(this.i).create().onReceivedTitle(aPWebView.getUrl(), str);
        this.q.a(PageStatus.FINISHED);
    }

    public void onReceivedIcon(APWebView aPWebView, Bitmap bitmap) {
        if (GriverEnv.isDebuggable()) {
            RVLogger.d(this.f10341a, "onReceivedIcon");
        }
    }

    public void onReceivedTouchIconUrl(APWebView aPWebView, String str, boolean z) {
        if (GriverEnv.isDebuggable()) {
            String str2 = this.f10341a;
            StringBuilder sb = new StringBuilder("onReceivedTouchIconUrl. [url] ");
            sb.append(str);
            sb.append(" [precomposed] ");
            sb.append(z);
            RVLogger.d(str2, sb.toString());
        }
    }

    public boolean onJsBeforeUnload(APWebView aPWebView, String str, String str2, APJsResult aPJsResult) {
        if (!GriverEnv.isDebuggable()) {
            return false;
        }
        String str3 = this.f10341a;
        StringBuilder sb = new StringBuilder("onJsBeforeUnload [url] ");
        sb.append(str);
        sb.append(" [message] ");
        sb.append(str2);
        RVLogger.d(str3, sb.toString());
        return false;
    }

    public void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        RVLogger.d(this.f10341a, "onGeolocationPermissionsShowPrompt ".concat(String.valueOf(str)));
        ((GriverGeoLocationExtension) RVProxy.get(GriverGeoLocationExtension.class)).onGeolocationPermissionsShowPrompt(this.j, str, callback);
    }

    public void onGeolocationPermissionsHidePrompt() {
        ((GriverGeoLocationExtension) RVProxy.get(GriverGeoLocationExtension.class)).onGeolocationPermissionsHidePrompt(this.j);
    }

    public View getVideoLoadingProgressView() {
        RVLogger.debug(this.f10341a, "getVideoLoadingProgressView");
        return null;
    }

    public void openFileChooser(ValueCallback valueCallback, boolean z) {
        Page page = this.d;
        if (page != null && page.getRender().getView() != null) {
            try {
                Activity a2 = a(this.d.getRender().getView().getContext());
                if (a2 != null) {
                    restorePresenterStates length = restorePresenterStates.length(((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getApplicationContext());
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction("FILE_CHOOSER_RESULT");
                    if (this.e != null) {
                        length.setMax(this.e);
                        this.e = null;
                    }
                    final restorePresenterStates restorepresenterstates = length;
                    final Activity activity = a2;
                    final ValueCallback valueCallback2 = valueCallback;
                    final boolean z2 = z;
                    AnonymousClass3 r3 = new BroadcastReceiver() {
                        /* JADX WARNING: type inference failed for: r1v0, types: [android.content.BroadcastReceiver, android.database.Cursor] */
                        /* JADX WARNING: type inference failed for: r11v5, types: [android.net.Uri[]] */
                        /* JADX WARNING: type inference failed for: r1v1, types: [android.database.Cursor] */
                        /* JADX WARNING: type inference failed for: r3v11, types: [android.net.Uri[]] */
                        /* JADX WARNING: type inference failed for: r1v3 */
                        /* JADX WARNING: Multi-variable type inference failed */
                        /* Code decompiled incorrectly, please refer to instructions dump. */
                        public void onReceive(android.content.Context r10, android.content.Intent r11) {
                            /*
                                r9 = this;
                                java.lang.String r10 = ""
                                if (r11 == 0) goto L_0x00c6
                                java.lang.String r0 = r11.getAction()
                                if (r0 == 0) goto L_0x00c6
                                android.os.Bundle r0 = r11.getExtras()
                                if (r0 == 0) goto L_0x00c6
                                o.restorePresenterStates r0 = r5
                                if (r0 != 0) goto L_0x0016
                                goto L_0x00c6
                            L_0x0016:
                                r0.setMax(r9)
                                com.alibaba.griver.core.render.k r0 = com.alibaba.griver.core.render.k.this
                                r1 = 0
                                android.content.BroadcastReceiver unused = r0.e = r1
                                java.lang.String r0 = r11.getAction()
                                com.alibaba.griver.core.render.k r2 = com.alibaba.griver.core.render.k.this
                                java.lang.String r2 = r2.f10341a
                                java.lang.String r3 = java.lang.String.valueOf(r0)
                                java.lang.String r4 = "onReceive action "
                                java.lang.String r3 = r4.concat(r3)
                                com.alibaba.ariver.kernel.common.utils.RVLogger.d(r2, r3)
                                java.lang.String r2 = "FILE_CHOOSER_RESULT"
                                boolean r0 = r2.equals(r0)
                                if (r0 != 0) goto L_0x003d
                                return
                            L_0x003d:
                                r0 = 0
                                r2 = 1
                                android.os.Bundle r11 = r11.getExtras()     // Catch:{ all -> 0x0098 }
                                java.lang.String r3 = "fileUri"
                                java.lang.Object r11 = r11.get(r3)     // Catch:{ all -> 0x0098 }
                                android.net.Uri r11 = (android.net.Uri) r11     // Catch:{ all -> 0x0098 }
                                if (r11 != 0) goto L_0x0051
                                android.net.Uri r11 = android.net.Uri.parse(r10)     // Catch:{ all -> 0x0098 }
                            L_0x0051:
                                android.app.Activity r3 = r6     // Catch:{ all -> 0x0098 }
                                if (r3 == 0) goto L_0x006e
                                android.app.Activity r3 = r6     // Catch:{ all -> 0x0098 }
                                boolean r3 = r3.isFinishing()     // Catch:{ all -> 0x0098 }
                                if (r3 != 0) goto L_0x006e
                                if (r11 == 0) goto L_0x006e
                                android.app.Activity r3 = r6     // Catch:{ all -> 0x0098 }
                                android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x0098 }
                                r5 = 0
                                r6 = 0
                                r7 = 0
                                r8 = 0
                                r4 = r11
                                android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0098 }
                            L_0x006e:
                                com.alibaba.griver.core.render.k r3 = com.alibaba.griver.core.render.k.this     // Catch:{ all -> 0x0098 }
                                java.lang.String r3 = r3.f10341a     // Catch:{ all -> 0x0098 }
                                java.lang.String r4 = "onReceive result "
                                java.lang.String r5 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0098 }
                                java.lang.String r4 = r4.concat(r5)     // Catch:{ all -> 0x0098 }
                                com.alibaba.ariver.kernel.common.utils.RVLogger.d(r3, r4)     // Catch:{ all -> 0x0098 }
                                android.webkit.ValueCallback r3 = r7     // Catch:{ all -> 0x0098 }
                                if (r3 == 0) goto L_0x0092
                                boolean r3 = r8     // Catch:{ all -> 0x0098 }
                                if (r3 != 0) goto L_0x0088
                                goto L_0x008d
                            L_0x0088:
                                android.net.Uri[] r3 = new android.net.Uri[r2]     // Catch:{ all -> 0x0098 }
                                r3[r0] = r11     // Catch:{ all -> 0x0098 }
                                r11 = r3
                            L_0x008d:
                                android.webkit.ValueCallback r3 = r7     // Catch:{ all -> 0x0098 }
                                r3.onReceiveValue(r11)     // Catch:{ all -> 0x0098 }
                            L_0x0092:
                                if (r1 == 0) goto L_0x00be
                                r1.close()
                                return
                            L_0x0098:
                                r11 = move-exception
                                com.alibaba.griver.core.render.k r3 = com.alibaba.griver.core.render.k.this     // Catch:{ all -> 0x00bf }
                                java.lang.String r3 = r3.f10341a     // Catch:{ all -> 0x00bf }
                                java.lang.String r4 = "exception detail"
                                com.alibaba.ariver.kernel.common.utils.RVLogger.e(r3, r4, r11)     // Catch:{ all -> 0x00bf }
                                android.net.Uri r10 = android.net.Uri.parse(r10)     // Catch:{ all -> 0x00bf }
                                android.webkit.ValueCallback r11 = r7     // Catch:{ all -> 0x00bf }
                                if (r11 == 0) goto L_0x00b9
                                boolean r11 = r8     // Catch:{ all -> 0x00bf }
                                if (r11 != 0) goto L_0x00af
                                goto L_0x00b4
                            L_0x00af:
                                android.net.Uri[] r11 = new android.net.Uri[r2]     // Catch:{ all -> 0x00bf }
                                r11[r0] = r10     // Catch:{ all -> 0x00bf }
                                r10 = r11
                            L_0x00b4:
                                android.webkit.ValueCallback r11 = r7     // Catch:{ all -> 0x00bf }
                                r11.onReceiveValue(r10)     // Catch:{ all -> 0x00bf }
                            L_0x00b9:
                                if (r1 == 0) goto L_0x00be
                                r1.close()
                            L_0x00be:
                                return
                            L_0x00bf:
                                r10 = move-exception
                                if (r1 == 0) goto L_0x00c5
                                r1.close()
                            L_0x00c5:
                                throw r10
                            L_0x00c6:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.core.render.k.AnonymousClass3.onReceive(android.content.Context, android.content.Intent):void");
                        }
                    };
                    this.e = r3;
                    length.setMax(r3, intentFilter);
                    Intent intent = new Intent(a2, GriverFileChooserActivity.class);
                    if (ProcessUtils.isTinyProcess() && !"yes".equalsIgnoreCase(GriverConfig.getConfig("h5_notSupportTinyChooseFile", ""))) {
                        String string = BundleUtils.getString(this.d.getStartParams(), "appId");
                        if (TextUtils.isEmpty(string)) {
                            string = BundleUtils.getString(this.d.getStartParams(), "MINI-PROGRAM-WEB-VIEW-TAG");
                        }
                        if (!TextUtils.isEmpty(string)) {
                            intent.putExtra("appId", string);
                        }
                    }
                    a2.startActivity(intent);
                }
            } catch (ClassCastException e2) {
                RVLogger.e(this.f10341a, "exception detail", e2);
            } catch (ActivityNotFoundException e3) {
                RVLogger.e(this.f10341a, "exception detail", e3);
            }
        }
    }

    public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
        if (c() || AppTypeUtils.isEmbedPage(this.d)) {
            ((GriverChooseFileExtension) RVProxy.get(GriverChooseFileExtension.class)).openFileChooser(this.j, valueCallback, str, str2);
        }
    }

    private boolean c() {
        Page page = this.d;
        return page != null && BundleUtils.getBoolean(page.getStartParams(), RVParams.isH5App, false);
    }

    public boolean onShowFileChooser(ValueCallback<Uri[]> valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        if (c() || AppTypeUtils.isEmbedPage(this.d)) {
            return ((GriverChooseFileExtension) RVProxy.get(GriverChooseFileExtension.class)).onShowFileChooser(this.j, valueCallback, fileChooserParams);
        }
        return true;
    }

    public boolean a() {
        return this.t;
    }

    public void onShowCustomView(View view, APWebChromeClient.CustomViewCallback customViewCallback) {
        String str = this.f10341a;
        StringBuilder sb = new StringBuilder("onShowCustomView [SDK Version] ");
        sb.append(Build.VERSION.SDK_INT);
        RVLogger.d(str, sb.toString());
        if (this.d.getPageContext().getActivity().getRequestedOrientation() != 0) {
            this.d.getPageContext().getActivity().setRequestedOrientation(0);
        }
        this.d.getPageContext().getActivity().getWindow().addFlags(1024);
        this.b = customViewCallback;
        if (view instanceof FrameLayout) {
            FrameLayout frameLayout = (FrameLayout) view;
            View focusedChild = frameLayout.getFocusedChild();
            this.t = true;
            this.w = frameLayout;
            this.x = customViewCallback;
            this.u.setVisibility(8);
            this.v.addView(this.w, new ViewGroup.LayoutParams(-1, -1));
            this.v.setVisibility(0);
            if (focusedChild instanceof VideoView) {
                VideoView videoView = (VideoView) focusedChild;
                videoView.setOnPreparedListener(this);
                videoView.setOnCompletionListener(this);
                videoView.setOnErrorListener(this);
            }
            ExtensionPoint.as(GriverFullScreenEvent.class).node(this.d).create().toggledFullscreen(true);
        }
    }

    public void onHideCustomView() {
        String str = this.f10341a;
        StringBuilder sb = new StringBuilder("onShowCustomView [SDK Version] ");
        sb.append(Build.VERSION.SDK_INT);
        RVLogger.d(str, sb.toString());
        if (this.d.getPageContext().getActivity().getRequestedOrientation() != 1) {
            this.d.getPageContext().getActivity().setRequestedOrientation(1);
        }
        this.d.getPageContext().getActivity().getWindow().clearFlags(1024);
        this.b = null;
        if (this.t) {
            this.v.setVisibility(8);
            this.v.removeView(this.w);
            this.u.setVisibility(0);
            APWebChromeClient.CustomViewCallback customViewCallback = this.x;
            if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                this.x.onCustomViewHidden();
            }
            this.t = false;
            this.w = null;
            this.x = null;
            ExtensionPoint.as(GriverFullScreenEvent.class).node(this.d).create().toggledFullscreen(false);
        }
    }

    public boolean onJsAlert(APWebView aPWebView, String str, String str2, final APJsResult aPJsResult) {
        String str3 = this.f10341a;
        StringBuilder sb = new StringBuilder("onJsAlert ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        RVLogger.d(str3, sb.toString());
        Page page = this.d;
        if (page == null) {
            RVLogger.d(this.f10341a, "h5Page == null");
            aPJsResult.cancel();
            return true;
        }
        Activity activity = page.getPageContext().getActivity();
        if (activity == null || activity.isFinishing()) {
            RVLogger.d(this.f10341a, " isFinishing");
            aPJsResult.cancel();
            return false;
        } else if (!this.r) {
            RVLogger.d(this.f10341a, "not H5Activity");
            aPJsResult.cancel();
            return false;
        } else {
            CreateDialogParam createDialogParam = new CreateDialogParam("", str2, GriverEnv.getResources() != null ? GriverEnv.getResources().getString(R.string.griver_base_confirm) : "Confirm", (String) null, "");
            createDialogParam.positiveListener = new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                    aPJsResult.confirm();
                    APJsResult unused = k.this.l = null;
                }
            };
            createDialogParam.cancelListener = new DialogInterface.OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                    aPJsResult.cancel();
                    APJsResult unused = k.this.l = null;
                }
            };
            d();
            Dialog createDialog = ExtensionPoint.as(DialogPoint.class).create().createDialog(this.d.getPageContext().getActivity(), createDialogParam);
            this.k = createDialog;
            if (createDialog == null || activity.isFinishing()) {
                aPJsResult.cancel();
                return false;
            }
            this.k.show();
            ((GriverDialogExtension) RVProxy.get(GriverDialogExtension.class)).applyShow(this.k, createDialogParam);
            this.l = aPJsResult;
            return true;
        }
    }

    public boolean onJsConfirm(APWebView aPWebView, String str, String str2, final APJsResult aPJsResult) {
        String str3;
        String str4;
        String str5 = this.f10341a;
        StringBuilder sb = new StringBuilder("onJsConfirm ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        RVLogger.d(str5, sb.toString());
        Page page = this.d;
        if (page == null) {
            RVLogger.d(this.f10341a, "h5Page == null");
            aPJsResult.cancel();
            return true;
        }
        Activity activity = page.getPageContext().getActivity();
        if (activity == null || activity.isFinishing()) {
            RVLogger.d(this.f10341a, "  isFinishing");
            aPJsResult.cancel();
            return false;
        } else if (!this.r) {
            RVLogger.d(this.f10341a, "not  H5activity");
            aPJsResult.cancel();
            return false;
        } else {
            if (GriverEnv.getResources() != null) {
                str4 = GriverEnv.getResources().getString(R.string.griver_base_confirm);
                str3 = GriverEnv.getResources().getString(R.string.griver_base_cancel);
            } else {
                str4 = "Confirm";
                str3 = "Cancel";
            }
            CreateDialogParam createDialogParam = new CreateDialogParam("", str2, str4, str3, "");
            createDialogParam.positiveListener = new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                    aPJsResult.confirm();
                    APJsResult unused = k.this.n = null;
                }
            };
            createDialogParam.negativeListener = new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                    aPJsResult.cancel();
                    APJsResult unused = k.this.n = null;
                }
            };
            createDialogParam.cancelListener = new DialogInterface.OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    if (dialogInterface != null) {
                        dialogInterface.dismiss();
                    }
                    aPJsResult.cancel();
                    APJsResult unused = k.this.n = null;
                }
            };
            e();
            Dialog createDialog = ExtensionPoint.as(DialogPoint.class).create().createDialog(this.d.getPageContext().getActivity(), createDialogParam);
            this.m = createDialog;
            if (createDialog == null || activity.isFinishing()) {
                aPJsResult.cancel();
                return false;
            }
            this.m.show();
            ((GriverDialogExtension) RVProxy.get(GriverDialogExtension.class)).applyShow(this.m, createDialogParam);
            this.n = aPJsResult;
            return true;
        }
    }

    public boolean onJsPrompt(APWebView aPWebView, String str, String str2, String str3, final APJsPromptResult aPJsPromptResult) {
        String str4 = this.f10341a;
        StringBuilder sb = new StringBuilder("onJsPrompt: url: ");
        sb.append(str);
        sb.append(" message: ");
        sb.append(str2);
        sb.append(" defaultValue: ");
        sb.append(str3);
        RVLogger.d(str4, sb.toString());
        Page page = this.d;
        if (page == null) {
            aPJsPromptResult.cancel();
            return true;
        }
        Activity activity = page.getPageContext().getActivity();
        if (activity == null || activity.isFinishing()) {
            aPJsPromptResult.cancel();
            return false;
        } else if (!this.r) {
            return false;
        } else {
            f();
            H5PromptDialog h5PromptDialog = new H5PromptDialog(activity, (String) null, str2, ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getResources((String) null).getString(R.string.griver_core_default_confirm), ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).getResources((String) null).getString(R.string.griver_core_default_cancel));
            this.f10342o = h5PromptDialog;
            h5PromptDialog.getInputContent().setText(str3);
            this.f10342o.setPositiveListener(new H5PromptDialog.OnClickPositiveListener() {
                public void onClick(String str) {
                    APJsPromptResult aPJsPromptResult = aPJsPromptResult;
                    if (aPJsPromptResult != null) {
                        aPJsPromptResult.confirm(k.this.f10342o.getInputContent().getText().toString());
                    }
                    APJsPromptResult unused = k.this.p = null;
                }
            });
            this.f10342o.setNegativeListener(new H5PromptDialog.OnClickNegativeListener() {
                public void onClick() {
                    APJsPromptResult aPJsPromptResult = aPJsPromptResult;
                    if (aPJsPromptResult != null) {
                        aPJsPromptResult.cancel();
                    }
                    APJsPromptResult unused = k.this.p = null;
                }
            });
            this.f10342o.setOnCancelListener(new DialogInterface.OnCancelListener() {
                public void onCancel(DialogInterface dialogInterface) {
                    APJsPromptResult aPJsPromptResult = aPJsPromptResult;
                    if (aPJsPromptResult != null) {
                        aPJsPromptResult.cancel();
                    }
                    APJsPromptResult unused = k.this.p = null;
                }
            });
            if (this.f10342o == null || activity.isFinishing()) {
                aPJsPromptResult.cancel();
                return false;
            }
            this.f10342o.show();
            this.p = aPJsPromptResult;
            return true;
        }
    }

    public void b() {
        this.d = null;
        d();
        e();
        f();
    }

    private void d() {
        Dialog dialog = this.k;
        if (dialog != null) {
            dialog.dismiss();
            this.k = null;
        }
        APJsResult aPJsResult = this.l;
        if (aPJsResult != null) {
            aPJsResult.cancel();
            this.l = null;
        }
    }

    private void e() {
        Dialog dialog = this.m;
        if (dialog != null) {
            dialog.dismiss();
            this.m = null;
        }
        APJsResult aPJsResult = this.n;
        if (aPJsResult != null) {
            aPJsResult.cancel();
            this.n = null;
        }
    }

    private void f() {
        H5PromptDialog h5PromptDialog = this.f10342o;
        if (h5PromptDialog != null) {
            h5PromptDialog.dismiss();
            this.f10342o = null;
        }
        APJsPromptResult aPJsPromptResult = this.p;
        if (aPJsPromptResult != null) {
            aPJsPromptResult.cancel();
            this.p = null;
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        onHideCustomView();
    }
}
