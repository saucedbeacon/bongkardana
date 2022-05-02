package o;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.Map;

public final class isResumed implements SQLiteEventStore.Function {
    private final Map length;

    public isResumed(Map map) {
        this.length = map;
    }

    public final Object apply(Object obj) {
        return SQLiteEventStore.lambda$loadMetadata$14(this.length, (Cursor) obj);
    }
}
