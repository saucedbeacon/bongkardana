package o;

import id.dana.di.modules.ExploreServiceModule;
import o.BluetoothLeUtils;
import o.b;

public final class ListSerializer implements getAdapterPosition<BluetoothLeUtils.setMin> {
    private final b.C0007b<MyBeaconListener> getMax;
    private final ExploreServiceModule length;

    public static BluetoothLeUtils.setMin length(ExploreServiceModule exploreServiceModule, MyBeaconListener myBeaconListener) {
        BluetoothLeUtils.setMin min = exploreServiceModule.getMin(myBeaconListener);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        BluetoothLeUtils.setMin min = this.length.getMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
