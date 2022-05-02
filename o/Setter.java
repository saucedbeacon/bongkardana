package o;

import android.content.Context;
import o.BLEManager;
import o.GriverPrepareInterceptor;
import o.R;
import o.b;

public final class Setter implements getAdapterPosition<R.styleable> {
    private final b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> IsOverlapping;
    private final b.C0007b<requestAppWithAppId> equals;
    private final b.C0007b<getTinyLocalStorageInfo> getMax;
    private final b.C0007b<ResourceProviderExtension> getMin;
    private final b.C0007b<setDataRequestNotifier> isInside;
    private final b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> length;
    private final b.C0007b<Context> setMax;
    private final b.C0007b<R.id.length> setMin;
    private final b.C0007b<getPerformanceTracker> toIntRange;

    private Setter(b.C0007b<Context> bVar, b.C0007b<R.id.length> bVar2, b.C0007b<ResourceProviderExtension> bVar3, b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> bVar4, b.C0007b<getTinyLocalStorageInfo> bVar5, b.C0007b<getPerformanceTracker> bVar6, b.C0007b<setDataRequestNotifier> bVar7, b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> bVar8, b.C0007b<requestAppWithAppId> bVar9) {
        this.setMax = bVar;
        this.setMin = bVar2;
        this.getMin = bVar3;
        this.length = bVar4;
        this.getMax = bVar5;
        this.toIntRange = bVar6;
        this.isInside = bVar7;
        this.IsOverlapping = bVar8;
        this.equals = bVar9;
    }

    public static Setter length(b.C0007b<Context> bVar, b.C0007b<R.id.length> bVar2, b.C0007b<ResourceProviderExtension> bVar3, b.C0007b<GriverPrepareInterceptor.AnonymousClass1.AnonymousClass1.AnonymousClass1> bVar4, b.C0007b<getTinyLocalStorageInfo> bVar5, b.C0007b<getPerformanceTracker> bVar6, b.C0007b<setDataRequestNotifier> bVar7, b.C0007b<BLEManager.AnonymousClass2.AnonymousClass1> bVar8, b.C0007b<requestAppWithAppId> bVar9) {
        return new Setter(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, bVar9);
    }

    public final /* synthetic */ Object get() {
        return new R.styleable(this.setMax.get(), this.setMin.get(), this.getMin.get(), this.length.get(), this.getMax.get(), this.toIntRange.get(), this.isInside.get(), this.IsOverlapping.get(), this.equals.get());
    }
}
