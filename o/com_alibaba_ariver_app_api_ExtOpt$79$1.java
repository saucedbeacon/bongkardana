package o;

import dagger.Lazy;
import id.dana.data.base.BasePersistenceDao;
import o.b;

public final class com_alibaba_ariver_app_api_ExtOpt$79$1 implements getAdapterPosition<com_alibaba_ariver_app_api_ExtOpt$78$1> {
    private final b.C0007b<BasePersistenceDao> persistenceDaoProvider;

    public com_alibaba_ariver_app_api_ExtOpt$79$1(b.C0007b<BasePersistenceDao> bVar) {
        this.persistenceDaoProvider = bVar;
    }

    public final com_alibaba_ariver_app_api_ExtOpt$78$1 get() {
        return newInstance(isScrap.getMax(this.persistenceDaoProvider));
    }

    public static com_alibaba_ariver_app_api_ExtOpt$79$1 create(b.C0007b<BasePersistenceDao> bVar) {
        return new com_alibaba_ariver_app_api_ExtOpt$79$1(bVar);
    }

    public static com_alibaba_ariver_app_api_ExtOpt$78$1 newInstance(Lazy<BasePersistenceDao> lazy) {
        return new com_alibaba_ariver_app_api_ExtOpt$78$1(lazy);
    }
}
