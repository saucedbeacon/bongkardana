package o;

import id.dana.di.modules.NearbyMerchantLocationSearchModule;
import o.b;

public final class getField0 implements getAdapterPosition<t> {
    private final b.C0007b<s> getMin;
    private final NearbyMerchantLocationSearchModule setMin;

    private getField0(NearbyMerchantLocationSearchModule nearbyMerchantLocationSearchModule, b.C0007b<s> bVar) {
        this.setMin = nearbyMerchantLocationSearchModule;
        this.getMin = bVar;
    }

    public static getField0 length(NearbyMerchantLocationSearchModule nearbyMerchantLocationSearchModule, b.C0007b<s> bVar) {
        return new getField0(nearbyMerchantLocationSearchModule, bVar);
    }

    public final /* synthetic */ Object get() {
        t max = this.setMin.setMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
