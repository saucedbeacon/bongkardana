package net.sqlcipher.database;

import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import net.sqlcipher.database.SQLiteDatabase;

public class SupportHelper implements SupportSQLiteOpenHelper {
    private final boolean clearPassphrase;
    private byte[] passphrase;
    private SQLiteOpenHelper standardHelper;

    SupportHelper(SupportSQLiteOpenHelper.Configuration configuration, byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        SQLiteDatabase.loadLibs(configuration.getMax);
        this.passphrase = bArr;
        this.clearPassphrase = z;
        final SupportSQLiteOpenHelper.Configuration configuration2 = configuration;
        this.standardHelper = new SQLiteOpenHelper(configuration.getMax, configuration.getMin, (SQLiteDatabase.CursorFactory) null, configuration.length.setMax, sQLiteDatabaseHook) {
            public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            }

            public void onCreate(SQLiteDatabase sQLiteDatabase) {
                configuration2.length.length(sQLiteDatabase);
            }

            public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                configuration2.length.getMax(sQLiteDatabase, i, i2);
            }

            public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
                configuration2.length.getMin(sQLiteDatabase, i, i2);
            }

            public void onOpen(SQLiteDatabase sQLiteDatabase) {
                configuration2.length.getMax(sQLiteDatabase);
            }
        };
    }

    public String getDatabaseName() {
        return this.standardHelper.getDatabaseName();
    }

    public void setWriteAheadLoggingEnabled(boolean z) {
        this.standardHelper.setWriteAheadLoggingEnabled(z);
    }

    public SupportSQLiteDatabase getWritableDatabase() {
        try {
            SQLiteDatabase writableDatabase = this.standardHelper.getWritableDatabase(this.passphrase);
            if (this.clearPassphrase && this.passphrase != null) {
                int i = 0;
                while (true) {
                    byte[] bArr = this.passphrase;
                    if (i >= bArr.length) {
                        break;
                    }
                    bArr[i] = 0;
                    i++;
                }
            }
            return writableDatabase;
        } catch (SQLiteException e) {
            byte[] bArr2 = this.passphrase;
            if (bArr2 != null) {
                boolean z = true;
                for (byte b : bArr2) {
                    z = z && b == 0;
                }
                if (z) {
                    throw new IllegalStateException("The passphrase appears to be cleared. This happens by default the first time you use the factory to open a database, so we can remove the cleartext passphrase from memory. If you close the database yourself, please use a fresh SupportFactory to reopen it. If something else (e.g., Room) closed the database, and you cannot control that, use SupportFactory boolean constructor option to opt out of the automatic password clearing step. See the project README for more information.", e);
                }
            }
            throw e;
        }
    }

    public SupportSQLiteDatabase getReadableDatabase() {
        return getWritableDatabase();
    }

    public void close() {
        this.standardHelper.close();
    }
}
