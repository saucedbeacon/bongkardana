package o;

import o.PrepareException;
import o.b;

class ISnapshotProxy$Mean$Arithmetic implements b.C0007b<onCharacteristicChanged> {
    private final PrepareException.AnonymousClass1 length;

    ISnapshotProxy$Mean$Arithmetic(PrepareException.AnonymousClass1 r1) {
        this.length = r1;
    }

    public final /* synthetic */ Object get() {
        onCharacteristicChanged write = this.length.write();
        if (write != null) {
            return write;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
