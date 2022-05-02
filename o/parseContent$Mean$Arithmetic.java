package o;

import o.PrepareException;
import o.b;

class parseContent$Mean$Arithmetic implements b.C0007b<H5Utils> {
    private final PrepareException.AnonymousClass1 setMax;

    parseContent$Mean$Arithmetic(PrepareException.AnonymousClass1 r1) {
        this.setMax = r1;
    }

    public final /* synthetic */ Object get() {
        H5Utils activeNotifications = this.setMax.getActiveNotifications();
        if (activeNotifications != null) {
            return activeNotifications;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
