package o;

import android.content.Context;
import o.b;
import o.endTransaction;

public final class RoomDatabase$JournalMode implements getAdapterPosition<lambda$beginTransaction$0> {
    private final b.C0007b<setOutFilePathProxy> getMax;
    private final b.C0007b<forceFlush> getMin;
    private final b.C0007b<PermissionUtils> length;
    private final b.C0007b<endTransaction.length> setMax;
    private final b.C0007b<Context> setMin;

    private RoomDatabase$JournalMode(b.C0007b<Context> bVar, b.C0007b<endTransaction.length> bVar2, b.C0007b<setOutFilePathProxy> bVar3, b.C0007b<forceFlush> bVar4, b.C0007b<PermissionUtils> bVar5) {
        this.setMin = bVar;
        this.setMax = bVar2;
        this.getMax = bVar3;
        this.getMin = bVar4;
        this.length = bVar5;
    }

    public static RoomDatabase$JournalMode setMax(b.C0007b<Context> bVar, b.C0007b<endTransaction.length> bVar2, b.C0007b<setOutFilePathProxy> bVar3, b.C0007b<forceFlush> bVar4, b.C0007b<PermissionUtils> bVar5) {
        return new RoomDatabase$JournalMode(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public final /* synthetic */ Object get() {
        return new lambda$beginTransaction$0(this.setMin.get(), this.setMax.get(), this.getMax.get(), this.getMin.get(), this.length.get());
    }
}
