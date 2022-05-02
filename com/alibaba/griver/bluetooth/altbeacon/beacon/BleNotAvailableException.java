package com.alibaba.griver.bluetooth.altbeacon.beacon;

public class BleNotAvailableException extends RuntimeException {
    private static final long serialVersionUID = 2242747823097637729L;

    public BleNotAvailableException(String str) {
        super(str);
    }
}
