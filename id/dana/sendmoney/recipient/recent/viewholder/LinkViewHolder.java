package id.dana.sendmoney.recipient.recent.viewholder;

import android.view.ViewGroup;
import butterknife.BindView;
import id.dana.R;
import id.dana.sendmoney.RecentDetailView;
import o.Ignore;
import o.increaseCount;

public class LinkViewHolder extends Ignore<increaseCount> {
    @BindView(2131365936)
    RecentDetailView viewRecentDetail;

    public final /* synthetic */ void setMax(Object obj) {
        if (((increaseCount) obj) != null) {
            this.viewRecentDetail.setView(this.length.getString(R.string.send_money_to), this.length.getString(R.string.chat), (String) null, "link");
        }
    }

    public LinkViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_recent_detail, viewGroup);
    }
}
