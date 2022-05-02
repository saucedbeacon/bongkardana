package o;

import android.content.DialogInterface;
import id.dana.nearbyme.NewNearbyMeView;

public final class getQueryStartIndex implements DialogInterface.OnDismissListener {
    private final NewNearbyMeView getMin;

    public getQueryStartIndex(NewNearbyMeView newNearbyMeView) {
        this.getMin = newNearbyMeView;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.getMin.length = null;
    }
}
