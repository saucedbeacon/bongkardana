package o;

import o.PrepareException;
import o.b;

class getInstalledAppVersion$Grayscale$Algorithm implements b.C0007b<onBatchScanResults> {
    private final PrepareException.AnonymousClass1 getMax;

    getInstalledAppVersion$Grayscale$Algorithm(PrepareException.AnonymousClass1 r1) {
        this.getMax = r1;
    }

    public final /* synthetic */ Object get() {
        onBatchScanResults validateRelationship = this.getMax.validateRelationship();
        if (validateRelationship != null) {
            return validateRelationship;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable component method");
    }
}
