package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import o.b;

public final class CreationContextFactory_Factory implements Factory<CreationContextFactory> {
    private final b.C0007b<Context> applicationContextProvider;
    private final b.C0007b<Clock> monotonicClockProvider;
    private final b.C0007b<Clock> wallClockProvider;

    public CreationContextFactory_Factory(b.C0007b<Context> bVar, b.C0007b<Clock> bVar2, b.C0007b<Clock> bVar3) {
        this.applicationContextProvider = bVar;
        this.wallClockProvider = bVar2;
        this.monotonicClockProvider = bVar3;
    }

    public final CreationContextFactory get() {
        return newInstance(this.applicationContextProvider.get(), this.wallClockProvider.get(), this.monotonicClockProvider.get());
    }

    public static CreationContextFactory_Factory create(b.C0007b<Context> bVar, b.C0007b<Clock> bVar2, b.C0007b<Clock> bVar3) {
        return new CreationContextFactory_Factory(bVar, bVar2, bVar3);
    }

    public static CreationContextFactory newInstance(Context context, Clock clock, Clock clock2) {
        return new CreationContextFactory(context, clock, clock2);
    }
}
