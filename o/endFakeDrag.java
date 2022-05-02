package o;

import o.b;
import o.beginFakeDrag;

public final class endFakeDrag implements getAdapterPosition<onSecondaryPointerUp> {
    private final b.C0007b<copyBackForwardList> getMax;
    private final b.C0007b<beginFakeDrag.getMin> getMin;
    private final b.C0007b<SystemUtils> setMin;

    private endFakeDrag(b.C0007b<beginFakeDrag.getMin> bVar, b.C0007b<SystemUtils> bVar2, b.C0007b<copyBackForwardList> bVar3) {
        this.getMin = bVar;
        this.setMin = bVar2;
        this.getMax = bVar3;
    }

    public static endFakeDrag getMin(b.C0007b<beginFakeDrag.getMin> bVar, b.C0007b<SystemUtils> bVar2, b.C0007b<copyBackForwardList> bVar3) {
        return new endFakeDrag(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new onSecondaryPointerUp(this.getMin.get(), this.setMin.get(), this.getMax.get());
    }
}
