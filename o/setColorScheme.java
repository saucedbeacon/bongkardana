package o;

import o.b;
import o.setProgressBackgroundColorSchemeResource;

public final class setColorScheme implements getAdapterPosition<setDistanceToTriggerSync> {
    private final b.C0007b<GVSplashView> getMax;
    private final b.C0007b<setProgressBackgroundColorSchemeResource.setMin> getMin;
    private final b.C0007b<applyShow> setMin;

    private setColorScheme(b.C0007b<setProgressBackgroundColorSchemeResource.setMin> bVar, b.C0007b<applyShow> bVar2, b.C0007b<GVSplashView> bVar3) {
        this.getMin = bVar;
        this.setMin = bVar2;
        this.getMax = bVar3;
    }

    public static setColorScheme getMin(b.C0007b<setProgressBackgroundColorSchemeResource.setMin> bVar, b.C0007b<applyShow> bVar2, b.C0007b<GVSplashView> bVar3) {
        return new setColorScheme(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new setDistanceToTriggerSync(this.getMin.get(), this.setMin.get(), this.getMax.get());
    }
}
