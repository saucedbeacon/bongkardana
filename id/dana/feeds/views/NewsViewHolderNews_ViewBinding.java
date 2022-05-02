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

public class NewsViewHolderNews_ViewBinding implements Unbinder {
    private NewsViewHolderNews length;

    @UiThread
    public NewsViewHolderNews_ViewBinding(NewsViewHolderNews newsViewHolderNews, View view) {
        this.length = newsViewHolderNews;
        newsViewHolderNews.content = (TextView) drawDividersHorizontal.setMin(view, R.id.f55872131364150, "field 'content'", TextView.class);
        newsViewHolderNews.feedWrapper = (RelativeLayout) drawDividersHorizontal.setMin(view, R.id.f55912131364154, "field 'feedWrapper'", RelativeLayout.class);
        newsViewHolderNews.iconFeeds = (ImageView) drawDividersHorizontal.setMin(view, R.id.f55882131364151, "field 'iconFeeds'", ImageView.class);
        newsViewHolderNews.title = (TextView) drawDividersHorizontal.setMin(view, R.id.f55902131364153, "field 'title'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        NewsViewHolderNews newsViewHolderNews = this.length;
        if (newsViewHolderNews != null) {
            this.length = null;
            newsViewHolderNews.content = null;
            newsViewHolderNews.feedWrapper = null;
            newsViewHolderNews.iconFeeds = null;
            newsViewHolderNews.title = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
