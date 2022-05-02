package com.alibaba.griver.bluetooth.ble.utils;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import com.alibaba.griver.bluetooth.ble.model.BluetoothState;
import id.dana.utils.permission.ManifestPermission;
import o.FontRes;

public class BluetoothHelper {
    public static boolean isSupportBLE(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    @TargetApi(21)
    public static boolean supportAdvertise() {
        BluetoothAdapter defaultAdapter;
        if (Build.VERSION.SDK_INT < 21 || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null || defaultAdapter.getBluetoothLeAdvertiser() == null || !defaultAdapter.isMultipleAdvertisementSupported()) {
            return false;
        }
        return true;
    }

    public static BluetoothState getBluetoothState() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return BluetoothState.UNKNOWN;
        }
        int state = defaultAdapter.getState();
        if (state == 12) {
            return BluetoothState.ON;
        }
        if (state == 11) {
            return BluetoothState.RESETTING;
        }
        return BluetoothState.OFF;
    }

    public static boolean openBluetooth() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.enable();
        }
        return false;
    }

    public static boolean closeBluetooth() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            return defaultAdapter.disable();
        }
        return false;
    }

    public static String bytesToHexString(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() < 2) {
                sb.append(0);
            }
            sb.append(hexString.toUpperCase());
        }
        return sb.toString();
    }

    public static String bytesToHexStringInReverse(byte[] bArr) {
        return bytesToHexString(a(bArr));
    }

    public static byte[] hexStringToBytes(String str) {
        if (str == null || str.equals("")) {
            return null;
        }
        String upperCase = str.toUpperCase();
        if (upperCase.startsWith("0X") || upperCase.startsWith("0x")) {
            upperCase = upperCase.substring(2);
        }
        int length = upperCase.length() / 2;
        char[] charArray = upperCase.toCharArray();
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (a(charArray[i2 + 1]) | (a(charArray[i2]) << 4));
        }
        return bArr;
    }

    public static byte[] hexStringToBytesInReverse(String str) {
        return a(hexStringToBytes(str));
    }

    private static byte[] a(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            for (int length = bArr.length - 1; length >= 0; length--) {
                bArr2[length] = bArr[(bArr.length - 1) - length];
            }
            return bArr2;
        }
        throw null;
    }

    private static byte a(char c) {
        return (byte) "0123456789ABCDEF".indexOf(c);
    }

    public static String getManufacturerData(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        int i = 0;
        while (i < bArr.length) {
            try {
                int i2 = i + 1;
                byte b = bArr[i] & 255;
                if (b == 0) {
                    break;
                }
                int i3 = b - 1;
                int i4 = i2 + 1;
                if ((bArr[i2] & 255) == 255) {
                    return bytesToHexString(a(bArr, i4, i3));
                }
                i = i3 + i4;
            } catch (Exception unused) {
            }
        }
        return "";
    }

    private static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:2|3|7) */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
        return com.alibaba.griver.bluetooth.ble.model.BluetoothUuid.parseUuidFrom(hexStringToBytesInReverse(r0)).getUuid();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.UUID getUUIDFromString(java.lang.String r0) {
        /*
            java.util.UUID r0 = java.util.UUID.fromString(r0)     // Catch:{ Exception -> 0x0005 }
            goto L_0x0013
        L_0x0005:
            byte[] r0 = hexStringToBytesInReverse(r0)     // Catch:{ Exception -> 0x0012 }
            android.os.ParcelUuid r0 = com.alibaba.griver.bluetooth.ble.model.BluetoothUuid.parseUuidFrom(r0)     // Catch:{ Exception -> 0x0012 }
            java.util.UUID r0 = r0.getUuid()     // Catch:{ Exception -> 0x0012 }
            goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.bluetooth.ble.utils.BluetoothHelper.getUUIDFromString(java.lang.String):java.util.UUID");
    }

    public static boolean hasLocationPermission(Context context) {
        return checkPermission(context, ManifestPermission.ACCESS_COARSE_LOCATION) || checkPermission(context, "android.permission.ACCESS_FINE_LOCATION");
    }

    public static boolean checkPermission(Context context, String str) {
        return FontRes.length(context, str) == 0;
    }

    public static boolean isLocationEnable(Context context) {
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager == null) {
            return false;
        }
        boolean isProviderEnabled = locationManager.isProviderEnabled("network");
        boolean isProviderEnabled2 = locationManager.isProviderEnabled("gps");
        if (isProviderEnabled || isProviderEnabled2) {
            return true;
        }
        return false;
    }
}
