package com.alibaba.griver.bluetooth.ibeacon;

public class MyBeacon {
    public static final int PROXIMITY_FAR = 3;
    public static final int PROXIMITY_IMMEDIATE = 1;
    public static final int PROXIMITY_NEAR = 2;
    public static final int PROXIMITY_UNKNOWN = 0;
    public double accuracy;
    public int major;
    public int minor;
    public int proximity;
    public int rssi;
    public int txPower;
    public String uuid;

    public MyBeacon(String str, int i, int i2, double d, int i3, int i4) {
        this.uuid = str;
        this.major = i;
        this.minor = i2;
        this.accuracy = d;
        this.rssi = i3;
        this.txPower = i4;
    }

    public boolean equals(Object obj) {
        String str;
        if (!(obj == null || !(obj instanceof MyBeacon) || (str = this.uuid) == null)) {
            MyBeacon myBeacon = (MyBeacon) obj;
            if (str.equals(myBeacon.uuid) && this.major == myBeacon.major && this.minor == myBeacon.minor) {
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return a().toString().hashCode();
    }

    private StringBuilder a() {
        StringBuilder sb = new StringBuilder();
        sb.append("uuid:");
        String str = this.uuid;
        if (str == null) {
            str = "null";
        }
        sb.append(str);
        sb.append(" ");
        sb.append("major:");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.major);
        sb2.append(" ");
        sb.append(sb2.toString());
        sb.append("minor:");
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.minor);
        sb3.append(" ");
        sb.append(sb3.toString());
        return sb;
    }
}
