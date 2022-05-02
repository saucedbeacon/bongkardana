package o;

import o.PrepareException;
import o.b;

class prepareAppModel$Mean$Arithmetic implements b.C0007b<onDescriptorWrite> {
    private final PrepareException.AnonymousClass1 setMin;

    prepareAppModel$Mean$Arithmetic(PrepareException.AnonymousClass1 r1) {
        this.setMin = r1;
    }

    public final /* synthetic */ Object get() {
        onDescriptorWrite doubleRange = this.setMin.toDoubleRange();
        if (doubleRange != null) {
            return doubleRange;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
