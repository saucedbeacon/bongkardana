package id.dana.feeds.views;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import butterknife.BindView;
import id.dana.R;
import id.dana.feeds.views.FeedsFooterViewHolderFeeds;
import o.BLEBridgeExtension;
import o.Ignore;
import o.onProcess;

public class FeedsFooterViewHolderFeeds extends BLEBridgeExtension.AnonymousClass12 {
    @BindView(2131362079)
    Button btnFeedFooter;
    public setMax setMax;

    public interface setMax {
        void length();
    }

    public FeedsFooterViewHolderFeeds(Context context, ViewGroup viewGroup) {
        new Ignore<onProcess>(context, R.layout.cardview_feed_footer, viewGroup) {
            /* renamed from: getMin */
            public void setMax(onProcess onprocess) {
            }
        };
    }

    public final void getMin(onProcess onprocess) {
        this.btnFeedFooter.setOnClickListener(new View.OnClickListener(this) {
            private final FeedsFooterViewHolderFeeds setMax;

            {
                this.setMax = r1;
            }

            public final void onClick(View view) {
                this.setMax.setMax.length();
            }
        });
    }

    public final /* synthetic */ void setMax(Object obj) {
        this.btnFeedFooter.setOnClickListener(new View.OnClickListener(this) {
            private final FeedsFooterViewHolderFeeds setMax;

            {
                this.setMax = r1;
            }

            public final void onClick(View view) {
                this.setMax.setMax.length();
            }
        });
    }
}
