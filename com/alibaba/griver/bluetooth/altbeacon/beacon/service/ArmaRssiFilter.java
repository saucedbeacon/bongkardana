package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;

public class ArmaRssiFilter implements RssiFilter {

    /* renamed from: a  reason: collision with root package name */
    private static double f10255a = 0.1d;
    private int b;
    private double c;
    private boolean d;

    public boolean noMeasurementsAvailable() {
        return false;
    }

    public ArmaRssiFilter() {
        this.c = 0.1d;
        this.d = false;
        this.c = f10255a;
    }

    public static void setDEFAULT_ARMA_SPEED(double d2) {
        f10255a = d2;
    }

    public void addMeasurement(Integer num) {
        LogManager.d("ArmaRssiFilter", "adding rssi: %s", num);
        if (!this.d) {
            this.b = num.intValue();
            this.d = true;
        }
        int i = this.b;
        double d2 = (double) i;
        double d3 = this.c;
        double intValue = (double) (i - num.intValue());
        Double.isNaN(intValue);
        Double.isNaN(d2);
        int intValue2 = Double.valueOf(d2 - (d3 * intValue)).intValue();
        this.b = intValue2;
        LogManager.d("ArmaRssiFilter", "armaMeasurement: %s", Integer.valueOf(intValue2));
    }

    public double calculateRssi() {
        return (double) this.b;
    }
}
