package id.dana.social.adapter;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.social.view.FeedsView;
import o.drawDividersHorizontal;

public class FeedViewHolder_ViewBinding implements Unbinder {
    private FeedViewHolder setMin;

    @UiThread
    public FeedViewHolder_ViewBinding(FeedViewHolder feedViewHolder, View view) {
        this.setMin = feedViewHolder;
        feedViewHolder.viewFeed = (FeedsView) drawDividersHorizontal.setMin(view, R.id.f72332131365868, "field 'viewFeed'", FeedsView.class);
    }

    @CallSuper
    public final void setMax() {
        FeedViewHolder feedViewHolder = this.setMin;
        if (feedViewHolder != null) {
            this.setMin = null;
            feedViewHolder.viewFeed = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
