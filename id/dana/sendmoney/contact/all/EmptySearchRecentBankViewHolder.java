package id.dana.sendmoney.contact.all;

import android.view.ViewGroup;
import butterknife.BindView;
import id.dana.R;
import id.dana.richview.EmptyState;
import id.dana.sendmoney.model.RecipientViewModel;
import o.Ignore;
import o.isLocalFile;

public class EmptySearchRecentBankViewHolder extends Ignore<RecipientViewModel> {
    @BindView(2131362805)
    EmptyState esContact;

    public final /* bridge */ /* synthetic */ void setMax(Object obj) {
    }

    public EmptySearchRecentBankViewHolder(ViewGroup viewGroup) {
        super(viewGroup.getContext(), R.layout.item_empty_search_recent_bank, viewGroup);
    }

    public final void setMin(Ignore.setMin setmin) {
        this.esContact.onActionClick(new isLocalFile(this, setmin));
    }
}
