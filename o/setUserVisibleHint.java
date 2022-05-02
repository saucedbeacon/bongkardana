package o;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final class setUserVisibleHint implements SQLiteEventStore.Function {
    private final TransportContext getMax;
    private final long getMin;

    public setUserVisibleHint(long j, TransportContext transportContext) {
        this.getMin = j;
        this.getMax = transportContext;
    }

    public final Object apply(Object obj) {
        return SQLiteEventStore.lambda$recordNextCallTime$6(this.getMin, this.getMax, (SQLiteDatabase) obj);
    }
}
