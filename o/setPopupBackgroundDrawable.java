package o;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;

public final class setPopupBackgroundDrawable implements setDropDownVerticalOffset {
    private final RoomDatabase getMax;
    private final setHeaderTitle<getPopupContext> setMax;

    public setPopupBackgroundDrawable(RoomDatabase roomDatabase) {
        this.getMax = roomDatabase;
        this.setMax = new setHeaderTitle<getPopupContext>(roomDatabase) {
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                getPopupContext getpopupcontext = (getPopupContext) obj;
                if (getpopupcontext.setMax == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, getpopupcontext.setMax);
                }
                if (getpopupcontext.length == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindLong(2, getpopupcontext.length.longValue());
                }
            }
        };
    }

    public final void getMin(getPopupContext getpopupcontext) {
        this.getMax.assertNotSuspendingTransaction();
        this.getMax.beginTransaction();
        try {
            this.setMax.insert(getpopupcontext);
            this.getMax.setTransactionSuccessful();
        } finally {
            this.getMax.endTransaction();
        }
    }

    public final Long setMin(String str) {
        setSplitBackground max = setSplitBackground.setMax("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            max.bindNull(1);
        } else {
            max.bindString(1, str);
        }
        this.getMax.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.getMax, max, false);
        try {
            return (!max2.moveToFirst() || max2.isNull(0)) ? null : Long.valueOf(max2.getLong(0));
        } finally {
            max2.close();
            max.getMin();
        }
    }
}
