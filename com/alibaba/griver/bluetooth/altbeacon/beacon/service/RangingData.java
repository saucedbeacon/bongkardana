package com.alibaba.griver.bluetooth.altbeacon.beacon.service;

import android.os.Bundle;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Beacon;
import com.alibaba.griver.bluetooth.altbeacon.beacon.Region;
import java.util.ArrayList;
import java.util.Collection;

public class RangingData {

    /* renamed from: a  reason: collision with root package name */
    private final Collection<Beacon> f10261a;
    private final Region b;

    public RangingData(Collection<Beacon> collection, Region region) {
        synchronized (collection) {
            this.f10261a = collection;
        }
        this.b = region;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [java.io.Serializable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.alibaba.griver.bluetooth.altbeacon.beacon.service.RangingData fromBundle(android.os.Bundle r4) {
        /*
            java.lang.Class<com.alibaba.griver.bluetooth.altbeacon.beacon.Region> r0 = com.alibaba.griver.bluetooth.altbeacon.beacon.Region.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r4.setClassLoader(r0)
            java.lang.String r0 = "beacons"
            java.lang.Object r1 = r4.get(r0)
            r2 = 0
            if (r1 == 0) goto L_0x0019
            java.io.Serializable r0 = r4.getSerializable(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            goto L_0x001a
        L_0x0019:
            r0 = r2
        L_0x001a:
            java.lang.String r1 = "region"
            java.lang.Object r3 = r4.get(r1)
            if (r3 == 0) goto L_0x0029
            java.io.Serializable r4 = r4.getSerializable(r1)
            r2 = r4
            com.alibaba.griver.bluetooth.altbeacon.beacon.Region r2 = (com.alibaba.griver.bluetooth.altbeacon.beacon.Region) r2
        L_0x0029:
            com.alibaba.griver.bluetooth.altbeacon.beacon.service.RangingData r4 = new com.alibaba.griver.bluetooth.altbeacon.beacon.service.RangingData
            r4.<init>(r0, r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.griver.bluetooth.altbeacon.beacon.service.RangingData.fromBundle(android.os.Bundle):com.alibaba.griver.bluetooth.altbeacon.beacon.service.RangingData");
    }

    public Collection<Beacon> getBeacons() {
        return this.f10261a;
    }

    public Region getRegion() {
        return this.b;
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putSerializable("region", this.b);
        ArrayList arrayList = new ArrayList();
        for (Beacon add : this.f10261a) {
            arrayList.add(add);
        }
        bundle.putSerializable("beacons", arrayList);
        return bundle;
    }
}
