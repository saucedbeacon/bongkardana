package o;

import android.view.View;
import id.dana.showcase.view.ShowcaseView;
import o.PhotoView;

public final class setLogProductId implements View.OnClickListener {
    private final PhotoView.DragListener getMax;
    private final ShowcaseView getMin;

    public setLogProductId(ShowcaseView showcaseView, PhotoView.DragListener dragListener) {
        this.getMin = showcaseView;
        this.getMax = dragListener;
    }

    public final void onClick(View view) {
        ShowcaseView.getMax(this.getMin, this.getMax);
    }
}
