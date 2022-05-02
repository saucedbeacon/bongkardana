package id.dana.social.adapter;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public final class SocialFeedShimmerViewHolder_ViewBinding implements Unbinder {
    private SocialFeedShimmerViewHolder getMax;

    @UiThread
    public SocialFeedShimmerViewHolder_ViewBinding(SocialFeedShimmerViewHolder socialFeedShimmerViewHolder, View view) {
        this.getMax = socialFeedShimmerViewHolder;
        socialFeedShimmerViewHolder.viewShimmer = drawDividersHorizontal.getMax(view, R.id.f73182131365953, "field 'viewShimmer'");
    }

    public final void setMax() {
        SocialFeedShimmerViewHolder socialFeedShimmerViewHolder = this.getMax;
        if (socialFeedShimmerViewHolder != null) {
            this.getMax = null;
            socialFeedShimmerViewHolder.viewShimmer = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
