package o;

import id.dana.di.modules.ConfirmPinModule;
import o.SensorBridgeExtension;
import o.b;

public final class incrementIndent implements getAdapterPosition<SensorBridgeExtension.AnonymousClass4.length> {
    private final b.C0007b<SensorServiceManager> getMax;
    private final ConfirmPinModule setMax;

    private incrementIndent(ConfirmPinModule confirmPinModule, b.C0007b<SensorServiceManager> bVar) {
        this.setMax = confirmPinModule;
        this.getMax = bVar;
    }

    public static incrementIndent setMax(ConfirmPinModule confirmPinModule, b.C0007b<SensorServiceManager> bVar) {
        return new incrementIndent(confirmPinModule, bVar);
    }

    public final /* synthetic */ Object get() {
        SensorBridgeExtension.AnonymousClass4.length max = this.setMax.setMax(this.getMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
