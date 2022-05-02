package com.alibaba.griver.bluetooth.altbeacon.beacon.client;

public class DataProviderException extends Exception {
    private static final long serialVersionUID = -2574842662565384114L;

    public DataProviderException() {
    }

    public DataProviderException(String str) {
        super(str);
    }

    public DataProviderException(String str, Throwable th) {
        super(str, th);
    }
}
