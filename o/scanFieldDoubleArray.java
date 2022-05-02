package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanFieldDoubleArray implements getAdapterPosition<resetBugMeSettings> {
    private final ApplicationModule getMin;
    private final b.C0007b<setAppModel> length;

    private scanFieldDoubleArray(ApplicationModule applicationModule, b.C0007b<setAppModel> bVar) {
        this.getMin = applicationModule;
        this.length = bVar;
    }

    public static scanFieldDoubleArray setMin(ApplicationModule applicationModule, b.C0007b<setAppModel> bVar) {
        return new scanFieldDoubleArray(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        resetBugMeSettings min = this.getMin.getMin(this.length.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
