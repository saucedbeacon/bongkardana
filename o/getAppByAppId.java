package o;

import o.b;

public final class getAppByAppId implements getAdapterPosition<getAppByUrl> {
    private final b.C0007b<getCommonResources> accountRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getAppByAppId(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getCommonResources> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.accountRepositoryProvider = bVar3;
    }

    public final getAppByUrl get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.accountRepositoryProvider.get());
    }

    public static getAppByAppId create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getCommonResources> bVar3) {
        return new getAppByAppId(bVar, bVar2, bVar3);
    }

    public static getAppByUrl newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
        return new getAppByUrl(appxloadfailed, getscheme, getcommonresources);
    }
}
