package o;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import o.ActionBarOverlayLayout;

public final class dismissPopups {
    private static final getPopupTheme getMin;
    static final Property<View, Rect> length = new Property<View, Rect>(Rect.class, "clipBounds") {
        public final /* synthetic */ Object get(Object obj) {
            return ViewCompat.setDefaultImpl((View) obj);
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            ViewCompat.getMin((View) obj, (Rect) obj2);
        }
    };
    public static final Property<View, Float> setMax = new Property<View, Float>(Float.class, "translationAlpha") {
        public final /* synthetic */ Object get(Object obj) {
            return Float.valueOf(dismissPopups.getMin((View) obj));
        }

        public final /* synthetic */ void set(Object obj, Object obj2) {
            dismissPopups.getMax((View) obj, ((Float) obj2).floatValue());
        }
    };

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            getMin = new setPopupTheme();
        } else if (Build.VERSION.SDK_INT >= 23) {
            getMin = new measureChildForCells();
        } else if (Build.VERSION.SDK_INT >= 22) {
            getMin = new ActionMenuPresenter$SavedState();
        } else if (Build.VERSION.SDK_INT >= 21) {
            getMin = new ActionBarOverlayLayout.LayoutParams();
        } else if (Build.VERSION.SDK_INT >= 19) {
            getMin = new ActionMenuView();
        } else {
            getMin = new getPopupTheme();
        }
    }

    public static restoreToolbarHierarchyState setMax(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new setMenuPrepared(view);
        }
        return setLogo.length(view);
    }

    public static setOverflowIcon setMin(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 18) {
            return new setOverflowReserved(view);
        }
        return new setPresenter(view.getWindowToken());
    }

    public static void getMax(@NonNull View view, float f) {
        getMin.length(view, f);
    }

    public static float getMin(@NonNull View view) {
        return getMin.getMax(view);
    }

    public static void getMax(@NonNull View view) {
        getMin.length(view);
    }

    public static void length(@NonNull View view) {
        getMin.setMin(view);
    }

    public static void length(@NonNull View view, int i) {
        getMin.setMin(view, i);
    }

    static void getMin(@NonNull View view, @NonNull Matrix matrix) {
        getMin.getMax(view, matrix);
    }

    static void setMin(@NonNull View view, @NonNull Matrix matrix) {
        getMin.setMax(view, matrix);
    }

    public static void length(@NonNull View view, int i, int i2, int i3, int i4) {
        getMin.setMax(view, i, i2, i3, i4);
    }
}
