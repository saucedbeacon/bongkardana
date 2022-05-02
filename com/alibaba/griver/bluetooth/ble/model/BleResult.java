package com.alibaba.griver.bluetooth.ble.model;

public class BleResult {
    public String[] error;
    public Object obj;
    public boolean success;
    public boolean syncReturn;

    public BleResult() {
    }

    public BleResult(boolean z, boolean z2) {
        this.success = z;
        this.syncReturn = z2;
    }

    public BleResult(boolean z, boolean z2, String[] strArr) {
        this.success = z;
        this.syncReturn = z2;
        this.error = strArr;
    }

    public String getErrorCode() {
        String[] strArr = this.error;
        if (strArr == null || strArr.length <= 0) {
            return null;
        }
        return strArr[0];
    }

    public String getErrorMessage() {
        String[] strArr = this.error;
        if (strArr == null || strArr.length <= 1) {
            return null;
        }
        return strArr[1];
    }
}
