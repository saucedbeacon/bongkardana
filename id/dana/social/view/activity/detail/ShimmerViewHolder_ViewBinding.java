package id.dana.social.view.activity.detail;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public final class ShimmerViewHolder_ViewBinding implements Unbinder {
    private ShimmerViewHolder setMin;

    @UiThread
    public ShimmerViewHolder_ViewBinding(ShimmerViewHolder shimmerViewHolder, View view) {
        this.setMin = shimmerViewHolder;
        shimmerViewHolder.viewShimmer = drawDividersHorizontal.getMax(view, R.id.f73182131365953, "field 'viewShimmer'");
    }

    public final void setMax() {
        ShimmerViewHolder shimmerViewHolder = this.setMin;
        if (shimmerViewHolder != null) {
            this.setMin = null;
            shimmerViewHolder.viewShimmer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
