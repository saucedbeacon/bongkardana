package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

import android.os.SystemClock;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon;
import com.alibaba.griver.bluetooth.altbeacon.beacon.BeaconManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import java.io.Serializable;

public class RangedBeacon implements Serializable {
    public static final long DEFAULT_MAX_TRACKING_AGE = 5000;
    public static final long DEFAULT_SAMPLE_EXPIRATION_MILLISECONDS = 20000;
    private static final String TAG = "RangedBeacon";
    public static long maxTrackingAge = 5000;
    private static long sampleExpirationMilliseconds = 20000;
    protected long lastTrackedTimeMillis = 0;
    Beacon mBeacon;
    protected transient RssiFilter mFilter = null;
    private boolean mTracked = true;

    public RangedBeacon(Beacon beacon) {
        updateBeacon(beacon);
    }

    public static void setSampleExpirationMilliseconds(long j) {
        sampleExpirationMilliseconds = j;
        RunningAverageRssiFilter.setSampleExpirationMilliseconds(j);
    }

    public static void setMaxTrackinAge(int i) {
        maxTrackingAge = (long) i;
    }

    public void updateBeacon(Beacon beacon) {
        this.mBeacon = beacon;
        addMeasurement(Integer.valueOf(beacon.getRssi()));
    }

    public boolean isTracked() {
        return this.mTracked;
    }

    public void setTracked(boolean z) {
        this.mTracked = z;
    }

    public Beacon getBeacon() {
        return this.mBeacon;
    }

    public void commitMeasurements() {
        RunningAverageRssiFilter.setSampleExpirationMilliseconds(sampleExpirationMilliseconds);
        if (!getFilter().noMeasurementsAvailable()) {
            double calculateRssi = getFilter().calculateRssi();
            this.mBeacon.setRunningAverageRssi(calculateRssi);
            LogManager.d(TAG, "calculated new runningAverageRssi: %s", Double.valueOf(calculateRssi));
            return;
        }
        LogManager.d(TAG, "No measurements available to calculate running average", new Object[0]);
    }

    public void addMeasurement(Integer num) {
        if (num.intValue() != 127) {
            this.mTracked = true;
            this.lastTrackedTimeMillis = SystemClock.elapsedRealtime();
            getFilter().addMeasurement(num);
        }
    }

    public boolean noMeasurementsAvailable() {
        return getFilter().noMeasurementsAvailable();
    }

    public long getTrackingAge() {
        return SystemClock.elapsedRealtime() - this.lastTrackedTimeMillis;
    }

    public boolean isExpired() {
        return getTrackingAge() > maxTrackingAge;
    }

    private RssiFilter getFilter() {
        if (this.mFilter == null) {
            try {
                this.mFilter = (RssiFilter) BeaconManager.getRssiFilterImplClass().getConstructors()[0].newInstance(new Object[0]);
            } catch (Exception unused) {
                LogManager.e(TAG, "Could not construct RssiFilterImplClass %s", BeaconManager.getRssiFilterImplClass().getName());
            }
        }
        return this.mFilter;
    }
}
