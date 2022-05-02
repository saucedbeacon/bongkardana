package o;

import o.GriverBottomPopupDialog;
import o.PrepareException;
import o.b;

class downloadApp$FastBitmap$CoordinateSystem implements b.C0007b<GriverBottomPopupDialog.AnonymousClass1> {
    private final PrepareException.AnonymousClass1 setMax;

    downloadApp$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.setMax = r1;
    }

    public final /* synthetic */ Object get() {
        GriverBottomPopupDialog.AnonymousClass1 ICustomTabsService = this.setMax.ICustomTabsService();
        if (ICustomTabsService != null) {
            return ICustomTabsService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
