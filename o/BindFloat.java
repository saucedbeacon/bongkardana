package o;

import id.dana.contract.services.ServiceCategoryModule;
import o.BindDimen;
import o.b;

public final class BindFloat implements getAdapterPosition<BindDimen.setMax> {
    private final ServiceCategoryModule getMin;
    private final b.C0007b<BindColor> setMin;

    private BindFloat(ServiceCategoryModule serviceCategoryModule, b.C0007b<BindColor> bVar) {
        this.getMin = serviceCategoryModule;
        this.setMin = bVar;
    }

    public static BindFloat setMax(ServiceCategoryModule serviceCategoryModule, b.C0007b<BindColor> bVar) {
        return new BindFloat(serviceCategoryModule, bVar);
    }

    public final /* synthetic */ Object get() {
        BindDimen.setMax length = this.getMin.length(this.setMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
