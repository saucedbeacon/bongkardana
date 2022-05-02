package o;

import o.b;

public final class didRangeBeaconsInRegion implements getAdapterPosition<getUniqueId> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<toUuidString> servicesRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public didRangeBeaconsInRegion(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<toUuidString> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.servicesRepositoryProvider = bVar3;
    }

    public final getUniqueId get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.servicesRepositoryProvider.get());
    }

    public static didRangeBeaconsInRegion create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<toUuidString> bVar3) {
        return new didRangeBeaconsInRegion(bVar, bVar2, bVar3);
    }

    public static getUniqueId newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, toUuidString touuidstring) {
        return new getUniqueId(appxloadfailed, getscheme, touuidstring);
    }
}
