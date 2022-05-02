package id.dana.sendmoney.view;

import android.view.View;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import id.dana.richview.BannerView;
import id.dana.sendmoney.recipient.recent.RecentRecipientView;
import o.drawDividersHorizontal;
import o.getDividerWidth;

public class RecipientHomeView_ViewBinding implements Unbinder {
    private RecipientHomeView length;
    private View setMin;

    @UiThread
    public RecipientHomeView_ViewBinding(final RecipientHomeView recipientHomeView, View view) {
        this.length = recipientHomeView;
        recipientHomeView.bannerView = (BannerView) drawDividersHorizontal.setMin(view, R.id.f37362131362188, "field 'bannerView'", BannerView.class);
        recipientHomeView.recentRecipientView = (RecentRecipientView) drawDividersHorizontal.setMin(view, R.id.f73022131365937, "field 'recentRecipientView'", RecentRecipientView.class);
        recipientHomeView.rvRecipientHomeMenu = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59722131364557, "field 'rvRecipientHomeMenu'", RecyclerView.class);
        View max = drawDividersHorizontal.getMax(view, R.id.f38132131362291, "method 'sendMoneyViaScanClick'");
        this.setMin = max;
        max.setOnClickListener(new getDividerWidth() {
            public final void setMax(View view) {
                recipientHomeView.sendMoneyViaScanClick();
            }
        });
    }

    @CallSuper
    public final void setMax() {
        RecipientHomeView recipientHomeView = this.length;
        if (recipientHomeView != null) {
            this.length = null;
            recipientHomeView.bannerView = null;
            recipientHomeView.recentRecipientView = null;
            recipientHomeView.rvRecipientHomeMenu = null;
            this.setMin.setOnClickListener((View.OnClickListener) null);
            this.setMin = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
