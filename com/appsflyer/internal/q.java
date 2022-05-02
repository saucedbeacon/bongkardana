package com.appsflyer.internal;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.AFExecutor;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import id.dana.utils.permission.ManifestPermission;

public final class q {

    public static final class a {

        /* renamed from: ˏ  reason: contains not printable characters */
        public static final q f8772 = new q();
    }

    q() {
    }

    /* renamed from: ॱ  reason: contains not printable characters */
    private static boolean m1281(@NonNull Context context, @NonNull String[] strArr) {
        for (String r3 : strArr) {
            if (AFExecutor.AnonymousClass5.AnonymousClass3.m1121(context, r3)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    /* renamed from: ˎ  reason: contains not printable characters */
    public static Location m1280(@NonNull Context context) {
        Location location;
        Location location2;
        try {
            LocationManager locationManager = (LocationManager) context.getSystemService("location");
            if (m1281(context, new String[]{"android.permission.ACCESS_FINE_LOCATION", ManifestPermission.ACCESS_COARSE_LOCATION})) {
                location = locationManager.getLastKnownLocation("network");
            } else {
                location = null;
            }
            if (m1281(context, new String[]{"android.permission.ACCESS_FINE_LOCATION"})) {
                location2 = locationManager.getLastKnownLocation("gps");
            } else {
                location2 = null;
            }
            if (location2 == null && location == null) {
                location = null;
            } else if (location2 != null || location == null) {
                if ((location == null && location2 != null) || DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS >= location.getTime() - location2.getTime()) {
                    location = location2;
                }
            }
            if (location != null) {
                return location;
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
