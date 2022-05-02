package o;

import android.content.Context;
import o.b;

public final class addAnimatorPauseListener implements getAdapterPosition<loop> {
    private final b.C0007b<getLogType> getMax;
    private final b.C0007b<Context> length;
    private final b.C0007b<b.AnonymousClass14> setMax;
    private final b.C0007b<setImageAssetDelegate> setMin;

    private addAnimatorPauseListener(b.C0007b<b.AnonymousClass14> bVar, b.C0007b<setImageAssetDelegate> bVar2, b.C0007b<getLogType> bVar3, b.C0007b<Context> bVar4) {
        this.setMax = bVar;
        this.setMin = bVar2;
        this.getMax = bVar3;
        this.length = bVar4;
    }

    public static addAnimatorPauseListener getMin(b.C0007b<b.AnonymousClass14> bVar, b.C0007b<setImageAssetDelegate> bVar2, b.C0007b<getLogType> bVar3, b.C0007b<Context> bVar4) {
        return new addAnimatorPauseListener(bVar, bVar2, bVar3, bVar4);
    }

    public final /* synthetic */ Object get() {
        return new loop(this.setMax.get(), this.setMin.get(), this.getMax.get(), this.length.get());
    }
}
