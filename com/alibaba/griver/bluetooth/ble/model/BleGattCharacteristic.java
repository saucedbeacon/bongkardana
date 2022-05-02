package com.alibaba.griver.bluetooth.ble.model;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothGattCharacteristic;
import com.alibaba.griver.bluetooth.ble.utils.BluetoothHelper;

@TargetApi(18)
public class BleGattCharacteristic {
    public String characteristicId;
    public CharacteristicProperty properties;
    public String serviceId;
    public String value;

    public static BleGattCharacteristic createCharacteristic(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        BleGattCharacteristic bleGattCharacteristic = new BleGattCharacteristic();
        bleGattCharacteristic.characteristicId = bluetoothGattCharacteristic.getUuid().toString();
        bleGattCharacteristic.serviceId = bluetoothGattCharacteristic.getService().getUuid().toString();
        bleGattCharacteristic.value = BluetoothHelper.bytesToHexString(bluetoothGattCharacteristic.getValue());
        CharacteristicProperty characteristicProperty = new CharacteristicProperty();
        bleGattCharacteristic.properties = characteristicProperty;
        boolean z = true;
        characteristicProperty.read = (bluetoothGattCharacteristic.getProperties() & 2) != 0;
        bleGattCharacteristic.properties.write = ((bluetoothGattCharacteristic.getProperties() & 8) == 0 && (bluetoothGattCharacteristic.getProperties() & 4) == 0) ? false : true;
        bleGattCharacteristic.properties.indicate = (bluetoothGattCharacteristic.getProperties() & 32) != 0;
        CharacteristicProperty characteristicProperty2 = bleGattCharacteristic.properties;
        if ((bluetoothGattCharacteristic.getProperties() & 16) == 0) {
            z = false;
        }
        characteristicProperty2.notify = z;
        return bleGattCharacteristic;
    }

    public static BleGattCharacteristic createCharacteristic(String str, String str2, String str3) {
        BleGattCharacteristic bleGattCharacteristic = new BleGattCharacteristic();
        bleGattCharacteristic.serviceId = str;
        bleGattCharacteristic.characteristicId = str2;
        bleGattCharacteristic.value = str3;
        return bleGattCharacteristic;
    }
}
