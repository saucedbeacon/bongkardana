package o;

import id.dana.domain.authcode.interactor.GetAuthCode;
import o.b;
import o.getRunningAnimators;

public final class setPropagation implements getAdapterPosition<setEpicenterCallback> {
    private final b.C0007b<parseBatteryPercentage> getMax;
    private final b.C0007b<getPerformanceTracker> getMin;
    private final b.C0007b<getRunningAnimators.getMin> length;
    private final b.C0007b<GetAuthCode> setMax;
    private final b.C0007b<getUniqueId> setMin;

    private setPropagation(b.C0007b<getRunningAnimators.getMin> bVar, b.C0007b<getUniqueId> bVar2, b.C0007b<parseBatteryPercentage> bVar3, b.C0007b<GetAuthCode> bVar4, b.C0007b<getPerformanceTracker> bVar5) {
        this.length = bVar;
        this.setMin = bVar2;
        this.getMax = bVar3;
        this.setMax = bVar4;
        this.getMin = bVar5;
    }

    public static setPropagation length(b.C0007b<getRunningAnimators.getMin> bVar, b.C0007b<getUniqueId> bVar2, b.C0007b<parseBatteryPercentage> bVar3, b.C0007b<GetAuthCode> bVar4, b.C0007b<getPerformanceTracker> bVar5) {
        return new setPropagation(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new setEpicenterCallback(this.length.get(), this.setMin.get(), this.getMax.get(), this.setMax.get(), this.getMin.get());
    }
}
