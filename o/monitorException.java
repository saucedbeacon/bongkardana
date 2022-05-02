package o;

import o.PhotoContext;
import o.b;

public final class monitorException implements getAdapterPosition<NetworkBridgeExtension> {
    private final b.C0007b<parseBatteryPercentage> getMax;
    private final b.C0007b<PhotoContext.AnonymousClass2> getMin;
    private final b.C0007b<broadcastInvalidation> length;

    private monitorException(b.C0007b<broadcastInvalidation> bVar, b.C0007b<PhotoContext.AnonymousClass2> bVar2, b.C0007b<parseBatteryPercentage> bVar3) {
        this.length = bVar;
        this.getMin = bVar2;
        this.getMax = bVar3;
    }

    public static monitorException getMax(b.C0007b<broadcastInvalidation> bVar, b.C0007b<PhotoContext.AnonymousClass2> bVar2, b.C0007b<parseBatteryPercentage> bVar3) {
        return new monitorException(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new NetworkBridgeExtension(this.length.get(), this.getMin.get(), this.getMax.get());
    }
}
