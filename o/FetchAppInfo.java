package o;

import android.content.DialogInterface;
import android.view.View;
import id.dana.nearbyme.NearbyMeView;

public final class FetchAppInfo implements DialogInterface.OnDismissListener {
    private final NearbyMeView length;

    public final class CategoryInfo implements View.OnClickListener {
        private final int getMax;
        private final NearbyMeView setMin;

        public CategoryInfo(NearbyMeView nearbyMeView, int i) {
            this.setMin = nearbyMeView;
            this.getMax = i;
        }

        public final void onClick(View view) {
            NearbyMeView.length(this.setMin, this.getMax);
        }
    }

    public FetchAppInfo(NearbyMeView nearbyMeView) {
        this.length = nearbyMeView;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.length.setMin = null;
    }
}
