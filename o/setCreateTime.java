package o;

import android.view.View;
import id.dana.danah5.DanaH5;
import id.dana.nearbyme.NearbyMeView;

public final class setCreateTime implements View.OnClickListener {
    private final NearbyMeView setMin;

    public setCreateTime(NearbyMeView nearbyMeView) {
        this.setMin = nearbyMeView;
    }

    public final void onClick(View view) {
        DanaH5.startContainerFullUrl(isShowMenu.setMin("/m/standalone/tnc"));
    }
}
