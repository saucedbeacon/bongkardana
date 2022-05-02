package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

import android.os.Bundle;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Region;

public class MonitoringData {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f10259a;
    private final Region b;

    public MonitoringData(boolean z, Region region) {
        this.f10259a = z;
        this.b = region;
    }

    public static MonitoringData fromBundle(Bundle bundle) {
        bundle.setClassLoader(Region.class.getClassLoader());
        return new MonitoringData(Boolean.valueOf(bundle.getBoolean("inside")).booleanValue(), bundle.get("region") != null ? (Region) bundle.getSerializable("region") : null);
    }

    public boolean isInside() {
        return this.f10259a;
    }

    public Region getRegion() {
        return this.b;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("region", this.b);
        bundle.putBoolean("inside", this.f10259a);
        return bundle;
    }
}
