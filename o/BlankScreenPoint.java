package o;

import o.EngineInitFailedPoint;
import o.b;

public final class BlankScreenPoint implements getAdapterPosition<EngineInitSuccessPoint> {
    private final b.C0007b<EngineInitFailedPoint.AnonymousClass2> localGeocodeEntityDataProvider;
    private final b.C0007b<getSelectedColor> networkGeocodeEntityDataProvider;

    public BlankScreenPoint(b.C0007b<getSelectedColor> bVar, b.C0007b<EngineInitFailedPoint.AnonymousClass2> bVar2) {
        this.networkGeocodeEntityDataProvider = bVar;
        this.localGeocodeEntityDataProvider = bVar2;
    }

    public final EngineInitSuccessPoint get() {
        return newInstance(this.networkGeocodeEntityDataProvider.get(), this.localGeocodeEntityDataProvider.get());
    }

    public static BlankScreenPoint create(b.C0007b<getSelectedColor> bVar, b.C0007b<EngineInitFailedPoint.AnonymousClass2> bVar2) {
        return new BlankScreenPoint(bVar, bVar2);
    }

    public static EngineInitSuccessPoint newInstance(getSelectedColor getselectedcolor, EngineInitFailedPoint.AnonymousClass2 r2) {
        return new EngineInitSuccessPoint(getselectedcolor, r2);
    }
}
