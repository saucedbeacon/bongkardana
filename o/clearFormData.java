package o;

import o.b;

public final class clearFormData implements getAdapterPosition<clearCache> {
    private final b.C0007b<getCursiveFontFamily> appGeneralRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public clearFormData(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getCursiveFontFamily> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.appGeneralRepositoryProvider = bVar3;
    }

    public final clearCache get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.appGeneralRepositoryProvider.get());
    }

    public static clearFormData create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getCursiveFontFamily> bVar3) {
        return new clearFormData(bVar, bVar2, bVar3);
    }

    public static clearCache newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, getCursiveFontFamily getcursivefontfamily) {
        return new clearCache(appxloadfailed, getscheme, getcursivefontfamily);
    }
}
