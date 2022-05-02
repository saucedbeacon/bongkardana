package o;

import o.PrepareException;
import o.b;

class beforeParsePackage$Mean$Arithmetic implements b.C0007b<appxLoadFailed> {
    private final PrepareException.AnonymousClass1 setMin;

    beforeParsePackage$Mean$Arithmetic(PrepareException.AnonymousClass1 r1) {
        this.setMin = r1;
    }

    public final /* synthetic */ Object get() {
        appxLoadFailed length = this.setMin.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
