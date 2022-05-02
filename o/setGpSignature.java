package o;

import android.view.View;
import id.dana.showcase.view.PagerContentView;

public final class setGpSignature implements View.OnClickListener {
    private final PagerContentView setMin;

    public setGpSignature(PagerContentView pagerContentView) {
        this.setMin = pagerContentView;
    }

    public final void onClick(View view) {
        PagerContentView.setMin(this.setMin);
    }
}
