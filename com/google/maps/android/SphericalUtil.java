package com.google.maps.android;

import com.google.android.gms.maps.model.LatLng;
import java.util.List;

public class SphericalUtil {
    private SphericalUtil() {
    }

    public static double computeHeading(LatLng latLng, LatLng latLng2) {
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        double radians3 = Math.toRadians(latLng2.latitude);
        double radians4 = Math.toRadians(latLng2.longitude) - radians2;
        return MathUtil.wrap(Math.toDegrees(Math.atan2(Math.sin(radians4) * Math.cos(radians3), (Math.cos(radians) * Math.sin(radians3)) - ((Math.sin(radians) * Math.cos(radians3)) * Math.cos(radians4)))), -180.0d, 180.0d);
    }

    public static LatLng computeOffset(LatLng latLng, double d, double d2) {
        double d3 = d / 6371009.0d;
        double radians = Math.toRadians(d2);
        double radians2 = Math.toRadians(latLng.latitude);
        double radians3 = Math.toRadians(latLng.longitude);
        double cos = Math.cos(d3);
        double sin = Math.sin(d3);
        double sin2 = Math.sin(radians2);
        double cos2 = sin * Math.cos(radians2);
        double cos3 = (cos * sin2) + (Math.cos(radians) * cos2);
        return new LatLng(Math.toDegrees(Math.asin(cos3)), Math.toDegrees(radians3 + Math.atan2(cos2 * Math.sin(radians), cos - (sin2 * cos3))));
    }

    public static LatLng computeOffsetOrigin(LatLng latLng, double d, double d2) {
        LatLng latLng2 = latLng;
        double radians = Math.toRadians(d2);
        double d3 = d / 6371009.0d;
        double cos = Math.cos(d3);
        double sin = Math.sin(d3) * Math.cos(radians);
        double sin2 = Math.sin(d3) * Math.sin(radians);
        double sin3 = Math.sin(Math.toRadians(latLng2.latitude));
        double d4 = cos * cos;
        double d5 = sin * sin;
        double d6 = ((d5 * d4) + (d4 * d4)) - ((d4 * sin3) * sin3);
        if (d6 < 0.0d) {
            return null;
        }
        double d7 = sin * sin3;
        double d8 = d4 + d5;
        double sqrt = (d7 + Math.sqrt(d6)) / d8;
        double d9 = (sin3 - (sin * sqrt)) / cos;
        double atan2 = Math.atan2(d9, sqrt);
        if (atan2 < -1.5707963267948966d || atan2 > 1.5707963267948966d) {
            atan2 = Math.atan2(d9, (d7 - Math.sqrt(d6)) / d8);
        }
        if (atan2 < -1.5707963267948966d || atan2 > 1.5707963267948966d) {
            return null;
        }
        return new LatLng(Math.toDegrees(atan2), Math.toDegrees(Math.toRadians(latLng2.longitude) - Math.atan2(sin2, (cos * Math.cos(atan2)) - (sin * Math.sin(atan2)))));
    }

    public static LatLng interpolate(LatLng latLng, LatLng latLng2, double d) {
        LatLng latLng3 = latLng;
        LatLng latLng4 = latLng2;
        double radians = Math.toRadians(latLng3.latitude);
        double radians2 = Math.toRadians(latLng3.longitude);
        double radians3 = Math.toRadians(latLng4.latitude);
        double radians4 = Math.toRadians(latLng4.longitude);
        double cos = Math.cos(radians);
        double cos2 = Math.cos(radians3);
        double computeAngleBetween = computeAngleBetween(latLng, latLng2);
        double sin = Math.sin(computeAngleBetween);
        if (sin < 1.0E-6d) {
            return new LatLng(latLng3.latitude + ((latLng4.latitude - latLng3.latitude) * d), latLng3.longitude + (d * (latLng4.longitude - latLng3.longitude)));
        }
        double sin2 = Math.sin((1.0d - d) * computeAngleBetween) / sin;
        double sin3 = Math.sin(computeAngleBetween * d) / sin;
        double d2 = cos * sin2;
        double d3 = cos2 * sin3;
        double d4 = sin3;
        double cos3 = (Math.cos(radians2) * d2) + (Math.cos(radians4) * d3);
        double sin4 = (d2 * Math.sin(radians2)) + (d3 * Math.sin(radians4));
        return new LatLng(Math.toDegrees(Math.atan2((sin2 * Math.sin(radians)) + (Math.sin(radians3) * d4), Math.sqrt((cos3 * cos3) + (sin4 * sin4)))), Math.toDegrees(Math.atan2(sin4, cos3)));
    }

    private static double distanceRadians(double d, double d2, double d3, double d4) {
        return MathUtil.arcHav(MathUtil.havDistance(d, d3, d2 - d4));
    }

    static double computeAngleBetween(LatLng latLng, LatLng latLng2) {
        return distanceRadians(Math.toRadians(latLng.latitude), Math.toRadians(latLng.longitude), Math.toRadians(latLng2.latitude), Math.toRadians(latLng2.longitude));
    }

    public static double computeDistanceBetween(LatLng latLng, LatLng latLng2) {
        return computeAngleBetween(latLng, latLng2) * 6371009.0d;
    }

    public static double computeLength(List<LatLng> list) {
        double d = 0.0d;
        if (list.size() < 2) {
            return 0.0d;
        }
        LatLng latLng = list.get(0);
        double radians = Math.toRadians(latLng.latitude);
        double radians2 = Math.toRadians(latLng.longitude);
        for (LatLng next : list) {
            double radians3 = Math.toRadians(next.latitude);
            double radians4 = Math.toRadians(next.longitude);
            d += distanceRadians(radians, radians2, radians3, radians4);
            radians = radians3;
            radians2 = radians4;
        }
        return d * 6371009.0d;
    }

    public static double computeArea(List<LatLng> list) {
        return Math.abs(computeSignedArea(list));
    }

    public static double computeSignedArea(List<LatLng> list) {
        return computeSignedArea(list, 6371009.0d);
    }

    static double computeSignedArea(List<LatLng> list, double d) {
        int size = list.size();
        double d2 = 0.0d;
        if (size < 3) {
            return 0.0d;
        }
        LatLng latLng = list.get(size - 1);
        double tan = Math.tan((1.5707963267948966d - Math.toRadians(latLng.latitude)) / 2.0d);
        double radians = Math.toRadians(latLng.longitude);
        double d3 = tan;
        double d4 = radians;
        for (LatLng next : list) {
            double tan2 = Math.tan((1.5707963267948966d - Math.toRadians(next.latitude)) / 2.0d);
            double radians2 = Math.toRadians(next.longitude);
            d2 += polarTriangleArea(tan2, radians2, d3, d4);
            d3 = tan2;
            d4 = radians2;
        }
        return d2 * d * d;
    }

    private static double polarTriangleArea(double d, double d2, double d3, double d4) {
        double d5 = d2 - d4;
        double d6 = d * d3;
        return Math.atan2(Math.sin(d5) * d6, (d6 * Math.cos(d5)) + 1.0d) * 2.0d;
    }
}
