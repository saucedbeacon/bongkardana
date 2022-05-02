package o;

import id.dana.contract.services.ServiceCategoryModule;
import o.BindDimen;

public final class BindDrawable implements getAdapterPosition<BindDimen.setMin> {
    private final ServiceCategoryModule length;

    private BindDrawable(ServiceCategoryModule serviceCategoryModule) {
        this.length = serviceCategoryModule;
    }

    public static BindDrawable setMax(ServiceCategoryModule serviceCategoryModule) {
        return new BindDrawable(serviceCategoryModule);
    }

    public final /* synthetic */ Object get() {
        BindDimen.setMin max = this.length.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
