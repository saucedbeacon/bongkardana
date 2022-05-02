package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class decodeFast implements getAdapterPosition<findCalculatorForModelWithLock> {
    private final b.C0007b<isHasPermissionFile> getMin;
    private final ApplicationModule setMax;

    private decodeFast(ApplicationModule applicationModule, b.C0007b<isHasPermissionFile> bVar) {
        this.setMax = applicationModule;
        this.getMin = bVar;
    }

    public static decodeFast getMax(ApplicationModule applicationModule, b.C0007b<isHasPermissionFile> bVar) {
        return new decodeFast(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        findCalculatorForModelWithLock min = this.setMax.getMin(this.getMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
