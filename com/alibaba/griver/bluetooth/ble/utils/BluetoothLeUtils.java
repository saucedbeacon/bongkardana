package com.alibaba.griver.bluetooth.ble.utils;

import android.util.SparseArray;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BluetoothLeUtils {
    public static boolean rollbackConnectParam() {
        return false;
    }

    public static boolean rollbackFixBoolean() {
        return false;
    }

    public static String toString(List<String> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public static String toString(SparseArray<byte[]> sparseArray) {
        if (sparseArray == null) {
            return "null";
        }
        if (sparseArray.size() == 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        for (int i = 0; i < sparseArray.size(); i++) {
            sb.append(sparseArray.keyAt(i));
            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb.append(Arrays.toString(sparseArray.valueAt(i)));
        }
        sb.append('}');
        return sb.toString();
    }

    public static <T> String toString(Map<T, String> map) {
        if (map == null) {
            return "null";
        }
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        Iterator<Map.Entry<T, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Object key = it.next().getKey();
            sb.append(key);
            sb.append(SimpleComparison.EQUAL_TO_OPERATION);
            sb.append(map.get(key));
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public static boolean equals(SparseArray<byte[]> sparseArray, SparseArray<byte[]> sparseArray2) {
        if (sparseArray == sparseArray2) {
            return true;
        }
        if (sparseArray == null || sparseArray2 == null || sparseArray.size() != sparseArray2.size()) {
            return false;
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            if (sparseArray.keyAt(i) != sparseArray2.keyAt(i) || !Arrays.equals(sparseArray.valueAt(i), sparseArray2.valueAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int safeParseInt(String str, int i) {
        try {
            return Integer.parseInt(str, i);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
