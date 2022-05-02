package o;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final class setHasOptionsMenu implements SQLiteEventStore.Function {
    public static final setHasOptionsMenu getMax = new setHasOptionsMenu();

    public final Object apply(Object obj) {
        return Boolean.valueOf(((Cursor) obj).moveToNext());
    }
}
