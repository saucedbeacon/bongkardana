package id.dana.richview.splitbill.adapter.viewholder;

import android.text.TextUtils;
import android.view.ViewGroup;
import butterknife.BindView;
import id.dana.R;
import id.dana.sendmoney.RecentDetailView;
import id.dana.sendmoney.model.RecipientModel;
import o.Ignore;
import o.isLive;
import o.switchCamera;

public class RecentContactPayerViewHolder extends Ignore<RecipientModel> {
    private switchCamera.getMax getMax;
    @BindView(2131365936)
    RecentDetailView recentDetailView;

    public final /* synthetic */ void setMax(Object obj) {
        RecipientModel recipientModel = (RecipientModel) obj;
        if (recipientModel != null) {
            RecentDetailView recentDetailView2 = this.recentDetailView;
            String length = recipientModel.length();
            if (TextUtils.isEmpty(length) || "splitBillPayer".equals(length) || "-".equals(length)) {
                length = this.length.getString(R.string.payer);
            }
            String str = recipientModel.isInside;
            if (str != null) {
                if (str.length() >= 4) {
                    str = str.substring(str.length() - 4);
                }
                str = "****".concat(String.valueOf(str));
            }
            recentDetailView2.setView(length, str, recipientModel.getMax(), "recentContacts", false, false);
            this.recentDetailView.setOnClickListener(new isLive(this, recipientModel));
        }
    }

    public RecentContactPayerViewHolder(ViewGroup viewGroup, switchCamera.getMax getmax) {
        super(viewGroup.getContext(), R.layout.item_recent_detail, viewGroup);
        this.getMax = getmax;
    }

    public static /* synthetic */ void length(RecentContactPayerViewHolder recentContactPayerViewHolder, RecipientModel recipientModel) {
        switchCamera.getMax getmax = recentContactPayerViewHolder.getMax;
        if (getmax != null) {
            getmax.setMin(recipientModel);
        }
    }
}
