package o;

import android.view.View;
import o.CameraUtils;

final class isTablet implements View.OnClickListener {
    public static final isTablet setMax = new isTablet();

    public final void onClick(View view) {
        CameraUtils.CameraSizeComparator.setMax();
    }
}
