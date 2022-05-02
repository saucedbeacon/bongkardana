package o;

import o.PrepareException;
import o.b;

class generateStepCreator$Mean$Arithmetic implements b.C0007b<getScanJobRuntimeMillis> {
    private final PrepareException.AnonymousClass1 getMin;

    generateStepCreator$Mean$Arithmetic(PrepareException.AnonymousClass1 r1) {
        this.getMin = r1;
    }

    public final /* synthetic */ Object get() {
        getScanJobRuntimeMillis ITrustedWebActivityService$Default = this.getMin.ITrustedWebActivityService$Default();
        if (ITrustedWebActivityService$Default != null) {
            return ITrustedWebActivityService$Default;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
