package o;

import o.PrepareException;
import o.b;

class ResourceUtils$1$Mean$Arithmetic implements b.C0007b<AndroidModel> {
    private final PrepareException.AnonymousClass1 setMin;

    ResourceUtils$1$Mean$Arithmetic(PrepareException.AnonymousClass1 r1) {
        this.setMin = r1;
    }

    public final /* synthetic */ Object get() {
        AndroidModel IPostMessageService = this.setMin.IPostMessageService();
        if (IPostMessageService != null) {
            return IPostMessageService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
