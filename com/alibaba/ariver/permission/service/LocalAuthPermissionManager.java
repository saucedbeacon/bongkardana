package com.alibaba.ariver.permission.service;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.EntryInfo;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.bridge.model.NativeCallContext;
import com.alibaba.ariver.kernel.api.node.Node;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVAccountService;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.ariver.kernel.common.storage.KVStorageProxy;
import com.alibaba.ariver.kernel.common.utils.ExecutorUtils;
import com.alibaba.ariver.kernel.common.utils.JSONUtils;
import com.alibaba.ariver.kernel.common.utils.ProcessUtils;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.ariver.kernel.common.utils.UrlUtils;
import com.alibaba.ariver.permission.AppPermissionUtils;
import com.alibaba.ariver.permission.R;
import com.alibaba.ariver.permission.api.proxy.AuthDialogProxy;
import com.alibaba.ariver.permission.api.proxy.AuthenticationProxy;
import com.alibaba.ariver.permission.api.proxy.SettingExtendProxy;
import com.alibaba.ariver.permission.view.LocalPermissionDialog;
import com.alibaba.ariver.permission.view.PermissionPermitListener;
import com.alibaba.ariver.resource.api.models.AppInfoModel;
import com.alibaba.ariver.resource.api.models.AppInfoQuery;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.alibaba.ariver.resource.api.models.DynamicPluginInfo;
import com.alibaba.ariver.resource.api.models.PermissionModel;
import com.alibaba.ariver.resource.api.models.PluginModel;
import com.alibaba.ariver.resource.api.proxy.RVAppInfoManager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.constants.GriverBaseConstants;
import com.alipay.mobile.verifyidentity.business.securitycommon.bean.SecurityConstants;
import id.dana.sendmoney.summary.SummaryActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class LocalAuthPermissionManager {

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, String> f9030a = new ConcurrentHashMap<>();
    public static ConcurrentHashMap<String, String> b = new ConcurrentHashMap<>();
    public static final List<String> c;
    private static boolean d = false;
    private String e;

    public interface SCOPE {
        public static final String CONST_SCOPE_ADDRESS = "scope.address";
        public static final String CONST_SCOPE_ALI_RUN = "scope.alirun";
        public static final String CONST_SCOPE_BLUETOOTH = "scope.bluetooth";
        public static final String CONST_SCOPE_CAMERA = "scope.camera";
        public static final String CONST_SCOPE_CONTACT = "scope.contact";
        public static final String CONST_SCOPE_INVOICE_TITLE = "scope.invoiceTitle";
        public static final String CONST_SCOPE_RECORD = "scope.audioRecord";
        public static final String CONST_SCOPE_TB_AUTH = "scope.ta_tb_auth";
        public static final String CONST_SCOPE_USERINFO = "scope.userInfo";
        public static final String CONST_SCOPE_USERLOCATION = "scope.location";
        public static final String CONST_SCOPE_WRITE_PHOTOS_ALBUM = "scope.album";
    }

    static {
        ArrayList arrayList = new ArrayList();
        c = arrayList;
        arrayList.add("NBComponent.render");
        c.add("NBComponent.sendMessage");
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public Map<String, List<b>> f10138a = new ConcurrentHashMap();

        @Nullable
        public static List<b> a(Node node, String str) {
            Map<String, List<b>> map;
            App app = (App) node.bubbleFindNode(App.class);
            if (app == null || (map = ((a) app.getData(a.class, true)).f10138a) == null) {
                return null;
            }
            return map.get(str);
        }

        public static void a(Node node, String str, List<b> list) {
            App app = (App) node.bubbleFindNode(App.class);
            if (app != null) {
                Map<String, List<b>> map = ((a) app.getData(a.class, true)).f10138a;
                StringBuilder sb = new StringBuilder("PermissionDialogData add scope ");
                sb.append(str);
                sb.append(" resultObjects ");
                sb.append(list);
                sb.append(" with node: ");
                sb.append(app);
                RVLogger.d("AriverPermission:LocalAuthPermissionManager", sb.toString());
                if (map != null) {
                    map.put(str, list);
                }
            }
        }

        @Nullable
        public static List<b> b(Node node, String str) {
            App app = (App) node.bubbleFindNode(App.class);
            if (app == null) {
                return null;
            }
            Map<String, List<b>> map = ((a) app.getData(a.class, true)).f10138a;
            StringBuilder sb = new StringBuilder("PermissionDialogData remove scope ");
            sb.append(str);
            sb.append(" with node: ");
            sb.append(app);
            RVLogger.d("AriverPermission:LocalAuthPermissionManager", sb.toString());
            if (map != null) {
                return map.remove(str);
            }
            return null;
        }
    }

    public LocalAuthPermissionManager() {
        b();
        a();
    }

    private void a() {
        a(ProcessUtils.getContext());
    }

    private void a(Context context) {
        try {
            SettingExtendProxy settingExtendProxy = (SettingExtendProxy) RVProxy.get(SettingExtendProxy.class);
            if (settingExtendProxy != null) {
                String extendAction = settingExtendProxy.getExtendAction();
                String extendDescription = settingExtendProxy.getExtendDescription();
                this.e = settingExtendProxy.getExtendScope();
                if (!TextUtils.isEmpty(extendAction) && !TextUtils.isEmpty(extendDescription)) {
                    JSONArray parseArray = JSONUtils.parseArray(extendAction);
                    JSONArray parseArray2 = JSONUtils.parseArray(extendDescription);
                    JSONArray parseArray3 = JSONUtils.parseArray(this.e);
                    if (parseArray != null && parseArray2 != null && parseArray.size() > 0 && parseArray2.size() > 0) {
                        for (int i = 0; i < parseArray.size(); i++) {
                            RVLogger.d("AriverPermission:LocalAuthPermissionManager", "put ext action ".concat(String.valueOf(extendAction)));
                            String str = (String) parseArray.get(i);
                            f9030a.put(str, (String) parseArray2.get(i));
                            b.put(str, (String) parseArray3.get(i));
                        }
                    }
                }
            }
        } catch (Exception e2) {
            RVLogger.e("AriverPermission:LocalAuthPermissionManager", "loadExtApiForInside exception", e2);
        }
    }

    private void b() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        if (!d) {
            d = true;
            Context context = ProcessUtils.getContext();
            if (context == null) {
                str6 = "Use your location";
                str5 = "Access your camera";
                str4 = "Visit your album";
                str3 = "Use your microphone";
                str2 = "Use your bluetooth";
                str = "Visit your contact";
            } else {
                Resources resources = context.getResources();
                String string = resources.getString(R.string.tiny_request_location_permission);
                String string2 = resources.getString(R.string.tiny_request_camera_permission);
                str3 = resources.getString(R.string.tiny_request_record_permission);
                String string3 = resources.getString(R.string.tiny_request_photo_permission);
                String string4 = resources.getString(R.string.tiny_request_bluetooth_permission);
                str = resources.getString(R.string.tiny_request_contact_permission);
                str6 = string;
                str5 = string2;
                str4 = string3;
                str2 = string4;
            }
            f9030a.put("getLocation", str6);
            f9030a.put("getCurrentLocation", str6);
            f9030a.put("authMapLocation", str6);
            f9030a.put("scan", str5);
            f9030a.put("chooseImage", "%s\n%s");
            f9030a.put("chooseVideo", "%s\n%s");
            f9030a.put("saveImage", str4);
            f9030a.put("startAudioRecord", str3);
            f9030a.put("stopAudioRecord", str3);
            f9030a.put("cancelAudioRecord", str3);
            f9030a.put("saveVideoToPhotosAlbum", str4);
            f9030a.put("shareTokenImageSilent", str4);
            f9030a.put("enableBluetooth", str2);
            f9030a.put("connectBLEDevice", str2);
            f9030a.put("openBluetoothAdapter", str2);
            f9030a.put("getBeacons", str2);
            f9030a.put("NBComponent.render", "%s\n%s");
            f9030a.put("NBComponent.sendMessage", "%s\n%s");
            f9030a.put("contact", str);
            f9030a.put("chooseContact", str);
            f9030a.put("APSocialNebulaPlugin.selectContactJSAPI", str);
        }
    }

    private boolean a(Page page) {
        if (page == null) {
            return false;
        }
        return page.getEmbedType().isEmbedPage();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        com.alibaba.ariver.kernel.common.utils.RVLogger.d("AriverPermission:LocalAuthPermissionManager", "domain exception hits: domain: ".concat(java.lang.String.valueOf(r15)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00f0, code lost:
        r3 = true;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x016f  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0175  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.alibaba.ariver.kernel.api.security.Permission r22, com.alibaba.ariver.engine.api.bridge.model.NativeCallContext r23, com.alibaba.ariver.permission.api.proxy.AuthenticationProxy.LocalPermissionCallback r24, com.alibaba.ariver.app.api.Page r25) {
        /*
            r21 = this;
            r10 = r21
            r7 = r24
            r2 = r25
            java.lang.String r0 = "domain"
            java.lang.String r1 = "20000067"
            java.lang.String r3 = "is_on"
            java.lang.String r4 = "AriverPermission:LocalAuthPermissionManager"
            r5 = 0
            if (r2 == 0) goto L_0x046c
            com.alibaba.ariver.app.api.App r6 = r25.getApp()
            if (r6 != 0) goto L_0x0019
            goto L_0x046c
        L_0x0019:
            com.alibaba.ariver.app.api.App r6 = r25.getApp()
            java.lang.Class<com.alibaba.ariver.resource.api.models.AppModel> r8 = com.alibaba.ariver.resource.api.models.AppModel.class
            java.lang.Object r6 = r6.getData(r8)
            com.alibaba.ariver.resource.api.models.AppModel r6 = (com.alibaba.ariver.resource.api.models.AppModel) r6
            if (r6 != 0) goto L_0x0029
            r9 = 0
            goto L_0x002d
        L_0x0029:
            com.alibaba.ariver.resource.api.models.PermissionModel r9 = r6.getPermissionModel()
        L_0x002d:
            if (r9 == 0) goto L_0x0037
            com.alibaba.fastjson.JSONObject r12 = r9.getNativeApiUserAuth()
            if (r12 == 0) goto L_0x0037
            r12 = 0
            goto L_0x0038
        L_0x0037:
            r12 = 1
        L_0x0038:
            com.alibaba.ariver.app.api.App r13 = r25.getApp()
            java.lang.String r13 = r13.getAppId()
            if (r22 != 0) goto L_0x0045
            java.lang.String r14 = ""
            goto L_0x0049
        L_0x0045:
            java.lang.String r14 = r22.authority()
        L_0x0049:
            java.lang.String r15 = r23.getSource()
            java.lang.String r8 = "fromWorker"
            boolean r8 = r8.equals(r15)
            if (r9 == 0) goto L_0x006c
            if (r8 != 0) goto L_0x006c
            boolean r8 = r10.a((com.alibaba.ariver.app.api.Page) r2)
            if (r8 != 0) goto L_0x006c
            boolean r8 = a((com.alibaba.ariver.resource.api.models.AppModel) r6)
            if (r8 != 0) goto L_0x006c
            java.util.List<java.lang.String> r8 = c
            boolean r8 = r8.contains(r14)
            if (r8 != 0) goto L_0x006c
            return r5
        L_0x006c:
            java.lang.Class<com.alibaba.ariver.kernel.common.service.RVConfigService> r8 = com.alibaba.ariver.kernel.common.service.RVConfigService.class
            java.lang.Object r8 = com.alibaba.ariver.kernel.common.RVProxy.get(r8)     // Catch:{ Exception -> 0x0156 }
            com.alibaba.ariver.kernel.common.service.RVConfigService r8 = (com.alibaba.ariver.kernel.common.service.RVConfigService) r8     // Catch:{ Exception -> 0x0156 }
            java.lang.String r15 = "h5_permissionDialogBlackList"
            com.alibaba.fastjson.JSONObject r8 = r8.getConfigJSONObject(r15)     // Catch:{ Exception -> 0x0156 }
            com.alibaba.ariver.app.api.App r15 = r25.getApp()     // Catch:{ Exception -> 0x0156 }
            boolean r15 = r15.isTinyApp()     // Catch:{ Exception -> 0x0156 }
            if (r15 != 0) goto L_0x00f8
            if (r8 == 0) goto L_0x00f8
            java.lang.Boolean r15 = r8.getBoolean(r3)     // Catch:{ Exception -> 0x0156 }
            if (r15 == 0) goto L_0x009d
            java.lang.Boolean r3 = r8.getBoolean(r3)     // Catch:{ Exception -> 0x0156 }
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0156 }
            if (r3 != 0) goto L_0x009d
            java.lang.String r3 = "is_on exception hits "
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r3)     // Catch:{ Exception -> 0x00ab }
            r3 = 1
            goto L_0x009e
        L_0x009d:
            r3 = 0
        L_0x009e:
            boolean r15 = r1.equalsIgnoreCase(r13)     // Catch:{ Exception -> 0x0154 }
            if (r15 != 0) goto L_0x00af
            java.lang.String r3 = "offline h5 appid is not 20000067 "
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r3)     // Catch:{ Exception -> 0x00ab }
            r3 = 1
            goto L_0x00af
        L_0x00ab:
            r0 = move-exception
            r3 = 1
            goto L_0x0158
        L_0x00af:
            if (r3 != 0) goto L_0x00f1
            boolean r15 = r8.containsKey(r0)     // Catch:{ Exception -> 0x0154 }
            if (r15 == 0) goto L_0x00f1
            com.alibaba.fastjson.JSONArray r0 = r8.getJSONArray(r0)     // Catch:{ Exception -> 0x0154 }
            java.util.List r0 = com.alibaba.ariver.kernel.common.utils.JSONUtils.toStringArray(r0)     // Catch:{ Exception -> 0x0154 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x0154 }
        L_0x00c3:
            boolean r15 = r0.hasNext()     // Catch:{ Exception -> 0x0154 }
            if (r15 == 0) goto L_0x00f1
            java.lang.Object r15 = r0.next()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r15 = (java.lang.String) r15     // Catch:{ Exception -> 0x0154 }
            boolean r17 = android.text.TextUtils.isEmpty(r15)     // Catch:{ Exception -> 0x0154 }
            if (r17 != 0) goto L_0x00c3
            java.lang.String r17 = r25.getPageURI()     // Catch:{ Exception -> 0x0154 }
            java.lang.String r11 = com.alibaba.ariver.kernel.common.utils.UrlUtils.getHost(r17)     // Catch:{ Exception -> 0x0154 }
            boolean r11 = com.alibaba.ariver.kernel.common.utils.PatternUtils.matchRegex(r15, r11)     // Catch:{ Exception -> 0x0154 }
            if (r11 == 0) goto L_0x00c3
            java.lang.String r0 = "domain exception hits: domain: "
            java.lang.String r3 = java.lang.String.valueOf(r15)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r0 = r0.concat(r3)     // Catch:{ Exception -> 0x00ab }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)     // Catch:{ Exception -> 0x00ab }
            r3 = 1
        L_0x00f1:
            java.lang.String r0 = "group"
            java.lang.String r0 = r8.getString(r0)     // Catch:{ Exception -> 0x0154 }
            goto L_0x00fa
        L_0x00f8:
            r0 = 0
            r3 = 0
        L_0x00fa:
            if (r3 != 0) goto L_0x016d
            boolean r8 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0154 }
            java.lang.String r11 = "ali"
            if (r8 == 0) goto L_0x0105
            r0 = r11
        L_0x0105:
            java.lang.String r8 = r25.getPageURI()     // Catch:{ Exception -> 0x0154 }
            boolean r11 = r11.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x0154 }
            if (r11 == 0) goto L_0x012e
            java.lang.Class<com.alibaba.ariver.permission.api.proxy.DomainConfigProxy> r0 = com.alibaba.ariver.permission.api.proxy.DomainConfigProxy.class
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)     // Catch:{ Exception -> 0x0154 }
            com.alibaba.ariver.permission.api.proxy.DomainConfigProxy r0 = (com.alibaba.ariver.permission.api.proxy.DomainConfigProxy) r0     // Catch:{ Exception -> 0x0154 }
            if (r0 == 0) goto L_0x016d
            boolean r0 = r0.isAliDomains(r8)     // Catch:{ Exception -> 0x0154 }
            if (r0 == 0) goto L_0x016d
            java.lang.String r0 = "ali domain exception hits url : "
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r0 = r0.concat(r3)     // Catch:{ Exception -> 0x00ab }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)     // Catch:{ Exception -> 0x00ab }
        L_0x012c:
            r3 = 1
            goto L_0x016d
        L_0x012e:
            java.lang.String r11 = "alipay"
            boolean r0 = r11.equalsIgnoreCase(r0)     // Catch:{ Exception -> 0x0154 }
            if (r0 == 0) goto L_0x016d
            java.lang.Class<com.alibaba.ariver.permission.api.proxy.DomainConfigProxy> r0 = com.alibaba.ariver.permission.api.proxy.DomainConfigProxy.class
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)     // Catch:{ Exception -> 0x0154 }
            com.alibaba.ariver.permission.api.proxy.DomainConfigProxy r0 = (com.alibaba.ariver.permission.api.proxy.DomainConfigProxy) r0     // Catch:{ Exception -> 0x0154 }
            if (r0 == 0) goto L_0x016d
            boolean r0 = r0.isAlipayDomains(r8)     // Catch:{ Exception -> 0x0154 }
            if (r0 == 0) goto L_0x016d
            java.lang.String r0 = "alipay domain exception hits url : "
            java.lang.String r3 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x00ab }
            java.lang.String r0 = r0.concat(r3)     // Catch:{ Exception -> 0x00ab }
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)     // Catch:{ Exception -> 0x00ab }
            goto L_0x012c
        L_0x0154:
            r0 = move-exception
            goto L_0x0158
        L_0x0156:
            r0 = move-exception
            r3 = 0
        L_0x0158:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r11 = "check H5 exception occurs error "
            r8.<init>(r11)
            java.lang.String r0 = r0.getMessage()
            r8.append(r0)
            java.lang.String r0 = r8.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)
        L_0x016d:
            if (r3 == 0) goto L_0x0175
            java.lang.String r0 = " isExceptedH5 is true skip show permission dialog  "
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)
            return r5
        L_0x0175:
            if (r12 == 0) goto L_0x0180
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = f9030a
            java.lang.Object r0 = r0.get(r14)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x0188
        L_0x0180:
            com.alibaba.fastjson.JSONObject r0 = r9.getNativeApiUserAuth()
            java.lang.String r0 = r0.getString(r14)
        L_0x0188:
            java.lang.String r3 = "snapshot"
            boolean r3 = r3.equals(r14)
            if (r3 == 0) goto L_0x019e
            com.alibaba.fastjson.JSONObject r3 = r23.getParams()
            java.lang.String r8 = "saveToGallery"
            r11 = 1
            boolean r3 = com.alibaba.ariver.kernel.common.utils.JSONUtils.getBoolean(r3, r8, r11)
            if (r3 != 0) goto L_0x019e
            r0 = 0
        L_0x019e:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x01a5
            return r5
        L_0x01a5:
            java.lang.Class<com.alibaba.ariver.kernel.common.service.RVConfigService> r0 = com.alibaba.ariver.kernel.common.service.RVConfigService.class
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)
            com.alibaba.ariver.kernel.common.service.RVConfigService r0 = (com.alibaba.ariver.kernel.common.service.RVConfigService) r0
            java.lang.String r3 = "1"
            java.lang.String r8 = "ta_permissionDialogSwitch"
            java.lang.String r0 = r0.getConfig(r8, r3)
            java.lang.String r8 = "0"
            boolean r0 = r8.equals(r0)
            r11 = 1
            r0 = r0 ^ r11
            if (r0 != 0) goto L_0x01c5
            java.lang.String r0 = "checkShowPermissionDialog...dialogSwitch closed"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)
            return r5
        L_0x01c5:
            java.lang.Class<com.alibaba.ariver.kernel.common.service.RVConfigService> r0 = com.alibaba.ariver.kernel.common.service.RVConfigService.class
            java.lang.Object r0 = com.alibaba.ariver.kernel.common.RVProxy.get(r0)
            com.alibaba.ariver.kernel.common.service.RVConfigService r0 = (com.alibaba.ariver.kernel.common.service.RVConfigService) r0
            java.lang.String r11 = "ta_permissionDialogBlackList"
            com.alibaba.fastjson.JSONArray r0 = r0.getConfigJSONArray(r11)
            java.util.List r0 = com.alibaba.ariver.kernel.common.utils.JSONUtils.toStringArray(r0)
            if (r0 == 0) goto L_0x0203
            java.util.Iterator r0 = r0.iterator()
        L_0x01dd:
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x0203
            java.lang.Object r11 = r0.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = "all"
            boolean r12 = r12.equals(r11)
            if (r12 == 0) goto L_0x01f7
            java.lang.String r0 = "checkShowPermissionDialog... all in white list"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)
            return r5
        L_0x01f7:
            boolean r11 = r13.equals(r11)
            if (r11 == 0) goto L_0x01dd
            java.lang.String r0 = "checkShowPermissionDialog...in white list"
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)
            return r5
        L_0x0203:
            java.lang.String r0 = r10.a((java.lang.String) r14, (com.alibaba.ariver.resource.api.models.PermissionModel) r9)
            java.lang.Class<com.alibaba.ariver.kernel.common.service.RVConfigService> r11 = com.alibaba.ariver.kernel.common.service.RVConfigService.class
            java.lang.Object r11 = com.alibaba.ariver.kernel.common.RVProxy.get(r11)
            com.alibaba.ariver.kernel.common.service.RVConfigService r11 = (com.alibaba.ariver.kernel.common.service.RVConfigService) r11
            java.lang.String r12 = "h5_useLegacyLocationAuth"
            java.lang.String r15 = "no"
            java.lang.String r11 = r11.getConfig(r12, r15)
            java.lang.String r12 = "scope.location"
            boolean r12 = r0.equalsIgnoreCase(r12)
            if (r12 == 0) goto L_0x022f
            boolean r1 = r1.equalsIgnoreCase(r13)
            if (r1 == 0) goto L_0x022f
            java.lang.String r1 = "yes"
            boolean r1 = r1.equalsIgnoreCase(r11)
            if (r1 == 0) goto L_0x022f
            return r5
        L_0x022f:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x023a
            java.util.List r1 = com.alibaba.ariver.permission.service.LocalAuthPermissionManager.a.a(r2, r0)
            goto L_0x023b
        L_0x023a:
            r1 = 0
        L_0x023b:
            if (r1 == 0) goto L_0x025a
            java.lang.String r0 = java.lang.String.valueOf(r14)
            java.lang.String r2 = "checkShowPermissionDialog...already has dialog..."
            java.lang.String r0 = r2.concat(r0)
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)
            com.alibaba.ariver.permission.service.LocalAuthPermissionManager$b r0 = new com.alibaba.ariver.permission.service.LocalAuthPermissionManager$b
            java.lang.String r2 = r22.authority()
            r11 = r23
            r0.<init>(r2, r11, r7)
            r1.add(r0)
            r1 = 1
            return r1
        L_0x025a:
            r11 = r23
            r1 = 1
            java.lang.String r12 = r25.getPageURI()
            java.lang.String r6 = r10.a((com.alibaba.ariver.resource.api.models.AppModel) r6, (java.lang.String) r13, (java.lang.String) r12)
            java.lang.Class<com.alibaba.ariver.kernel.common.service.RVConfigService> r12 = com.alibaba.ariver.kernel.common.service.RVConfigService.class
            java.lang.Object r12 = com.alibaba.ariver.kernel.common.RVProxy.get(r12)
            com.alibaba.ariver.kernel.common.service.RVConfigService r12 = (com.alibaba.ariver.kernel.common.service.RVConfigService) r12
            java.lang.String r15 = "ta_send_slientdeny_permission"
            boolean r12 = r12.getConfigBoolean(r15, r1)
            com.alibaba.fastjson.JSONObject r1 = r23.getParams()
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            java.lang.String r5 = "chooseImage"
            boolean r5 = r5.equals(r14)
            java.lang.String r2 = "camera"
            java.lang.String r11 = "-1"
            r18 = r9
            java.lang.String r9 = "Access your camera"
            r19 = r12
            java.lang.String r12 = "scope.camera"
            if (r5 != 0) goto L_0x0370
            java.lang.String r5 = "chooseVideo"
            boolean r5 = r5.equals(r14)
            if (r5 == 0) goto L_0x029a
            goto L_0x0370
        L_0x029a:
            java.lang.String r5 = "NBComponent.render"
            boolean r5 = r5.equals(r14)
            if (r5 == 0) goto L_0x0301
            if (r1 == 0) goto L_0x02ff
            java.lang.String r0 = "data"
            com.alibaba.fastjson.JSONObject r0 = r1.getJSONObject(r0)
            if (r0 == 0) goto L_0x02c5
            java.lang.String r5 = "type"
            java.lang.String r0 = r0.getString(r5)
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 == 0) goto L_0x02c6
            java.lang.String r8 = "componentData"
            com.alibaba.fastjson.JSONObject r1 = r1.getJSONObject(r8)
            if (r1 == 0) goto L_0x02c6
            java.lang.String r0 = r1.getString(r5)
            goto L_0x02c6
        L_0x02c5:
            r0 = 0
        L_0x02c6:
            boolean r1 = r2.equalsIgnoreCase(r0)
            if (r1 != 0) goto L_0x02df
            java.lang.String r1 = "ai-camera"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 != 0) goto L_0x02df
            java.lang.String r1 = "ar"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x02dd
            goto L_0x02df
        L_0x02dd:
            r1 = 0
            return r1
        L_0x02df:
            java.lang.String r0 = r10.b(r6, r12)
            java.lang.String r0 = r10.c(r13, r0)
            boolean r1 = r3.equals(r0)
            if (r1 != 0) goto L_0x02fb
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1.put(r12, r9)
            r8 = r0
            r16 = r1
        L_0x02f8:
            r5 = r12
            goto L_0x0421
        L_0x02fb:
            r8 = r0
            r5 = r12
            goto L_0x036c
        L_0x02ff:
            r1 = 0
            return r1
        L_0x0301:
            java.lang.String r2 = "NBComponent.sendMessage"
            boolean r2 = r2.equals(r14)
            if (r2 == 0) goto L_0x035a
            if (r1 == 0) goto L_0x0358
            java.lang.String r2 = "actionType"
            java.lang.String r1 = r1.getString(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0356
            java.lang.String r2 = "takePhoto"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 != 0) goto L_0x0333
            java.lang.String r2 = "startRecord"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 != 0) goto L_0x0333
            java.lang.String r2 = "frameListenerStart"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0330
            goto L_0x0333
        L_0x0330:
            r5 = r0
            r8 = 0
            goto L_0x036c
        L_0x0333:
            java.lang.String r0 = r10.b(r6, r12)
            java.lang.String r0 = r10.c(r13, r0)
            boolean r1 = r8.equals(r0)
            if (r1 == 0) goto L_0x0349
            if (r7 == 0) goto L_0x0347
            r1 = 0
            r7.onNegative(r1)
        L_0x0347:
            r1 = 1
            return r1
        L_0x0349:
            r1 = 0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r2.put(r12, r9)
            r8 = r0
            r16 = r2
            goto L_0x02f8
        L_0x0356:
            r1 = 0
            return r1
        L_0x0358:
            r1 = 0
            return r1
        L_0x035a:
            java.lang.Class<com.alibaba.ariver.kernel.common.storage.KVStorageProxy> r1 = com.alibaba.ariver.kernel.common.storage.KVStorageProxy.class
            java.lang.Object r1 = com.alibaba.ariver.kernel.common.RVProxy.get(r1)
            com.alibaba.ariver.kernel.common.storage.KVStorageProxy r1 = (com.alibaba.ariver.kernel.common.storage.KVStorageProxy) r1
            java.lang.String r2 = r10.b(r6, r0)
            java.lang.String r1 = r1.getString(r13, r2)
            r5 = r0
            r8 = r1
        L_0x036c:
            r16 = 0
            goto L_0x0421
        L_0x0370:
            android.content.Context r5 = com.alibaba.ariver.kernel.common.utils.ProcessUtils.getContext()
            if (r5 == 0) goto L_0x0387
            android.content.res.Resources r5 = r5.getResources()
            int r8 = com.alibaba.ariver.permission.R.string.tiny_request_photo_permission
            java.lang.String r8 = r5.getString(r8)
            int r9 = com.alibaba.ariver.permission.R.string.tiny_request_camera_permission
            java.lang.String r9 = r5.getString(r9)
            goto L_0x0389
        L_0x0387:
            java.lang.String r8 = "Visit your album"
        L_0x0389:
            if (r1 == 0) goto L_0x041a
            java.lang.String r5 = "sourceType"
            com.alibaba.fastjson.JSONArray r1 = r1.getJSONArray(r5)
            java.lang.String r5 = "scope.album"
            if (r1 == 0) goto L_0x03b8
            boolean r20 = r1.isEmpty()
            if (r20 == 0) goto L_0x039c
            goto L_0x03b8
        L_0x039c:
            r20 = r0
            java.lang.String r0 = "album"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x03ab
            r15.put(r5, r8)
            r0 = r5
            goto L_0x03ad
        L_0x03ab:
            r0 = r20
        L_0x03ad:
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x03bf
            r15.put(r12, r9)
            r0 = r12
            goto L_0x03bf
        L_0x03b8:
            r15.put(r5, r8)
            r15.put(r12, r9)
            r0 = r5
        L_0x03bf:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Set r2 = r15.entrySet()
            java.util.Iterator r2 = r2.iterator()
            r5 = 1
            r8 = 0
        L_0x03ce:
            boolean r9 = r2.hasNext()
            if (r9 == 0) goto L_0x0416
            java.lang.Object r9 = r2.next()
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9
            java.lang.Object r12 = r9.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r9 = r9.getValue()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.String r15 = r10.b(r6, r12)
            java.lang.String r15 = r10.c(r13, r15)
            boolean r16 = r3.equals(r15)
            if (r16 != 0) goto L_0x0414
            boolean r16 = r11.equalsIgnoreCase(r15)
            if (r16 != 0) goto L_0x0402
            java.lang.String r15 = r10.b(r6, r12)
            java.lang.String r15 = r10.c(r13, r15)
        L_0x0402:
            boolean r16 = r3.equals(r15)
            if (r16 != 0) goto L_0x03ce
            boolean r5 = android.text.TextUtils.equals(r15, r11)
            if (r5 != 0) goto L_0x0411
            r1.put(r12, r9)
        L_0x0411:
            r8 = r15
            r5 = 0
            goto L_0x03ce
        L_0x0414:
            r5 = 1
            goto L_0x03ce
        L_0x0416:
            if (r5 == 0) goto L_0x041e
            r8 = r3
            goto L_0x041e
        L_0x041a:
            r20 = r0
            r1 = 0
            r8 = 0
        L_0x041e:
            r5 = r0
            r16 = r1
        L_0x0421:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "alreadyAuthed: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r1 = " buildPermissionKey(appId, scope): "
            r0.append(r1)
            java.lang.String r1 = r10.b(r6, r5)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.alibaba.ariver.kernel.common.utils.RVLogger.d(r4, r0)
            boolean r0 = r3.equals(r8)
            if (r0 == 0) goto L_0x0449
            r21.a((com.alibaba.ariver.kernel.api.security.Permission) r22)
            r1 = 0
            return r1
        L_0x0449:
            r1 = 0
            if (r19 == 0) goto L_0x0459
            boolean r0 = r11.equalsIgnoreCase(r8)
            if (r0 == 0) goto L_0x0459
            if (r7 == 0) goto L_0x0457
            r7.onNegative(r1)
        L_0x0457:
            r1 = 1
            return r1
        L_0x0459:
            r1 = r21
            r2 = r25
            r3 = r13
            r4 = r14
            r6 = r23
            r7 = r24
            r8 = r16
            r9 = r18
            boolean r0 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        L_0x046c:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ariver.permission.service.LocalAuthPermissionManager.a(com.alibaba.ariver.kernel.api.security.Permission, com.alibaba.ariver.engine.api.bridge.model.NativeCallContext, com.alibaba.ariver.permission.api.proxy.AuthenticationProxy$LocalPermissionCallback, com.alibaba.ariver.app.api.Page):boolean");
    }

    private String a(AppModel appModel, String str, String str2) {
        return AppPermissionUtils.getAggregationMainAppId(appModel) == null ? AppPermissionUtils.getAggregationMainAppIdForH5Page(str, str2) : str;
    }

    private void a(Permission permission) {
        RVLogger.d("AriverPermission:LocalAuthPermissionManager", "checkIfSendAuthedLogToRemoteDebug: ".concat(String.valueOf(permission)));
    }

    /* access modifiers changed from: private */
    public void a(Page page, String str, String str2) {
        List<b> b2 = a.b(page, str2);
        if (b2 != null) {
            for (b next : b2) {
                if (next.c != null) {
                    StringBuilder sb = new StringBuilder("cancelAuth...action=");
                    sb.append(str);
                    sb.append(" on resultObject: ");
                    sb.append(next);
                    RVLogger.d("AriverPermission:LocalAuthPermissionManager", sb.toString());
                    next.c.onNegative(true);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(Node node, String str, String str2) {
        List<b> b2 = a.b(node, str2);
        if (b2 != null) {
            for (b next : b2) {
                StringBuilder sb = new StringBuilder("sendResult...action=");
                sb.append(str);
                sb.append(" on resultObject: ");
                sb.append(next);
                RVLogger.d("AriverPermission:LocalAuthPermissionManager", sb.toString());
                try {
                    next.c.onPositive();
                } catch (Exception e2) {
                    StringBuilder sb2 = new StringBuilder("use local permission send result error:\t");
                    sb2.append(e2.getMessage());
                    RVLogger.e("AriverPermission:LocalAuthPermissionManager", sb2.toString());
                }
            }
        }
    }

    private String a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        if (jSONObject2 == null) {
            return null;
        }
        String string = jSONObject2.getString(SecurityConstants.KEY_DESC);
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        return null;
    }

    private String a(String str, Map<String, String> map) {
        if (!"chooseImage".equals(str) && !"chooseVideo".equals(str) && !"NBComponent.render".equalsIgnoreCase(str) && !"NBComponent.sendMessage".equalsIgnoreCase(str)) {
            return f9030a.get(str);
        }
        if (map == null || map.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> value : map.entrySet()) {
            sb.append((String) value.getValue());
            sb.append("，");
        }
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    private String b(String str, String str2) {
        String userId = ((RVAccountService) RVProxy.get(RVAccountService.class)).getUserId();
        StringBuilder sb = new StringBuilder();
        sb.append(userId);
        sb.append("_");
        sb.append(str);
        sb.append("_");
        sb.append(str2.substring(str2.indexOf(".") + 1, str2.length()));
        return sb.toString();
    }

    private String a(String str, PermissionModel permissionModel) {
        String string = (permissionModel == null || permissionModel.getNativeApiUserAuth() == null || !permissionModel.getNativeApiUserAuth().containsKey(str)) ? "" : permissionModel.getNativeApiUserAuth().getString(str);
        if (TextUtils.isEmpty(string)) {
            if ("scan".equals(str)) {
                string = SCOPE.CONST_SCOPE_CAMERA;
            } else if ("saveImage".equals(str) || "saveVideoToPhotosAlbum".equals(str) || "shareTokenImageSilent".equals(str)) {
                string = SCOPE.CONST_SCOPE_WRITE_PHOTOS_ALBUM;
            } else if (str.contains("Location")) {
                string = SCOPE.CONST_SCOPE_USERLOCATION;
            } else if (str.contains("AudioRecord")) {
                string = SCOPE.CONST_SCOPE_RECORD;
            } else if (str.equals("enableBluetooth") || str.equals("openBluetoothAdapter") || str.equals("connectBLEDevice") || str.equals("getBeacons")) {
                string = SCOPE.CONST_SCOPE_BLUETOOTH;
            } else if ("contact".equals(str) || "chooseContact".equals(str) || "APSocialNebulaPlugin.selectContactJSAPI".equals(str)) {
                string = SCOPE.CONST_SCOPE_CONTACT;
            }
        }
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        String str2 = b.get(str);
        return !TextUtils.isEmpty(str2) ? "scope.".concat(String.valueOf(str2)) : string;
    }

    public Map<String, Boolean> a(String str, @Nullable AppModel appModel, Page page, Map<String, Map<String, PermissionModel>> map) {
        RVAppInfoManager rVAppInfoManager = (RVAppInfoManager) RVProxy.get(RVAppInfoManager.class);
        if (appModel == null) {
            appModel = rVAppInfoManager.getAppModel(AppInfoQuery.make(str));
        }
        return a(str, appModel, map, a(appModel, str, page != null ? page.getPageURI() : null));
    }

    public Map<String, Boolean> a(String str, @Nullable AppModel appModel, Map<String, Map<String, PermissionModel>> map, String str2) {
        JSONArray parseArray;
        Map map2;
        JSONObject nativeApiScopeConfig;
        Map map3;
        JSONObject nativeApiScopeConfig2;
        RVAppInfoManager rVAppInfoManager = (RVAppInfoManager) RVProxy.get(RVAppInfoManager.class);
        if (appModel == null) {
            appModel = rVAppInfoManager.getAppModel(AppInfoQuery.make(str));
        }
        HashMap hashMap = new HashMap();
        if (appModel == null || appModel.getPermissionModel() == null || appModel.getPermissionModel().getNativeApiScopeConfig() == null) {
            HashSet<String> hashSet = new HashSet<>();
            boolean z = false;
            if (!(map == null || map.get(str) == null || map.get(str).isEmpty() || map == null || (map2 = map.get(str)) == null || map2.isEmpty())) {
                for (PermissionModel permissionModel : map2.values()) {
                    if (!(permissionModel == null || (nativeApiScopeConfig = permissionModel.getNativeApiScopeConfig()) == null)) {
                        z = true;
                        hashSet.addAll(nativeApiScopeConfig.keySet());
                    }
                }
            }
            if (z) {
                for (String str3 : hashSet) {
                    String a2 = a(str, str2, str3);
                    if (!TextUtils.isEmpty(a2)) {
                        hashMap.put(str3, Boolean.valueOf("1".equalsIgnoreCase(a2)));
                    }
                }
            } else {
                String a3 = a(str, str2, SCOPE.CONST_SCOPE_USERLOCATION);
                if (!TextUtils.isEmpty(a3)) {
                    hashMap.put(SCOPE.CONST_SCOPE_USERLOCATION, Boolean.valueOf("1".equalsIgnoreCase(a3)));
                }
                String a4 = a(str, str2, SCOPE.CONST_SCOPE_RECORD);
                if (!TextUtils.isEmpty(a4)) {
                    hashMap.put(SCOPE.CONST_SCOPE_RECORD, Boolean.valueOf("1".equalsIgnoreCase(a4)));
                }
                String a5 = a(str, str2, SCOPE.CONST_SCOPE_WRITE_PHOTOS_ALBUM);
                if (!TextUtils.isEmpty(a5)) {
                    hashMap.put(SCOPE.CONST_SCOPE_WRITE_PHOTOS_ALBUM, Boolean.valueOf("1".equalsIgnoreCase(a5)));
                }
                String a6 = a(str, str2, SCOPE.CONST_SCOPE_CAMERA);
                if (!TextUtils.isEmpty(a6)) {
                    hashMap.put(SCOPE.CONST_SCOPE_CAMERA, Boolean.valueOf("1".equalsIgnoreCase(a6)));
                }
                String a7 = a(str, str2, SCOPE.CONST_SCOPE_BLUETOOTH);
                if (!TextUtils.isEmpty(a7)) {
                    hashMap.put(SCOPE.CONST_SCOPE_BLUETOOTH, Boolean.valueOf("1".equalsIgnoreCase(a7)));
                }
                String a8 = a(str, str2, SCOPE.CONST_SCOPE_TB_AUTH);
                if (!TextUtils.isEmpty(a8)) {
                    hashMap.put(SCOPE.CONST_SCOPE_TB_AUTH, Boolean.valueOf("1".equalsIgnoreCase(a8)));
                }
                String a9 = a(str, str2, SCOPE.CONST_SCOPE_CONTACT);
                if (!TextUtils.isEmpty(a9)) {
                    hashMap.put(SCOPE.CONST_SCOPE_CONTACT, Boolean.valueOf("1".equalsIgnoreCase(a9)));
                }
            }
        } else {
            HashSet<String> hashSet2 = new HashSet<>();
            hashSet2.addAll(appModel.getPermissionModel().getNativeApiScopeConfig().keySet());
            if (!(map == null || (map3 = map.get(str)) == null || map3.isEmpty())) {
                for (PermissionModel permissionModel2 : map3.values()) {
                    if (!(permissionModel2 == null || (nativeApiScopeConfig2 = permissionModel2.getNativeApiScopeConfig()) == null || nativeApiScopeConfig2.keySet().isEmpty())) {
                        hashSet2.addAll(nativeApiScopeConfig2.keySet());
                    }
                }
            }
            for (String str4 : hashSet2) {
                String a10 = a(str, str2, str4);
                if (!TextUtils.isEmpty(a10)) {
                    hashMap.put(str4, Boolean.valueOf("1".equalsIgnoreCase(a10)));
                }
            }
        }
        if (!TextUtils.isEmpty(this.e) && (parseArray = JSONUtils.parseArray(this.e)) != null && parseArray.size() > 0) {
            HashSet<String> hashSet3 = new HashSet<>();
            Iterator<Object> it = parseArray.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof String) {
                    hashSet3.add((String) next);
                }
            }
            for (String valueOf : hashSet3) {
                String concat = "scope.".concat(String.valueOf(valueOf));
                if (!TextUtils.isEmpty(a(str, str2, concat))) {
                    hashMap.put(concat, Boolean.valueOf(TextUtils.equals(a(str, str2, concat), "1")));
                }
            }
        }
        return hashMap;
    }

    private boolean a(Page page, String str, String str2, String str3, NativeCallContext nativeCallContext, AuthenticationProxy.LocalPermissionCallback localPermissionCallback, Map<String, String> map, PermissionModel permissionModel) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = str;
        String str9 = str2;
        String config = ((RVConfigService) RVProxy.get(RVConfigService.class)).getConfig("mp_enable_auth_serve_content", "NO");
        if ("chooseImage".equals(str9) || "chooseVideo".equals(str9) || !"YES".equalsIgnoreCase(config) || permissionModel == null || permissionModel.getNativeApiScopeConfig() == null) {
            String str10 = str3;
            str4 = null;
        } else {
            str4 = a(str3, permissionModel.getNativeApiScopeConfig());
        }
        StringBuilder sb = new StringBuilder("dialogContent dynamic is\t:");
        sb.append(str4);
        sb.append(", action = ");
        sb.append(str9);
        RVLogger.d("AriverPermission:LocalAuthPermissionManager", sb.toString());
        Map<String, String> map2 = map;
        if (TextUtils.isEmpty(str4)) {
            str4 = a(str9, map2);
        }
        String str11 = str4;
        RVLogger.d("AriverPermission:LocalAuthPermissionManager", "dialogContent native is\t:".concat(String.valueOf(str11)));
        if (TextUtils.isEmpty(str11)) {
            RVLogger.d("AriverPermission:LocalAuthPermissionManager", "doShowPermissionDialog not show dialog content null");
            return false;
        }
        StringBuilder sb2 = new StringBuilder("doShowPermissionDialog...action:");
        sb2.append(str9);
        sb2.append(",appId:");
        sb2.append(str8);
        RVLogger.d("AriverPermission:LocalAuthPermissionManager", sb2.toString());
        String str12 = "";
        if (page == null || page.getApp() == null) {
            str7 = str12;
            str6 = str7;
            str5 = str6;
        } else {
            AppModel appModel = (AppModel) page.getApp().getData(AppModel.class);
            String a2 = a(appModel, str8, page.getPageURI());
            RVLogger.d("AriverPermission:LocalAuthPermissionManager", "doShowPermissionDialog...aggregationMainAppId :".concat(String.valueOf(a2)));
            if (appModel != null) {
                AppInfoModel appInfoModel = appModel.getAppInfoModel();
                EntryInfo entryInfo = (EntryInfo) page.getApp().getData(EntryInfo.class);
                if (entryInfo != null) {
                    str12 = entryInfo.title;
                    str6 = entryInfo.iconUrl;
                } else {
                    str6 = str12;
                }
                if (appInfoModel != null) {
                    if (TextUtils.isEmpty(str12)) {
                        str12 = appInfoModel.getName();
                    }
                    if (TextUtils.isEmpty(str6)) {
                        str6 = appInfoModel.getLogo();
                    }
                }
            } else {
                str6 = str12;
            }
            if ("20000067".equals(str8)) {
                StringBuilder sb3 = new StringBuilder(" 20000067 doShowPermissionDialog...action:");
                sb3.append(str9);
                sb3.append(" url :");
                sb3.append(page.getPageURI());
                RVLogger.d("AriverPermission:LocalAuthPermissionManager", sb3.toString());
                str12 = UrlUtils.getHost(page.getPageURI());
                str6 = "https://gw.alipayobjects.com/mdn/rms_ef981d/afts/img/A*qpA3TKXchKUAAAAAAAAAAABkARQnAQ";
            }
            str5 = a2;
            str7 = str12;
        }
        if (TextUtils.isEmpty(str7) || TextUtils.isEmpty(str6)) {
            RVLogger.d("AriverPermission:LocalAuthPermissionManager", "doShowPermissionDialog not show icon or title null");
            return false;
        } else if (a(page.getApp(), nativeCallContext.getPluginId())) {
            final Map<String, String> map3 = map;
            final String str13 = str;
            final String str14 = str5;
            final String str15 = str3;
            final Page page2 = page;
            final String str16 = str2;
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    Map map = map3;
                    if (map == null || map.isEmpty()) {
                        LocalAuthPermissionManager.this.a(str13, str14, str15, "1");
                    } else {
                        for (Map.Entry key : map3.entrySet()) {
                            LocalAuthPermissionManager.this.a(str13, str14, (String) key.getKey(), "1");
                        }
                    }
                    LocalAuthPermissionManager.this.a((Node) page2, str16, str15);
                }
            });
            return true;
        } else {
            final Page page3 = page;
            final Map<String, String> map4 = map;
            final String str17 = str3;
            final String str18 = str11;
            final String str19 = str7;
            final String str20 = str6;
            final String str21 = str;
            final String str22 = str5;
            final String str23 = str2;
            final NativeCallContext nativeCallContext2 = nativeCallContext;
            final AuthenticationProxy.LocalPermissionCallback localPermissionCallback2 = localPermissionCallback;
            ExecutorUtils.runOnMain(new Runnable() {
                public void run() {
                    LocalPermissionDialog localPermissionDialog = ((AuthDialogProxy) RVProxy.get(AuthDialogProxy.class)).getLocalPermissionDialog(page3.getRender().getActivity());
                    ArrayList arrayList = new ArrayList();
                    Map map = map4;
                    if (map == null || map.size() <= 0) {
                        arrayList.add(str17);
                    } else {
                        for (Map.Entry key : map4.entrySet()) {
                            arrayList.add(key.getKey());
                        }
                    }
                    localPermissionDialog.setDialogContent(arrayList, str18, str19, str20);
                    localPermissionDialog.setPermissionPermitListener(new PermissionPermitListener() {
                        public void onSuccess() {
                            if (map4 == null || map4.isEmpty()) {
                                LocalAuthPermissionManager.this.a(str21, str22, str17, "1");
                            } else {
                                for (Map.Entry key : map4.entrySet()) {
                                    LocalAuthPermissionManager.this.a(str21, str22, (String) key.getKey(), "1");
                                }
                            }
                            LocalAuthPermissionManager.this.a((Node) page3, str23, str17);
                        }

                        public void onFailed(int i, String str, boolean z) {
                            String str2;
                            LocalAuthPermissionManager.this.a(page3, str23, str17);
                            RVLogger.d("AriverPermission:LocalAuthPermissionManager", "checkShowPermissionDialog...cancel");
                            String str3 = "0";
                            if (map4 == null || map4.isEmpty()) {
                                LocalAuthPermissionManager localAuthPermissionManager = LocalAuthPermissionManager.this;
                                String str4 = str21;
                                String str5 = str22;
                                String str6 = str17;
                                if (!z) {
                                    str3 = "-1";
                                }
                                localAuthPermissionManager.a(str4, str5, str6, str3);
                                return;
                            }
                            for (Map.Entry key : map4.entrySet()) {
                                LocalAuthPermissionManager localAuthPermissionManager2 = LocalAuthPermissionManager.this;
                                String str7 = str21;
                                String str8 = str22;
                                String str9 = (String) key.getKey();
                                if (z) {
                                    str2 = str3;
                                } else {
                                    str2 = "-1";
                                }
                                localAuthPermissionManager2.a(str7, str8, str9, str2);
                            }
                        }
                    });
                    localPermissionDialog.show(page3);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(new b(str23, nativeCallContext2, localPermissionCallback2));
                    a.a(page3, str17, arrayList2);
                }
            });
            return true;
        }
    }

    private boolean a(App app, String str) {
        AppModel appModel = (AppModel) app.getData(AppModel.class);
        if (appModel == null || (appModel.getExtendInfos() != null && !SummaryActivity.CHECKED.equals(appModel.getExtendInfos().getString("official")))) {
            return false;
        }
        if (!TextUtils.equals(appModel.getAppId(), str) && !TextUtils.isEmpty(str)) {
            List<PluginModel> plugins = appModel.getAppInfoModel().getPlugins();
            if (plugins != null) {
                for (PluginModel next : plugins) {
                    if (TextUtils.equals(next.getAppId(), str)) {
                        if (next.getExtendInfo() == null || !SummaryActivity.CHECKED.equals(next.getExtendInfo().getString("official"))) {
                            return false;
                        }
                        return true;
                    }
                }
            }
            DynamicPluginInfo dynamicPluginInfo = (DynamicPluginInfo) app.getData(DynamicPluginInfo.class);
            if (!(dynamicPluginInfo == null || dynamicPluginInfo.getPluginModels() == null)) {
                for (PluginModel next2 : dynamicPluginInfo.getPluginModels()) {
                    if (TextUtils.equals(next2.getAppId(), str)) {
                        if (next2.getExtendInfo() == null || !SummaryActivity.CHECKED.equals(next2.getExtendInfo().getString("official"))) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        if (appModel.getExtendInfos() == null || !SummaryActivity.CHECKED.equals(appModel.getExtendInfos().getString("official"))) {
            return false;
        }
        return true;
    }

    private String a(String str, String str2, String str3) {
        String b2 = b(str, str3);
        String c2 = c(str, b2);
        StringBuilder sb = new StringBuilder("isThePermissionApplied,key: ");
        sb.append(b2);
        sb.append(",value: ");
        sb.append(c2);
        RVLogger.d("AriverPermission:LocalAuthPermissionManager", sb.toString());
        return (!TextUtils.isEmpty(c2) || TextUtils.isEmpty(str2)) ? c2 : c(str, b(str2, str3));
    }

    private String c(String str, String str2) {
        return ((KVStorageProxy) RVProxy.get(KVStorageProxy.class)).getString(str, str2);
    }

    private void b(String str, String str2, String str3) {
        ((KVStorageProxy) RVProxy.get(KVStorageProxy.class)).putString(str, str2, str3);
    }

    private void d(String str, String str2) {
        ((KVStorageProxy) RVProxy.get(KVStorageProxy.class)).remove(str, str2);
    }

    public void a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            a(str);
        }
        if (!TextUtils.isEmpty(str2)) {
            a(str2);
        }
    }

    private void a(String str) {
        d(str, b(str, SCOPE.CONST_SCOPE_USERINFO));
        d(str, b(str, SCOPE.CONST_SCOPE_USERLOCATION));
        d(str, b(str, SCOPE.CONST_SCOPE_ADDRESS));
        d(str, b(str, SCOPE.CONST_SCOPE_INVOICE_TITLE));
        d(str, b(str, SCOPE.CONST_SCOPE_ALI_RUN));
        d(str, b(str, SCOPE.CONST_SCOPE_RECORD));
        d(str, b(str, SCOPE.CONST_SCOPE_WRITE_PHOTOS_ALBUM));
        d(str, b(str, SCOPE.CONST_SCOPE_BLUETOOTH));
        d(str, b(str, SCOPE.CONST_SCOPE_TB_AUTH));
        d(str, b(str, SCOPE.CONST_SCOPE_CONTACT));
    }

    public void a(String str, String str2, String str3, String str4) {
        String str5;
        if (TextUtils.isEmpty(str2)) {
            str5 = b(str, str3);
        } else {
            str5 = b(str2, str3);
        }
        b(str, str5, str4);
        StringBuilder sb = new StringBuilder("changePermissionState,key: ");
        sb.append(str5);
        sb.append(",opened: ");
        sb.append(str4);
        RVLogger.d("AriverPermission:LocalAuthPermissionManager", sb.toString());
    }

    public static boolean a(AppModel appModel) {
        if (appModel != null && appModel.getExtendInfos() != null) {
            return "YES".equalsIgnoreCase(JSONUtils.getString(appModel.getExtendInfos(), GriverBaseConstants.GRIVER_IS_EMBEDDED_APP));
        }
        RVLogger.w("AriverPermission:LocalAuthPermissionManager", "check if embedded app but app model is null, return false");
        return false;
    }

    class b {

        /* renamed from: a  reason: collision with root package name */
        String f10139a;
        NativeCallContext b;
        AuthenticationProxy.LocalPermissionCallback c;

        public b(String str, NativeCallContext nativeCallContext, AuthenticationProxy.LocalPermissionCallback localPermissionCallback) {
            this.f10139a = str;
            this.b = nativeCallContext;
            this.c = localPermissionCallback;
        }
    }
}
