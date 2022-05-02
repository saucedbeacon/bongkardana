package o;

import o.PrepareException;
import o.b;

class onParsePackageSuccess$Grayscale$Algorithm implements b.C0007b<H5Utils> {
    private final PrepareException.AnonymousClass1 setMin;

    onParsePackageSuccess$Grayscale$Algorithm(PrepareException.AnonymousClass1 r1) {
        this.setMin = r1;
    }

    public final /* synthetic */ Object get() {
        H5Utils activeNotifications = this.setMin.getActiveNotifications();
        if (activeNotifications != null) {
            return activeNotifications;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
