package com.alipay.iap.android.lbs;

import java.util.concurrent.TimeUnit;

public class LBSLocationRequest {

    /* renamed from: a  reason: collision with root package name */
    private static long f9330a = TimeUnit.SECONDS.toMillis(30);
    private static long b = TimeUnit.SECONDS.toMillis(60);
    private static long c = TimeUnit.SECONDS.toMillis(1);
    private static float d = 5.0f;
    public String bizType = "";
    public long cacheValidTime = f9330a;
    public boolean isHighAccuracy = false;
    public float minDistance = d;
    public long timeOut = b;
    public long updateInterval = c;
}
