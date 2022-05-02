package o;

import android.content.Context;
import o.GriverMonitor;
import o.b;
import o.isMainThread;

public final class acquire implements getAdapterPosition<createNewStatement> {
    private final b.C0007b<setDatabasePath> getMax;
    private final b.C0007b<isMainThread.getMin> getMin;
    private final b.C0007b<Context> length;
    private final b.C0007b<GriverCreateDialogParam> setMax;
    private final b.C0007b<GriverMonitor.AnonymousClass2> setMin;

    private acquire(b.C0007b<Context> bVar, b.C0007b<isMainThread.getMin> bVar2, b.C0007b<GriverMonitor.AnonymousClass2> bVar3, b.C0007b<setDatabasePath> bVar4, b.C0007b<GriverCreateDialogParam> bVar5) {
        this.length = bVar;
        this.getMin = bVar2;
        this.setMin = bVar3;
        this.getMax = bVar4;
        this.setMax = bVar5;
    }

    public static acquire length(b.C0007b<Context> bVar, b.C0007b<isMainThread.getMin> bVar2, b.C0007b<GriverMonitor.AnonymousClass2> bVar3, b.C0007b<setDatabasePath> bVar4, b.C0007b<GriverCreateDialogParam> bVar5) {
        return new acquire(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new createNewStatement(this.length.get(), this.getMin.get(), this.setMin.get(), this.getMax.get(), this.setMax.get());
    }
}
