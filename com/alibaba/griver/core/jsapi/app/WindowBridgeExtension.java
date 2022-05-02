package com.alibaba.griver.core.jsapi.app;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.ParamUtils;
import com.alibaba.ariver.app.api.activity.StartAction;
import com.alibaba.ariver.app.api.activity.StartClientBundle;
import com.alibaba.ariver.app.api.point.app.PushWindowPoint;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingExecutor;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.integration.ipc.server.RVAppRecord;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.extension.resolver.ResultResolver;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alibaba.ariver.remotedebug.RDConstant;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.config.GriverConfigConstants;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.base.common.utils.AppTypeUtils;
import com.alibaba.griver.base.common.utils.StartupParamsUtils;
import com.alibaba.griver.core.ui.activity.GriverTransActivity;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

@Keep
public class WindowBridgeExtension implements BridgeExtension {
    private static final int CODE_POP_TO_ERROR = 10;
    private static final String POP_TO_OVERFLOW_MEESAGE = "popTo index overflow!";
    private static final String TAG = "AriverApp:WindowBridgeExtension";

    public Permission permit() {
        return null;
    }

    @ActionFilter
    public BridgeResponse pushWindow(@BindingParam({"url", "u"}) String str, @BindingParam({"param"}) JSONObject jSONObject, @BindingNode(Page.class) Page page, @BindingExecutor(ExecutorType.UI) Executor executor, @BindingCallback BridgeCallback bridgeCallback) {
        StringBuilder sb = new StringBuilder("pushWindow, url = ");
        sb.append(str);
        sb.append(", param = ");
        sb.append(jSONObject);
        RVLogger.d(TAG, sb.toString());
        String pageURI = page.getPageURI();
        if (str.startsWith("#")) {
            int indexOf = pageURI.indexOf(35);
            if (indexOf != -1) {
                String substring = pageURI.substring(0, indexOf);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(substring);
                sb2.append(str);
                str = sb2.toString();
                RVLogger.d(TAG, "stripAnchor url:".concat(String.valueOf(str)));
            }
        } else {
            str = UrlUtils.mergeUrl(pageURI, str);
        }
        final String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            return BridgeResponse.INVALID_PARAM;
        }
        if (AppInfoUtils.isEmbeddedApp(page)) {
            return BridgeResponse.FORBIDDEN_ERROR;
        }
        String string = page.getApp().getStartParams().getString("onlineHost");
        if (AppTypeUtils.isEmbedPage(page) && !TextUtils.isEmpty(string) && !str2.startsWith(string)) {
            return BridgeResponse.FORBIDDEN_ERROR;
        }
        if (!"yes".equalsIgnoreCase(GriverConfig.getConfig(GriverConfigConstants.KEY_ENABLE_INTERCEPT_JS_IN_PUSHWINDOW, "no")) || TextUtils.isEmpty(str2) || !str2.startsWith(RDConstant.JAVASCRIPT_SCHEME)) {
            final Bundle bundle = new Bundle();
            Bundle startParams = page.getStartParams();
            Bundle filterBundle = StartupParamsUtils.filterBundle(page.getApp().getAppId(), page.getOriginalURI(), JSONUtils.toBundle(jSONObject));
            filterBundle.remove(RVParams.isTinyApp);
            if (!startParams.getBoolean(RVStartParams.KEY_TRANSPARENT, false) || startParams.getBoolean("fullscreen", false)) {
                bundle.putAll(startParams);
                ParamUtils.filterCreatePageParams(bundle);
                bundle.putAll(filterBundle);
                bundle.putString(RVStartParams.KEY_FROM_TYPE, RVStartParams.FROM_TYPE_PUSH_WINDOW);
                if (ExtensionPoint.as(PushWindowPoint.class).node(page).resolve(ResultResolver.POSITIVE_RESOLVER).create().handlePushWindow(page, str2, bundle, filterBundle)) {
                    return BridgeResponse.SUCCESS;
                }
                if (page.getPageContext() == null || page.getApp().getAppContext() == null || page.getApp().getAppContext().getContext() == null) {
                    return new BridgeResponse.Error(2, "page or app context null");
                }
                StringBuilder sb3 = new StringBuilder("pushWindow, oldParams is ");
                sb3.append(bundle.toString());
                RVLogger.d(TAG, sb3.toString());
                final Page page2 = page;
                final JSONObject jSONObject2 = jSONObject;
                executor.execute(new Runnable() {
                    public void run() {
                        final App app = page2.getApp();
                        if (app == null || app.isDestroyed()) {
                            RVLogger.e(WindowBridgeExtension.TAG, "pushWindow, but already destroyed!");
                            return;
                        }
                        boolean z = JSONUtils.getBoolean(jSONObject2, "closeCurrentWindow", false);
                        if (BundleUtils.getBoolean(bundle, RVStartParams.KEY_TRANSPARENT, false) || TextUtils.equals("YES", BundleUtils.getString(bundle, RVStartParams.KEY_TRANSPARENT, "NO"))) {
                            Intent intent = new Intent(page2.getPageContext().getActivity(), GriverTransActivity.Main.class);
                            bundle.remove(RVStartParams.KEY_TRANSPARENT);
                            bundle.putBoolean(RVStartParams.KEY_TRANSPARENT, true);
                            bundle.putBoolean("showLoadingView", true);
                            if (bundle.containsKey("asyncIndex")) {
                                bundle.remove("asyncIndex");
                            }
                            bundle.putString("u", str2);
                            RVAppRecord generate = RVAppRecord.generate(app.getAppId(), bundle, new Bundle());
                            StartClientBundle startClientBundle = new StartClientBundle();
                            startClientBundle.appId = generate.getAppId();
                            startClientBundle.startToken = generate.getStartToken();
                            startClientBundle.startParams = bundle;
                            startClientBundle.sceneParams = new Bundle();
                            startClientBundle.needWaitIpc = false;
                            startClientBundle.startAction = StartAction.DIRECT_START;
                            intent.putExtra(RVConstants.EXTRA_ARIVER_START_BUNDLE, startClientBundle);
                            intent.putExtra("isTransparent", true);
                            intent.putExtras(generate.getStartParams());
                            page2.getPageContext().getActivity().startActivity(intent);
                            if (z) {
                                WindowBridgeExtension.this.closeCurrentWindow(page2, app);
                            }
                        } else if (JSONUtils.getBoolean(jSONObject2, "closeAllWindow", false)) {
                            RVLogger.d(WindowBridgeExtension.TAG, "pushWindow, relaunch(closeAllWindow)!");
                            bundle.putString(RVStartParams.KEY_FROM_TYPE, RVStartParams.FROM_TYPE_PUSH_RELAUNCH);
                            ExecutorUtils.runOnMain(new Runnable() {
                                public void run() {
                                    app.relaunchToUrl(str2, bundle, page2.getApp().getSceneParams());
                                }
                            });
                        } else {
                            ExecutorUtils.runOnMain(new Runnable() {
                                public void run() {
                                    app.pushPage(str2, bundle, app.getSceneParams());
                                }
                            });
                            if (z) {
                                RVLogger.d(WindowBridgeExtension.TAG, "pushWindow closeCurrentWindow");
                                WindowBridgeExtension.this.closeCurrentWindow(page2, app);
                            }
                        }
                    }
                });
                return BridgeResponse.SUCCESS;
            }
            RVLogger.d(TAG, "can not pushwindow in a transparent window");
            return new BridgeResponse.Error(2, "pushWindow can not be used in transparent window");
        }
        RVLogger.d(TAG, "pushWindow security check failed!");
        return BridgeResponse.INVALID_PARAM;
    }

    /* access modifiers changed from: private */
    public void closeCurrentWindow(final Page page, final App app) {
        ((Page.AnimStore) page.getData(Page.AnimStore.class, true)).disableExit = true;
        ExecutorUtils.runOnMain(new Runnable() {
            public void run() {
                ArrayList<Page> arrayList = new ArrayList<>();
                arrayList.add(page);
                if (page.isUseForEmbed()) {
                    App app = app;
                    arrayList.add((Page) app.getChildAt(app.getIndexOfChild(page) + 1));
                }
                for (Page exit : arrayList) {
                    exit.exit(false);
                }
            }
        });
    }

    @AutoCallback
    @ActionFilter
    public BridgeResponse popTo(@BindingNode(App.class) App app, @BindingParam({"url"}) String str, @BindingParam({"urlPattern"}) String str2, @BindingParam({"data"}) JSONObject jSONObject, @BindingParam(intDefault = Integer.MAX_VALUE, value = {"index"}) int i) {
        int urlIndex = !TextUtils.isEmpty(str) ? getUrlIndex(app, str, false) : Integer.MAX_VALUE;
        if (!TextUtils.isEmpty(str2)) {
            urlIndex = getUrlIndex(app, str2, true);
        }
        if (urlIndex != Integer.MAX_VALUE) {
            i = urlIndex;
        }
        if (i == Integer.MAX_VALUE) {
            return BridgeResponse.newError(10, "can't find page index");
        }
        int childCount = app.getChildCount();
        if (i >= childCount) {
            return BridgeResponse.newError(10, POP_TO_OVERFLOW_MEESAGE);
        }
        if (i >= 0) {
            i = (i - childCount) + 1;
        }
        if (i < 0 && Math.abs(i) > app.getChildCount() - 1) {
            return BridgeResponse.newError(10, POP_TO_OVERFLOW_MEESAGE);
        }
        app.popTo(i, true, jSONObject);
        return BridgeResponse.SUCCESS;
    }

    @AutoCallback
    @ActionFilter
    public void popWindow(@BindingNode(App.class) App app, @BindingParam({"data"}) JSONObject jSONObject) {
        app.popPage(jSONObject);
    }

    private int getUrlIndex(App app, String str, boolean z) {
        int childCount = app.getChildCount();
        boolean z2 = false;
        int i = 0;
        while (true) {
            if (i > childCount - 1) {
                i = Integer.MAX_VALUE;
                break;
            }
            String pageURI = app.getPageByIndex(i).getPageURI();
            if (!TextUtils.isEmpty(pageURI)) {
                if (z) {
                    Pattern compile = Pattern.compile(str);
                    if (compile != null && compile.matcher(pageURI).find()) {
                        break;
                    }
                } else if (str.equals(pageURI)) {
                    break;
                }
            }
            i++;
        }
        z2 = true;
        return z2 ? (i - childCount) + 1 : i;
    }

    public void onInitialized() {
        RVLogger.d(TAG, "onInitialized");
    }

    public void onFinalized() {
        RVLogger.d(TAG, "onFinalized");
    }
}
