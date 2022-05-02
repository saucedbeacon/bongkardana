package com.alibaba.ariver.permission;

import android.text.TextUtils;
import androidx.annotation.Keep;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.ariver.kernel.RVParams;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgePermission;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.security.Accessor;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.utils.BundleUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alibaba.ariver.permission.api.proxy.AuthenticationProxy;
import com.alibaba.ariver.permission.model.ApiPermissionInfo;
import com.alibaba.ariver.resource.api.models.AppInfoQuery;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.PermissionModel;
import com.alibaba.ariver.resource.api.proxy.RVAppInfoManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Keep
public class AppPermissionUtils {
    public static final String ALIPAY_WEB_COMMON_APPID = "20000067";
    public static final String TAG = "AriverPermission:AppPermissionUtils";

    public static boolean isAppPermission(Accessor accessor) {
        String permissionAppId = getPermissionAppId(accessor);
        if (permissionAppId == null) {
            RVLogger.d(TAG, "isAppPermission getAppId return null!!! accessor: ".concat(String.valueOf(accessor)));
            return false;
        } else if (((AuthenticationProxy) RVProxy.get(AuthenticationProxy.class)).getPermissionModel(permissionAppId) == null && !isNoPermissionConfigAndAllow(accessor, permissionAppId)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isNoPermissionConfigAndAllow(Accessor accessor, String str) {
        if (accessor instanceof Page) {
            boolean z = BundleUtils.getBoolean(((Page) accessor).getStartParams(), RVParams.isTinyApp, false);
            RVConfigService rVConfigService = (RVConfigService) RVProxy.get(RVConfigService.class);
            if (!z || rVConfigService == null || "no".equals(rVConfigService.getConfig("h5_enableTinyIgnorePermission", "yes"))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static String getPermissionAppId(Accessor accessor) {
        App app = getApp(accessor);
        if (app != null) {
            return app.getAppId();
        }
        return null;
    }

    public static PermissionModel getPermissionModel(App app) {
        AppModel appModel = (AppModel) BundleUtils.getParcelable(app.getSceneParams(), "appInfo");
        if (appModel != null) {
            return appModel.getPermissionModel();
        }
        return null;
    }

    public static PermissionModel parsePermissionJson(byte[] bArr) {
        return PermissionModel.generateFromJSON(bArr);
    }

    public static PermissionModel parsePermissionModel(App app) {
        AppInfoQuery appInfoQuery = new AppInfoQuery(app.getAppId());
        if (AppInfoScene.isDevSource(app.getStartParams())) {
            appInfoQuery.scene(AppInfoScene.extractScene(app.getStartParams()));
            appInfoQuery.version(AppInfoScene.extractSceneVersion(app.getStartParams()));
        }
        AppModel appModel = ((RVAppInfoManager) RVProxy.get(RVAppInfoManager.class)).getAppModel(appInfoQuery);
        if (appModel != null) {
            return appModel.getPermissionModel();
        }
        return null;
    }

    public static PermissionModel getPermissionModel(Accessor accessor) {
        App app;
        if (!(accessor instanceof Node)) {
            return null;
        }
        Node node = (Node) accessor;
        int i = 5;
        while (true) {
            if (node == null) {
                break;
            }
            int i2 = i - 1;
            if (i <= 0) {
                break;
            } else if (node instanceof App) {
                app = (App) node;
                break;
            } else {
                node = node.getParentNode();
                i = i2;
            }
        }
        app = null;
        if (app == null) {
            return null;
        }
        return getPermissionModel(app);
    }

    public static App getApp(Accessor accessor) {
        if (!(accessor instanceof Node)) {
            return null;
        }
        Node node = (Node) accessor;
        int i = 5;
        while (node != null) {
            int i2 = i - 1;
            if (i <= 0) {
                break;
            } else if (node instanceof App) {
                return (App) node;
            } else {
                node = node.getParentNode();
                i = i2;
            }
        }
        return null;
    }

    public static ApiPermissionInfo convert2ApiPermissionInfo(PermissionModel permissionModel) {
        JSONArray jSONArray;
        try {
            RVLogger.debug(TAG, "convert2ApiPermissionInfo ".concat(String.valueOf(permissionModel)));
            if (permissionModel != null) {
                ApiPermissionInfo apiPermissionInfo = new ApiPermissionInfo();
                apiPermissionInfo.setApiLevelStr("Enable_Proxy", permissionModel.getEnableProxy());
                Set<String> jsapiList = permissionModel.getJsapiList();
                if (jsapiList != null && !jsapiList.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (String next : jsapiList) {
                        if (next instanceof String) {
                            arrayList.add(next);
                        }
                    }
                    apiPermissionInfo.setApiLevelList("JSAPI_List", arrayList);
                }
                Set<String> eventList = permissionModel.getEventList();
                if (eventList != null && !eventList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (String next2 : eventList) {
                        if (next2 instanceof String) {
                            arrayList2.add(next2);
                        }
                    }
                    apiPermissionInfo.setApiLevelList("EVENT_List", arrayList2);
                }
                Set<String> validDomains = permissionModel.getValidDomains();
                if (validDomains != null && !validDomains.isEmpty()) {
                    ArrayList arrayList3 = new ArrayList();
                    for (String next3 : validDomains) {
                        if (next3 instanceof String) {
                            arrayList3.add(next3);
                        }
                    }
                    apiPermissionInfo.setApiLevelList("validDomain", arrayList3);
                }
                JSONObject specialConfigs = permissionModel.getSpecialConfigs();
                if (specialConfigs != null && !specialConfigs.isEmpty()) {
                    for (String next4 : specialConfigs.keySet()) {
                        JSONObject jSONObject = JSONUtils.getJSONObject(specialConfigs, next4, (JSONObject) null);
                        if (jSONObject != null) {
                            ArrayList arrayList4 = new ArrayList();
                            for (String next5 : jSONObject.keySet()) {
                                arrayList4.add(next5);
                                JSONArray jSONArray2 = JSONUtils.getJSONArray(jSONObject, next5, (JSONArray) null);
                                if (jSONArray2 != null && !jSONArray2.isEmpty()) {
                                    ArrayList arrayList5 = new ArrayList();
                                    Iterator<Object> it = jSONArray2.iterator();
                                    while (it.hasNext()) {
                                        Object next6 = it.next();
                                        if (next6 instanceof String) {
                                            arrayList5.add((String) next6);
                                        }
                                    }
                                    StringBuilder sb = new StringBuilder("JSAPI_SP_Config_");
                                    sb.append(next4);
                                    sb.append("_");
                                    sb.append(next5);
                                    apiPermissionInfo.setApiLevelList(sb.toString(), arrayList5);
                                }
                            }
                            apiPermissionInfo.setApiLevelList("JSAPI_SP_Config_".concat(String.valueOf(next4)), arrayList4);
                        }
                    }
                }
                Set<String> validSubResMimeList = permissionModel.getValidSubResMimeList();
                if (validSubResMimeList != null && !validSubResMimeList.isEmpty()) {
                    ArrayList arrayList6 = new ArrayList();
                    for (String next7 : validSubResMimeList) {
                        if (next7 instanceof String) {
                            arrayList6.add(next7);
                        }
                    }
                    apiPermissionInfo.setApiLevelList("Valid_SubResMimeList", arrayList6);
                }
                Set<String> httpLinkSubResMimeList = permissionModel.getHttpLinkSubResMimeList();
                if (httpLinkSubResMimeList != null && !httpLinkSubResMimeList.isEmpty()) {
                    ArrayList arrayList7 = new ArrayList();
                    for (String next8 : httpLinkSubResMimeList) {
                        if (next8 instanceof String) {
                            arrayList7.add(next8);
                        }
                    }
                    apiPermissionInfo.setApiLevelList("HttpLink_SubResMimeList", arrayList7);
                }
                JSONObject webviewConfigs = permissionModel.getWebviewConfigs();
                if (!webviewConfigs.isEmpty() && (jSONArray = webviewConfigs.getJSONArray("allowedDomain")) != null) {
                    ArrayList arrayList8 = new ArrayList();
                    Iterator<Object> it2 = jSONArray.iterator();
                    while (it2.hasNext()) {
                        Object next9 = it2.next();
                        if (next9 instanceof String) {
                            arrayList8.add((String) next9);
                        }
                    }
                    apiPermissionInfo.setApiLevelList("Webview_Config_allowedDomain", arrayList8);
                }
                apiPermissionInfo.setApiLevelStr("ForceUseSSL", permissionModel.getForceUseSsl());
                apiPermissionInfo.setHasPermissionFile(true);
                return apiPermissionInfo;
            }
        } catch (Exception e) {
            RVLogger.e(TAG, (Throwable) e);
        }
        return null;
    }

    public static List<Permission> parseJsApiPermission(PermissionModel permissionModel) {
        Set<String> jsapiList = permissionModel.getJsapiList();
        if (jsapiList == null || jsapiList.size() == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (String next : jsapiList) {
            arrayList.add(new BridgePermission(next, next));
        }
        return arrayList;
    }

    public static String getAggregationMainAppId(AppModel appModel) {
        JSONObject jSONObject;
        if (appModel == null || appModel.getExtendInfos() == null || (jSONObject = JSONUtils.getJSONObject(appModel.getExtendInfos(), RVConstants.EXTRA_RES_LAUNCH_PARAMS, (JSONObject) null)) == null) {
            return null;
        }
        return JSONUtils.getString(jSONObject, "aggregationMainAppId");
    }

    public static String getAggregationMainAppIdForH5Page(String str, String str2) {
        if (TextUtils.isEmpty(str) || !"20000067".equals(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_");
        sb.append(UrlUtils.getHost(str2));
        return sb.toString();
    }
}
