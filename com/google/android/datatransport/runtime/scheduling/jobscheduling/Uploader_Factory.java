package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.BackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import java.util.concurrent.Executor;
import o.b;

public final class Uploader_Factory implements Factory<Uploader> {
    private final b.C0007b<BackendRegistry> backendRegistryProvider;
    private final b.C0007b<Clock> clockProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<EventStore> eventStoreProvider;
    private final b.C0007b<Executor> executorProvider;
    private final b.C0007b<SynchronizationGuard> guardProvider;
    private final b.C0007b<WorkScheduler> workSchedulerProvider;

    public Uploader_Factory(b.C0007b<Context> bVar, b.C0007b<BackendRegistry> bVar2, b.C0007b<EventStore> bVar3, b.C0007b<WorkScheduler> bVar4, b.C0007b<Executor> bVar5, b.C0007b<SynchronizationGuard> bVar6, b.C0007b<Clock> bVar7) {
        this.contextProvider = bVar;
        this.backendRegistryProvider = bVar2;
        this.eventStoreProvider = bVar3;
        this.workSchedulerProvider = bVar4;
        this.executorProvider = bVar5;
        this.guardProvider = bVar6;
        this.clockProvider = bVar7;
    }

    public final Uploader get() {
        return newInstance(this.contextProvider.get(), this.backendRegistryProvider.get(), this.eventStoreProvider.get(), this.workSchedulerProvider.get(), this.executorProvider.get(), this.guardProvider.get(), this.clockProvider.get());
    }

    public static Uploader_Factory create(b.C0007b<Context> bVar, b.C0007b<BackendRegistry> bVar2, b.C0007b<EventStore> bVar3, b.C0007b<WorkScheduler> bVar4, b.C0007b<Executor> bVar5, b.C0007b<SynchronizationGuard> bVar6, b.C0007b<Clock> bVar7) {
        return new Uploader_Factory(bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7);
    }

    public static Uploader newInstance(Context context, BackendRegistry backendRegistry, EventStore eventStore, WorkScheduler workScheduler, Executor executor, SynchronizationGuard synchronizationGuard, Clock clock) {
        return new Uploader(context, backendRegistry, eventStore, workScheduler, executor, synchronizationGuard, clock);
    }
}
