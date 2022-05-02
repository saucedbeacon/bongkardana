package com.alibaba.griver.bluetooth.ibeacon;

public class BeaconResult {
    public String[] error;
    public Object obj;
    public boolean success;

    public BeaconResult(boolean z) {
        this.success = z;
    }

    public BeaconResult(boolean z, String[] strArr) {
        this.success = z;
        this.error = strArr;
    }

    public String getErrorCode() {
        String[] strArr = this.error;
        return (strArr == null || strArr.length <= 1) ? "" : strArr[0];
    }

    public String getErrorMessage() {
        String[] strArr = this.error;
        return (strArr == null || strArr.length <= 1) ? "" : strArr[1];
    }
}
