package id.dana.sendmoney.recipient.recent.viewholder;

import android.view.ViewGroup;
import butterknife.BindView;
import id.dana.R;
import id.dana.sendmoney.RecentDetailType;
import id.dana.sendmoney.RecentDetailView;
import java.util.List;
import o.IComponent;
import o.Ignore;
import o.RedDotManager;
import o.getPhotoPath;
import o.increaseCount;

public class ContactViewHolder extends Ignore<increaseCount> {
    private List<String> getMax;
    private IComponent<List<String>> getMin;
    @BindView(2131365936)
    RecentDetailView recentDetailView;

    public final /* synthetic */ void setMax(Object obj) {
        String str;
        increaseCount increasecount = (increaseCount) obj;
        if (increasecount != null) {
            RecentDetailView recentDetailView2 = this.recentDetailView;
            if (getMax(increasecount)) {
                str = this.length.getString(R.string.payer);
            } else {
                str = increasecount.length();
            }
            String str2 = increasecount.isInside;
            if (str2 != null) {
                if (str2.length() >= 4) {
                    str2 = str2.substring(str2.length() - 4);
                }
                str2 = "****".concat(String.valueOf(str2));
            }
            recentDetailView2.setView(str, str2, increasecount.getMax(), RecentDetailType.CONTACTS);
            this.recentDetailView.setSelectedState(this.getMax, increasecount.isInside);
            IComponent<List<String>> iComponent = this.getMin;
            if (iComponent != null) {
                getMin(iComponent.subscribe((RedDotManager<? super List<String>>) new getPhotoPath(this, increasecount)));
            }
        }
    }

    public ContactViewHolder(ViewGroup viewGroup, IComponent<List<String>> iComponent, List<String> list) {
        super(viewGroup.getContext(), R.layout.item_recent_detail, viewGroup);
        this.getMin = iComponent;
        this.getMax = list;
    }

    private static boolean getMax(increaseCount increasecount) {
        return "splitBillPayer".equals(increasecount.length()) && increasecount.toString == 1;
    }

    public static /* synthetic */ void getMax(ContactViewHolder contactViewHolder, increaseCount increasecount, List list) {
        contactViewHolder.getMax = list;
        contactViewHolder.recentDetailView.setSelectedState(list, increasecount.isInside);
    }
}
