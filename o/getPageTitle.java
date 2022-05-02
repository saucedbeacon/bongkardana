package o;

import id.dana.contract.login.HoldLoginModule;
import o.b;
import o.registerDataSetObserver;

public final class getPageTitle implements getAdapterPosition<registerDataSetObserver.setMax> {
    private final b.C0007b<getItemPosition> getMax;
    private final HoldLoginModule setMin;

    private getPageTitle(HoldLoginModule holdLoginModule, b.C0007b<getItemPosition> bVar) {
        this.setMin = holdLoginModule;
        this.getMax = bVar;
    }

    public static getPageTitle length(HoldLoginModule holdLoginModule, b.C0007b<getItemPosition> bVar) {
        return new getPageTitle(holdLoginModule, bVar);
    }

    public final /* synthetic */ Object get() {
        registerDataSetObserver.setMax length = this.setMin.length(this.getMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
