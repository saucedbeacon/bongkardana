package o;

import android.view.View;
import id.dana.base.BaseWithToolbarFragment;

public final class onConflict implements View.OnClickListener {
    private final BaseWithToolbarFragment getMax;

    public onConflict(BaseWithToolbarFragment baseWithToolbarFragment) {
        this.getMax = baseWithToolbarFragment;
    }

    public final void onClick(View view) {
        this.getMax.onClickLeftMenuButton(view);
    }
}
