package o;

import o.b;

public final class isDebuggable implements getAdapterPosition<setVerifyPublicKeyProxy> {
    private final b.C0007b<GriverEnv> investmentRepositoryProvider;

    public isDebuggable(b.C0007b<GriverEnv> bVar) {
        this.investmentRepositoryProvider = bVar;
    }

    public final setVerifyPublicKeyProxy get() {
        return newInstance(this.investmentRepositoryProvider.get());
    }

    public static isDebuggable create(b.C0007b<GriverEnv> bVar) {
        return new isDebuggable(bVar);
    }

    public static setVerifyPublicKeyProxy newInstance(GriverEnv griverEnv) {
        return new setVerifyPublicKeyProxy(griverEnv);
    }
}
