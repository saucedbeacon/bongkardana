package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import o.b;

public final class SchedulingConfigModule_ConfigFactory implements Factory<SchedulerConfig> {
    private final b.C0007b<Clock> clockProvider;

    public SchedulingConfigModule_ConfigFactory(b.C0007b<Clock> bVar) {
        this.clockProvider = bVar;
    }

    public final SchedulerConfig get() {
        return config(this.clockProvider.get());
    }

    public static SchedulingConfigModule_ConfigFactory create(b.C0007b<Clock> bVar) {
        return new SchedulingConfigModule_ConfigFactory(bVar);
    }

    public static SchedulerConfig config(Clock clock) {
        return (SchedulerConfig) Preconditions.checkNotNull(SchedulingConfigModule.config(clock), "Cannot return null from a non-@Nullable @Provides method");
    }
}
