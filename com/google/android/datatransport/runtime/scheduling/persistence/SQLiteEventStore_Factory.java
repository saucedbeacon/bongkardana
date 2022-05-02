package com.google.android.datatransport.runtime.scheduling.persistence;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.time.Clock;
import o.b;

public final class SQLiteEventStore_Factory implements Factory<SQLiteEventStore> {
    private final b.C0007b<Clock> clockProvider;
    private final b.C0007b<EventStoreConfig> configProvider;
    private final b.C0007b<SchemaManager> schemaManagerProvider;
    private final b.C0007b<Clock> wallClockProvider;

    public SQLiteEventStore_Factory(b.C0007b<Clock> bVar, b.C0007b<Clock> bVar2, b.C0007b<EventStoreConfig> bVar3, b.C0007b<SchemaManager> bVar4) {
        this.wallClockProvider = bVar;
        this.clockProvider = bVar2;
        this.configProvider = bVar3;
        this.schemaManagerProvider = bVar4;
    }

    public final SQLiteEventStore get() {
        return newInstance(this.wallClockProvider.get(), this.clockProvider.get(), this.configProvider.get(), this.schemaManagerProvider.get());
    }

    public static SQLiteEventStore_Factory create(b.C0007b<Clock> bVar, b.C0007b<Clock> bVar2, b.C0007b<EventStoreConfig> bVar3, b.C0007b<SchemaManager> bVar4) {
        return new SQLiteEventStore_Factory(bVar, bVar2, bVar3, bVar4);
    }

    public static SQLiteEventStore newInstance(Clock clock, Clock clock2, Object obj, Object obj2) {
        return new SQLiteEventStore(clock, clock2, (EventStoreConfig) obj, (SchemaManager) obj2);
    }
}
