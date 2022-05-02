package o;

import o.GriverSecurity;
import o.PrepareException;
import o.b;

class loadSnapshotFile$Mean$Arithmetic implements b.C0007b<GriverSecurity.AnonymousClass1> {
    private final PrepareException.AnonymousClass1 length;

    loadSnapshotFile$Mean$Arithmetic(PrepareException.AnonymousClass1 r1) {
        this.length = r1;
    }

    public final /* synthetic */ Object get() {
        GriverSecurity.AnonymousClass1 onQueueTitleChanged = this.length.onQueueTitleChanged();
        if (onQueueTitleChanged != null) {
            return onQueueTitleChanged;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
