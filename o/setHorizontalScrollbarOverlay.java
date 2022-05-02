package o;

import o.b;

public final class setHorizontalScrollbarOverlay implements getAdapterPosition<flingScroll> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public setHorizontalScrollbarOverlay(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDefaultFontSize> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.featureConfigRepositoryProvider = bVar3;
    }

    public final flingScroll get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.featureConfigRepositoryProvider.get());
    }

    public static setHorizontalScrollbarOverlay create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDefaultFontSize> bVar3) {
        return new setHorizontalScrollbarOverlay(bVar, bVar2, bVar3);
    }

    public static flingScroll newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setDefaultFontSize setdefaultfontsize) {
        return new flingScroll(appxloadfailed, getscheme, setdefaultfontsize);
    }
}
