package o;

import dagger.Lazy;
import id.dana.data.base.BasePersistenceDao;
import o.b;

public final class getAuthCode implements getAdapterPosition<getSuccessScopes> {
    private final b.C0007b<BasePersistenceDao> persistenceDaoProvider;

    public getAuthCode(b.C0007b<BasePersistenceDao> bVar) {
        this.persistenceDaoProvider = bVar;
    }

    public final getSuccessScopes get() {
        return newInstance(isScrap.getMax(this.persistenceDaoProvider));
    }

    public static getAuthCode create(b.C0007b<BasePersistenceDao> bVar) {
        return new getAuthCode(bVar);
    }

    public static getSuccessScopes newInstance(Lazy<BasePersistenceDao> lazy) {
        return new getSuccessScopes(lazy);
    }
}
