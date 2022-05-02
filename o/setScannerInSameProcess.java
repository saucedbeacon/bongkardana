package o;

import o.b;

public final class setScannerInSameProcess implements getAdapterPosition<isAnyConsumerBound> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public setScannerInSameProcess(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDefaultFontSize> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.featureConfigRepositoryProvider = bVar3;
    }

    public final isAnyConsumerBound get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.featureConfigRepositoryProvider.get());
    }

    public static setScannerInSameProcess create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<setDefaultFontSize> bVar3) {
        return new setScannerInSameProcess(bVar, bVar2, bVar3);
    }

    public static isAnyConsumerBound newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, setDefaultFontSize setdefaultfontsize) {
        return new isAnyConsumerBound(appxloadfailed, getscheme, setdefaultfontsize);
    }
}
