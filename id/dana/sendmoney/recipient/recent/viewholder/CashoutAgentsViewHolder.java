package id.dana.sendmoney.recipient.recent.viewholder;

import android.view.ViewGroup;
import butterknife.BindView;
import id.dana.R;
import id.dana.sendmoney.RecentDetailType;
import id.dana.sendmoney.RecentDetailView;
import o.Ignore;
import o.getRightText;
import o.increaseCount;

public class CashoutAgentsViewHolder extends Ignore<increaseCount> {
    @BindView(2131365936)
    RecentDetailView recentDetailView;

    public final /* synthetic */ void setMax(Object obj) {
        if (((increaseCount) obj) != null) {
            this.recentDetailView.setView(this.length.getString(R.string.send_via), this.length.getString(R.string.cashier), (String) null, RecentDetailType.CASHOUT_AGENTS);
        }
    }

    public CashoutAgentsViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_recent_detail, viewGroup);
    }

    public final void setMin(Ignore.setMin setmin) {
        this.recentDetailView.setOnClickListener(new getRightText(this, setmin));
    }
}
