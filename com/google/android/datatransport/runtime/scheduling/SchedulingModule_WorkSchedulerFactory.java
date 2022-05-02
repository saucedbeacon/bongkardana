package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import o.b;

public final class SchedulingModule_WorkSchedulerFactory implements Factory<WorkScheduler> {
    private final b.C0007b<Clock> clockProvider;
    private final b.C0007b<SchedulerConfig> configProvider;
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<EventStore> eventStoreProvider;

    public SchedulingModule_WorkSchedulerFactory(b.C0007b<Context> bVar, b.C0007b<EventStore> bVar2, b.C0007b<SchedulerConfig> bVar3, b.C0007b<Clock> bVar4) {
        this.contextProvider = bVar;
        this.eventStoreProvider = bVar2;
        this.configProvider = bVar3;
        this.clockProvider = bVar4;
    }

    public final WorkScheduler get() {
        return workScheduler(this.contextProvider.get(), this.eventStoreProvider.get(), this.configProvider.get(), this.clockProvider.get());
    }

    public static SchedulingModule_WorkSchedulerFactory create(b.C0007b<Context> bVar, b.C0007b<EventStore> bVar2, b.C0007b<SchedulerConfig> bVar3, b.C0007b<Clock> bVar4) {
        return new SchedulingModule_WorkSchedulerFactory(bVar, bVar2, bVar3, bVar4);
    }

    public static WorkScheduler workScheduler(Context context, EventStore eventStore, SchedulerConfig schedulerConfig, Clock clock) {
        return (WorkScheduler) Preconditions.checkNotNull(SchedulingModule.workScheduler(context, eventStore, schedulerConfig, clock), "Cannot return null from a non-@Nullable @Provides method");
    }
}
