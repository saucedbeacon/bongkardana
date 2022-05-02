package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class intValue implements getAdapterPosition<setStorageProxy> {
    private final b.C0007b<tryToInjectStartupParamsAndPushWorker> length;
    private final ApplicationModule setMin;

    private intValue(ApplicationModule applicationModule, b.C0007b<tryToInjectStartupParamsAndPushWorker> bVar) {
        this.setMin = applicationModule;
        this.length = bVar;
    }

    public static intValue setMax(ApplicationModule applicationModule, b.C0007b<tryToInjectStartupParamsAndPushWorker> bVar) {
        return new intValue(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setStorageProxy max = this.setMin.setMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
