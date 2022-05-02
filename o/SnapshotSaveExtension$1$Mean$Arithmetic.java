package o;

import o.PrepareException;
import o.b;

class SnapshotSaveExtension$1$Mean$Arithmetic implements b.C0007b<H5Utils> {
    private final PrepareException.AnonymousClass1 getMax;

    SnapshotSaveExtension$1$Mean$Arithmetic(PrepareException.AnonymousClass1 r1) {
        this.getMax = r1;
    }

    public final /* synthetic */ Object get() {
        H5Utils activeNotifications = this.getMax.getActiveNotifications();
        if (activeNotifications != null) {
            return activeNotifications;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
