package o;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final class onInflate implements SQLiteEventStore.Function {
    private final TransportContext length;
    private final SQLiteEventStore setMax;

    public onInflate(SQLiteEventStore sQLiteEventStore, TransportContext transportContext) {
        this.setMax = sQLiteEventStore;
        this.length = transportContext;
    }

    public final Object apply(Object obj) {
        return this.setMax.lambda$loadBatch$7(this.length, (SQLiteDatabase) obj);
    }
}
