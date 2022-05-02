package o;

import android.content.Context;
import o.BackoffPolicy;
import o.ZoomRecyclerView;
import o.b;

public final class ExistingWorkPolicy implements getAdapterPosition<DirectExecutor> {
    private final b.C0007b<getDefaultSyncJsApiSet> getMax;
    private final b.C0007b<ZoomRecyclerView.AnonymousClass1> length;
    private final b.C0007b<Context> setMax;
    private final b.C0007b<BackoffPolicy.setMax> setMin;

    private ExistingWorkPolicy(b.C0007b<BackoffPolicy.setMax> bVar, b.C0007b<getDefaultSyncJsApiSet> bVar2, b.C0007b<ZoomRecyclerView.AnonymousClass1> bVar3, b.C0007b<Context> bVar4) {
        this.setMin = bVar;
        this.getMax = bVar2;
        this.length = bVar3;
        this.setMax = bVar4;
    }

    public static ExistingWorkPolicy getMax(b.C0007b<BackoffPolicy.setMax> bVar, b.C0007b<getDefaultSyncJsApiSet> bVar2, b.C0007b<ZoomRecyclerView.AnonymousClass1> bVar3, b.C0007b<Context> bVar4) {
        return new ExistingWorkPolicy(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new DirectExecutor(this.setMin.get(), this.getMax.get(), this.length.get(), this.setMax.get());
    }
}
