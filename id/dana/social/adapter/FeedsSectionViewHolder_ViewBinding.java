package id.dana.social.adapter;

import android.view.View;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.social.view.FeedsSectionView;
import o.drawDividersHorizontal;

public final class FeedsSectionViewHolder_ViewBinding implements Unbinder {
    private FeedsSectionViewHolder getMax;

    @UiThread
    public FeedsSectionViewHolder_ViewBinding(FeedsSectionViewHolder feedsSectionViewHolder, View view) {
        this.getMax = feedsSectionViewHolder;
        feedsSectionViewHolder.viewFeedsSection = (FeedsSectionView) drawDividersHorizontal.setMin(view, R.id.f72382131365873, "field 'viewFeedsSection'", FeedsSectionView.class);
    }

    public final void setMax() {
        FeedsSectionViewHolder feedsSectionViewHolder = this.getMax;
        if (feedsSectionViewHolder != null) {
            this.getMax = null;
            feedsSectionViewHolder.viewFeedsSection = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
