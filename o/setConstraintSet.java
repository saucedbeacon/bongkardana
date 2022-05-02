package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public interface setConstraintSet<Z, R> {
    @Nullable
    fireTrigger<R> length(@NonNull fireTrigger<Z> firetrigger, @NonNull MotionHelper motionHelper);
}
