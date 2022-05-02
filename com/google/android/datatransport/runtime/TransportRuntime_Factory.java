package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.Scheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.time.Clock;
import o.b;

public final class TransportRuntime_Factory implements Factory<TransportRuntime> {
    private final b.C0007b<Clock> eventClockProvider;
    private final b.C0007b<WorkInitializer> initializerProvider;
    private final b.C0007b<Scheduler> schedulerProvider;
    private final b.C0007b<Uploader> uploaderProvider;
    private final b.C0007b<Clock> uptimeClockProvider;

    public TransportRuntime_Factory(b.C0007b<Clock> bVar, b.C0007b<Clock> bVar2, b.C0007b<Scheduler> bVar3, b.C0007b<Uploader> bVar4, b.C0007b<WorkInitializer> bVar5) {
        this.eventClockProvider = bVar;
        this.uptimeClockProvider = bVar2;
        this.schedulerProvider = bVar3;
        this.uploaderProvider = bVar4;
        this.initializerProvider = bVar5;
    }

    public final TransportRuntime get() {
        return newInstance(this.eventClockProvider.get(), this.uptimeClockProvider.get(), this.schedulerProvider.get(), this.uploaderProvider.get(), this.initializerProvider.get());
    }

    public static TransportRuntime_Factory create(b.C0007b<Clock> bVar, b.C0007b<Clock> bVar2, b.C0007b<Scheduler> bVar3, b.C0007b<Uploader> bVar4, b.C0007b<WorkInitializer> bVar5) {
        return new TransportRuntime_Factory(bVar, bVar2, bVar3, bVar4, bVar5);
    }

    public static TransportRuntime newInstance(Clock clock, Clock clock2, Scheduler scheduler, Uploader uploader, WorkInitializer workInitializer) {
        return new TransportRuntime(clock, clock2, scheduler, uploader, workInitializer);
    }
}
