package com.alipay.android.phone.mobilesdk.socketcraft.platform.monitor;

import com.alipay.android.phone.mobilesdk.socketcraft.platform.PlatformUtil;

public class MonitorPrinterFactory {
    private static MonitorPrinter monitorPrinter;

    public static final MonitorPrinter getInstance() {
        MonitorPrinter monitorPrinter2 = monitorPrinter;
        if (monitorPrinter2 != null) {
            return monitorPrinter2;
        }
        synchronized (MonitorPrinterFactory.class) {
            if (monitorPrinter != null) {
                MonitorPrinter monitorPrinter3 = monitorPrinter;
                return monitorPrinter3;
            }
            if (PlatformUtil.isAndroidMPaaSPlatform()) {
                monitorPrinter = PlatformUtil.createMPaaSMonitorPrinter();
            } else {
                monitorPrinter = new DefaultMonitorPrinter();
            }
            MonitorPrinter monitorPrinter4 = monitorPrinter;
            return monitorPrinter4;
        }
    }

    public static void setMonitorPrinter(MonitorPrinter monitorPrinter2) {
        monitorPrinter = monitorPrinter2;
    }
}
