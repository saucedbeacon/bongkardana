package com.alipay.iap.android.lbs;

import android.content.Context;
import com.alipay.iap.android.lbs.b.a;

public class LBSLocationManagerProxy {

    /* renamed from: a  reason: collision with root package name */
    private static LBSLocationManagerProxy f9329a;
    private a b;

    private LBSLocationManagerProxy() {
    }

    private void a() {
        this.b = com.alipay.iap.android.lbs.a.a.a();
    }

    public static LBSLocationManagerProxy getInstance() {
        if (f9329a == null) {
            synchronized (LBSLocationManagerProxy.class) {
                if (f9329a == null) {
                    LBSLocationManagerProxy lBSLocationManagerProxy = new LBSLocationManagerProxy();
                    f9329a = lBSLocationManagerProxy;
                    lBSLocationManagerProxy.a();
                }
            }
        }
        return f9329a;
    }

    public LBSLocation getLastKnownLocation(Context context, LBSLocationRequest lBSLocationRequest) {
        return this.b.a(context, lBSLocationRequest);
    }

    public void refreshCache(Context context) {
        this.b.a(context);
    }

    public void removeLocationUpdates(Context context, LBSLocationListener lBSLocationListener) {
        this.b.a(context, lBSLocationListener);
    }

    public void requestLocationUpdate(Context context, LBSLocationRequest lBSLocationRequest, LBSLocationListener lBSLocationListener) {
        this.b.a(context, lBSLocationRequest, lBSLocationListener);
    }

    public void requestLocationUpdateContinuous(Context context, LBSLocationRequest lBSLocationRequest, LBSLocationListener lBSLocationListener) {
        this.b.b(context, lBSLocationRequest, lBSLocationListener);
    }
}
