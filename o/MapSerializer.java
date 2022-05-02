package o;

import id.dana.di.modules.ExploreServiceModule;
import o.BluetoothLeUtils;

public final class MapSerializer implements getAdapterPosition<BluetoothLeUtils.setMax> {
    private final ExploreServiceModule setMax;

    public static BluetoothLeUtils.setMax setMax(ExploreServiceModule exploreServiceModule) {
        BluetoothLeUtils.setMax max = exploreServiceModule.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        BluetoothLeUtils.setMax max = this.setMax.getMax();
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
