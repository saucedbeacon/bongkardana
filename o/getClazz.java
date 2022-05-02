package o;

import id.dana.di.modules.LogoutModule;
import o.b;
import o.inTransaction;

public final class getClazz implements getAdapterPosition<inTransaction.getMax> {
    private final LogoutModule getMax;
    private final b.C0007b<createAllTables> setMin;

    private getClazz(LogoutModule logoutModule, b.C0007b<createAllTables> bVar) {
        this.getMax = logoutModule;
        this.setMin = bVar;
    }

    public static getClazz setMin(LogoutModule logoutModule, b.C0007b<createAllTables> bVar) {
        return new getClazz(logoutModule, bVar);
    }

    public final /* synthetic */ Object get() {
        inTransaction.getMax max = this.getMax.setMax(this.setMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
