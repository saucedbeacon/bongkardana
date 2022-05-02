package o;

import o.b;
import o.getTitleBarRelative;

public final class getTitleContainer implements getAdapterPosition<getRightButton> {
    private final b.C0007b<getTitleBarRelative.getMin> getMax;
    private final b.C0007b<getBeacons> length;
    private final b.C0007b<MonitoringStatus> setMax;
    private final b.C0007b<DistanceCalculator> setMin;

    private getTitleContainer(b.C0007b<MonitoringStatus> bVar, b.C0007b<DistanceCalculator> bVar2, b.C0007b<getBeacons> bVar3, b.C0007b<getTitleBarRelative.getMin> bVar4) {
        this.setMax = bVar;
        this.setMin = bVar2;
        this.length = bVar3;
        this.getMax = bVar4;
    }

    public static getTitleContainer getMax(b.C0007b<MonitoringStatus> bVar, b.C0007b<DistanceCalculator> bVar2, b.C0007b<getBeacons> bVar3, b.C0007b<getTitleBarRelative.getMin> bVar4) {
        return new getTitleContainer(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new getRightButton(this.setMax.get(), this.setMin.get(), this.length.get(), this.getMax.get());
    }
}
