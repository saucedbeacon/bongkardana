package com.alibaba.griver.bluetooth.jsapi;

import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.bluetooth.ble.ErrorConstants;
import com.alibaba.griver.bluetooth.ble.utils.BluetoothLeUtils;
import com.alibaba.griver.bluetooth.ibeacon.BeaconResult;
import com.alibaba.griver.bluetooth.ibeacon.MyBeacon;
import com.alibaba.griver.bluetooth.ibeacon.MyBeaconListener;
import com.alibaba.griver.bluetooth.ibeacon.MyBeaconService;
import com.alibaba.griver.bluetooth.ibeacon.MyBeaconServiceImpl;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Set;

public class IBeaconBridgeExtension implements BridgeExtension, NodeAware<App> {

    /* renamed from: a  reason: collision with root package name */
    private MyBeaconService f9063a;
    /* access modifiers changed from: private */
    public App b;
    private MyBeaconListener c = new MyBeaconListener() {
        public void onBeaconUpdate(List<MyBeacon> list) {
            Page activePage;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("beacons", JSON.toJSON(list));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", (Object) jSONObject);
            if (IBeaconBridgeExtension.this.b != null && (activePage = IBeaconBridgeExtension.this.b.getActivePage()) != null) {
                EngineUtils.sendToRender(activePage.getRender(), "beaconUpdate", jSONObject2, (SendToRenderCallback) null);
            }
        }

        public void onBeaconServiceChange(boolean z, boolean z2) {
            Page activePage;
            JSONObject jSONObject = new JSONObject();
            if (BluetoothLeUtils.rollbackFixBoolean()) {
                jSONObject.put("available", (Object) String.valueOf(z));
            } else {
                jSONObject.put("available", (Object) Boolean.valueOf(z));
            }
            jSONObject.put("discovering", (Object) Boolean.valueOf(z2));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", (Object) jSONObject);
            if (IBeaconBridgeExtension.this.b != null && (activePage = IBeaconBridgeExtension.this.b.getActivePage()) != null) {
                EngineUtils.sendToRender(activePage.getRender(), "beaconServiceChange", jSONObject2, (SendToRenderCallback) null);
            }
        }
    };

    public Permission permit() {
        return null;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void startBeaconDiscovery(@BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        if (this.f9063a == null) {
            b(bridgeCallback);
        } else if (jSONObject == null || !jSONObject.containsKey("uuids")) {
            a(bridgeCallback);
        } else {
            List<String> list = null;
            if (!a(jSONObject.getString("uuids"))) {
                JSONObject jSONObject2 = new JSONObject();
                a(jSONObject2, ErrorConstants.ERROR_BEACON_INVALID_UUID);
                bridgeCallback.sendJSONResponse(jSONObject2);
                return;
            }
            try {
                list = JSON.parseArray(jSONObject.getString("uuids"), String.class);
            } catch (Exception unused) {
            }
            if (list == null || list.isEmpty()) {
                a(bridgeCallback);
                return;
            }
            String[] strArr = new String[list.size()];
            list.toArray(strArr);
            a(bridgeCallback, this.f9063a.startBeaconDiscovery(strArr));
        }
    }

    private boolean a(String str) {
        return JSON.parse(str) instanceof JSONArray;
    }

    private void a(JSONObject jSONObject, String[] strArr) {
        jSONObject.put("error", (Object) strArr[0]);
        jSONObject.put("errorMessage", (Object) strArr[1]);
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void stopBeaconDiscovery(@BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        MyBeaconService myBeaconService = this.f9063a;
        if (myBeaconService != null) {
            a(bridgeCallback, myBeaconService.stopBeaconDiscovery());
        } else {
            b(bridgeCallback);
        }
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void getBeacons(@BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        MyBeaconService myBeaconService = this.f9063a;
        if (myBeaconService != null) {
            BeaconResult beacons = myBeaconService.getBeacons();
            if (beacons.success) {
                Set set = (Set) beacons.obj;
                JSONObject jSONObject2 = new JSONObject();
                if (set != null) {
                    jSONObject2.put("beacons", JSON.toJSON(set.toArray()));
                }
                bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject2));
                return;
            }
            a(bridgeCallback, beacons);
            return;
        }
        b(bridgeCallback);
    }

    private void a(BridgeCallback bridgeCallback, BeaconResult beaconResult) {
        JSONObject jSONObject = new JSONObject();
        if (!beaconResult.success) {
            jSONObject.put("error", (Object) beaconResult.getErrorCode());
            jSONObject.put("errorMessage", (Object) beaconResult.getErrorMessage());
        }
        bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject));
    }

    private void a(BridgeCallback bridgeCallback) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error", (Object) ErrorConstants.ERROR_BEACON_UUID_EMPTY[0]);
        jSONObject.put("errorMessage", (Object) ErrorConstants.ERROR_BEACON_UUID_EMPTY[1]);
        bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject));
    }

    private void b(BridgeCallback bridgeCallback) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error", (Object) ErrorConstants.ERROR_BEACON_SYSTEM_ERROR[0]);
        jSONObject.put("errorMessage", (Object) ErrorConstants.ERROR_BEACON_SYSTEM_ERROR[1]);
        bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject));
    }

    public void onInitialized() {
        MyBeaconServiceImpl myBeaconServiceImpl = new MyBeaconServiceImpl();
        this.f9063a = myBeaconServiceImpl;
        myBeaconServiceImpl.onCreate();
        this.f9063a.setMyBeaconListener(this.c);
    }

    public void onFinalized() {
        this.b = null;
        this.f9063a.onDestroy();
    }

    public void setNode(WeakReference<App> weakReference) {
        if (weakReference.get() != null) {
            this.b = weakReference.get();
        }
    }

    public Class<App> getNodeType() {
        return App.class;
    }
}
