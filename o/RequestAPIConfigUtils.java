package o;

import o.b;

public final class RequestAPIConfigUtils implements getAdapterPosition<getFieldValue> {
    private final b.C0007b<GriverBaseManifest> bokuRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public RequestAPIConfigUtils(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverBaseManifest> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.bokuRepositoryProvider = bVar3;
    }

    public final getFieldValue get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.bokuRepositoryProvider.get());
    }

    public static RequestAPIConfigUtils create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverBaseManifest> bVar3) {
        return new RequestAPIConfigUtils(bVar, bVar2, bVar3);
    }

    public static getFieldValue newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverBaseManifest griverBaseManifest) {
        return new getFieldValue(appxloadfailed, getscheme, griverBaseManifest);
    }
}
