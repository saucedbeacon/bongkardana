package id.dana.sendmoney.recipient.recent;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import id.dana.R;
import o.drawDividersHorizontal;

public class RecentRecipientView_ViewBinding implements Unbinder {
    private RecentRecipientView getMin;

    @UiThread
    public RecentRecipientView_ViewBinding(RecentRecipientView recentRecipientView, View view) {
        this.getMin = recentRecipientView;
        recentRecipientView.rvRecentRecipient = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59702131364555, "field 'rvRecentRecipient'", RecyclerView.class);
        recentRecipientView.tvRecentTransaction = (TextView) drawDividersHorizontal.setMin(view, R.id.f68662131365493, "field 'tvRecentTransaction'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        RecentRecipientView recentRecipientView = this.getMin;
        if (recentRecipientView != null) {
            this.getMin = null;
            recentRecipientView.rvRecentRecipient = null;
            recentRecipientView.tvRecentTransaction = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
