package o;

import android.view.View;
import o.FitWindowsLinearLayout;

final class getDividerDrawable implements FitWindowsLinearLayout.getMax {
    public static final getDividerDrawable getMin = new getDividerDrawable();

    public final void length(Object obj) {
        ((View) obj).setVisibility(0);
    }
}
