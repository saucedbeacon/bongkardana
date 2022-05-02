package o;

import o.PrepareException;
import o.b;

class interceptBefore$Mean$Arithmetic implements b.C0007b<UpdateAppCallback> {
    private final PrepareException.AnonymousClass1 getMin;

    interceptBefore$Mean$Arithmetic(PrepareException.AnonymousClass1 r1) {
        this.getMin = r1;
    }

    public final /* synthetic */ Object get() {
        UpdateAppCallback onRepeatModeChanged = this.getMin.onRepeatModeChanged();
        if (onRepeatModeChanged != null) {
            return onRepeatModeChanged;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
