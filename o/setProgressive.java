package o;

import o.b;
import o.setPriority;

public final class setProgressive implements getAdapterPosition<setEnableSaliency> {
    private final b.C0007b<addRangeNotifier> getMax;
    private final b.C0007b<setPriority.length> setMin;

    private setProgressive(b.C0007b<setPriority.length> bVar, b.C0007b<addRangeNotifier> bVar2) {
        this.setMin = bVar;
        this.getMax = bVar2;
    }

    public static setProgressive getMin(b.C0007b<setPriority.length> bVar, b.C0007b<addRangeNotifier> bVar2) {
        return new setProgressive(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new setEnableSaliency(this.setMin.get(), this.getMax.get());
    }
}
