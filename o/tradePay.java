package o;

import o.b;

public final class tradePay implements getAdapterPosition<OpenAPIBridgeExtension> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<GriverSwtich> referralRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public tradePay(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverSwtich> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.referralRepositoryProvider = bVar3;
    }

    public final OpenAPIBridgeExtension get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.referralRepositoryProvider.get());
    }

    public static tradePay create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverSwtich> bVar3) {
        return new tradePay(bVar, bVar2, bVar3);
    }

    public static OpenAPIBridgeExtension newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverSwtich griverSwtich) {
        return new OpenAPIBridgeExtension(appxloadfailed, getscheme, griverSwtich);
    }
}
