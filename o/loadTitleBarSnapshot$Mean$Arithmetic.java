package o;

import o.PrepareException;
import o.b;

class loadTitleBarSnapshot$Mean$Arithmetic implements b.C0007b<GriverSwtich> {
    private final PrepareException.AnonymousClass1 getMin;

    loadTitleBarSnapshot$Mean$Arithmetic(PrepareException.AnonymousClass1 r1) {
        this.getMin = r1;
    }

    public final /* synthetic */ Object get() {
        GriverSwtich ICustomTabsCallback$Default = this.getMin.ICustomTabsCallback$Default();
        if (ICustomTabsCallback$Default != null) {
            return ICustomTabsCallback$Default;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
