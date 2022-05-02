package com.google.android.datatransport.runtime;

import android.content.Context;
import com.google.android.datatransport.runtime.TransportRuntimeComponent;
import com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory;
import com.google.android.datatransport.runtime.dagger.internal.DoubleCheck;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory;
import com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory;
import java.util.concurrent.Executor;
import o.b;

final class DaggerTransportRuntimeComponent extends TransportRuntimeComponent {
    private b.C0007b<SchedulerConfig> configProvider;
    private b.C0007b creationContextFactoryProvider;
    private b.C0007b<DefaultScheduler> defaultSchedulerProvider;
    private b.C0007b<Executor> executorProvider;
    private b.C0007b metadataBackendRegistryProvider;
    private b.C0007b<SQLiteEventStore> sQLiteEventStoreProvider;
    private b.C0007b schemaManagerProvider;
    private b.C0007b<Context> setApplicationContextProvider;
    private b.C0007b<TransportRuntime> transportRuntimeProvider;
    private b.C0007b<Uploader> uploaderProvider;
    private b.C0007b<WorkInitializer> workInitializerProvider;
    private b.C0007b<WorkScheduler> workSchedulerProvider;

    private DaggerTransportRuntimeComponent(Context context) {
        initialize(context);
    }

    public static TransportRuntimeComponent.Builder builder() {
        return new Builder();
    }

    private void initialize(Context context) {
        this.executorProvider = DoubleCheck.provider(ExecutionModule_ExecutorFactory.create());
        Factory create = InstanceFactory.create(context);
        this.setApplicationContextProvider = create;
        CreationContextFactory_Factory create2 = CreationContextFactory_Factory.create(create, TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create());
        this.creationContextFactoryProvider = create2;
        this.metadataBackendRegistryProvider = DoubleCheck.provider(MetadataBackendRegistry_Factory.create(this.setApplicationContextProvider, create2));
        this.schemaManagerProvider = SchemaManager_Factory.create(this.setApplicationContextProvider, EventStoreModule_DbNameFactory.create(), EventStoreModule_SchemaVersionFactory.create());
        this.sQLiteEventStoreProvider = DoubleCheck.provider(SQLiteEventStore_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), EventStoreModule_StoreConfigFactory.create(), this.schemaManagerProvider));
        SchedulingConfigModule_ConfigFactory create3 = SchedulingConfigModule_ConfigFactory.create(TimeModule_EventClockFactory.create());
        this.configProvider = create3;
        SchedulingModule_WorkSchedulerFactory create4 = SchedulingModule_WorkSchedulerFactory.create(this.setApplicationContextProvider, this.sQLiteEventStoreProvider, create3, TimeModule_UptimeClockFactory.create());
        this.workSchedulerProvider = create4;
        b.C0007b<Executor> bVar = this.executorProvider;
        b.C0007b bVar2 = this.metadataBackendRegistryProvider;
        b.C0007b<SQLiteEventStore> bVar3 = this.sQLiteEventStoreProvider;
        this.defaultSchedulerProvider = DefaultScheduler_Factory.create(bVar, bVar2, create4, bVar3, bVar3);
        b.C0007b<Context> bVar4 = this.setApplicationContextProvider;
        b.C0007b bVar5 = this.metadataBackendRegistryProvider;
        b.C0007b<SQLiteEventStore> bVar6 = this.sQLiteEventStoreProvider;
        this.uploaderProvider = Uploader_Factory.create(bVar4, bVar5, bVar6, this.workSchedulerProvider, this.executorProvider, bVar6, TimeModule_EventClockFactory.create());
        b.C0007b<Executor> bVar7 = this.executorProvider;
        b.C0007b<SQLiteEventStore> bVar8 = this.sQLiteEventStoreProvider;
        this.workInitializerProvider = WorkInitializer_Factory.create(bVar7, bVar8, this.workSchedulerProvider, bVar8);
        this.transportRuntimeProvider = DoubleCheck.provider(TransportRuntime_Factory.create(TimeModule_EventClockFactory.create(), TimeModule_UptimeClockFactory.create(), this.defaultSchedulerProvider, this.uploaderProvider, this.workInitializerProvider));
    }

    /* access modifiers changed from: package-private */
    public final TransportRuntime getTransportRuntime() {
        return this.transportRuntimeProvider.get();
    }

    /* access modifiers changed from: package-private */
    public final EventStore getEventStore() {
        return this.sQLiteEventStoreProvider.get();
    }

    static final class Builder implements TransportRuntimeComponent.Builder {
        private Context setApplicationContext;

        private Builder() {
        }

        public final Builder setApplicationContext(Context context) {
            this.setApplicationContext = (Context) Preconditions.checkNotNull(context);
            return this;
        }

        public final TransportRuntimeComponent build() {
            Preconditions.checkBuilderRequirement(this.setApplicationContext, Context.class);
            return new DaggerTransportRuntimeComponent(this.setApplicationContext);
        }
    }
}
