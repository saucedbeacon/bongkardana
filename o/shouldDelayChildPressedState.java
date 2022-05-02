package o;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.List;

final class shouldDelayChildPressedState implements SupportSQLiteDatabase {
    private static final String[] getMin = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    private static final String[] setMax = new String[0];
    private final SQLiteDatabase length;

    shouldDelayChildPressedState(SQLiteDatabase sQLiteDatabase) {
        this.length = sQLiteDatabase;
    }

    public final SupportSQLiteStatement compileStatement(String str) {
        return new ActionBarOverlayLayout(this.length.compileStatement(str));
    }

    public final void beginTransaction() {
        this.length.beginTransaction();
    }

    public final void beginTransactionNonExclusive() {
        this.length.beginTransactionNonExclusive();
    }

    public final void endTransaction() {
        this.length.endTransaction();
    }

    public final void setTransactionSuccessful() {
        this.length.setTransactionSuccessful();
    }

    public final boolean inTransaction() {
        return this.length.inTransaction();
    }

    public final Cursor query(String str) {
        return query((SupportSQLiteQuery) new setTitleOptional(str));
    }

    public final Cursor query(final SupportSQLiteQuery supportSQLiteQuery) {
        return this.length.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() {
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                supportSQLiteQuery.setMin(new setHasNonEmbeddedTabs(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, supportSQLiteQuery.setMin(), setMax, (String) null);
    }

    @RequiresApi(api = 16)
    public final Cursor query(final SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        return this.length.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() {
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                supportSQLiteQuery.setMin(new setHasNonEmbeddedTabs(sQLiteQuery));
                return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, supportSQLiteQuery.setMin(), setMax, (String) null, cancellationSignal);
    }

    public final void execSQL(String str) throws SQLException {
        this.length.execSQL(str);
    }

    public final void execSQL(String str, Object[] objArr) throws SQLException {
        this.length.execSQL(str, objArr);
    }

    public final boolean isOpen() {
        return this.length.isOpen();
    }

    public final String getPath() {
        return this.length.getPath();
    }

    @RequiresApi(api = 16)
    public final boolean isWriteAheadLoggingEnabled() {
        return this.length.isWriteAheadLoggingEnabled();
    }

    public final List<Pair<String, String>> getAttachedDbs() {
        return this.length.getAttachedDbs();
    }

    public final void close() throws IOException {
        this.length.close();
    }

    /* access modifiers changed from: package-private */
    public final boolean setMin(SQLiteDatabase sQLiteDatabase) {
        return this.length == sQLiteDatabase;
    }
}
