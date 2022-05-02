package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class setTextFuture implements Runnable {
    private static final String setMax = setSupportBackgroundTintList.length("StopWorkRunnable");
    private final String getMax;
    private final setSupportCompoundDrawablesTintList length;
    private final boolean setMin;

    public setTextFuture(@NonNull setSupportCompoundDrawablesTintList setsupportcompounddrawablestintlist, @NonNull String str, boolean z) {
        this.length = setsupportcompounddrawablestintlist;
        this.getMax = str;
        this.setMin = z;
    }

    public final void run() {
        boolean z;
        WorkDatabase workDatabase = this.length.setMax;
        getAutoSizeStepGranularity getautosizestepgranularity = this.length.toIntRange;
        compatMeasureContentWidth max = workDatabase.getMax();
        workDatabase.beginTransaction();
        try {
            boolean floatRange = getautosizestepgranularity.toFloatRange(this.getMax);
            if (this.setMin) {
                z = this.length.toIntRange.getMin(this.getMax);
            } else {
                if (!floatRange && max.toFloatRange(this.getMax) == WorkInfo.State.RUNNING) {
                    max.setMin(WorkInfo.State.ENQUEUED, this.getMax);
                }
                z = this.length.toIntRange.setMax(this.getMax);
            }
            setSupportBackgroundTintList.getMax();
            Boolean.valueOf(z);
            workDatabase.setTransactionSuccessful();
        } finally {
            workDatabase.endTransaction();
        }
    }
}
