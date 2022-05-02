package o;

import id.dana.explore.popularplaces.PopularPlacesModule;
import o.hexStringToBytes;

public final class getManufacturerData implements getAdapterPosition<hexStringToBytes.getMax> {
    private final PopularPlacesModule setMin;

    private getManufacturerData(PopularPlacesModule popularPlacesModule) {
        this.setMin = popularPlacesModule;
    }

    public static getManufacturerData setMax(PopularPlacesModule popularPlacesModule) {
        return new getManufacturerData(popularPlacesModule);
    }

    public final /* synthetic */ Object get() {
        hexStringToBytes.getMax min = this.setMin.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
