package o;

import o.PopManager;
import o.b;

public final class findPop implements getAdapterPosition<dismissAll> {
    private final b.C0007b<canGoBackOrForward> getMin;
    private final b.C0007b<PopManager.PopBean.setMin> setMax;

    private findPop(b.C0007b<PopManager.PopBean.setMin> bVar, b.C0007b<canGoBackOrForward> bVar2) {
        this.setMax = bVar;
        this.getMin = bVar2;
    }

    public static findPop setMin(b.C0007b<PopManager.PopBean.setMin> bVar, b.C0007b<canGoBackOrForward> bVar2) {
        return new findPop(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new dismissAll(this.setMax.get(), this.getMin.get());
    }
}
