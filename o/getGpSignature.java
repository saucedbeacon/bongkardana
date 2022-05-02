package o;

import android.view.View;
import id.dana.showcase.view.PagerContentView;

public final class getGpSignature implements View.OnClickListener {
    private final PagerContentView getMax;

    public getGpSignature(PagerContentView pagerContentView) {
        this.getMax = pagerContentView;
    }

    public final void onClick(View view) {
        PagerContentView.getMin(this.getMax);
    }
}
