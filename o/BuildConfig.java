package o;

import android.content.Context;
import id.dana.data.account.repository.AccountEntityRepository;
import o.b;

public final class BuildConfig implements getAdapterPosition<bindExtensionManager> {
    private final b.C0007b<UpdateAppCallback> getMax;
    private final b.C0007b<AccountEntityRepository> length;
    private final b.C0007b<Context> setMax;

    private BuildConfig(b.C0007b<Context> bVar, b.C0007b<UpdateAppCallback> bVar2, b.C0007b<AccountEntityRepository> bVar3) {
        this.setMax = bVar;
        this.getMax = bVar2;
        this.length = bVar3;
    }

    public static BuildConfig getMin(b.C0007b<Context> bVar, b.C0007b<UpdateAppCallback> bVar2, b.C0007b<AccountEntityRepository> bVar3) {
        return new BuildConfig(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new bindExtensionManager(this.setMax.get(), this.getMax.get(), this.length.get());
    }
}
