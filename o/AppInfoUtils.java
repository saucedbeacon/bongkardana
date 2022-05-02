package o;

import o.APExpansion;
import o.b;

public final class AppInfoUtils implements getAdapterPosition<isRAndAbove> {
    private final b.C0007b<APExpansion.AnonymousClass1> defaultDispatcherProvider;
    private final b.C0007b<setStorageProxy> merchantInfoRepositoryProvider;

    public AppInfoUtils(b.C0007b<setStorageProxy> bVar, b.C0007b<APExpansion.AnonymousClass1> bVar2) {
        this.merchantInfoRepositoryProvider = bVar;
        this.defaultDispatcherProvider = bVar2;
    }

    public final isRAndAbove get() {
        return newInstance(this.merchantInfoRepositoryProvider.get(), this.defaultDispatcherProvider.get());
    }

    public static AppInfoUtils create(b.C0007b<setStorageProxy> bVar, b.C0007b<APExpansion.AnonymousClass1> bVar2) {
        return new AppInfoUtils(bVar, bVar2);
    }

    public static isRAndAbove newInstance(setStorageProxy setstorageproxy, APExpansion.AnonymousClass1 r2) {
        return new isRAndAbove(setstorageproxy, r2);
    }
}
