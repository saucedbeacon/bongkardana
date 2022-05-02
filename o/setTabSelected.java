package o;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.annotation.ColorInt;

public final class setTabSelected extends PorterDuffColorFilter {
    public setTabSelected(@ColorInt int i) {
        super(i, PorterDuff.Mode.SRC_ATOP);
    }
}
