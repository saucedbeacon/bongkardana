package id.dana.sendmoney.recipient.recent.viewholder;

import android.text.TextUtils;
import android.view.ViewGroup;
import butterknife.BindView;
import id.dana.R;
import id.dana.sendmoney.RecentDetailView;
import o.Ignore;
import o.increaseCount;

public class BankViewHolder extends Ignore<increaseCount> {
    @BindView(2131365936)
    RecentDetailView recentDetailView;

    public final /* synthetic */ void setMax(Object obj) {
        String str;
        increaseCount increasecount = (increaseCount) obj;
        if (increasecount != null) {
            RecentDetailView recentDetailView2 = this.recentDetailView;
            if (!TextUtils.isEmpty(increasecount.setMin)) {
                str = increasecount.setMin;
            } else {
                str = increasecount.setMax();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(increasecount.length);
            sb.append(" | ");
            String str2 = increasecount.isInside;
            if (!TextUtils.isEmpty(str2)) {
                str2 = str2.replace(" ", "");
            }
            sb.append(str2.substring(str2.length() > 4 ? str2.length() - 4 : str2.length()));
            recentDetailView2.setView(str, sb.toString(), increasecount.getMax(), "bank");
        }
    }

    public BankViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_recent_detail, viewGroup);
    }
}
