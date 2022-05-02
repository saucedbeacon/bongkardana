package com.alipay.mobile.security.bio.sensor;

public class SensorData {
    String accelermeter;
    String gyrometer;
    String magmetic;

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(this.accelermeter);
        sb.append(",");
        sb.append(this.gyrometer);
        sb.append(",");
        sb.append(this.magmetic);
        sb.append("]");
        return sb.toString();
    }
}
