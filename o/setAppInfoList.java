package o;

import android.view.View;
import id.dana.nearbyme.NewNearbyMeView;

public final class setAppInfoList implements View.OnClickListener {
    private final NewNearbyMeView setMax;

    public setAppInfoList(NewNearbyMeView newNearbyMeView) {
        this.setMax = newNearbyMeView;
    }

    public final void onClick(View view) {
        this.setMax.getMax();
    }
}
