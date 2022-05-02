package o;

import o.PrepareException;
import o.b;

class downloadApp$Mean$Arithmetic implements b.C0007b<H5Utils> {
    private final PrepareException.AnonymousClass1 length;

    downloadApp$Mean$Arithmetic(PrepareException.AnonymousClass1 r1) {
        this.length = r1;
    }

    public final /* synthetic */ Object get() {
        H5Utils activeNotifications = this.length.getActiveNotifications();
        if (activeNotifications != null) {
            return activeNotifications;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
