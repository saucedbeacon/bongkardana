package o;

import android.content.Context;
import id.dana.di.modules.SplitModule;
import o.b;
import o.sendLocation;

public final class GriverErrors implements getAdapterPosition<getRequestMainPackage> {
    private final b.C0007b<sendLocation.setMin> getMax;
    private final SplitModule getMin;
    private final b.C0007b<getQueryScene> length;
    private final b.C0007b<Context> setMax;
    private final b.C0007b<getPerformanceTracker> setMin;

    private GriverErrors(SplitModule splitModule, b.C0007b<Context> bVar, b.C0007b<sendLocation.setMin> bVar2, b.C0007b<getPerformanceTracker> bVar3, b.C0007b<getQueryScene> bVar4) {
        this.getMin = splitModule;
        this.setMax = bVar;
        this.getMax = bVar2;
        this.setMin = bVar3;
        this.length = bVar4;
    }

    public static GriverErrors setMin(SplitModule splitModule, b.C0007b<Context> bVar, b.C0007b<sendLocation.setMin> bVar2, b.C0007b<getPerformanceTracker> bVar3, b.C0007b<getQueryScene> bVar4) {
        return new GriverErrors(splitModule, bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        getRequestMainPackage max = this.getMin.setMax(this.setMax.get(), this.getMax.get(), this.setMin.get(), this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
