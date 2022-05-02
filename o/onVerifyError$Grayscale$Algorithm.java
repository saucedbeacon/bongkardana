package o;

import o.PrepareException;
import o.b;

class onVerifyError$Grayscale$Algorithm implements b.C0007b<AndroidModel> {
    private final PrepareException.AnonymousClass1 getMin;

    onVerifyError$Grayscale$Algorithm(PrepareException.AnonymousClass1 r1) {
        this.getMin = r1;
    }

    public final /* synthetic */ Object get() {
        AndroidModel IPostMessageService = this.getMin.IPostMessageService();
        if (IPostMessageService != null) {
            return IPostMessageService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
