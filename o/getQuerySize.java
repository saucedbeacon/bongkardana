package o;

import android.view.View;
import id.dana.nearbyme.NewNearbyMeView;

public final class getQuerySize implements View.OnClickListener {
    private final NewNearbyMeView getMin;

    public getQuerySize(NewNearbyMeView newNearbyMeView) {
        this.getMin = newNearbyMeView;
    }

    public final void onClick(View view) {
        NewNearbyMeView.length(this.getMin);
    }
}
