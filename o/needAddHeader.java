package o;

import o.b;

public final class needAddHeader implements getAdapterPosition<handleTinyAppKeyEvent> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<H5Utils> settingRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public needAddHeader(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<H5Utils> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.settingRepositoryProvider = bVar3;
    }

    public final handleTinyAppKeyEvent get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.settingRepositoryProvider.get());
    }

    public static needAddHeader create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<H5Utils> bVar3) {
        return new needAddHeader(bVar, bVar2, bVar3);
    }

    public static handleTinyAppKeyEvent newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, H5Utils h5Utils) {
        return new handleTinyAppKeyEvent(appxloadfailed, getscheme, h5Utils);
    }
}
