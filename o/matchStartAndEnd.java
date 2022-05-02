package o;

import android.content.Context;
import o.b;
import o.getTransitionProperties;

public final class matchStartAndEnd implements getAdapterPosition<matchNames> {
    private final b.C0007b<getTransitionProperties.IsOverlapping> getMax;
    private final b.C0007b<getFavicon> getMin;
    private final b.C0007b<Context> setMin;

    private matchStartAndEnd(b.C0007b<Context> bVar, b.C0007b<getFavicon> bVar2, b.C0007b<getTransitionProperties.IsOverlapping> bVar3) {
        this.setMin = bVar;
        this.getMin = bVar2;
        this.getMax = bVar3;
    }

    public static matchStartAndEnd getMin(b.C0007b<Context> bVar, b.C0007b<getFavicon> bVar2, b.C0007b<getTransitionProperties.IsOverlapping> bVar3) {
        return new matchStartAndEnd(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new matchNames(this.setMin.get(), this.getMin.get(), this.getMax.get());
    }
}
