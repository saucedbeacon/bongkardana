package o;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager;

public final class performGetLayoutInflater implements SchemaManager.Migration {
    public static final performGetLayoutInflater setMin = new performGetLayoutInflater();

    public final void upgrade(SQLiteDatabase sQLiteDatabase) {
        SchemaManager.lambda$static$1(sQLiteDatabase);
    }
}
