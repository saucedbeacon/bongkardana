package o;

import o.b;
import o.getPageSize;

public final class registerOnPageChangeCallback implements getAdapterPosition<requestTransform> {
    private final b.C0007b<getPageSize.getMin> getMax;
    private final b.C0007b<copyBackForwardList> length;

    private registerOnPageChangeCallback(b.C0007b<copyBackForwardList> bVar, b.C0007b<getPageSize.getMin> bVar2) {
        this.length = bVar;
        this.getMax = bVar2;
    }

    public static registerOnPageChangeCallback setMax(b.C0007b<copyBackForwardList> bVar, b.C0007b<getPageSize.getMin> bVar2) {
        return new registerOnPageChangeCallback(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new requestTransform(this.length.get(), this.getMax.get());
    }
}
