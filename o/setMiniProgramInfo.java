package o;

import id.dana.di.modules.VerifyNumberModule;
import o.CompassSensorService;
import o.b;

public final class setMiniProgramInfo implements getAdapterPosition<CompassSensorService.length> {
    private final b.C0007b<sendSensorResult> getMax;
    private final VerifyNumberModule getMin;

    private setMiniProgramInfo(VerifyNumberModule verifyNumberModule, b.C0007b<sendSensorResult> bVar) {
        this.getMin = verifyNumberModule;
        this.getMax = bVar;
    }

    public static setMiniProgramInfo getMax(VerifyNumberModule verifyNumberModule, b.C0007b<sendSensorResult> bVar) {
        return new setMiniProgramInfo(verifyNumberModule, bVar);
    }

    public final /* synthetic */ Object get() {
        CompassSensorService.length min = this.getMin.setMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
