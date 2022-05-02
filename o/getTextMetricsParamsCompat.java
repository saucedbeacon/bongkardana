package o;

import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.impl.WorkDatabase;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class getTextMetricsParamsCompat {
    public final WorkDatabase setMax;

    public getTextMetricsParamsCompat(@NonNull WorkDatabase workDatabase) {
        this.setMax = workDatabase;
    }

    public final boolean length() {
        Long min = this.setMax.isInside().setMin("reschedule_needed");
        return min != null && min.longValue() == 1;
    }
}
