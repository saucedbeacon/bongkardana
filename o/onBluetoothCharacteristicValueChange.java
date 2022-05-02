package o;

import android.util.SparseArray;
import id.dana.domain.homeinfo.ServiceName;

public final class onBluetoothCharacteristicValueChange {
    public static final int TYPE_OFFLINE = 10;
    private static SparseArray<String> connectionTypes;

    private onBluetoothCharacteristicValueChange() {
    }

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        connectionTypes = sparseArray;
        sparseArray.put(0, ServiceName.MOBILE_RECHARGE);
        connectionTypes.put(1, "Wifi");
        connectionTypes.put(6, "Wimax");
        connectionTypes.put(9, "Ethernet");
        connectionTypes.put(7, "Bluetooth");
        connectionTypes.put(10, "Offline");
    }

    public static String formatConnectionType(int i) {
        String str = connectionTypes.get(i);
        return str == null ? "Others" : str;
    }
}
