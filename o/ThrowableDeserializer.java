package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class ThrowableDeserializer implements getAdapterPosition<onBatchScanResults> {
    private final b.C0007b<checkRuntimeVersion> length;
    private final ApplicationModule setMax;

    private ThrowableDeserializer(ApplicationModule applicationModule, b.C0007b<checkRuntimeVersion> bVar) {
        this.setMax = applicationModule;
        this.length = bVar;
    }

    public static ThrowableDeserializer setMax(ApplicationModule applicationModule, b.C0007b<checkRuntimeVersion> bVar) {
        return new ThrowableDeserializer(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onBatchScanResults min = this.setMax.setMin(this.length.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
