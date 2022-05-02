package o;

import androidx.sqlite.db.SupportSQLiteDatabase;

final class getExpandedItem implements next {
    public static final getExpandedItem getMin = new getExpandedItem();

    public final Object length(Object obj) {
        return ((SupportSQLiteDatabase) obj).getAttachedDbs();
    }
}
