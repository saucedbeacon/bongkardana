package o;

import dagger.Lazy;
import id.dana.data.base.BasePersistenceDao;
import o.b;

public final class onDisconnected implements getAdapterPosition<RemoteDebugBridgeExtension> {
    private final b.C0007b<BasePersistenceDao> persistenceDaoProvider;

    public onDisconnected(b.C0007b<BasePersistenceDao> bVar) {
        this.persistenceDaoProvider = bVar;
    }

    public final RemoteDebugBridgeExtension get() {
        return newInstance(isScrap.getMax(this.persistenceDaoProvider));
    }

    public static onDisconnected create(b.C0007b<BasePersistenceDao> bVar) {
        return new onDisconnected(bVar);
    }

    public static RemoteDebugBridgeExtension newInstance(Lazy<BasePersistenceDao> lazy) {
        return new RemoteDebugBridgeExtension(lazy);
    }
}
