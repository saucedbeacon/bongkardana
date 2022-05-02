package o;

import android.os.Build;
import androidx.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public interface onSupportNavigateUp {
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final boolean getMax = (Build.VERSION.SDK_INT >= 27);
}
