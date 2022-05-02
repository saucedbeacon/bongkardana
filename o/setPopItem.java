package o;

import o.b;
import o.setBadgeInfo;

public final class setPopItem implements getAdapterPosition<setMakeTitleMax> {
    private final b.C0007b<u> getMin;
    private final b.C0007b<setBadgeInfo.setMin> length;
    private final b.C0007b<canGoBackOrForward> setMax;
    private final b.C0007b<setNetworkAvailable> setMin;

    private setPopItem(b.C0007b<setBadgeInfo.setMin> bVar, b.C0007b<canGoBackOrForward> bVar2, b.C0007b<setNetworkAvailable> bVar3, b.C0007b<u> bVar4) {
        this.length = bVar;
        this.setMax = bVar2;
        this.setMin = bVar3;
        this.getMin = bVar4;
    }

    public static setPopItem getMax(b.C0007b<setBadgeInfo.setMin> bVar, b.C0007b<canGoBackOrForward> bVar2, b.C0007b<setNetworkAvailable> bVar3, b.C0007b<u> bVar4) {
        return new setPopItem(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new setMakeTitleMax(this.length.get(), this.setMax.get(), this.setMin.get(), this.getMin.get());
    }
}
