package o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class playFromMediaId extends Resources {
    private static boolean getMin = false;
    private final WeakReference<Context> length;

    public static boolean getMin() {
        return setMax() && Build.VERSION.SDK_INT <= 20;
    }

    public playFromMediaId(@NonNull Context context, @NonNull Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.length = new WeakReference<>(context);
    }

    public final Drawable getDrawable(int i) throws Resources.NotFoundException {
        Context context = this.length.get();
        if (context != null) {
            return getRepeatMode.setMin().getMax(context, this, i);
        }
        return super.getDrawable(i);
    }

    /* access modifiers changed from: package-private */
    public final Drawable length(int i) {
        return super.getDrawable(i);
    }

    public static void setMax(boolean z) {
        getMin = z;
    }

    private static boolean setMax() {
        return getMin;
    }
}
