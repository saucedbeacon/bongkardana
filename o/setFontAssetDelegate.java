package o;

import o.b;

public final class setFontAssetDelegate implements getAdapterPosition<setImageAssetDelegate> {
    private final b.C0007b<setImageAssetsFolder> getMin;

    private setFontAssetDelegate(b.C0007b<setImageAssetsFolder> bVar) {
        this.getMin = bVar;
    }

    public static setFontAssetDelegate getMin(b.C0007b<setImageAssetsFolder> bVar) {
        return new setFontAssetDelegate(bVar);
    }

    public final /* synthetic */ Object get() {
        return new setImageAssetDelegate(this.getMin.get());
    }
}
