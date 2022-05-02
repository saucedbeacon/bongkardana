package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class seeAlso implements getAdapterPosition<onGeolocationPermissionsHidePrompt> {
    private final ApplicationModule getMax;
    private final b.C0007b<setAnimation> setMax;

    private seeAlso(ApplicationModule applicationModule, b.C0007b<setAnimation> bVar) {
        this.getMax = applicationModule;
        this.setMax = bVar;
    }

    public static seeAlso getMax(ApplicationModule applicationModule, b.C0007b<setAnimation> bVar) {
        return new seeAlso(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onGeolocationPermissionsHidePrompt min = this.getMax.getMin(this.setMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
