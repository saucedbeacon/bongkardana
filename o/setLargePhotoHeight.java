package o;

import id.dana.sendmoney.bank.AddReceiverDialogFragment;
import id.dana.sendmoney.model.RecipientModel;
import id.dana.sendmoney.view.RecipientHomeView;

public final class setLargePhotoHeight implements AddReceiverDialogFragment.setMax {
    private final RecipientHomeView setMax;

    public setLargePhotoHeight(RecipientHomeView recipientHomeView) {
        this.setMax = recipientHomeView;
    }

    public final void getMin(RecipientModel recipientModel) {
        this.setMax.getMin.setMin(recipientModel);
    }
}
