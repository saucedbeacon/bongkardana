package o;

import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final class isInLayout implements SQLiteEventStore.Function {
    public static final isInLayout setMin = new isInLayout();

    public final Object apply(Object obj) {
        return SQLiteEventStore.lambda$getDb$0((Throwable) obj);
    }
}
