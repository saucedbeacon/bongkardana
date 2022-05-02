package o;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final class getRetainInstance implements SQLiteEventStore.Function {
    private final SQLiteEventStore getMin;
    private final EventInternal length;
    private final TransportContext setMax;

    public getRetainInstance(SQLiteEventStore sQLiteEventStore, TransportContext transportContext, EventInternal eventInternal) {
        this.getMin = sQLiteEventStore;
        this.setMax = transportContext;
        this.length = eventInternal;
    }

    public final Object apply(Object obj) {
        return this.getMin.lambda$persist$1(this.setMax, this.length, (SQLiteDatabase) obj);
    }
}
