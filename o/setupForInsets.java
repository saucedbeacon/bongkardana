package o;

import com.crashlytics.android.answers.Answers;
import o.CoordinatorLayout;

public final class setupForInsets {
    private static final CoordinatorLayout.Behavior setMin;

    public static CoordinatorLayout.Behavior length() {
        return setMin;
    }

    static {
        CoordinatorLayout.Behavior behavior;
        try {
            Answers instance = Answers.getInstance();
            if (instance != null) {
                behavior = new removePreDrawListener(instance);
                if (behavior == null) {
                    behavior = new doViewsOverlap();
                }
                setMin = behavior;
                return;
            }
            throw new IllegalStateException("Answers must be initialized before logging kit events");
        } catch (IllegalStateException | NoClassDefFoundError unused) {
            behavior = null;
        }
    }
}
