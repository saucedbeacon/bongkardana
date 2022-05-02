package o;

import id.dana.model.SendMoneyHomeMenuModel;
import id.dana.sendmoney.adapter.SendMoneyHomeMenuViewHolder;
import id.dana.sendmoney.view.RecipientHomeView;

public final class setInEdited implements SendMoneyHomeMenuViewHolder.setMin {
    private final RecipientHomeView getMin;

    public setInEdited(RecipientHomeView recipientHomeView) {
        this.getMin = recipientHomeView;
    }

    public final void length(SendMoneyHomeMenuModel sendMoneyHomeMenuModel) {
        this.getMin.getMin.setMax(sendMoneyHomeMenuModel);
    }
}
