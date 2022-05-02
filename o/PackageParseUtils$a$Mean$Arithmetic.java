package o;

import o.PrepareException;
import o.b;

class PackageParseUtils$a$Mean$Arithmetic implements b.C0007b<AndroidModel> {
    private final PrepareException.AnonymousClass1 getMax;

    PackageParseUtils$a$Mean$Arithmetic(PrepareException.AnonymousClass1 r1) {
        this.getMax = r1;
    }

    public final /* synthetic */ Object get() {
        AndroidModel IPostMessageService = this.getMax.IPostMessageService();
        if (IPostMessageService != null) {
            return IPostMessageService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
