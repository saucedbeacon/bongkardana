package o;

import android.database.Cursor;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final class isHidden implements SQLiteEventStore.Function {
    public static final isHidden setMax = new isHidden();

    public final Object apply(Object obj) {
        return SQLiteEventStore.lambda$readPayload$13((Cursor) obj);
    }
}
