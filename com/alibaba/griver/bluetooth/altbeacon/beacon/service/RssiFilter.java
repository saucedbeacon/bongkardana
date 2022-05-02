package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

public interface RssiFilter {
    void addMeasurement(Integer num);

    double calculateRssi();

    boolean noMeasurementsAvailable();
}
