package o;

import o.WorkerLog;
import o.b;

public final class setPageSource implements getAdapterPosition<PageLog> {
    private final b.C0007b<WorkerLog> amcsRequestMoneyEntityDataProvider;
    private final b.C0007b<WorkerLog.Builder> defaultRequestMoneyEntityDataProvider;

    public setPageSource(b.C0007b<WorkerLog> bVar, b.C0007b<WorkerLog.Builder> bVar2) {
        this.amcsRequestMoneyEntityDataProvider = bVar;
        this.defaultRequestMoneyEntityDataProvider = bVar2;
    }

    public final PageLog get() {
        return newInstance(this.amcsRequestMoneyEntityDataProvider.get(), this.defaultRequestMoneyEntityDataProvider.get());
    }

    public static setPageSource create(b.C0007b<WorkerLog> bVar, b.C0007b<WorkerLog.Builder> bVar2) {
        return new setPageSource(bVar, bVar2);
    }

    public static PageLog newInstance(WorkerLog workerLog, WorkerLog.Builder builder) {
        return new PageLog(workerLog, builder);
    }
}
