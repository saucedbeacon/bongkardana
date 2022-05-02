package o;

import android.view.View;
import id.dana.richview.CircleImageSelectionView;

public final class access$3300 implements View.OnClickListener {
    private final CircleImageSelectionView setMax;

    public access$3300(CircleImageSelectionView circleImageSelectionView) {
        this.setMax = circleImageSelectionView;
    }

    public final void onClick(View view) {
        CircleImageSelectionView.setMax(this.setMax);
    }
}
