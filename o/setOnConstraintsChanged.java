package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class setOnConstraintsChanged<Z> implements setConstraintSet<Z, Z> {
    private static final setOnConstraintsChanged<?> length = new setOnConstraintsChanged<>();

    @Nullable
    public final fireTrigger<Z> length(@NonNull fireTrigger<Z> firetrigger, @NonNull MotionHelper motionHelper) {
        return firetrigger;
    }

    public static <Z> setConstraintSet<Z, Z> setMin() {
        return length;
    }
}
