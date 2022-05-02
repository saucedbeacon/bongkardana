package o;

import android.content.Context;
import o.b;
import o.inTransaction;

public final class dropAllTables implements getAdapterPosition<createAllTables> {
    private final b.C0007b<GriverMonitor> getMax;
    private final b.C0007b<Context> getMin;
    private final b.C0007b<setToolbarMenus> length;
    private final b.C0007b<getPerformanceTracker> setMax;
    private final b.C0007b<inTransaction.getMin> setMin;

    private dropAllTables(b.C0007b<Context> bVar, b.C0007b<inTransaction.getMin> bVar2, b.C0007b<GriverMonitor> bVar3, b.C0007b<getPerformanceTracker> bVar4, b.C0007b<setToolbarMenus> bVar5) {
        this.getMin = bVar;
        this.setMin = bVar2;
        this.getMax = bVar3;
        this.setMax = bVar4;
        this.length = bVar5;
    }

    public static dropAllTables getMin(b.C0007b<Context> bVar, b.C0007b<inTransaction.getMin> bVar2, b.C0007b<GriverMonitor> bVar3, b.C0007b<getPerformanceTracker> bVar4, b.C0007b<setToolbarMenus> bVar5) {
        return new dropAllTables(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new createAllTables(this.getMin.get(), this.setMin.get(), this.getMax.get(), this.setMax.get(), this.length.get());
    }
}
