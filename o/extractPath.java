package o;

import android.view.View;

final class extractPath implements View.OnClickListener {
    private final PathUtils setMax;

    public extractPath(PathUtils pathUtils) {
        this.setMax = pathUtils;
    }

    public final void onClick(View view) {
        PathUtils.setMax(this.setMax);
    }
}
