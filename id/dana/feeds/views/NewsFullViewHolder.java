package id.dana.feeds.views;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import butterknife.BindView;
import com.bumptech.glide.Glide;
import id.dana.R;
import id.dana.feeds.views.NewsFullViewHolder;
import o.BLEBridgeExtension;
import o.Ignore;
import o.Popup;
import o.onProcess;

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
            Popup.setMin(onprocess.equals, this.ivFullNewsFeed, new Popup.getMax(this) {
                private final NewsFullViewHolder getMin;

                {
                    this.getMin = r1;
                }

                public final void setMin(String str, ImageView imageView) {
                    ((updateCornerMarking) Glide.getMax(this.getMin.length)).setMax(str).setMax((int) R.drawable.square_rounded_skeleton).setMax(evaluate.setMin).setMin((int) R.drawable.square_rounded_skeleton).length(imageView);
                }
            });
        }
    }
}
