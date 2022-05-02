package o;

import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager;

public final class shouldShowRequestPermissionRationale implements SchemaManager.Migration {
    public static final shouldShowRequestPermissionRationale getMin = new shouldShowRequestPermissionRationale();

    public final void upgrade(SQLiteDatabase sQLiteDatabase) {
        SchemaManager.lambda$static$0(sQLiteDatabase);
    }
}
