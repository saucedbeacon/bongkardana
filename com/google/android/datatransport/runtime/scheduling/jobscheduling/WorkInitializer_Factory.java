package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import o.b;

public final class WorkInitializer_Factory implements Factory<WorkInitializer> {
    private final b.C0007b<Executor> executorProvider;
    private final b.C0007b<SynchronizationGuard> guardProvider;
    private final b.C0007b<WorkScheduler> schedulerProvider;
    private final b.C0007b<EventStore> storeProvider;

    public WorkInitializer_Factory(b.C0007b<Executor> bVar, b.C0007b<EventStore> bVar2, b.C0007b<WorkScheduler> bVar3, b.C0007b<SynchronizationGuard> bVar4) {
        this.executorProvider = bVar;
        this.storeProvider = bVar2;
        this.schedulerProvider = bVar3;
        this.guardProvider = bVar4;
    }

    public final WorkInitializer get() {
        return newInstance(this.executorProvider.get(), this.storeProvider.get(), this.schedulerProvider.get(), this.guardProvider.get());
    }

    public static WorkInitializer_Factory create(b.C0007b<Executor> bVar, b.C0007b<EventStore> bVar2, b.C0007b<WorkScheduler> bVar3, b.C0007b<SynchronizationGuard> bVar4) {
        return new WorkInitializer_Factory(bVar, bVar2, bVar3, bVar4);
    }

    public static WorkInitializer newInstance(Executor executor, EventStore eventStore, WorkScheduler workScheduler, SynchronizationGuard synchronizationGuard) {
        return new WorkInitializer(executor, eventStore, workScheduler, synchronizationGuard);
    }
}
