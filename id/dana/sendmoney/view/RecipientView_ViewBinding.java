package id.dana.sendmoney.view;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.Unbinder;
import com.google.android.material.appbar.AppBarLayout;
import id.dana.R;
import id.dana.richview.SearchView;
import id.dana.sendmoney.recipient.recent.RecentRecipientView;
import o.drawDividersHorizontal;

public class RecipientView_ViewBinding implements Unbinder {
    private RecipientView setMin;

    @UiThread
    public RecipientView_ViewBinding(RecipientView recipientView, View view) {
        this.setMin = recipientView;
        recipientView.appBarLayout = (AppBarLayout) drawDividersHorizontal.setMin(view, R.id.f34642131361903, "field 'appBarLayout'", AppBarLayout.class);
        recipientView.recentRecipientView = (RecentRecipientView) drawDividersHorizontal.setMin(view, R.id.f73022131365937, "field 'recentRecipientView'", RecentRecipientView.class);
        recipientView.rvRecipient = (RecyclerView) drawDividersHorizontal.setMin(view, R.id.f59712131364556, "field 'rvRecipient'", RecyclerView.class);
        recipientView.searchView = (SearchView) drawDividersHorizontal.setMin(view, R.id.f73072131365942, "field 'searchView'", SearchView.class);
        recipientView.tvSend = (TextView) drawDividersHorizontal.setMin(view, R.id.f69222131365549, "field 'tvSend'", TextView.class);
    }

    @CallSuper
    public final void setMax() {
        RecipientView recipientView = this.setMin;
        if (recipientView != null) {
            this.setMin = null;
            recipientView.appBarLayout = null;
            recipientView.recentRecipientView = null;
            recipientView.rvRecipient = null;
            recipientView.searchView = null;
            recipientView.tvSend = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
