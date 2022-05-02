package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.concurrent.Executor;
import o.b;

public final class DefaultScheduler_Factory implements Factory<DefaultScheduler> {
    private final b.C0007b<BackendRegistry> backendRegistryProvider;
    private final b.C0007b<EventStore> eventStoreProvider;
    private final b.C0007b<Executor> executorProvider;
    private final b.C0007b<SynchronizationGuard> guardProvider;
    private final b.C0007b<WorkScheduler> workSchedulerProvider;

    public DefaultScheduler_Factory(b.C0007b<Executor> bVar, b.C0007b<BackendRegistry> bVar2, b.C0007b<WorkScheduler> bVar3, b.C0007b<EventStore> bVar4, b.C0007b<SynchronizationGuard> bVar5) {
        this.executorProvider = bVar;
        this.backendRegistryProvider = bVar2;
        this.workSchedulerProvider = bVar3;
        this.eventStoreProvider = bVar4;
        this.guardProvider = bVar5;
    }

    public final DefaultScheduler get() {
        return newInstance(this.executorProvider.get(), this.backendRegistryProvider.get(), this.workSchedulerProvider.get(), this.eventStoreProvider.get(), this.guardProvider.get());
    }

    public static DefaultScheduler_Factory create(b.C0007b<Executor> bVar, b.C0007b<BackendRegistry> bVar2, b.C0007b<WorkScheduler> bVar3, b.C0007b<EventStore> bVar4, b.C0007b<SynchronizationGuard> bVar5) {
        return new DefaultScheduler_Factory(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public static DefaultScheduler newInstance(Executor executor, BackendRegistry backendRegistry, WorkScheduler workScheduler, EventStore eventStore, SynchronizationGuard synchronizationGuard) {
        return new DefaultScheduler(executor, backendRegistry, workScheduler, eventStore, synchronizationGuard);
    }
}
