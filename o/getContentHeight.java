package o;

import android.database.Cursor;
import android.database.SQLException;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

final class getContentHeight implements SupportSQLiteDatabase {
    private final Executor getMax;
    private final RoomDatabase.getMin getMin;
    private final SupportSQLiteDatabase setMin;

    static /* synthetic */ void setMax() {
    }

    getContentHeight(@NonNull SupportSQLiteDatabase supportSQLiteDatabase, @NonNull RoomDatabase.getMin getmin, @NonNull Executor executor) {
        this.setMin = supportSQLiteDatabase;
        this.getMin = getmin;
        this.getMax = executor;
    }

    @NonNull
    public final SupportSQLiteStatement compileStatement(@NonNull String str) {
        return new positionChild(this.setMin.compileStatement(str), this.getMin, str, this.getMax);
    }

    public final void beginTransaction() {
        this.getMax.execute(new onHoverEvent(this));
        this.setMin.beginTransaction();
    }

    public final void beginTransactionNonExclusive() {
        this.getMax.execute(new showOverflowMenu(this));
        this.setMin.beginTransactionNonExclusive();
    }

    public final void endTransaction() {
        this.getMax.execute(new setVisibility(this));
        this.setMin.endTransaction();
    }

    public final void setTransactionSuccessful() {
        this.getMax.execute(new hideOverflowMenu(this));
        this.setMin.setTransactionSuccessful();
    }

    public final boolean inTransaction() {
        return this.setMin.inTransaction();
    }

    @NonNull
    public final Cursor query(@NonNull String str) {
        this.getMax.execute(new isOverflowMenuShowing(this, str));
        return this.setMin.query(str);
    }

    @NonNull
    public final Cursor query(@NonNull SupportSQLiteQuery supportSQLiteQuery) {
        measureChildView measurechildview = new measureChildView();
        supportSQLiteQuery.setMin(measurechildview);
        this.getMax.execute(new isOverflowReserved(this, supportSQLiteQuery, measurechildview));
        return this.setMin.query(supportSQLiteQuery);
    }

    @NonNull
    public final Cursor query(@NonNull SupportSQLiteQuery supportSQLiteQuery, @NonNull CancellationSignal cancellationSignal) {
        measureChildView measurechildview = new measureChildView();
        supportSQLiteQuery.setMin(measurechildview);
        this.getMax.execute(new canShowOverflowMenu(this, supportSQLiteQuery, measurechildview));
        return this.setMin.query(supportSQLiteQuery);
    }

    public final void execSQL(@NonNull String str) throws SQLException {
        this.getMax.execute(new postShowOverflowMenu(this, str));
        this.setMin.execSQL(str);
    }

    public final void execSQL(@NonNull String str, @NonNull Object[] objArr) throws SQLException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(Arrays.asList(objArr));
        this.getMax.execute(new animateToVisibility(this, str, arrayList));
        this.setMin.execSQL(str, arrayList.toArray());
    }

    public final boolean isOpen() {
        return this.setMin.isOpen();
    }

    @NonNull
    public final String getPath() {
        return this.setMin.getPath();
    }

    @RequiresApi(api = 16)
    public final boolean isWriteAheadLoggingEnabled() {
        return this.setMin.isWriteAheadLoggingEnabled();
    }

    @NonNull
    public final List<Pair<String, String>> getAttachedDbs() {
        return this.setMin.getAttachedDbs();
    }

    public final void close() throws IOException {
        this.setMin.close();
    }

    static /* synthetic */ void setMin() {
        new ArrayList(0);
    }
}
