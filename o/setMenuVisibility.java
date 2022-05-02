package o;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;

public final class setMenuVisibility implements SQLiteEventStore.Producer {
    private final SQLiteDatabase setMin;

    public setMenuVisibility(SQLiteDatabase sQLiteDatabase) {
        this.setMin = sQLiteDatabase;
    }

    public final Object produce() {
        return this.setMin.beginTransaction();
    }
}
