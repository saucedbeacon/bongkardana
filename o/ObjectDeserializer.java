package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class ObjectDeserializer implements getAdapterPosition<isShortUuid> {
    private final b.C0007b<getDownloadEndTime> getMin;
    private final ApplicationModule setMax;

    private ObjectDeserializer(ApplicationModule applicationModule, b.C0007b<getDownloadEndTime> bVar) {
        this.setMax = applicationModule;
        this.getMin = bVar;
    }

    public static ObjectDeserializer getMin(ApplicationModule applicationModule, b.C0007b<getDownloadEndTime> bVar) {
        return new ObjectDeserializer(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        isShortUuid max = this.setMax.getMax(this.getMin.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
