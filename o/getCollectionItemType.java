package o;

import id.dana.di.modules.NearbySearchModule;
import o.b;
import o.showOpenSettingView;

public final class getCollectionItemType implements getAdapterPosition<showOpenSettingView.length> {
    private final b.C0007b<ShowAuthGuideBridgeExtension> getMin;
    private final NearbySearchModule setMax;

    public static showOpenSettingView.length getMin(NearbySearchModule nearbySearchModule, ShowAuthGuideBridgeExtension showAuthGuideBridgeExtension) {
        showOpenSettingView.length max = nearbySearchModule.setMax(showAuthGuideBridgeExtension);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        showOpenSettingView.length max = this.setMax.setMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
