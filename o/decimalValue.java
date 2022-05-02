package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class decimalValue implements getAdapterPosition<MetaDataUtils> {
    private final b.C0007b<NativeCallResultPoint> getMax;
    private final ApplicationModule length;

    private decimalValue(ApplicationModule applicationModule, b.C0007b<NativeCallResultPoint> bVar) {
        this.length = applicationModule;
        this.getMax = bVar;
    }

    public static decimalValue setMax(ApplicationModule applicationModule, b.C0007b<NativeCallResultPoint> bVar) {
        return new decimalValue(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        MetaDataUtils min = this.length.setMin(this.getMax.get());
        if (min != null) {
            return min;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
