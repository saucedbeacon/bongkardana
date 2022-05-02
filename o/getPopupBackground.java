package o;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

public final class getPopupBackground implements setPopupBackgroundResource {
    private final startActionModeForChild getMax;
    private final RoomDatabase getMin;
    private final setHeaderTitle<getDropDownVerticalOffset> length;

    public getPopupBackground(RoomDatabase roomDatabase) {
        this.getMin = roomDatabase;
        this.length = new setHeaderTitle<getDropDownVerticalOffset>(roomDatabase) {
            public final String createQuery() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                getDropDownVerticalOffset getdropdownverticaloffset = (getDropDownVerticalOffset) obj;
                if (getdropdownverticaloffset.length == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, getdropdownverticaloffset.length);
                }
                supportSQLiteStatement.bindLong(2, (long) getdropdownverticaloffset.getMax);
            }
        };
        this.getMax = new startActionModeForChild(roomDatabase) {
            public final String createQuery() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }

    public final void getMax(getDropDownVerticalOffset getdropdownverticaloffset) {
        this.getMin.assertNotSuspendingTransaction();
        this.getMin.beginTransaction();
        try {
            this.length.insert(getdropdownverticaloffset);
            this.getMin.setTransactionSuccessful();
        } finally {
            this.getMin.endTransaction();
        }
    }

    public final void setMax(String str) {
        this.getMin.assertNotSuspendingTransaction();
        SupportSQLiteStatement acquire = this.getMax.acquire();
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.getMin.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.getMin.setTransactionSuccessful();
        } finally {
            this.getMin.endTransaction();
            this.getMax.release(acquire);
        }
    }

    public final getDropDownVerticalOffset setMin(String str) {
        setSplitBackground max = setSplitBackground.setMax("SELECT `SystemIdInfo`.`work_spec_id` AS `work_spec_id`, `SystemIdInfo`.`system_id` AS `system_id` FROM SystemIdInfo WHERE work_spec_id=?", 1);
        if (str == null) {
            max.bindNull(1);
        } else {
            max.bindString(1, str);
        }
        this.getMin.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.getMin, max, false);
        try {
            return max2.moveToFirst() ? new getDropDownVerticalOffset(max2.getString(getTitle.setMax(max2, "work_spec_id")), max2.getInt(getTitle.setMax(max2, "system_id"))) : null;
        } finally {
            max2.close();
            max.getMin();
        }
    }

    public final List<String> getMin() {
        setSplitBackground max = setSplitBackground.setMax("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.getMin.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.getMin, max, false);
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
