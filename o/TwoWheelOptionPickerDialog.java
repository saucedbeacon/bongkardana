package o;

import android.app.Activity;
import android.view.animation.Animation;
import androidx.annotation.Nullable;
import java.util.Collection;

public final class TwoWheelOptionPickerDialog {

    public final class OnOptionPickListener {

        public static class setMax implements Animation.AnimationListener {
            public void onAnimationEnd(Animation animation) {
            }

            public void onAnimationRepeat(Animation animation) {
            }

            public void onAnimationStart(Animation animation) {
            }
        }
    }

    /* renamed from: o.TwoWheelOptionPickerDialog$3  reason: invalid class name */
    public interface AnonymousClass3 {
        void getMax(String[] strArr, int i);

        Activity setMin();
    }

    public static <E> boolean setMax(@Nullable Collection<E> collection, Collection<E> collection2) {
        if (collection == null || collection2 == null) {
            return false;
        }
        for (E contains : collection2) {
            if (collection.contains(contains)) {
                return true;
            }
        }
        return false;
    }

    public static boolean setMax(@Nullable Collection collection) {
        return collection == null || collection.isEmpty();
    }
}
