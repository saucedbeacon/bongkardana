package o;

import o.PhotoContext;
import o.ViewBoundsCheck$ViewBounds;
import o.b;

public final class defaultValue implements getAdapterPosition<collate> {
    private final b.C0007b<version> IsOverlapping;
    private final b.C0007b<getCallbackPackageName> equals;
    private final b.C0007b<setLoggingEnabled> getMax;
    private final b.C0007b<getBluetoothServices> getMin;
    private final b.C0007b<GriverRVLoggerProxyImpl> length;
    private final b.C0007b<PhotoContext.AnonymousClass2> setMax;
    private final b.C0007b<ViewBoundsCheck$ViewBounds.setMin> setMin;
    private final b.C0007b<getSamples> toIntRange;

    private defaultValue(b.C0007b<ViewBoundsCheck$ViewBounds.setMin> bVar, b.C0007b<getBluetoothServices> bVar2, b.C0007b<GriverRVLoggerProxyImpl> bVar3, b.C0007b<PhotoContext.AnonymousClass2> bVar4, b.C0007b<setLoggingEnabled> bVar5, b.C0007b<getCallbackPackageName> bVar6, b.C0007b<getSamples> bVar7, b.C0007b<version> bVar8) {
        this.setMin = bVar;
        this.getMin = bVar2;
        this.length = bVar3;
        this.setMax = bVar4;
        this.getMax = bVar5;
        this.equals = bVar6;
        this.toIntRange = bVar7;
        this.IsOverlapping = bVar8;
    }

    public static defaultValue getMax(b.C0007b<ViewBoundsCheck$ViewBounds.setMin> bVar, b.C0007b<getBluetoothServices> bVar2, b.C0007b<GriverRVLoggerProxyImpl> bVar3, b.C0007b<PhotoContext.AnonymousClass2> bVar4, b.C0007b<setLoggingEnabled> bVar5, b.C0007b<getCallbackPackageName> bVar6, b.C0007b<getSamples> bVar7, b.C0007b<version> bVar8) {
        return new defaultValue(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8);
    }

    public final /* synthetic */ Object get() {
        return new collate(this.setMin.get(), this.getMin.get(), this.length.get(), this.setMax.get(), this.getMax.get(), this.equals.get(), this.toIntRange.get(), this.IsOverlapping.get());
    }
}
