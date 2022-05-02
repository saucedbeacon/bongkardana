package o;

import o.PrepareException;
import o.b;

class onParsePackageSuccess$Mean$Arithmetic implements b.C0007b<AndroidModel> {
    private final PrepareException.AnonymousClass1 setMax;

    onParsePackageSuccess$Mean$Arithmetic(PrepareException.AnonymousClass1 r1) {
        this.setMax = r1;
    }

    public final /* synthetic */ Object get() {
        AndroidModel IPostMessageService = this.setMax.IPostMessageService();
        if (IPostMessageService != null) {
            return IPostMessageService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
