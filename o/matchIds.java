package o;

import android.content.Context;
import o.b;
import o.getTransitionProperties;

public final class matchIds implements getAdapterPosition<matchInstances> {
    private final b.C0007b<Context> getMin;
    private final b.C0007b<getDefaultVideoPoster> setMax;
    private final b.C0007b<getTransitionProperties.setMax> setMin;

    private matchIds(b.C0007b<Context> bVar, b.C0007b<getDefaultVideoPoster> bVar2, b.C0007b<getTransitionProperties.setMax> bVar3) {
        this.getMin = bVar;
        this.setMax = bVar2;
        this.setMin = bVar3;
    }

    public static matchIds setMin(b.C0007b<Context> bVar, b.C0007b<getDefaultVideoPoster> bVar2, b.C0007b<getTransitionProperties.setMax> bVar3) {
        return new matchIds(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new matchInstances(this.getMin.get(), this.setMax.get(), this.setMin.get());
    }
}
