package o;

import o.b;
import o.destroyItem;

public final class saveState implements getAdapterPosition<factory> {
    private final b.C0007b<ShouldLoadUrlPoint> getMax;
    private final b.C0007b<GriverInnerConfig> setMax;
    private final b.C0007b<destroyItem.setMin> setMin;

    private saveState(b.C0007b<destroyItem.setMin> bVar, b.C0007b<GriverInnerConfig> bVar2, b.C0007b<ShouldLoadUrlPoint> bVar3) {
        this.setMin = bVar;
        this.setMax = bVar2;
        this.getMax = bVar3;
    }

    public static saveState getMin(b.C0007b<destroyItem.setMin> bVar, b.C0007b<GriverInnerConfig> bVar2, b.C0007b<ShouldLoadUrlPoint> bVar3) {
        return new saveState(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new factory(this.setMin.get(), this.setMax.get(), this.getMax.get());
    }
}
