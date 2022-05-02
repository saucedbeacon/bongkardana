package o;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

public final class AppCompatSeekBar implements AppCompatRatingBar {
    private final RoomDatabase length;
    private final setHeaderTitle<AppCompatSpinner> setMin;

    public AppCompatSeekBar(RoomDatabase roomDatabase) {
        this.length = roomDatabase;
        this.setMin = new setHeaderTitle<AppCompatSpinner>(roomDatabase) {
            public final String createQuery() {
                return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) obj;
                if (appCompatSpinner.length == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, appCompatSpinner.length);
                }
                if (appCompatSpinner.getMin == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, appCompatSpinner.getMin);
                }
            }
        };
    }

    public final void setMin(AppCompatSpinner appCompatSpinner) {
        this.length.assertNotSuspendingTransaction();
        this.length.beginTransaction();
        try {
            this.setMin.insert(appCompatSpinner);
            this.length.setTransactionSuccessful();
        } finally {
            this.length.endTransaction();
        }
    }

    public final boolean length(String str) {
        boolean z = true;
        setSplitBackground max = setSplitBackground.setMax("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=? AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)", 1);
        if (str == null) {
            max.bindNull(1);
        } else {
            max.bindString(1, str);
        }
        this.length.assertNotSuspendingTransaction();
        boolean z2 = false;
        Cursor max2 = setSubtitle.getMax(this.length, max, false);
        try {
            if (max2.moveToFirst()) {
                if (max2.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            max2.close();
            max.getMin();
        }
    }

    public final List<String> setMin(String str) {
        setSplitBackground max = setSplitBackground.setMax("SELECT work_spec_id FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            max.bindNull(1);
        } else {
            max.bindString(1, str);
        }
        this.length.assertNotSuspendingTransaction();
        Cursor max2 = setSubtitle.getMax(this.length, max, false);
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

    public final boolean setMax(String str) {
        boolean z = true;
        setSplitBackground max = setSplitBackground.setMax("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?", 1);
        if (str == null) {
            max.bindNull(1);
        } else {
            max.bindString(1, str);
        }
        this.length.assertNotSuspendingTransaction();
        boolean z2 = false;
        Cursor max2 = setSubtitle.getMax(this.length, max, false);
        try {
            if (max2.moveToFirst()) {
                if (max2.getInt(0) == 0) {
                    z = false;
                }
                z2 = z;
            }
            return z2;
        } finally {
            max2.close();
            max.getMin();
        }
    }
}
