package o;

import android.database.Cursor;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.List;

public final class isVisible implements SQLiteEventStore.Function {
    private final SQLiteEventStore getMax;
    private final List getMin;
    private final TransportContext length;

    public isVisible(SQLiteEventStore sQLiteEventStore, List list, TransportContext transportContext) {
        this.getMax = sQLiteEventStore;
        this.getMin = list;
        this.length = transportContext;
    }

    public final Object apply(Object obj) {
        return this.getMax.lambda$loadEvents$12(this.getMin, this.length, (Cursor) obj);
    }
}
