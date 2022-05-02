package o;

import id.dana.di.modules.NearbySearchModule;
import o.showOpenSettingView;

public final class setAccessible implements getAdapterPosition<showOpenSettingView.getMax> {
    private final NearbySearchModule length;

    public static showOpenSettingView.getMax length(NearbySearchModule nearbySearchModule) {
        showOpenSettingView.getMax max = nearbySearchModule.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        showOpenSettingView.getMax max = this.length.setMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
