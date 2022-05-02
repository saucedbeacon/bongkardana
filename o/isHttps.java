package o;

import android.view.View;
import id.dana.sendmoney.bank.all.BankViewHolder;

public final class isHttps implements View.OnClickListener {
    private final BankViewHolder setMax;

    public isHttps(BankViewHolder bankViewHolder) {
        this.setMax = bankViewHolder;
    }

    public final void onClick(View view) {
        BankViewHolder.setMin(this.setMax);
    }
}
