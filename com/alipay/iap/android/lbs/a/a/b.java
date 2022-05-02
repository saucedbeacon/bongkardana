package com.alipay.iap.android.lbs.a.a;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.lbs.LBSLocation;
import com.alipay.iap.android.lbs.LBSLocationErrorCode;
import com.alipay.iap.android.lbs.LBSLocationListener;
import com.alipay.iap.android.lbs.LBSLocationRequest;
import com.alipay.iap.android.lbs.c.a;
import id.dana.utils.permission.ManifestPermission;

public class b implements LocationListener, com.alipay.iap.android.lbs.b.b {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f9333a;
    private a b;
    /* access modifiers changed from: private */
    public String c;
    /* access modifiers changed from: private */
    public LBSLocationListener d;
    /* access modifiers changed from: private */
    public LocationManager e;
    /* access modifiers changed from: private */
    public LBSLocationRequest f;
    /* access modifiers changed from: private */
    public boolean g = false;
    private Handler h = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public boolean i;
    private a j = null;
    private boolean k = false;
    /* access modifiers changed from: private */
    public long l = 0;

    public b(Context context, a aVar, LBSLocationRequest lBSLocationRequest, LBSLocationListener lBSLocationListener, boolean z) {
        this.f9333a = context;
        this.b = aVar;
        this.f = lBSLocationRequest;
        if (lBSLocationRequest == null) {
            this.f = new LBSLocationRequest();
        }
        this.d = lBSLocationListener;
        this.i = z;
    }

    /* access modifiers changed from: private */
    public void b(LBSLocationErrorCode lBSLocationErrorCode) {
        LBSLocationListener lBSLocationListener = this.d;
        if (lBSLocationListener != null) {
            lBSLocationListener.onLocationError(lBSLocationErrorCode);
        }
        e();
    }

    private void d() {
        if (this.g) {
            this.h.post(new Runnable() {
                public void run() {
                    b.this.e.removeUpdates(b.this);
                }
            });
            c();
            this.g = false;
        }
    }

    private void e() {
        this.b.a(this.d);
        d();
    }

    public void a() {
        if (this.g) {
            LoggerWrapper.e("LBSLocationModuleNative", "LBSLocationModuleNative:startLocation repeatedly");
        } else {
            this.h.post(new Runnable() {
                public void run() {
                    String obj;
                    b bVar = b.this;
                    String unused = bVar.c = com.alipay.iap.android.lbs.c.b.a(bVar.f9333a, b.this.f);
                    if (b.this.c != null) {
                        try {
                            LocationManager unused2 = b.this.e = (LocationManager) b.this.f9333a.getSystemService("location");
                            if (b.this.i) {
                                b.this.f.updateInterval = 0;
                                b.this.f.minDistance = 0.0f;
                            }
                            b.this.e.requestLocationUpdates(b.this.c, b.this.f.updateInterval, b.this.f.minDistance, b.this);
                            long unused3 = b.this.l = System.currentTimeMillis();
                            b.this.a(b.this.f.timeOut);
                            boolean unused4 = b.this.g = true;
                            return;
                        } catch (Exception e) {
                            if (b.this.d != null) {
                                b.this.d.onLocationError(LBSLocationErrorCode.LocationErrorSystem);
                            }
                            StringBuilder sb = new StringBuilder("requestLocationUpdateInternal isOnceLocation=");
                            sb.append(b.this.i);
                            sb.append(",error=");
                            sb.append(e.getMessage());
                            obj = sb.toString();
                        }
                    } else if (com.alipay.iap.android.lbs.c.b.b(b.this.f9333a, "android.permission.ACCESS_FINE_LOCATION") || com.alipay.iap.android.lbs.c.b.b(b.this.f9333a, ManifestPermission.ACCESS_COARSE_LOCATION)) {
                        b.this.b(LBSLocationErrorCode.LocationErrorPositionDisabled);
                        obj = "LBSLocationModuleNative:startLocation with GPS&Network disabled";
                    } else {
                        b.this.b(LBSLocationErrorCode.LocationErrorNoAuthorization);
                        obj = "LBSLocationModuleNative::startLocation without GPS&Network authentication";
                    }
                    LoggerWrapper.e("LBSLocationModuleNative", obj);
                }
            });
        }
    }

    public void a(long j2) {
        if (j2 > 0) {
            if (this.j == null) {
                this.j = new a(j2, this);
            }
            this.j.a();
        }
    }

    public void a(LBSLocationErrorCode lBSLocationErrorCode) {
        if (lBSLocationErrorCode != LBSLocationErrorCode.LocationErrorTimeout || !this.k) {
            b(lBSLocationErrorCode);
        }
    }

    public void b() {
        LBSLocationListener lBSLocationListener;
        d();
        if (!this.k && (lBSLocationListener = this.d) != null) {
            lBSLocationListener.onLocationError(LBSLocationErrorCode.LocationErrorCancelled);
        }
    }

    public void c() {
        a aVar = this.j;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            this.k = true;
            LBSLocation lBSLocation = new LBSLocation(location);
            lBSLocation.setTimeCost(System.currentTimeMillis() - this.l);
            this.d.onLocationUpdate(lBSLocation);
            this.l = System.currentTimeMillis();
            c();
        } else {
            this.d.onLocationError(LBSLocationErrorCode.LocationErrorNullLocation);
        }
        if (this.i && this.k) {
            d();
        }
    }

    public void onProviderDisabled(String str) {
        b(LBSLocationErrorCode.LocationErrorPositionDisabled);
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i2, Bundle bundle) {
    }
}
