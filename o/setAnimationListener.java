package o;

import android.widget.CompoundButton;
import id.dana.component.cellcomponent.DanaCellRightView;

public final class setAnimationListener implements CompoundButton.OnCheckedChangeListener {
    private final DanaCellRightView setMax;

    public setAnimationListener(DanaCellRightView danaCellRightView) {
        this.setMax = danaCellRightView;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        DanaCellRightView.length(this.setMax, z);
    }
}
