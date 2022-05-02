package net.sqlcipher;

import java.io.File;
import net.sqlcipher.database.SQLiteDatabase;

public final class DefaultDatabaseErrorHandler implements DatabaseErrorHandler {
    private final String TAG = getClass().getSimpleName();

    public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getPath();
        if (sQLiteDatabase.isOpen()) {
            try {
                sQLiteDatabase.close();
            } catch (Exception unused) {
            }
        }
        deleteDatabaseFile(sQLiteDatabase.getPath());
    }

    private void deleteDatabaseFile(String str) {
        if (!str.equalsIgnoreCase(SQLiteDatabase.MEMORY) && str.trim().length() != 0) {
            try {
                new File(str).delete();
            } catch (Exception e) {
                e.getMessage();
            }
        }
    }
}
