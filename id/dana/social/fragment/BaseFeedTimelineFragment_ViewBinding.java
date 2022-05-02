package id.dana.social.fragment;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class BaseFeedTimelineFragment_ViewBinding implements Unbinder {
    private View getMax;
    private BaseFeedTimelineFragment length;

    @UiThread
    public BaseFeedTimelineFragment_ViewBinding(final BaseFeedTimelineFragment baseFeedTimelineFragment, View view) {
        this.length = baseFeedTimelineFragment;
        baseFeedTimelineFragment.rvFeeds = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59222131364507, "field 'rvFeeds'", RecyclerView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f41522131362639, "method 'backToTop'");
        this.getMax = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                baseFeedTimelineFragment.backToTop();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        BaseFeedTimelineFragment baseFeedTimelineFragment = this.length;
        if (baseFeedTimelineFragment != null) {
            this.length = null;
            baseFeedTimelineFragment.rvFeeds = null;
            this.getMax.setOnClickListener((View.OnClickListener) null);
            this.getMax = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
