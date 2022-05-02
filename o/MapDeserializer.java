package o;

import id.dana.di.modules.ApplicationModule;
import o.IPCParameter;
import o.b;

public final class MapDeserializer implements getAdapterPosition<toUuidString> {
    private final ApplicationModule setMax;
    private final b.C0007b<IPCParameter.AnonymousClass1> setMin;

    private MapDeserializer(ApplicationModule applicationModule, b.C0007b<IPCParameter.AnonymousClass1> bVar) {
        this.setMax = applicationModule;
        this.setMin = bVar;
    }

    public static MapDeserializer length(ApplicationModule applicationModule, b.C0007b<IPCParameter.AnonymousClass1> bVar) {
        return new MapDeserializer(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        toUuidString min = this.setMax.setMin(this.setMin.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
