package o;

import androidx.sqlite.db.SupportSQLiteDatabase;

final class setCurrentMenuInfo implements next {
    private final String setMax;
    private final Object[] setMin;

    public setCurrentMenuInfo(String str, Object[] objArr) {
        this.setMax = str;
        this.setMin = objArr;
    }

    public final Object length(Object obj) {
        return ((SupportSQLiteDatabase) obj).execSQL(this.setMax, this.setMin);
    }
}
