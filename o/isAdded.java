package o;

import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager;

public final class isAdded implements SQLiteEventStore.Producer {
    private final SchemaManager setMax;

    public isAdded(SchemaManager schemaManager) {
        this.setMax = schemaManager;
    }

    public final Object produce() {
        return this.setMax.getWritableDatabase();
    }
}
