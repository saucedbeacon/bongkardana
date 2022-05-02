package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class checkAutoType implements getAdapterPosition<CycledLeScannerForLollipop> {
    private final b.C0007b<onAppFinish> getMin;
    private final ApplicationModule setMax;

    private checkAutoType(ApplicationModule applicationModule, b.C0007b<onAppFinish> bVar) {
        this.setMax = applicationModule;
        this.getMin = bVar;
    }

    public static checkAutoType setMin(ApplicationModule applicationModule, b.C0007b<onAppFinish> bVar) {
        return new checkAutoType(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        CycledLeScannerForLollipop max = this.setMax.setMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
