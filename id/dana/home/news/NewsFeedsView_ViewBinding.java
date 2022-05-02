package id.dana.home.news;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class NewsFeedsView_ViewBinding implements Unbinder {
    private NewsFeedsView getMax;

    @UiThread
    public NewsFeedsView_ViewBinding(NewsFeedsView newsFeedsView, View view) {
        this.getMax = newsFeedsView;
        newsFeedsView.newsList = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f55892131364152, "field 'newsList'", RecyclerView.class);
    }

    @CallSuper
    public final void setMax() {
        NewsFeedsView newsFeedsView = this.getMax;
        if (newsFeedsView != null) {
            this.getMax = null;
            newsFeedsView.newsList = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
