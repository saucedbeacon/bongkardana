package o;

import o.PrepareException;
import o.b;

class getInputStream$Grayscale$Algorithm implements b.C0007b<downloadPath> {
    private final PrepareException.AnonymousClass1 setMin;

    getInputStream$Grayscale$Algorithm(PrepareException.AnonymousClass1 r1) {
        this.setMin = r1;
    }

    public final /* synthetic */ Object get() {
        downloadPath volumeAttributes = this.setMin.getVolumeAttributes();
        if (volumeAttributes != null) {
            return volumeAttributes;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
