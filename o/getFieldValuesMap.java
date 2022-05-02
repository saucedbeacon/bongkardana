package o;

import id.dana.di.modules.ExpiryModule;
import o.b;
import o.onExecuted;

public final class getFieldValuesMap implements getAdapterPosition<onExecuted.getMin> {
    private final b.C0007b<CombineContinuationsWorker> getMax;
    private final ExpiryModule length;

    private getFieldValuesMap(ExpiryModule expiryModule, b.C0007b<CombineContinuationsWorker> bVar) {
        this.length = expiryModule;
        this.getMax = bVar;
    }

    public static getFieldValuesMap setMin(ExpiryModule expiryModule, b.C0007b<CombineContinuationsWorker> bVar) {
        return new getFieldValuesMap(expiryModule, bVar);
    }

    public final /* synthetic */ Object get() {
        onExecuted.getMin length2 = this.length.length(this.getMax.get());
        if (length2 != null) {
            return length2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
