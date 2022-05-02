package id.dana.sendmoney.recipient.recent.viewholder;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.sendmoney.RecentDetailView;
import o.drawDividersHorizontal;

public class LinkViewHolder_ViewBinding implements Unbinder {
    private LinkViewHolder length;

    @UiThread
    public LinkViewHolder_ViewBinding(LinkViewHolder linkViewHolder, View view) {
        this.length = linkViewHolder;
        linkViewHolder.viewRecentDetail = (RecentDetailView) drawDividersHorizontal.setMin(view, R.id.f73012131365936, "field 'viewRecentDetail'", RecentDetailView.class);
    }

    @CallSuper
    public final void setMax() {
        LinkViewHolder linkViewHolder = this.length;
        if (linkViewHolder != null) {
            this.length = null;
            linkViewHolder.viewRecentDetail = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
