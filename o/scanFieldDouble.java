package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanFieldDouble implements getAdapterPosition<getScheme> {
    private final b.C0007b<onEnteredHiddenState> getMin;
    private final ApplicationModule setMax;

    private scanFieldDouble(ApplicationModule applicationModule, b.C0007b<onEnteredHiddenState> bVar) {
        this.setMax = applicationModule;
        this.getMin = bVar;
    }

    public static scanFieldDouble setMin(ApplicationModule applicationModule, b.C0007b<onEnteredHiddenState> bVar) {
        return new scanFieldDouble(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        getScheme length = this.setMax.length(this.getMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
