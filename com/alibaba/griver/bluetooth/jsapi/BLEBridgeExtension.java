package com.alibaba.griver.bluetooth.jsapi;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.ariver.app.api.App;
import com.alibaba.ariver.app.api.Page;
import com.alibaba.ariver.app.api.point.page.PageDestroyPoint;
import com.alibaba.ariver.engine.api.EngineUtils;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeCallback;
import com.alibaba.ariver.engine.api.bridge.extension.BridgeResponse;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingCallback;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingParam;
import com.alibaba.ariver.engine.api.bridge.extension.annotation.BindingRequest;
import com.alibaba.ariver.engine.api.bridge.model.SendToRenderCallback;
import com.alibaba.ariver.kernel.api.annotation.ActionFilter;
import com.alibaba.ariver.kernel.api.annotation.AutoCallback;
import com.alibaba.ariver.kernel.api.annotation.ThreadType;
import com.alibaba.ariver.kernel.api.extension.bridge.BridgeExtension;
import com.alibaba.ariver.kernel.api.node.NodeAware;
import com.alibaba.ariver.kernel.api.security.Permission;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVEnvironmentService;
import com.alibaba.ariver.kernel.common.service.executor.ExecutorType;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.griver.bluetooth.ble.BLEOperation;
import com.alibaba.griver.bluetooth.ble.BLETraceMonitor;
import com.alibaba.griver.bluetooth.ble.BetterBleListener;
import com.alibaba.griver.bluetooth.ble.BetterBleService;
import com.alibaba.griver.bluetooth.ble.BetterBleServiceImpl;
import com.alibaba.griver.bluetooth.ble.ErrorConstants;
import com.alibaba.griver.bluetooth.ble.model.BleDevice;
import com.alibaba.griver.bluetooth.ble.model.BleGattCharacteristic;
import com.alibaba.griver.bluetooth.ble.model.BleResult;
import com.alibaba.griver.bluetooth.ble.model.BluetoothState;
import com.alibaba.griver.bluetooth.ble.model.TimeOutContext;
import com.alibaba.griver.bluetooth.ble.utils.BluetoothLeUtils;
import com.alibaba.griver.bluetooth.proxy.RVBluetoothProxy;
import com.alibaba.griver.bluetooth.workflow.BLEServiceUnit;
import com.alibaba.griver.bluetooth.workflow.BLEStateUnit;
import com.alibaba.griver.bluetooth.workflow.SimpleWorkflowUnit;
import com.alibaba.griver.bluetooth.workflow.Workflow;
import id.dana.twilio.identityverification.TwilioIdentityVerificationActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BLEBridgeExtension implements PageDestroyPoint, BridgeExtension, NodeAware<App> {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f9062a = BLEBridgeExtension.class.getSimpleName();
    /* access modifiers changed from: private */
    public Map<String, List<BridgeCallback>> b;
    /* access modifiers changed from: private */
    public App c;
    /* access modifiers changed from: private */
    public BetterBleService d;
    private boolean e;
    /* access modifiers changed from: private */
    public List<BleGattCharacteristic> f;
    private int g = 15000;
    private List<BLEOperation> h;
    /* access modifiers changed from: private */
    public TaskHandler i = new TaskHandler(Looper.getMainLooper());
    private BetterBleListener j = new BetterBleListener() {
        public void onBluetoothAdapterStateChange(boolean z, boolean z2) {
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
            if (BLEBridgeExtension.this.c != null && (activePage = BLEBridgeExtension.this.c.getActivePage()) != null) {
                EngineUtils.sendToRender(activePage.getRender(), "bluetoothAdapterStateChange", jSONObject2, (SendToRenderCallback) null);
            }
        }

        public void onBluetoothDeviceFound(List<BleDevice> list) {
            Page activePage;
            if (list == null) {
                list = new ArrayList<>();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("devices", JSON.toJSON(list));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", (Object) jSONObject);
            if (BLEBridgeExtension.this.c != null && (activePage = BLEBridgeExtension.this.c.getActivePage()) != null) {
                EngineUtils.sendToRender(activePage.getRender(), "bluetoothDeviceFound", jSONObject2, (SendToRenderCallback) null);
            }
        }

        public void onBluetoothConnectionStateChange(String str, boolean z) {
            Page activePage;
            if (z) {
                BLEBridgeExtension.this.i.sendEmptyMessage(101);
            } else {
                BLEBridgeExtension.this.i.sendEmptyMessage(102);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceId", (Object) str);
            jSONObject.put("connected", (Object) Boolean.valueOf(z));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", (Object) jSONObject);
            if (BLEBridgeExtension.this.c != null && (activePage = BLEBridgeExtension.this.c.getActivePage()) != null) {
                EngineUtils.sendToRender(activePage.getRender(), "BLEConnectionStateChanged", jSONObject2, (SendToRenderCallback) null);
            }
        }

        public void onBluetoothCharacteristicValueChange(String str, String str2, String str3, String str4) {
            Page activePage;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceId", (Object) str);
            jSONObject.put("serviceId", (Object) str2);
            jSONObject.put("characteristicId", (Object) str3);
            jSONObject.put("value", (Object) str4);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("data", (Object) jSONObject);
            if (BLEBridgeExtension.this.c != null && (activePage = BLEBridgeExtension.this.c.getActivePage()) != null) {
                EngineUtils.sendToRender(activePage.getRender(), "BLECharacteristicValueChange", jSONObject2, (SendToRenderCallback) null);
            }
        }

        public void onBluetoothCharacteristicRead(String str, String str2, String str3, String str4) {
            BLEBridgeExtension.this.i.sendMessage(BLEBridgeExtension.this.i.obtainMessage(104, BleGattCharacteristic.createCharacteristic(str2, str3, str4)));
        }

        public void onBluetoothCharacteristicWrite(String str, String str2, String str3) {
            BLEBridgeExtension.this.i.sendEmptyMessage(103);
        }

        public void onBluetoothDescriptorWrite(String str, String str2, String str3, String str4) {
            BLEBridgeExtension.this.i.sendEmptyMessage(105);
        }
    };

    /* access modifiers changed from: private */
    public String a(int i2) {
        if (i2 == 1) {
            return "connectBLEDevice";
        }
        if (i2 == 2) {
            return "disconnectBLEDevice";
        }
        if (i2 == 3) {
            return "writeBLECharacteristicValue";
        }
        if (i2 == 4) {
            return "readBLECharacteristicValue";
        }
        if (i2 != 5) {
            return null;
        }
        return "notifyBLECharacteristicValueChange";
    }

    public Permission permit() {
        return null;
    }

    /* access modifiers changed from: private */
    public static void a(JSONObject jSONObject, String[] strArr) {
        jSONObject.put("error", (Object) strArr[0]);
        jSONObject.put("errorMessage", (Object) strArr[1]);
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse closeBluetoothAdapter() {
        BetterBleService betterBleService = this.d;
        if (betterBleService != null) {
            betterBleService.closeBluetoothAdapter();
            JSONObject jSONObject = new JSONObject();
            b();
            return new BridgeResponse(jSONObject);
        }
        b();
        return a(false);
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse enableBluetooth() {
        b();
        BetterBleService betterBleService = this.d;
        if (betterBleService == null) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        if (betterBleService.enableBluetooth()) {
            return BridgeResponse.SUCCESS;
        }
        return BridgeResponse.UNKNOWN_ERROR;
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse disableBluetooth() {
        b();
        BetterBleService betterBleService = this.d;
        if (betterBleService == null) {
            return BridgeResponse.UNKNOWN_ERROR;
        }
        if (betterBleService.disableBluetooth()) {
            return BridgeResponse.SUCCESS;
        }
        return BridgeResponse.UNKNOWN_ERROR;
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void getBluetoothAdapterState(@BindingCallback BridgeCallback bridgeCallback) {
        Workflow.create(bridgeCallback).addUnit(BLEServiceUnit.create(this.d)).addUnit(BLEStateUnit.create(this.d)).addUnit(new SimpleWorkflowUnit() {
            public void onProcess(JSONObject jSONObject, BridgeCallback bridgeCallback) {
                jSONObject.put("discovering", (Object) Boolean.valueOf(BLEBridgeExtension.this.d.isDiscovering()));
                jSONObject.put("available", (Object) Boolean.TRUE);
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        }).onTrigger();
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void getBLEDeviceServices(@BindingCallback BridgeCallback bridgeCallback, @BindingParam({"deviceId"}) final String str) {
        Workflow.create(bridgeCallback).addUnit(BLEServiceUnit.create(this.d)).addUnit(BLEStateUnit.create(this.d)).addUnit(new SimpleWorkflowUnit() {
            public void onProcess(JSONObject jSONObject, BridgeCallback bridgeCallback) {
                if (TextUtils.isEmpty(str)) {
                    BLEBridgeExtension.a(jSONObject, ErrorConstants.ERROR_PARAM_LACK);
                    bridgeCallback.sendJSONResponse(jSONObject);
                    return;
                }
                BleResult bluetoothServices = BLEBridgeExtension.this.d.getBluetoothServices(str);
                if (bluetoothServices.success) {
                    jSONObject.put("services", JSON.toJSON((List) bluetoothServices.obj));
                    bridgeCallback.sendJSONResponse(jSONObject);
                    return;
                }
                if (bluetoothServices.error == null || bluetoothServices.error.length <= 1) {
                    jSONObject.put("error", (Object) "12");
                } else {
                    jSONObject.put("error", (Object) bluetoothServices.getErrorCode());
                    jSONObject.put("errorMessage", (Object) bluetoothServices.getErrorMessage());
                }
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        }).onTrigger();
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void getBLEDeviceCharacteristics(@BindingCallback BridgeCallback bridgeCallback, @BindingParam({"deviceId"}) final String str, @BindingParam({"serviceId"}) final String str2) {
        Workflow.create(bridgeCallback).addUnit(BLEServiceUnit.create(this.d)).addUnit(BLEStateUnit.create(this.d)).addUnit(new SimpleWorkflowUnit() {
            public void onProcess(JSONObject jSONObject, BridgeCallback bridgeCallback) {
                if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                    BLEBridgeExtension.a(jSONObject, ErrorConstants.ERROR_PARAM_LACK);
                    bridgeCallback.sendJSONResponse(jSONObject);
                    return;
                }
                BleResult bluetoothCharacteristics = BLEBridgeExtension.this.d.getBluetoothCharacteristics(str, str2);
                if (bluetoothCharacteristics.success) {
                    jSONObject.put("characteristics", JSON.toJSON((List) bluetoothCharacteristics.obj));
                    bridgeCallback.sendJSONResponse(jSONObject);
                    return;
                }
                if (bluetoothCharacteristics.error == null || bluetoothCharacteristics.error.length <= 1) {
                    jSONObject.put("error", (Object) "12");
                } else {
                    jSONObject.put("error", (Object) bluetoothCharacteristics.getErrorCode());
                    jSONObject.put("errorMessage", (Object) bluetoothCharacteristics.getErrorMessage());
                }
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        }).onTrigger();
    }

    @AutoCallback
    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public BridgeResponse openBluetoothAdapter(@BindingParam(booleanDefault = true, value = {"autoClose"}) boolean z) {
        this.d.registerBLEState();
        this.e = z;
        return a();
    }

    private BridgeResponse a() {
        b();
        BetterBleService betterBleService = this.d;
        if (betterBleService == null) {
            return a(false);
        }
        boolean isSupportBLE = betterBleService.isSupportBLE();
        int bluetoothState = this.d.getBluetoothState();
        JSONObject jSONObject = new JSONObject();
        if (bluetoothState == BluetoothState.OFF.ordinal()) {
            int i2 = bluetoothState - 1;
            jSONObject.put("error", (Object) ErrorConstants.ERROR_CODE_ARRAY[i2]);
            jSONObject.put("errorMessage", (Object) ErrorConstants.BLUETOOTH_STATE_STR[i2]);
        } else {
            jSONObject.put("isSupportBLE", (Object) Boolean.valueOf(isSupportBLE));
        }
        if (isSupportBLE && bluetoothState == BluetoothState.ON.ordinal()) {
            this.d.openBluetoothAdapter();
        }
        return new BridgeResponse(jSONObject);
    }

    private BridgeResponse a(boolean z) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("error", (Object) "12");
        return new BridgeResponse(jSONObject);
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void startBluetoothDevicesDiscovery(@BindingCallback BridgeCallback bridgeCallback, @BindingParam({"services"}) final String str, @BindingParam({"allowDuplicatesKey"}) final boolean z, @BindingParam({"interval"}) final int i2) {
        Workflow.create(bridgeCallback).addUnit(BLEServiceUnit.create(this.d)).addUnit(BLEStateUnit.create(this.d)).addUnit(new SimpleWorkflowUnit() {
            public void onProcess(JSONObject jSONObject, BridgeCallback bridgeCallback) {
                String[] strArr;
                if (!TextUtils.isEmpty(str)) {
                    List<String> parseArray = JSON.parseArray(str, String.class);
                    if (parseArray != null) {
                        strArr = new String[parseArray.size()];
                        parseArray.toArray(strArr);
                    } else {
                        jSONObject.put("error", (Object) ErrorConstants.ERROR_SERVICEID_INVALID[0]);
                        jSONObject.put("errorMessage", (Object) ErrorConstants.ERROR_SERVICEID_INVALID[1]);
                        bridgeCallback.sendJSONResponse(jSONObject);
                        return;
                    }
                } else {
                    strArr = null;
                }
                BleResult startBluetoothDevicesDiscovery = BLEBridgeExtension.this.d.startBluetoothDevicesDiscovery(strArr, z, i2);
                if (!startBluetoothDevicesDiscovery.success) {
                    if (startBluetoothDevicesDiscovery.error == null || startBluetoothDevicesDiscovery.error.length <= 1) {
                        jSONObject.put("error", (Object) "12");
                    } else {
                        jSONObject.put("error", (Object) startBluetoothDevicesDiscovery.getErrorCode());
                        jSONObject.put("errorMessage", (Object) startBluetoothDevicesDiscovery.getErrorMessage());
                    }
                }
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        }).onTrigger();
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void stopBluetoothDevicesDiscovery(@BindingCallback BridgeCallback bridgeCallback) {
        Workflow.create(bridgeCallback).addUnit(BLEServiceUnit.create(this.d)).addUnit(BLEStateUnit.create(this.d)).addUnit(new SimpleWorkflowUnit() {
            public void onProcess(JSONObject jSONObject, BridgeCallback bridgeCallback) {
                BLEBridgeExtension.this.d.stopBluetoothDevicesDiscovery();
                bridgeCallback.sendBridgeResponse(BridgeResponse.SUCCESS);
            }
        }).onTrigger();
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void getBluetoothDevices(@BindingCallback BridgeCallback bridgeCallback) {
        Workflow.create(bridgeCallback).addUnit(BLEServiceUnit.create(this.d)).addUnit(BLEStateUnit.create(this.d)).addUnit(new SimpleWorkflowUnit() {
            public void onProcess(JSONObject jSONObject, BridgeCallback bridgeCallback) {
                List<BleDevice> bluetoothDevices = BLEBridgeExtension.this.d.getBluetoothDevices();
                if (bluetoothDevices != null) {
                    jSONObject.put("devices", JSON.toJSON(bluetoothDevices));
                }
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        }).onTrigger();
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void getConnectedBluetoothDevices(@BindingCallback BridgeCallback bridgeCallback) {
        Workflow.create(bridgeCallback).addUnit(BLEServiceUnit.create(this.d)).addUnit(BLEStateUnit.create(this.d)).addUnit(new SimpleWorkflowUnit() {
            public void onProcess(JSONObject jSONObject, BridgeCallback bridgeCallback) {
                List<BleDevice> connectedBluetoothDevices = BLEBridgeExtension.this.d.getConnectedBluetoothDevices();
                if (connectedBluetoothDevices != null) {
                    jSONObject.put("devices", JSON.toJSON(connectedBluetoothDevices));
                }
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        }).onTrigger();
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void connectBLEDevice(@BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        f("connectBLEDevice", jSONObject, bridgeCallback);
    }

    private void a(final String str, final JSONObject jSONObject, BridgeCallback bridgeCallback) {
        Workflow.create(bridgeCallback).addUnit(BLEServiceUnit.create(this.d)).addUnit(BLEStateUnit.create(this.d)).addUnit(new SimpleWorkflowUnit() {
            public void onProcess(JSONObject jSONObject, BridgeCallback bridgeCallback) {
                int i;
                if (!jSONObject.containsKey("deviceId")) {
                    BLEBridgeExtension.a(jSONObject, ErrorConstants.ERROR_PARAM_LACK);
                    bridgeCallback.sendJSONResponse(jSONObject);
                    BLEBridgeExtension.this.i.sendEmptyMessage(0);
                    return;
                }
                if (jSONObject.get(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT) != null) {
                    try {
                        i = BLEBridgeExtension.this.a(jSONObject.get(TwilioIdentityVerificationActivity.CHALLENGE_INFO_TIMEOUT));
                    } catch (JSONException unused) {
                        BLEBridgeExtension.a(jSONObject, ErrorConstants.ERROR_MESSAGE_INVALID_PARAM);
                        bridgeCallback.sendJSONResponse(jSONObject);
                        BLEBridgeExtension.this.i.sendEmptyMessage(0);
                        return;
                    }
                } else {
                    i = 0;
                }
                if (i < 0) {
                    BLEBridgeExtension.a(jSONObject, ErrorConstants.ERROR_MESSAGE_INVALID_PARAM);
                    bridgeCallback.sendJSONResponse(jSONObject);
                    BLEBridgeExtension.this.i.sendEmptyMessage(0);
                    return;
                }
                BleResult connectBluetoothDevice = BLEBridgeExtension.this.d.connectBluetoothDevice(jSONObject.getString("deviceId"), jSONObject.getIntValue("transport"));
                if (!connectBluetoothDevice.syncReturn) {
                    BLEBridgeExtension.this.a(str, bridgeCallback, jSONObject.getString("deviceId"), i);
                    return;
                }
                if (!connectBluetoothDevice.success) {
                    if (connectBluetoothDevice.error == null || connectBluetoothDevice.error.length <= 1) {
                        jSONObject.put("error", (Object) "12");
                    } else {
                        jSONObject.put("error", (Object) connectBluetoothDevice.getErrorCode());
                        jSONObject.put("errorMessage", (Object) connectBluetoothDevice.getErrorMessage());
                    }
                }
                BLEBridgeExtension.this.i.sendEmptyMessage(0);
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        }).setOnErrorListener(new Workflow.OnErrorListener() {
            public void onError(JSONObject jSONObject, BridgeCallback bridgeCallback) {
                BLEBridgeExtension.this.i.sendEmptyMessage(0);
            }
        }).onTrigger();
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void disconnectBLEDevice(@BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        f("disconnectBLEDevice", jSONObject, bridgeCallback);
    }

    private void b(final String str, final JSONObject jSONObject, BridgeCallback bridgeCallback) {
        Workflow.create(bridgeCallback).addUnit(BLEServiceUnit.create(this.d)).addUnit(BLEStateUnit.create(this.d)).addUnit(new SimpleWorkflowUnit() {
            public void onProcess(JSONObject jSONObject, BridgeCallback bridgeCallback) {
                if (!jSONObject.containsKey("deviceId")) {
                    BLEBridgeExtension.a(jSONObject, ErrorConstants.ERROR_PARAM_LACK);
                    BLEBridgeExtension.this.i.sendEmptyMessage(0);
                    bridgeCallback.sendJSONResponse(jSONObject);
                    return;
                }
                BleResult disconnectBluetoothDevice = BLEBridgeExtension.this.d.disconnectBluetoothDevice(jSONObject.getString("deviceId"));
                if (!disconnectBluetoothDevice.syncReturn) {
                    BLEBridgeExtension.this.a(str, bridgeCallback);
                    return;
                }
                if (!disconnectBluetoothDevice.success) {
                    if (disconnectBluetoothDevice.error == null || disconnectBluetoothDevice.error.length <= 1) {
                        jSONObject.put("error", (Object) "12");
                    } else {
                        jSONObject.put("error", (Object) disconnectBluetoothDevice.getErrorCode());
                        jSONObject.put("errorMessage", (Object) disconnectBluetoothDevice.getErrorMessage());
                    }
                }
                BLEBridgeExtension.this.i.sendEmptyMessage(0);
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        }).setOnErrorListener(new Workflow.OnErrorListener() {
            public void onError(JSONObject jSONObject, BridgeCallback bridgeCallback) {
                BLEBridgeExtension.this.i.sendEmptyMessage(0);
            }
        }).onTrigger();
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void writeBLECharacteristicValue(@BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        f("writeBLECharacteristicValue", jSONObject, bridgeCallback);
    }

    private void c(final String str, final JSONObject jSONObject, final BridgeCallback bridgeCallback) {
        Workflow.create(bridgeCallback).addUnit(BLEServiceUnit.create(this.d)).addUnit(BLEStateUnit.create(this.d)).addUnit(new SimpleWorkflowUnit() {
            public void onProcess(JSONObject jSONObject, BridgeCallback bridgeCallback) {
                if (!jSONObject.containsKey("deviceId") || !jSONObject.containsKey("serviceId") || !jSONObject.containsKey("characteristicId") || !jSONObject.containsKey("value")) {
                    BLEBridgeExtension.a(jSONObject, ErrorConstants.ERROR_PARAM_LACK);
                    BLEBridgeExtension.this.i.sendEmptyMessage(0);
                    bridgeCallback.sendJSONResponse(jSONObject);
                    return;
                }
                BleResult sendData = BLEBridgeExtension.this.d.sendData(jSONObject.getString("deviceId"), jSONObject.getString("serviceId"), jSONObject.getString("characteristicId"), jSONObject.getString("value"));
                if (!sendData.syncReturn) {
                    BLEBridgeExtension.this.a(str, bridgeCallback);
                    return;
                }
                if (!sendData.success) {
                    if (sendData.error == null || sendData.error.length <= 1) {
                        jSONObject.put("error", (Object) "12");
                    } else {
                        jSONObject.put("error", (Object) sendData.getErrorCode());
                        jSONObject.put("errorMessage", (Object) sendData.getErrorMessage());
                    }
                }
                BLEBridgeExtension.this.i.sendEmptyMessage(0);
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        }).setOnErrorListener(new Workflow.OnErrorListener() {
            public void onError(JSONObject jSONObject, BridgeCallback bridgeCallback) {
                BLEBridgeExtension.this.i.sendEmptyMessage(0);
            }
        }).onTrigger();
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void notifyBLECharacteristicValueChange(@BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        f("notifyBLECharacteristicValueChange", jSONObject, bridgeCallback);
    }

    private void d(final String str, final JSONObject jSONObject, final BridgeCallback bridgeCallback) {
        Workflow.create(bridgeCallback).addUnit(BLEServiceUnit.create(this.d)).addUnit(BLEStateUnit.create(this.d)).addUnit(new SimpleWorkflowUnit() {
            public void onProcess(JSONObject jSONObject, BridgeCallback bridgeCallback) {
                if (!jSONObject.containsKey("deviceId") || !jSONObject.containsKey("serviceId") || !jSONObject.containsKey("characteristicId")) {
                    BLEBridgeExtension.a(jSONObject, ErrorConstants.ERROR_PARAM_LACK);
                    BLEBridgeExtension.this.i.sendEmptyMessage(0);
                    bridgeCallback.sendJSONResponse(jSONObject);
                    return;
                }
                BleResult notifyCharacteristicValueChange = BLEBridgeExtension.this.d.notifyCharacteristicValueChange(jSONObject.getString("deviceId"), jSONObject.getString("serviceId"), jSONObject.getString("characteristicId"), jSONObject.getString("descriptorId"), jSONObject.containsKey("state") ? jSONObject.getBoolean("state").booleanValue() : true);
                if (!notifyCharacteristicValueChange.syncReturn) {
                    BLEBridgeExtension.this.a(str, bridgeCallback);
                    return;
                }
                if (!notifyCharacteristicValueChange.success) {
                    if (notifyCharacteristicValueChange.error == null || notifyCharacteristicValueChange.error.length <= 1) {
                        jSONObject.put("error", (Object) "12");
                    } else {
                        jSONObject.put("error", (Object) notifyCharacteristicValueChange.getErrorCode());
                        jSONObject.put("errorMessage", (Object) notifyCharacteristicValueChange.getErrorMessage());
                    }
                }
                BLEBridgeExtension.this.i.sendEmptyMessage(0);
                bridgeCallback.sendJSONResponse(jSONObject);
            }
        }).setOnErrorListener(new Workflow.OnErrorListener() {
            public void onError(JSONObject jSONObject, BridgeCallback bridgeCallback) {
                BLEBridgeExtension.this.i.sendEmptyMessage(0);
            }
        }).onTrigger();
    }

    @ThreadType(ExecutorType.UI)
    @ActionFilter
    public void readBLECharacteristicValue(@BindingRequest JSONObject jSONObject, @BindingCallback BridgeCallback bridgeCallback) {
        f("readBLECharacteristicValue", jSONObject, bridgeCallback);
    }

    private void e(final String str, final JSONObject jSONObject, BridgeCallback bridgeCallback) {
        Workflow.create(bridgeCallback).addUnit(BLEServiceUnit.create(this.d)).addUnit(BLEStateUnit.create(this.d)).addUnit(new SimpleWorkflowUnit() {
            public void onProcess(JSONObject jSONObject, BridgeCallback bridgeCallback) {
                if (!jSONObject.containsKey("deviceId") || !jSONObject.containsKey("serviceId") || !jSONObject.containsKey("characteristicId")) {
                    BLEBridgeExtension.a(jSONObject, ErrorConstants.ERROR_PARAM_LACK);
                    BLEBridgeExtension.this.i.sendEmptyMessage(0);
                    bridgeCallback.sendJSONResponse(jSONObject);
                    return;
                }
                BleResult readData = BLEBridgeExtension.this.d.readData(jSONObject.getString("deviceId"), jSONObject.getString("serviceId"), jSONObject.getString("characteristicId"));
                if (readData.syncReturn || readData.obj == null) {
                    if (!readData.success) {
                        if (readData.error == null || readData.error.length <= 1) {
                            jSONObject.put("error", (Object) "12");
                        } else {
                            jSONObject.put("error", (Object) readData.getErrorCode());
                            jSONObject.put("errorMessage", (Object) readData.getErrorMessage());
                        }
                    }
                    BLEBridgeExtension.this.i.sendEmptyMessage(0);
                    bridgeCallback.sendJSONResponse(jSONObject);
                    return;
                }
                BLEBridgeExtension.this.f.add((BleGattCharacteristic) readData.obj);
                BLEBridgeExtension.this.a(str, bridgeCallback);
            }
        }).setOnErrorListener(new Workflow.OnErrorListener() {
            public void onError(JSONObject jSONObject, BridgeCallback bridgeCallback) {
                BLEBridgeExtension.this.i.sendEmptyMessage(0);
            }
        }).onTrigger();
    }

    /* access modifiers changed from: private */
    public void a(String str, BridgeCallback bridgeCallback) {
        int a2 = a(str);
        b(str, bridgeCallback);
        Message obtainMessage = this.i.obtainMessage(a2, bridgeCallback);
        if ("notifyBLECharacteristicValueChange".equals(str)) {
            this.i.sendMessageDelayed(obtainMessage, 10000);
        } else {
            this.i.sendMessageDelayed(obtainMessage, 10000);
        }
    }

    /* access modifiers changed from: private */
    public void a(String str, BridgeCallback bridgeCallback, String str2, int i2) {
        int a2 = a(str);
        b(str, bridgeCallback);
        Message obtainMessage = this.i.obtainMessage(a2, new TimeOutContext(bridgeCallback, str2));
        if (i2 <= 0) {
            i2 = 10000;
        } else {
            int i3 = this.g;
            if (i2 > i3) {
                i2 = i3;
            }
        }
        this.i.sendMessageDelayed(obtainMessage, (long) i2);
    }

    private void b(String str, BridgeCallback bridgeCallback) {
        if (!this.b.containsKey(str)) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(bridgeCallback);
            this.b.put(str, arrayList);
            return;
        }
        List list = this.b.get(str);
        if (list != null) {
            list.add(bridgeCallback);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(bridgeCallback);
        this.b.put(str, arrayList2);
    }

    private int a(String str) {
        if ("connectBLEDevice".equals(str)) {
            return 1;
        }
        if ("disconnectBLEDevice".equals(str)) {
            return 2;
        }
        if ("writeBLECharacteristicValue".equals(str)) {
            return 3;
        }
        if ("readBLECharacteristicValue".equals(str)) {
            return 4;
        }
        return "notifyBLECharacteristicValueChange".equals(str) ? 5 : 0;
    }

    /* access modifiers changed from: private */
    public int a(Object obj) {
        if (obj == null) {
            return -1;
        }
        if (obj instanceof Integer) {
            Integer num = (Integer) obj;
            if (num.intValue() > 0) {
                return num.intValue();
            }
            return -1;
        } else if (obj instanceof Number) {
            return ((Number) obj).intValue();
        } else {
            return -1;
        }
    }

    private void b() {
        Map<String, List<BridgeCallback>> map = this.b;
        if (map != null) {
            map.clear();
        }
        List<BleGattCharacteristic> list = this.f;
        if (list != null) {
            list.clear();
        }
        if (this.f != null) {
            this.h.clear();
        }
        TaskHandler taskHandler = this.i;
        if (taskHandler != null) {
            taskHandler.removeCallbacksAndMessages((Object) null);
        }
    }

    public void onInitialized() {
        this.b = new HashMap();
        this.f = new ArrayList();
        this.h = new ArrayList();
        RVEnvironmentService rVEnvironmentService = (RVEnvironmentService) RVProxy.get(RVEnvironmentService.class);
        if (rVEnvironmentService != null) {
            BetterBleServiceImpl betterBleServiceImpl = new BetterBleServiceImpl();
            this.d = betterBleServiceImpl;
            betterBleServiceImpl.onCreate(rVEnvironmentService.getApplicationContext());
            this.d.setBetterBleListener(this.j);
            RVBluetoothProxy rVBluetoothProxy = (RVBluetoothProxy) RVProxy.get(RVBluetoothProxy.class);
            if (rVBluetoothProxy != null && rVBluetoothProxy.getBLEConnectMaxTimeout() != 0) {
                this.g = rVBluetoothProxy.getBLEConnectMaxTimeout();
            }
        }
    }

    public void onFinalized() {
        BetterBleService betterBleService = this.d;
        if (betterBleService != null) {
            betterBleService.onDestroy();
        }
    }

    public void setNode(WeakReference<App> weakReference) {
        if (weakReference.get() != null) {
            this.c = weakReference.get();
        }
    }

    public Class<App> getNodeType() {
        return App.class;
    }

    public void onPageDestroy(Page page) {
        if (this.e) {
            this.d.closeBluetoothAdapter();
        }
    }

    private void f(String str, JSONObject jSONObject, BridgeCallback bridgeCallback) {
        List<BLEOperation> list = this.h;
        if (list != null) {
            list.add(new BLEOperation(str, jSONObject, bridgeCallback));
            if (this.h.size() == 1) {
                a(this.h.get(0));
            }
        }
    }

    /* access modifiers changed from: private */
    public void c() {
        List<BLEOperation> list = this.h;
        if (list != null && list.size() > 0) {
            this.h.remove(0);
            if (this.h.size() > 0) {
                a(this.h.get(0));
            }
        }
    }

    private void a(BLEOperation bLEOperation) {
        JSONObject jSONObject = bLEOperation.param;
        BridgeCallback bridgeCallback = bLEOperation.bridgeCallback;
        String str = bLEOperation.action;
        if ("connectBLEDevice".equals(str)) {
            a(str, jSONObject, bridgeCallback);
        } else if ("disconnectBLEDevice".equals(str)) {
            b(str, jSONObject, bridgeCallback);
        } else if ("writeBLECharacteristicValue".equals(str)) {
            c(str, jSONObject, bridgeCallback);
        } else if ("readBLECharacteristicValue".equals(str)) {
            e(str, jSONObject, bridgeCallback);
        } else if ("notifyBLECharacteristicValueChange".equals(str)) {
            d(str, jSONObject, bridgeCallback);
        }
    }

    class TaskHandler extends Handler {
        public TaskHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            List list;
            String str;
            List list2;
            List list3;
            super.handleMessage(message);
            String access$800 = BLEBridgeExtension.this.a(message.what);
            int i = message.what;
            if (i != 1) {
                if (i == 2 || i == 3 || i == 4) {
                    if (message.obj != null) {
                        BridgeCallback bridgeCallback = (BridgeCallback) message.obj;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("error", (Object) ErrorConstants.ERROR_TIMEOUT[0]);
                        jSONObject.put("errorMessage", (Object) ErrorConstants.ERROR_TIMEOUT[1]);
                        if (message.what == 4 && BLEBridgeExtension.this.f != null && BLEBridgeExtension.this.f.size() > 0) {
                            jSONObject.put("characteristic", JSON.toJSON(BLEBridgeExtension.this.f.get(0)));
                            BLEBridgeExtension.this.f.remove(0);
                        }
                        bridgeCallback.sendBridgeResponse(new BridgeResponse(jSONObject));
                        if (!(TextUtils.isEmpty(access$800) || BLEBridgeExtension.this.b == null || (list2 = (List) BLEBridgeExtension.this.b.get(access$800)) == null)) {
                            list2.remove(bridgeCallback);
                        }
                        if (message.what == 2) {
                            str = "disconnectBLE";
                        } else if (message.what == 3) {
                            str = "writeBLE";
                        } else {
                            str = message.what == 4 ? "readBLE" : "unknown";
                        }
                        BLETraceMonitor.getInstance().onTimeout(str);
                    }
                } else if (i != 5) {
                    switch (i) {
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                            if (BLEBridgeExtension.this.b != null) {
                                List list4 = (List) BLEBridgeExtension.this.b.get(BLEBridgeExtension.this.a(message.what - 100));
                                if (list4 != null && list4.size() > 0) {
                                    JSONObject jSONObject2 = new JSONObject();
                                    if (message.what == 104) {
                                        jSONObject2.put("characteristic", JSON.toJSON(message.obj));
                                        if (BLEBridgeExtension.this.f != null && BLEBridgeExtension.this.f.size() > 0) {
                                            BLEBridgeExtension.this.f.remove(0);
                                        }
                                    }
                                    BridgeCallback bridgeCallback2 = (BridgeCallback) list4.get(0);
                                    bridgeCallback2.sendBridgeResponse(new BridgeResponse(jSONObject2));
                                    list4.remove(0);
                                    BLEBridgeExtension.this.i.removeMessages(message.what - 100, bridgeCallback2);
                                    break;
                                }
                            }
                            break;
                    }
                } else {
                    if (message.obj != null) {
                        BridgeCallback bridgeCallback3 = (BridgeCallback) message.obj;
                        bridgeCallback3.sendBridgeResponse(new BridgeResponse(new JSONObject()));
                        if (!(TextUtils.isEmpty(access$800) || BLEBridgeExtension.this.b == null || (list3 = (List) BLEBridgeExtension.this.b.get(access$800)) == null)) {
                            list3.remove(bridgeCallback3);
                        }
                    }
                    BLETraceMonitor.getInstance().onTimeout("notifyBLE");
                }
            } else if (message.obj != null) {
                BridgeCallback bridgeCallback4 = ((TimeOutContext) message.obj).bridgeCallback;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("error", (Object) ErrorConstants.ERROR_TIMEOUT[0]);
                jSONObject3.put("errorMessage", (Object) ErrorConstants.ERROR_TIMEOUT[1]);
                bridgeCallback4.sendBridgeResponse(new BridgeResponse(jSONObject3));
                if (!(TextUtils.isEmpty(access$800) || BLEBridgeExtension.this.b == null || (list = (List) BLEBridgeExtension.this.b.get(access$800)) == null)) {
                    list.remove(bridgeCallback4);
                }
                BLETraceMonitor.getInstance().onTimeout("connectBLE");
            }
            BLEBridgeExtension.this.c();
        }
    }
}
