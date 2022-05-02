package o;

import id.dana.di.modules.InputNameModule;
import o.b;
import o.getScreenBrightness;

public final class writeTo implements getAdapterPosition<getScreenBrightness.setMax> {
    private final InputNameModule getMin;
    private final b.C0007b<DeviceOrientationBridgeExtension> setMin;

    public static getScreenBrightness.setMax getMin(InputNameModule inputNameModule, DeviceOrientationBridgeExtension deviceOrientationBridgeExtension) {
        getScreenBrightness.setMax max = inputNameModule.setMax(deviceOrientationBridgeExtension);
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        getScreenBrightness.setMax max = this.getMin.setMax(this.setMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
