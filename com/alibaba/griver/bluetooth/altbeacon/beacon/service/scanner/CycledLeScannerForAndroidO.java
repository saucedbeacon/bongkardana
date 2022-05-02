package com.alibaba.griver.bluetooth.altbeacon.beacon.service.scanner;

import android.annotation.TargetApi;
import android.content.Context;
import com.alibaba.griver.bluetooth.altbeacon.bluetooth.BluetoothCrashResolver;

@TargetApi(26)
class CycledLeScannerForAndroidO extends CycledLeScannerForLollipop {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10270a = CycledLeScannerForAndroidO.class.getSimpleName();

    CycledLeScannerForAndroidO(Context context, long j, long j2, boolean z, CycledLeScanCallback cycledLeScanCallback, BluetoothCrashResolver bluetoothCrashResolver) {
        super(context, j, j2, z, cycledLeScanCallback, bluetoothCrashResolver);
    }
}
