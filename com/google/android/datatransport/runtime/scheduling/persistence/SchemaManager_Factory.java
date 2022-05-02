package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import o.b;

public final class SchemaManager_Factory implements Factory<SchemaManager> {
    private final b.C0007b<Context> contextProvider;
    private final b.C0007b<String> dbNameProvider;
    private final b.C0007b<Integer> schemaVersionProvider;

    public SchemaManager_Factory(b.C0007b<Context> bVar, b.C0007b<String> bVar2, b.C0007b<Integer> bVar3) {
        this.contextProvider = bVar;
        this.dbNameProvider = bVar2;
        this.schemaVersionProvider = bVar3;
    }

    public final SchemaManager get() {
        return newInstance(this.contextProvider.get(), this.dbNameProvider.get(), this.schemaVersionProvider.get().intValue());
    }

    public static SchemaManager_Factory create(b.C0007b<Context> bVar, b.C0007b<String> bVar2, b.C0007b<Integer> bVar3) {
        return new SchemaManager_Factory(bVar, bVar2, bVar3);
    }

    public static SchemaManager newInstance(Context context, String str, int i) {
        return new SchemaManager(context, str, i);
    }
}
