package o;

import android.view.View;
import id.dana.danah5.DanaH5;
import id.dana.nearbyme.NewNearbyMeView;

public final class setQuerySize implements View.OnClickListener {
    private final NewNearbyMeView setMin;

    public setQuerySize(NewNearbyMeView newNearbyMeView) {
        this.setMin = newNearbyMeView;
    }

    public final void onClick(View view) {
        DanaH5.startContainerFullUrl(isShowMenu.setMin("/m/standalone/tnc"));
    }
}
