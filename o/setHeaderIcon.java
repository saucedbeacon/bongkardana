package o;

import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class setHeaderIcon<T> extends startActionModeForChild {
    /* access modifiers changed from: protected */
    public abstract String createQuery();

    /* access modifiers changed from: protected */
    public abstract void setMax(SupportSQLiteStatement supportSQLiteStatement, T t);

    public setHeaderIcon(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public final int setMin(T t) {
        SupportSQLiteStatement acquire = acquire();
        try {
            setMax(acquire, t);
            return acquire.executeUpdateDelete();
        } finally {
            release(acquire);
        }
    }
}
