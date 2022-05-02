package o;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.work.impl.WorkDatabase;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class consumeTextFutureAndSetBlocking {
    private final WorkDatabase getMin;

    public consumeTextFutureAndSetBlocking(@NonNull WorkDatabase workDatabase) {
        this.getMin = workDatabase;
    }

    public final int getMin(int i, int i2) {
        synchronized (consumeTextFutureAndSetBlocking.class) {
            int length = length("next_job_scheduler_id");
            if (length >= i) {
                if (length <= i2) {
                    i = length;
                }
            }
            this.getMin.isInside().getMin(new getPopupContext("next_job_scheduler_id", (long) (i + 1)));
        }
        return i;
    }

    public final int length() {
        int length;
        synchronized (consumeTextFutureAndSetBlocking.class) {
            length = length("next_alarm_manager_id");
        }
        return length;
    }

    private int length(String str) {
        int i;
        this.getMin.beginTransaction();
        try {
            Long min = this.getMin.isInside().setMin(str);
            int i2 = 0;
            if (min != null) {
                i = min.intValue();
            } else {
                i = 0;
            }
            if (i != Integer.MAX_VALUE) {
                i2 = i + 1;
            }
            this.getMin.isInside().getMin(new getPopupContext(str, (long) i2));
            this.getMin.setTransactionSuccessful();
            return i;
        } finally {
            this.getMin.endTransaction();
        }
    }

    public static void setMax(@NonNull Context context, @NonNull SupportSQLiteDatabase supportSQLiteDatabase) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i2 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            supportSQLiteDatabase.beginTransaction();
            try {
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i)});
                supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i2)});
                sharedPreferences.edit().clear().apply();
                supportSQLiteDatabase.setTransactionSuccessful();
            } finally {
                supportSQLiteDatabase.endTransaction();
            }
        }
    }
}
