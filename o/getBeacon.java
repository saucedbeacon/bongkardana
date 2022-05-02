package o;

import o.b;

public final class getBeacon implements getAdapterPosition<addBeacon> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<getResponseCode> socialGeneralRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public getBeacon(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getResponseCode> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.socialGeneralRepositoryProvider = bVar3;
    }

    public final addBeacon get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.socialGeneralRepositoryProvider.get());
    }

    public static getBeacon create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getResponseCode> bVar3) {
        return new getBeacon(bVar, bVar2, bVar3);
    }

    public static addBeacon newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, getResponseCode getresponsecode) {
        return new addBeacon(appxloadfailed, getscheme, getresponsecode);
    }
}
