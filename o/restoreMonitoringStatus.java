package o;

import o.APExpansion;
import o.b;

public final class restoreMonitoringStatus implements getAdapterPosition<isStatePreservationOn> {
    private final b.C0007b<APExpansion.AnonymousClass1> ioDispatcherProvider;
    private final b.C0007b<APExpansion.AnonymousClass1> mainDispatcherProvider;
    private final b.C0007b<getRequestedModel> socialSyncRepositoryProvider;

    public restoreMonitoringStatus(b.C0007b<getRequestedModel> bVar, b.C0007b<APExpansion.AnonymousClass1> bVar2, b.C0007b<APExpansion.AnonymousClass1> bVar3) {
        this.socialSyncRepositoryProvider = bVar;
        this.ioDispatcherProvider = bVar2;
        this.mainDispatcherProvider = bVar3;
    }

    public final isStatePreservationOn get() {
        return newInstance(this.socialSyncRepositoryProvider.get(), this.ioDispatcherProvider.get(), this.mainDispatcherProvider.get());
    }

    public static restoreMonitoringStatus create(b.C0007b<getRequestedModel> bVar, b.C0007b<APExpansion.AnonymousClass1> bVar2, b.C0007b<APExpansion.AnonymousClass1> bVar3) {
        return new restoreMonitoringStatus(bVar, bVar2, bVar3);
    }

    public static isStatePreservationOn newInstance(getRequestedModel getrequestedmodel, APExpansion.AnonymousClass1 r2, APExpansion.AnonymousClass1 r3) {
        return new isStatePreservationOn(getrequestedmodel, r2, r3);
    }
}
