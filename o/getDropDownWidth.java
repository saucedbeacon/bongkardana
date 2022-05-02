package o;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

public final class getDropDownWidth implements setDropDownWidth {
    private final RoomDatabase getMax;
    private final setHeaderTitle<setDropDownHorizontalOffset> setMax;

    public getDropDownWidth(RoomDatabase roomDatabase) {
        this.getMax = roomDatabase;
        this.setMax = new setHeaderTitle<setDropDownHorizontalOffset>(roomDatabase) {
            public final String createQuery() {
                return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                setDropDownHorizontalOffset setdropdownhorizontaloffset = (setDropDownHorizontalOffset) obj;
                if (setdropdownhorizontaloffset.getMax == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, setdropdownhorizontaloffset.getMax);
                }
                if (setdropdownhorizontaloffset.getMin == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, setdropdownhorizontaloffset.getMin);
                }
            }
        };
    }

    public final void getMax(setDropDownHorizontalOffset setdropdownhorizontaloffset) {
        this.getMax.assertNotSuspendingTransaction();
        this.getMax.beginTransaction();
        try {
            this.setMax.insert(setdropdownhorizontaloffset);
            this.getMax.setTransactionSuccessful();
        } finally {
            this.getMax.endTransaction();
        }
    }

    public final List<String> setMax(String str) {
        setSplitBackground max = setSplitBackground.setMax("SELECT name FROM workname WHERE work_spec_id=?", 1);
        if (str == null) {
            max.bindNull(1);
        } else {
            max.bindString(1, str);
        }
        this.getMax.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.getMax, max, false);
        try {
            ArrayList arrayList = new ArrayList(max2.getCount());
            while (max2.moveToNext()) {
                arrayList.add(max2.getString(0));
            }
            return arrayList;
        } finally {
            max2.close();
            max.getMin();
        }
    }
}
