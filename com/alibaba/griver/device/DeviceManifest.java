package com.alibaba.griver.device;

import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.activity.ActivityResultPoint;
import com.alibaba.ariver.app.api.point.app.AppDestroyPoint;
import com.alibaba.ariver.app.api.point.biz.SnapshotPoint;
import com.alibaba.ariver.app.api.point.page.PageExitPoint;
import com.alibaba.ariver.app.api.point.page.PagePausePoint;
import com.alibaba.ariver.app.api.point.page.PageResumePoint;
import com.alibaba.ariver.integration.RVManifest;
import com.alibaba.ariver.kernel.RVStartParams;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.alibaba.ariver.kernel.api.extension.registry.EmbedViewMetaInfo;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.ariver.kernel.api.node.Scope;
import com.alibaba.ariver.kernel.api.remote.RemoteController;
import com.alibaba.ariver.kernel.api.security.AccessController;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.permission.api.extension.PermissionGuildePoint;
import com.alibaba.griver.device.adapter.GriverCommonAbilityProxyImpl;
import com.alibaba.griver.device.jsapi.auth.AuthGuideExtension;
import com.alibaba.griver.device.jsapi.auth.GriverDefaultOpenSettingExtension;
import com.alibaba.griver.device.jsapi.phone.contact.ContactActivityResultPoint;
import com.alibaba.griver.device.jsapi.screen.SnapshotExtension;
import com.alibaba.griver.device.proxy.GriverOpenSettingExtension;
import com.alibaba.griver.device.proxy.RVCommonAbilityProxy;
import com.iap.ac.android.acs.plugin.utils.Constants;
import id.dana.lib.gcontainer.app.bridge.constant.H5ActionJSApi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class DeviceManifest implements RVManifest {
    private static final String BUNDLE_NAME = "com-alibaba-griver-commonability";
    private static final DeviceManifest INSTANCE = new DeviceManifest();

    @Nullable
    public AccessController getAccessController() {
        return null;
    }

    @Nullable
    public Map<String, EmbedViewMetaInfo> getEmbedViews() {
        return null;
    }

    @Nullable
    public RemoteController getRemoteController() {
        return null;
    }

    public static RVManifest getInstance() {
        return INSTANCE;
    }

    public List<RVManifest.IProxyManifest> getProxies() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RVManifest.LazyProxyManifest(RVCommonAbilityProxy.class, new RVProxy.LazyGetter<RVCommonAbilityProxy>() {
            public RVCommonAbilityProxy get() {
                return new GriverCommonAbilityProxyImpl();
            }
        }));
        arrayList.add(new RVManifest.LazyProxyManifest(GriverOpenSettingExtension.class, new RVProxy.LazyGetter<GriverOpenSettingExtension>() {
            public GriverOpenSettingExtension get() {
                return new GriverDefaultOpenSettingExtension();
            }
        }));
        return arrayList;
    }

    public List<RVManifest.BridgeExtensionManifest> getBridgeExtensions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.system.SystemRootStatusBridgeExtension", Arrays.asList(new String[]{"isSystemRoot"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.system.DeviceInfoBridgeExtension", Arrays.asList(new String[]{H5ActionJSApi.GET_DEVICE_INFO, "getDeviceID"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.contact.AddPhoneContactBridgeExtension", Arrays.asList(new String[]{"addPhoneContact"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.phone.TelephonyInfoBridgeExtension", Arrays.asList(new String[]{"getCarrierName"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.phone.MakePhoneCallBridgeExtension", Arrays.asList(new String[]{"makePhoneCall"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.phone.ChoosePhoneContactBridgeExtension", Arrays.asList(new String[]{"contact"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.system.GetBatteryInfoBridgeExtension", Arrays.asList(new String[]{"getBatteryInfo"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.vibrate.VibrateBridgeExtension", Arrays.asList(new String[]{"vibrate", "vibrateLong", "vibrateShort"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.wifi.SendUPDMessageExtension", Arrays.asList(new String[]{"getSSID", "sendUdpMessage"}), Page.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.wifi.WifiInfoExtension", Arrays.asList(new String[]{"getWifiInfo"}), Page.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.wifi.WifiManagerBridgeExtension", Arrays.asList(new String[]{"connectWifi", "getConnectedWifi", "getWifiList", "startWifi", "stopWifi"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.nfc.HCEBridgeExtension", Arrays.asList(new String[]{"startHCE", "stopHCE", "sendHCEMessage", "getHCEState"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.screen.ScreenBrightnessBridgeExtension", Arrays.asList(new String[]{"getScreenBrightness", "setScreenBrightness", "setScreenAutolock"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.sensor.SensorBridgeExtension", Arrays.asList(new String[]{"watchShake"}), Page.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.sensor.DeviceOrientationBridgeExtension", Arrays.asList(new String[]{"startDeviceMotionListening", "stopDeviceMotionListening"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.screen.SnapshotBridgeExtension", Arrays.asList(new String[]{RVStartParams.KEY_ENABLE_SNAPSHOT, "addScreenshotListener"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.auth.ShowAuthGuideBridgeExtension", Arrays.asList(new String[]{"showAuthGuide"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.system.MemoryWarningBridgeExtension", Arrays.asList(new String[]{"startMonitorMemoryWarning", "stopMonitorMemoryWarning"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.auth.OpenUserIdBridgeExtension", Arrays.asList(new String[]{"getOpenUserData"})));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.device.jsapi.auth.ProgramSettingExtension", Arrays.asList(new String[]{Constants.JS_API_GET_SETTING, "openSetting"})));
        return arrayList;
    }

    public List<ExtensionMetaInfo> getExtensions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ExtensionMetaInfo(BUNDLE_NAME, AuthGuideExtension.class.getName(), (List<String>) Collections.singletonList(PermissionGuildePoint.class.getName()), (Class<? extends Scope>) App.class));
        arrayList.add(new ExtensionMetaInfo(BUNDLE_NAME, SnapshotExtension.class.getName(), (List<String>) Arrays.asList(new String[]{SnapshotPoint.class.getName(), PageResumePoint.class.getName(), PagePausePoint.class.getName(), PageExitPoint.class.getName(), AppDestroyPoint.class.getName()}), (Class<? extends Scope>) App.class));
        arrayList.add(new ExtensionMetaInfo(BUNDLE_NAME, ContactActivityResultPoint.class.getName(), Arrays.asList(new String[]{ActivityResultPoint.class.getName()})));
        return arrayList;
    }

    public List<BridgeDSL> getBridgeDSLs() {
        return new ArrayList();
    }

    public List<RVManifest.ServiceBeanManifest> getServiceBeans(ExtensionManager extensionManager) {
        return new ArrayList();
    }
}
