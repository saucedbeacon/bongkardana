package o;

import o.b;
import o.handleScrollChange;

public final class setSegment implements getAdapterPosition<attachFlagToRightBtn> {
    private final b.C0007b<handleScrollChange.setMax> getMax;
    private final b.C0007b<MonitoringStatus> getMin;
    private final b.C0007b<getBeacons> length;
    private final b.C0007b<isTracked> setMax;
    private final b.C0007b<calculateRssi> setMin;

    private setSegment(b.C0007b<MonitoringStatus> bVar, b.C0007b<getBeacons> bVar2, b.C0007b<calculateRssi> bVar3, b.C0007b<isTracked> bVar4, b.C0007b<handleScrollChange.setMax> bVar5) {
        this.getMin = bVar;
        this.length = bVar2;
        this.setMin = bVar3;
        this.setMax = bVar4;
        this.getMax = bVar5;
    }

    public static setSegment length(b.C0007b<MonitoringStatus> bVar, b.C0007b<getBeacons> bVar2, b.C0007b<calculateRssi> bVar3, b.C0007b<isTracked> bVar4, b.C0007b<handleScrollChange.setMax> bVar5) {
        return new setSegment(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new attachFlagToRightBtn(this.getMin.get(), this.length.get(), this.setMin.get(), this.setMax.get(), this.getMax.get());
    }
}
