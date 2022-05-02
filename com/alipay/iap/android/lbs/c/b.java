package com.alipay.iap.android.lbs.c;

import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import com.alipay.iap.android.common.log.LoggerWrapper;
import com.alipay.iap.android.lbs.LBSLocation;
import com.alipay.iap.android.lbs.LBSLocationErrorCode;
import com.alipay.iap.android.lbs.LBSLocationRequest;
import id.dana.utils.permission.ManifestPermission;

public class b {
    public static LBSLocationErrorCode a(Context context, String str) {
        if (context == null) {
            return LBSLocationErrorCode.LocationErrorParamInvalid;
        }
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        return locationManager == null ? LBSLocationErrorCode.LocationErrorSystem : !locationManager.isProviderEnabled(str) ? LBSLocationErrorCode.LocationErrorPositionDisabled : LBSLocationErrorCode.LocationErrorSuccess;
    }

    public static String a(Context context, LBSLocationRequest lBSLocationRequest) {
        if (lBSLocationRequest == null) {
            lBSLocationRequest = new LBSLocationRequest();
        }
        boolean z = true;
        boolean z2 = a(context, "gps") == LBSLocationErrorCode.LocationErrorSuccess && b(context, "android.permission.ACCESS_FINE_LOCATION");
        if (a(context, "network") != LBSLocationErrorCode.LocationErrorSuccess || !b(context, ManifestPermission.ACCESS_COARSE_LOCATION)) {
            z = false;
        }
        if (z2 && z) {
            return lBSLocationRequest.isHighAccuracy ? "gps" : "network";
        }
        if (z2) {
            return "gps";
        }
        if (z) {
            return "network";
        }
        return null;
    }

    public static void a(String str, String str2, LBSLocation lBSLocation) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(lBSLocation.getLongitude());
        sb.append(lBSLocation.getLatitude());
        sb.append(lBSLocation.getTime());
        sb.append(lBSLocation.getType());
        sb.append(lBSLocation.getAccuracy());
        sb.append(lBSLocation.getTimeCost());
        LoggerWrapper.d(str, sb.toString());
    }

    public static boolean a(LBSLocation lBSLocation, LBSLocationRequest lBSLocationRequest) {
        return (lBSLocation == null || lBSLocationRequest == null || System.currentTimeMillis() - lBSLocation.getTime() >= lBSLocationRequest.cacheValidTime) ? false : true;
    }

    public static boolean b(Context context, String str) {
        if (context == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT < 23 || context.checkCallingOrSelfPermission(str) != -1) {
            return true;
        }
        LoggerWrapper.i("checkPermission", "PERMISSION_DENIED, can not access location");
        return false;
    }
}
