package o;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final class isMenuVisible implements SQLiteEventStore.Function {
    private final long getMin;

    public isMenuVisible(long j) {
        this.getMin = j;
    }

    public final Object apply(Object obj) {
        return Integer.valueOf(((SQLiteDatabase) obj).delete("events", "timestamp_ms < ?", new String[]{String.valueOf(this.getMin)}));
    }
}
