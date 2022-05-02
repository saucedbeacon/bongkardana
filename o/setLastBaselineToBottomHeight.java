package o;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.util.ArrayList;
import java.util.List;

public final class setLastBaselineToBottomHeight implements setFirstBaselineToTopHeight {
    private final RoomDatabase length;
    private final setHeaderTitle<setPrompt> setMax;

    public setLastBaselineToBottomHeight(RoomDatabase roomDatabase) {
        this.length = roomDatabase;
        this.setMax = new setHeaderTitle<setPrompt>(roomDatabase) {
            public final String createQuery() {
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
            }

            public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                setPrompt setprompt = (setPrompt) obj;
                if (setprompt.getMax == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, setprompt.getMax);
                }
                if (setprompt.setMin == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, setprompt.setMin);
                }
            }
        };
    }

    public final void length(setPrompt setprompt) {
        this.length.assertNotSuspendingTransaction();
        this.length.beginTransaction();
        try {
            this.setMax.insert(setprompt);
            this.length.setTransactionSuccessful();
        } finally {
            this.length.endTransaction();
        }
    }

    public final List<String> setMax(String str) {
        setSplitBackground max = setSplitBackground.setMax("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=?", 1);
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
}
