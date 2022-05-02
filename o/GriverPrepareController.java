package o;

import o.b;

public final class GriverPrepareController implements getAdapterPosition<getDefaultSyncJsApiSet> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<GriverResourceManager> promoCenterRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public GriverPrepareController(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverResourceManager> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.promoCenterRepositoryProvider = bVar3;
    }

    public final getDefaultSyncJsApiSet get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.promoCenterRepositoryProvider.get());
    }

    public static GriverPrepareController create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverResourceManager> bVar3) {
        return new GriverPrepareController(bVar, bVar2, bVar3);
    }

    public static getDefaultSyncJsApiSet newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverResourceManager griverResourceManager) {
        return new getDefaultSyncJsApiSet(appxloadfailed, getscheme, griverResourceManager);
    }
}
