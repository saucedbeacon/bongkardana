package o;

import id.dana.di.modules.MerchantDetailConfigModule;
import o.GriverBaseFragmentActivity;
import o.b;

public final class ValueFilter implements getAdapterPosition<GriverBaseFragmentActivity.getMax> {
    private final MerchantDetailConfigModule getMin;
    private final b.C0007b<showDeniedForCamera> setMin;

    private ValueFilter(MerchantDetailConfigModule merchantDetailConfigModule, b.C0007b<showDeniedForCamera> bVar) {
        this.getMin = merchantDetailConfigModule;
        this.setMin = bVar;
    }

    public static ValueFilter getMin(MerchantDetailConfigModule merchantDetailConfigModule, b.C0007b<showDeniedForCamera> bVar) {
        return new ValueFilter(merchantDetailConfigModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverBaseFragmentActivity.getMax max = this.getMin.setMax(this.setMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
