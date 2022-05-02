package o;

import androidx.activity.result.ActivityResult;
import o.TinyAppActionState;

final class decreaseCount implements TinyAppActionState.getMax.C0055getMax {
    private final TinyAppActionState setMin;

    public decreaseCount(TinyAppActionState tinyAppActionState) {
        this.setMin = tinyAppActionState;
    }

    public final void getMax(ActivityResult activityResult) {
        TinyAppActionState.length(this.setMin, activityResult);
    }
}
