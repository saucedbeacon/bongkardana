package com.alibaba.griver.bluetooth.altbeacon.beacon;

import android.content.Context;
import android.content.Intent;
import com.alibaba.griver.bluetooth.altbeacon.beacon.logging.LogManager;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.MonitoringData;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.MonitoringStatus;
import com.alibaba.griver.bluetooth.altbeacon.beacon.service.RangingData;
import java.util.Collection;
import java.util.Set;

class IntentHandler {

    /* renamed from: a  reason: collision with root package name */
    private static final String f10247a = IntentHandler.class.getSimpleName();

    IntentHandler() {
    }

    public void convertIntentsToCallbacks(Context context, Intent intent) {
        MonitoringData monitoringData;
        RangingData rangingData = null;
        if (intent == null || intent.getExtras() == null) {
            monitoringData = null;
        } else {
            monitoringData = intent.getExtras().getBundle("monitoringData") != null ? MonitoringData.fromBundle(intent.getExtras().getBundle("monitoringData")) : null;
            if (intent.getExtras().getBundle("rangingData") != null) {
                rangingData = RangingData.fromBundle(intent.getExtras().getBundle("rangingData"));
            }
        }
        if (rangingData != null) {
            LogManager.d(f10247a, "got ranging data", new Object[0]);
            if (rangingData.getBeacons() == null) {
                LogManager.w(f10247a, "Ranging data has a null beacons collection", new Object[0]);
            }
            Set<RangeNotifier> rangingNotifiers = BeaconManager.getInstanceForApplication(context).getRangingNotifiers();
            Collection<Beacon> beacons = rangingData.getBeacons();
            if (rangingNotifiers != null) {
                for (RangeNotifier didRangeBeaconsInRegion : rangingNotifiers) {
                    didRangeBeaconsInRegion.didRangeBeaconsInRegion(beacons, rangingData.getRegion());
                }
            } else {
                LogManager.d(f10247a, "but ranging notifier is null, so we're dropping it.", new Object[0]);
            }
            RangeNotifier dataRequestNotifier = BeaconManager.getInstanceForApplication(context).getDataRequestNotifier();
            if (dataRequestNotifier != null) {
                dataRequestNotifier.didRangeBeaconsInRegion(beacons, rangingData.getRegion());
            }
        }
        if (monitoringData != null) {
            LogManager.d(f10247a, "got monitoring data", new Object[0]);
            Set<MonitorNotifier> monitoringNotifiers = BeaconManager.getInstanceForApplication(context).getMonitoringNotifiers();
            if (monitoringNotifiers != null) {
                for (MonitorNotifier next : monitoringNotifiers) {
                    LogManager.d(f10247a, "Calling monitoring notifier: %s", next);
                    Region region = monitoringData.getRegion();
                    Integer valueOf = Integer.valueOf(monitoringData.isInside() ? 1 : 0);
                    next.didDetermineStateForRegion(valueOf.intValue(), region);
                    MonitoringStatus.getInstanceForApplication(context).updateLocalState(region, valueOf);
                    if (monitoringData.isInside()) {
                        next.didEnterRegion(monitoringData.getRegion());
                    } else {
                        next.didExitRegion(monitoringData.getRegion());
                    }
                }
            }
        }
    }
}
