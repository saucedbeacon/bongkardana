package o;

import id.dana.di.modules.MerchantDetailConfigModule;
import o.GriverBaseFragmentActivity;

public final class getFieldType implements getAdapterPosition<GriverBaseFragmentActivity.getMin> {
    private final MerchantDetailConfigModule setMax;

    private getFieldType(MerchantDetailConfigModule merchantDetailConfigModule) {
        this.setMax = merchantDetailConfigModule;
    }

    public static getFieldType getMax(MerchantDetailConfigModule merchantDetailConfigModule) {
        return new getFieldType(merchantDetailConfigModule);
    }

    public final /* synthetic */ Object get() {
        GriverBaseFragmentActivity.getMin length = this.setMax.length();
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
