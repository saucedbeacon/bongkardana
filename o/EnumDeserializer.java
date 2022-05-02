package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class EnumDeserializer implements getAdapterPosition<onCreateWindow> {
    private final ApplicationModule getMin;
    private final b.C0007b<bindExtensionManager> length;

    private EnumDeserializer(ApplicationModule applicationModule, b.C0007b<bindExtensionManager> bVar) {
        this.getMin = applicationModule;
        this.length = bVar;
    }

    public static EnumDeserializer setMax(ApplicationModule applicationModule, b.C0007b<bindExtensionManager> bVar) {
        return new EnumDeserializer(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onCreateWindow max = this.getMin.setMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
