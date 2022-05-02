package o;

import id.dana.contract.promocenter.PromoCategoryModule;
import o.BackoffPolicy;
import o.b;

public final class ListenableWorker implements getAdapterPosition<BackoffPolicy.length> {
    private final b.C0007b<DirectExecutor> length;
    private final PromoCategoryModule setMax;

    private ListenableWorker(PromoCategoryModule promoCategoryModule, b.C0007b<DirectExecutor> bVar) {
        this.setMax = promoCategoryModule;
        this.length = bVar;
    }

    public static ListenableWorker setMin(PromoCategoryModule promoCategoryModule, b.C0007b<DirectExecutor> bVar) {
        return new ListenableWorker(promoCategoryModule, bVar);
    }

    public final /* synthetic */ Object get() {
        BackoffPolicy.length max = this.setMax.getMax(this.length.get());
        if (max != null) {
            return max;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
