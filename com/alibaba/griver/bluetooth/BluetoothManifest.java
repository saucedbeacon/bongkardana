package com.alibaba.griver.bluetooth;

import androidx.annotation.Nullable;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.integration.RVManifest;
import com.alibaba.ariver.kernel.api.extension.ExtensionManager;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeDSL;
import com.alibaba.ariver.kernel.api.extension.registry.EmbedViewMetaInfo;
import com.alibaba.ariver.kernel.api.extension.registry.ExtensionMetaInfo;
import com.alibaba.ariver.kernel.api.remote.RemoteController;
import com.alibaba.ariver.kernel.api.security.AccessController;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class BluetoothManifest implements RVManifest {
    private static final String BUNDLE_NAME = "com-alibaba-griver-bluetooth";
    private static final BluetoothManifest INSTANCE = new BluetoothManifest();

    public AccessController getAccessController() {
        return null;
    }

    @Nullable
    public Map<String, EmbedViewMetaInfo> getEmbedViews() {
        return null;
    }

    public RemoteController getRemoteController() {
        return null;
    }

    public static RVManifest getInstance() {
        return INSTANCE;
    }

    public List<RVManifest.IProxyManifest> getProxies() {
        return new ArrayList();
    }

    public List<RVManifest.BridgeExtensionManifest> getBridgeExtensions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.bluetooth.jsapi.BLEBridgeExtension", Arrays.asList(new String[]{"closeBluetoothAdapter", "connectBLEDevice", "disconnectBLEDevice", "getBLEDeviceCharacteristics", "getBLEDeviceServices", "getBluetoothAdapterState", "getBluetoothDevices", "getConnectedBluetoothDevices", "notifyBLECharacteristicValueChange", "openBluetoothAdapter", "readBLECharacteristicValue", "startBluetoothDevicesDiscovery", "stopBluetoothDevicesDiscovery", "writeBLECharacteristicValue", "disableBluetooth", "enableBluetooth"}), App.class));
        arrayList.add(RVManifest.BridgeExtensionManifest.makeRaw(BUNDLE_NAME, "com.alibaba.griver.bluetooth.jsapi.IBeaconBridgeExtension", Arrays.asList(new String[]{"getBeacons", "startBeaconDiscovery", "stopBeaconDiscovery"}), App.class));
        return arrayList;
    }

    public List<ExtensionMetaInfo> getExtensions() {
        return new ArrayList();
    }

    public List<BridgeDSL> getBridgeDSLs() {
        return new ArrayList();
    }

    public List<RVManifest.ServiceBeanManifest> getServiceBeans(ExtensionManager extensionManager) {
        return new ArrayList();
    }
}
