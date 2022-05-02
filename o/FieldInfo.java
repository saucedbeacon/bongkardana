package o;

import id.dana.di.modules.MerchantDetailActionInfoModule;
import o.b;

public final class FieldInfo implements getAdapterPosition<t> {
    private final MerchantDetailActionInfoModule length;
    private final b.C0007b<s> setMax;

    private FieldInfo(MerchantDetailActionInfoModule merchantDetailActionInfoModule, b.C0007b<s> bVar) {
        this.length = merchantDetailActionInfoModule;
        this.setMax = bVar;
    }

    public static FieldInfo length(MerchantDetailActionInfoModule merchantDetailActionInfoModule, b.C0007b<s> bVar) {
        return new FieldInfo(merchantDetailActionInfoModule, bVar);
    }

    public final /* synthetic */ Object get() {
        t min = this.length.setMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
