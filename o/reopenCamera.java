package o;

import id.dana.richview.CircleImageSelectionView;
import id.dana.richview.splitbill.adapter.viewholder.SelectedContactPayerViewHolder;
import id.dana.sendmoney.model.RecipientModel;

public final class reopenCamera implements CircleImageSelectionView.length {
    private final SelectedContactPayerViewHolder length;
    private final RecipientModel setMax;

    public reopenCamera(SelectedContactPayerViewHolder selectedContactPayerViewHolder, RecipientModel recipientModel) {
        this.length = selectedContactPayerViewHolder;
        this.setMax = recipientModel;
    }

    public final void length() {
        SelectedContactPayerViewHolder.getMax(this.length, this.setMax);
    }
}
