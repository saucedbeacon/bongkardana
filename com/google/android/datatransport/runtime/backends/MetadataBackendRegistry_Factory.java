package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import o.b;

public final class MetadataBackendRegistry_Factory implements Factory<MetadataBackendRegistry> {
    private final b.C0007b<Context> applicationContextProvider;
    private final b.C0007b<CreationContextFactory> creationContextFactoryProvider;

    public MetadataBackendRegistry_Factory(b.C0007b<Context> bVar, b.C0007b<CreationContextFactory> bVar2) {
        this.applicationContextProvider = bVar;
        this.creationContextFactoryProvider = bVar2;
    }

    public final MetadataBackendRegistry get() {
        return newInstance(this.applicationContextProvider.get(), this.creationContextFactoryProvider.get());
    }

    public static MetadataBackendRegistry_Factory create(b.C0007b<Context> bVar, b.C0007b<CreationContextFactory> bVar2) {
        return new MetadataBackendRegistry_Factory(bVar, bVar2);
    }

    public static MetadataBackendRegistry newInstance(Context context, Object obj) {
        return new MetadataBackendRegistry(context, (CreationContextFactory) obj);
    }
}
