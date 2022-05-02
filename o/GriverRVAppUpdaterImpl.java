package o;

import o.GriverAppXInterceptor;
import o.b;

public final class GriverRVAppUpdaterImpl implements getAdapterPosition<GriverRVAppInfoManagerImpl> {
    private final b.C0007b<getScheme> postExecutionThreadProvider;
    private final b.C0007b<GriverAppXInterceptor.AnonymousClass1> promotionRepositoryProvider;
    private final b.C0007b<appxLoadFailed> threadExecutorProvider;

    public GriverRVAppUpdaterImpl(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverAppXInterceptor.AnonymousClass1> bVar3) {
        this.threadExecutorProvider = bVar;
        this.postExecutionThreadProvider = bVar2;
        this.promotionRepositoryProvider = bVar3;
    }

    public final GriverRVAppInfoManagerImpl get() {
        return newInstance(this.threadExecutorProvider.get(), this.postExecutionThreadProvider.get(), this.promotionRepositoryProvider.get());
    }

    public static GriverRVAppUpdaterImpl create(b.C0007b<appxLoadFailed> bVar, b.C0007b<getScheme> bVar2, b.C0007b<GriverAppXInterceptor.AnonymousClass1> bVar3) {
        return new GriverRVAppUpdaterImpl(bVar, bVar2, bVar3);
    }

    public static GriverRVAppInfoManagerImpl newInstance(appxLoadFailed appxloadfailed, getScheme getscheme, GriverAppXInterceptor.AnonymousClass1 r3) {
        return new GriverRVAppInfoManagerImpl(appxloadfailed, getscheme, r3);
    }
}
