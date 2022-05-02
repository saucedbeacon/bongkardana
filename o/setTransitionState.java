package o;

import android.net.Uri;

public final class setTransitionState {
    public static boolean getMin(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    public static boolean getMin(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    private static boolean getMax(Uri uri) {
        return uri.getPathSegments().contains("video");
    }

    public static boolean length(Uri uri) {
        return getMin(uri) && getMax(uri);
    }

    public static boolean setMax(Uri uri) {
        return getMin(uri) && !getMax(uri);
    }
}
