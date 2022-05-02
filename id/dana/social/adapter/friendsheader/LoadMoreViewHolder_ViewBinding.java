package id.dana.social.adapter.friendsheader;

import android.view.View;
import android.widget.Button;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public final class LoadMoreViewHolder_ViewBinding implements Unbinder {
    private LoadMoreViewHolder getMin;

    @UiThread
    public LoadMoreViewHolder_ViewBinding(LoadMoreViewHolder loadMoreViewHolder, View view) {
        this.getMin = loadMoreViewHolder;
        loadMoreViewHolder.btnLoadMore = (Button) drawDividersHorizontal.setMin(view, R.id.f36432131362093, "field 'btnLoadMore'", Button.class);
    }

    public final void setMax() {
        LoadMoreViewHolder loadMoreViewHolder = this.getMin;
        if (loadMoreViewHolder != null) {
            this.getMin = null;
            loadMoreViewHolder.btnLoadMore = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
