package o;

import android.view.View;
import id.dana.nearbyme.NewNearbyMeView;

public final class setQueryStartIndex implements View.OnClickListener {
    private final NewNearbyMeView length;

    public setQueryStartIndex(NewNearbyMeView newNearbyMeView) {
        this.length = newNearbyMeView;
    }

    public final void onClick(View view) {
        NewNearbyMeView.getMax(this.length);
    }
}
