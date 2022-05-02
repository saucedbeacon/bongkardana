package o;

import dagger.Lazy;
import id.dana.data.base.BasePersistenceDao;
import o.b;

public final class PageInitPoint implements getAdapterPosition<PageExitPoint> {
    private final b.C0007b<BasePersistenceDao> persistenceDaoProvider;

    public PageInitPoint(b.C0007b<BasePersistenceDao> bVar) {
        this.persistenceDaoProvider = bVar;
    }

    public final PageExitPoint get() {
        return newInstance(isScrap.getMax(this.persistenceDaoProvider));
    }

    public static PageInitPoint create(b.C0007b<BasePersistenceDao> bVar) {
        return new PageInitPoint(bVar);
    }

    public static PageExitPoint newInstance(Lazy<BasePersistenceDao> lazy) {
        return new PageExitPoint(lazy);
    }
}
