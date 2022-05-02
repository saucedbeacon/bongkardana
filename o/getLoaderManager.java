package o;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final class getLoaderManager implements SQLiteEventStore.Function {
    public static final getLoaderManager getMin = new getLoaderManager();

    public final Object apply(Object obj) {
        return SQLiteEventStore.lambda$getNextCallTime$4((Cursor) obj);
    }
}
