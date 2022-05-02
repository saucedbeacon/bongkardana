package com.alibaba.ariver.permission.service;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.service.TinyAppInnerProxy;
import com.alibaba.ariver.engine.api.bridge.BridgeResponseHelper;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.engine.api.model.WorkerStore;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgePermission;
import com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult;
import com.alibaba.ariver.kernel.api.security.DefaultPermission;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.PatternUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alibaba.ariver.permission.AppPermissionUtils;
import com.alibaba.ariver.permission.api.proxy.AuthenticationProxy;
import com.alibaba.ariver.permission.api.proxy.DomainConfigProxy;
import com.alibaba.ariver.permission.api.proxy.EmbedWebViewJsApiPermissionProxy;
import com.alibaba.ariver.permission.model.ApiPermissionInfo;
import com.alibaba.ariver.remotedebug.RDConstant;
import com.alibaba.ariver.remotedebug.utils.TinyAppLogUtil;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PermissionModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.security.bio.api.BioDetector;
import com.iap.ac.android.container.js.plugin.ACContainerJSPlugin;
import id.dana.lib.gcontainer.app.bridge.requestpermissions.RequestPermissionsEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DefaultAuthenticationProxyImpl implements AuthenticationProxy {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f10132a = {"navigateTo", "navigateBack", "switchTab", "reLaunch", "redirectTo", "getCurrentLocation", "getLocation", "webViewShare"};
    private static final List<String> b = new ArrayList();
    private static String c = "AriverPermission:DefaultAuthenticationProxyImpl";
    private static List<String> d;
    private final Map<String, Integer> e = new ConcurrentHashMap();
    private final Map<String, Map<String, PermissionModel>> f = new ConcurrentHashMap();
    private final Map<String, Map<String, ApiPermissionInfo>> g = new ConcurrentHashMap();
    private Map<String, ApiPermissionInfo> h = new ConcurrentHashMap();
    private Map<String, PermissionModel> i = new ConcurrentHashMap();
    private LocalAuthPermissionManager j = new LocalAuthPermissionManager();

    static {
        ArrayList arrayList = new ArrayList();
        d = arrayList;
        arrayList.add(ACContainerJSPlugin.SHOW_NETWORK_CHECK_ACTIVITY);
        d.add("showUCFailDialog");
        d.add("setKeyboardType");
        d.add("monitorH5Performance");
        d.add("getStartupParams");
        d.add("inputBlurEvent");
        d.add("hideCustomKeyBoard");
        d.add("hideCustomInputMethod4NativeInput");
        d.add("updateNativeKeyBoardInput");
        d.add("setInputTextChanged");
        d.add(TinyAppLogUtil.TINY_APP_STANDARD_LOG);
        d.add(RDConstant.TINY_DEBUG_CONSOLE);
        b.add("tel");
        b.add("mailto");
        b.add("sms");
        b.add(BioDetector.EXT_KEY_GEO);
    }

    private void a(String str) {
        if (this.e.containsKey(str)) {
            Map<String, Integer> map = this.e;
            map.put(str, Integer.valueOf(map.get(str).intValue() + 1));
            return;
        }
        this.e.put(str, 1);
    }

    private boolean b(String str) {
        boolean z = true;
        if (this.e.containsKey(str)) {
            int intValue = this.e.get(str).intValue() - 1;
            this.e.put(str, Integer.valueOf(intValue));
            if (intValue != 0) {
                z = false;
            }
            if (z) {
                this.e.remove(str);
            }
            return z;
        }
        String str2 = c;
        StringBuilder sb = new StringBuilder("cannot detach ");
        sb.append(str);
        sb.append(" because it not attached!");
        RVLogger.w(str2, sb.toString());
        return true;
    }

    public void setPermissionModel(String str, PermissionModel permissionModel) {
        if (!this.i.containsKey(str)) {
            this.i.put(str, permissionModel);
            this.h.put(str, AppPermissionUtils.convert2ApiPermissionInfo(permissionModel));
        }
        a(str);
    }

    public void setPluginPermissionModel(String str, PluginModel pluginModel, PermissionModel permissionModel) {
        String str2 = c;
        StringBuilder sb = new StringBuilder("setPluginPermissionModel ");
        sb.append(str);
        sb.append(" plugin: ");
        sb.append(pluginModel.getAppId());
        RVLogger.d(str2, sb.toString());
        synchronized (this.f) {
            Map map = this.f.get(str);
            if (map == null) {
                map = new HashMap();
                this.f.put(str, map);
            }
            map.put(pluginModel.getAppId(), permissionModel);
        }
        synchronized (this.g) {
            Map map2 = this.g.get(str);
            if (map2 == null) {
                map2 = new HashMap();
                this.g.put(str, map2);
            }
            map2.put(pluginModel.getAppId(), AppPermissionUtils.convert2ApiPermissionInfo(permissionModel));
        }
    }

    public PermissionModel getPermissionModel(String str) {
        return this.i.get(str);
    }

    public boolean hasPermissionModel(String str, Page page) {
        if (TextUtils.isEmpty(str)) {
            if (!a(page)) {
                return false;
            }
            str = page.getApp().getAppId();
        }
        return this.i.containsKey(str);
    }

    public List<Permission> getPermissions(String str) {
        Set<String> jsapiList;
        PermissionModel permissionModel = this.i.get(str);
        if (permissionModel == null || (jsapiList = permissionModel.getJsapiList()) == null || jsapiList.size() <= 0) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(jsapiList.size());
        for (String next : jsapiList) {
            arrayList.add(new BridgePermission(next, next));
        }
        return arrayList;
    }

    private boolean a(Page page, String str) {
        List<String> stringArray;
        if (page != null && !TextUtils.isEmpty(str) && (stringArray = JSONUtils.toStringArray(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONArray("ta_http_domain_blacklist"))) != null && !stringArray.isEmpty()) {
            for (String compile : stringArray) {
                Matcher matcher = Pattern.compile(compile).matcher(str);
                if (matcher != null && matcher.matches()) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean a(NativeCallContext nativeCallContext, @Nullable Page page) {
        if (((WorkerStore) page.getData(WorkerStore.class)) == null || NativeCallContext.FROM_WORKER.equals(nativeCallContext.getSource())) {
            return false;
        }
        String pageURI = page.getPageURI();
        String string = BundleUtils.getString(page.getStartParams(), "onlineHost");
        if (TextUtils.isEmpty(pageURI) || TextUtils.isEmpty(string) || !pageURI.startsWith(string)) {
            return false;
        }
        JSONArray configJSONArray = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONArray("ta_renderJsapiBList");
        if (configJSONArray == null || !configJSONArray.contains(nativeCallContext.getName())) {
            return true;
        }
        return false;
    }

    public ApiPermissionCheckResult checkJSApi(Permission permission, NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper, App app, @Nullable Page page) {
        String str = c;
        StringBuilder sb = new StringBuilder("checkJSApi ");
        sb.append(nativeCallContext.getName());
        sb.append(" source: ");
        sb.append(nativeCallContext.getSource());
        RVLogger.d(str, sb.toString());
        if (page == null && app == null) {
            RVLogger.d(c, "checkJSApi,page is null");
            return ApiPermissionCheckResult.DENY_N22101;
        } else if (a(app.getStartParams(), nativeCallContext.getName())) {
            return ApiPermissionCheckResult.DENY_N22102;
        } else {
            String appId = app.getAppId();
            if (!TextUtils.isEmpty(nativeCallContext.getPluginId())) {
                return a(appId, nativeCallContext.getPluginId(), permission);
            }
            if (page == null || !a(nativeCallContext, page)) {
                PermissionModel permissionModel = this.i.get(appId);
                if (permission == null || permission == DefaultPermission.ALL || permissionModel == null) {
                    RVLogger.d(c, String.format("%s not have permission file", new Object[]{appId}));
                    return ApiPermissionCheckResult.IGNORE;
                } else if (d.contains(permission.authority())) {
                    return ApiPermissionCheckResult.IGNORE;
                } else {
                    JSONArray configJSONArray = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONArray("h5_white_jsapiList");
                    if (configJSONArray != null && configJSONArray.contains(permission.authority())) {
                        return ApiPermissionCheckResult.IGNORE;
                    }
                    if (a(page)) {
                        String str2 = c;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(permission.authority());
                        sb2.append(" call from webview");
                        RVLogger.d(str2, sb2.toString());
                        String appId2 = page.getApp().getAppId();
                        String string = BundleUtils.getString(page.getStartParams(), "appId");
                        EmbedWebViewJsApiPermissionProxy embedWebViewJsApiPermissionProxy = (EmbedWebViewJsApiPermissionProxy) RVProxy.get(EmbedWebViewJsApiPermissionProxy.class);
                        if (embedWebViewJsApiPermissionProxy != null) {
                            if (embedWebViewJsApiPermissionProxy.shouldInterceptJSApiCall(permission.authority(), page, appId2, string, nativeCallContext.getParams())) {
                                String str3 = c;
                                StringBuilder sb3 = new StringBuilder("embedwebviewjsapi_forbidden:EmbedWebViewJsApi interceptJSApiCall\t");
                                sb3.append(permission.authority());
                                RVLogger.d(str3, sb3.toString());
                                return ApiPermissionCheckResult.DENY_N22201;
                            }
                            String str4 = c;
                            StringBuilder sb4 = new StringBuilder(" EmbedWebViewJsApi ignore\t");
                            sb4.append(permission.authority());
                            RVLogger.d(str4, sb4.toString());
                            return ApiPermissionCheckResult.IGNORE;
                        }
                    } else {
                        Set<String> jsapiList = permissionModel.getJsapiList();
                        if (jsapiList != null && jsapiList.size() > 0) {
                            for (String equalsIgnoreCase : jsapiList) {
                                if (equalsIgnoreCase.equalsIgnoreCase(permission.authority())) {
                                    String str5 = c;
                                    StringBuilder sb5 = new StringBuilder("permison is allowed \t ");
                                    sb5.append(permission.authority());
                                    RVLogger.d(str5, sb5.toString());
                                    return ApiPermissionCheckResult.ALLOW;
                                }
                            }
                        }
                    }
                    String str6 = c;
                    StringBuilder sb6 = new StringBuilder("jsapi_forbidden:checkJSAPI deny \t");
                    sb6.append(permission.authority());
                    RVLogger.d(str6, sb6.toString());
                    return ApiPermissionCheckResult.DENY_N22104;
                }
            } else {
                RVLogger.d(c, "commonCheckIgnorePermission IGNORE by hasJsApiPermissionCallFromRender");
                return ApiPermissionCheckResult.IGNORE;
            }
        }
    }

    private ApiPermissionCheckResult a(String str, String str2, Permission permission) {
        Map map = this.f.get(str);
        if (map == null || !map.containsKey(str2)) {
            RVLogger.d(c, String.format("plugin %s not have permission field, just ignore", new Object[]{str2}));
            return ApiPermissionCheckResult.IGNORE;
        }
        PermissionModel permissionModel = (PermissionModel) map.get(str2);
        if (permissionModel == null) {
            String str3 = c;
            StringBuilder sb = new StringBuilder("permission is enabled by no permission file! ");
            sb.append(permission.authority());
            RVLogger.d(str3, sb.toString());
            return ApiPermissionCheckResult.ALLOW;
        }
        Set<String> jsapiList = permissionModel.getJsapiList();
        if (jsapiList != null && jsapiList.size() > 0) {
            for (String equalsIgnoreCase : jsapiList) {
                if (equalsIgnoreCase.equalsIgnoreCase(permission.authority())) {
                    String str4 = c;
                    StringBuilder sb2 = new StringBuilder("permission is allowed by plugin \t ");
                    sb2.append(permission.authority());
                    RVLogger.d(str4, sb2.toString());
                    return ApiPermissionCheckResult.ALLOW;
                }
            }
        }
        String str5 = c;
        StringBuilder sb3 = new StringBuilder("plugin_forbidden:permission is disabled by plugin \t ");
        sb3.append(permission.authority());
        RVLogger.d(str5, sb3.toString());
        return ApiPermissionCheckResult.DENY_N22103;
    }

    public ApiPermissionCheckResult checkSPJSApi(Permission permission, NativeCallContext nativeCallContext, BridgeResponseHelper bridgeResponseHelper, App app, @Nullable Page page) {
        boolean z;
        ApiPermissionInfo apiPermissionInfo;
        ApiPermissionCheckResult apiPermissionCheckResult;
        Uri parseUrl;
        ApiPermissionCheckResult apiPermissionCheckResult2;
        ApiPermissionCheckResult apiPermissionCheckResult3;
        Page page2 = page;
        if (app == null) {
            return ApiPermissionCheckResult.DENY_N22207;
        }
        String appId = app.getAppId();
        String authority = permission.authority();
        if (TextUtils.isEmpty(nativeCallContext.getPluginId())) {
            apiPermissionInfo = this.h.get(appId);
            z = false;
        } else {
            ApiPermissionInfo apiPermissionInfo2 = this.g.get(appId) == null ? null : (ApiPermissionInfo) this.g.get(appId).get(nativeCallContext.getPluginId());
            String str = c;
            StringBuilder sb = new StringBuilder("get ApiPermissionInfo from pluginId");
            sb.append(nativeCallContext.getPluginId());
            RVLogger.debug(str, sb.toString());
            apiPermissionInfo = apiPermissionInfo2;
            z = true;
        }
        if (apiPermissionInfo == null) {
            return ApiPermissionCheckResult.IGNORE;
        }
        String concat = "JSAPI_SP_Config_".concat(String.valueOf(authority));
        List<String> apiLevelList = apiPermissionInfo.getApiLevelList(concat);
        if (TextUtils.equals(authority, "httpRequest") || TextUtils.equals(authority, "uploadFile") || TextUtils.equals(authority, RequestPermissionsEvent.REQUEST)) {
            String string = JSONUtils.getString(nativeCallContext.getParams(), "url");
            Uri parseUrl2 = UrlUtils.parseUrl(string);
            if (parseUrl2 != null) {
                String host = parseUrl2.getHost();
                if (z) {
                    apiPermissionCheckResult = a(apiPermissionInfo, host, "JSAPI_SP_Config_httpRequest_allowedDomain");
                } else {
                    apiPermissionCheckResult = hasPermission(appId, host, "JSAPI_SP_Config_httpRequest_allowedDomain", page2);
                }
                if (apiPermissionCheckResult != ApiPermissionCheckResult.IGNORE) {
                    String str2 = c;
                    StringBuilder sb2 = new StringBuilder("jsapi_sp_forbidden:");
                    sb2.append(authority);
                    sb2.append("\t is not allowed, in _allowedDomain: ");
                    sb2.append(host);
                    RVLogger.d(str2, sb2.toString());
                }
                if (TextUtils.equals(authority, "httpRequest") || TextUtils.equals(authority, "uploadFile") || TextUtils.equals(authority, RequestPermissionsEvent.REQUEST)) {
                    if (apiPermissionCheckResult != ApiPermissionCheckResult.IGNORE) {
                        boolean isDevSource = AppInfoScene.isDevSource(app.getStartParams());
                        boolean z2 = BundleUtils.getBoolean(app.getStartParams(), "ignoreHttpReqPermission", false);
                        if (!isDevSource || !z2) {
                            return apiPermissionCheckResult;
                        }
                        DomainConfigProxy domainConfigProxy = (DomainConfigProxy) RVProxy.get(DomainConfigProxy.class);
                        String str3 = c;
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(authority);
                        sb3.append("\t ignoreHttpReqPermission: ");
                        RVLogger.d(str3, sb3.toString());
                        if (domainConfigProxy == null || domainConfigProxy.isAlipayDomains(string) || domainConfigProxy.isSeriousAliDomains(string) || domainConfigProxy.isAliDomains(string)) {
                            return apiPermissionCheckResult;
                        }
                        return ApiPermissionCheckResult.IGNORE;
                    } else if (!a(page2, host)) {
                        return apiPermissionCheckResult;
                    } else {
                        String str4 = c;
                        StringBuilder sb4 = new StringBuilder("jsapi_sp_forbidden:");
                        sb4.append(authority);
                        sb4.append("\t is not allowed, in domain blacklist: ");
                        sb4.append(host);
                        sb4.append(" is not allowed");
                        RVLogger.d(str4, sb4.toString());
                        return ApiPermissionCheckResult.DENY_N22111;
                    }
                }
            }
        } else if (apiLevelList != null) {
            for (String next : apiLevelList) {
                String string2 = JSONUtils.getString(nativeCallContext.getParams(), next, (String) null);
                if (!TextUtils.isEmpty(string2)) {
                    if (z) {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(concat);
                        sb5.append("_");
                        sb5.append(next);
                        apiPermissionCheckResult3 = a(apiPermissionInfo, string2, sb5.toString());
                    } else {
                        StringBuilder sb6 = new StringBuilder();
                        sb6.append(concat);
                        sb6.append("_");
                        sb6.append(next);
                        apiPermissionCheckResult3 = hasPermission(appId, string2, sb6.toString(), page2);
                    }
                    if (apiPermissionCheckResult3 != ApiPermissionCheckResult.IGNORE) {
                        String str5 = c;
                        StringBuilder sb7 = new StringBuilder("jsapi_sp_forbidden:");
                        sb7.append(authority);
                        sb7.append(" paramKey: ");
                        sb7.append(next);
                        sb7.append(" content: ");
                        sb7.append(string2);
                        sb7.append(" is not allowed");
                        RVLogger.d(str5, sb7.toString());
                        return apiPermissionCheckResult3;
                    }
                }
            }
            if (TextUtils.equals(authority, "startApp") && (parseUrl = UrlUtils.parseUrl(JSONUtils.getString(JSONUtils.getJSONObject(nativeCallContext.getParams(), "param", (JSONObject) null), "url"))) != null) {
                String host2 = parseUrl.getHost();
                StringBuilder sb8 = new StringBuilder();
                sb8.append(concat);
                sb8.append("_url");
                String obj = sb8.toString();
                if (!z) {
                    apiPermissionCheckResult2 = hasPermission(appId, host2, obj, page2);
                } else if (apiPermissionInfo.getApiLevelList(obj) == null) {
                    return ApiPermissionCheckResult.IGNORE;
                } else {
                    apiPermissionCheckResult2 = a(apiPermissionInfo, host2, obj);
                }
                if (apiPermissionCheckResult2 != ApiPermissionCheckResult.IGNORE) {
                    String str6 = c;
                    StringBuilder sb9 = new StringBuilder("jsapi_sp_forbidden:");
                    sb9.append(authority);
                    sb9.append(" host: ");
                    sb9.append(host2);
                    sb9.append(" is not allowed");
                    RVLogger.d(str6, sb9.toString());
                }
                return apiPermissionCheckResult2;
            }
        }
        return ApiPermissionCheckResult.IGNORE;
    }

    private boolean a(Page page) {
        if (page == null) {
            return false;
        }
        return page.getEmbedType().isEmbedPage();
    }

    public ApiPermissionCheckResult checkEventPermission(String str, String str2, Page page) {
        if (!this.h.containsKey(str)) {
            return ApiPermissionCheckResult.IGNORE;
        }
        return hasPermission(str, str2, "EVENT_List", page);
    }

    private ApiPermissionCheckResult a(ApiPermissionInfo apiPermissionInfo, String str, String str2) {
        if (TextUtils.equals(str2, "Valid_SubResMimeList") || str2.startsWith("JSAPI_SP_Config") || TextUtils.equals(str2, "EVENT_List") || TextUtils.equals(str2, "HttpLink_SubResMimeList") || str2.startsWith("Webview_Config") || TextUtils.equals(str2, "validDomain")) {
            List<String> apiLevelList = apiPermissionInfo.getApiLevelList(str2);
            if (apiLevelList != null && !apiLevelList.isEmpty()) {
                for (String trim : apiLevelList) {
                    try {
                        if (PatternUtils.compile(trim.trim()).matcher(str).find()) {
                            return ApiPermissionCheckResult.IGNORE;
                        }
                    } catch (Exception e2) {
                        RVLogger.e(c, "hasPermission Regex Exception", e2);
                    }
                }
            }
            String str3 = c;
            StringBuilder sb = new StringBuilder("jsapi_sp_forbidden:");
            sb.append(str2);
            sb.append(" not have permssion ,not match regex");
            RVLogger.d(str3, sb.toString());
            if (TextUtils.equals(str2, "Valid_SubResMimeList")) {
                return ApiPermissionCheckResult.DENY_N22105;
            }
            if (str2.startsWith("JSAPI_SP_Config")) {
                return ApiPermissionCheckResult.DENY_N22106;
            }
            if (TextUtils.equals(str2, "EVENT_List")) {
                return ApiPermissionCheckResult.DENY_N22107;
            }
            if (TextUtils.equals(str2, "HttpLink_SubResMimeList")) {
                return ApiPermissionCheckResult.DENY_N22108;
            }
            if (str2.startsWith("Webview_Config")) {
                return ApiPermissionCheckResult.DENY_N22109;
            }
            if (TextUtils.equals(str2, "validDomain")) {
                return ApiPermissionCheckResult.DENY_N22110;
            }
            return ApiPermissionCheckResult.DENY;
        }
        boolean contains = apiPermissionInfo.getApiLevelList(str2).contains(str);
        if (!contains) {
            String str4 = c;
            StringBuilder sb2 = new StringBuilder("jsapi_sp_forbidden:");
            sb2.append(str2);
            sb2.append(" not have permssion");
            RVLogger.d(str4, sb2.toString());
        }
        if (contains) {
            return ApiPermissionCheckResult.IGNORE;
        }
        return ApiPermissionCheckResult.DENY_N22104;
    }

    public ApiPermissionCheckResult hasPermission(String str, String str2, String str3, Page page) {
        if (page == null || page.getApp() == null) {
            RVLogger.d(c, "checkJSApi,page is null");
            return ApiPermissionCheckResult.DENY_N22101;
        }
        return hasPermission(str, str2, str3, page.getApp(), page);
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0111 A[Catch:{ Exception -> 0x013a }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0114 A[Catch:{ Exception -> 0x013a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult hasPermission(java.lang.String r6, java.lang.String r7, java.lang.String r8, com.alibaba.ariver.app.api.App r9, @androidx.annotation.Nullable com.alibaba.ariver.app.api.Page r10) {
        /*
            r5 = this;
            java.lang.String r0 = c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "hasPermission "
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r2 = " "
            r1.append(r2)
            r1.append(r7)
            r1.append(r2)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r1)
            boolean r0 = r5.a((com.alibaba.ariver.app.api.Page) r10)
            if (r0 == 0) goto L_0x002b
            java.lang.String r6 = r9.getAppId()
        L_0x002b:
            java.lang.Class<com.alibaba.ariver.permission.api.extension.IgnorePermissionPoint> r1 = com.alibaba.ariver.permission.api.extension.IgnorePermissionPoint.class
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r1 = com.alibaba.ariver.kernel.api.extension.ExtensionPoint.as(r1)
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r1 = r1.node(r9)
            r3 = 1
            com.alibaba.ariver.kernel.api.extension.ExtensionPoint r1 = r1.useCache(r3)
            com.alibaba.ariver.kernel.api.extension.Extension r1 = r1.create()
            com.alibaba.ariver.permission.api.extension.IgnorePermissionPoint r1 = (com.alibaba.ariver.permission.api.extension.IgnorePermissionPoint) r1
            if (r1 == 0) goto L_0x005a
            boolean r1 = r1.ignoreAppPermission(r6)
            if (r1 == 0) goto L_0x005a
            java.lang.String r7 = c
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r8 = "ignore hasPermission appid\t "
            java.lang.String r6 = r8.concat(r6)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r7, r6)
            com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult r6 = com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult.IGNORE
            return r6
        L_0x005a:
            if (r0 == 0) goto L_0x00aa
            java.lang.Class<com.alibaba.ariver.kernel.common.service.RVConfigService> r0 = com.alibaba.ariver.kernel.common.service.RVConfigService.class
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)     // Catch:{ Exception -> 0x013a }
            com.alibaba.ariver.kernel.common.service.RVConfigService r0 = (com.alibaba.ariver.kernel.common.service.RVConfigService) r0     // Catch:{ Exception -> 0x013a }
            java.lang.String r1 = "ta_canUseWebview"
            java.lang.String r4 = "1"
            java.lang.String r0 = r0.getConfig(r1, r4)     // Catch:{ Exception -> 0x013a }
            java.lang.String r1 = "0"
            boolean r0 = r1.equals(r0)     // Catch:{ Exception -> 0x013a }
            r0 = r0 ^ r3
            if (r0 != 0) goto L_0x007f
            java.lang.String r6 = c     // Catch:{ Exception -> 0x013a }
            java.lang.String r7 = "hasPermission...webview is not supported!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r6, r7)     // Catch:{ Exception -> 0x013a }
            com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult r6 = com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult.DENY     // Catch:{ Exception -> 0x013a }
            return r6
        L_0x007f:
            java.lang.String r0 = "validDomain"
            boolean r0 = r8.startsWith(r0)     // Catch:{ Exception -> 0x013a }
            if (r0 == 0) goto L_0x00aa
            android.os.Bundle r8 = r10.getStartParams()     // Catch:{ Exception -> 0x013a }
            java.lang.String r0 = "ignoreWebViewDomainCheck"
            r1 = 0
            boolean r8 = com.alibaba.ariver.kernel.common.utils.BundleUtils.getBoolean(r8, r0, r1)     // Catch:{ Exception -> 0x013a }
            android.os.Bundle r10 = r10.getStartParams()     // Catch:{ Exception -> 0x013a }
            boolean r10 = com.alibaba.ariver.resource.api.models.AppInfoScene.isDevSource(r10)     // Catch:{ Exception -> 0x013a }
            if (r8 == 0) goto L_0x00a8
            if (r10 == 0) goto L_0x00a8
            java.lang.String r6 = c     // Catch:{ Exception -> 0x013a }
            java.lang.String r7 = "ignore embed webview domain veriy."
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r6, r7)     // Catch:{ Exception -> 0x013a }
            com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult r6 = com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult.IGNORE     // Catch:{ Exception -> 0x013a }
            return r6
        L_0x00a8:
            java.lang.String r8 = "Webview_Config_allowedDomain"
        L_0x00aa:
            java.lang.Class<com.alibaba.ariver.app.api.service.TinyAppInnerProxy> r10 = com.alibaba.ariver.app.api.service.TinyAppInnerProxy.class
            java.lang.Object r10 = com.alibaba.ariver.kernel.common.RVProxy.get(r10)     // Catch:{ Exception -> 0x013a }
            com.alibaba.ariver.app.api.service.TinyAppInnerProxy r10 = (com.alibaba.ariver.app.api.service.TinyAppInnerProxy) r10     // Catch:{ Exception -> 0x013a }
            if (r10 == 0) goto L_0x00c6
            if (r9 == 0) goto L_0x00c6
            boolean r9 = r10.isInner(r9)     // Catch:{ Exception -> 0x013a }
            if (r9 == 0) goto L_0x00c6
            java.lang.String r6 = c     // Catch:{ Exception -> 0x013a }
            java.lang.String r7 = "hasPermission...isInner just ignore!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r6, r7)     // Catch:{ Exception -> 0x013a }
            com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult r6 = com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult.IGNORE     // Catch:{ Exception -> 0x013a }
            return r6
        L_0x00c6:
            boolean r9 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x013a }
            if (r9 != 0) goto L_0x010e
            boolean r9 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Exception -> 0x013a }
            if (r9 != 0) goto L_0x010e
            boolean r9 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x013a }
            if (r9 != 0) goto L_0x010e
            java.util.Map<java.lang.String, com.alibaba.ariver.permission.model.ApiPermissionInfo> r9 = r5.h     // Catch:{ Exception -> 0x013a }
            if (r9 == 0) goto L_0x010e
            java.util.Map<java.lang.String, com.alibaba.ariver.permission.model.ApiPermissionInfo> r9 = r5.h     // Catch:{ Exception -> 0x013a }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ Exception -> 0x013a }
            if (r9 == 0) goto L_0x010e
            java.util.Map<java.lang.String, com.alibaba.ariver.permission.model.ApiPermissionInfo> r9 = r5.h     // Catch:{ Exception -> 0x013a }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ Exception -> 0x013a }
            com.alibaba.ariver.permission.model.ApiPermissionInfo r9 = (com.alibaba.ariver.permission.model.ApiPermissionInfo) r9     // Catch:{ Exception -> 0x013a }
            java.util.List r9 = r9.getApiLevelList(r8)     // Catch:{ Exception -> 0x013a }
            if (r9 == 0) goto L_0x010e
            java.util.Map<java.lang.String, com.alibaba.ariver.permission.model.ApiPermissionInfo> r9 = r5.h     // Catch:{ Exception -> 0x013a }
            java.lang.Object r9 = r9.get(r6)     // Catch:{ Exception -> 0x013a }
            com.alibaba.ariver.permission.model.ApiPermissionInfo r9 = (com.alibaba.ariver.permission.model.ApiPermissionInfo) r9     // Catch:{ Exception -> 0x013a }
            java.util.List r9 = r9.getApiLevelList(r8)     // Catch:{ Exception -> 0x013a }
            boolean r9 = r9.isEmpty()     // Catch:{ Exception -> 0x013a }
            if (r9 == 0) goto L_0x0105
            goto L_0x010e
        L_0x0105:
            java.util.Map<java.lang.String, com.alibaba.ariver.permission.model.ApiPermissionInfo> r9 = r5.h     // Catch:{ Exception -> 0x013a }
            java.lang.Object r6 = r9.get(r6)     // Catch:{ Exception -> 0x013a }
            com.alibaba.ariver.permission.model.ApiPermissionInfo r6 = (com.alibaba.ariver.permission.model.ApiPermissionInfo) r6     // Catch:{ Exception -> 0x013a }
            goto L_0x010f
        L_0x010e:
            r6 = 0
        L_0x010f:
            if (r6 != 0) goto L_0x0114
            com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult r6 = com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult.DENY     // Catch:{ Exception -> 0x013a }
            return r6
        L_0x0114:
            com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult r6 = r5.a((com.alibaba.ariver.permission.model.ApiPermissionInfo) r6, (java.lang.String) r7, (java.lang.String) r8)     // Catch:{ Exception -> 0x013a }
            java.lang.String r9 = c     // Catch:{ Exception -> 0x013a }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x013a }
            java.lang.String r0 = "hasPermission..."
            r10.<init>(r0)     // Catch:{ Exception -> 0x013a }
            r10.append(r7)     // Catch:{ Exception -> 0x013a }
            r10.append(r2)     // Catch:{ Exception -> 0x013a }
            r10.append(r8)     // Catch:{ Exception -> 0x013a }
            java.lang.String r7 = " result "
            r10.append(r7)     // Catch:{ Exception -> 0x013a }
            r10.append(r6)     // Catch:{ Exception -> 0x013a }
            java.lang.String r7 = r10.toString()     // Catch:{ Exception -> 0x013a }
            com.alibaba.ariver.kernel.common.utils.RVLogger.debug(r9, r7)     // Catch:{ Exception -> 0x013a }
            return r6
        L_0x013a:
            r6 = move-exception
            java.lang.String r7 = c
            java.lang.String r8 = "hasPermission Exception!"
            com.alibaba.ariver.kernel.common.utils.RVLogger.e(r7, r8, r6)
            com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult r6 = com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult.IGNORE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.permission.service.DefaultAuthenticationProxyImpl.hasPermission(java.lang.String, java.lang.String, java.lang.String, com.alibaba.ariver.app.api.App, com.alibaba.ariver.app.api.Page):com.alibaba.ariver.kernel.api.security.ApiPermissionCheckResult");
    }

    public boolean shouldInterceptWebViewNaviJsApi(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String equals : f10132a) {
            if (str2.equals(equals)) {
                return false;
            }
        }
        List<String> stringArray = JSONUtils.toStringArray(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigJSONArray("ta_webviewAppIdWhiteList"));
        if (stringArray != null) {
            for (String equals2 : stringArray) {
                if (TextUtils.equals(equals2, str)) {
                    RVLogger.d(c, "shouldInterceptWebViewNaviJsApi...appId in white list:".concat(String.valueOf(str2)));
                    return false;
                }
            }
        }
        RVLogger.d(c, "shouldInterceptWebViewNaviJsApi...not allowed: ".concat(String.valueOf(str2)));
        return true;
    }

    public void clearPermissionModel(String str, boolean z) {
        if (b(str)) {
            if (this.i.containsKey(str)) {
                this.i.remove(str);
            }
            if (this.h.get(str) != null) {
                this.h.get(str).clear();
                this.h.remove(str);
            }
            if (z) {
                this.f.remove(str);
            }
        }
    }

    public boolean checkShowPermissionDialog(Permission permission, final NativeCallContext nativeCallContext, final BridgeResponseHelper bridgeResponseHelper, final Page page) {
        return checkShowPermissionDialog(permission, nativeCallContext, (AuthenticationProxy.LocalPermissionCallback) new AuthenticationProxy.LocalPermissionCallback() {
            public void onPositive() {
                page.getApp().getEngineProxy().getBridge().sendToNative(nativeCallContext, bridgeResponseHelper.getInnerBridgeResponse(), false);
            }

            public void onNegative(boolean z) {
                if (z) {
                    bridgeResponseHelper.sendUserNotGrantPermission();
                } else {
                    bridgeResponseHelper.sendSilentDenyPermission();
                }
            }
        }, page);
    }

    public boolean checkShowPermissionDialog(Permission permission, NativeCallContext nativeCallContext, AuthenticationProxy.LocalPermissionCallback localPermissionCallback, Page page) {
        TinyAppInnerProxy tinyAppInnerProxy = (TinyAppInnerProxy) RVProxy.get(TinyAppInnerProxy.class);
        if (tinyAppInnerProxy == null || page.getApp() == null || !tinyAppInnerProxy.isInner(page.getApp())) {
            return this.j.a(permission, nativeCallContext, localPermissionCallback, page);
        }
        RVLogger.d(c, "checkShowPermissionDialog isInner ");
        return false;
    }

    public Map<String, Boolean> getAllPermissions(String str, String str2, @Nullable AppModel appModel, @Nullable Page page) {
        if (this.j == null) {
            this.j = new LocalAuthPermissionManager();
        }
        return this.j.a(str2, appModel, page, this.f);
    }

    public Map<String, Boolean> getAllPermissions(String str, String str2, @Nullable AppModel appModel, String str3) {
        if (this.j == null) {
            this.j = new LocalAuthPermissionManager();
        }
        return this.j.a(str2, appModel, this.f, str3);
    }

    public void setPermissionState(String str, String str2, String str3, String str4, boolean z) {
        if (this.j == null) {
            this.j = new LocalAuthPermissionManager();
        }
        this.j.a(str2, str4, str3, z ? "1" : "0");
    }

    public void removeAllPermissionInfo(String str, String str2) {
        if (this.j == null) {
            this.j = new LocalAuthPermissionManager();
        }
        this.j.a(str, str2);
    }

    private ApiPermissionCheckResult a(String str, String str2, String str3, Page page) {
        RVLogger.d(c, "hasPermissionOnIframe...url=".concat(String.valueOf(str2)));
        return hasPermission(str, str2, str3, page);
    }

    public ApiPermissionCheckResult interceptUrlForTiny(String str, String str2, Page page, boolean z) {
        String str3;
        Uri parseUrl = UrlUtils.parseUrl(str);
        if (parseUrl != null) {
            String scheme = parseUrl.getScheme();
            if (scheme != null && b.contains(scheme.toLowerCase())) {
                return ApiPermissionCheckResult.IGNORE;
            }
            str3 = parseUrl.getHost();
        } else {
            str3 = "";
        }
        if (TextUtils.isEmpty(str2)) {
            if (!a(page)) {
                return ApiPermissionCheckResult.IGNORE;
            }
            str2 = page.getApp().getAppId();
        }
        PermissionModel permissionModel = this.i.get(str2);
        ApiPermissionCheckResult apiPermissionCheckResult = ApiPermissionCheckResult.IGNORE;
        if (permissionModel == null) {
            return apiPermissionCheckResult;
        }
        if (z) {
            return a(str2, str3, "validDomain", page);
        }
        return hasPermission(str2, str3, "validDomain", page);
    }

    private ApiPermissionCheckResult a(String str, Page page) {
        if (page == null || page.getStartParams() == null || TextUtils.isEmpty(str)) {
            return ApiPermissionCheckResult.IGNORE;
        }
        String string = BundleUtils.getString(page.getStartParams(), "MINI-PROGRAM-WEB-VIEW-TAG");
        if (!BundleUtils.getBoolean(page.getStartParams(), RVParams.isTinyApp, false) || TextUtils.isEmpty(string)) {
            return ApiPermissionCheckResult.IGNORE;
        }
        String configWithProcessCache = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("ta_webview_alipays_whitelist", "");
        if (TextUtils.isEmpty(configWithProcessCache)) {
            configWithProcessCache = "none";
        }
        if ("all".equalsIgnoreCase(configWithProcessCache) || page == null) {
            return ApiPermissionCheckResult.IGNORE;
        }
        try {
            for (String equalsIgnoreCase : configWithProcessCache.split(",")) {
                if (string.equalsIgnoreCase(equalsIgnoreCase)) {
                    RVLogger.d(c, "interceptH5EmbedWebViewWithScheme appid in whiteList ".concat(String.valueOf(string)));
                    return ApiPermissionCheckResult.IGNORE;
                }
            }
            String decode = UrlUtils.decode(str);
            if (!TextUtils.isEmpty(decode) && decode.contains("scheme=alipays://platformapi/startapp")) {
                RVLogger.d(c, "start_app_forbidden:url contain alipay schema");
                return ApiPermissionCheckResult.DENY_N22206;
            }
        } catch (Throwable th) {
            RVLogger.e(c, "interceptH5EmbedWebViewWithScheme: ", th);
        }
        return ApiPermissionCheckResult.IGNORE;
    }

    public ApiPermissionCheckResult interceptSchemeForTiny(String str, Page page) {
        if (str == null) {
            return ApiPermissionCheckResult.IGNORE;
        }
        ApiPermissionCheckResult a2 = a(str, page);
        if (a2 != ApiPermissionCheckResult.IGNORE) {
            return a2;
        }
        if (str.startsWith("http") || str.startsWith("javascript")) {
            return ApiPermissionCheckResult.IGNORE;
        }
        if ("no".equalsIgnoreCase(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfigWithProcessCache("h5_interceptSchemeForTiny", ""))) {
            return ApiPermissionCheckResult.IGNORE;
        }
        if (page == null) {
            return ApiPermissionCheckResult.IGNORE;
        }
        if (hasPermissionModel(BundleUtils.getString(page.getStartParams(), "appId"), page)) {
            return hasPermissionOnScheme(str, page);
        }
        return ApiPermissionCheckResult.IGNORE;
    }

    public ApiPermissionCheckResult hasPermissionOnScheme(String str, Page page) {
        Uri parseUrl;
        if (!a(page)) {
            return ApiPermissionCheckResult.IGNORE;
        }
        String appId = page.getApp().getAppId();
        if (TextUtils.isEmpty(str)) {
            return ApiPermissionCheckResult.IGNORE;
        }
        for (String startsWith : b) {
            if (str.startsWith(startsWith)) {
                return ApiPermissionCheckResult.IGNORE;
            }
        }
        try {
            boolean equals = "1".equals(((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig("ta_close_webviewSchemaWhiteList", "0"));
            String extractAppIdFromUrl = ((RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)).extractAppIdFromUrl(str);
            if (!equals && !TextUtils.isEmpty(extractAppIdFromUrl)) {
                ApiPermissionCheckResult apiPermissionCheckResult = ApiPermissionCheckResult.DENY;
                if (this.h == null) {
                    return apiPermissionCheckResult;
                }
                if (hasPermission(appId, "startApp", "JSAPI_List", page) != ApiPermissionCheckResult.IGNORE) {
                    RVLogger.d(c, "start_app_forbidden: not have (startApp) ");
                    return ApiPermissionCheckResult.DENY_N22202;
                }
                ApiPermissionCheckResult hasPermission = hasPermission(appId, extractAppIdFromUrl, "JSAPI_SP_Config_startApp_appId", page);
                if (hasPermission != ApiPermissionCheckResult.IGNORE) {
                    RVLogger.d(c, "start_app_forbidden: not have startApp: ".concat(String.valueOf(extractAppIdFromUrl)));
                    return ApiPermissionCheckResult.DENY_N22203;
                }
                Uri parseUrl2 = UrlUtils.parseUrl(str);
                String queryParameter = parseUrl2 != null ? parseUrl2.getQueryParameter("url") : null;
                if (TextUtils.isEmpty(queryParameter) || (parseUrl = UrlUtils.parseUrl(queryParameter)) == null) {
                    return hasPermission;
                }
                ApiPermissionCheckResult hasPermission2 = hasPermission(appId, parseUrl.getHost(), "JSAPI_SP_Config_startApp_url", page);
                if (hasPermission2 == ApiPermissionCheckResult.IGNORE) {
                    return hasPermission2;
                }
                RVLogger.d(c, "start_app_forbidden: not have startApp: ".concat(String.valueOf(queryParameter)));
                return ApiPermissionCheckResult.DENY_N22204;
            }
        } catch (Throwable th) {
            RVLogger.e(c, th);
        }
        if (str.startsWith("http")) {
            return ApiPermissionCheckResult.IGNORE;
        }
        RVLogger.d(c, "schema_forbidden: scheme is not http，https，alipay schema");
        RVLogger.d(c, "hasPermissionOnScheme...non-http url, no permission");
        return ApiPermissionCheckResult.DENY_N22205;
    }

    private boolean a(Bundle bundle, String str) {
        if (!"tyroRequest".equals(str) && !"showRemoteDebugPanel".equals(str) && !"showRemoteDebugMask".equals(str)) {
            return false;
        }
        int i2 = AnonymousClass2.f10134a[AppInfoScene.extractScene(bundle).ordinal()];
        if (i2 == 1 || i2 == 2) {
            return false;
        }
        return true;
    }

    /* renamed from: com.alibaba.ariver.permission.service.DefaultAuthenticationProxyImpl$2  reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10134a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.alibaba.ariver.resource.api.models.AppInfoScene[] r0 = com.alibaba.ariver.resource.api.models.AppInfoScene.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10134a = r0
                com.alibaba.ariver.resource.api.models.AppInfoScene r1 = com.alibaba.ariver.resource.api.models.AppInfoScene.DEBUG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10134a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.alibaba.ariver.resource.api.models.AppInfoScene r1 = com.alibaba.ariver.resource.api.models.AppInfoScene.INSPECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.permission.service.DefaultAuthenticationProxyImpl.AnonymousClass2.<clinit>():void");
        }
    }
}
