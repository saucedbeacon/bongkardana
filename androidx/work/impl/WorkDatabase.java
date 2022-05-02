package androidx.work.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import o.AppCompatRatingBar;
import o.AppCompatSpinner;
import o.compatMeasureContentWidth;
import o.getDropDownHorizontalOffset;
import o.getDropDownVerticalOffset;
import o.getFirstBaselineToTopHeight;
import o.getInternalPopup;
import o.getPopupContext;
import o.getSupportCompoundDrawablesTintMode;
import o.isInOverlayMode;
import o.performClick;
import o.setDropDownHorizontalOffset;
import o.setDropDownVerticalOffset;
import o.setDropDownWidth;
import o.setFirstBaselineToTopHeight;
import o.setPopupBackgroundResource;
import o.setPrimaryBackground;
import o.setPrompt;
import o.setSupportCompoundDrawablesTintMode;
import o.updateAppearance;

@Database(entities = {AppCompatSpinner.class, getInternalPopup.class, setPrompt.class, getDropDownVerticalOffset.class, setDropDownHorizontalOffset.class, performClick.class, getPopupContext.class}, version = 11)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@TypeConverters({updateAppearance.class, getFirstBaselineToTopHeight.class})
public abstract class WorkDatabase extends RoomDatabase {
    private static final long setMax = TimeUnit.DAYS.toMillis(1);

    @NonNull
    public abstract getDropDownHorizontalOffset equals();

    @NonNull
    public abstract compatMeasureContentWidth getMax();

    @NonNull
    public abstract setPopupBackgroundResource getMin();

    @NonNull
    public abstract setDropDownVerticalOffset isInside();

    @NonNull
    public abstract AppCompatRatingBar length();

    @NonNull
    public abstract setFirstBaselineToTopHeight setMin();

    @NonNull
    public abstract setDropDownWidth toIntRange();

    @NonNull
    public static WorkDatabase getMin(@NonNull final Context context, @NonNull Executor executor, boolean z) {
        RoomDatabase.setMax<WorkDatabase> setmax;
        Class<WorkDatabase> cls = WorkDatabase.class;
        if (z) {
            setmax = new RoomDatabase.setMax<>(context, cls, (String) null);
            setmax.getMin = true;
        } else {
            setmax = setPrimaryBackground.setMin(context, cls, setSupportCompoundDrawablesTintMode.getMax());
            setmax.setMin = new SupportSQLiteOpenHelper.length() {
                @NonNull
                public final SupportSQLiteOpenHelper create(@NonNull SupportSQLiteOpenHelper.Configuration configuration) {
                    SupportSQLiteOpenHelper.Configuration.getMax min = SupportSQLiteOpenHelper.Configuration.setMin(context);
                    min.length = configuration.getMin;
                    min.getMax = configuration.length;
                    min.getMin = true;
                    return new isInOverlayMode().create(min.setMax());
                }
            };
        }
        setmax.setMax = executor;
        AnonymousClass1 r6 = new RoomDatabase.length() {
            public final void length(@NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
                super.length(supportSQLiteDatabase);
                supportSQLiteDatabase.beginTransaction();
                try {
                    supportSQLiteDatabase.execSQL(WorkDatabase.setMax());
                    supportSQLiteDatabase.setTransactionSuccessful();
                } finally {
                    supportSQLiteDatabase.endTransaction();
                }
            }
        };
        if (setmax.getMax == null) {
            setmax.getMax = new ArrayList<>();
        }
        setmax.getMax.add(r6);
        RoomDatabase.setMax<WorkDatabase> max = setmax.setMax(getSupportCompoundDrawablesTintMode.getMax).setMax(new getSupportCompoundDrawablesTintMode.getMin(context, 2, 3)).setMax(getSupportCompoundDrawablesTintMode.setMax).setMax(getSupportCompoundDrawablesTintMode.length).setMax(new getSupportCompoundDrawablesTintMode.getMin(context, 5, 6)).setMax(getSupportCompoundDrawablesTintMode.getMin).setMax(getSupportCompoundDrawablesTintMode.setMin).setMax(getSupportCompoundDrawablesTintMode.isInside).setMax(new getSupportCompoundDrawablesTintMode.length(context)).setMax(new getSupportCompoundDrawablesTintMode.getMin(context, 10, 11));
        max.IsOverlapping = false;
        max.toIntRange = true;
        return max.getMin();
    }

    @NonNull
    static String setMax() {
        StringBuilder sb = new StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ");
        sb.append(System.currentTimeMillis() - setMax);
        sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
        return sb.toString();
    }
}
