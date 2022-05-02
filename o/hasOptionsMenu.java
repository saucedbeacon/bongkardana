package o;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final class hasOptionsMenu implements SQLiteEventStore.Function {
    public static final hasOptionsMenu setMin = new hasOptionsMenu();

    public final Object apply(Object obj) {
        return SQLiteEventStore.lambda$clearDb$11((SQLiteDatabase) obj);
    }
}
