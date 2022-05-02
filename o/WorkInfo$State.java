package o;

import o.b;
import o.isUsed;

public final class WorkInfo$State implements getAdapterPosition<getTaskExecutor> {
    private final b.C0007b<isUsed.getMax> getMin;
    private final b.C0007b<getTableName> length;

    private WorkInfo$State(b.C0007b<isUsed.getMax> bVar, b.C0007b<getTableName> bVar2) {
        this.getMin = bVar;
        this.length = bVar2;
    }

    public static WorkInfo$State setMax(b.C0007b<isUsed.getMax> bVar, b.C0007b<getTableName> bVar2) {
        return new WorkInfo$State(bVar, bVar2);
    }

    public final /* synthetic */ Object get() {
        return new getTaskExecutor(this.getMin.get(), this.length.get());
    }
}
