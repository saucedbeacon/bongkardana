package com.alibaba.griver.bluetooth.ble;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.ariver.kernel.common.RVProxy;
import com.alibaba.ariver.kernel.common.service.RVConfigService;
import com.alibaba.griver.bluetooth.ble.model.BleDevice;
import com.alibaba.griver.bluetooth.ble.model.BleGattCharacteristic;
import com.alibaba.griver.bluetooth.ble.model.BleGattService;
import com.alibaba.griver.bluetooth.ble.model.BleResult;
import com.alibaba.griver.bluetooth.ble.model.ScanRecord;
import com.alibaba.griver.bluetooth.ble.utils.BluetoothHelper;
import com.alibaba.griver.bluetooth.ble.utils.BluetoothLeUtils;
import com.alibaba.griver.ui.popmenu.TinyAppActionState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@TargetApi(18)
public class BLEManager {

    /* renamed from: a  reason: collision with root package name */
    private Context f10278a;
    private BluetoothAdapter b;
    /* access modifiers changed from: private */
    public Map<String, BleDevice> c;
    /* access modifiers changed from: private */
    public Map<String, BleDevice> d;
    /* access modifiers changed from: private */
    public Map<String, BleDevice> e;
    /* access modifiers changed from: private */
    public Handler f;
    /* access modifiers changed from: private */
    public Handler g;
    private ScanHandler h;
    private BroadcastReceiver i;
    /* access modifiers changed from: private */
    public boolean j;
    /* access modifiers changed from: private */
    public BetterBleListener k;
    private boolean l;
    private boolean m;
    /* access modifiers changed from: private */
    public List<BleDevice> n;

    /* renamed from: o  reason: collision with root package name */
    private BluetoothManager f10279o;
    /* access modifiers changed from: private */
    public int p;
    /* access modifiers changed from: private */
    public byte[] q;
    /* access modifiers changed from: private */
    public boolean r;
    /* access modifiers changed from: private */
    public boolean s;
    /* access modifiers changed from: private */
    public int t;
    /* access modifiers changed from: private */
    public boolean u;
    private BluetoothAdapter.LeScanCallback v = new BluetoothAdapter.LeScanCallback() {
        public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            if (BLEManager.this.c == null || BLEManager.this.c.isEmpty()) {
                BLETraceMonitor.getInstance().onFirstScanTime(0);
            }
            if (!BLEManager.this.c.containsKey(bluetoothDevice.getAddress())) {
                ScanRecord parseFromBytes = ScanRecord.parseFromBytes(bArr);
                BleDevice createBleDevice = BleDevice.createBleDevice(bluetoothDevice);
                createBleDevice.RSSI = i;
                createBleDevice.manufacturerData = BluetoothHelper.getManufacturerData(bArr);
                createBleDevice.advertisData = createBleDevice.manufacturerData;
                createBleDevice.advertisServiceUUIDs = parseFromBytes.getServiceUuids();
                createBleDevice.serviceData = parseFromBytes.getServiceData();
                BLEManager.this.c.put(bluetoothDevice.getAddress(), createBleDevice);
                if (BLEManager.this.t == 0) {
                    if (BLEManager.this.k != null) {
                        BLEManager.this.n.clear();
                        BLEManager.this.n.add(createBleDevice);
                        BLEManager.this.k.onBluetoothDeviceFound(BLEManager.this.n);
                    }
                } else if (!BLEManager.this.n.contains(createBleDevice)) {
                    BLEManager.this.n.add(createBleDevice);
                }
            } else if (BLEManager.this.s) {
                ScanRecord parseFromBytes2 = ScanRecord.parseFromBytes(bArr);
                BleDevice bleDevice = (BleDevice) BLEManager.this.c.get(bluetoothDevice.getAddress());
                bleDevice.manufacturerData = BluetoothHelper.getManufacturerData(bArr);
                bleDevice.advertisData = bleDevice.manufacturerData;
                bleDevice.advertisServiceUUIDs = parseFromBytes2.getServiceUuids();
                bleDevice.serviceData = parseFromBytes2.getServiceData();
                bleDevice.RSSI = i;
                if (BLEManager.this.t == 0) {
                    if (BLEManager.this.k != null) {
                        BLEManager.this.n.clear();
                        BLEManager.this.n.add(bleDevice);
                        BLEManager.this.k.onBluetoothDeviceFound(BLEManager.this.n);
                    }
                } else if (!BLEManager.this.n.contains(bleDevice)) {
                    BLEManager.this.n.add(bleDevice);
                }
            }
        }
    };
    private BluetoothGattCallback w = new BluetoothGattCallback() {
        public void onConnectionStateChange(final BluetoothGatt bluetoothGatt, final int i, int i2) {
            super.onConnectionStateChange(bluetoothGatt, i, i2);
            if (i2 == 2) {
                if (!BLEManager.this.d.containsKey(bluetoothGatt.getDevice().getAddress())) {
                    if (bluetoothGatt.discoverServices()) {
                        BLEManager.this.g.postDelayed(new Runnable() {
                            public void run() {
                                BLEManager.this.a(bluetoothGatt);
                                BLETraceMonitor.getInstance().onConnectedSuccessful(bluetoothGatt.getDevice().getAddress(), 0, i);
                            }
                        }, 5000);
                    }
                    BleDevice createConnectedBleDevice = BleDevice.createConnectedBleDevice(bluetoothGatt.getDevice(), bluetoothGatt);
                    BLEManager.this.d.put(bluetoothGatt.getDevice().getAddress(), createConnectedBleDevice);
                    if (!BLEManager.this.e.containsKey(bluetoothGatt.getDevice().getAddress())) {
                        BLEManager.this.e.put(bluetoothGatt.getDevice().getAddress(), createConnectedBleDevice);
                    }
                }
            } else if (i2 == 0) {
                if (BLEManager.this.u || BLEManager.this.r) {
                    BLEManager.this.f.post(new Runnable() {
                        public void run() {
                            boolean unused = BLEManager.this.r = false;
                            BLEManager.this.close((BleDevice) BLEManager.this.e.get(bluetoothGatt.getDevice().getAddress()));
                        }
                    });
                }
                BLEManager.this.d.remove(bluetoothGatt.getDevice().getAddress());
                BLETraceMonitor.getInstance().onDisconnectBLE(bluetoothGatt.getDevice().getAddress(), 0, i);
            }
            if (BLEManager.this.k != null && i2 != 2) {
                BLEManager.this.g.removeCallbacksAndMessages((Object) null);
                BLEManager.this.k.onBluetoothConnectionStateChange(bluetoothGatt.getDevice().getAddress(), false);
            }
        }

        public void onServicesDiscovered(final BluetoothGatt bluetoothGatt, int i) {
            super.onServicesDiscovered(bluetoothGatt, i);
            bluetoothGatt.getServices();
            BLEManager.this.g.post(new Runnable() {
                public void run() {
                    BLEManager.this.a(bluetoothGatt);
                }
            });
            BLETraceMonitor.getInstance().onServicesDiscovered(0, i);
        }

        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicRead(bluetoothGatt, bluetoothGattCharacteristic, i);
            String bytesToHexString = BluetoothHelper.bytesToHexString(bluetoothGattCharacteristic.getValue());
            if (BLEManager.this.k != null) {
                BLEManager.this.k.onBluetoothCharacteristicRead(bluetoothGatt.getDevice().getAddress(), bluetoothGattCharacteristic.getService().getUuid().toString(), bluetoothGattCharacteristic.getUuid().toString(), bytesToHexString);
                BLEManager.this.k.onBluetoothCharacteristicValueChange(bluetoothGatt.getDevice().getAddress(), bluetoothGattCharacteristic.getService().getUuid().toString(), bluetoothGattCharacteristic.getUuid().toString(), bytesToHexString);
            }
        }

        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
            super.onCharacteristicWrite(bluetoothGatt, bluetoothGattCharacteristic, i);
            if (BLEManager.this.p < BLEManager.this.q.length) {
                int min = Math.min(BLEManager.this.q.length - BLEManager.this.p, 20);
                byte[] bArr = new byte[min];
                System.arraycopy(BLEManager.this.q, BLEManager.this.p, bArr, 0, min);
                BLEManager bLEManager = BLEManager.this;
                int unused = bLEManager.p = bLEManager.p + min;
                bluetoothGattCharacteristic.setValue(bArr);
                bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
            }
            if (BLEManager.this.k != null) {
                BLEManager.this.k.onBluetoothCharacteristicWrite(bluetoothGatt.getDevice().getAddress(), bluetoothGattCharacteristic.getService().getUuid().toString(), bluetoothGattCharacteristic.getUuid().toString());
            }
            BLETraceMonitor.getInstance().onCharacteristicWrite(0);
        }

        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            super.onCharacteristicChanged(bluetoothGatt, bluetoothGattCharacteristic);
            String bytesToHexString = BluetoothHelper.bytesToHexString(bluetoothGattCharacteristic.getValue());
            if (BLEManager.this.k != null) {
                BLEManager.this.k.onBluetoothCharacteristicValueChange(bluetoothGatt.getDevice().getAddress(), bluetoothGattCharacteristic.getService().getUuid().toString(), bluetoothGattCharacteristic.getUuid().toString(), bytesToHexString);
            }
        }

        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorWrite(bluetoothGatt, bluetoothGattDescriptor, i);
            if (bluetoothGattDescriptor != null && bluetoothGattDescriptor.getCharacteristic() != null && BLEManager.this.k != null) {
                BLEManager.this.k.onBluetoothDescriptorWrite(bluetoothGatt.getDevice().getAddress(), bluetoothGattDescriptor.getCharacteristic().getService().getUuid().toString(), bluetoothGattDescriptor.getCharacteristic().getUuid().toString(), bluetoothGattDescriptor.getUuid().toString());
            }
        }

        public void onDescriptorRead(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
            super.onDescriptorRead(bluetoothGatt, bluetoothGattDescriptor, i);
        }
    };

    public BLEManager(Context context) {
        this.f10278a = context;
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashMap();
        this.b = BluetoothAdapter.getDefaultAdapter();
        this.j = false;
        this.r = false;
        this.s = false;
        this.n = new ArrayList();
        this.f = new Handler(Looper.getMainLooper());
        this.g = new Handler(Looper.getMainLooper());
        this.h = new ScanHandler(Looper.getMainLooper());
        this.f10279o = (BluetoothManager) context.getSystemService(TinyAppActionState.ACTION_BLUE_TOOTH);
        this.u = true;
    }

    public void setBetterBleListener(BetterBleListener betterBleListener) {
        this.k = betterBleListener;
    }

    public void reset() {
        b();
        stopBleScan(false);
    }

    public void registerBLEState() {
        a();
    }

    public boolean enableBluetooth() {
        RVConfigService rVConfigService = (RVConfigService) RVProxy.get(RVConfigService.class);
        String config = rVConfigService != null ? rVConfigService.getConfig("ta_ble_enable_forcibly", "YES") : null;
        if (this.b == null || !TextUtils.equals(config, "YES")) {
            return false;
        }
        if (!this.b.isEnabled()) {
            return this.b.enable();
        }
        return this.b.isEnabled();
    }

    public boolean disableBluetooth() {
        BluetoothAdapter bluetoothAdapter = this.b;
        if (bluetoothAdapter == null) {
            return false;
        }
        if (bluetoothAdapter.isEnabled()) {
            return this.b.disable();
        }
        return this.b.isEnabled();
    }

    public void openBluetoothAdapter() {
        reset();
        a();
        BLETraceMonitor.getInstance().onOpenBluetoothAdapter();
        this.m = true;
    }

    public void closeBluetoothAdapter() {
        b();
        stopBleScan(false);
        disconnectAndClose();
        this.n.clear();
        BLETraceMonitor.getInstance().onCloseBluetoothAdapter(0);
        this.m = false;
    }

    /* access modifiers changed from: private */
    public void a(BluetoothGatt bluetoothGatt) {
        BetterBleListener betterBleListener = this.k;
        if (betterBleListener != null && !this.l) {
            betterBleListener.onBluetoothConnectionStateChange(bluetoothGatt.getDevice().getAddress(), true);
            this.l = true;
        }
    }

    private void a() {
        if (this.i == null) {
            this.i = new BroadcastReceiver() {
                public void onReceive(Context context, Intent intent) {
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                    if (intExtra != 10) {
                        if (intExtra == 12 && BLEManager.this.k != null) {
                            BLEManager.this.k.onBluetoothAdapterStateChange(true, BLEManager.this.j);
                        }
                    } else if (BLEManager.this.k != null) {
                        BLEManager.this.k.onBluetoothAdapterStateChange(false, BLEManager.this.j);
                    }
                }
            };
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
            this.f10278a.registerReceiver(this.i, intentFilter);
        }
    }

    private void b() {
        BroadcastReceiver broadcastReceiver = this.i;
        if (broadcastReceiver != null) {
            this.f10278a.unregisterReceiver(broadcastReceiver);
        }
        this.i = null;
    }

    public boolean isDiscovering() {
        return this.j;
    }

    public boolean isOpened() {
        return this.m;
    }

    public BleResult startBleScan(String[] strArr, boolean z, int i2) {
        if (!BluetoothHelper.isSupportBLE(this.f10278a)) {
            return new BleResult(false, true, ErrorConstants.ERROR_UNSUPPORT_BLE);
        }
        if (Build.VERSION.SDK_INT >= 23 && !BluetoothHelper.hasLocationPermission(this.f10278a)) {
            BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_SCAN_LOCATION_UNAVAILABLE[1]);
            return new BleResult(false, true, ErrorConstants.ERROR_SCAN_LOCATION_UNAVAILABLE);
        } else if (this.j) {
            return new BleResult(true, true);
        } else {
            this.s = z;
            this.t = i2 >= 100 ? i2 : 0;
            this.c.clear();
            this.n.clear();
            int i3 = this.t;
            if (i3 > 0) {
                this.h.sendEmptyMessageDelayed(0, (long) i3);
            }
            if (this.b == null) {
                return new BleResult(false, true);
            }
            BLETraceMonitor.getInstance().onStartBleScan(strArr, z, i2);
            if (strArr == null || strArr.length <= 0) {
                boolean startLeScan = this.b.startLeScan(this.v);
                this.j = startLeScan;
                return new BleResult(startLeScan, true);
            }
            UUID[] uuidArr = new UUID[strArr.length];
            for (int i4 = 0; i4 < strArr.length; i4++) {
                UUID uUIDFromString = BluetoothHelper.getUUIDFromString(strArr[i4]);
                if (uUIDFromString == null) {
                    return new BleResult(false, true, ErrorConstants.ERROR_SCAN_INVALID_UUID);
                }
                uuidArr[i4] = uUIDFromString;
            }
            boolean startLeScan2 = this.b.startLeScan(uuidArr, this.v);
            this.j = startLeScan2;
            return new BleResult(startLeScan2, true);
        }
    }

    public void stopBleScan(boolean z) {
        if (BluetoothHelper.isSupportBLE(this.f10278a)) {
            if (z) {
                BLETraceMonitor.getInstance().onStopBleScan();
            }
            this.j = false;
            this.n.clear();
            this.h.removeCallbacksAndMessages((Object) null);
            BluetoothAdapter bluetoothAdapter = this.b;
            if (bluetoothAdapter != null) {
                bluetoothAdapter.stopLeScan(this.v);
            }
        }
    }

    public List<BleDevice> getBluetoothDevices() {
        Map<String, BleDevice> map = this.c;
        if (map != null && !map.isEmpty()) {
            BLETraceMonitor.getInstance().onGetBluetoothDevices(this.c.keySet().toString());
        }
        return new ArrayList(this.c.values());
    }

    public List<BleDevice> getConnectedBluetoothDevices() {
        List<BluetoothDevice> connectedDevices = this.f10279o.getConnectedDevices(7);
        if (connectedDevices == null || connectedDevices.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(connectedDevices.size());
        for (BluetoothDevice createBleDevice : connectedDevices) {
            arrayList.add(BleDevice.createBleDevice(createBleDevice));
        }
        return arrayList;
    }

    public BleResult connect(String str, int i2) {
        boolean z;
        if (!BluetoothHelper.isSupportBLE(this.f10278a)) {
            return new BleResult(false, true, ErrorConstants.ERROR_UNSUPPORT_BLE);
        }
        this.l = false;
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            return new BleResult(false, true, ErrorConstants.ERROR_DEVICEID_INVALID);
        }
        BluetoothDevice remoteDevice = this.b.getRemoteDevice(str);
        if (remoteDevice == null) {
            return new BleResult(false, true, ErrorConstants.ERROR_DEVICE_NOT_FOUND);
        }
        if (this.f10279o.getConnectionState(remoteDevice, 7) == 2) {
            this.d.containsKey(str);
            return new BleResult(true, true);
        }
        BLETraceMonitor.getInstance().onConnect(str, i2);
        BluetoothGatt bluetoothGatt = null;
        if (BluetoothLeUtils.rollbackConnectParam()) {
            bluetoothGatt = remoteDevice.connectGatt(this.f10278a, false, this.w);
        } else if (Build.VERSION.SDK_INT >= 23) {
            bluetoothGatt = remoteDevice.connectGatt(this.f10278a, false, this.w, i2);
        } else if (Build.VERSION.SDK_INT >= 21) {
            try {
                bluetoothGatt = (BluetoothGatt) remoteDevice.getClass().getMethod("connectGatt", new Class[]{Context.class, Boolean.TYPE, BluetoothGattCallback.class, Integer.TYPE}).invoke(remoteDevice, new Object[]{this.f10278a, Boolean.FALSE, this.w, Integer.valueOf(i2)});
                z = true;
            } catch (Exception unused) {
                z = false;
            }
            if (!z) {
                bluetoothGatt = remoteDevice.connectGatt(this.f10278a, false, this.w);
            }
        } else {
            bluetoothGatt = remoteDevice.connectGatt(this.f10278a, false, this.w);
        }
        if (bluetoothGatt == null) {
            return new BleResult(false, true, ErrorConstants.ERROR_CONNECT_FAIL);
        }
        return new BleResult(true, false);
    }

    public BleResult disconnect(String str) {
        if (!BluetoothHelper.isSupportBLE(this.f10278a)) {
            return new BleResult(false, true, ErrorConstants.ERROR_UNSUPPORT_BLE);
        }
        if (this.b == null) {
            return new BleResult(false, true, ErrorConstants.ERROR_BLUETOOTHADAPTER_NOT_INITIALIZED);
        }
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            return new BleResult(false, true, ErrorConstants.ERROR_DEVICEID_INVALID);
        }
        BleDevice bleDevice = this.e.get(str);
        if (bleDevice == null || bleDevice.gatt == null) {
            return new BleResult(true, true);
        }
        bleDevice.gatt.disconnect();
        BLETraceMonitor.getInstance().onDisconnect(str);
        return new BleResult(true, false);
    }

    public Collection<BleDevice> disconnectAllDevices() {
        if (!BluetoothHelper.isSupportBLE(this.f10278a) || this.b == null) {
            return null;
        }
        ArrayList<BleDevice> arrayList = new ArrayList<>(this.e.values());
        for (BleDevice bleDevice : arrayList) {
            if (bleDevice.gatt != null) {
                bleDevice.gatt.disconnect();
            }
        }
        return arrayList;
    }

    public void close(BleDevice bleDevice) {
        if (BluetoothHelper.isSupportBLE(this.f10278a) && bleDevice != null) {
            bleDevice.gatt.close();
            this.d.remove(bleDevice.deviceId);
            this.e.remove(bleDevice.deviceId);
        }
    }

    public void closeAll(Collection<BleDevice> collection) {
        if (BluetoothHelper.isSupportBLE(this.f10278a)) {
            if (collection != null) {
                for (BleDevice next : collection) {
                    if (next.gatt != null) {
                        next.gatt.close();
                    }
                }
            }
            this.d.clear();
            this.e.clear();
            this.c.clear();
        }
    }

    public BleResult disconnectAndClose(String str) {
        if (this.e.containsKey(str)) {
            this.r = true;
        }
        return disconnect(str);
    }

    public void disconnectAndClose() {
        final Collection<BleDevice> disconnectAllDevices = disconnectAllDevices();
        this.f.postDelayed(new Runnable() {
            public void run() {
                BLEManager.this.closeAll(disconnectAllDevices);
            }
        }, 200);
    }

    public BleResult getBluetoothServices(String str) {
        if (!BluetoothHelper.isSupportBLE(this.f10278a)) {
            return new BleResult(false, true, ErrorConstants.ERROR_UNSUPPORT_BLE);
        }
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            return new BleResult(false, true, ErrorConstants.ERROR_DEVICEID_INVALID);
        }
        if (!this.d.containsKey(str)) {
            return new BleResult(false, true, ErrorConstants.ERROR_DEVICE_NOT_FOUND);
        }
        BleResult bleResult = new BleResult();
        ArrayList arrayList = new ArrayList();
        List<BluetoothGattService> services = this.d.get(str).gatt.getServices();
        if (services != null) {
            for (BluetoothGattService next : services) {
                BleGattService bleGattService = new BleGattService();
                bleGattService.serviceId = next.getUuid().toString();
                bleGattService.isPrimary = next.getType() == 0;
                arrayList.add(bleGattService);
            }
        }
        bleResult.success = true;
        bleResult.syncReturn = true;
        bleResult.obj = arrayList;
        return bleResult;
    }

    public BleResult getBluetoothCharacteristics(String str, String str2) {
        List<BluetoothGattCharacteristic> characteristics;
        if (!BluetoothHelper.isSupportBLE(this.f10278a)) {
            BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_UNSUPPORT_BLE[1]);
            return new BleResult(false, true, ErrorConstants.ERROR_UNSUPPORT_BLE);
        } else if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_DEVICEID_INVALID[1]);
            return new BleResult(false, true, ErrorConstants.ERROR_DEVICEID_INVALID);
        } else if (!this.d.containsKey(str)) {
            BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_DEVICE_NOT_FOUND[1]);
            return new BleResult(false, true, ErrorConstants.ERROR_DEVICE_NOT_FOUND);
        } else {
            UUID uUIDFromString = BluetoothHelper.getUUIDFromString(str2);
            if (uUIDFromString == null) {
                BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_SERVICEID_INVALID[1]);
                return new BleResult(false, true, ErrorConstants.ERROR_SERVICEID_INVALID);
            }
            BLETraceMonitor.getInstance().onGetBluetoothCharacteristics(str, str2);
            BleResult bleResult = new BleResult();
            ArrayList arrayList = new ArrayList();
            BluetoothGattService service = this.d.get(str).gatt.getService(uUIDFromString);
            if (!(service == null || (characteristics = service.getCharacteristics()) == null)) {
                for (BluetoothGattCharacteristic createCharacteristic : characteristics) {
                    arrayList.add(BleGattCharacteristic.createCharacteristic(createCharacteristic));
                }
            }
            bleResult.success = true;
            bleResult.syncReturn = true;
            bleResult.obj = arrayList;
            return bleResult;
        }
    }

    public BleResult readData(String str, String str2, String str3) {
        if (!BluetoothHelper.isSupportBLE(this.f10278a)) {
            BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_UNSUPPORT_BLE[1]);
            return new BleResult(false, true, ErrorConstants.ERROR_UNSUPPORT_BLE);
        } else if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_DEVICEID_INVALID[1]);
            return new BleResult(false, true, ErrorConstants.ERROR_DEVICEID_INVALID);
        } else {
            BleDevice bleDevice = this.d.get(str);
            if (bleDevice == null) {
                BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_DEVICE_NOT_FOUND[1]);
                return new BleResult(false, true, ErrorConstants.ERROR_DEVICE_NOT_FOUND);
            }
            UUID uUIDFromString = BluetoothHelper.getUUIDFromString(str2);
            if (uUIDFromString == null) {
                BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_SERVICEID_INVALID[1]);
                return new BleResult(false, true, ErrorConstants.ERROR_SERVICEID_INVALID);
            }
            UUID uUIDFromString2 = BluetoothHelper.getUUIDFromString(str3);
            if (uUIDFromString2 == null) {
                BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_CHARACTERISTICID_INVALID[1]);
                return new BleResult(false, true, ErrorConstants.ERROR_CHARACTERISTICID_INVALID);
            }
            BluetoothGattService service = bleDevice.gatt.getService(uUIDFromString);
            BleResult bleResult = new BleResult(false, true);
            if (service != null) {
                BluetoothGattCharacteristic characteristic = service.getCharacteristic(uUIDFromString2);
                BLETraceMonitor.getInstance().onReadData(str, str2, str3);
                if (characteristic == null) {
                    bleResult.error = ErrorConstants.ERROR_CHARACTERISTIC_NOT_FOUND;
                } else if ((characteristic.getProperties() & 2) == 0) {
                    bleResult.error = ErrorConstants.ERROR_CHARACTERISTIC_OPERATION_NOT_SUPPORT;
                    return bleResult;
                } else {
                    boolean readCharacteristic = bleDevice.gatt.readCharacteristic(characteristic);
                    bleResult.success = readCharacteristic;
                    bleResult.syncReturn = !readCharacteristic;
                    if (readCharacteristic) {
                        bleResult.obj = BleGattCharacteristic.createCharacteristic(characteristic);
                        return bleResult;
                    }
                    bleResult.error = ErrorConstants.ERROR_READ_CHARACTERISTIC_FAIL;
                    return bleResult;
                }
            } else {
                bleResult.error = ErrorConstants.ERROR_SERVICE_NOT_FOUND;
            }
            return bleResult;
        }
    }

    public BleResult sendData(String str, String str2, String str3, String str4) {
        if (!BluetoothHelper.isSupportBLE(this.f10278a)) {
            BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_UNSUPPORT_BLE[1]);
            return new BleResult(false, true, ErrorConstants.ERROR_UNSUPPORT_BLE);
        } else if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_DEVICEID_INVALID[1]);
            return new BleResult(false, true, ErrorConstants.ERROR_DEVICEID_INVALID);
        } else {
            UUID uUIDFromString = BluetoothHelper.getUUIDFromString(str2);
            if (uUIDFromString == null) {
                BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_SERVICEID_INVALID[1]);
                return new BleResult(false, true, ErrorConstants.ERROR_SERVICEID_INVALID);
            }
            UUID uUIDFromString2 = BluetoothHelper.getUUIDFromString(str3);
            if (uUIDFromString2 == null) {
                BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_CHARACTERISTICID_INVALID[1]);
                return new BleResult(false, true, ErrorConstants.ERROR_CHARACTERISTICID_INVALID);
            }
            BleDevice bleDevice = this.d.get(str);
            if (bleDevice == null) {
                BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_DEVICE_NOT_FOUND[1]);
                return new BleResult(false, true, ErrorConstants.ERROR_DEVICE_NOT_FOUND);
            }
            BluetoothGattService service = bleDevice.gatt.getService(uUIDFromString);
            BleResult bleResult = new BleResult(false, true);
            if (service != null) {
                BluetoothGattCharacteristic characteristic = service.getCharacteristic(uUIDFromString2);
                if (characteristic != null) {
                    if ((characteristic.getProperties() & 4) > 0) {
                        characteristic.setWriteType(1);
                    }
                    BLETraceMonitor.getInstance().onSendData(str, str2, str3, str4);
                    boolean a2 = a(bleDevice.gatt, characteristic, str4);
                    bleResult.success = a2;
                    bleResult.syncReturn = !a2;
                    if (!a2) {
                        bleResult.error = ErrorConstants.ERROR_WRITE_CHARACTERISTIC_FAIL;
                    }
                    return bleResult;
                }
                bleResult.error = ErrorConstants.ERROR_CHARACTERISTIC_NOT_FOUND;
            } else {
                bleResult.error = ErrorConstants.ERROR_SERVICE_NOT_FOUND;
            }
            return bleResult;
        }
    }

    private boolean a(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, String str) {
        this.p = 0;
        if (str != null && (str.startsWith("0X") || str.startsWith("0x"))) {
            str = str.substring(2);
        }
        if (str.length() % 2 == 0) {
            this.q = new byte[(str.length() / 2)];
            int i2 = 0;
            while (true) {
                byte[] bArr = this.q;
                if (i2 < bArr.length) {
                    int i3 = i2 * 2;
                    bArr[i2] = (byte) (BluetoothLeUtils.safeParseInt(str.substring(i3, i3 + 2), 16) & 255);
                    i2++;
                } else {
                    int min = Math.min(bArr.length, 20);
                    this.p += min;
                    byte[] bArr2 = new byte[min];
                    System.arraycopy(this.q, 0, bArr2, 0, min);
                    bluetoothGattCharacteristic.setValue(bArr2);
                    try {
                        BLETraceMonitor.getInstance().onWriteValue(0);
                        return bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return false;
    }

    public BleResult notifyCharacteristicValue(String str, String str2, String str3, String str4, boolean z) {
        List<BluetoothGattDescriptor> descriptors;
        List<BluetoothGattDescriptor> descriptors2;
        boolean z2 = z;
        if (!BluetoothHelper.isSupportBLE(this.f10278a)) {
            BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_UNSUPPORT_BLE[1]);
            return new BleResult(false, true, ErrorConstants.ERROR_UNSUPPORT_BLE);
        } else if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_DEVICEID_INVALID[1]);
            return new BleResult(false, true, ErrorConstants.ERROR_DEVICEID_INVALID);
        } else {
            String str5 = str;
            BleDevice bleDevice = this.d.get(str);
            if (bleDevice == null) {
                BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_DEVICE_NOT_FOUND[1]);
                return new BleResult(false, true, ErrorConstants.ERROR_DEVICE_NOT_FOUND);
            }
            UUID uUIDFromString = BluetoothHelper.getUUIDFromString(str2);
            if (uUIDFromString == null) {
                BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_SERVICEID_INVALID[1]);
                return new BleResult(false, true, ErrorConstants.ERROR_SERVICEID_INVALID);
            }
            UUID uUIDFromString2 = BluetoothHelper.getUUIDFromString(str3);
            if (uUIDFromString2 == null) {
                BLETraceMonitor.getInstance().onError(ErrorConstants.ERROR_CHARACTERISTICID_INVALID[1]);
                return new BleResult(false, true, ErrorConstants.ERROR_CHARACTERISTICID_INVALID);
            }
            BluetoothGatt bluetoothGatt = bleDevice.gatt;
            BluetoothGattService service = bluetoothGatt.getService(uUIDFromString);
            BLETraceMonitor.getInstance().onNotifyCharacteristicValue(str, str2, str3, str4, z);
            BleResult bleResult = new BleResult(false, true);
            if (service == null) {
                bleResult.error = ErrorConstants.ERROR_SERVICE_NOT_FOUND;
            } else if (!TextUtils.isEmpty(str3)) {
                BluetoothGattCharacteristic characteristic = service.getCharacteristic(uUIDFromString2);
                if (characteristic != null) {
                    int properties = characteristic.getProperties();
                    String str6 = "00002902-0000-1000-8000-00805f9b34fb";
                    if ((properties & 16) != 0) {
                        bluetoothGatt.setCharacteristicNotification(characteristic, z2);
                        if (!TextUtils.isEmpty(str4)) {
                            str6 = str4;
                        }
                        BluetoothGattDescriptor descriptor = characteristic.getDescriptor(BluetoothHelper.getUUIDFromString(str6));
                        if (descriptor == null && (descriptors2 = characteristic.getDescriptors()) != null && descriptors2.size() > 0) {
                            descriptor = descriptors2.get(0);
                        }
                        if (descriptor != null) {
                            descriptor.setValue(z2 ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
                            bluetoothGatt.writeDescriptor(descriptor);
                        }
                        bleResult.success = true;
                        bleResult.syncReturn = false;
                    } else if ((properties & 32) != 0) {
                        bluetoothGatt.setCharacteristicNotification(characteristic, z2);
                        if (!TextUtils.isEmpty(str4)) {
                            str6 = str4;
                        }
                        BluetoothGattDescriptor descriptor2 = characteristic.getDescriptor(BluetoothHelper.getUUIDFromString(str6));
                        if (descriptor2 == null && (descriptors = characteristic.getDescriptors()) != null && descriptors.size() > 0) {
                            descriptor2 = descriptors.get(0);
                        }
                        if (descriptor2 != null) {
                            descriptor2.setValue(z2 ? BluetoothGattDescriptor.ENABLE_INDICATION_VALUE : BluetoothGattDescriptor.DISABLE_NOTIFICATION_VALUE);
                            bluetoothGatt.writeDescriptor(descriptor2);
                        }
                        bleResult.success = true;
                        bleResult.syncReturn = false;
                    } else {
                        bleResult.error = ErrorConstants.ERROR_CHARACTERISTIC_OPERATION_NOT_SUPPORT;
                    }
                } else {
                    bleResult.error = ErrorConstants.ERROR_CHARACTERISTIC_NOT_FOUND;
                }
            }
            return bleResult;
        }
    }

    class ScanHandler extends Handler {
        public ScanHandler(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            if (BLEManager.this.k != null && !BLEManager.this.n.isEmpty()) {
                BLEManager.this.k.onBluetoothDeviceFound(BLEManager.this.n);
            }
            BLEManager.this.n.clear();
            sendEmptyMessageDelayed(0, (long) BLEManager.this.t);
        }
    }
}
