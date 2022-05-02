package o;

import android.graphics.drawable.ColorDrawable;
import androidx.annotation.ColorInt;

public final class requestKeyboardFocusForVirtualView extends getVisibleVirtualViews {
    @ColorInt
    private final int getMin;

    public requestKeyboardFocusForVirtualView(@ColorInt int i) {
        super(new ColorDrawable(i));
        this.getMin = i;
    }

    public final boolean getMin(getVirtualViewAt getvirtualviewat) {
        if (this == getvirtualviewat) {
            return true;
        }
        return (getvirtualviewat instanceof requestKeyboardFocusForVirtualView) && this.getMin == ((requestKeyboardFocusForVirtualView) getvirtualviewat).getMin;
    }
}
