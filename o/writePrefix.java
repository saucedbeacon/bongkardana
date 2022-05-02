package o;

import id.dana.di.modules.BokuVerifyModule;
import o.SensorBridgeExtension;
import o.b;
import o.onSensorChanged;

public final class writePrefix implements getAdapterPosition<onSensorChanged.getMax> {
    private final BokuVerifyModule getMax;
    private final b.C0007b<SensorBridgeExtension.AnonymousClass2> setMin;

    public static onSensorChanged.getMax getMin(BokuVerifyModule bokuVerifyModule, SensorBridgeExtension.AnonymousClass2 r1) {
        onSensorChanged.getMax min = bokuVerifyModule.getMin(r1);
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        onSensorChanged.getMax min = this.getMax.getMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
