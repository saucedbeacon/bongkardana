package o;

import o.PrepareException;
import o.b;

class GriverUniformPromptExtension$Grayscale$Algorithm implements b.C0007b<onCharacteristicChanged> {
    private final PrepareException.AnonymousClass1 setMin;

    GriverUniformPromptExtension$Grayscale$Algorithm(PrepareException.AnonymousClass1 r1) {
        this.setMin = r1;
    }

    public final /* synthetic */ Object get() {
        onCharacteristicChanged write = this.setMin.write();
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
