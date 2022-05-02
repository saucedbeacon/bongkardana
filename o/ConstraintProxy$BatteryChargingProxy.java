package o;

import kotlin.jvm.functions.Function1;

final class ConstraintProxy$BatteryChargingProxy implements Function1 {
    private final WorkManagerInitializer setMin;

    public ConstraintProxy$BatteryChargingProxy(WorkManagerInitializer workManagerInitializer) {
        this.setMin = workManagerInitializer;
    }

    public final Object invoke(Object obj) {
        return WorkManagerInitializer.getMax(this.setMin, (Throwable) obj);
    }
}
