package o;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final class requestPermissions implements SQLiteEventStore.Function {
    private final String setMin;

    public requestPermissions(String str) {
        this.setMin = str;
    }

    public final Object apply(Object obj) {
        return SQLiteEventStore.lambda$recordFailure$3(this.setMin, (SQLiteDatabase) obj);
    }
}
