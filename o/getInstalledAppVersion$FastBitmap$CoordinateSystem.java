package o;

import o.PrepareException;
import o.b;

class getInstalledAppVersion$FastBitmap$CoordinateSystem implements b.C0007b<H5Utils> {
    private final PrepareException.AnonymousClass1 getMin;

    getInstalledAppVersion$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.getMin = r1;
    }

    public final /* synthetic */ Object get() {
        H5Utils activeNotifications = this.getMin.getActiveNotifications();
        if (activeNotifications != null) {
            return activeNotifications;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
