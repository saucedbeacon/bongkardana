package o;

import id.dana.explore.popularplaces.PopularPlacesModule;
import o.b;
import o.hexStringToBytes;

public final class hasLocationPermission implements getAdapterPosition<hexStringToBytes.setMax> {
    private final b.C0007b<hexStringToBytesInReverse> getMax;
    private final PopularPlacesModule getMin;

    private hasLocationPermission(PopularPlacesModule popularPlacesModule, b.C0007b<hexStringToBytesInReverse> bVar) {
        this.getMin = popularPlacesModule;
        this.getMax = bVar;
    }

    public static hasLocationPermission length(PopularPlacesModule popularPlacesModule, b.C0007b<hexStringToBytesInReverse> bVar) {
        return new hasLocationPermission(popularPlacesModule, bVar);
    }

    public final /* synthetic */ Object get() {
        hexStringToBytes.setMax length = this.getMin.length(this.getMax.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
