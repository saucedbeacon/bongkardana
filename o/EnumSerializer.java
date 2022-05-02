package o;

import id.dana.di.modules.BokuVerifyModule;
import o.onSensorChanged;

public final class EnumSerializer implements getAdapterPosition<onSensorChanged.getMin> {
    private final BokuVerifyModule setMin;

    public static onSensorChanged.getMin getMax(BokuVerifyModule bokuVerifyModule) {
        onSensorChanged.getMin min = bokuVerifyModule.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        onSensorChanged.getMin min = this.setMin.setMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
