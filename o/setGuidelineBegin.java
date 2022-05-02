package o;

import android.content.Context;
import androidx.annotation.NonNull;
import o.ConstraintLayout;
import o.Constraints;

public final class setGuidelineBegin implements Guideline {
    @NonNull
    public final ConstraintLayout.LayoutParams length(@NonNull Context context, @NonNull ConstraintLayout.LayoutParams.length length) {
        if (IntRange.length(context, "android.permission.ACCESS_NETWORK_STATE") == 0) {
            return new Constraints.LayoutParams(context, length);
        }
        return new setEmptyVisibility();
    }
}
