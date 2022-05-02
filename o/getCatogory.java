package o;

import android.content.DialogInterface;
import id.dana.nearbyme.NearbyMeView;

public final class getCatogory implements DialogInterface.OnDismissListener {
    private final NearbyMeView getMin;

    public getCatogory(NearbyMeView nearbyMeView) {
        this.getMin = nearbyMeView;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.getMin.toDoubleRange = null;
    }
}
