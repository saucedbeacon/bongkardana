package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class integerValue implements getAdapterPosition<GriverRVMonitorImpl> {
    private final ApplicationModule length;
    private final b.C0007b<com_alibaba_ariver_app_api_ExtOpt$71$1> setMax;

    private integerValue(ApplicationModule applicationModule, b.C0007b<com_alibaba_ariver_app_api_ExtOpt$71$1> bVar) {
        this.length = applicationModule;
        this.setMax = bVar;
    }

    public static integerValue setMin(ApplicationModule applicationModule, b.C0007b<com_alibaba_ariver_app_api_ExtOpt$71$1> bVar) {
        return new integerValue(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        GriverRVMonitorImpl max = this.length.getMax(this.setMax.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
