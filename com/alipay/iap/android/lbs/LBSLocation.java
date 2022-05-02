package com.alipay.iap.android.lbs;

import android.location.Location;

public class LBSLocation extends Location {

    /* renamed from: a  reason: collision with root package name */
    private long f9112a = 0;
    private int b = LBSLocationErrorCode.LocationErrorSuccess.getErrorCode();

    public LBSLocation() {
        super("");
    }

    public LBSLocation(Location location) {
        super(location);
    }

    public float getAccuracy() {
        return super.getAccuracy();
    }

    public int getErrorCode() {
        return this.b;
    }

    public double getLatitude() {
        return super.getLatitude();
    }

    public double getLongitude() {
        return super.getLongitude();
    }

    public long getTime() {
        return super.getTime();
    }

    public long getTimeCost() {
        return this.f9112a;
    }

    public String getType() {
        return super.getProvider();
    }

    public void setAccuracy(float f) {
        super.setAccuracy(f);
    }

    public void setErrorCode(int i) {
        this.b = i;
    }

    public void setLatitude(double d) {
        super.setLatitude(d);
    }

    public void setLongitude(double d) {
        super.setLongitude(d);
    }

    public void setTime(long j) {
        super.setTime(j);
    }

    public void setTimeCost(long j) {
        this.f9112a = j;
    }

    public void setType(String str) {
        super.setProvider(str);
    }
}
