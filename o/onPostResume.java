package o;

import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import o.fromInclusive;

public final class onPostResume {
    public static int getMin(@NonNull ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return viewGroup.getLayoutMode();
        }
        return 0;
    }

    public static boolean length(@NonNull ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(fromInclusive.getMax.ICustomTabsService$Default);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && ViewCompat.onNavigationEvent(viewGroup) == null) ? false : true;
    }
}
