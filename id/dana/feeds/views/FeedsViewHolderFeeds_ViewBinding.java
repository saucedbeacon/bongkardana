package id.dana.feeds.views;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class FeedsViewHolderFeeds_ViewBinding implements Unbinder {
    private FeedsViewHolderFeeds setMin;

    @UiThread
    public FeedsViewHolderFeeds_ViewBinding(FeedsViewHolderFeeds feedsViewHolderFeeds, View view) {
        this.setMin = feedsViewHolderFeeds;
        feedsViewHolderFeeds.content = (TextView) drawDividersHorizontal.setMin(view, R.id.f43852131362905, "field 'content'", TextView.class);
        feedsViewHolderFeeds.delete = (TextView) drawDividersHorizontal.setMin(view, R.id.f43862131362906, "field 'delete'", TextView.class);
        feedsViewHolderFeeds.feedWrapper = (RelativeLayout) drawDividersHorizontal.setMin(view, R.id.f43912131362911, "field 'feedWrapper'", RelativeLayout.class);
        feedsViewHolderFeeds.iconFeeds = (ImageView) drawDividersHorizontal.setMin(view, R.id.f43872131362907, "field 'iconFeeds'", ImageView.class);
        feedsViewHolderFeeds.time = (TextView) drawDividersHorizontal.setMin(view, R.id.f43892131362909, "field 'time'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        FeedsViewHolderFeeds feedsViewHolderFeeds = this.setMin;
        if (feedsViewHolderFeeds != null) {
            this.setMin = null;
            feedsViewHolderFeeds.content = null;
            feedsViewHolderFeeds.delete = null;
            feedsViewHolderFeeds.feedWrapper = null;
            feedsViewHolderFeeds.iconFeeds = null;
            feedsViewHolderFeeds.time = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
