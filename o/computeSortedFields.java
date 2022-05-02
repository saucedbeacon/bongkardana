package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class computeSortedFields implements getAdapterPosition<getBluetoothName> {
    private final b.C0007b<isAllowRetry> setMax;
    private final ApplicationModule setMin;

    private computeSortedFields(ApplicationModule applicationModule, b.C0007b<isAllowRetry> bVar) {
        this.setMin = applicationModule;
        this.setMax = bVar;
    }

    public static computeSortedFields getMin(ApplicationModule applicationModule, b.C0007b<isAllowRetry> bVar) {
        return new computeSortedFields(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getBluetoothName min = this.setMin.setMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
