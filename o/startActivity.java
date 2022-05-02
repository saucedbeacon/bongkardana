package o;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final class startActivity implements SQLiteEventStore.Function {
    private final TransportContext getMax;
    private final SQLiteEventStore setMin;

    public startActivity(SQLiteEventStore sQLiteEventStore, TransportContext transportContext) {
        this.setMin = sQLiteEventStore;
        this.getMax = transportContext;
    }

    public final Object apply(Object obj) {
        return this.setMin.lambda$hasPendingEventsFor$5(this.getMax, (SQLiteDatabase) obj);
    }
}
