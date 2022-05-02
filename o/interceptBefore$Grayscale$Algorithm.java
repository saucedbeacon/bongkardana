package o;

import o.PrepareException;
import o.b;

class interceptBefore$Grayscale$Algorithm implements b.C0007b<applyChanges> {
    private final PrepareException.AnonymousClass1 length;

    interceptBefore$Grayscale$Algorithm(PrepareException.AnonymousClass1 r1) {
        this.length = r1;
    }

    public final /* synthetic */ Object get() {
        applyChanges ICustomTabsCallback$Stub = this.length.ICustomTabsCallback$Stub();
        if (ICustomTabsCallback$Stub != null) {
            return ICustomTabsCallback$Stub;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
