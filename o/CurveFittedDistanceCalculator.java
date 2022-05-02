package o;

import o.APExpansion;
import o.b;

public final class CurveFittedDistanceCalculator implements getAdapterPosition<DistanceCalculator> {
    private final b.C0007b<APExpansion.AnonymousClass1> ioDispatcherProvider;
    private final b.C0007b<APExpansion.AnonymousClass1> mainDispatcherProvider;
    private final b.C0007b<getRequestedModel> socialSyncRepositoryProvider;

    public CurveFittedDistanceCalculator(b.C0007b<APExpansion.AnonymousClass1> bVar, b.C0007b<APExpansion.AnonymousClass1> bVar2, b.C0007b<getRequestedModel> bVar3) {
        this.ioDispatcherProvider = bVar;
        this.mainDispatcherProvider = bVar2;
        this.socialSyncRepositoryProvider = bVar3;
    }

    public final DistanceCalculator get() {
        return newInstance(this.ioDispatcherProvider.get(), this.mainDispatcherProvider.get(), this.socialSyncRepositoryProvider.get());
    }

    public static CurveFittedDistanceCalculator create(b.C0007b<APExpansion.AnonymousClass1> bVar, b.C0007b<APExpansion.AnonymousClass1> bVar2, b.C0007b<getRequestedModel> bVar3) {
        return new CurveFittedDistanceCalculator(bVar, bVar2, bVar3);
    }

    public static DistanceCalculator newInstance(APExpansion.AnonymousClass1 r1, APExpansion.AnonymousClass1 r2, getRequestedModel getrequestedmodel) {
        return new DistanceCalculator(r1, r2, getrequestedmodel);
    }
}
