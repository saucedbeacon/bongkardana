package id.dana.feeds.views;

import android.view.View;
import android.widget.ImageView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class NewsFullViewHolder_ViewBinding implements Unbinder {
    private NewsFullViewHolder getMin;

    @UiThread
    public NewsFullViewHolder_ViewBinding(NewsFullViewHolder newsFullViewHolder, View view) {
        this.getMin = newsFullViewHolder;
        newsFullViewHolder.ivFullNewsFeed = (ImageView) drawDividersHorizontal.setMin(view, R.id.f49052131363460, "field 'ivFullNewsFeed'", ImageView.class);
    }

    @CallSuper
    public final void setMax() {
        NewsFullViewHolder newsFullViewHolder = this.getMin;
        if (newsFullViewHolder != null) {
            this.getMin = null;
            newsFullViewHolder.ivFullNewsFeed = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
