package o;

import o.b;

public final class toolbarMenusUpdated implements getAdapterPosition<interceptH5OptionMenuClick> {
    private final b.C0007b<getCommonResources> accountRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public toolbarMenusUpdated(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getCommonResources> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.accountRepositoryProvider = bVar3;
    }

    public final interceptH5OptionMenuClick get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.accountRepositoryProvider.get());
    }

    public static toolbarMenusUpdated create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getCommonResources> bVar3) {
        return new toolbarMenusUpdated(bVar, bVar2, bVar3);
    }

    public static interceptH5OptionMenuClick newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, getCommonResources getcommonresources) {
        return new interceptH5OptionMenuClick(appxloadfailed, getscheme, getcommonresources);
    }
}
