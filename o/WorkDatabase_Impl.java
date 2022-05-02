package o;

import kotlin.jvm.functions.Function1;

final class WorkDatabase_Impl implements Function1 {
    private final WorkManagerInitializer getMax;

    public WorkDatabase_Impl(WorkManagerInitializer workManagerInitializer) {
        this.getMax = workManagerInitializer;
    }

    public final Object invoke(Object obj) {
        return WorkManagerInitializer.getMax(this.getMax, (Boolean) obj);
    }
}
