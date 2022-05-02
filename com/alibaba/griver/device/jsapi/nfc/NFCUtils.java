package com.alibaba.griver.device.jsapi.nfc;

import android.content.Context;
import android.nfc.NfcAdapter;
import android.os.Build;
import com.google.common.base.Ascii;

public class NFCUtils {
    public static boolean hasFeatureHCE(Context context) {
        return Build.VERSION.SDK_INT >= 21 && context.getPackageManager().hasSystemFeature("android.hardware.nfc.hce");
    }

    public static boolean hasFeatureNfc(Context context) {
        if (Build.VERSION.SDK_INT >= 10) {
            return context.getPackageManager().hasSystemFeature("android.hardware.nfc");
        }
        return false;
    }

    public static boolean isNfcEnable(Context context) {
        NfcAdapter defaultAdapter;
        if (Build.VERSION.SDK_INT < 10 || (defaultAdapter = NfcAdapter.getDefaultAdapter(context)) == null || !defaultAdapter.isEnabled()) {
            return false;
        }
        return true;
    }

    public static String byteArrayToHexString(byte[] bArr) {
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        char[] cArr2 = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i] & 255;
            int i2 = i * 2;
            cArr2[i2] = cArr[b >>> 4];
            cArr2[i2 + 1] = cArr[b & Ascii.SI];
        }
        return new String(cArr2);
    }

    public static byte[] hexStringToByteArray(String str) {
        int length = str.length();
        if (length % 2 != 1) {
            byte[] bArr = new byte[(length / 2)];
            for (int i = 0; i < length; i += 2) {
                bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
            }
            return bArr;
        }
        throw new IllegalArgumentException("Hex string must have even number of characters");
    }
}
