package o;

import o.b;

public final class shouldInterceptResponse implements getAdapterPosition<onFirstVisuallyRender> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public shouldInterceptResponse(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDefaultFontSize> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.featureConfigRepositoryProvider = bVar3;
    }

    public final onFirstVisuallyRender get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.featureConfigRepositoryProvider.get());
    }

    public static shouldInterceptResponse create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDefaultFontSize> bVar3) {
        return new shouldInterceptResponse(bVar, bVar2, bVar3);
    }

    public static onFirstVisuallyRender newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setDefaultFontSize setdefaultfontsize) {
        return new onFirstVisuallyRender(appxloadfailed, getscheme, setdefaultfontsize);
    }
}
