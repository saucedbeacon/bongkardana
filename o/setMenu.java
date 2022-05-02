package o;

import android.os.Build;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

public final class setMenu {
    private static boolean getMin = true;

    public static hasLogo length(@NonNull ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new setWindowCallback(viewGroup);
        }
        return setWindowTitle.length(viewGroup);
    }

    public static void getMax(@NonNull ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else if (Build.VERSION.SDK_INT < 18) {
            saveToolbarHierarchyState.getMin(viewGroup, z);
        } else if (getMin) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                getMin = false;
            }
        }
    }
}
