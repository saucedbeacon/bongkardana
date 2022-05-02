package com.alibaba.griver.device.jsapi.wifi;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.app.AppPausePoint;
import com.alibaba.ariver.app.api.point.app.AppResumePoint;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingNode;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.ariver.kernel.common.utils.RVLogger;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.base.common.env.GriverEnv;
import com.alibaba.griver.base.common.utils.CommonUtils;
import com.alibaba.griver.device.R;
import com.google.android.gms.safetynet.SafetyNetStatusCodes;
import java.util.Iterator;
import java.util.List;

public class WifiManagerBridgeExtension implements AppPausePoint, AppResumePoint, BridgeExtension {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final String f9092a = WifiManagerBridgeExtension.class.getSimpleName();
    private WifiManager b;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private Page f;
    private BridgeCallback g;
    private BroadcastReceiver h = new BroadcastReceiver() {
        /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onReceive(android.content.Context r5, android.content.Intent r6) {
            /*
                r4 = this;
                java.lang.String r5 = r6.getAction()
                java.lang.String r0 = com.alibaba.griver.device.jsapi.wifi.WifiManagerBridgeExtension.f9092a
                java.lang.String r1 = java.lang.String.valueOf(r5)
                java.lang.String r2 = "onReceiveWifiBroadcast... action = "
                java.lang.String r1 = r2.concat(r1)
                com.alibaba.ariver.kernel.common.utils.RVLogger.d(r0, r1)
                int r0 = r5.hashCode()
                r1 = -1875733435(0xffffffff90329445, float:-3.5218533E-29)
                r2 = 2
                r3 = 1
                if (r0 == r1) goto L_0x003f
                r1 = -343630553(0xffffffffeb849d27, float:-3.2064068E26)
                if (r0 == r1) goto L_0x0035
                r1 = 1878357501(0x6ff575fd, float:1.5193293E29)
                if (r0 == r1) goto L_0x002b
                goto L_0x0049
            L_0x002b:
                java.lang.String r0 = "android.net.wifi.SCAN_RESULTS"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0049
                r5 = 2
                goto L_0x004a
            L_0x0035:
                java.lang.String r0 = "android.net.wifi.STATE_CHANGE"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0049
                r5 = 0
                goto L_0x004a
            L_0x003f:
                java.lang.String r0 = "android.net.wifi.WIFI_STATE_CHANGED"
                boolean r5 = r5.equals(r0)
                if (r5 == 0) goto L_0x0049
                r5 = 1
                goto L_0x004a
            L_0x0049:
                r5 = -1
            L_0x004a:
                if (r5 == 0) goto L_0x005d
                if (r5 == r3) goto L_0x0057
                if (r5 == r2) goto L_0x0051
                goto L_0x0056
            L_0x0051:
                com.alibaba.griver.device.jsapi.wifi.WifiManagerBridgeExtension r5 = com.alibaba.griver.device.jsapi.wifi.WifiManagerBridgeExtension.this
                r5.d()
            L_0x0056:
                return
            L_0x0057:
                com.alibaba.griver.device.jsapi.wifi.WifiManagerBridgeExtension r5 = com.alibaba.griver.device.jsapi.wifi.WifiManagerBridgeExtension.this
                r5.b(r6)
                return
            L_0x005d:
                com.alibaba.griver.device.jsapi.wifi.WifiManagerBridgeExtension r5 = com.alibaba.griver.device.jsapi.wifi.WifiManagerBridgeExtension.this
                r5.a((android.content.Intent) r6)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.device.jsapi.wifi.WifiManagerBridgeExtension.AnonymousClass1.onReceive(android.content.Context, android.content.Intent):void");
        }
    };

    public void onFinalized() {
    }

    public void onInitialized() {
    }

    public Permission permit() {
        return null;
    }

    private static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        if (str.contains("WPA") || str.contains("wpa")) {
            return 2;
        }
        if (str.contains("WEP") || str.contains("wep")) {
            return 1;
        }
        if (str.contains("EAP") || str.contains("eap")) {
            return 3;
        }
        return 0;
    }

    private static int a(WifiConfiguration wifiConfiguration) {
        if (wifiConfiguration.allowedKeyManagement.get(1)) {
            return 2;
        }
        if (wifiConfiguration.allowedKeyManagement.get(2) || wifiConfiguration.allowedKeyManagement.get(3)) {
            return 3;
        }
        if (wifiConfiguration.wepKeys[0] != null) {
            return 1;
        }
        return 0;
    }

    @AutoCallback
    @ThreadType(ExecutorType.NORMAL)
    @ActionFilter
    public BridgeResponse startWifi() {
        return b();
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse stopWifi() {
        return c();
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse getWifiList(@BindingNode(Page.class) Page page, @BindingCallback BridgeCallback bridgeCallback) {
        this.g = bridgeCallback;
        this.f = page;
        return a(page);
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse connectWifi(@BindingNode(Page.class) Page page, @BindingCallback BridgeCallback bridgeCallback, @BindingParam(stringDefault = "", value = {"SSID"}) String str, @BindingParam(stringDefault = "", value = {"BSSID"}) String str2, @BindingParam(stringDefault = "", value = {"password"}) String str3, @BindingParam({"isWEP"}) boolean z) {
        this.g = bridgeCallback;
        this.f = page;
        return a(str, str2, str3, z);
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse getConnectedWifi() {
        return a();
    }

    private BridgeResponse a() {
        i();
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext == null) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        if (!this.d) {
            return new BridgeResponse.Error(SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, applicationContext.getString(R.string.griver_not_use_startwifi_before));
        }
        if (!i().isWifiEnabled()) {
            return new BridgeResponse.Error(SafetyNetStatusCodes.VERIFY_APPS_NOT_ENABLED, applicationContext.getString(R.string.griver_wifi_is_disabled));
        }
        WifiInfo connectionInfo = i().getConnectionInfo();
        if (connectionInfo != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("SSID", (Object) connectionInfo.getSSID());
            jSONObject.put("BSSID", (Object) connectionInfo.getBSSID());
            jSONObject.put("secure", (Object) Boolean.valueOf(a(connectionInfo)));
            jSONObject.put("signalStrength", (Object) Integer.valueOf(WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100)));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("wifi", (Object) jSONObject);
            String str = f9092a;
            StringBuilder sb = new StringBuilder("getConnectedWifi... wifiInfo = ");
            sb.append(jSONObject.toJSONString());
            RVLogger.d(str, sb.toString());
            return new BridgeResponse(jSONObject2);
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("fail", (Object) Boolean.TRUE);
        return new BridgeResponse(jSONObject3);
    }

    private BridgeResponse b() {
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext == null) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        try {
            boolean isWifiEnabled = i().isWifiEnabled();
            RVLogger.d(f9092a, "startWifi... isWifiEnable = ".concat(String.valueOf(isWifiEnabled)));
            if (!isWifiEnabled) {
                return new BridgeResponse.Error(SafetyNetStatusCodes.VERIFY_APPS_NOT_ENABLED, applicationContext.getString(R.string.griver_wifi_is_disabled));
            }
            boolean z = true;
            if (!isWifiEnabled && !i().setWifiEnabled(true)) {
                z = false;
            }
            JSONObject jSONObject = new JSONObject();
            this.d = z;
            jSONObject.put(z ? "success" : "fail", (Object) Boolean.TRUE);
            RVLogger.d(f9092a, "startWifi... flag isWifiStarted = ".concat(String.valueOf(z)));
            return new BridgeResponse(jSONObject);
        } catch (Exception e2) {
            RVLogger.e(f9092a, "startWifi... fail with exception", e2);
            return new BridgeResponse.Error(SafetyNetStatusCodes.SAFE_BROWSING_MISSING_API_KEY, applicationContext.getString(R.string.griver_system_not_support_ability));
        }
    }

    private BridgeResponse c() {
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext == null) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        if (!this.d) {
            return new BridgeResponse.Error(SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, applicationContext.getString(R.string.griver_not_use_startwifi_before));
        }
        if (!i().isWifiEnabled()) {
            return new BridgeResponse.Error(SafetyNetStatusCodes.VERIFY_APPS_NOT_ENABLED, applicationContext.getString(R.string.griver_wifi_is_disabled));
        }
        try {
            g();
            this.d = false;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", (Object) Boolean.TRUE);
            return new BridgeResponse(jSONObject);
        } catch (Exception e2) {
            RVLogger.e(f9092a, "stopWifi... fail with exception", e2);
            this.d = false;
            return new BridgeResponse.Error(SafetyNetStatusCodes.SAFE_BROWSING_MISSING_API_KEY, applicationContext.getString(R.string.griver_system_not_support_ability));
        }
    }

    private BridgeResponse a(String str, String str2, String str3, boolean z) {
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext == null) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        if (!this.d) {
            return new BridgeResponse.Error(SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, applicationContext.getString(R.string.griver_not_use_startwifi_before));
        }
        if (!i().isWifiEnabled()) {
            return new BridgeResponse.Error(SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, applicationContext.getString(R.string.griver_wifi_is_disabled));
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return BridgeResponse.INVALID_PARAM;
        }
        WifiInfo connectionInfo = i().getConnectionInfo();
        if (connectionInfo != null) {
            String ssid = connectionInfo.getSSID();
            String bssid = connectionInfo.getBSSID();
            String str4 = f9092a;
            StringBuilder sb = new StringBuilder("connectWifi... now connecting SSID = ");
            sb.append(ssid);
            sb.append(" BSSID = ");
            sb.append(bssid);
            RVLogger.d(str4, sb.toString());
            if (TextUtils.equals(str, ssid) && TextUtils.equals(str2, bssid)) {
                RVLogger.d(f9092a, "connectWifi... re connect Wi-Fi ");
                return new BridgeResponse.Error(SafetyNetStatusCodes.VERIFY_APPS_INTERNAL_ERROR, applicationContext.getString(R.string.griver_connect_wifi_duplicated));
            }
        }
        int a2 = a(str, str2);
        if (a2 < 0) {
            String str5 = f9092a;
            StringBuilder sb2 = new StringBuilder("connectWifi... no config found, create new WifiConfig, ssid = ");
            sb2.append(str);
            sb2.append(" bssid = ");
            sb2.append(str2);
            sb2.append(" pw = ");
            sb2.append(str3);
            sb2.append(" isWep = ");
            sb2.append(z);
            RVLogger.d(str5, sb2.toString());
            try {
                a2 = a(str, str2, str3, Boolean.valueOf(z));
            } catch (Exception e2) {
                RVLogger.e(f9092a, "connectWifi... addWifiConfig fail, ", e2);
                new BridgeResponse.Error(SafetyNetStatusCodes.INVALID_ADMIN_APPLICATION, applicationContext.getString(R.string.griver_can_not_config_wifi_in_background));
            }
        }
        if (a2 >= 0) {
            RVLogger.d(f9092a, "connectWifi... create success, and connect");
            boolean enableNetwork = i().enableNetwork(a2, true);
            i().saveConfiguration();
            i().reconnect();
            f();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(enableNetwork ? "success" : "fail", (Object) Boolean.TRUE);
            return new BridgeResponse(jSONObject);
        }
        RVLogger.d(f9092a, "connectWifi... create config fail");
        return new BridgeResponse.Error(SafetyNetStatusCodes.INVALID_ADMIN_APPLICATION, applicationContext.getString(R.string.griver_can_not_config_wifi_in_background));
    }

    private int a(String str, String str2) {
        List<WifiConfiguration> configuredNetworks = i().getConfiguredNetworks();
        if (configuredNetworks != null && configuredNetworks.size() > 0) {
            StringBuilder sb = new StringBuilder("\"");
            sb.append(str);
            sb.append("\"");
            String obj = sb.toString();
            for (WifiConfiguration next : configuredNetworks) {
                if (TextUtils.equals(next.SSID, obj) && TextUtils.equals(next.BSSID, str2)) {
                    return next.networkId;
                }
            }
        }
        return -1;
    }

    private int a(String str, String str2, String str3, Boolean bool) {
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        StringBuilder sb = new StringBuilder("\"");
        sb.append(str);
        sb.append("\"");
        wifiConfiguration.SSID = sb.toString();
        wifiConfiguration.BSSID = str2;
        wifiConfiguration.hiddenSSID = false;
        wifiConfiguration.status = 2;
        if (TextUtils.isEmpty(str3)) {
            String[] strArr = wifiConfiguration.wepKeys;
            StringBuilder sb2 = new StringBuilder("\"");
            sb2.append(str3);
            sb2.append("\"");
            strArr[0] = sb2.toString();
            wifiConfiguration.allowedKeyManagement.set(0);
            wifiConfiguration.wepTxKeyIndex = 0;
        } else if (bool == null || !bool.booleanValue()) {
            StringBuilder sb3 = new StringBuilder("\"");
            sb3.append(str3);
            sb3.append("\"");
            wifiConfiguration.preSharedKey = sb3.toString();
        } else {
            String[] strArr2 = wifiConfiguration.wepKeys;
            StringBuilder sb4 = new StringBuilder("\"");
            sb4.append(str3);
            sb4.append("\"");
            strArr2[0] = sb4.toString();
            wifiConfiguration.allowedKeyManagement.set(0);
            wifiConfiguration.wepTxKeyIndex = 0;
        }
        return i().addNetwork(wifiConfiguration);
    }

    /* access modifiers changed from: private */
    public void a(Intent intent) {
        NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
        if (networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.DISCONNECTED)) {
            RVLogger.d(f9092a, "onReceiveWifiBroadcast... onWifiDisconnect");
        } else if (networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.CONNECTING)) {
            RVLogger.d(f9092a, "onReceiveWifiBroadcast... onWifiConnecting");
        } else if (networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.CONNECTED)) {
            RVLogger.d(f9092a, "onReceiveWifiBroadcast... onWifiConnected");
            h();
        } else if (networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.OBTAINING_IPADDR)) {
            RVLogger.d(f9092a, "onReceiveWifiBroadcast... onWifiGettingIP");
        } else if (networkInfo.getDetailedState().equals(NetworkInfo.DetailedState.FAILED)) {
            RVLogger.d(f9092a, "onReceiveWifiBroadcast... onWifiConnecting");
        }
    }

    /* access modifiers changed from: private */
    public void d() {
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext == null) {
            this.g.sendBridgeResponse(BridgeResponse.UNKNOWN_ERROR);
            return;
        }
        try {
            List<ScanResult> scanResults = i().getScanResults();
            if (scanResults != null) {
                if (scanResults.size() > 0) {
                    RVLogger.d(f9092a, "processScanResult... getWifiList success, unregisterWifiReceiver");
                    g();
                    JSONArray jSONArray = new JSONArray(scanResults.size() * 2);
                    for (ScanResult next : scanResults) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("SSID", (Object) next.SSID);
                        jSONObject.put("BSSID", (Object) next.BSSID);
                        jSONObject.put("secure", (Object) Boolean.valueOf(a(next.capabilities) > 0));
                        jSONObject.put("signalStrength", (Object) Integer.valueOf(WifiManager.calculateSignalLevel(next.level, 100)));
                        jSONArray.add(jSONObject);
                    }
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("wifiList", (Object) jSONArray);
                    JSONObject jSONObject3 = new JSONObject();
                    jSONObject3.put("data", (Object) jSONObject2);
                    String str = f9092a;
                    StringBuilder sb = new StringBuilder("processScanResult... onGetWifiList, wifiList = ");
                    sb.append(jSONArray.toJSONString());
                    RVLogger.d(str, sb.toString());
                    if (this.f != null) {
                        EngineUtils.sendToRender(this.f.getRender(), "getWifiList", jSONObject3, (SendToRenderCallback) null);
                        return;
                    }
                    return;
                }
            }
            if (this.g != null) {
                this.g.sendBridgeResponse(new BridgeResponse.Error(SafetyNetStatusCodes.OS_VERSION_NOT_SUPPORTED, applicationContext.getString(R.string.griver_system_error_in_scan_wifi)));
            }
        } catch (Exception e2) {
            RVLogger.e(f9092a, "processScanResult... fail with exception", e2);
            BridgeCallback bridgeCallback = this.g;
            if (bridgeCallback != null) {
                bridgeCallback.sendBridgeResponse(new BridgeResponse.Error(SafetyNetStatusCodes.OS_VERSION_NOT_SUPPORTED, applicationContext.getString(R.string.griver_core_system_error)));
            }
        }
    }

    private BridgeResponse a(Page page) {
        Application applicationContext = GriverEnv.getApplicationContext();
        if (applicationContext == null) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        i();
        if (!this.d) {
            return new BridgeResponse.Error(SafetyNetStatusCodes.SAFE_BROWSING_UNSUPPORTED_THREAT_TYPES, applicationContext.getString(R.string.griver_not_use_startwifi_before));
        }
        if (!i().isWifiEnabled()) {
            return new BridgeResponse.Error(SafetyNetStatusCodes.VERIFY_APPS_NOT_ENABLED, applicationContext.getString(R.string.griver_wifi_is_disabled));
        }
        boolean isAppPermissionOPen = CommonUtils.isAppPermissionOPen(page.getPageContext().getActivity());
        boolean e2 = e();
        String str = f9092a;
        StringBuilder sb = new StringBuilder("getWifiList... isAppPermissionOPen = ");
        sb.append(isAppPermissionOPen);
        sb.append(" & isGpsSwitchOPen = ");
        sb.append(e2);
        RVLogger.e(str, sb.toString());
        if (!isAppPermissionOPen) {
            return new BridgeResponse.Error(SafetyNetStatusCodes.OS_VERSION_NOT_SUPPORTED, applicationContext.getString(R.string.griver_system_error_with_location_permission));
        }
        if (!e2) {
            return new BridgeResponse.Error(SafetyNetStatusCodes.UNSUPPORTED_SDK_VERSION, applicationContext.getString(R.string.griver_gps_is_disabled));
        }
        f();
        boolean startScan = i().startScan();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(startScan ? "success" : "fail", (Object) Boolean.TRUE);
        return new BridgeResponse(jSONObject);
    }

    private boolean e() {
        RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
        if (rVEnvironmentService == null) {
            return false;
        }
        Application applicationContext = rVEnvironmentService.getApplicationContext();
        String str = f9092a;
        StringBuilder sb = new StringBuilder("Build.VERSION.SDK_INT=");
        sb.append(Build.VERSION.SDK_INT);
        RVLogger.d(str, sb.toString());
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                if (Settings.Secure.getInt(applicationContext.getContentResolver(), "location_mode", 0) != 0) {
                    return true;
                }
                return false;
            } catch (Throwable th) {
                RVLogger.e(f9092a, "isGpsSwitchOPen, error,msg=".concat(String.valueOf(th)));
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void b(Intent intent) {
        if (intent.getIntExtra("wifi_state", 1) == 0) {
            RVLogger.d(f9092a, "onReceiveWifiBroadcast... onWifi DISABLING");
        } else if (i().getWifiState() == 1) {
            RVLogger.d(f9092a, "onReceiveWifiBroadcast... onWifi DISABLED");
        } else if (i().getWifiState() == 2) {
            RVLogger.d(f9092a, "onReceiveWifiBroadcast... onWifi ENABLING");
        } else if (i().getWifiState() == 3) {
            RVLogger.d(f9092a, "onReceiveWifiBroadcast... onWifi ENABLED");
        } else if (i().getWifiState() == 4) {
            RVLogger.d(f9092a, "onReceiveWifiBroadcast... onWifi UNKNOWN");
        }
    }

    private void f() {
        RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
        if (rVEnvironmentService != null) {
            Application applicationContext = rVEnvironmentService.getApplicationContext();
            if (!this.c && applicationContext != null) {
                RVLogger.d(f9092a, "registerWifiReceiver... is not Registered , register receiver!!");
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.wifi.SCAN_RESULTS");
                intentFilter.addAction("android.net.wifi.STATE_CHANGE");
                intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
                applicationContext.registerReceiver(this.h, intentFilter);
                this.c = true;
            }
        }
    }

    private void g() {
        RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
        if (rVEnvironmentService != null) {
            Application applicationContext = rVEnvironmentService.getApplicationContext();
            if (this.c && applicationContext != null) {
                RVLogger.d(f9092a, "unregisterWifiReceiver... isRegistered = true, unregister receiver");
                applicationContext.unregisterReceiver(this.h);
                this.c = false;
            }
        }
    }

    private void h() {
        i();
        WifiInfo connectionInfo = i().getConnectionInfo();
        if (connectionInfo != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("SSID", (Object) connectionInfo.getSSID());
            jSONObject.put("BSSID", (Object) connectionInfo.getBSSID());
            jSONObject.put("secure", (Object) Boolean.valueOf(a(connectionInfo)));
            jSONObject.put("signalStrength", (Object) Integer.valueOf(WifiManager.calculateSignalLevel(connectionInfo.getRssi(), 100)));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("wifi", (Object) jSONObject);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("data", (Object) jSONObject2);
            String str = f9092a;
            StringBuilder sb = new StringBuilder("processWifiConnectedCallBack... onWifiConnected, JsonParams = ");
            sb.append(jSONObject.toJSONString());
            RVLogger.d(str, sb.toString());
            Page page = this.f;
            if (page != null) {
                EngineUtils.sendToRender(page.getRender(), "wifiConnected", jSONObject3, (SendToRenderCallback) null);
            }
        }
    }

    private boolean a(WifiInfo wifiInfo) {
        List<WifiConfiguration> configuredNetworks = i().getConfiguredNetworks();
        if (configuredNetworks == null) {
            return false;
        }
        Iterator<WifiConfiguration> it = configuredNetworks.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            WifiConfiguration next = it.next();
            String replace = next.SSID.replace("\"", "");
            String replace2 = wifiInfo.getSSID().replace("\"", "");
            String str = f9092a;
            StringBuilder sb = new StringBuilder("checkWifiSecurity... currentSSid = ");
            sb.append(replace2);
            sb.append(" configSSid = ");
            sb.append(replace);
            sb.append(" networkId = ");
            sb.append(next.networkId);
            RVLogger.d(str, sb.toString());
            if (TextUtils.equals(replace2, replace) && wifiInfo.getNetworkId() == next.networkId) {
                int a2 = a(next);
                RVLogger.d(f9092a, "checkWifiSecurity..:: ".concat(String.valueOf(a2)));
                if (a2 > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    private WifiManager i() {
        RVEnvironmentService rVEnvironmentService;
        if (this.b == null && (rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class)) != null) {
            this.b = (WifiManager) rVEnvironmentService.getApplicationContext().getSystemService("wifi");
        }
        return this.b;
    }

    public void onAppResume(App app) {
        if (this.e) {
            f();
        }
        this.e = false;
    }

    public void onAppPause(App app) {
        this.e = true;
        g();
    }
}
