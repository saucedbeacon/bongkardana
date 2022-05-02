package com.alibaba.griver.bluetooth.altbeacon.beacon.distance;

import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;

public class CurveFittedDistanceCalculator implements DistanceCalculator {
    public static final String TAG = "CurveFittedDistanceCalculator";

    /* renamed from: a  reason: collision with root package name */
    private double f10248a;
    private double b;
    private double c;

    public CurveFittedDistanceCalculator(double d, double d2, double d3) {
        this.f10248a = d;
        this.b = d2;
        this.c = d3;
    }

    public double calculateDistance(int i, double d) {
        double d2;
        if (d == 0.0d) {
            return -1.0d;
        }
        LogManager.d(TAG, "calculating distance based on mRssi of %s and txPower of %s", Double.valueOf(d), Integer.valueOf(i));
        double d3 = (double) i;
        Double.isNaN(d3);
        double d4 = (d * 1.0d) / d3;
        if (d4 < 1.0d) {
            d2 = Math.pow(d4, 10.0d);
        } else {
            d2 = (this.f10248a * Math.pow(d4, this.b)) + this.c;
        }
        LogManager.d(TAG, "avg mRssi: %s distance: %s", Double.valueOf(d), Double.valueOf(d2));
        return d2;
    }
}
