package o;

import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final class setRetainInstance implements SQLiteEventStore.Function {
    public static final setRetainInstance length = new setRetainInstance();

    public final Object apply(Object obj) {
        return SQLiteEventStore.lambda$ensureBeginTransaction$16((Throwable) obj);
    }
}
