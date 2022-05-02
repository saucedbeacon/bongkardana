package o;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final class onHiddenChanged implements SQLiteEventStore.Function {
    public static final onHiddenChanged setMax = new onHiddenChanged();

    public final Object apply(Object obj) {
        return SQLiteEventStore.lambda$loadActiveContexts$8((Cursor) obj);
    }
}
