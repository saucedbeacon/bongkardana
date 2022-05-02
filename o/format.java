package o;

import id.dana.data.account.repository.AccountEntityRepository;
import id.dana.di.modules.ApplicationModule;
import o.b;

public final class format implements getAdapterPosition<getCommonResources> {
    private final b.C0007b<AccountEntityRepository> length;
    private final ApplicationModule setMax;

    private format(ApplicationModule applicationModule, b.C0007b<AccountEntityRepository> bVar) {
        this.setMax = applicationModule;
        this.length = bVar;
    }

    public static format length(ApplicationModule applicationModule, b.C0007b<AccountEntityRepository> bVar) {
        return new format(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getCommonResources max = this.setMax.setMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
