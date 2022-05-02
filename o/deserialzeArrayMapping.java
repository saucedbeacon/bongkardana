package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class deserialzeArrayMapping implements getAdapterPosition<findCalculatorForModelWithLock> {
    private final b.C0007b<isHasPermissionFile> getMin;
    private final ApplicationModule length;

    private deserialzeArrayMapping(ApplicationModule applicationModule, b.C0007b<isHasPermissionFile> bVar) {
        this.length = applicationModule;
        this.getMin = bVar;
    }

    public static deserialzeArrayMapping length(ApplicationModule applicationModule, b.C0007b<isHasPermissionFile> bVar) {
        return new deserialzeArrayMapping(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        findCalculatorForModelWithLock max = this.length.setMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
