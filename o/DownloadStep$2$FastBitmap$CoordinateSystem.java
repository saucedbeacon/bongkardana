package o;

import o.PrepareException;
import o.b;

class DownloadStep$2$FastBitmap$CoordinateSystem implements b.C0007b<onDescriptorWrite> {
    private final PrepareException.AnonymousClass1 getMax;

    DownloadStep$2$FastBitmap$CoordinateSystem(PrepareException.AnonymousClass1 r1) {
        this.getMax = r1;
    }

    public final /* synthetic */ Object get() {
        onDescriptorWrite doubleRange = this.getMax.toDoubleRange();
        if (doubleRange != null) {
            return doubleRange;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
