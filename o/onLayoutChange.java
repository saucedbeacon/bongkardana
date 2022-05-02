package o;

import id.dana.R;
import id.dana.home.view.ZoomDialog;

public final class onLayoutChange implements RedDotManager {
    private final ZoomDialog setMax;

    public onLayoutChange(ZoomDialog zoomDialog) {
        this.setMax = zoomDialog;
    }

    public final void accept(Object obj) {
        this.setMax.showWarningDialog(this.setMax.getString(R.string.screenshot_warning));
    }
}
