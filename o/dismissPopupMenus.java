package o;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.concurrent.Executor;

public final class dismissPopupMenus implements SupportSQLiteOpenHelper.length {
    private final Executor getMax;
    private final SupportSQLiteOpenHelper.length length;
    private final RoomDatabase.getMin setMax;

    public dismissPopupMenus(@NonNull SupportSQLiteOpenHelper.length length2, @NonNull RoomDatabase.getMin getmin, @NonNull Executor executor) {
        this.length = length2;
        this.setMax = getmin;
        this.getMax = executor;
    }

    @NonNull
    public final SupportSQLiteOpenHelper create(@NonNull SupportSQLiteOpenHelper.Configuration configuration) {
        return new isOverflowMenuShowPending(this.length.create(configuration), this.setMax, this.getMax);
    }
}
