package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.WallTime;

@Module
public abstract class SchedulingConfigModule {
    @Provides
    static SchedulerConfig config(@WallTime Clock clock) {
        return SchedulerConfig.getDefault(clock);
    }
}
