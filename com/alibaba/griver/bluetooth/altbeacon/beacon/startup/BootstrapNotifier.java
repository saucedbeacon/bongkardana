package com.alibaba.griver.bluetooth.altbeacon.beacon.startup;

import android.content.Context;
import com.alibaba.griver.bluetooth.altbeacon.beacon.MonitorNotifier;

public interface BootstrapNotifier extends MonitorNotifier {
    Context getApplicationContext();
}
