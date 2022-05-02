package id.dana.sendmoney.bank.all;

import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import id.dana.R;
import id.dana.sendmoney.model.RecipientViewModel;
import o.Ignore;

public class CollapsibleSavedBankViewHolder extends Ignore<RecipientViewModel> {
    @BindView(2131365150)
    TextView tvCollapsibleBank;

    public final /* synthetic */ void setMax(Object obj) {
        RecipientViewModel recipientViewModel = (RecipientViewModel) obj;
        if (recipientViewModel != null) {
            this.tvCollapsibleBank.setText(13 == recipientViewModel.values ? R.string.saved_bank_see_more : R.string.saved_bank_see_less);
        }
    }

    public CollapsibleSavedBankViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_collpasible_bank, viewGroup);
    }
}
