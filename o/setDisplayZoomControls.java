package o;

import o.b;

public final class setDisplayZoomControls implements getAdapterPosition<getAllowContentAccess> {
    private final b.C0007b<getBuiltInZoomControls> donationRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public setDisplayZoomControls(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getBuiltInZoomControls> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.donationRepositoryProvider = bVar3;
    }

    public final getAllowContentAccess get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.donationRepositoryProvider.get());
    }

    public static setDisplayZoomControls create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<getBuiltInZoomControls> bVar3) {
        return new setDisplayZoomControls(bVar, bVar2, bVar3);
    }

    public static getAllowContentAccess newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, getBuiltInZoomControls getbuiltinzoomcontrols) {
        return new getAllowContentAccess(appxloadfailed, getscheme, getbuiltinzoomcontrols);
    }
}
