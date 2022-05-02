package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Entity(foreignKeys = {@ForeignKey(childColumns = {"work_spec_id"}, entity = getInternalPopup.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"}), @ForeignKey(childColumns = {"prerequisite_id"}, entity = getInternalPopup.class, onDelete = 5, onUpdate = 5, parentColumns = {"id"})}, indices = {@Index({"work_spec_id"}), @Index({"prerequisite_id"})}, primaryKeys = {"work_spec_id", "prerequisite_id"})
public final class AppCompatSpinner {
    @ColumnInfo(name = "prerequisite_id")
    @NonNull
    public final String getMin;
    @ColumnInfo(name = "work_spec_id")
    @NonNull
    public final String length;

    public final class SavedState implements getDropDownHorizontalOffset {
        private final RoomDatabase getMin;
        private final setHeaderTitle<performClick> length;
        private final startActionModeForChild setMax;
        private final startActionModeForChild setMin;

        public SavedState(RoomDatabase roomDatabase) {
            this.getMin = roomDatabase;
            this.length = new setHeaderTitle<performClick>(roomDatabase) {
                public final String createQuery() {
                    return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
                }

                public final /* synthetic */ void bind(SupportSQLiteStatement supportSQLiteStatement, Object obj) {
                    performClick performclick = (performClick) obj;
                    if (performclick.getMax == null) {
                        supportSQLiteStatement.bindNull(1);
                    } else {
                        supportSQLiteStatement.bindString(1, performclick.getMax);
                    }
                    byte[] max = updateAppearance.setMax(performclick.getMin);
                    if (max == null) {
                        supportSQLiteStatement.bindNull(2);
                    } else {
                        supportSQLiteStatement.bindBlob(2, max);
                    }
                }
            };
            this.setMin = new startActionModeForChild(roomDatabase) {
                public final String createQuery() {
                    return "DELETE from WorkProgress where work_spec_id=?";
                }
            };
            this.setMax = new startActionModeForChild(roomDatabase) {
                public final String createQuery() {
                    return "DELETE FROM WorkProgress";
                }
            };
        }

        public final void setMin(performClick performclick) {
            this.getMin.assertNotSuspendingTransaction();
            this.getMin.beginTransaction();
            try {
                this.length.insert(performclick);
                this.getMin.setTransactionSuccessful();
            } finally {
                this.getMin.endTransaction();
            }
        }

        public final void getMax(String str) {
            this.getMin.assertNotSuspendingTransaction();
            SupportSQLiteStatement acquire = this.setMin.acquire();
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
                this.setMin.release(acquire);
            }
        }

        public final void getMax() {
            this.getMin.assertNotSuspendingTransaction();
            SupportSQLiteStatement acquire = this.setMax.acquire();
            this.getMin.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.getMin.setTransactionSuccessful();
            } finally {
                this.getMin.endTransaction();
                this.setMax.release(acquire);
            }
        }
    }

    public AppCompatSpinner(@NonNull String str, @NonNull String str2) {
        this.length = str;
        this.getMin = str2;
    }
}
