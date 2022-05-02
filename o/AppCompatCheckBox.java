package o;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.WorkDatabase;
import com.google.android.exoplayer2.C;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
final class AppCompatCheckBox {
    private static final String setMax = setSupportBackgroundTintList.length("Alarms");

    private static void getMin(@NonNull Context context, @NonNull String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, setSupportButtonTintList.getMin(context, str), C.ENCODING_PCM_A_LAW);
        if (service != null && alarmManager != null) {
            setSupportBackgroundTintList.getMax();
            Integer.valueOf(i);
            alarmManager.cancel(service);
        }
    }

    private static void setMax(@NonNull Context context, @NonNull String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, setSupportButtonTintList.getMin(context, str), 134217728);
        if (alarmManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            alarmManager.setExact(0, j, service);
        } else {
            alarmManager.set(0, j, service);
        }
    }

    public static void getMax(@NonNull Context context, @NonNull setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist, @NonNull String str, long j) {
        WorkDatabase workDatabase = setsupportcompounddrawablestintlist.setMax;
        setPopupBackgroundResource min = workDatabase.getMin();
        getDropDownVerticalOffset min2 = min.setMin(str);
        if (min2 != null) {
            getMin(context, str, min2.getMax);
            setMax(context, str, min2.getMax, j);
            return;
        }
        int length = new consumeTextFutureAndSetBlocking(workDatabase).length();
        min.getMax(new getDropDownVerticalOffset(str, length));
        setMax(context, str, length, j);
    }

    public static void getMax(@NonNull Context context, @NonNull setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist, @NonNull String str) {
        setPopupBackgroundResource min = setsupportcompounddrawablestintlist.setMax.getMin();
        getDropDownVerticalOffset min2 = min.setMin(str);
        if (min2 != null) {
            getMin(context, str, min2.getMax);
            setSupportBackgroundTintList.getMax();
            min.setMax(str);
        }
    }
}
