package o;

import android.content.Context;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class getAutoSizeMinTextSize {
    private static final String setMin = setSupportBackgroundTintList.length("Schedulers");

    /* JADX INFO: finally extract failed */
    public static void setMax(@NonNull onAttachedToWindow onattachedtowindow, @NonNull WorkDatabase workDatabase, List<getAutoSizeMaxTextSize> list) {
        int i;
        if (list != null && list.size() != 0) {
            compatMeasureContentWidth max = workDatabase.getMax();
            workDatabase.beginTransaction();
            try {
                if (Build.VERSION.SDK_INT == 23) {
                    i = onattachedtowindow.FastBitmap$CoordinateSystem / 2;
                } else {
                    i = onattachedtowindow.FastBitmap$CoordinateSystem;
                }
                List<getInternalPopup> min = max.getMin(i);
                List<getInternalPopup> max2 = max.setMax();
                if (min.size() > 0) {
                    long currentTimeMillis = System.currentTimeMillis();
                    for (getInternalPopup getinternalpopup : min) {
                        max.getMin(getinternalpopup.getMax, currentTimeMillis);
                    }
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
                if (min.size() > 0) {
                    getInternalPopup[] getinternalpopupArr = (getInternalPopup[]) min.toArray(new getInternalPopup[min.size()]);
                    for (getAutoSizeMaxTextSize next : list) {
                        if (next.getMax()) {
                            next.getMin(getinternalpopupArr);
                        }
                    }
                }
                if (max2.size() > 0) {
                    getInternalPopup[] getinternalpopupArr2 = (getInternalPopup[]) max2.toArray(new getInternalPopup[max2.size()]);
                    for (getAutoSizeMaxTextSize next2 : list) {
                        if (!next2.getMax()) {
                            next2.getMin(getinternalpopupArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.endTransaction();
                throw th;
            }
        }
    }

    @NonNull
    static getAutoSizeMaxTextSize setMax(@NonNull Context context, @NonNull setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist) {
        if (Build.VERSION.SDK_INT >= 23) {
            setCheckMarkDrawable setcheckmarkdrawable = new setCheckMarkDrawable(context, setsupportcompounddrawablestintlist);
            setTextMetricsParamsCompat.setMax(context, SystemJobService.class, true);
            setSupportBackgroundTintList.getMax();
            return setcheckmarkdrawable;
        }
        getAutoSizeMaxTextSize min = setMin(context);
        if (min != null) {
            return min;
        }
        AppCompatCheckedTextView appCompatCheckedTextView = new AppCompatCheckedTextView(context);
        setTextMetricsParamsCompat.setMax(context, SystemAlarmService.class, true);
        setSupportBackgroundTintList.getMax();
        return appCompatCheckedTextView;
    }

    @Nullable
    private static getAutoSizeMaxTextSize setMin(@NonNull Context context) {
        try {
            getAutoSizeMaxTextSize getautosizemaxtextsize = (getAutoSizeMaxTextSize) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            setSupportBackgroundTintList.getMax();
            return getautosizemaxtextsize;
        } catch (Throwable unused) {
            setSupportBackgroundTintList.getMax();
            return null;
        }
    }
}
