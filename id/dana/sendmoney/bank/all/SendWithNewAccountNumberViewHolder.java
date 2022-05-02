package id.dana.sendmoney.bank.all;

import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import id.dana.R;
import id.dana.sendmoney.model.RecipientViewModel;
import o.Ignore;
import o.PhotoItem;
import o.setHttps;

public class SendWithNewAccountNumberViewHolder extends Ignore<RecipientViewModel> {
    private final PhotoItem getMax;
    @BindView(2131365079)
    TextView tvAccountNumber;

    public final /* synthetic */ void setMax(Object obj) {
        this.tvAccountNumber.setText(((RecipientViewModel) obj).isInside);
    }

    public SendWithNewAccountNumberViewHolder(ViewGroup viewGroup, PhotoItem photoItem) {
        super(viewGroup.getContext(), R.layout.item_send_new_account_number, viewGroup);
        this.getMax = photoItem;
    }

    public final void setMin(Ignore.setMin setmin) {
        this.itemView.setOnClickListener(new setHttps(this));
    }
}
