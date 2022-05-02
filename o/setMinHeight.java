package o;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;

public final class setMinHeight implements setElevation<Uri, Drawable> {
    private final Context getMin;

    @Nullable
    public final /* synthetic */ fireTrigger getMax(@NonNull Object obj, int i, int i2, @NonNull MotionHelper motionHelper) throws IOException {
        return length((Uri) obj);
    }

    public final /* synthetic */ boolean length(@NonNull Object obj, @NonNull MotionHelper motionHelper) throws IOException {
        return getMax((Uri) obj);
    }

    public setMinHeight(Context context) {
        this.getMin = context.getApplicationContext();
    }

    private static boolean getMax(@NonNull Uri uri) {
        return uri.getScheme().equals("android.resource");
    }

    @Nullable
    public final fireTrigger<Drawable> length(@NonNull Uri uri) {
        Context length = length(uri, uri.getAuthority());
        Drawable min = setId.getMin(this.getMin, length, getMin(length, uri));
        if (min != null) {
            return new getMinHeight(min);
        }
        return null;
    }

    @NonNull
    private Context length(Uri uri, String str) {
        if (str.equals(this.getMin.getPackageName())) {
            return this.getMin;
        }
        try {
            return this.getMin.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            if (str.contains(this.getMin.getPackageName())) {
                return this.getMin;
            }
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: ".concat(String.valueOf(uri)), e);
        }
    }

    @DrawableRes
    private static int getMin(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            return setMin(context, uri);
        }
        if (pathSegments.size() == 1) {
            return setMax(uri);
        }
        throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(uri)));
    }

    @DrawableRes
    private static int setMin(Context context, Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        String authority = uri.getAuthority();
        String str = pathSegments.get(0);
        String str2 = pathSegments.get(1);
        int identifier = context.getResources().getIdentifier(str2, str, authority);
        if (identifier == 0) {
            identifier = Resources.getSystem().getIdentifier(str2, str, "android");
        }
        if (identifier != 0) {
            return identifier;
        }
        throw new IllegalArgumentException("Failed to find resource id for: ".concat(String.valueOf(uri)));
    }

    @DrawableRes
    private static int setMax(Uri uri) {
        try {
            return Integer.parseInt(uri.getPathSegments().get(0));
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Unrecognized Uri format: ".concat(String.valueOf(uri)), e);
        }
    }
}
