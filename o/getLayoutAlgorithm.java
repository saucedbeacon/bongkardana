package o;

import o.b;

public final class getLayoutAlgorithm implements getAdapterPosition<getFixedFontFamily> {
    private final b.C0007b<getSansSerifFontFamily> exploreDanaRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getLayoutAlgorithm(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getSansSerifFontFamily> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.exploreDanaRepositoryProvider = bVar3;
    }

    public final getFixedFontFamily get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.exploreDanaRepositoryProvider.get());
    }

    public static getLayoutAlgorithm create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getSansSerifFontFamily> bVar3) {
        return new getLayoutAlgorithm(bVar, bVar2, bVar3);
    }

    public static getFixedFontFamily newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, getSansSerifFontFamily getsansseriffontfamily) {
        return new getFixedFontFamily(appxloadfailed, getscheme, getsansseriffontfamily);
    }
}
