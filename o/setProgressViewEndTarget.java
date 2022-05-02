package o;

import android.app.Activity;
import android.content.Context;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0005*\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b*\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005\"\u0017\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\t"}, d2 = {"isValid", "", "Landroid/content/Context;", "(Landroid/content/Context;)Z", "getSupportColor", "", "resId", "getSupportDrawable", "Landroid/graphics/drawable/Drawable;", "design_release"}, k = 2, mv = {1, 4, 2})
public final class setProgressViewEndTarget {
    public static final boolean setMax(@Nullable Context context) {
        if (context == null) {
            return false;
        }
        if (!(context instanceof Activity)) {
            return true;
        }
        Activity activity = (Activity) context;
        return !activity.isDestroyed() && !activity.isFinishing();
    }
}
