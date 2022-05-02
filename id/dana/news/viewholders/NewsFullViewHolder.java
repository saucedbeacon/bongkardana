package id.dana.news.viewholders;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindView;
import id.dana.R;
import o.BLEBridgeExtension;
import o.Ignore;
import o.Popup;
import o.onProcess;
import o.stopHCE;

public class NewsFullViewHolder extends BLEBridgeExtension.AnonymousClass12 {
    @BindView(2131363460)
    ImageView ivFullNewsFeed;

    public final /* synthetic */ void setMax(Object obj) {
        setMax((onProcess) obj);
    }

    public NewsFullViewHolder(Context context, ViewGroup viewGroup) {
        new Ignore<onProcess>(context, R.layout.item_full_news_feed, viewGroup) {
            /* renamed from: getMin */
            public void setMax(onProcess onprocess) {
            }
        };
    }

    public final void getMin(onProcess onprocess) {
        if (onprocess != null && !TextUtils.isEmpty(onprocess.equals)) {
            Popup.setMin(onprocess.equals, this.ivFullNewsFeed, new stopHCE(this));
        }
    }
}
