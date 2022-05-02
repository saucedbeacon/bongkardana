package o;

import dagger.Lazy;
import id.dana.data.base.BasePersistenceDao;
import o.b;

public final class ExtensionInvokerFactory implements getAdapterPosition<invokeWithTargetExtensions> {
    private final b.C0007b<BasePersistenceDao> persistenceDaoProvider;

    public ExtensionInvokerFactory(b.C0007b<BasePersistenceDao> bVar) {
        this.persistenceDaoProvider = bVar;
    }

    public final invokeWithTargetExtensions get() {
        return newInstance(isScrap.getMax(this.persistenceDaoProvider));
    }

    public static ExtensionInvokerFactory create(b.C0007b<BasePersistenceDao> bVar) {
        return new ExtensionInvokerFactory(bVar);
    }

    public static invokeWithTargetExtensions newInstance(Lazy<BasePersistenceDao> lazy) {
        return new invokeWithTargetExtensions(lazy);
    }
}
