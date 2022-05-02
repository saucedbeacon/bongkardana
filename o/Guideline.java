package o;

import android.content.Context;
import androidx.annotation.NonNull;
import o.ConstraintLayout;

public interface Guideline {
    @NonNull
    ConstraintLayout.LayoutParams length(@NonNull Context context, @NonNull ConstraintLayout.LayoutParams.length length);
}
