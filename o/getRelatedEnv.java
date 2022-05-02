package o;

import android.content.DialogInterface;
import id.dana.nearbyme.NewNearbyMeView;

public final class getRelatedEnv implements DialogInterface.OnDismissListener {
    private final NewNearbyMeView length;

    public getRelatedEnv(NewNearbyMeView newNearbyMeView) {
        this.length = newNearbyMeView;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.length.hashCode = null;
    }
}
