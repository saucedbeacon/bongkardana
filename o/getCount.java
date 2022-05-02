package o;

import id.dana.contract.homeinfo.HomeRevampModule;
import o.destroyItem;

public final class getCount implements getAdapterPosition<destroyItem.setMin> {
    private final HomeRevampModule length;

    private getCount(HomeRevampModule homeRevampModule) {
        this.length = homeRevampModule;
    }

    public static getCount length(HomeRevampModule homeRevampModule) {
        return new getCount(homeRevampModule);
    }

    public final /* synthetic */ Object get() {
        destroyItem.setMin min = this.length.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
