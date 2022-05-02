package o;

import o.PrepareException;
import o.b;

class hitPresetResource$Grayscale$Algorithm implements b.C0007b<AndroidModel> {
    private final PrepareException.AnonymousClass1 length;

    hitPresetResource$Grayscale$Algorithm(PrepareException.AnonymousClass1 r1) {
        this.length = r1;
    }

    public final /* synthetic */ Object get() {
        AndroidModel IPostMessageService = this.length.IPostMessageService();
        if (IPostMessageService != null) {
            return IPostMessageService;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
