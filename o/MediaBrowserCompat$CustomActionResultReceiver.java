package o;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import androidx.annotation.RestrictTo;
import o.ITrustedWebActivityCallback;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class MediaBrowserCompat$CustomActionResultReceiver {
    public Context getMin;

    public MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        this.getMin = context;
    }

    public final int setMin() {
        Configuration configuration = this.getMin.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i > 600) {
            return 5;
        }
        if (i > 960 && i2 > 720) {
            return 5;
        }
        if (i > 720 && i2 > 960) {
            return 5;
        }
        if (i >= 500) {
            return 4;
        }
        if (i > 640 && i2 > 480) {
            return 4;
        }
        if (i <= 480 || i2 <= 640) {
            return i >= 360 ? 3 : 2;
        }
        return 4;
    }

    public final boolean getMin() {
        if (Build.VERSION.SDK_INT < 19 && ViewConfiguration.get(this.getMin).hasPermanentMenuKey()) {
            return false;
        }
        return true;
    }

    public final boolean setMax() {
        return this.getMin.getResources().getBoolean(ITrustedWebActivityCallback.Stub.length.length);
    }

    public final int length() {
        TypedArray obtainStyledAttributes = this.getMin.obtainStyledAttributes((AttributeSet) null, ITrustedWebActivityCallback.Stub.toIntRange.length, ITrustedWebActivityCallback.Stub.getMin.setMin, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(ITrustedWebActivityCallback.Stub.toIntRange.toFloatRange, 0);
        Resources resources = this.getMin.getResources();
        if (!setMax()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(ITrustedWebActivityCallback.Stub.getMax.setMax));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public final boolean getMax() {
        return this.getMin.getApplicationInfo().targetSdkVersion < 14;
    }
}
