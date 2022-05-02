package id.dana.feeds.views;

import android.view.View;
import android.widget.Button;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class FeedsFooterViewHolderFeeds_ViewBinding implements Unbinder {
    private FeedsFooterViewHolderFeeds length;

    @UiThread
    public FeedsFooterViewHolderFeeds_ViewBinding(FeedsFooterViewHolderFeeds feedsFooterViewHolderFeeds, View view) {
        this.length = feedsFooterViewHolderFeeds;
        feedsFooterViewHolderFeeds.btnFeedFooter = (Button) drawDividersHorizontal.setMin(view, R.id.f36292131362079, "field 'btnFeedFooter'", Button.class);
    }

    @CallSuper
    public final void setMax() {
        FeedsFooterViewHolderFeeds feedsFooterViewHolderFeeds = this.length;
        if (feedsFooterViewHolderFeeds != null) {
            this.length = null;
            feedsFooterViewHolderFeeds.btnFeedFooter = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
