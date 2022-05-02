package o;

import o.GriverAMCSAppUpdater;
import o.PrepareException;
import o.b;

class handleSnapshotEvent$Mean$Arithmetic implements b.C0007b<GriverAMCSAppUpdater.AnonymousClass1> {
    private final PrepareException.AnonymousClass1 setMax;

    handleSnapshotEvent$Mean$Arithmetic(PrepareException.AnonymousClass1 r1) {
        this.setMax = r1;
    }

    public final /* synthetic */ Object get() {
        GriverAMCSAppUpdater.AnonymousClass1 requestPostMessageChannel = this.setMax.requestPostMessageChannel();
        if (requestPostMessageChannel != null) {
            return requestPostMessageChannel;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
