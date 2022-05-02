package o;

import o.b;

public final class getName implements getAdapterPosition<getPropagation> {
    private final b.C0007b<u> getMax;
    private final b.C0007b<setNetworkAvailable> getMin;
    private final b.C0007b<canGoBackOrForward> length;

    private getName(b.C0007b<canGoBackOrForward> bVar, b.C0007b<setNetworkAvailable> bVar2, b.C0007b<u> bVar3) {
        this.length = bVar;
        this.getMin = bVar2;
        this.getMax = bVar3;
    }

    public static getName setMin(b.C0007b<canGoBackOrForward> bVar, b.C0007b<setNetworkAvailable> bVar2, b.C0007b<u> bVar3) {
        return new getName(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new getPropagation(this.length.get(), this.getMin.get(), this.getMax.get());
    }
}
