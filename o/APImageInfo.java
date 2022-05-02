package o;

import android.view.View;
import id.dana.model.SendMoneyHomeMenuModel;
import id.dana.sendmoney.adapter.SendMoneyHomeMenuViewHolder;

public final class APImageInfo implements View.OnClickListener {
    private final SendMoneyHomeMenuViewHolder length;
    private final SendMoneyHomeMenuModel setMin;

    public APImageInfo(SendMoneyHomeMenuViewHolder sendMoneyHomeMenuViewHolder, SendMoneyHomeMenuModel sendMoneyHomeMenuModel) {
        this.length = sendMoneyHomeMenuViewHolder;
        this.setMin = sendMoneyHomeMenuModel;
    }

    public final void onClick(View view) {
        SendMoneyHomeMenuViewHolder.getMax(this.length, this.setMin);
    }
}
