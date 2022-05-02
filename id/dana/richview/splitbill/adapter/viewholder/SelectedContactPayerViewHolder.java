package id.dana.richview.splitbill.adapter.viewholder;

import android.text.TextUtils;
import android.view.ViewGroup;
import butterknife.BindView;
import id.dana.R;
import id.dana.sendmoney.RecentDetailType;
import id.dana.sendmoney.RecentDetailView;
import id.dana.sendmoney.model.RecipientModel;
import o.Ignore;
import o.dispatchOnCancelled;
import o.onCancelLoad;
import o.onCanceled;
import o.reopenCamera;
import o.switchCamera;

public class SelectedContactPayerViewHolder extends Ignore<RecipientModel> {
    @BindView(2131365936)
    RecentDetailView recentDetailView;
    private switchCamera.getMax setMin;

    public final /* synthetic */ void setMax(Object obj) {
        RecipientModel recipientModel = (RecipientModel) obj;
        if (recipientModel != null) {
            RecentDetailView recentDetailView2 = this.recentDetailView;
            String length = recipientModel.length();
            int length2 = length != null ? length.length() : 0;
            int max = dispatchOnCancelled.setMax(length2);
            if (length2 != max) {
                onCanceled oncanceled = new onCanceled(length2, max, 1);
                onCancelLoad.setMax(375477948, oncanceled);
                onCancelLoad.getMin(375477948, oncanceled);
            }
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
            recentDetailView2.setView(length, str, recipientModel.getMax(), RecentDetailType.CONTACTS, true, true);
            this.recentDetailView.setOnClickCrossIconListener(new reopenCamera(this, recipientModel));
        }
    }

    public SelectedContactPayerViewHolder(ViewGroup viewGroup, switchCamera.getMax getmax) {
        super(viewGroup.getContext(), R.layout.item_recent_detail, viewGroup);
        this.setMin = getmax;
    }

    public static /* synthetic */ void getMax(SelectedContactPayerViewHolder selectedContactPayerViewHolder, RecipientModel recipientModel) {
        switchCamera.getMax getmax = selectedContactPayerViewHolder.setMin;
        if (getmax != null) {
            getmax.getMax(recipientModel);
        }
    }
}
