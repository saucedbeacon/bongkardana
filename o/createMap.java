package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class createMap implements getAdapterPosition<fromInt> {
    private final b.C0007b<isNIOEnabled> length;
    private final ApplicationModule setMax;

    private createMap(ApplicationModule applicationModule, b.C0007b<isNIOEnabled> bVar) {
        this.setMax = applicationModule;
        this.length = bVar;
    }

    public static createMap setMax(ApplicationModule applicationModule, b.C0007b<isNIOEnabled> bVar) {
        return new createMap(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        fromInt min = this.setMax.getMin(this.length.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
