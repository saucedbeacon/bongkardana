package com.alipay.iap.android.lbs.a.a;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.lbs.LBSLocation;
import com.alipay.iap.android.lbs.LBSLocationErrorCode;
import com.alipay.iap.android.lbs.LBSLocationListener;
import com.alipay.iap.android.lbs.LBSLocationRequest;
import com.alipay.iap.android.lbs.c.b;
import id.dana.utils.permission.ManifestPermission;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class a implements com.alipay.iap.android.lbs.b.a {

    /* renamed from: a  reason: collision with root package name */
    private Map<LBSLocationListener, b> f9331a = new ConcurrentHashMap();
    private LBSLocationRequest b = new LBSLocationRequest();
    private LBSLocationRequest c = new LBSLocationRequest();
    private LBSLocationListener d = new LBSLocationListener() {
        public void onLocationError(LBSLocationErrorCode lBSLocationErrorCode) {
        }

        public void onLocationUpdate(LBSLocation lBSLocation) {
        }
    };

    public a() {
        this.b.cacheValidTime = 0;
        this.b.isHighAccuracy = true;
        this.c.cacheValidTime = 0;
        this.c.isHighAccuracy = false;
        LoggerWrapper.d("LBSLocationManagerNative", "LBSLocationManagerNative constructor");
    }

    private LBSLocation a(Context context, String str, String str2) {
        String concat;
        if (!b.b(context, str) || b.a(context, str2) != LBSLocationErrorCode.LocationErrorSuccess) {
            concat = "getLastKnownLocation, No authentication or disabled for provider ".concat(String.valueOf(str2));
        } else {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (locationManager == null) {
                concat = "getLastKnowLocation, locationManager is null";
            } else {
                Location lastKnownLocation = locationManager.getLastKnownLocation(str2);
                if (lastKnownLocation != null) {
                    LBSLocation lBSLocation = new LBSLocation(lastKnownLocation);
                    b.a("LBSLocationManagerNative", "getLastKnownLocation, location:", lBSLocation);
                    return lBSLocation;
                }
                StringBuilder sb = new StringBuilder("getLastKnownLocation, provider ");
                sb.append(str2);
                sb.append(" returns null location");
                concat = sb.toString();
            }
        }
        LoggerWrapper.e("LBSLocationManagerNative", concat);
        return null;
    }

    private void a(Context context, LBSLocationRequest lBSLocationRequest, boolean z, LBSLocationListener lBSLocationListener) {
        String valueOf;
        String str;
        if (lBSLocationListener == null) {
            valueOf = String.valueOf(z);
            str = "requestLocationUpdateInternal with null listener, isOnceLocation=";
        } else if (context == null) {
            lBSLocationListener.onLocationError(LBSLocationErrorCode.LocationErrorParamInvalid);
            valueOf = String.valueOf(z);
            str = "requestLocationUpdateInternal with null context, isOnceLocation=";
        } else {
            synchronized (this.f9331a) {
                if (!z) {
                    if (this.f9331a.containsKey(lBSLocationListener)) {
                        LoggerWrapper.e("LBSLocationManagerNative", "requestLocationUpdateContinuous with repeat listener");
                        return;
                    }
                }
                b bVar = new b(context, this, lBSLocationRequest, lBSLocationListener, z);
                if (!z) {
                    this.f9331a.put(lBSLocationListener, bVar);
                }
                bVar.a();
                return;
            }
        }
        LoggerWrapper.e("LBSLocationManagerNative", str.concat(valueOf));
    }

    public final LBSLocation a(Context context, LBSLocationRequest lBSLocationRequest) {
        LBSLocationErrorCode lBSLocationErrorCode;
        int errorCode;
        long currentTimeMillis = System.currentTimeMillis();
        if (lBSLocationRequest == null) {
            lBSLocationRequest = new LBSLocationRequest();
        }
        LBSLocation a2 = a(context, "android.permission.ACCESS_FINE_LOCATION", "gps");
        if (a2 != null) {
            a2.setTimeCost(System.currentTimeMillis() - currentTimeMillis);
        }
        LBSLocation a3 = a(context, ManifestPermission.ACCESS_COARSE_LOCATION, "network");
        if (a3 != null) {
            a3.setTimeCost(System.currentTimeMillis() - currentTimeMillis);
        }
        if (!(a3 == null || a2 == null || a3.getTime() <= a2.getTime()) || a2 == null) {
            a2 = a3;
        }
        if (a2 != null && System.currentTimeMillis() - a2.getTime() > lBSLocationRequest.cacheValidTime) {
            a(context);
            a2.setErrorCode(LBSLocationErrorCode.LocationErrorExpired.getErrorCode());
        }
        if (a2 == null) {
            a(context);
            a2 = new LBSLocation();
            a2.setLatitude(-360.0d);
            a2.setLongitude(-360.0d);
            a2.setAccuracy(0.0f);
            a2.setType("");
            a2.setTime(0);
            a2.setTimeCost(0);
            if (!b.b(context, ManifestPermission.ACCESS_COARSE_LOCATION)) {
                lBSLocationErrorCode = LBSLocationErrorCode.LocationErrorNoAuthorization;
            } else {
                LBSLocationErrorCode a4 = b.a(context, "network");
                if (a4 == LBSLocationErrorCode.LocationErrorSuccess || a4 == LBSLocationErrorCode.LocationErrorPositionDisabled) {
                    lBSLocationErrorCode = (a4 == LBSLocationErrorCode.LocationErrorPositionDisabled && b.a(context, "gps") == LBSLocationErrorCode.LocationErrorPositionDisabled) ? LBSLocationErrorCode.LocationErrorPositionDisabled : LBSLocationErrorCode.LocationErrorNullLocation;
                } else {
                    errorCode = a4.getErrorCode();
                    a2.setErrorCode(errorCode);
                }
            }
            errorCode = lBSLocationErrorCode.getErrorCode();
            a2.setErrorCode(errorCode);
        }
        return a2;
    }

    public final void a(Context context) {
        a(context, this.b, true, this.d);
        a(context, this.c, true, this.d);
    }

    public final void a(Context context, LBSLocationListener lBSLocationListener) {
        if (context == null || lBSLocationListener == null) {
            LoggerWrapper.e("LBSLocationManagerNative", "removeLocationUpdates with null context or listener");
            return;
        }
        LoggerWrapper.e("LBSLocationManagerNative", "removeLocationUpdate in LBSLocationManagerNative");
        synchronized (this.f9331a) {
            if (this.f9331a.containsKey(lBSLocationListener)) {
                this.f9331a.get(lBSLocationListener).b();
                this.f9331a.remove(lBSLocationListener);
            }
        }
    }

    public final void a(Context context, LBSLocationRequest lBSLocationRequest, LBSLocationListener lBSLocationListener) {
        LBSLocation a2 = a(context, lBSLocationRequest);
        if (lBSLocationRequest == null) {
            lBSLocationRequest = new LBSLocationRequest();
        }
        if (b.a(a2, lBSLocationRequest)) {
            lBSLocationListener.onLocationUpdate(a2);
            b.a("LBSLocationManagerNative", "requestLocationUpdate with cached Location:", a2);
            return;
        }
        a(context, lBSLocationRequest, true, lBSLocationListener);
    }

    public final void a(LBSLocationListener lBSLocationListener) {
        if (lBSLocationListener != null) {
            synchronized (this.f9331a) {
                this.f9331a.remove(lBSLocationListener);
            }
        }
    }

    public final void b(Context context, LBSLocationRequest lBSLocationRequest, LBSLocationListener lBSLocationListener) {
        a(context, lBSLocationRequest, false, lBSLocationListener);
    }
}
