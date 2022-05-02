package o;

import android.content.Context;
import o.b;
import o.isMainThread;

public final class Transaction implements getAdapterPosition<release> {
    private final b.C0007b<GriverCreateDialogParam> getMax;
    private final b.C0007b<isMainThread.getMin> getMin;
    private final b.C0007b<createSplashFragment> length;
    private final b.C0007b<Context> setMax;
    private final b.C0007b<Embedded> setMin;

    private Transaction(b.C0007b<Context> bVar, b.C0007b<createSplashFragment> bVar2, b.C0007b<GriverCreateDialogParam> bVar3, b.C0007b<Embedded> bVar4, b.C0007b<isMainThread.getMin> bVar5) {
        this.setMax = bVar;
        this.length = bVar2;
        this.getMax = bVar3;
        this.setMin = bVar4;
        this.getMin = bVar5;
    }

    public static Transaction setMin(b.C0007b<Context> bVar, b.C0007b<createSplashFragment> bVar2, b.C0007b<GriverCreateDialogParam> bVar3, b.C0007b<Embedded> bVar4, b.C0007b<isMainThread.getMin> bVar5) {
        return new Transaction(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new release(this.setMax.get(), this.length.get(), this.getMax.get(), this.setMin.get(), this.getMin.get());
    }
}
