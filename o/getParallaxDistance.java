package o;

import android.content.Context;
import o.b;
import o.isMainThread;

public final class getParallaxDistance implements getAdapterPosition<SavedStateRegistry$1> {
    private final b.C0007b<isMainThread.getMin> getMax;
    private final b.C0007b<queryLocalIdByPath> getMin;
    private final b.C0007b<Context> setMax;

    private getParallaxDistance(b.C0007b<Context> bVar, b.C0007b<isMainThread.getMin> bVar2, b.C0007b<queryLocalIdByPath> bVar3) {
        this.setMax = bVar;
        this.getMax = bVar2;
        this.getMin = bVar3;
    }

    public static getParallaxDistance getMax(b.C0007b<Context> bVar, b.C0007b<isMainThread.getMin> bVar2, b.C0007b<queryLocalIdByPath> bVar3) {
        return new getParallaxDistance(bVar, bVar2, bVar3);
    }

    public final /* synthetic */ Object get() {
        return new SavedStateRegistry$1(this.setMax.get(), this.getMax.get(), this.getMin.get());
    }
}
