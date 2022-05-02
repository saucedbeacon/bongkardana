package id.dana.sendmoney.contact.all;

import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import id.dana.R;
import id.dana.sendmoney.model.RecipientViewModel;
import o.Ignore;

public class SendWithPhoneNumberViewHolder extends Ignore<RecipientViewModel> {
    @BindView(2131364399)
    RelativeLayout rlAdd;
    @BindView(2131365086)
    TextView tvAddNew;

    public final /* bridge */ /* synthetic */ void setMax(Object obj) {
    }

    public SendWithPhoneNumberViewHolder(ViewGroup viewGroup, String str) {
        super(viewGroup.getContext(), R.layout.item_send_phone_to_number, viewGroup);
        if ("split_bill".equals(str)) {
            this.tvAddNew.setText(this.length.getString(R.string.split_bill_add_new_number));
            this.rlAdd.setContentDescription(this.length.getString(R.string.btnAddPhoneNumber));
        } else if ("send_money".equals(str)) {
            this.tvAddNew.setText(this.length.getString(R.string.send_to_phone_number));
        }
    }
}
