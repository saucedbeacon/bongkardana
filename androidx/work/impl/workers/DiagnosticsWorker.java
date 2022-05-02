package androidx.work.impl.workers;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;
import o.compatMeasureContentWidth;
import o.getDropDownVerticalOffset;
import o.getInternalPopup;
import o.setDropDownWidth;
import o.setFirstBaselineToTopHeight;
import o.setPopupBackgroundResource;
import o.setSupportBackgroundTintList;
import o.setSupportCompoundDrawablesTintList;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class DiagnosticsWorker extends Worker {
    private static final String length = setSupportBackgroundTintList.length("DiagnosticsWrkr");

    public DiagnosticsWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @NonNull
    public ListenableWorker.setMax doWork() {
        WorkDatabase workDatabase = setSupportCompoundDrawablesTintList.length(getApplicationContext()).setMax;
        compatMeasureContentWidth max = workDatabase.getMax();
        setDropDownWidth intRange = workDatabase.toIntRange();
        setFirstBaselineToTopHeight min = workDatabase.setMin();
        setPopupBackgroundResource min2 = workDatabase.getMin();
        List<getInternalPopup> length2 = max.length(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1));
        List<getInternalPopup> min3 = max.getMin();
        List<getInternalPopup> max2 = max.setMax();
        if (!length2.isEmpty()) {
            setSupportBackgroundTintList.getMax();
            setSupportBackgroundTintList.getMax();
            setMax(intRange, min, min2, length2);
        }
        if (!min3.isEmpty()) {
            setSupportBackgroundTintList.getMax();
            setSupportBackgroundTintList.getMax();
            setMax(intRange, min, min2, min3);
        }
        if (!max2.isEmpty()) {
            setSupportBackgroundTintList.getMax();
            setSupportBackgroundTintList.getMax();
            setMax(intRange, min, min2, max2);
        }
        return ListenableWorker.setMax.getMin();
    }

    @NonNull
    private static String setMax(@NonNull setDropDownWidth setdropdownwidth, @NonNull setFirstBaselineToTopHeight setfirstbaselinetotopheight, @NonNull setPopupBackgroundResource setpopupbackgroundresource, @NonNull List<getInternalPopup> list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", new Object[]{Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"}));
        for (getInternalPopup next : list) {
            Integer num = null;
            getDropDownVerticalOffset min = setpopupbackgroundresource.setMin(next.getMax);
            if (min != null) {
                num = Integer.valueOf(min.getMax);
            }
            sb.append(getMin(next, TextUtils.join(",", setdropdownwidth.setMax(next.getMax)), num, TextUtils.join(",", setfirstbaselinetotopheight.setMax(next.getMax))));
        }
        return sb.toString();
    }

    @NonNull
    private static String getMin(@NonNull getInternalPopup getinternalpopup, @Nullable String str, @Nullable Integer num, @NonNull String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", new Object[]{getinternalpopup.getMax, getinternalpopup.setMax, num, getinternalpopup.getMin.name(), str, str2});
    }
}
