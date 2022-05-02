package o;

import id.dana.di.modules.NearbyMeModule;
import o.b;

public final class getGenericParamType implements getAdapterPosition<t> {
    private final b.C0007b<s> length;
    private final NearbyMeModule setMax;

    private getGenericParamType(NearbyMeModule nearbyMeModule, b.C0007b<s> bVar) {
        this.setMax = nearbyMeModule;
        this.length = bVar;
    }

    public static getGenericParamType length(NearbyMeModule nearbyMeModule, b.C0007b<s> bVar) {
        return new getGenericParamType(nearbyMeModule, bVar);
    }

    public final /* synthetic */ Object get() {
        t max = this.setMax.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
