package o;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.Nullable;

public class setTopBackgroundColor {
    private static final String getMin = setTopBackgroundColor.class.getSimpleName();

    private setTopBackgroundColor() {
    }

    public static boolean getMin(@Nullable Context context) {
        if (!(context instanceof Activity)) {
            return context != null;
        }
        Activity activity = (Activity) context;
        return !activity.isDestroyed() && !activity.isFinishing();
    }
}
