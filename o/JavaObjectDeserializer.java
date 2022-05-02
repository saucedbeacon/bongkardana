package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class JavaObjectDeserializer implements getAdapterPosition<isExtraBeaconData> {
    private final b.C0007b<getAppKey> getMin;
    private final ApplicationModule setMax;

    private JavaObjectDeserializer(ApplicationModule applicationModule, b.C0007b<getAppKey> bVar) {
        this.setMax = applicationModule;
        this.getMin = bVar;
    }

    public static JavaObjectDeserializer getMin(ApplicationModule applicationModule, b.C0007b<getAppKey> bVar) {
        return new JavaObjectDeserializer(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        isExtraBeaconData min = this.setMax.setMin(this.getMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
