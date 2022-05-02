package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

import android.os.SystemClock;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class RunningAverageRssiFilter implements RssiFilter {
    public static final long DEFAULT_SAMPLE_EXPIRATION_MILLISECONDS = 20000;

    /* renamed from: a  reason: collision with root package name */
    private static long f10262a = 20000;
    private ArrayList<Measurement> b = new ArrayList<>();

    public static void setSampleExpirationMilliseconds(long j) {
        f10262a = j;
    }

    public void addMeasurement(Integer num) {
        Measurement measurement = new Measurement();
        measurement.rssi = num;
        measurement.timestamp = SystemClock.elapsedRealtime();
        this.b.add(measurement);
    }

    public boolean noMeasurementsAvailable() {
        return this.b.size() == 0;
    }

    public double calculateRssi() {
        int i;
        a();
        int size = this.b.size();
        int i2 = size - 1;
        if (size > 2) {
            int i3 = size / 10;
            i = i3 + 1;
            i2 = (size - i3) - 2;
        } else {
            i = 0;
        }
        double d = 0.0d;
        for (int i4 = i; i4 <= i2; i4++) {
            double intValue = (double) this.b.get(i4).rssi.intValue();
            Double.isNaN(intValue);
            d += intValue;
        }
        double d2 = (double) ((i2 - i) + 1);
        Double.isNaN(d2);
        double d3 = d / d2;
        LogManager.d("RunningAverageRssiFilter", "Running average mRssi based on %s measurements: %s", Integer.valueOf(size), Double.valueOf(d3));
        return d3;
    }

    private synchronized void a() {
        ArrayList<Measurement> arrayList = new ArrayList<>();
        Iterator<Measurement> it = this.b.iterator();
        while (it.hasNext()) {
            Measurement next = it.next();
            if (SystemClock.elapsedRealtime() - next.timestamp < f10262a) {
                arrayList.add(next);
            }
        }
        this.b = arrayList;
        Collections.sort(arrayList);
    }

    class Measurement implements Comparable<Measurement> {
        Integer rssi;
        long timestamp;

        private Measurement() {
        }

        public int compareTo(Measurement measurement) {
            return this.rssi.compareTo(measurement.rssi);
        }
    }
}
