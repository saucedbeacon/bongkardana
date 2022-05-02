package o;

import o.b;

public final class validateMac implements getAdapterPosition<Region$1> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<toUuidString> servicesRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public validateMac(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<toUuidString> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.servicesRepositoryProvider = bVar3;
    }

    public final Region$1 get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.servicesRepositoryProvider.get());
    }

    public static validateMac create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<toUuidString> bVar3) {
        return new validateMac(bVar, bVar2, bVar3);
    }

    public static Region$1 newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, toUuidString touuidstring) {
        return new Region$1(appxloadfailed, getscheme, touuidstring);
    }
}
