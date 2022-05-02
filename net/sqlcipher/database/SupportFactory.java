package net.sqlcipher.database;

import androidx.sqlite.db.SupportSQLiteOpenHelper;

public class SupportFactory implements SupportSQLiteOpenHelper.length {
    private final boolean clearPassphrase;
    private final SQLiteDatabaseHook hook;
    private final byte[] passphrase;

    public SupportFactory(byte[] bArr) {
        this(bArr, (SQLiteDatabaseHook) null);
    }

    public SupportFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook) {
        this(bArr, sQLiteDatabaseHook, true);
    }

    public SupportFactory(byte[] bArr, SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        this.passphrase = bArr;
        this.hook = sQLiteDatabaseHook;
        this.clearPassphrase = z;
    }

    public SupportSQLiteOpenHelper create(SupportSQLiteOpenHelper.Configuration configuration) {
        return new SupportHelper(configuration, this.passphrase, this.hook, this.clearPassphrase);
    }
}
