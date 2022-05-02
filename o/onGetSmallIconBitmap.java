package o;

import com.google.firebase.perf.FirebasePerformance;

public final class onGetSmallIconBitmap {
    public static boolean getMax(String str) {
        return str.equals("POST") || str.equals(FirebasePerformance.HttpMethod.PATCH) || str.equals(FirebasePerformance.HttpMethod.PUT) || str.equals(FirebasePerformance.HttpMethod.DELETE) || str.equals("MOVE");
    }

    public static boolean length(String str) {
        return str.equals("POST") || str.equals(FirebasePerformance.HttpMethod.PUT) || str.equals(FirebasePerformance.HttpMethod.PATCH) || str.equals("PROPPATCH") || str.equals("REPORT");
    }

    public static boolean setMax(String str) {
        return length(str) || str.equals(FirebasePerformance.HttpMethod.OPTIONS) || str.equals(FirebasePerformance.HttpMethod.DELETE) || str.equals("PROPFIND") || str.equals("MKCOL") || str.equals("LOCK");
    }

    public static boolean getMin(String str) {
        return str.equals("PROPFIND");
    }

    public static boolean setMin(String str) {
        return !str.equals("PROPFIND");
    }
}
