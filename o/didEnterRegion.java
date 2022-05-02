package o;

import o.b;

public final class didEnterRegion implements getAdapterPosition<toHexString> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<toUuidString> servicesRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public didEnterRegion(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<toUuidString> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.servicesRepositoryProvider = bVar3;
    }

    public final toHexString get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.servicesRepositoryProvider.get());
    }

    public static didEnterRegion create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<toUuidString> bVar3) {
        return new didEnterRegion(bVar, bVar2, bVar3);
    }

    public static toHexString newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, toUuidString touuidstring) {
        return new toHexString(appxloadfailed, getscheme, touuidstring);
    }
}
