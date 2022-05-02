package o;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;

final class isOverflowMenuShowPending implements SupportSQLiteOpenHelper, setHeaderView {
    private final RoomDatabase.getMin getMin;
    private final Executor length;
    private final SupportSQLiteOpenHelper setMin;

    isOverflowMenuShowPending(@NonNull SupportSQLiteOpenHelper supportSQLiteOpenHelper, @NonNull RoomDatabase.getMin getmin, @NonNull Executor executor) {
        this.setMin = supportSQLiteOpenHelper;
        this.getMin = getmin;
        this.length = executor;
    }

    @Nullable
    public final String getDatabaseName() {
        return this.setMin.getDatabaseName();
    }

    @RequiresApi(api = 16)
    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.setMin.setWriteAheadLoggingEnabled(z);
    }

    public final SupportSQLiteDatabase getWritableDatabase() {
        return new getContentHeight(this.setMin.getWritableDatabase(), this.getMin, this.length);
    }

    public final SupportSQLiteDatabase getReadableDatabase() {
        return new getContentHeight(this.setMin.getReadableDatabase(), this.getMin, this.length);
    }

    public final void close() {
        this.setMin.close();
    }

    @NonNull
    public final SupportSQLiteOpenHelper setMin() {
        return this.setMin;
    }
}
