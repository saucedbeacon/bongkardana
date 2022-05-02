package com.alibaba.griver.bluetooth.altbeacon.beacon;

public interface MonitorNotifier {
    public static final int INSIDE = 1;
    public static final int OUTSIDE = 0;

    void didDetermineStateForRegion(int i, Region region);

    void didEnterRegion(Region region);

    void didExitRegion(Region region);
}
