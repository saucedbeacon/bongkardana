package o;

import o.b;

public final class getTypeFromMimeType implements getAdapterPosition<transferApPathToLocalPath> {
    private final b.C0007b<APWebViewPerformance> geocodeRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getTypeFromMimeType(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<APWebViewPerformance> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.geocodeRepositoryProvider = bVar3;
    }

    public final transferApPathToLocalPath get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.geocodeRepositoryProvider.get());
    }

    public static getTypeFromMimeType create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<APWebViewPerformance> bVar3) {
        return new getTypeFromMimeType(bVar, bVar2, bVar3);
    }

    public static transferApPathToLocalPath newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, APWebViewPerformance aPWebViewPerformance) {
        return new transferApPathToLocalPath(appxloadfailed, getscheme, aPWebViewPerformance);
    }
}
