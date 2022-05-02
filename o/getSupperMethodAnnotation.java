package o;

import id.dana.di.modules.NearbyMeModule;
import o.b;
import o.setTextSpacing;

public final class getSupperMethodAnnotation implements getAdapterPosition<setTextSpacing.setMin> {
    private final b.C0007b<updateAdapter> length;
    private final NearbyMeModule setMax;

    private getSupperMethodAnnotation(NearbyMeModule nearbyMeModule, b.C0007b<updateAdapter> bVar) {
        this.setMax = nearbyMeModule;
        this.length = bVar;
    }

    public static getSupperMethodAnnotation getMax(NearbyMeModule nearbyMeModule, b.C0007b<updateAdapter> bVar) {
        return new getSupperMethodAnnotation(nearbyMeModule, bVar);
    }

    public final /* synthetic */ Object get() {
        setTextSpacing.setMin length2 = this.setMax.length(this.length.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
