package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class scanFieldDoubleArray2 implements getAdapterPosition<downloadPath> {
    private final ApplicationModule getMax;
    private final b.C0007b<com_alibaba_ariver_app_api_ExtOpt$97$1> setMax;

    private scanFieldDoubleArray2(ApplicationModule applicationModule, b.C0007b<com_alibaba_ariver_app_api_ExtOpt$97$1> bVar) {
        this.getMax = applicationModule;
        this.setMax = bVar;
    }

    public static scanFieldDoubleArray2 setMin(ApplicationModule applicationModule, b.C0007b<com_alibaba_ariver_app_api_ExtOpt$97$1> bVar) {
        return new scanFieldDoubleArray2(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        downloadPath max = this.getMax.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
