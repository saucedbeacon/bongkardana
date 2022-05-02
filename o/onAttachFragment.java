package o;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final class onAttachFragment implements SQLiteEventStore.Function {
    public static final onAttachFragment getMin = new onAttachFragment();

    public final Object apply(Object obj) {
        return SQLiteEventStore.lambda$loadActiveContexts$9((SQLiteDatabase) obj);
    }
}
