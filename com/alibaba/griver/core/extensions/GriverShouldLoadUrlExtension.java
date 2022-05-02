package com.alibaba.griver.core.extensions;

import android.app.Application;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.model.LoadParams;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionPoint;
import com.alibaba.ariver.kernel.api.extension.resolver.ResultResolver;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alibaba.ariver.permission.api.proxy.AuthenticationProxy;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.api.common.page.GriverInterceptUrlEvent;
import com.alibaba.griver.api.common.page.GriverUrlNavigationEvent;
import com.alibaba.griver.api.h5.permission.GriverH5UrlInterceptedProxy;
import com.alibaba.griver.base.api.ShouldLoadUrlPoint;
import com.alibaba.griver.base.common.config.GriverConfig;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.logger.GriverLogger;
import com.alibaba.griver.base.common.utils.AppInfoUtils;
import com.alibaba.griver.base.common.utils.H5UrlHelper;
import com.alibaba.griver.base.common.utils.KitUtils;
import com.alibaba.griver.base.resource.utils.ErrorPageUtils;
import com.alibaba.griver.core.GriverParam;
import com.alipay.mobile.security.bio.api.BioDetector;
import java.lang.ref.WeakReference;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

public class GriverShouldLoadUrlExtension implements NodeAware<Page>, ShouldLoadUrlPoint {

    /* renamed from: a  reason: collision with root package name */
    private static final List<String> f10302a;
    WeakReference<Page> pageWeakReference;

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    static {
        ArrayList arrayList = new ArrayList();
        f10302a = arrayList;
        arrayList.add("tel");
        f10302a.add("mailto");
        f10302a.add("sms");
        f10302a.add(BioDetector.EXT_KEY_GEO);
    }

    public void setNode(WeakReference<Page> weakReference) {
        this.pageWeakReference = weakReference;
    }

    public Class<Page> getNodeType() {
        return Page.class;
    }

    public boolean shouldLoad(JSONObject jSONObject, final String str) {
        ApiPermissionCheckResult apiPermissionCheckResult;
        Uri parse;
        final Page page = this.pageWeakReference.get();
        if (ExtensionPoint.as(GriverInterceptUrlEvent.class).node(this.pageWeakReference.get()).defaultValue(Boolean.FALSE).resolve(new ResultResolver<Boolean>() {
            public Boolean resolve(List<Boolean> list) {
                if (list == null || list.size() == 0) {
                    return Boolean.FALSE;
                }
                for (Boolean next : list) {
                    if (next != null && next.booleanValue()) {
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            }
        }).create().interceptUrl(page, str)) {
            GriverLogger.d("GriverShouldLoadUrlExtension", "url is intercepted by outer: ".concat(String.valueOf(str)));
            b(str);
            return false;
        } else if (ExtensionPoint.as(GriverUrlNavigationEvent.class).node(this.pageWeakReference.get()).defaultValue(Boolean.FALSE).resolve(new ResultResolver<Boolean>() {
            public Boolean resolve(List<Boolean> list) {
                if (list == null || list.size() == 0) {
                    return Boolean.FALSE;
                }
                for (Boolean next : list) {
                    if (next != null && next.booleanValue()) {
                        return Boolean.TRUE;
                    }
                }
                return Boolean.FALSE;
            }
        }).create().onStartUrlNavigation(page, str)) {
            GriverLogger.d("GriverShouldLoadUrlExtension", "url is intercepted by outer: ".concat(String.valueOf(str)));
            b(str);
            return false;
        } else {
            WeakReference<Page> weakReference = this.pageWeakReference;
            if (weakReference == null || weakReference.get() == null) {
                GriverLogger.d("GriverShouldLoadUrlExtension", "page is null, intercepted");
                b(str);
                return false;
            } else if (TextUtils.isEmpty(str)) {
                GriverLogger.d("GriverShouldLoadUrlExtension", "url is empty, intercepted");
                b(str);
                return false;
            } else if (a(str)) {
                GriverLogger.d("GriverShouldLoadUrlExtension", "url is intercepted by scheme");
                b(str);
                return false;
            } else if (!BundleUtils.getBoolean(page.getStartParams(), RVParams.isH5App, false)) {
                Uri uri = null;
                try {
                    uri = Uri.parse(str);
                } catch (Exception e) {
                    GriverLogger.e("GriverShouldLoadUrlExtension", "parse url to uri failed", e);
                }
                if (uri == null) {
                    GriverLogger.w("GriverShouldLoadUrlExtension", "load url intercepted for failed to parse url.");
                    return false;
                }
                String scheme = uri.getScheme();
                String host = uri.getHost();
                String path = uri.getPath();
                if (scheme != null && f10302a.contains(scheme)) {
                    GriverLogger.d("GriverShouldLoadUrlExtension", "scheme in whitelist, should load, scheme: ".concat(String.valueOf(scheme)));
                    return true;
                } else if (!AppInfoUtils.isEmbeddedApp(page) || (parse = Uri.parse(ErrorPageUtils.getErrorStatusPageUrl())) == null || !TextUtils.equals(scheme, parse.getScheme()) || !TextUtils.equals(path, parse.getPath())) {
                    StringBuilder sb = new StringBuilder("url ");
                    sb.append(str);
                    sb.append(" scheme ");
                    sb.append(scheme);
                    sb.append(" host ");
                    sb.append(host);
                    RVLogger.d("GriverShouldLoadUrlExtension", sb.toString());
                    AuthenticationProxy authenticationProxy = (AuthenticationProxy) RVProxy.get(AuthenticationProxy.class);
                    final String string = BundleUtils.getString(page.getStartParams(), "appId");
                    if (AppInfoUtils.isEmbeddedApp(page)) {
                        apiPermissionCheckResult = authenticationProxy.hasPermission(string, host, "Webview_Config_allowedDomain", page.getApp(), page);
                    } else {
                        apiPermissionCheckResult = authenticationProxy.interceptUrlForTiny(str, string, page, false);
                    }
                    if (apiPermissionCheckResult == ApiPermissionCheckResult.IGNORE || apiPermissionCheckResult == ApiPermissionCheckResult.ALLOW) {
                        return true;
                    }
                    ExecutorUtils.runOnMain(new Runnable() {
                        public void run() {
                            if (!page.isExited() && page.getRender() != null) {
                                LoadParams loadParams = new LoadParams();
                                loadParams.forceLoad = true;
                                StringBuilder sb = new StringBuilder();
                                sb.append(String.format(ErrorPageUtils.getErrorStatusPageUrl(), new Object[]{string, Integer.valueOf(ErrorPageUtils.WEB_VIEW_INTERCEPTED), ErrorPageUtils.ERROR_TYPE_MINI}));
                                sb.append("&url=");
                                sb.append(H5UrlHelper.encode(str));
                                loadParams.url = sb.toString();
                                page.getRender().load(loadParams);
                            }
                        }
                    });
                    GriverLogger.e("GriverShouldLoadUrlExtension", "interceptUrlForTiny\t".concat(String.valueOf(str)));
                    return false;
                } else {
                    GriverLogger.d("GriverShouldLoadUrlExtension", "error status page, should load, scheme: ".concat(String.valueOf(scheme)));
                    return true;
                }
            } else if (str.startsWith("file:///android_asset")) {
                return true;
            } else {
                try {
                    if (TextUtils.isEmpty(Uri.parse(str).getScheme())) {
                        b(str);
                        return false;
                    }
                } catch (Exception e2) {
                    StringBuilder sb2 = new StringBuilder("intercept url ");
                    sb2.append(e2.getMessage());
                    GriverLogger.e("GriverShouldLoadUrlExtension", sb2.toString());
                }
                if (c(str)) {
                    b(str);
                    GriverLogger.d("GriverShouldLoadUrlExtension", "intercept url isNotInWhiteList");
                    return false;
                } else if (!d(str)) {
                    return true;
                } else {
                    b(str);
                    GriverLogger.d("GriverShouldLoadUrlExtension", "intercept url isInBlackList");
                    return false;
                }
            }
        }
    }

    private boolean a(String str) {
        try {
            Uri parseUrl = UrlUtils.parseUrl(str);
            if (parseUrl == null) {
                GriverLogger.w("GriverShouldLoadUrlExtension", "load url intercepted for failed to parse url.");
                return true;
            }
            String scheme = parseUrl.getScheme();
            if (!GriverParam.ABOUT_BLANK.equals(str) && !"about".equalsIgnoreCase(scheme) && !"data".equalsIgnoreCase(scheme) && !"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                if (!"ftp".equalsIgnoreCase(scheme)) {
                    if (!"file".equalsIgnoreCase(scheme)) {
                        return a(str, scheme);
                    }
                    String path = parseUrl.getPath();
                    if (path != null && path.startsWith("/android_asset/")) {
                        GriverLogger.d("GriverShouldLoadUrlExtension", "load asset ".concat(String.valueOf(path)));
                    }
                    return false;
                }
            }
            return false;
        } catch (Exception e) {
            GriverLogger.e("GriverShouldLoadUrlExtension", "intercept url with scheme exception", e);
            return true;
        }
    }

    private boolean a(String str, String str2) {
        if (!TextUtils.isEmpty(str2) && !"javascript".equals(str2)) {
            try {
                Intent parseUri = Intent.parseUri(str, 1);
                parseUri.addCategory("android.intent.category.BROWSABLE");
                parseUri.setComponent((ComponentName) null);
                if (Build.VERSION.SDK_INT >= 15) {
                    parseUri.setSelector((Intent) null);
                }
                try {
                    Application applicationContext = GriverEnv.getApplicationContext();
                    parseUri.setFlags(268435456);
                    applicationContext.startActivity(parseUri);
                    GriverLogger.d("GriverShouldLoadUrlExtension", "start ext app: ".concat(String.valueOf(str2)));
                    return true;
                } catch (Exception e) {
                    GriverLogger.e("GriverShouldLoadUrlExtension", "exception detail", e);
                    return false;
                }
            } catch (URISyntaxException e2) {
                StringBuilder sb = new StringBuilder("bad uri ");
                sb.append(str);
                sb.append(": ");
                sb.append(e2.getMessage());
                GriverLogger.w("GriverShouldLoadUrlExtension", sb.toString());
            }
        }
        return false;
    }

    private void b(String str) {
        ((GriverH5UrlInterceptedProxy) RVProxy.get(GriverH5UrlInterceptedProxy.class)).intercepted(str);
    }

    private boolean c(String str) {
        List<String> a2 = a();
        if (a2 == null || a2.size() == 0) {
            return false;
        }
        for (int i = 0; i < a2.size(); i++) {
            if (KitUtils.isDomainMatch(a2.get(i), str)) {
                return false;
            }
        }
        return true;
    }

    private boolean d(String str) {
        List<String> b = b();
        if (!(b == null || b.size() == 0)) {
            for (int i = 0; i < b.size(); i++) {
                if (KitUtils.isDomainMatch(b.get(i), str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private List<String> a() {
        return e("whitelist");
    }

    private List<String> b() {
        return e("blacklist");
    }

    private List<String> e(String str) {
        String config = GriverConfig.getConfig(str, "");
        ArrayList arrayList = new ArrayList();
        try {
            List<String> parseArray = JSON.parseArray(config, String.class);
            if (parseArray != null && parseArray.size() > 0) {
                arrayList.addAll(parseArray);
            }
        } catch (Exception e) {
            GriverLogger.e("GriverShouldLoadUrlExtension", "parse config failed: ".concat(String.valueOf(str)), e);
        }
        return arrayList;
    }
}
