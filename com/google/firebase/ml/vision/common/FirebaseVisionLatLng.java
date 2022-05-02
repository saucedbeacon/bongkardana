package com.google.firebase.ml.vision.common;

public class FirebaseVisionLatLng {
    private final double zzbhl;
    private final double zzbhm;

    public double getLatitude() {
        return this.zzbhl;
    }

    public double getLongitude() {
        return this.zzbhm;
    }

    public FirebaseVisionLatLng(double d, double d2) {
        this.zzbhl = d;
        this.zzbhm = d2;
    }
}
