package com.iap.ac.android.acs.plugin.ui.utils;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.iap.ac.android.acs.plugin.utils.Constants;
import com.iap.ac.android.common.log.ACLog;
import id.dana.utils.permission.ManifestPermission;
import java.util.List;
import o.FontRes;
import o.IntRange;

public class LocationUtils {
    private LocationUtils() {
    }

    public static boolean checkPermission(@NonNull Context context) {
        boolean z = IntRange.length(context, ManifestPermission.ACCESS_COARSE_LOCATION) == 0;
        ACLog.d(Constants.TAG, "LocationUtils#checkPermission, permission ACCESS_COARSE_LOCATION: ".concat(String.valueOf(z)));
        boolean z2 = IntRange.length(context, "android.permission.ACCESS_FINE_LOCATION") == 0;
        ACLog.d(Constants.TAG, "LocationUtils#checkPermission, permission ACCESS_FINE_LOCATION: ".concat(String.valueOf(z2)));
        return z && z2;
    }

    public static void requestPermission(@NonNull Activity activity) {
        ACLog.d(Constants.TAG, "LocationUtils#requestPermission");
        FontRes.getMin(activity, new String[]{ManifestPermission.ACCESS_COARSE_LOCATION, "android.permission.ACCESS_FINE_LOCATION"}, 124);
    }

    @Nullable
    public static Location getLocation(@NonNull Context context) {
        if (!checkPermission(context)) {
            ACLog.e(Constants.TAG, "LocationUtils#getLocation, no location permission");
            return null;
        }
        LocationManager locationManager = (LocationManager) context.getSystemService("location");
        if (locationManager == null) {
            ACLog.e(Constants.TAG, "LocationUtils#getLocation, location manager is null");
            return null;
        }
        List<String> providers = locationManager.getProviders(true);
        String str = "network";
        if (providers.contains(str)) {
            ACLog.d(Constants.TAG, "LocationUtils#getLocation, network location provider available");
        } else if (providers.contains("gps")) {
            ACLog.d(Constants.TAG, "LocationUtils#getLocation, GPS location provider available");
            str = "gps";
        } else {
            ACLog.e(Constants.TAG, "LocationUtils#getLocation, no location provider available");
            return null;
        }
        Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation == null) {
            ACLog.e(Constants.TAG, "LocationUtils#getLocation, last known location is null");
            return null;
        }
        StringBuilder sb = new StringBuilder("LocationUtils#getLocation, longitude: ");
        sb.append(lastKnownLocation.getLongitude());
        sb.append(", latitude: ");
        sb.append(lastKnownLocation.getLatitude());
        ACLog.d(Constants.TAG, sb.toString());
        return lastKnownLocation;
    }
}
