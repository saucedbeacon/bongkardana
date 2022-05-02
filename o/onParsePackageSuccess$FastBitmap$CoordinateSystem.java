package o;

import o.GriverBottomPopupDialog;
import o.PrepareException;
import o.b;

class onParsePackageSuccess$FastBitmap$CoordinateSystem implements b.C0007b<GriverBottomPopupDialog.AnonymousClass1> {
    private final PrepareException.AnonymousClass1 length;

    onParsePackageSuccess$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.length = r1;
    }

    public final /* synthetic */ Object get() {
        GriverBottomPopupDialog.AnonymousClass1 ICustomTabsService = this.length.ICustomTabsService();
        if (ICustomTabsService != null) {
            return ICustomTabsService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
