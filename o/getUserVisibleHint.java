package o;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final class getUserVisibleHint implements SQLiteEventStore.Function {
    public static final getUserVisibleHint getMin = new getUserVisibleHint();

    public final Object apply(Object obj) {
        return SQLiteEventStore.lambda$getTransportContextId$2((Cursor) obj);
    }
}
