package o;

import id.dana.di.modules.ApplicationModule;
import o.b;

public final class isBlankInput implements getAdapterPosition<DistinctPacketDetector> {
    private final ApplicationModule getMax;
    private final b.C0007b<getQueryScene> getMin;

    private isBlankInput(ApplicationModule applicationModule, b.C0007b<getQueryScene> bVar) {
        this.getMax = applicationModule;
        this.getMin = bVar;
    }

    public static isBlankInput setMin(ApplicationModule applicationModule, b.C0007b<getQueryScene> bVar) {
        return new isBlankInput(applicationModule, bVar);
    }

    public final /* synthetic */ Object get() {
        DistinctPacketDetector length = this.getMax.length(this.getMin.get());
        if (length != null) {
            return length;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
