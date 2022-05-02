package o;

import androidx.sqlite.db.SupportSQLiteDatabase;

final class getRootMenu implements next {
    private final String getMax;

    public getRootMenu(String str) {
        this.getMax = str;
    }

    public final Object length(Object obj) {
        return ((SupportSQLiteDatabase) obj).execSQL(this.getMax);
    }
}
