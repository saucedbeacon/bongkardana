package o;

import id.dana.contract.homeinfo.HomeRevampModule;
import o.b;
import o.destroyItem;

public final class startUpdate implements getAdapterPosition<destroyItem.getMin> {
    private final b.C0007b<factory> length;
    private final HomeRevampModule setMin;

    private startUpdate(HomeRevampModule homeRevampModule, b.C0007b<factory> bVar) {
        this.setMin = homeRevampModule;
        this.length = bVar;
    }

    public static startUpdate getMax(HomeRevampModule homeRevampModule, b.C0007b<factory> bVar) {
        return new startUpdate(homeRevampModule, bVar);
    }

    public final /* synthetic */ Object get() {
        destroyItem.getMin max = this.setMin.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
