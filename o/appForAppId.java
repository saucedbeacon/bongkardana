package o;

import o.b;

public final class appForAppId implements getAdapterPosition<getLocalResponse> {
    private final b.C0007b<setDefaultFontSize> featureConfigRepositoryProvider;
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<GriverPrepareInterceptor> qrBarcodeRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public appForAppId(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverPrepareInterceptor> bVar3, b.C0007b<setDefaultFontSize> bVar4) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.qrBarcodeRepositoryProvider = bVar3;
        this.featureConfigRepositoryProvider = bVar4;
    }

    public final getLocalResponse get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.qrBarcodeRepositoryProvider.get(), this.featureConfigRepositoryProvider.get());
    }

    public static appForAppId create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverPrepareInterceptor> bVar3, b.C0007b<setDefaultFontSize> bVar4) {
        return new appForAppId(bVar, bVar2, bVar3, bVar4);
    }

    public static getLocalResponse newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverPrepareInterceptor griverPrepareInterceptor, setDefaultFontSize setdefaultfontsize) {
        return new getLocalResponse(appxloadfailed, getscheme, griverPrepareInterceptor, setdefaultfontsize);
    }
}
