package o;

import o.PrepareException;
import o.b;

class GriverDefaultPromptExtension$3$Grayscale$Algorithm implements b.C0007b<AndroidModel> {
    private final PrepareException.AnonymousClass1 setMin;

    GriverDefaultPromptExtension$3$Grayscale$Algorithm(PrepareException.AnonymousClass1 r1) {
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
