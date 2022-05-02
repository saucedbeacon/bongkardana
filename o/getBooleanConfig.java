package o;

import o.b;

public final class getBooleanConfig implements getAdapterPosition<H5DevConfig> {
    private final b.C0007b<resetBugMeSettings> pocketRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getBooleanConfig(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<resetBugMeSettings> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.pocketRepositoryProvider = bVar3;
    }

    public final H5DevConfig get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.pocketRepositoryProvider.get());
    }

    public static getBooleanConfig create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<resetBugMeSettings> bVar3) {
        return new getBooleanConfig(bVar, bVar2, bVar3);
    }

    public static H5DevConfig newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, resetBugMeSettings resetbugmesettings) {
        return new H5DevConfig(appxloadfailed, getscheme, resetbugmesettings);
    }
}
