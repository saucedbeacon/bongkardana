package o;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;

public final class onPopulateEventForVirtualView extends getVisibleVirtualViews {
    private final Configuration length;
    @DrawableRes
    private final int setMin;

    public onPopulateEventForVirtualView(@DrawableRes int i, Configuration configuration, Drawable drawable) {
        super(drawable);
        this.setMin = i;
        this.length = configuration;
    }

    public final boolean getMin(getVirtualViewAt getvirtualviewat) {
        if (this == getvirtualviewat) {
            return true;
        }
        if (!(getvirtualviewat instanceof onPopulateEventForVirtualView)) {
            return false;
        }
        onPopulateEventForVirtualView onpopulateeventforvirtualview = (onPopulateEventForVirtualView) getvirtualviewat;
        return this.setMin == onpopulateeventforvirtualview.setMin && this.length.equals(onpopulateeventforvirtualview.length);
    }
}
