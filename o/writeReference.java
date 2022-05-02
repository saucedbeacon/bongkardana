package o;

import id.dana.di.modules.ConfirmPinModule;
import o.SensorBridgeExtension;

public final class writeReference implements getAdapterPosition<SensorBridgeExtension.AnonymousClass4.getMax> {
    private final ConfirmPinModule getMin;

    private writeReference(ConfirmPinModule confirmPinModule) {
        this.getMin = confirmPinModule;
    }

    public static writeReference getMin(ConfirmPinModule confirmPinModule) {
        return new writeReference(confirmPinModule);
    }

    public final /* synthetic */ Object get() {
        SensorBridgeExtension.AnonymousClass4.getMax min = this.getMin.getMin();
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
