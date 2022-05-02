package o;

import o.GriverAppXInterceptor;
import o.b;

public final class GriverNormalResourcePackage implements getAdapterPosition<isVerifFailed> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<GriverAppXInterceptor.AnonymousClass1> promotionRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public GriverNormalResourcePackage(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverAppXInterceptor.AnonymousClass1> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.promotionRepositoryProvider = bVar3;
    }

    public final isVerifFailed get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.promotionRepositoryProvider.get());
    }

    public static GriverNormalResourcePackage create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverAppXInterceptor.AnonymousClass1> bVar3) {
        return new GriverNormalResourcePackage(bVar, bVar2, bVar3);
    }

    public static isVerifFailed newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverAppXInterceptor.AnonymousClass1 r3) {
        return new isVerifFailed(appxloadfailed, getscheme, r3);
    }
}
