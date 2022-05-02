package o;

import o.PrepareException;
import o.b;

class GriverDefaultPromptExtension$3$Mean$Arithmetic implements b.C0007b<getScanJobRuntimeMillis> {
    private final PrepareException.AnonymousClass1 setMin;

    GriverDefaultPromptExtension$3$Mean$Arithmetic(PrepareException.AnonymousClass1 r1) {
        this.setMin = r1;
    }

    public final /* synthetic */ Object get() {
        getScanJobRuntimeMillis ITrustedWebActivityService$Default = this.setMin.ITrustedWebActivityService$Default();
        if (ITrustedWebActivityService$Default != null) {
            return ITrustedWebActivityService$Default;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
