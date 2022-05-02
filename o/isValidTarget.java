package o;

import android.content.Context;
import o.b;
import o.getTransitionProperties;

public final class isValidTarget implements getAdapterPosition<createAnimators> {
    private final b.C0007b<Context> getMin;
    private final b.C0007b<getTransitionProperties.length> length;
    private final b.C0007b<getVisitedHistory> setMin;

    private isValidTarget(b.C0007b<Context> bVar, b.C0007b<getVisitedHistory> bVar2, b.C0007b<getTransitionProperties.length> bVar3) {
        this.getMin = bVar;
        this.setMin = bVar2;
        this.length = bVar3;
    }

    public static isValidTarget getMax(b.C0007b<Context> bVar, b.C0007b<getVisitedHistory> bVar2, b.C0007b<getTransitionProperties.length> bVar3) {
        return new isValidTarget(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new createAnimators(this.getMin.get(), this.setMin.get(), this.length.get());
    }
}
